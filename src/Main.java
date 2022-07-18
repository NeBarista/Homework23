public class Main {
    public static void main(String[] args) {
        System.out.println(checkString("", ""));
        System.out.println(checkString("", "1"));
        System.out.println(checkString("a", "a"));
        System.out.println(checkString("1", ""));
        System.out.println(checkString("b", "c"));
        System.out.println(checkString("c", "c"));
    }
    public static boolean checkString (String string1, String string2) {
        if(!string1.isEmpty() && !string2.isEmpty() && string1.equals(string2)) {
            return true;
        }
        else {
            return false;
        }
    }
}