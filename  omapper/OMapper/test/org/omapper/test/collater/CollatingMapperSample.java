package org.omapper.test.collater;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.omapper.exception.UnableToMapException;
import org.omapper.exception.UnknownPropertyException;
import org.omapper.exception.UnknownTypeException;
import org.omapper.mapper.CollatingMapper;
import org.omapper.test.simple.Bean1;
import org.omapper.test.simple.Bean2;

/**
 * Test Class for OMapper Framework.
 * 
 * @author Sachin
 */
public class CollatingMapperSample {

	/** The logger. */
	static Logger logger = Logger.getLogger(CollatingMapperSample.class);

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws UnableToMapException
	 *             the unable to map exception
	 * @throws UnknownPropertyException
	 *             the unknown property exception
	 * @throws UnknownTypeException
	 *             the unknown type exception
	 * @throws IllegalArgumentException
	 *             the illegal argument exception
	 * @throws IllegalAccessException
	 *             the illegal access exception
	 */
	public static void main(String[] args) throws UnableToMapException,
			UnknownPropertyException, UnknownTypeException,
			IllegalArgumentException, IllegalAccessException {
		if (logger.isDebugEnabled()) {
			logger.debug("main(String[]) - start"); //$NON-NLS-1$
		}

		DOMConfigurator.configure("config/log4j.xml");
		logger.debug("Sample program starts");
		System.out.println("Collating Mapper Dempo.....Starts");
		Bean1 bean1 = new Bean1();
		

		logger.debug("Source Bean1=" + bean1);

		Bean3 bean3=new Bean3();

		System.out.println("Source Bean 3=" + bean3);

		/* Target Bean */
		Bean2 bean2 = new Bean2();

		/* Initializing Collating mapper */
		@SuppressWarnings("unchecked")
		CollatingMapper<Bean2> collatingMapper = new CollatingMapper<Bean2>(
				Bean2.class, Bean1.class, Bean3.class);

		collatingMapper.mapBean(bean2, bean1, bean3);

		System.out.println("Bean2=" + bean2);

		System.out.println("Collating Mapper Dempo.....Ends");

		if (logger.isDebugEnabled()) {
			logger.debug("main(String[]) - end"); //$NON-NLS-1$
		}
	}

}
