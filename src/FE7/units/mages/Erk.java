package FE7.units.mages;

import FE7.units.AUnit;

/**
 * Represents Erk from FE7.
 */
public class Erk extends AUnit {

  /**
   * Constructor for Erk.
   */
  public Erk() {
    this.name = "Erk";
    this.type = "Mage";
    this.lvl = 1;
    this.hp = 17;
    this.strMag = 5;
    this.skl = 6;
    this.spd = 7;
    this.def = 2;
    this.lck = 3;
    this.res = 4;
    this.con = 5;
    this.mov = 5;
    this.hpGrowth = 65;
    this.strMagGrowth = 40;
    this.sklGrowth = 40;
    this.spdGrowth = 50;
    this.defGrowth = 20;
    this.lckGrowth = 30;
    this.resGrowth = 40;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Sage")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Sage";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 1;
      this.def = def + 3;
      this.res = res + 3;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
