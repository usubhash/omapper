package org.omapper.test;

import java.util.ArrayList;
import java.util.List;

import org.omapper.exception.UnableToMapException;
import org.omapper.exception.UnknownPropertyException;
import org.omapper.exception.UnknownTypeException;
import org.omapper.mapper.CollatingMapper;
import org.omapper.mapper.SimpleMapper;

/**
 * Test Class for OMapper Framework
 * @author Sachin
 *
 */
public class Main {
	
	public static void main(String[] args) throws UnableToMapException, UnknownPropertyException, UnknownTypeException, IllegalArgumentException, IllegalAccessException {
		
		SimpleMapper<Bean2, Bean1> mapper=new SimpleMapper<Bean2, Bean1>(Bean2.class,Bean1.class);
		Bean1 bean1=new Bean1();
		bean1.setAddress("My address");
		bean1.setAge(26);
		bean1.setEmp_id(7922510);
		bean1.setName("Sachin");
		Bean2 bean2=new Bean2();
		Bean3 bean3=new Bean3();
		bean3.setCompanyName("RBS");
		List<String> positionsList=new ArrayList<String>();
		positionsList.add("Software Engineer");
		positionsList.add("Senior Software Engineer");
		positionsList.add("Software Designer");
		bean3.setPositionsList(positionsList);
		
		mapper.mapBean(bean2, bean1);
		System.out.println("Simple Mapper Dempo.....Starts");
		System.out.println("Bean2="+bean2);
		System.out.println("Bean1="+bean1);
		System.out.println("Simple Mapper Dempo.....Ends");
		@SuppressWarnings("unchecked")
		
		CollatingMapper<Bean2> collatingMapper=new CollatingMapper<Bean2>(Bean2.class,Bean1.class, Bean3.class);
		collatingMapper.mapBean(bean2, bean1,bean3);
		System.out.println("Collating Mapper Dempo.....Starts");
		System.out.println("Bean2="+bean2);
		System.out.println("Bean1="+bean1);
		System.out.println("Bean 3="+bean3);
		System.out.println("Collating Mapper Dempo.....Ends");
		
		
	}

}
