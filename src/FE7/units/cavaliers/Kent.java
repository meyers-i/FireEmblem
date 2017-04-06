package FE7.units.cavaliers;

import FE7.units.AUnit;

/**
 * Represents Kent from FE7.
 */
public class Kent extends AUnit {

  /**
   * Constructs an instance of Kent.
   */
  public Kent() {
    this.name = "Kent";
    this.type = "Cavalier";
    this.lvl = 1;
    this.hp = 20;
    this.strMag = 6;
    this.skl = 6;
    this.spd = 7;
    this.def = 5;
    this.lck = 2;
    this.res = 1;
    this.con = 9;
    this.mov = 7;
    this.hpGrowth = 85;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 45;
    this.defGrowth = 25;
    this.lckGrowth = 20;
    this.resGrowth = 25;
  }

  public Kent(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
               int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 85;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 45;
    this.defGrowth = 25;
    this.lckGrowth = 20;
    this.resGrowth = 25;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Paladin")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Paladin";
      this.lvl = 1;
      this.hp = hp + 2;
      this.strMag = strMag + 1;
      this.skl = skl + 1;
      this.spd = spd + 1;
      this.def = def + 2;
      this.res = res + 1;
      this.con = con + 2;
      this.mov = mov + 1;
    }
  }
}
