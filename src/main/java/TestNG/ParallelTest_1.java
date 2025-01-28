package TestNG;

import org.testng.annotations.Test;

public class ParallelTest_1 {
    @Test(groups = "sanity")
    void test1()
    {
        System.out.println("This is sanity Test one ParallelTest_1");
    }

    @Test(groups = {"sanity"})
    void test2()
    {
        System.out.println("This is sanity Test two ParallelTest_1");
    }

    @Test(groups = {"smoke","sanity"})
    void test3()
    {
        System.out.println("This is smoke sanity Test three ParallelTest_1");
    }

    @Test(groups = {"smoke"})
    void test4()
    {
        System.out.println("This is smoke Test four ParallelTest_1");
    }
}
