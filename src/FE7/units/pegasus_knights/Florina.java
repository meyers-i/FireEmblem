package FE7.units.pegasus_knights;


import FE7.units.AUnit;

/**
 * Represents Florina from FE7.
 */
public class Florina extends AUnit {

  /**
   * Constructor for Florina.
   */
  public Florina() {
    this.name = "Florina";
    this.type = "Pegasus Knight";
    this.lvl = 1;
    this.hp = 17;
    this.strMag = 5;
    this.skl = 7;
    this.spd = 9;
    this.def = 4;
    this.lck = 7;
    this.res = 4;
    this.con = 4;
    this.mov = 7;
    this.hpGrowth = 60;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 55;
    this.defGrowth = 15;
    this.lckGrowth = 50;
    this.resGrowth = 35;
  }

  public Florina(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
              int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 60;
    this.strMagGrowth = 40;
    this.sklGrowth = 50;
    this.spdGrowth = 55;
    this.defGrowth = 15;
    this.lckGrowth = 50;
    this.resGrowth = 35;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Falcoknight")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Falcoknight";
      this.lvl = 1;
      this.hp = hp + 5;
      this.strMag = strMag + 2;
      this.def = def + 2;
      this.res = res + 2;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }

  @Override
  public void applyEnergyRingP() {
    if (strMag == 23) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 21) {
      this.strMag = 23;
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
