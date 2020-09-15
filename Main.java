import java.util.Scanner;

/** 
 * a program to calculate the slope of a given line
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner used for input
    Scanner input = new Scanner(System.in); 

    // tell the user the coordinates of the points
    System.out.println("The co-ord of x1 is 3, The co-ord of y1 is 6, The co-ord of x2 is 8, The co-ord of y2 is 16.");

    //declare and initialize a variable to store the value of x1
    int x1 = 3;

    // declare and initialize a variable to store the value of y1 
    int y1 = 6;

    //declare and initialize a variable to store the value of x2
    int x2 = 8;

    // declare and initialize a variable to store the value of y2
    int y2 = 16;

    //declare and calculate the slope
    int slope = (y2 -y1)/(x2 - x1);

    // tell the user the slope
    System.out.println("The slope of this line is " + slope);
    
  }
}
