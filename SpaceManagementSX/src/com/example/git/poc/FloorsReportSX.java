package com.example.git.poc;

import java.util.Arrays;
import java.util.List;


public class FloorsReportSX {
    public static void main(String[] args) {
        List<String> fields = Arrays.asList("Code", "Name", "Building");
        System.out.println("This SX creates a report of Floors with following fields");
        fields.forEach(field -> System.out.print(field + " | "));
    }
}
