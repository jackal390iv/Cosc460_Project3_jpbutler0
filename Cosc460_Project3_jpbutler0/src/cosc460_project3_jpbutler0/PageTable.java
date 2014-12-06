package cosc460_project3_jpbutler0;

/**
 *
 * @author Jonathan Butler
 */
public class PageTable {

    public PageTable(double val) {
        System.out.println("The address " + (int) val + " contains: ");
        try {
            double num = val / 4096;
            double off = val % 4096;
            System.out.println("page number = " + (int) num + " and offset = " + (int) off + "\n");
        } catch (Exception ex) {
            System.out.println("\n" + "ERROR");
            System.out.println("Type: " + ex.getClass().getName());
            System.out.println("Location: " + this.getClass().getName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
            System.out.println("Cause: " + ex.getCause());
            System.out.println("Message: " + ex.getMessage());
            System.out.println("Local Message: " + ex.getLocalizedMessage() + "\n");
            //ex.printStackTrace();*/
        }
    }
}
