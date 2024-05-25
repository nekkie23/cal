import java.util.Scanner;

public class converter {


    static int fromStringToInt(String number){
        int result = 0;
        char symbol;
        for(int i = 0; i<number.length();i++){
           symbol = number.charAt(i);
           switch (symbol){
               case 'I':
                   if (i+1 != number.length()){
                   switch (number.charAt(i+1)){
                       case 'X':
                           result -= 1;
                           break;
                       case 'V':
                           result -= 1;
                           break;
                       default:
                           result++;
                   }
                   }else{result++;}
                   break;
               case 'V':
                   result += 5;
                   break;
               case 'X':
                   result += 10;
                   break;
               case 'C':
                   result += 100;
                   break;
           }
        }
        return result;
    }

    static String fromIntToString(int number){

        String result ="";
        if (number <100) {
            if (number / 10 >= 1) {
                result += "X".repeat(number / 10);
            }
            if (number % 10 < 4) {
                result += "I".repeat(number % 10);
            } else if (number % 10 == 4) {
                result += "IV";
            } else if (number % 10 > 4 && number % 10 < 9) {
                result += "V" + "I".repeat((number % 10) - 5);
            } else if (number % 10 == 9) {
                result += "IX";
            }
        }else{
            result = "C";
        }
        return result;
    }

}
