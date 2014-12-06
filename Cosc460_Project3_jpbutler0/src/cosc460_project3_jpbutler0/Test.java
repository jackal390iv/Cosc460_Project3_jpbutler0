package cosc460_project3_jpbutler0;

import java.util.Scanner;

/**
 *
 * @author Jonathan Butler
 */
public class Test {

    private Scanner scan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        do {
            try {
                scan = new Scanner(System.in);
                double val;
                System.out.println("Please enter an adress: ");
                String tmp = scan.nextLine();
                if (tmp.contains("^")) {
                    val = Math.pow(Double.parseDouble(tmp.substring(0, tmp.indexOf("^"))), Double.parseDouble(tmp.substring(tmp.indexOf("^") + 1)));
                } else {
                    val = Double.parseDouble(tmp);
                }
                new PageTable(val);
            } catch (Exception ex) {
                System.out.println("\n" + "ERROR");
                System.out.println("Type: " + ex.getClass().getName());
                System.out.println("Location: " + this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
                System.out.println("Cause: " + ex.getCause());
                System.out.println("Message: " + ex.getMessage());
                System.out.println("Local Message: " + ex.getLocalizedMessage() + "\n");
                //ex.printStackTrace();*/
            }
        } while (true);
    }
}
