public class Player extends Entity {
  private String myClass;
  private int Level;
  public int XP;
  private String Skill1;
  private String Skill2;
  private String Skill3;
  private String Skill4;
  private String Skill5;
  private String Skill6;
  private String Skill7;
  private String Skill8;

  public Player(String Class) {
    myClass = Class;
    Level = 1;
    XP = 0;
  }

  public void Initialize() {
    if (myClass.equals("Alchemist")) {
      HP = 900;
      MP = 120;
      ATK = 65;
      MYS = 135;
      DEF = 20;
      RES = 35;
      CRT = 0.5;
      Skill1 = "Basic";
      if (Level > 1) { Skill2 = "FireBomb"; }
      if (Level > 2) { Skill3 = "IceBomb";  }
      if (Level > 3) { Skill4 = "LightningBomb";} 
      if (Level > 4) { Skill5 = "FireEnchant"; }
      if (Level > 5) { Skill6 = "IceEnchant"; }
      if (Level > 6) { Skill7 = "LightningEnchant"; }
      if (Level > 7) { Skill8 = "Harvest"; }
    }
    if (myClass.equals("Knight")) {
      Skill1 = "Damn";
    }
  }

  public void LVLUP() {
    if (myClass.equals("Alchemist")) {
      HP += (int) (Math.random() * (70 - 30)) + 30;
      MP += (int) (Math.random() * (30 - 15)) + 15;
      ATK += (int) (Math.random() * (18 - 7)) + 7;
      MYS += (int) (Math.random() * (30 - 18)) + 18;
      DEF += (int) (Math.random() * (10 - 4)) + 4;
      RES += (int) (Math.random() * (15 - 7)) + 7;
      CRT += (double) (Math.random() * (0.8 - 0.5)) + 0.5;
    }
  }

}