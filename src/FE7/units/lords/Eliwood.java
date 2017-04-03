package FE7.units.lords;

import FE7.units.AUnit;


public class Eliwood extends AUnit {

  public Eliwood() {
    this.name = "Eliwood";
    this.type = "Lord";
    this.lvl = 1;
    this.hp = 18;
    this.strMag = 5;
    this.skl = 5;
    this.spd = 7;
    this.def = 5;
    this.lck = 7;
    this.res = 0;
    this.con = 7;
    this.mov = 5;
    this.hpGrowth = 80;
    this.strMagGrowth = 45;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 30;
    this.lckGrowth = 45;
    this.resGrowth = 35;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Knight Lord")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Knight Lord";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 2;
      this.spd = spd + 1;
      this.def = def + 1;
      this.res = res + 3;
      this.con = con + 2;
      this.mov = mov + 2;
    }
  }
}
