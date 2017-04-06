package FE7.units.monks;

import FE7.units.AUnit;

/**
 * Represents Lucious from FE7.
 */
public class Lucius extends AUnit {

  /**
   * Constructor for Lucius.
   */
  public Lucius() {
    this.name = "Lucius";
    this.type = "Monk";
    this.lvl = 3;
    this.hp = 18;
    this.strMag = 7;
    this.skl = 6;
    this.spd = 10;
    this.def = 1;
    this.lck = 2;
    this.res = 6;
    this.con = 6;
    this.mov = 5;
    this.hpGrowth = 55;
    this.strMagGrowth = 60;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 10;
    this.lckGrowth = 20;
    this.resGrowth = 60;
  }

  public Lucius(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
               int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 55;
    this.strMagGrowth = 60;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 10;
    this.lckGrowth = 20;
    this.resGrowth = 60;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Bishop")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Bishop";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 2;
      this.skl = skl + 1;
      this.def = def + 3;
      this.res = res + 3;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
