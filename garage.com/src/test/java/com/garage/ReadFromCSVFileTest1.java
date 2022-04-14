package com.garage;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.Test;

public class ReadFromCSVFileTest1 {
  @Test
  public void readfromCSVFile1() throws IOException{
	  String csvFilePath = "./src/test/resources/basses.csv";
	  String make = null;
	  String model = null;
	  BufferedReader lineRead = new BufferedReader(new FileReader(csvFilePath));
	  CSVParser records = CSVParser.parse(lineRead, CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
	  Map<Integer, ReadHashMap> map = new HashMap<Integer, ReadHashMap>();
	  
	  for(CSVRecord record : records) {
		  ReadHashMap hashMap = new ReadHashMap();
		  hashMap.setMake(record.get(0));
		  hashMap.setModel(record.get(1));
		  map.put(0, hashMap);
		  
		  System.out.println(map);
		  String expectedResult = csvFilePath;
		  assertEquals(csvFilePath, expectedResult);
	  }
	  
  }
}



