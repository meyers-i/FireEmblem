package FE7.units.lords;

import FE7.units.AUnit;


public class Eliwood extends AUnit {

  public Eliwood() {
    this.name = "Eliwood";
    this.type = "Lord";
    this.lvl = 1;
    this.hp = 18;
    this.strMag = 5;
    this.skl = 5;
    this.spd = 7;
    this.def = 5;
    this.lck = 7;
    this.res = 0;
    this.con = 7;
    this.mov = 5;
    this.hpGrowth = 80;
    this.strMagGrowth = 45;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 30;
    this.lckGrowth = 45;
    this.resGrowth = 35;
  }

  public Eliwood(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                 int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 80;
    this.strMagGrowth = 45;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 30;
    this.lckGrowth = 45;
    this.resGrowth = 35;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Knight Lord")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Knight Lord";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 2;
      this.spd = spd + 1;
      this.def = def + 1;
      this.res = res + 3;
      this.con = con + 2;
      this.mov = mov + 2;
    }
  }

  @Override
  public void applyEnergyRingP() {
    if (strMag == 27) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 25) {
      this.strMag = 27;
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
    if (def == 23) {
      throw new IllegalStateException("Unit's Defense is already maxed.");
    }
    else if (def >= 21) {
      this.def = 23;
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
