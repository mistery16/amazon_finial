package com.amazon.properties;

import java.io.IOException;

public class File_Reader_Manager {

	
	public Configuration_Reader getInstancCR() throws IOException {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	
	}
	public static File_Reader_Manager getInstance() {
   File_Reader_Manager frm =new File_Reader_Manager();
		
		return frm;
		// TODO Auto-generated method stub
		
	}
	
	
}
