/*
 * ElonStockApplication.java 1.0 Apr 15, 2015
 *
 * Copyright (c) 2015 David Han
 * Campus Box 2320, Elon University, Elon, NC 27244
 */
package edu.elon.financial;

import javax.swing.SwingUtilities;

/**
 * 
 * Driver class that has a single main method to instantiate the
 * ElonStockController and call top controller method
 * 
 * @author David Han
 *
 */
public class ElonStockApplication {
  /**
   * 
   * Driver method that starts application
   * 
   * @param args String array of command line arguments not used by application
   * 
   */
  public static void main(String[] args) {

    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {

        ElonStockController controller = new ElonStockController();
        controller.go();
        System.exit(0);
      }

    });
  }
}
