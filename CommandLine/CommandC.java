package CommandLine;

public class CommandC {

    public static void main(String[] args) {
        System.out.println("Command line arguments: ");
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command line passed !!");
        }

    }
}
