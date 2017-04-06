package FE7.units.mercenaries;

import FE7.units.AUnit;

/**
 * Represents Raven from FE7.
 */
public class Raven extends AUnit {

  /**
   * Constructor for Raven.
   */
  public Raven() {
    this.name = "Raven";
    this.type = "Mercenary";
    this.lvl = 5;
    this.hp = 25;
    this.strMag = 8;
    this.skl = 11;
    this.spd = 13;
    this.def = 5;
    this.lck = 2;
    this.res = 1;
    this.con = 8;
    this.mov = 5;
    this.hpGrowth = 85;
    this.strMagGrowth = 55;
    this.sklGrowth = 40;
    this.spdGrowth = 45;
    this.defGrowth = 25;
    this.lckGrowth = 35;
    this.resGrowth = 15;
  }

  public Raven(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
             int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 85;
    this.strMagGrowth = 55;
    this.sklGrowth = 40;
    this.spdGrowth = 45;
    this.defGrowth = 25;
    this.lckGrowth = 35;
    this.resGrowth = 15;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Hero")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Hero";
      this.lvl = 1;
      this.hp = hp + 4;
      this.skl = skl + 2;
      this.spd = spd + 2;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
