package FE7.units.cavaliers;

import FE7.units.AUnit;

/**
 * Created by Ian on 4/3/2017.
 */
public class Lowen extends AUnit {

  public Lowen() {
    this.name = "Lowen";
    this.type = "Cavalier";
    this.lvl = 2;
    this.hp = 23;
    this.strMag = 7;
    this.skl = 5;
    this.spd = 7;
    this.def = 7;
    this.lck = 3;
    this.res = 0;
    this.con = 10;
    this.mov = 7;
    this.hpGrowth = 90;
    this.strMagGrowth = 30;
    this.sklGrowth = 30;
    this.spdGrowth = 30;
    this.defGrowth = 50;
    this.lckGrowth = 40;
    this.resGrowth = 30;
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
