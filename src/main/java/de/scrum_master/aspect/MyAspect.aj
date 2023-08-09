package de.scrum_master.aspect;

import java.beans.JavaBean;
import javax.swing.JPanel;

public aspect MyAspect {
  public static class MyPanel extends JPanel {}

  declare parents: (!@JavaBean JPanel+) extends MyPanel;

  int around() : (execution(int getMeaningOfLife())) {
    return 11;
  }
}
