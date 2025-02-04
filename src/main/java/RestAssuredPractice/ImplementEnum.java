package RestAssuredPractice;

public class ImplementEnum {

    public static void main(String[] args) {
        System.out.println(APIResources.AddPlaceAPI);

        for(APIResources e : APIResources.values())
        {
            System.out.println(e);
        }

    }
}
