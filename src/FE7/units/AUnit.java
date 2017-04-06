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
    if (r.nextInt(101) < hpGrowth) {
      this.hp++;
    }
  }

  @Override
  public void strMagUp() {
    Random r = new Random();
    if (r.nextInt(101) < strMagGrowth) {
      this.strMag++;
    }
  }

  @Override
  public void sklUp() {
    Random r = new Random();
    if (r.nextInt(101) < sklGrowth) {
      this.skl++;
    }
  }

  @Override
  public void spdUp() {
    Random r = new Random();
    if (r.nextInt(101) < spdGrowth) {
      this.spd++;
    }
  }

  @Override
  public void defUp() {
    Random r = new Random();
    if (r.nextInt(101) < defGrowth) {
      this.def = def + 1;
    }
  }

  @Override
  public void lckUp() {
    Random r = new Random();
    if (r.nextInt(101) < lckGrowth) {
      this.lck++;
    }
  }

  @Override
  public void resUp() {
    Random r = new Random();
    if (r.nextInt(101) < resGrowth) {
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
  public void applyAngelicRobe() {
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
}
