package FE7.units.lords;

import java.util.Random;

import FE7.units.FE7Unit;

/**
 * Represents Lyn
 */
public class Lyn implements FE7Unit {

  private String name;
  private int lvl;
  private int hp;
  private int strMag;
  private int skl;
  private int spd;
  private int def;
  private int lck;
  private int res;
  private int con;
  private int mov;
  private int hpGrowth;
  private int strMagGrowth;
  private int sklGrowth;
  private int spdGrowth;
  private int defGrowth;
  private int lckGrowth;
  private int resGrowth;

  /**
   * Constructs an instance of Lyn.
   */
  public Lyn() {
    this.name = "Lyn";
    this.lvl = 1;
    this.hp = 16;
    this.strMag = 4;
    this.skl = 7;
    this.spd = 9;
    this.def = 2;
    this.lck = 5;
    this.res = 0;
    this.con = 5;
    this.mov = 5;
    this.hpGrowth = 70;
    this.strMagGrowth = 40;
    this.sklGrowth = 60;
    this.spdGrowth = 60;
    this.defGrowth = 20;
    this.lckGrowth = 55;
    this.resGrowth = 30;
  }

  @Override
  public void levelUp() {
    Random r = new Random();
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
      this.def++;
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
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    else {
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 2;
      this.skl = skl + 2;
      this.def = def + 3;
      this.res = res + 5;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }

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
  public void display() {
    System.out.println(this.name + ": ");
    System.out.println("LVL: " + this.lvl);
    System.out.println("HP: " + this.hp);
    System.out.println("STR: " + this.strMag);
    System.out.println("SKL: " + this.skl);
    System.out.println("SPD: " + this.spd);
    System.out.println("DEF: " + this.spd);
    System.out.println("LCK: " + this.lck);
    System.out.println("RES: " + this.res);
    System.out.println("CON: " + this.con);
    System.out.println("MOV: " + this.mov);
  }
}
