package FE7.units.mercenaries;

import FE7.units.AUnit;

/**
 * Represents Raven from FE7.
 */
public class Raven extends AUnit {

  /**
   * Constructor for Raven.
   */
  public Raven() {
    this.name = "Raven";
    this.type = "Mercenary";
    this.lvl = 5;
    this.hp = 25;
    this.strMag = 8;
    this.skl = 11;
    this.spd = 13;
    this.def = 5;
    this.lck = 2;
    this.res = 1;
    this.con = 8;
    this.mov = 5;
    this.hpGrowth = 85;
    this.strMagGrowth = 55;
    this.sklGrowth = 40;
    this.spdGrowth = 45;
    this.defGrowth = 25;
    this.lckGrowth = 35;
    this.resGrowth = 15;
  }

  public Raven(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
             int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 85;
    this.strMagGrowth = 55;
    this.sklGrowth = 40;
    this.spdGrowth = 45;
    this.defGrowth = 25;
    this.lckGrowth = 35;
    this.resGrowth = 15;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Hero")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Hero";
      this.lvl = 1;
      this.hp = hp + 4;
      this.skl = skl + 2;
      this.spd = spd + 2;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 1;
      this.mov = mov + 1;
    }
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
    if (res == 22) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 20) {
      this.res = 22;
    }
    else {
      this.res = res + 2;
    }
  }
}
