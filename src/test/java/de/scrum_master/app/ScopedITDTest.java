package de.scrum_master.app;

import de.scrum_master.aspect.MyAspect;
import org.acme.MyOtherPanel;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ScopedITDTest {
  @Test
  public void aspectAltersInScopeMethodResult() {
    assertNotEquals(42, MyTargetPanel.getMeaningOfLife());
  }

  @Test
  public void aspectDoesNotAlterOutOfScopeMethodResult() {
    assertEquals(42, MyOtherPanel.getMeaningOfLife());
  }

  @Test
  public void aspectAltersInScopeClassParent() {
    assertEquals(MyAspect.MyPanel.class, MyTargetPanel.class.getSuperclass());
  }

  @Test
  public void aspectDoesNotAlterOutOfScopeClassParent() {
    assertEquals(JPanel.class, MyOtherPanel.class.getSuperclass());
  }
}
