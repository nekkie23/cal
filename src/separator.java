import java.util.Map;

public class separator {
    private static String num1,num2;
    private static char operation;
    static void separate(String inputString) {
        String[] parts = inputString.split("(?<=[-+*/])|(?=[-+*/])");
        num1 = parts[0];
         num2 = parts[2];
        operation = parts[1].charAt(0);


    }
    static String firstNum(String inputString){

       separate(inputString);
       return num1;

    }
    public static String secondNum(String inputString){
        separate(inputString);
        return num2;
    }

    public static char operationChar(String inputString){

        separate(inputString);
        return operation;

    }
}
