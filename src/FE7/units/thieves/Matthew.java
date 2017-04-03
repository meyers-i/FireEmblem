package FE7.units.thieves;

import FE7.units.AUnit;

/**
 * Represents Matthew from FE7.
 */
public class Matthew extends AUnit {

  /**
   * Constructor for Matthew.
   */
  public Matthew() {
    this.name = "Matthew";
    this.type = "Thief";
    this.lvl = 2;
    this.hp = 18;
    this.strMag = 4;
    this.skl = 4;
    this.spd = 11;
    this.def = 3;
    this.lck = 2;
    this.res = 0;
    this.con = 7;
    this.mov = 6;
    this.hpGrowth = 75;
    this.strMagGrowth = 30;
    this.sklGrowth = 40;
    this.spdGrowth = 70;
    this.defGrowth = 25;
    this.lckGrowth = 50;
    this.resGrowth = 20;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Assassin")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Assassin";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 1;
      this.def = def + 2;
      this.res = res + 2;
    }
  }
}
