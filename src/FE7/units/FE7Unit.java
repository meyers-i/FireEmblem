package FE7.units;

/**
 * Represents a unit from FE7.
 */
public interface FE7Unit {

  /**
   * Changes the unit's stats when they level up.
   */
  void levelUp();

  /**
   * Changes the unit's HP stat.
   */
  void hpUp();

  /**
   * Changes the unit's Str/Mag stat.
   */
  void strMagUp();

  /**
   * Changes the unit's Skl stat.
   */
  void sklUp();

  /**
   * Changes the unit's Spd stat.
   */
  void spdUp();

  /**
   * Changes the unit's Res stat.
   */
  void resUp();

  /**
   * Changes the unit's Lck stat.
   */
  void lckUp();

  /**
   * Changes the unit's Def stat.
   */
  void defUp();

  /**
   * Promotes the unit to second class.
   */
  void promote();

  /**
   * Gets the name of the unit.
   *
   * @return The name
   */
  String getName();

  /**
   * Gets the level of the unit.
   *
   * @return The level
   */
  int getLvl();

  /**
   * Gets the HP of the unit.
   *
   * @return The HP
   */
  int getHp();

  /**
   * Gets the Skl of the unit.
   *
   * @return The Skl
   */
  int getSkl();

  /**
   * Gets the Spd of the unit.
   *
   * @return The Spd
   */
  int getSpd();

  /**
   * Gets the StrMag of the unit.
   *
   * @return The StrMag
   */
  int getStrMag();

  /**
   * Gets the Def of the unit.
   *
   * @return The Def
   */
  int getDef();

  /**
   * Gets the Lck of the unit.
   *
   * @return The Lck
   */
  int getLck();

  /**
   * Gets the Res of the unit.
   *
   * @return The Res
   */
  int getRes();

  /**
   * Gets the Con of the unit.
   *
   * @return The Con
   */
  int getCon();

  /**
   * Gets the Mov of the unit.
   *
   * @return The Mov
   */
  int getMov();

  /**
   * Returns the unit's class.
   *
   * @return The class
   */
  String getType();

  /**
   * Displays the unit info in the console.
   */
  void display();

  /**
   * Levels up the unit to the given level.
   *
   * @param lvl The level to be leveled up to
   */
  void levelUpTo(int lvl);

  void applyAngelicRobe();

  void applyEnergyRing();

  void applySecretBook();

  void applySpeedwing();

  void applyDracoshield();

  void applyGoddessIcon();

  void applyTalisman();

  void applyBoots();

  void applyBodyRing();
}
