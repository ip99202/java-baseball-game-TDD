package baseball;

public class ValidateUtils {

    public static final int MAX_NUM = 9;
    public static final int MIN_NUM = 1;

    public static boolean validNum(int num) {
        return num <= MAX_NUM && num >= MIN_NUM;
    }
}
