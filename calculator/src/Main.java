import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        int firstNumInt;
        int secondNumInt;
        String resultStr;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            try {
                exceptions.countOfNumbers(line);
            }catch (IndexOutOfBoundsException e){
                System.out.println("Ошибка:"+ e.getMessage());
                continue;
            }
            String firstNum = separator.firstNum(line);
            String secondNum = separator.secondNum(line);
            char operation = separator.operationChar(line);

            if(line.contains("I") | line.contains("V") | line.contains("X")){
                try {
                    exceptions.validateString(line);
                }catch (NumberFormatException e){
                    System.out.println("Ошибка:" + e.getMessage());
                    continue;
                }

                firstNumInt = converter.fromStringToInt(firstNum);
                try {
                    exceptions.gate(firstNumInt);
                }catch(IllegalArgumentException e){
                    System.out.println("Ошибка:" + e.getMessage());
                    continue;
                }
                secondNumInt = converter.fromStringToInt(secondNum);
                try {
                    exceptions.gate(secondNumInt);
                }catch(IllegalArgumentException e){
                    System.out.println("Ошибка:" + e.getMessage());
                    continue;
                }

                result = calculator.calculate(firstNumInt,secondNumInt,operation);
                try {
                    exceptions.belowZero(result);
                }catch(IllegalArgumentException e){
                    System.out.println("Ошибка:" + e.getMessage());
                    continue;
                }
                resultStr = converter.fromIntToString(result);
                System.out.println(resultStr);
            }else{
                firstNumInt = Integer.parseInt(firstNum);
                try {
                    exceptions.gate(firstNumInt);
                }catch(IllegalArgumentException e){
                    System.out.println("Ошибка:" + e.getMessage());
                    continue;
                }
                secondNumInt = Integer.parseInt(secondNum);
                try {
                    exceptions.gate(secondNumInt);
                }catch(IllegalArgumentException e){
                    System.out.println("Ошибка:" + e.getMessage());
                    continue;
                }
                result = calculator.calculate(firstNumInt,secondNumInt,operation);
                System.out.println(result);
            }

        }
    }
}