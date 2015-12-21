/*
 * ElonStockQuoteHistory.java 1.0 Apr 15, 2015
 *
 *  Copyright (c) 2015 David Han
 * Campus Box 2320, Elon University, Elon, NC 27244
 */
package edu.elon.financial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reads the file selected by the user and puts the data values, data, open,
 * high, low, close, volume, adj, into individual array lists
 *
 * @author David Han
 * @version 1.0
 * @since 1.0
 * 
 */
public class ElonStockQuoteHistory {
  private String date;
  private double open;
  private double high;
  private double low;
  private double close;
  private int volume;
  private double adj;

  private ArrayList<String> datearray = new ArrayList<String>();
  private ArrayList<Double> openarray = new ArrayList<Double>();
  private ArrayList<Double> higharray = new ArrayList<Double>();
  private ArrayList<Double> lowarray = new ArrayList<Double>();
  private ArrayList<Double> closearray = new ArrayList<Double>();
  private ArrayList<Integer> volumearray = new ArrayList<Integer>();
  private ArrayList<Double> adjarray = new ArrayList<Double>();

  /**
   * Gets the array list adjarray
   * 
   * @return the adjarray the array list value of the adj data values of the
   *         stock quotes
   */
  public ArrayList<Double> getAdjarray() {
    return adjarray;
  }

  /**
   * Gets the array list closearray
   * 
   * @return the closearray the array list value of the close data values of the
   *         stock quotes
   */
  public ArrayList<Double> getClosearray() {
    return closearray;
  }

  /**
   * Gets the array list datearray
   * 
   * @return the datearray the array list value of the date data values of the
   *         stock quotes
   */
  public ArrayList<String> getDatearray() {
    return datearray;
  }

  /**
   * Gets the array list higharray
   * 
   * @return the higharray the array list value of the high data values of the
   *         stock quotes
   */
  public ArrayList<Double> getHigharray() {
    return higharray;
  }

  /**
   * Gets the array list lowarray
   * 
   * @return the lowarray the array list value of the low data values of the
   *         stock quotes
   */
  public ArrayList<Double> getLowarray() {
    return lowarray;
  }

  /**
   * Gets the array list openarray
   * 
   * @return the openarray the array list value of the open data values of the
   *         stock quotes
   */
  public ArrayList<Double> getOpenarray() {
    return openarray;
  }

  /**
   * Gets the array list volumearray
   * 
   * @return the volumearray the array list value of the volume data values of
   *         the stock quotes
   */
  public ArrayList<Integer> getVolumearray() {
    return volumearray;
  }

  /**
   * Reads file selected by the user line by line creating an instance of an
   * identical file as long as file is correct type, and adds the data values
   * from the file into their own individual array lists
   *
   * @param selectedFile
   * @throws FileNotFoundException
   */

  public void readFile(File selectedFile) throws Exception {
    String firstline = "";
    Scanner in = null;
    Scanner in2 = null;
    in = new Scanner(selectedFile);
    int lineNumber = 1;
    ArrayList<String> lineArray = new ArrayList();
    firstline = in.nextLine();
    while (in.hasNextLine()) {
      String line = in.nextLine();
      lineArray.add(line);
      lineNumber++;

    }
    
    if(lineNumber<3){
      throw new Exception("Bad File. Please give a new file.");
    }
    for (int i = 0; i < lineArray.size(); i++) {
      in2 = new Scanner(lineArray.get(i));
      in2.useDelimiter(",");

      date = in2.next();
      datearray.add(date);

      open = Double.parseDouble(in2.next());
      openarray.add(open);

      high = Double.parseDouble(in2.next());
      higharray.add(high);

      low = Double.parseDouble(in2.next());
      lowarray.add(low);

      close = Double.parseDouble(in2.next());
      closearray.add(close);

      volume = Integer.parseInt(in2.next());
      volumearray.add(volume);

      adj = Double.parseDouble(in2.next());
      adjarray.add(adj);
    }

  }

  /**
   * Sets the array list adjarray
   * 
   * @param aAdjarray the array list value of the adj data values of the stock
   *        quotes
   */
  public void setAdjarray(ArrayList<Double> aAdjarray) {
    adjarray = aAdjarray;
  }

  /**
   * Sets the array list closearray
   * 
   * @param aClosearray the array list value of the close data values of the
   *        stock quotes
   */
  public void setClosearray(ArrayList<Double> aClosearray) {
    closearray = aClosearray;
  }

  /**
   * Sets the array list datearray
   * 
   * @param aDatearray the array list value of the date data values of the stock
   *        quotes
   */
  public void setDatearray(ArrayList<String> aDatearray) {
    datearray = aDatearray;
  }

  /**
   * Sets the array list higharray
   * 
   * @param aHigharray the array list value of the high data values of the stock
   *        quotes
   */
  public void setHigharray(ArrayList<Double> aHigharray) {
    higharray = aHigharray;
  }

  /**
   * Sets the array list lowarray
   * 
   * @param aLowarray the array list value of the low data values of the stock
   *        quotes
   */
  public void setLowarray(ArrayList<Double> aLowarray) {
    lowarray = aLowarray;
  }

  /**
   * Sets the array list openarray
   * 
   * @param aOpenarray the array list value of the open data values of the stock
   *        quotes
   */
  public void setOpenarray(ArrayList<Double> aOpenarray) {
    openarray = aOpenarray;
  }

  /**
   * Sets the array list volumearray
   * 
   * @param aVolumearray the array list value of the volume data values of the
   *        stock quotes
   */
  public void setVolumearray(ArrayList<Integer> aVolumearray) {
    volumearray = aVolumearray;
  }
}
