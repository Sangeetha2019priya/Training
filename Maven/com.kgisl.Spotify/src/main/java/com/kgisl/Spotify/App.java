package com.kgisl.Spotify;
import java.io.FileReader;
// import java.util.Arrays;
// import java.util.List;


// import org.apache.commons.codec.digest.DigestUtils;

import com.opencsv.CSVReader;
/**
 * Hello world!
 *
 */

public class App {

    public static void main(String[] args) {
        
        try (CSVReader reader = new CSVReader(new FileReader("file.csv"))) {
            String[] lineInArray;
            while ((lineInArray = reader.readNext()) != null) {
                System.out.println(lineInArray[0] + lineInArray[1]+lineInArray[2]+ "etc...");
            }
        }
  catch(Exception e)
  {
    System.out.println("found");
  }

    }


}