package pt.rumos.servlet;

import java.io.IOException;

import pt.rumos.model.ApiCallService;

public class App {

	public static void main(String[] args) throws IOException {
		
		ApiCallService newApi = new ApiCallService();
		
		newApi.ApiCall();

	}

}
