public class exceptions {
    public static void validateString(String inputString) throws NumberFormatException {
        if (inputString.matches(".*[0-9].*")) { // Проверяем, есть ли цифры в строке
            throw new NumberFormatException("Используются арабские и римские цифры одновременно!");
        }
    }
    public  static void belowZero(int number){
        if (number <= 0){
            throw new IllegalArgumentException("Римские числа не могут быть меньше нуля или равны ему!");
        }
    }
}