public class calculator {

    static int calculate(int firstNum, int secondNum, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;

        }
        return result;
    }
}
