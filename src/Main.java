import java.util.Scanner;
import java.util.StringJoiner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ind=0;
        String stringFirstNumber;
        int sfn = 0;
        int sns = 0;
        String secondNumberString = "0";
        char action = '0';
        int result = 0;
        String res;
        while (true){
            System.out.println("Введите выражение с  двумя числами от 0 до 10, используя знаки выражения: +,-,*,/\n(символ 'q' служет оператором выхода, введите его и приложение закроется)\n *в режиме римских символов результат не должен превышать число 20, тк все значения я вводил в ручную*:");
            String line = scanner.nextLine();
            stringFirstNumber = String.valueOf(line.charAt(0));
            if(line.contains("q")){
                break;
            }
            if(line.contains("0") | line.contains("1") | line.contains("2")
            | line.contains("3") | line.contains("4") | line.contains("5")
            | line.contains("6") | line.contains("7") | line.contains("8")
            | line.contains("9") | line.contains("10")){
                if(line.contains("I")| line.contains("V") | line.contains("X")){
                    break;
                }
                if((line.charAt(0) == '0') | (line.charAt(0) == '1')
                        | (line.charAt(0) == '2')| (line.charAt(0) == '3')
                        | (line.charAt(0) == '4')| (line.charAt(0) == '5')
                        | (line.charAt(0) == '6')| (line.charAt(0) == '7')
                        | (line.charAt(0) == '8')| (line.charAt(0) == '9')){

                    stringFirstNumber = String.valueOf(line.charAt(0));
                    if ((line.charAt(1) == '0') | (line.charAt(1) == '1')
                            | (line.charAt(1) == '2')| (line.charAt(1) == '3')
                            | (line.charAt(1) == '4')| (line.charAt(1) == '5')
                            | (line.charAt(1) == '6')| (line.charAt(1) == '7')
                            | (line.charAt(1) == '8')| (line.charAt(1) == '9')){

                        stringFirstNumber += String.valueOf(line.charAt(1));
                        ind = 2;
                        action = line.charAt(ind);}
                    }else {
                        ind = 1;
                        action = line.charAt(ind);
                    }
                    secondNumberString = line.substring(ind+1,line.length());
                    switch (action){
                        case '+':
                            result = Integer.parseInt(stringFirstNumber) + Integer.parseInt(secondNumberString);
                            System.out.println(result);
                            break;

                        case '-':
                            result = Integer.parseInt(stringFirstNumber) - Integer.parseInt(secondNumberString);
                            System.out.println(result);
                            break;

                        case '/':
                            result = Integer.parseInt(stringFirstNumber) / Integer.parseInt(secondNumberString);
                            System.out.println(result);
                            break;

                        case '*':
                            result = Integer.parseInt(stringFirstNumber) * Integer.parseInt(secondNumberString);
                            System.out.println(result);
                            break;
                    }
                } else if (line.contains("I") | line.contains("V") | line.contains("X")) {

                    char[] str = line.toCharArray();
                    for (int i = 0; i<= line.length();i++){
                        action = str[i];

                        if (action == '+' | action == '-' | action == '*' | action == '/'){
                            secondNumberString = line.substring(i+1,line.length());
                            break;
                        }

                        if (i>0){
                            stringFirstNumber += action;
                        }
                    }
                    String[] list = new String[]{stringFirstNumber,secondNumberString};
                    for (int i = 0; i< list.length; i++) {
                        switch (list[i]) {
                            case "I":
                                if (i == 0) {
                                    sfn = 1;
                                    break;
                                } else {
                                    sns = 1;
                                    break;
                                }
                            case "II":
                                if (i == 0) {
                                    sfn = 2;
                                    break;
                                } else {
                                    sns = 2;
                                    break;
                                }
                            case "III":
                                if (i == 0) {
                                    sfn = 3;
                                    break;
                                } else {
                                    sns = 3;
                                    break;
                                }
                            case "IV":
                                if (i == 0) {
                                    sfn = 4;
                                    break;
                                } else {
                                    sns = 4;
                                    break;
                                }
                            case "V":
                                if (i == 0) {
                                    sfn = 5;
                                    break;
                                } else {
                                    sns = 5;
                                    break;
                                }
                            case "VI":
                                if (i == 0) {
                                    sfn = 6;
                                    break;
                                } else {
                                    sns = 6;
                                    break;
                                }
                            case "VII":
                                if (i == 0) {
                                    sfn = 7;
                                    break;
                                } else {
                                    sns = 7;
                                    break;
                                }
                            case "VIII":
                                if (i == 0) {
                                    sfn = 8;
                                    break;
                                } else {
                                    sns = 8;
                                    break;
                                }
                            case "IX":
                                if (i == 0) {
                                    sfn = 9;
                                    break;
                                } else {
                                    sns = 9;
                                    break;
                                }
                            case "X":
                                if (i == 0) {
                                    sfn = 10;
                                    break;
                                } else {
                                    sns = 10;
                                    break;
                                }
                        }
                    }
                switch (action){
                    case '+':
                        result = sfn + sns;
                        break;

                    case '-':
                        result = sfn - sns;
                        break;

                    case '/':
                        result = sfn / sns;
                        break;

                    case '*':
                        result = sfn * sns;
                        break;
                }
                switch (result) {
                    case 1:
                        res = "I";
                        System.out.println(res);
                        break;
                    case 2:
                        res = "II";
                        System.out.println(res);
                        break;
                    case 3:
                        res = "III";
                        System.out.println(res);
                        break;
                    case 4:
                        res = "IV";
                        System.out.println(res);
                        break;
                    case 5:
                        res = "V";
                        System.out.println(res);
                        break;
                    case 6:
                        res = "VI";
                        System.out.println(res);
                        break;
                    case 7:
                        res = "VII";
                        System.out.println(res);
                        break;
                    case 8:
                        res = "VIII";
                        System.out.println(res);
                        break;
                    case 9:
                        res = "IX";
                        System.out.println(res);
                        break;
                    case 10:
                        res = "X";
                        System.out.println(res);
                        break;
                    case 11:
                        res = "XI";
                        System.out.println(res);
                        break;
                    case 12:
                        res = "XII";
                        System.out.println(res);
                        break;
                    case 13:
                        res = "XIII";
                        System.out.println(res);
                        break;
                    case 14:
                        res = "XIV";
                        System.out.println(res);
                        break;
                    case 15:
                        res = "XV";
                        System.out.println(res);
                        break;
                    case 16:
                        res = "XVI";
                        System.out.println(res);
                        break;
                    case 17:
                        res = "XVII";
                        System.out.println(res);
                        break;
                    case 18:
                        res = "XVIII";
                        System.out.println(res);
                        break;
                    case 19:
                        res = "XIX";
                        System.out.println(res);
                        break;
                    case 20:
                        res = "XX";
                        System.out.println(res);
                        break;
                    }
            } else {
                System.out.println("Символ не найден в строке.");
                    }


        }
    }
}