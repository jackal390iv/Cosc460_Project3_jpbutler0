package cosc460_project3_jpbutler0;

import java.util.Scanner;

/**
 *
 * @author Reaper
 */
public class Test {
    private Scanner scan = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      new Test();
    } 
    public Test(){
        do{
            System.out.println("Please enter an adress: ");
            new PageTable(scan.nextDouble());
        }while(true);
    }
}
