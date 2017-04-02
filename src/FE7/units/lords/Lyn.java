package FE7.units.lords;



import FE7.units.AUnit;


/**
 * Represents Lyn
 */
public class Lyn extends AUnit {

  /**
   * Constructs an instance of Lyn.
   */
  public Lyn() {
    this.name = "Lyn";
    this.type = "Lord";
    this.lvl = 1;
    this.hp = 16;
    this.strMag = 4;
    this.skl = 7;
    this.spd = 9;
    this.def = 2;
    this.lck = 5;
    this.res = 0;
    this.con = 5;
    this.mov = 5;
    this.hpGrowth = 70;
    this.strMagGrowth = 40;
    this.sklGrowth = 60;
    this.spdGrowth = 60;
    this.defGrowth = 20;
    this.lckGrowth = 55;
    this.resGrowth = 30;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Blade Lord")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Blade Lord";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 2;
      this.skl = skl + 2;
      this.def = def + 3;
      this.res = res + 5;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
