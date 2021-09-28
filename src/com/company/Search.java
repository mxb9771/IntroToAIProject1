package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Search {

    private List<City> cities;

    public Search(){
        this.cities = new ArrayList<City>();
    }

    public static void main(String[] args) {
        //hard coded data files\
        Search search = new Search();
        String cityDataName = "city.dat";
        String edgeDataName = "edge.dat";
        //check for correct input length
        if (args.length != 2) {
            System.out.println("Usage: java Search inputFile outputFile\n");
            return;
        }
        //call method to scan data files
        String inputFileName = args[0];
        String outputFileName = args[1];
        Scanner inputData;
        Scanner cityData;
        Scanner edgeData;
        try {
            File inputFile = new File(inputFileName);
            File cityDataFile = new File(cityDataName);
            File edgeDataFile = new File(edgeDataName);
            inputData = new Scanner(inputFile);
            cityData = new Scanner(cityDataFile);
            edgeData = new Scanner(edgeDataFile);
        } catch (FileNotFoundException e) { // throw error if input file is not there
            System.out.println("File not found: " + inputFileName + "\n");
            return;
        }
        search.parseCityData(cityData);
        search.parseEdgeData(edgeData);

    }

    /*
    go through all cities and create city objects
     */
    private void parseCityData(Scanner cityData){
        while(cityData.hasNextLine()){
            String[] data = cityData.nextLine().trim().split("\\s+");
            this.cities.add(new City(data[0], data[1], Float.parseFloat(data[2]), Float.parseFloat(data[3])));
        }
    }

    private void parseEdgeData(Scanner edgeData){
        while(edgeData.hasNextLine()){
            String[] data = edgeData.nextLine().trim().split("\\s+");
            System.out.println(Arrays.toString(data));

        }
    }
}
