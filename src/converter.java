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

        String result;
        char secondNumChar;
        int secondNum;
        String numberStr = String.format("%d",number);
        secondNumChar = numberStr.charAt(1);
        secondNum = Character.getNumericValue(secondNumChar);
        char firstNumChar = numberStr.charAt(0);
        int firstNum = Character.getNumericValue(firstNumChar);
        if (numberStr.length()>=2 && firstNum < 5) {
            secondNumChar = numberStr.charAt(1);
            secondNum = Character.getNumericValue(secondNumChar);
            result = "X".repeat(firstNum);

        }else if (numberStr.length()>=2 && firstNum >= 5) {

            result = "L"+"X".repeat(firstNum - 5);

        }else{
            result ="";
            }

        if (secondNum < 4){
            result +="I".repeat(secondNum);
        } else if (secondNum >= 5 && secondNum < 9) {
            result += "V"+"I".repeat(secondNum-5);
        } else if (secondNum == 9) {
            result += "IX";

        }

        return result;
    }


}
