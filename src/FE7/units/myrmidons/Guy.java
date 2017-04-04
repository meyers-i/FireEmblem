package FE7.units.myrmidons;


import FE7.units.AUnit;

/**
 * Represents Guy from FE7.
 */
public class Guy extends AUnit {

  /**
   * Constructor for Guy.
   */
  public Guy() {
    this.name = "Guy";
    this.type = "Myrmidon";
    this.lvl = 3;
    this.hp = 21;
    this.strMag = 6;
    this.skl = 11;
    this.spd = 11;
    this.def = 5;
    this.lck = 5;
    this.res = 0;
    this.con = 5;
    this.mov = 5;
    this.hpGrowth = 75;
    this.strMagGrowth = 30;
    this.sklGrowth = 50;
    this.spdGrowth = 70;
    this.defGrowth = 15;
    this.lckGrowth = 45;
    this.resGrowth = 25;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Swordmaster")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Swordmaster";
      this.lvl = 1;
      this.hp = hp + 5;
      this.strMag = strMag + 2;
      this.def = def + 2;
      this.res = res + 1;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
