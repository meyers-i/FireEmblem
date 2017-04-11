package FE7.units.knights;

import FE7.units.AUnit;


public class Wallace extends AUnit {

  public Wallace() {
    this.name = "Wallace";
    this.type = "Knight";
    this.lvl = 12;
    this.hp = 30;
    this.strMag = 13;
    this.skl = 7;
    this.spd = 5;
    this.def = 15;
    this.lck = 10;
    this.res = 2;
    this.con = 13;
    this.mov = 4;
    this.hpGrowth = 75;
    this.strMagGrowth = 45;
    this.sklGrowth = 40;
    this.spdGrowth = 20;
    this.defGrowth = 55;
    this.lckGrowth = 35;
    this.resGrowth = 35;
  }

  public Wallace(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
               int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 75;
    this.strMagGrowth = 45;
    this.sklGrowth = 40;
    this.spdGrowth = 20;
    this.defGrowth = 55;
    this.lckGrowth = 35;
    this.resGrowth = 35;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("General")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "General";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 2;
      this.skl = skl + 2;
      this.spd = spd + 3;
      this.def = def + 2;
      this.res = res + 3;
      this.con = con + 2;
      this.mov = mov + 1;
    }
  }

  @Override
  public void applyEnergyRingP() {
    if (strMag == 29) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 27) {
      this.strMag = 29;
    }
    else {
      this.strMag = strMag + 2;
    }
  }

  @Override
  public void applySecretBookP() {
    if (skl == 27) {
      throw new IllegalStateException("Unit's Skill is already maxed.");
    }
    if (skl >= 25) {
      this.skl = 27;
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
    if (def == 30) {
      throw new IllegalStateException("Unit's Defense is already maxed.");
    }
    else if (def >= 28) {
      this.def = 30;
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
