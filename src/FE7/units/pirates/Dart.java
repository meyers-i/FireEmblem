package FE7.units.pirates;

import FE7.units.AUnit;

/**
 * Represents Dart from FE7.
 */
public class Dart extends AUnit {

  /**
   * Constructor for Dart.
   */
  public Dart() {
    this.name = "Dart";
    this.type = "Pirate";
    this.lvl = 8;
    this.hp = 34;
    this.strMag = 12;
    this.skl = 8;
    this.spd = 8;
    this.def = 6;
    this.lck = 3;
    this.res = 1;
    this.con = 10;
    this.mov = 5;
    this.hpGrowth = 70;
    this.strMagGrowth = 65;
    this.sklGrowth = 20;
    this.spdGrowth = 60;
    this.defGrowth = 20;
    this.lckGrowth = 35;
    this.resGrowth = 15;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Berserker")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Berserker";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 1;
      this.skl = skl + 1;
      this.spd = spd + 1;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 3;
      this.mov = mov + 1;
    }
  }
}
