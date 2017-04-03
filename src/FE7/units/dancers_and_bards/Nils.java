package FE7.units.dancers_and_bards;

import FE7.units.AUnit;

/**
 * Created by Ian on 4/3/2017.
 */
public class Nils extends AUnit {

  public Nils() {
    this.name = "Nils";
    this.type = "Bard";
    this.lvl = 1;
    this.hp = 14;
    this.strMag = 0;
    this.skl = 0;
    this.spd = 12;
    this.def = 5;
    this.lck = 10;
    this.res = 4;
    this.con = 3;
    this.mov = 5;
    this.hpGrowth = 85;
    this.strMagGrowth = 5;
    this.sklGrowth = 5;
    this.spdGrowth = 70;
    this.defGrowth = 30;
    this.lckGrowth = 80;
    this.resGrowth = 70;
  }

  @Override
  public void promote() {
    throw new IllegalStateException("This unit cannot be promoted.");
  }
}
