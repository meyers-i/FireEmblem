package FE7.units.cavaliers;

import FE7.units.AUnit;

/**
 * Represents Lowen from FE&.
 */
public class Lowen extends AUnit {

  /**
   * Constructor for Lowen.
   */
  public Lowen() {
    this.name = "Lowen";
    this.type = "Cavalier";
    this.lvl = 2;
    this.hp = 23;
    this.strMag = 7;
    this.skl = 5;
    this.spd = 7;
    this.def = 7;
    this.lck = 3;
    this.res = 0;
    this.con = 10;
    this.mov = 7;
    this.hpGrowth = 90;
    this.strMagGrowth = 30;
    this.sklGrowth = 30;
    this.spdGrowth = 30;
    this.defGrowth = 50;
    this.lckGrowth = 40;
    this.resGrowth = 30;
  }

  public Lowen(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                 int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 90;
    this.strMagGrowth = 30;
    this.sklGrowth = 30;
    this.spdGrowth = 30;
    this.defGrowth = 50;
    this.lckGrowth = 40;
    this.resGrowth = 30;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Paladin")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Paladin";
      this.lvl = 1;
      this.hp = hp + 2;
      this.strMag = strMag + 1;
      this.skl = skl + 1;
      this.spd = spd + 1;
      this.def = def + 2;
      this.res = res + 1;
      this.con = con + 2;
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
