package CommandLine;

public class AddNumbers {
    public static void main(String[] args) {
        if (args.length > 0) {
            int a = 0;
            int b = 0;
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            int result = a + b;
            System.out.println("Command Lines : " + a + " " + b);
            System.out.println("addition of numbers received from command line: " + result);
        }
    }
}
