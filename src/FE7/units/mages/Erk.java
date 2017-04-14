package FE7.units.mages;

import FE7.units.AUnit;

/**
 * Represents Erk from FE7.
 */
public class Erk extends AUnit {

  /**
   * Constructor for Erk.
   */
  public Erk() {
    this.name = "Erk";
    this.type = "Mage";
    this.lvl = 1;
    this.hp = 17;
    this.strMag = 5;
    this.skl = 6;
    this.spd = 7;
    this.def = 2;
    this.lck = 3;
    this.res = 4;
    this.con = 5;
    this.mov = 5;
    this.hpGrowth = 65;
    this.strMagGrowth = 40;
    this.sklGrowth = 40;
    this.spdGrowth = 50;
    this.defGrowth = 20;
    this.lckGrowth = 30;
    this.resGrowth = 40;
  }

  public Erk(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
             int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 65;
    this.strMagGrowth = 40;
    this.sklGrowth = 40;
    this.spdGrowth = 50;
    this.defGrowth = 20;
    this.lckGrowth = 30;
    this.resGrowth = 40;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Sage")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Sage";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 1;
      this.def = def + 3;
      this.res = res + 3;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }

  @Override
  public void applyEnergyRingP() {
    if (strMag == 28) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 26) {
      this.strMag = 28;
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
