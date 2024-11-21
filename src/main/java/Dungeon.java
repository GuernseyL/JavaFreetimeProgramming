import java.util.Scanner;

public class Dungeon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double tester = (Math.random() * (0.8 - 0.5)) + 0.5;

    int x = 0;
    System.out.println(
        "Welcome to the land of the 'Mysticality Zone.' What used to be a vibrant land of magic is now a desolate wasteland where you will learn how to survive, aswell as finding great treasures. Now then, who were you? (Alchemist, Knight, Scholar, Hunter, Paladin, Seer)");
    String Role = "";
    String StrIn = input.nextLine();
    if (StrIn.equals("Alchemist")) {
      Role = "Alchemist";
    } else if (StrIn.equals("Knight")) {
      Role = "Knight";
    } else if (StrIn.equals("Scholar")) {
      Role = "Scholar";
    } else if (StrIn.equals("Hunter")) {
      Role = "Hunter";
    } else if (StrIn.equals("Paladin")) {
      Role = "Paladin";
    } else if (StrIn.equals("Seer")) {
      Role = "Seer";
    } else if (StrIn.equals("Ichvesi")) {
      Role = "Ichvesi";
    } else if (StrIn.equals("Pandora")) {
      Role = "Pandora";
    } else if (StrIn.equals("Pandemonium")) {
      Role = "Pandemonium";
    } else {
      System.out.println("You did not enter your role, closing game.");
      System.exit(0);
    }
    Player Player = new Player(Role);
    if (!StrIn.equals("Ichvesi") && !StrIn.equals("Pandora") && !StrIn.equals("Pandemonium")) {
      System.out.println("Your role is a " + Role + ".");
    } else if (StrIn.equals("Ichvesi")) {
      System.out.println(
          "You are Ichvesi the blood fiend. The journey has been long and gruelling, but you've made it to paradise. Paradise will be in the palm of your hand");
    } else if (StrIn.equals("Pandora")) {
      System.out.println(
          "You are Pandora, the apathetic. You've been away for far too long, and its time to clean up the place. Welcome home Pandora.");
    } else if (StrIn.equals("Pandemonium")) {
      System.out.println(
          "You are Pandemonium, the destroyer. Something has escaped your wrath and fled to paradise. It is time to fix your mistakes");
    }
    System.out.println(tester);

    int Close = input.nextInt();
    if (Close == 1) {
      System.exit(0);
    }
  }
}