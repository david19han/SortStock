/*
 * ElonStockGui.java 1.0 Apr 15, 2015
 *
 * Copyright (c) 2015 David Han
 * Campus Box 2320, Elon University, Elon, NC 27244
 */
package edu.elon.financial;

import java.awt.Font;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 * ElonStockGui to get input data from user and to display the final results
 * based on the user's request for how the data is sorted
 *
 * @author David Han
 * @version 1.0
 * @since 1.0
 * 
 */
public class ElonStockGui {
  private String companyName;
  private String criteria;
  private File selectedFile;

  /**
   * Displays a formatted drop down input table of the stock quotes for the
   * inputed company name, open stock quote, close stock quote and date of the
   * stock
   *
   * @param stockquotes array instance of a stock quote that holds sorted stock
   *        quote values of open, close, high, low, date and volume quotes
   */
  public void finalMessage(ArrayList<StockQuote> stockquotes) {
    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
            "Monospaced", Font.PLAIN, 12)));
    String[] stockquotesstring = new String[stockquotes.size()];
    for (int i = 0; i < stockquotes.size(); i++) {
      stockquotesstring[i] = stockquotes.get(i).toString();
    }

    Object input = JOptionPane.showInputDialog(new JFrame(),
            "Sorted quotes by " + criteria + " for " + companyName,
            "Elon Stock Application", JOptionPane.INFORMATION_MESSAGE, null,
            stockquotesstring, null);

    if (input == null) {
      System.exit(0);
    }

  }

  /**
   *
   * Prompts user to provide a company name
   *
   * @throw IllegalArgumentException when invalid company name is inputed
   * @catch catches IllegalArgumentException and displays messgae in console
   * @return String string value of the name of the user's company
   */
  public String getCompanyName() {
    String input = null;
    boolean exitPrompt = false;
    int length = 0;
    while (exitPrompt == false) {
      input = (String) JOptionPane.showInputDialog(null,
              "Enter the official company name", "Elon Stock Application",
              JOptionPane.QUESTION_MESSAGE, null, null, "Apple");
      companyName = input;
      if (input == null) {
        System.exit(0);
      }
      try {
        length = input.length();
        if (input == null || length < 2) {
          throw new IllegalArgumentException("Must enter a valid company name.");

        } else {
          exitPrompt = true;
        }
      } catch (IllegalArgumentException exception) {
        System.out.println(exception.getMessage());
      }
    }

    return companyName;
  }

  /**
   *
   * Prompts user to provide a sorting criteria from options
   *
   * @return String string type of criteria application will sort by
   */
  public String getCriteria() {
    String[] choices = { "Date", "Open", "High", "Low", "Close", "Volume" };
    String input = (String) JOptionPane.showInputDialog(null,
            "Select criteria to sort quotes by:", "Criteria for" + companyName,
            JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
    criteria = input;

    if (input == null) {
      System.exit(0);
    }

    return criteria;
  }

  /**
   * 
   * Displays error message if file is not in correct format
   *
   * 
   */

  public void getErrorMessage() {
    String title = "Invalid File";
    String message = "The file" + selectedFile + " is not in proper format";
    JOptionPane.showMessageDialog(null, message, title,
            JOptionPane.INFORMATION_MESSAGE);
  }

  /**
   * 
   * Prompts user to select a file containg stock quotes
   *
   * @return File file type selected by user
   */
  public File getFile() {
    JFileChooser chooser = new JFileChooser();
    chooser.setDialogTitle("Stock Quote File For " + companyName);
    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
      selectedFile = chooser.getSelectedFile();
    }
    if (selectedFile == null) {
      System.exit(0);
    }
    return selectedFile;
  }
}
