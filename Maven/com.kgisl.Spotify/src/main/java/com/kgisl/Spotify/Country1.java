package com.kgisl.Spotify;


import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Country1 {

    public static void main(String[] args) throws IOException {

        String fileName = "D:\\Sangeetha priya\\Java\\Maven\\com.kgisl.Spotify\\files.csv";

        List<Country> beans = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(Country.class)
                .build()
                .parse();

        beans.forEach(System.out::println);

    }
}
