package FE7.units.pirates;

import FE7.units.AUnit;

/**
 * Represents Dart from FE7.
 */
public class Dart extends AUnit {

  /**
   * Constructor for Dart.
   */
  public Dart() {
    this.name = "Dart";
    this.type = "Pirate";
    this.lvl = 8;
    this.hp = 34;
    this.strMag = 12;
    this.skl = 8;
    this.spd = 8;
    this.def = 6;
    this.lck = 3;
    this.res = 1;
    this.con = 10;
    this.mov = 5;
    this.hpGrowth = 70;
    this.strMagGrowth = 65;
    this.sklGrowth = 20;
    this.spdGrowth = 60;
    this.defGrowth = 20;
    this.lckGrowth = 35;
    this.resGrowth = 15;
  }

  public Dart(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                 int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 70;
    this.strMagGrowth = 65;
    this.sklGrowth = 20;
    this.spdGrowth = 60;
    this.defGrowth = 20;
    this.lckGrowth = 35;
    this.resGrowth = 15;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Berserker")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Berserker";
      this.lvl = 1;
      this.hp = hp + 4;
      this.strMag = strMag + 1;
      this.skl = skl + 1;
      this.spd = spd + 1;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 3;
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
    if (skl == 29) {
      throw new IllegalStateException("Unit's Skill is already maxed.");
    }
    if (skl >= 27) {
      this.skl = 29;
    }
    else {
      this.skl = skl + 2;
    }
  }

  @Override
  public void applySpeedwingP() {
    if (spd == 28) {
      throw new IllegalStateException("Unit's Speed is already maxed.");
    }
    else if (spd >= 26) {
      this.spd = 28;
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
    if (res == 21) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 19) {
      this.res = 21;
    }
    else {
      this.res = res + 2;
    }
  }
}
