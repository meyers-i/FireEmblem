package FE7.units.knights;

import FE7.units.AUnit;

/**
 * Represents Oswin from FE7.
 */
public class Oswin extends AUnit {

  /**
   * Constructor for Oswin.
   */
  public Oswin() {
    this.name = "Oswin";
    this.type = "Knight";
    this.lvl = 9;
    this.hp = 29;
    this.strMag = 13;
    this.skl = 9;
    this.spd = 5;
    this.def = 13;
    this.lck = 3;
    this.res = 3;
    this.con = 14;
    this.mov = 4;
    this.hpGrowth = 90;
    this.strMagGrowth = 40;
    this.sklGrowth = 30;
    this.spdGrowth = 30;
    this.defGrowth = 55;
    this.lckGrowth = 35;
    this.resGrowth = 30;
  }

  public Oswin(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 90;
    this.strMagGrowth = 40;
    this.sklGrowth = 30;
    this.spdGrowth = 30;
    this.defGrowth = 55;
    this.lckGrowth = 35;
    this.resGrowth = 30;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("General")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "General";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 2;
      this.skl = skl + 2;
      this.spd = spd + 3;
      this.def = def + 2;
      this.res = res + 3;
      this.con = con + 2;
      this.mov = mov + 1;
    }
  }
}
