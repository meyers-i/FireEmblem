package FE7.units.knights;

import FE7.units.AUnit;

/**
 * Created by Ian on 4/3/2017.
 */
public class Wallace extends AUnit {

  public Wallace() {
    this.name = "Wallace";
    this.type = "Knight";
    this.lvl = 12;
    this.hp = 30;
    this.strMag = 13;
    this.skl = 7;
    this.spd = 5;
    this.def = 15;
    this.lck = 10;
    this.res = 2;
    this.con = 13;
    this.mov = 4;
    this.hpGrowth = 75;
    this.strMagGrowth = 45;
    this.sklGrowth = 40;
    this.spdGrowth = 20;
    this.defGrowth = 55;
    this.lckGrowth = 35;
    this.resGrowth = 35;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("General")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "General";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 2;
      this.skl = skl + 2;
      this.spd = spd + 3;
      this.def = def + 2;
      this.res = res + 3;
      this.con = con + 2;
      this.mov = mov + 1;
    }
  }
}
