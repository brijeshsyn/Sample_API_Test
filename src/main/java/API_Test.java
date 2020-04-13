import com.wma.framework.api.RESTOperations;

public class API_Test {

	public static void main(String[] args) {
		String endpointURL = "https://reqres.in/";
		System.out.println("Started...");
		RESTOperations rest = new RESTOperations(endpointURL);
		System.out.println(rest.get("/api/users?page=2").getBody().asString());
		System.out.println(rest.get("/api/users/796").getBody().asString());
		String postURI = "api/users";
		String jsonPayload = "{\r\n" + 
				"    \"name\": \"Brijesh\",\r\n" + 
				"    \"job\": \"XXXX\"\r\n" + 
				"}";
		
		System.out.println(rest.post(postURI, jsonPayload).getBody().asString());
	}

}
