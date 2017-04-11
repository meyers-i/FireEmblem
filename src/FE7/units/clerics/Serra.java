package FE7.units.clerics;


import FE7.units.AUnit;

/**
 * Represents Serra from FE7.
 */
public class Serra extends AUnit {

  /**
   * Constructor for Serra.
   */
  public Serra() {
    this.name = "Serra";
    this.type = "Cleric";
    this.lvl = 1;
    this.hp = 17;
    this.strMag = 2;
    this.skl = 5;
    this.spd = 8;
    this.def = 2;
    this.lck = 6;
    this.res = 5;
    this.con = 4;
    this.mov = 5;
    this.hpGrowth = 50;
    this.strMagGrowth = 50;
    this.sklGrowth = 30;
    this.spdGrowth = 40;
    this.defGrowth = 15;
    this.lckGrowth = 60;
    this.resGrowth = 55;
  }

  public Serra(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                 int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 50;
    this.strMagGrowth = 50;
    this.sklGrowth = 30;
    this.spdGrowth = 40;
    this.defGrowth = 15;
    this.lckGrowth = 60;
    this.resGrowth = 55;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Bishop")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Bishop";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 1;
      this.skl = skl + 2;
      this.spd = spd + 1;
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
    if (skl == 25) {
      throw new IllegalStateException("Unit's Skill is already maxed.");
    }
    if (skl >= 23) {
      this.skl = 25;
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
    if (res == 30) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 28) {
      this.res = 30;
    }
    else {
      this.res = res + 2;
    }
  }
}
