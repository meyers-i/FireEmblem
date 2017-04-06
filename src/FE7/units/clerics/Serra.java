package FE7.units.clerics;


import FE7.units.AUnit;

/**
 * Represents Serra from FE7.
 */
public class Serra extends AUnit {

  /**
   * Constructor for Serra.
   */
  public Serra() {
    this.name = "Serra";
    this.type = "Cleric";
    this.lvl = 1;
    this.hp = 17;
    this.strMag = 2;
    this.skl = 5;
    this.spd = 8;
    this.def = 2;
    this.lck = 6;
    this.res = 5;
    this.con = 4;
    this.mov = 5;
    this.hpGrowth = 50;
    this.strMagGrowth = 50;
    this.sklGrowth = 30;
    this.spdGrowth = 40;
    this.defGrowth = 15;
    this.lckGrowth = 60;
    this.resGrowth = 55;
  }

  public Serra(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                 int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 50;
    this.strMagGrowth = 50;
    this.sklGrowth = 30;
    this.spdGrowth = 40;
    this.defGrowth = 15;
    this.lckGrowth = 60;
    this.resGrowth = 55;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Bishop")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Bishop";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 1;
      this.skl = skl + 2;
      this.spd = spd + 1;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }
}
