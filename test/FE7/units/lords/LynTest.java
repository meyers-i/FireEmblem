package FE7.units.lords;

import org.junit.Test;

import FE7.units.FE7Unit;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Ian on 3/31/2017.
 */
public class LynTest {

  FE7Unit lyn = new Lyn();

  @Test
  public void testGets() {
    assertEquals("Lyn", lyn.getName());
  }

  @Test
  public void testHpUp() {
    lyn.hpUp();
    lyn.display();
  }
}