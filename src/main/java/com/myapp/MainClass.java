package com.myapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainClass {
    private static final Logger LOG = LogManager.getLogger();
    public static void main(String[] args) {
        LOG.info("I'm alive!");
    }
}
