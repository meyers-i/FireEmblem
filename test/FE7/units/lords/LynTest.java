package FE7.units.lords;

import org.junit.Test;

import FE7.units.AUnit;
import FE7.units.FE7Unit;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Ian on 3/31/2017.
 */
public class LynTest {

  AUnit lyn = new Lyn();

  @Test
  public void testGets() {
    assertEquals("Lyn", lyn.getName());
  }

  @Test
  public void testHpUp() {
    lyn.hpUp();
    lyn.display();
  }

  @Test
  public void testDef() {
    lyn.display();
  }

  @Test
  public void testLevelUp() {
    lyn.levelUp();

    lyn.display();
  }

  @Test
  public void testLevelUpTo() {
    lyn.levelUpTo(20);
    lyn.display();
  }

  @Test
  public void testPromote() {
    lyn.levelUpTo(20);
    lyn.promote();
    lyn.display();
  }
}