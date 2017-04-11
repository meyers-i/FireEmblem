package FE7.units.archers;

import FE7.units.AUnit;

/**
 * Represents Rebecca from FE7.
 */
public class Rebecca extends AUnit {

  /**
   * Constructor for Rebecca.
   */
  public Rebecca() {
    this.name = "Rebecca";
    this.type = "Archer";
    this.lvl = 1;
    this.hp = 17;
    this.strMag = 4;
    this.skl = 5;
    this.spd = 6;
    this.def = 3;
    this.lck = 4;
    this.res = 1;
    this.con = 5;
    this.mov = 5;
    this.hpGrowth = 60;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 60;
    this.defGrowth = 15;
    this.lckGrowth = 50;
    this.resGrowth = 30;
  }

  public Rebecca(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
               int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 60;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 60;
    this.defGrowth = 15;
    this.lckGrowth = 50;
    this.resGrowth = 30;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Sniper")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Sniper";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 3;
      this.skl = skl + 1;
      this.spd = spd + 1;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }

  @Override
  public void applyEnergyRingP() {
    if (strMag == 24) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 22) {
      this.strMag = 24;
    }
    else {
      this.strMag = strMag + 2;
    }
  }

  @Override
  public void applySecretBookP() {
    if (skl == 30) {
      throw new IllegalStateException("Unit's Skill is already maxed.");
    }
    if (skl >= 28) {
      this.skl = 24;
    }
    else {
      this.skl = skl + 2;
    }
  }

  @Override
  public void applySpeedwingP() {
    if (spd == 29) {
      throw new IllegalStateException("Unit's Speed is already maxed.");
    }
    else if (spd >= 27) {
      this.spd = 29;
    }
    else {
      this.spd = spd + 2;
    }
  }

  @Override
  public void applyDracoshieldP() {
    if (def == 24) {
      throw new IllegalStateException("Unit's Defense is already maxed.");
    }
    else if (def >= 22) {
      this.def = 24;
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
    if (res == 24) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 22) {
      this.res = 24;
    }
    else {
      this.res = res + 2;
    }
  }
}
