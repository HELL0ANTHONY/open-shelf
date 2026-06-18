package com.openshelf;

import java.util.logging.Logger;

/** Entry point for the OpenShelf application. */
public final class Main {

  private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

  private Main() {}

  /**
   * Starts the application.
   *
   * @param args command-line arguments (unused)
   */
  public static void main(String[] args) {
    LOGGER.info("OpenShelf is running.");
  }
}
