package com.qa.ims;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

	public static final Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) throws FileNotFoundException, SQLException {
		IMS ims = new IMS();
		ims.imsSystem();
		LOGGER.info("SO LONG!");
	}

}