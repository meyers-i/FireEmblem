package FE7.units;

import org.junit.Test;

import FE7.units.cavaliers.Kent;
import FE7.units.myrmidons.Guy;

import static junit.framework.TestCase.assertEquals;

/**
 * Test class for AUnit
 */
public class AUnitTest {

  AUnit kent = new Kent();
  AUnit guy = new Guy();

  @Test
  public void testHPUp() {
    int maxHP = 30;
    int minHP = 20;
    for (int i = 0; i < 11; i++) {
      kent.hpUp();
    }
    int currHP = kent.getHp();
    assertEquals(currHP <= maxHP, true);
    assertEquals(currHP >= minHP, true);
  }
}