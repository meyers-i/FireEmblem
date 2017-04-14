package FE7.units.lords;



import FE7.units.AUnit;


/**
 * Represents Lyn from FE7.
 */
public class Lyn extends AUnit {

  /**
   * Constructs an instance of Lyn.
   */
  public Lyn() {
    this.name = "Lyn";
    this.type = "Lord";
    this.lvl = 1;
    this.hp = 16;
    this.strMag = 4;
    this.skl = 7;
    this.spd = 9;
    this.def = 2;
    this.lck = 5;
    this.res = 0;
    this.con = 5;
    this.mov = 5;
    this.hpGrowth = 70;
    this.strMagGrowth = 40;
    this.sklGrowth = 60;
    this.spdGrowth = 60;
    this.defGrowth = 20;
    this.lckGrowth = 55;
    this.resGrowth = 30;
  }

  public Lyn(String name, String type, int lvl, int hp, int strMag, int skl, int spd, int def,
                int lck, int res, int con, int mov) {
    super(name, type, lvl, hp, strMag, skl, spd, def, lck, res, con, mov);
    this.hpGrowth = 70;
    this.strMagGrowth = 40;
    this.sklGrowth = 60;
    this.spdGrowth = 60;
    this.defGrowth = 20;
    this.lckGrowth = 55;
    this.resGrowth = 30;
  }

  @Override
  public void promote() {
    if (this.lvl < 10) {
      throw new IllegalStateException("Unit must be at least level 10 to promote.");
    }
    if (this.type.equals("Blade Lord")) {
      throw new IllegalStateException("Unit is already second class.");
    }
    else {
      this.type = "Blade Lord";
      this.lvl = 1;
      this.hp = hp + 3;
      this.strMag = strMag + 2;
      this.skl = skl + 2;
      this.def = def + 3;
      this.res = res + 5;
      this.con = con + 1;
      this.mov = mov + 1;
    }
  }

  @Override
  public void applyEnergyRingP() {
    if (strMag == 24) {
      throw new IllegalStateException("Unit's S/M is already maxed.");
    }
    if (strMag >= 22) {
      this.strMag = 24;
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
    if (def == 22) {
      throw new IllegalStateException("Unit's Defense is already maxed.");
    }
    else if (def >= 20) {
      this.def = 22;
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
    if (res == 22) {
      throw new IllegalStateException("Unit's Resistance is already maxed.");
    }
    else if (res >= 20) {
      this.res = 22;
    }
    else {
      this.res = res + 2;
    }
  }
}
