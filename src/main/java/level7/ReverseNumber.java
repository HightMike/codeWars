package level7;

public class ReverseNumber {

    public static int reverse(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        int k = number < 0 ? -1 : 1;
        while (number != 0) {
            int i = (number % 10) * k;
            stringBuilder.append(i);
            number = number / 10;
        }
        return Integer.parseInt(stringBuilder.toString()) * k;
    }

    public static int getReverseGS(int number) {
        int result = 0;
        while(number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return result;
    }

}
