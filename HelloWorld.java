public class HelloWorld {

    public static void main(String[] args) {
        String who = "World";
        if (args.length > 0) {
            who = args[0];
        }
        System.out.printf("Hello, %s\n", who);
    }

}
