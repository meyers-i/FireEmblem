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

  @Override
  public void applyEnergyRingP() {
    if (strMag == 25) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 23) {
      this.strMag = 25;
    }
    else {
      this.strMag = strMag + 2;
    }
  }

  @Override
  public void applySecretBookP() {
    if (skl == 26) {
      throw new IllegalStateException("Unit's Skill is already maxed.");
    }
    if (skl >= 24) {
      this.skl = 26;
    }
    else {
      this.skl = skl + 2;
    }
  }

  @Override
  public void applySpeedwingP() {
    if (spd == 24) {
      throw new IllegalStateException("Unit's Speed is already maxed.");
    }
    else if (spd >= 22) {
      this.spd = 24;
    }
    else {
      this.spd = spd + 2;
    }
  }

  @Override
  public void applyDracoshieldP() {
    if (def == 25) {
      throw new IllegalStateException("Unit's Defense is already maxed.");
    }
    else if (def >= 23) {
      this.def = 25;
    }
    else {
      this.def = def + 2;
    }
  }

  @Override
  public void applyGoddessIconP() {
    if (lck == 30) {
      throw new IllegalStateException("Unit's Luck is already maxed.");
    }
    else if (lck >= 28) {
      this.lck = 30;
    }
    else {
      this.lck = lck + 2;
    }
  }

  @Override
  public void applyTalismanP() {
    if (res == 25) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 23) {
      this.res = 25;
    }
    else {
      this.res = res + 2;
    }
  }
}
