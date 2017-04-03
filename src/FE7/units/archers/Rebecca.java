package FE7.units.archers;

import FE7.units.AUnit;

/**
 * Represents Rebecca from FE7.
 */
public class Rebecca extends AUnit {

  /**
   * Constructor for Rebecca.
   */
  public Rebecca() {
    this.name = "Rebecca";
    this.type = "Archer";
    this.lvl = 1;
    this.hp = 17;
    this.strMag = 4;
    this.skl = 5;
    this.spd = 6;
    this.def = 3;
    this.lck = 4;
    this.res = 1;
    this.con = 5;
    this.mov = 5;
    this.hpGrowth = 60;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 60;
    this.defGrowth = 15;
    this.lckGrowth = 50;
    this.resGrowth = 30;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Sniper")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Sniper";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 3;
      this.skl = skl + 1;
      this.spd = spd + 1;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
