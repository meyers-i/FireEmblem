package FE7.units.archers;

import FE7.units.AUnit;

/**
 * Represents Wil from FE7.
 */
public class Wil extends AUnit{

  /**
   * Constructor for Wil.
   */
  public Wil() {
    this.name = "Wil";
    this.type = "Archer";
    this.lvl = 2;
    this.hp = 20;
    this.strMag = 6;
    this.skl = 5;
    this.spd = 5;
    this.def = 5;
    this.lck = 6;
    this.res = 0;
    this.con = 6;
    this.mov = 5;
    this.hpGrowth = 75;
    this.strMagGrowth = 50;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 20;
    this.lckGrowth = 40;
    this.resGrowth = 25;
  }

  public Wil(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                 int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 75;
    this.strMagGrowth = 50;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 20;
    this.lckGrowth = 40;
    this.resGrowth = 25;
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
      this.hp = hp + 3;
      this.strMag = strMag + 1;
      this.skl = skl + 2;
      this.spd = spd + 2;
      this.def = def + 2;
      this.res = res + 3;
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
      this.skl = 24;
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
    if (res == 23) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 21) {
      this.res = 23;
    }
    else {
      this.res = res + 2;
    }
  }
}
