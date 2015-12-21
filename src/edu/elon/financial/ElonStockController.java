/*
 * ElonStockController.java 1.0 Apr 15, 2015
 *
 * Copyright (c) 2015 David Han
 * Campus Box 2320, Elon University, Elon, NC 27244
 */
package edu.elon.financial;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/**
 * The communicator of data and results between the ElonStockGui and the
 * ElonStockQuoteHistory
 *
 * @author David Han
 * @version 1.0
 * @since 1.0
 * 
 */
public class ElonStockController {

  /**
   * Top level control method that creates instance of view to get user's
   * desired company name, creates an instance of model to get the file selected
   * by the user, the data from the model, the criteria the user wants to sort
   * the data by, puts data in array lists, places all of the aray lists into
   * one big arry list, then organizes and sorts the array lists based on the
   * criteria the user inputs and checks the exception if the user gives a
   * wrongly formatted file
   *
   */
  public void go() {
    ElonStockGui view = new ElonStockGui();
    ElonStockQuoteHistory model = new ElonStockQuoteHistory();
    boolean valid = false;
    while (!valid) {
      try {
        String companyName = view.getCompanyName();
        File selectedFile = view.getFile();
        model.readFile(selectedFile);
        String criteria = view.getCriteria();

        ArrayList<Double> opens = model.getOpenarray();
        ArrayList<Double> closes = model.getClosearray();
        ArrayList<Integer> volumes = model.getVolumearray();
        ArrayList<String> dates = model.getDatearray();
        ArrayList<Double> highs = model.getHigharray();
        ArrayList<Double> lows = model.getLowarray();

        ArrayList<StockQuote> stockquotes = new ArrayList<StockQuote>();
        StockQuote stockquotei;
        for (int i = 0; i < dates.size(); i++) {
          stockquotei = new StockQuote(companyName, opens.get(i),
                  closes.get(i), volumes.get(i), dates.get(i), highs.get(i),
                  lows.get(i));
          stockquotes.add(stockquotei);
        }

        if (criteria == "Date") {
          Collections.sort(stockquotes, new DateComparator());
        } else if (criteria == "Open") {
          Collections.sort(stockquotes, new OpenComparator());
        } else if (criteria == "High") {
          Collections.sort(stockquotes, new HighComparator());
        } else if (criteria == "Low") {
          Collections.sort(stockquotes, new LowComparator());
        } else if (criteria == "Close") {
          Collections.sort(stockquotes, new CloseComparator());
        } else {
          Collections.sort(stockquotes, new VolumeComparator());

        }

        view.finalMessage(stockquotes);

      } catch (Exception exception) {
        view.getErrorMessage();
      }

    }
  }
}