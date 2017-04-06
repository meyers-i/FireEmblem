package FE7.units.lords;


import FE7.units.AUnit;

/**
 * Represents Hector from FE7.
 */
public class Hector extends AUnit {

  /**
   * Constructor for Hector.
   */
  public Hector() {
    this.name = "Hector";
    this.type = "Lord";
    this.lvl = 1;
    this.hp = 19;
    this.strMag = 7;
    this.skl = 4;
    this.spd = 5;
    this.def = 8;
    this.lck = 3;
    this.res = 0;
    this.con = 13;
    this.mov = 5;
    this.hpGrowth = 90;
    this.strMagGrowth = 60;
    this.sklGrowth = 45;
    this.spdGrowth = 35;
    this.defGrowth = 50;
    this.lckGrowth = 30;
    this.resGrowth = 25;
  }

  public Hector(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                 int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 90;
    this.strMagGrowth = 60;
    this.sklGrowth = 45;
    this.spdGrowth = 35;
    this.defGrowth = 50;
    this.lckGrowth = 30;
    this.resGrowth = 25;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Great Lord")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Great Lord";
      this.lvl = 1;
      this.hp = hp + 3;
      this.skl = skl + 2;
      this.spd = spd + 3;
      this.def = def + 1;
      this.res = res + 5;
      this.con = con + 2;
    }
  }
}
