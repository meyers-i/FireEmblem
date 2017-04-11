package FE7.units.fighters;

import FE7.units.AUnit;

/**
 * Represents Bartre from FE7.
 */
public class Bartre extends AUnit {

  /**
   * Constructor for Bartre.
   */
  public Bartre() {
    this.name = "Bartre";
    this.type = "Fighter";
    this.lvl = 2;
    this.hp = 29;
    this.strMag = 9;
    this.skl = 5;
    this.spd = 3;
    this.def = 4;
    this.lck = 4;
    this.res = 0;
    this.con = 13;
    this.mov = 5;
    this.hpGrowth = 85;
    this.strMagGrowth = 50;
    this.sklGrowth = 35;
    this.spdGrowth = 40;
    this.defGrowth = 30;
    this.lckGrowth = 30;
    this.resGrowth = 25;
  }

  public Bartre(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
              int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 85;
    this.strMagGrowth = 50;
    this.sklGrowth = 35;
    this.spdGrowth = 40;
    this.defGrowth = 30;
    this.lckGrowth = 30;
    this.resGrowth = 25;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Warrior")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Warrior";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 1;
      this.skl = skl + 2;
      this.def = def + 3;
      this.res = res + 3;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }

  @Override
  public void applyEnergyRingP() {
    if (strMag == 30) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 28) {
      this.strMag = 30;
    }
    else {
      this.strMag = strMag + 2;
    }
  }

  @Override
  public void applySecretBookP() {
    if (skl == 28) {
      throw new IllegalStateException("Unit's Skill is already maxed.");
    }
    if (skl >= 26) {
      this.skl = 28;
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
    if (def == 26) {
      throw new IllegalStateException("Unit's Defense is already maxed.");
    }
    else if (def >= 24) {
      this.def = 26;
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
