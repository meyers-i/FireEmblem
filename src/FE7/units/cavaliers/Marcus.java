package FE7.units.cavaliers;

import FE7.units.AUnit;


public class Marcus extends AUnit {

  public Marcus() {
    this.name = "Marcus";
    this.type = "Paladin";
    this.lvl = 1;
    this.hp = 31;
    this.strMag = 15;
    this.skl = 15;
    this.spd = 11;
    this.def = 10;
    this.lck = 8;
    this.res = 8;
    this.con = 11;
    this.mov = 8;
    this.hpGrowth = 65;
    this.strMagGrowth = 30;
    this.sklGrowth = 50;
    this.spdGrowth = 25;
    this.defGrowth = 15;
    this.lckGrowth = 30;
    this.resGrowth = 35;
  }

  public Marcus(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
               int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 65;
    this.strMagGrowth = 30;
    this.sklGrowth = 50;
    this.spdGrowth = 25;
    this.defGrowth = 15;
    this.lckGrowth = 30;
    this.resGrowth = 35;
  }

  @Override
  public void promote() {
    throw new IllegalStateException("This unit cannot be promoted.");
  }
}
