package FE7.units.shamans;

import FE7.units.AUnit;

/**
 * Represents Canas from FE7.
 */
public class Canas extends AUnit {

  /**
   * Constructor for Canas.
   */
  public Canas() {
    this.name = "Canas";
    this.type = "Shaman";
    this.lvl = 8;
    this.hp = 21;
    this.strMag = 10;
    this.skl = 9;
    this.spd = 8;
    this.def = 5;
    this.lck = 7;
    this.res = 8;
    this.con = 7;
    this.mov = 5;
    this.hpGrowth = 70;
    this.strMagGrowth = 45;
    this.sklGrowth = 40;
    this.spdGrowth = 35;
    this.defGrowth = 25;
    this.lckGrowth = 25;
    this.resGrowth = 45;
  }

  public Canas(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
              int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 70;
    this.strMagGrowth = 45;
    this.sklGrowth = 40;
    this.spdGrowth = 35;
    this.defGrowth = 25;
    this.lckGrowth = 25;
    this.resGrowth = 45;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Druid")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Druid";
      this.lvl = 1;
      this.hp = hp + 4;
      this.spd = spd + 3;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 1;
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
    if (spd == 26) {
      throw new IllegalStateException("Unit's Speed is already maxed.");
    }
    else if (spd >= 24) {
      this.spd = 26;
    }
    else {
      this.spd = spd + 2;
    }
  }

  @Override
  public void applyDracoshieldP() {
    if (def == 21) {
      throw new IllegalStateException("Unit's Defense is already maxed.");
    }
    else if (def >= 19) {
      this.def = 21;
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
    if (res == 28) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 26) {
      this.res = 28;
    }
    else {
      this.res = res + 2;
    }
  }
}
