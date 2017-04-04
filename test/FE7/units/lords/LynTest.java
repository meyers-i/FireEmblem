package FE7.units.lords;

import org.junit.Test;

import FE7.units.AUnit;

import static junit.framework.TestCase.assertEquals;

/**
 * Test class for Lyn.
 */
public class LynTest {

  AUnit lyn = new Lyn();

  @Test
  public void testConstructor() {
    assertEquals("Lyn", lyn.getName());
    assertEquals("Lord", lyn.getType());
    assertEquals(1, lyn.getLvl());
    lyn.display();
  }

  @Test
  public void testPromote() {
    lyn.levelUpTo(20);
    lyn.promote();
    lyn.display();
  }

  @Test(expected = IllegalStateException.class)
  public void testPromoteLevelException() {
    lyn.levelUpTo(9);
    lyn.promote();
  }

  @Test(expected = IllegalStateException.class)
  public void testPromoteClassException() {
    lyn.levelUpTo(10);
    lyn.promote();
    lyn.promote();
  }
}