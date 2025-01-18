package others;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class TestClass {

    public static void main(String[] args) {
        RestAssured.baseURI= "https://gorest.co.in";

        Response rep=RestAssured.given().pathParams("users",6942462)
                .when().get("/public/v2/users/{users}")
                .then().statusCode(200).log().all().extract().response();

        System.out.println("git practice");


    }
}
