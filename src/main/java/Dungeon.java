import java.util.Scanner;

public class Dungeon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int x = 0;
    System.out.println("Welcome to the land of the 'Mysticality Zone.' What used to be a vibrant land of magic is now a desolate wasteland where you will learn how to survive, aswell as finding great treasures. Now then, who were you? (Alchemist, Knight, Scholar, Hunter, Paladin, Seer)");
    String Role = "";
    String StrIn = input.nextLine();
    if (StrIn.equals("Alchemist")) { Role = "Alchemist"; }
    else if (StrIn.equals("Knight")) { Role = "Knight"; }
    else if (StrIn.equals("Scholar")) { Role = "Scholar"; }
    else if (StrIn.equals("Hunter")) { Role = "Hunter" ; }
    else if (StrIn.equals("Paladin")) { Role = "Paladin"; }
    else if (StrIn.equals("Seer")) { Role = "Seer"; }
    else { System.out.println("You did not enter your role, closing game."); System.exit(0); }
    Player Player = new Player(Role);
    System.out.println("Youre role is a " + Role + ".");


    
    int Close = input.nextInt();
    if (Close == 1) { System.exit(0); }
  }
}