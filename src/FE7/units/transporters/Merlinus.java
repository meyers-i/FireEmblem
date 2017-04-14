package FE7.units.transporters;

import FE7.units.AUnit;

/**
 * Represents Merlinus from FE7.
 */
public class Merlinus extends AUnit {

  /**
   * Constructor for Merlinus.
   */
  public Merlinus() {
    this.name = "Merlinus";
    this.type = "Transporter";
    this.lvl = 5;
    this.hp = 18;
    this.strMag = 0;
    this.skl = 4;
    this.spd = 5;
    this.def = 5;
    this.lck = 12;
    this.res = 0;
    this.con = 25;
    this.mov = 0;
    this.hpGrowth = 120;
    this.strMagGrowth = 0;
    this.sklGrowth = 90;
    this.spdGrowth = 90;
    this.defGrowth = 30;
    this.lckGrowth = 100;
    this.resGrowth = 15;
  }

  public Merlinus(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                 int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 120;
    this.strMagGrowth = 0;
    this.sklGrowth = 90;
    this.spdGrowth = 90;
    this.defGrowth = 30;
    this.lckGrowth = 100;
    this.resGrowth = 15;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Wagon")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Wagon";
      this.lvl = 1;
      this.mov = mov + 5;
    }
  }

  @Override
  public void applyEnergyRingP() {
    if (strMag == 20) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 18) {
      this.strMag = 20;
    }
    else {
      this.strMag = strMag + 2;
    }
  }

  @Override
  public void applySecretBookP() {
    if (skl == 20) {
      throw new IllegalStateException("Unit's Skill is already maxed.");
    }
    if (skl >= 18) {
      this.skl = 20;
    }
    else {
      this.skl = skl + 2;
    }
  }

  @Override
  public void applySpeedwingP() {
    if (spd == 20) {
      throw new IllegalStateException("Unit's Speed is already maxed.");
    }
    else if (spd >= 18) {
      this.spd = 20;
    }
    else {
      this.spd = spd + 2;
    }
  }

  @Override
  public void applyDracoshieldP() {
    if (def == 20) {
      throw new IllegalStateException("Unit's Defense is already maxed.");
    }
    else if (def >= 19) {
      this.def = 20;
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
    if (res == 20) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 18) {
      this.res = 20;
    }
    else {
      this.res = res + 2;
    }
  }
}
