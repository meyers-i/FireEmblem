package FE7.units.transporters;

import FE7.units.AUnit;

/**
 * Represents Merlinus from FE7.
 */
public class Merlinus extends AUnit {

  /**
   * Constructor for Merlinus.
   */
  public Merlinus() {
    this.name = "Merlinus";
    this.type = "Transporter";
    this.lvl = 5;
    this.hp = 18;
    this.strMag = 0;
    this.skl = 4;
    this.spd = 5;
    this.def = 5;
    this.lck = 12;
    this.res = 0;
    this.con = 25;
    this.mov = 0;
    this.hpGrowth = 120;
    this.strMagGrowth = 0;
    this.sklGrowth = 90;
    this.spdGrowth = 90;
    this.defGrowth = 30;
    this.lckGrowth = 100;
    this.resGrowth = 15;
  }

  public Merlinus(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                 int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 120;
    this.strMagGrowth = 0;
    this.sklGrowth = 90;
    this.spdGrowth = 90;
    this.defGrowth = 30;
    this.lckGrowth = 100;
    this.resGrowth = 15;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Wagon")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Wagon";
      this.lvl = 1;
      this.mov = mov + 5;
    }
  }
}
