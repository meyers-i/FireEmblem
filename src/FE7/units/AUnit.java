package FE7.units;

import java.util.Random;

/**
 * Created by Ian on 3/31/2017.
 */
public abstract class AUnit implements FE7Unit {

  public String name;
  public String type;
  public int lvl;
  public int hp;
  public int strMag;
  public int skl;
  public int spd;
  public int def;
  public int lck;
  public int res;
  public int con;
  public int mov;
  public int hpGrowth;
  public int strMagGrowth;
  public int sklGrowth;
  public int spdGrowth;
  public int defGrowth;
  public int lckGrowth;
  public int resGrowth;

  /**
   * Default AUnit constructor
   */
  public AUnit() {

  }

  /**
   * Constructor that allows input of stats.
   *
   * @param name Unit's name
   * @param type Unit's class
   * @param lvl Unit's level
   * @param hp Unit's HP
   * @param strMag Unit's Str/Mag
   * @param skl Unit's Skl
   * @param spd Unit's Spd
   * @param def Unit's Def
   * @param lck Unit's lck
   * @param res Unit's Res
   * @param con Unit's Con
   * @param mov Unit's Mov
   */
  public AUnit(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
               int lck, int res, int con, int mov) {
    this.name = name;
    this.type = type;
    this.lvl = lvl;
    this.hp = hp;
    this.strMag = strMag;
    this.skl = skl;
    this.spd = spd;
    this.def = def;
    this.lck = lck;
    this.res = res;
    this.con = con;
    this.mov = mov;
  }

  @Override
  public void levelUp() {
    //Random r = new Random();
    if (lvl < 20) {
      this.lvl++;
      this.hpUp();
      this.strMagUp();
      this.spdUp();
      this.sklUp();
      this.defUp();
      this.resUp();
      this.lckUp();
    }
    else {
      throw new IllegalStateException("Can't level up a max level unit.");
    }
  }

  @Override
  public void hpUp() {
    Random r = new Random();
    if (r.nextInt(100) < hpGrowth) {
      this.hp++;
    }
  }

  @Override
  public void strMagUp() {
    Random r = new Random();
    if (r.nextInt(100) < strMagGrowth) {
      this.strMag++;
    }
  }

  @Override
  public void sklUp() {
    Random r = new Random();
    if (r.nextInt(100) < sklGrowth) {
      this.skl++;
    }
  }

  @Override
  public void spdUp() {
    Random r = new Random();
    if (r.nextInt(100) < spdGrowth) {
      this.spd++;
    }
  }

  @Override
  public void defUp() {
    Random r = new Random();
    if (r.nextInt(100) < defGrowth) {
      this.def = def + 1;
    }
  }

  @Override
  public void lckUp() {
    Random r = new Random();
    if (r.nextInt(100) < lckGrowth) {
      this.lck++;
    }
  }

  @Override
  public void resUp() {
    Random r = new Random();
    if (r.nextInt(100) < resGrowth) {
      this.res++;
    }
  }

  @Override
  public abstract void promote();

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getLvl() {
    return this.lvl;
  }

  @Override
  public int getHp() {
    return this.hp;
  }

  @Override
  public int getStrMag() {
    return this.strMag;
  }

  @Override
  public int getSkl() {
    return this.skl;
  }

  @Override
  public int getSpd() {
    return this.spd;
  }

  @Override
  public int getDef() {
    return this.def;
  }

  @Override
  public int getLck() {
    return this.lck;
  }

  @Override
  public int getRes() {
    return this.res;
  }

  @Override
  public int getCon() {
    return this.con;
  }

  @Override
  public int getMov() {
    return this.mov;
  }

  @Override
  public String getType() {
    return this.type;
  }

  @Override
  public void display() {
    System.out.println(this.name);
    System.out.println(this.type);
    System.out.println("LVL: " + this.lvl);
    System.out.println("HP:  " + this.hp);
    System.out.println("STR: " + this.strMag);
    System.out.println("SKL: " + this.skl);
    System.out.println("SPD: " + this.spd);
    System.out.println("DEF: " + this.def);
    System.out.println("LCK: " + this.lck);
    System.out.println("RES: " + this.res);
    System.out.println("CON: " + this.con);
    System.out.println("MOV: " + this.mov);
  }

  @Override
  public void levelUpTo(int lvl) {
    if (lvl > 20) {
      throw new IllegalArgumentException("Given level exceeds the level cap.");
    }
    int x = lvl - this.lvl;
    while(x > 0) {
      this.levelUp();
      x--;
    }
  }

  @Override
  public void applyAngelicRobeUP() {
    if (hp == 40) {
      throw new IllegalStateException("Unit's HP is already maxed.");
    }
    else if (hp >= 33) {
      this.hp = 40;
    }
    else {
      this.hp = hp + 7;
    }
  }

  @Override
  public void applyEnergyRingUP() {
    if (strMag == 20) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    else if (strMag >= 18) {
      this.strMag = 20;
    }
    else {
      this.strMag = strMag + 2;
    }
  }

  @Override
  public void applySecretBookUP() {
    if (skl == 20) {
      throw new IllegalStateException("Unit's Skill is already maxed.");
    }
    else if (skl >= 18) {
      this.skl = 20;
    }
    else {
      this.skl = skl + 2;
    }
  }

  @Override
  public void applySpeedwingUP() {
    if (spd == 20) {
      throw new IllegalStateException("Unit's Speed is already maxed.");
    }
    else if (spd >= 18) {
      this.spd = 20;
    }
    else {
      this.spd = spd + 2;
    }
  }

  @Override
  public void applyDracoshieldUP() {
    if (def == 20) {
      throw new IllegalStateException("Unit's Defense is already maxed.");
    }
    else if (def >= 18) {
      this.def = 20;
    }
    else {
      this.def = def + 2;
    }
  }

  @Override
  public void applyGoddessIconUP() {
    if (lck == 30) {
      throw new IllegalStateException("Unit's Luck is already maxed.");
    }
    else if (lck >= 28) {
      this.lck = 30;
    }
    else {
      this.lck = lck + 2;
    }
  }

  @Override
  public void applyTalismanUP() {
    if (res == 20) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 18) {
      this.res = 20;
    }
    else {
      this.res = res + 2;
    }
  }

  @Override
  public void applyBoots() {
    this.mov = mov + 2;
  }

  @Override
  public void applyBodyRing() {
    this.con = con + 2;
  }

  @Override
  public void applyAngelicRobeP() {
    if (hp == 60) {
      throw new IllegalStateException("Unit's HP is already maxed.");
    }
    else if (hp >= 53) {
      this.hp = 60;
    }
    else {
      this.hp = hp + 7;
    }
  }

  @Override
  public abstract void applyEnergyRingP();

  @Override
  public abstract void applySecretBookP();

  @Override
  public abstract void applySpeedwingP();

  @Override
  public abstract void applyDracoshieldP();

  @Override
  public abstract void applyGoddessIconP();

  @Override
  public abstract void applyTalismanP();
}
