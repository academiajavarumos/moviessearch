package pt.rumos.presentation;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.annotation.JsonInclude;

import pt.rumos.model.NewReleases;

public class App {

	public static void main(String[] args) {

		CloseableHttpClient client = HttpClientBuilder.create().build();

		CloseableHttpResponse response;
		try {

			response = client.execute(new HttpGet(
					"http://api.themoviedb.org/3/discover/movie?primary_release_date.gte=2014-09-15&primary_release_date.lte=2017-05-12&api_key=e3e6d2f8ff9f741500e0352cf5da5c89"));
			String bodyAsString;

			bodyAsString = EntityUtils.toString(response.getEntity());

			System.out.println("RESPONSE:" + bodyAsString);
			
			com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
			objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			NewReleases responseAsObj = objectMapper.readValue(bodyAsString, NewReleases.class);
			System.out.println(responseAsObj);

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
