package com.certificacion.SergueiBack.utils;

import java.util.logging.Logger;

public class Log {

    private Log(){}

    private static final Logger LOGGER = Logger.getLogger("Exception");

    public static Logger getLogger(){return LOGGER;}
}