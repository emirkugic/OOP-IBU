package week11.mooc.ui;

import week11.mooc.logic.ApplicationLogic;
import week11.mooc.ui.TextUserInterface;

public class Main {
  public static void main(String[] args) {
    UserInterface ui = new TextUserInterface();
    ApplicationLogic logic = new ApplicationLogic(ui);
    logic.execute(3);
  }
}