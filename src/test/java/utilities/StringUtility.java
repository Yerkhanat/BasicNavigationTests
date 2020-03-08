package utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual){

        if(expected.equals(actual)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }

    }
}
