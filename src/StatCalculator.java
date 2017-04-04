import java.util.Scanner;

/**
 * Main program for stat calculation.
 */
public class StatCalculator {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Readable game = null;
    String gameName;

    while(game == null) {
      System.out.println("Input a Fire Emblem game: ");
      gameName = input.next();
    }
  }
}
