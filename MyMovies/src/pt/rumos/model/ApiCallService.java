package pt.rumos.model;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.annotation.JsonInclude;

public class ApiCallService {

	public NewReleasesResponse ApiCall() throws IOException {

		CloseableHttpClient client = HttpClientBuilder.create().build();

		CloseableHttpResponse response = client.execute(new HttpGet(
				"http://api.themoviedb.org/3/discover/movie?primary_release_date.gte=2014-09-15&primary_release_date.lte=2017-05-12&api_key=e3e6d2f8ff9f741500e0352cf5da5c89"));
		String bodyAsString = EntityUtils.toString(response.getEntity());
		System.out.println("RESPONSE:" + bodyAsString);

		com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		NewReleasesResponse responseAsObj = objectMapper.readValue(bodyAsString, NewReleasesResponse.class);

		System.out.println(responseAsObj);
		
		return responseAsObj;
		
		

	}
}
