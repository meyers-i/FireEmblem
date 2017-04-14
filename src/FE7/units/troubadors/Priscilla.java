package FE7.units.troubadors;

import FE7.units.AUnit;

/**
 * Represents Priscilla from FE7.
 */
public class Priscilla extends AUnit {

  /**
   * Constructor for Priscilla.
   */
  public Priscilla() {
    this.name = "Priscilla";
    this.type = "Troubador";
    this.lvl = 3;
    this.hp = 16;
    this.strMag = 6;
    this.skl = 6;
    this.spd = 8;
    this.def = 3;
    this.lck = 7;
    this.res = 6;
    this.con = 4;
    this.mov = 7;
    this.hpGrowth = 45;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 15;
    this.lckGrowth = 65;
    this.resGrowth = 50;
  }

  public Priscilla(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                  int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 45;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 40;
    this.defGrowth = 15;
    this.lckGrowth = 65;
    this.resGrowth = 50;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Valkyrie")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Valkyrie";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 2;
      this.skl = skl + 1;
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
    if (skl == 24) {
      throw new IllegalStateException("Unit's Skill is already maxed.");
    }
    if (skl >= 22) {
      this.skl = 24;
    }
    else {
      this.skl = skl + 2;
    }
  }

  @Override
  public void applySpeedwingP() {
    if (spd == 25) {
      throw new IllegalStateException("Unit's Speed is already maxed.");
    }
    else if (spd >= 23) {
      this.spd = 25;
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
