package FE7.units.nomads;

import FE7.units.AUnit;

/**
 * Represents Rath from FE7.
 */
public class Rath extends AUnit {

  /**
   * Constructor for Rath.
   */
  public Rath() {
    this.name = "Rath";
    this.type = "Nomad";
    this.lvl = 7;
    this.hp = 25;
    this.strMag = 8;
    this.skl = 9;
    this.spd = 10;
    this.def = 7;
    this.lck = 5;
    this.res = 2;
    this.con = 8;
    this.mov = 7;
    this.hpGrowth = 80;
    this.strMagGrowth = 50;
    this.sklGrowth = 40;
    this.spdGrowth = 50;
    this.defGrowth = 10;
    this.lckGrowth = 30;
    this.resGrowth = 25;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Nomadic Trooper")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Nomadic Trooper";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 2;
      this.skl = skl + 1;
      this.spd = spd + 1;
      this.def = def + 3;
      this.res = res + 3;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
