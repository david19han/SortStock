/*
 * Comparable.java 1.0 Apr 15, 2015
 *
 *  Copyright (c) 2015 David Han
 * Campus Box 2320, Elon University, Elon, NC 27244l
 */
package edu.elon.financial;

/**
 * Describes any class whose objects are comparable.
 *
 * @author David Han
 * @version 1.0
 * @since 1.0
 * 
 */
public interface Comparable<StockQuote> {

  /**
   * Compares objects of an instance of StockQuote
   *
   * @param a instance of StockQuote
   * @param b instance of StockQuote
   * 
   */
  int compare(StockQuote a, StockQuote b);

}
