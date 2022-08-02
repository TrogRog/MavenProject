package home;

/**
 * @author Gusarov Stanislav
 * @version 1
 */
public class Hello {
    /**
     * Program write "Hello" on display
     * @param args
     */
    public static void main(String[] args) {
        String x = "Hello";
        println(x);
    }

    /**
     *   @param str the string to display.
     */
    public static void println(String str){
        System.out.println(str);
    }
}
