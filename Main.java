/*
 * TASK 3
 * archived at https://git.femboy.science/femsci/ppj/src/branch/task/3
 * by femsci
 */

public class Main {

    // printing logic decoupled to CrossPrinter.java

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("No argument provided...");
            System.exit(2);
        }

        int size = 0;

        try {
            size = Integer.parseInt(args[0]);

            if (size <= 0) {
                // short circuit
                throw new Exception();
            }
        } catch (Exception __) {
            System.err.println("Invalid argument provided...");
            System.exit(1);
        }

        var cross = new CrossPrinter(size);
        cross.printToStdout();
    }
}