package FE7.units.cavaliers;

import java.util.Random;

import FE7.units.AUnit;
import FE7.units.FE7Unit;

/**
 * Represents Sain from FE7.
 */
public class Sain extends AUnit {

  /**
   * Constructs an instance of Sain.
   */
  public Sain() {
    this.name = "Sain";
    this.type = "Cavalier";
    this.lvl = 1;
    this.hp = 19;
    this.strMag = 8;
    this.skl = 4;
    this.spd = 6;
    this.def = 6;
    this.lck = 4;
    this.res = 0;
    this.con = 9;
    this.mov = 7;
    this.hpGrowth = 80;
    this.strMagGrowth = 60;
    this.sklGrowth = 35;
    this.spdGrowth = 40;
    this.defGrowth = 20;
    this.lckGrowth = 35;
    this.resGrowth = 20;
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
