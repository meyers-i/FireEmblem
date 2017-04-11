package FE7.units.dancers_and_bards;

import FE7.units.AUnit;


public class Nils extends AUnit {

  public Nils() {
    this.name = "Nils";
    this.type = "Bard";
    this.lvl = 1;
    this.hp = 14;
    this.strMag = 0;
    this.skl = 0;
    this.spd = 12;
    this.def = 5;
    this.lck = 10;
    this.res = 4;
    this.con = 3;
    this.mov = 5;
    this.hpGrowth = 85;
    this.strMagGrowth = 5;
    this.sklGrowth = 5;
    this.spdGrowth = 70;
    this.defGrowth = 30;
    this.lckGrowth = 80;
    this.resGrowth = 70;
  }

  public Nils(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
               int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 85;
    this.strMagGrowth = 5;
    this.sklGrowth = 5;
    this.spdGrowth = 70;
    this.defGrowth = 30;
    this.lckGrowth = 80;
    this.resGrowth = 70;
  }

  @Override
  public void promote() {
    throw new IllegalStateException("This unit cannot be promoted.");
  }

  @Override
  public void applyEnergyRingP() {
    if (strMag == 10) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 8) {
      this.strMag = 10;
    }
    else {
      this.strMag = strMag + 2;
    }
  }

  @Override
  public void applySecretBookP() {
    if (skl == 10) {
      throw new IllegalStateException("Unit's Skill is already maxed.");
    }
    if (skl >= 8) {
      this.skl = 10;
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
    if (res == 26) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 24) {
      this.res = 26;
    }
    else {
      this.res = res + 2;
    }
  }
}
