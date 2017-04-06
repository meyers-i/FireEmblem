package FE7.units.troubadors;

import FE7.units.AUnit;

/**
 * Represents Priscilla from FE7.
 */
public class Priscilla extends AUnit {

  /**
   * Constructor for Priscilla.
   */
  public Priscilla() {
    this.name = "Priscilla";
    this.type = "Troubador";
    this.lvl = 3;
    this.hp = 16;
    this.strMag = 6;
    this.skl = 6;
    this.spd = 8;
    this.def = 3;
    this.lck = 7;
    this.res = 6;
    this.con = 4;
    this.mov = 7;
    this.hpGrowth = 45;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 15;
    this.lckGrowth = 65;
    this.resGrowth = 50;
  }

  public Priscilla(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                  int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 45;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 15;
    this.lckGrowth = 65;
    this.resGrowth = 50;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Valkyrie")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Valkyrie";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 2;
      this.skl = skl + 1;
      this.def = def + 2;
      this.res = res + 3;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
