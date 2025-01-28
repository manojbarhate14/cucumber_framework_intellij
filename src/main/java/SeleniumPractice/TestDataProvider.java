package SeleniumPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

    @Test(dataProvider = "testdata")
    public void testData(String username, String pass) {
        System.out.println(username + " : " + pass);
    }

    @DataProvider(name = "testdata")
    public Object[][] data() {
        String[][] name = new String[][]
                {
                        {"user1", "Pass"},
                        {"user2", "pass2"}
                };
        return name;
    }
}
