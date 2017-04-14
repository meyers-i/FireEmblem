package FE7.units.thieves;

import FE7.units.AUnit;

/**
 * Represents Matthew from FE7.
 */
public class Matthew extends AUnit {

  /**
   * Constructor for Matthew.
   */
  public Matthew() {
    this.name = "Matthew";
    this.type = "Thief";
    this.lvl = 2;
    this.hp = 18;
    this.strMag = 4;
    this.skl = 4;
    this.spd = 11;
    this.def = 3;
    this.lck = 2;
    this.res = 0;
    this.con = 7;
    this.mov = 6;
    this.hpGrowth = 75;
    this.strMagGrowth = 30;
    this.sklGrowth = 40;
    this.spdGrowth = 70;
    this.defGrowth = 25;
    this.lckGrowth = 50;
    this.resGrowth = 20;
  }

  public Matthew(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
               int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 75;
    this.strMagGrowth = 30;
    this.sklGrowth = 40;
    this.spdGrowth = 70;
    this.defGrowth = 25;
    this.lckGrowth = 50;
    this.resGrowth = 20;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Assassin")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Assassin";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 1;
      this.def = def + 2;
      this.res = res + 2;
    }
  }

  @Override
  public void applyEnergyRingP() {
    if (strMag == 20) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 18) {
      this.strMag = 20;
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
      this.skl = 30;
    }
    else {
      this.skl = skl + 2;
    }
  }

  @Override
  public void applySpeedwingP() {
    if (spd == 30) {
      throw new IllegalStateException("Unit's Speed is already maxed.");
    }
    else if (spd >= 28) {
      this.spd = 30;
    }
    else {
      this.spd = spd + 2;
    }
  }

  @Override
  public void applyDracoshieldP() {
    if (def == 20) {
      throw new IllegalStateException("Unit's Defense is already maxed.");
    }
    else if (def >= 18) {
      this.def = 20;
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
    if (res == 20) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 18) {
      this.res = 20;
    }
    else {
      this.res = res + 2;
    }
  }
}
