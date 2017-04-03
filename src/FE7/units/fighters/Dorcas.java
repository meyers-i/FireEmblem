package FE7.units.fighters;


import FE7.units.AUnit;

public class Dorcas extends AUnit {

  public Dorcas() {
    this.name = "Dorcas";
    this.type = "Fighter";
    this.lvl = 3;
    this.hp = 30;
    this.strMag = 7;
    this.skl = 7;
    this.spd = 6;
    this.def = 3;
    this.lck = 3;
    this.res = 0;
    this.con = 14;
    this.mov = 5;
    this.hpGrowth = 80;
    this.strMagGrowth = 60;
    this.sklGrowth = 40;
    this.spdGrowth = 20;
    this.defGrowth = 25;
    this.lckGrowth = 45;
    this.resGrowth = 15;
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
