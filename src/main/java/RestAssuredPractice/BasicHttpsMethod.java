package RestAssuredPractice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class BasicHttpsMethod {
    public static void main(String[] args) throws IOException {
       // postRquest();
        getRequest();
    }

    public static void getRequest()
    {
        RestAssured.baseURI= "https://gorest.co.in";
        String resp = given().log().all().pathParams("id",188956)
                .when().get("/public/v2/posts/{id}")
                .then().log().all().statusCode(200).extract().response().asString();

        JsonPath json = new JsonPath(resp);
        String user_id = json.getString("user_id");
        System.out.println(user_id);
    }

    //@Test(enabled = true)
    public static void postRquest() throws IOException {
        String requestBody = "src/main/java/requestBody/PostBody.json";

        String payload = Files.readString(Paths.get(requestBody));
        given().log().all().baseUri("https://gorest.co.in/")
                .header("Content-Type","application/json")
                .body(payload)
                .when().post("/public/v2/users")
                .then().log().all().statusCode(200);
    }

}
