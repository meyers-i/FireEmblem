package FE7.units.pegasus_knights;


import FE7.units.AUnit;

public class Florina extends AUnit {

  public Florina() {
    this.name = "Florina";
    this.type = "Pegasus Knight";
    this.lvl = 1;
    this.hp = 17;
    this.strMag = 5;
    this.skl = 7;
    this.spd = 9;
    this.def = 4;
    this.lck = 7;
    this.res = 4;
    this.con = 4;
    this.mov = 7;
    this.hpGrowth = 60;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 55;
    this.defGrowth = 15;
    this.lckGrowth = 50;
    this.resGrowth = 35;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Falcoknight")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Falcoknight";
      this.lvl = 1;
      this.hp = hp + 5;
      this.strMag = strMag + 2;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
