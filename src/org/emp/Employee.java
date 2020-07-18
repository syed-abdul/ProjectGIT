package org.emp;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Employee {
	
	public static void main(String[] args) throws JAXBException {
		
		JAXBContext cont = JAXBContext.newInstance(Company.class);
		
		Unmarshaller un = cont.createUnmarshaller();
		
		File fi=new File("C:\\Users\\ragavboom\\eclipse-workspace\\Employee Detais\\NewFile.xml");
		
	Object o = un.unmarshal(fi);
		
		Company c=(Company)o;
		
		
		System.out.println(c.getCpyId());
		System.out.println(c.getCpyName());
		System.out.println(c.getEmail());
		System.out.println(c.getMobile());
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
