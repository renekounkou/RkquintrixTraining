package com.garage;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class ReadFromCSVFileTest {
  @Test
  public void readfromCSVFile() throws IOException{
	  String csvFilePath = "./src/test/resources/basses.csv";
	  CSVReader reader = new CSVReader(new FileReader(csvFilePath));
	  List<String[]> data = reader.readAll();
	  for(String[] row: data) {
	  System.out.println(Arrays.toString(row));  
	  }
	  String expectedResult = csvFilePath;
	  assertEquals(csvFilePath, expectedResult);
  }
}
