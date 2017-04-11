package FE7.units.cavaliers;

import java.util.Random;

import FE7.units.AUnit;
import FE7.units.FE7Unit;

/**
 * Represents Sain from FE7.
 */
public class Sain extends AUnit {

  /**
   * Constructs an instance of Sain.
   */
  public Sain() {
    this.name = "Sain";
    this.type = "Cavalier";
    this.lvl = 1;
    this.hp = 19;
    this.strMag = 8;
    this.skl = 4;
    this.spd = 6;
    this.def = 6;
    this.lck = 4;
    this.res = 0;
    this.con = 9;
    this.mov = 7;
    this.hpGrowth = 80;
    this.strMagGrowth = 60;
    this.sklGrowth = 35;
    this.spdGrowth = 40;
    this.defGrowth = 20;
    this.lckGrowth = 35;
    this.resGrowth = 20;
  }

  public Sain(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 80;
    this.strMagGrowth = 60;
    this.sklGrowth = 35;
    this.spdGrowth = 40;
    this.defGrowth = 20;
    this.lckGrowth = 35;
    this.resGrowth = 20;
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
