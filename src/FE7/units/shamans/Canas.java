package FE7.units.shamans;

import FE7.units.AUnit;

/**
 * Represents Canas from FE7.
 */
public class Canas extends AUnit {

  /**
   * Constructor for Canas.
   */
  public Canas() {
    this.name = "Canas";
    this.type = "Shaman";
    this.lvl = 8;
    this.hp = 21;
    this.strMag = 10;
    this.skl = 9;
    this.spd = 8;
    this.def = 5;
    this.lck = 7;
    this.res = 8;
    this.con = 7;
    this.mov = 5;
    this.hpGrowth = 70;
    this.strMagGrowth = 45;
    this.sklGrowth = 40;
    this.spdGrowth = 35;
    this.defGrowth = 25;
    this.lckGrowth = 25;
    this.resGrowth = 45;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Druid")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Druid";
      this.lvl = 1;
      this.hp = hp + 4;
      this.spd = spd + 3;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
