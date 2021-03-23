public class strings {
    public static void main(String[] args){

        String message = " Hello " + "How are you?";
        String quotes = "Hello \"Ujjwal\""; // To use double quotes in a string.
        String backSlash = "c:\\hello"; // use trailing backslash to add a backslash.

        System.out.println(message);
        System.out.println(message.endsWith("?"));
        System.out.println(message.length());
        System.out.println(message.indexOf("a"));
        System.out.println(message.replace("?", "!!"));
        System.out.println(message.trim()); // removes unnecessary spaces from front and back

        System.out.println(quotes);
        System.out.println(backSlash);
        System.out.println(message.toUpperCase());
    }
}