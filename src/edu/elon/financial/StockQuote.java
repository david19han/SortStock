/*
 * StockQuote.java 1.0 Apr 15, 2015
 *
 *  Copyright (c) 2015 David Han
 * Campus Box 2320, Elon University, Elon, NC 27244
 */
package edu.elon.financial;

/**
 * Creates an object StockQuote that holds the stock quote data values of the
 * file
 *
 * @author David Han
 * @version 1.0
 * @since 1.0
 * 
 */
public class StockQuote {

  private String companyName;
  private String criteria;
  private double open;
  private double close;
  private String date;
  private double volume;
  private double high;
  private double low;

  public StockQuote() {

  }

  /**
   * Creates an object StockQuote that holds the company's name, open value,
   * close value, volume value, date value, high value and low value,
   *
   * @param acompanyName String value of company name
   * @param aopen double value of open data value
   * @param aclose double value of close data value
   * @param avolume double value of volume data value
   * @param adate String value of the date data value
   * @param ahigh double value of high data value
   * @param alow double value of low data value
   */
  public StockQuote(String acompanyName, double aopen, double aclose,
          double avolume, String adate, double ahigh, double alow) {
    super();
    companyName = acompanyName;
    open = aopen;
    close = aclose;
    date = adate;
    volume = avolume;
    high = ahigh;
    low = alow;
  }

  @Override
  public boolean equals(Object obj) {
    StockQuote other = (StockQuote) obj;
    if (this.getClose() == other.getClose()
            && this.getVolume() == other.getVolume()) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Gets the close data value
   * 
   * @return the close double value of close data value
   */
  public double getClose() {
    return close;
  }

  /**
   * Gets the company name value
   * 
   * @return the companyName String value of company name
   */
  public String getCompanyName() {
    return companyName;
  }

  /**
   * Gets the criteria of how to sort the data from the user
   * 
   * @return the criteria String value of the criteria data value
   */
  public String getCriteria() {
    return criteria;
  }

  /**
   * Gets the date value
   * 
   * @return the date double value of date data value
   */
  public String getDate() {
    return date;
  }

  /**
   * Gets the high value
   * 
   * @return the high double value of high data value
   */
  public double getHigh() {
    return high;
  }

  /**
   * Gets the low value
   * 
   * @return the low double value of low data value
   */
  public double getLow() {
    return low;
  }

  /**
   * Gets the open value
   * 
   * @return the open double value of open data value
   */
  public double getOpen() {
    return open;
  }

  /**
   * Gets the volume value
   * 
   * @return the volume double value of volume data value
   */
  public double getVolume() {
    return volume;
  }

  /**
   * Sets the close value
   * 
   * @param aClose double value of close data value
   */
  public void setClose(double aClose) {
    close = aClose;
  }

  /**
   * Sets the company name
   * 
   * @param aCompanyName String value of the company name
   */
  public void setCompanyName(String aCompanyName) {
    companyName = aCompanyName;
  }

  /**
   * Sets the criteria value
   * 
   * @param aCriteria String value of the criteria value
   */
  public void setCriteria(String aCriteria) {
    criteria = aCriteria;
  }

  /**
   * Sets the date value
   * 
   * @param aDate the double value of the date value
   */
  public void setDate(String aDate) {
    date = aDate;
  }

  /**
   * Sets the high value
   * 
   * @param aHigh the double value of the high value
   */
  public void setHigh(double aHigh) {
    high = aHigh;
  }

  /**
   * Sets the low value
   * 
   * @param aLow the double value of the low value
   */
  public void setLow(double aLow) {
    low = aLow;
  }

  /**
   * Sets the open value
   * 
   * @param aOpen the double value of the open value
   */
  public void setOpen(double aOpen) {
    open = aOpen;
  }

  /**
   * Sets the volume value
   * 
   * @param aVolume the double value of the volume value
   */
  public void setVolume(double aVolume) {
    volume = aVolume;
  }

  @Override
  public String toString() {
    String objectmessage = "Company: " + companyName + ", Open: $"
            + String.format("%.2f", open) + ", Close: $"
            + String.format("%.2f", close) + ", Date: " + date;
    return objectmessage;
  }
}
