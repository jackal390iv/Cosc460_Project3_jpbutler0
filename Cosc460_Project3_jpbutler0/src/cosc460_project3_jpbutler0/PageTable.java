package cosc460_project3_jpbutler0;

/**
 *
 * @author Jonathan Butler
 */
public class PageTable {

    public PageTable(double val) {
        System.out.println("The address " + val + " contains: ");
        try {
            
            
            System.out.println("page number = " + " and offset = " + "\n");
        } catch (Exception ex) {
            System.out.println("Type: " + ex.getClass().getName());
            System.out.println("Cause: " + ex.getCause());
            System.out.println("Message: " + ex.getMessage());
            System.out.println("Local Message: " + ex.getLocalizedMessage());
            //ex.printStackTrace();*/
        }
    }
}
