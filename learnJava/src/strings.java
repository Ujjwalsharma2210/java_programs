public class strings {
    public static void main(String[] args){

        String message = " Hello " + "How are you?";

        System.out.println(message);
        System.out.println(message.endsWith("?"));
        System.out.println(message.length());
        System.out.println(message.indexOf("a"));
        System.out.println(message.replace("?", "!!"));
        System.out.println(message.trim()); // removes unnecessary spaces from front and back
    }
}