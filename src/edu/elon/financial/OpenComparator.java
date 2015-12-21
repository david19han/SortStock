/*
 * OpenComparator.java 1.0 Apr 15, 2015
 *
 *  Copyright (c) 2015 David Han
 * Campus Box 2320, Elon University, Elon, NC 27244
 */
package edu.elon.financial;

import java.util.Comparator;

/**
 * Compares the open values of the stock quote
 *
 * @author David Han
 * @version 1.0
 * @since 1.0
 * 
 */
public class OpenComparator implements Comparator<StockQuote> {

  /*
   * Compare open stock quote value by their value. If this aO1 has a lower
   * value than a02 return a negative value, otherwise a positive int if greater
   * or 0 if equal and formats the dates given by the file
   * 
   * @param a01 the open stock quote value to compare
   * 
   * @param a02 the open stock quote value to compare
   * 
   * @return int value to represent status of comparison
   * 
   * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
   */
  @Override
  public int compare(StockQuote aO1, StockQuote aO2) {
    if (aO1.getOpen() == aO2.getOpen()) {
      return 0;
    } else if (aO1.getOpen() < aO2.getOpen()) {
      return -1;
    } else {
      return 1;
    }
  }

}
