package FE7.units.archers;

import FE7.units.AUnit;

public class Wil extends AUnit{

  public Wil() {
    this.name = "Wil";
    this.type = "Archer";
    this.lvl = 2;
    this.hp = 20;
    this.strMag = 6;
    this.skl = 5;
    this.spd = 5;
    this.def = 5;
    this.lck = 6;
    this.res = 0;
    this.con = 6;
    this.mov = 5;
    this.hpGrowth = 75;
    this.strMagGrowth = 50;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 20;
    this.lckGrowth = 40;
    this.resGrowth = 25;
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
      this.hp = hp + 3;
      this.strMag = strMag + 1;
      this.skl = skl + 2;
      this.spd = spd + 2;
      this.def = def + 2;
      this.res = res + 3;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
