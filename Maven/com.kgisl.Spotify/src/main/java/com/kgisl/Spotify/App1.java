package com.kgisl.Spotify;


import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App1 {

    public static void main(String[] args) throws IOException, CsvException {

        String fileName = "D:\\Sangeetha priya\\Java\\Maven\\com.kgisl.Spotify\\semifile.csv";
        // try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
        //     List<String[]> r = reader.readAll();
        //     r.forEach(x -> System.out.println(Arrays.toString(x)));
        // }

        
  CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator
  try(CSVReader reader = new CSVReaderBuilder(
          new FileReader(fileName))
          .withCSVParser(csvParser)   // custom CSV parser
          .withSkipLines(1)           // skip the first line, header info
          .build()){
      List<String[]> r = reader.readAll();
      r.forEach(x -> System.out.println(Arrays.toString(x)));
  }

    }
}
