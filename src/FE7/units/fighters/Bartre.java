package FE7.units.fighters;

import FE7.units.AUnit;


public class Bartre extends AUnit {

  public Bartre() {
    this.name = "Bartre";
    this.type = "Fighter";
    this.lvl = 2;
    this.hp = 29;
    this.strMag = 9;
    this.skl = 5;
    this.spd = 3;
    this.def = 4;
    this.lck = 4;
    this.res = 0;
    this.con = 13;
    this.mov = 5;
    this.hpGrowth = 85;
    this.strMagGrowth = 50;
    this.sklGrowth = 35;
    this.spdGrowth = 40;
    this.defGrowth = 30;
    this.lckGrowth = 30;
    this.resGrowth = 25;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Warrior")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Warrior";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 1;
      this.skl = skl + 2;
      this.def = def + 3;
      this.res = res + 3;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
