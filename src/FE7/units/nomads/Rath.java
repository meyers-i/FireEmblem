package FE7.units.nomads;

import FE7.units.AUnit;

/**
 * Represents Rath from FE7.
 */
public class Rath extends AUnit {

  /**
   * Constructor for Rath.
   */
  public Rath() {
    this.name = "Rath";
    this.type = "Nomad";
    this.lvl = 7;
    this.hp = 25;
    this.strMag = 8;
    this.skl = 9;
    this.spd = 10;
    this.def = 7;
    this.lck = 5;
    this.res = 2;
    this.con = 8;
    this.mov = 7;
    this.hpGrowth = 80;
    this.strMagGrowth = 50;
    this.sklGrowth = 40;
    this.spdGrowth = 50;
    this.defGrowth = 10;
    this.lckGrowth = 30;
    this.resGrowth = 25;
  }

  public Rath(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
             int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 80;
    this.strMagGrowth = 50;
    this.sklGrowth = 40;
    this.spdGrowth = 50;
    this.defGrowth = 10;
    this.lckGrowth = 30;
    this.resGrowth = 25;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Nomadic Trooper")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Nomadic Trooper";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 2;
      this.skl = skl + 1;
      this.spd = spd + 1;
      this.def = def + 3;
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
