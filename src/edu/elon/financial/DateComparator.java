/**
 * DateComparator.java 1.0 Apr 16, 2015Apr 16, 2015
 * Copyright (c) 2015 David T. Han
 * Campus Box 5702, Elon University, Elon, NC 27244
 */
package edu.elon.financial;

import java.util.Comparator;

/**
 * Compares date values of the stock quote
 * 
 * @author David Han
 *
 */
public class DateComparator implements Comparator<StockQuote> {

  /*
   * Compare date stock quote value by their value. If this aO1 has a lower
   * value than a02 return a negative value, otherwise a positive int if greater
   * or 0 if equal and formats the dates given by the file
   * 
   * @param a01 the date stock quote value to compare
   * 
   * @param a02 the date stock quote value to compare
   * 
   * @return int value to represent status of comparison
   * 
   * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
   */
  @Override
  public int compare(StockQuote aO1, StockQuote aO2) {
    String str1 = aO1.getDate();
    String str2 = aO2.getDate();

    double str1totalvalue = 365 * (Double.parseDouble(str1.substring(0, 4)))
            + 30 * Double.parseDouble(str1.substring(5, 7))
            + Double.parseDouble(str1.substring(8, 10));

    double str2totalvalue = 365 * (Double.parseDouble(str2.substring(0, 4)))
            + 30 * Double.parseDouble(str2.substring(5, 7))
            + Double.parseDouble(str2.substring(8, 10));

    if (str1totalvalue < str2totalvalue) {
      return -1;
    } else if (str1totalvalue > str2totalvalue) {
      return 1;
    } else {
      return 0;
    }
  }
}
