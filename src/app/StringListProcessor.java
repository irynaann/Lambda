package app;

public class StringListProcessor {
    public static int countUppercase(String s) {
        int count = 0;
        char[] val = s.toCharArray();
        for (int i = 0; i < val.length; i++) {
            if (Character.isUpperCase(val[i])) {
                count++;
            }
        }
        return count;
    }
}