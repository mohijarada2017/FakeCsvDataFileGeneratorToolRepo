/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvwriterexampletestproject;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mohee_Jarada
 */
public class CsvFakeDataFileGeneratorToolClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (args != null && args.length == 2) {
            try {
                long m1 = System.currentTimeMillis();

                int rowsNeeded = Integer.parseInt(args[0]);

                String fileName = System.getProperty("user.home") + "\\fakeCsvDataFile_" + rowsNeeded + ".csv";

                String charStrRef = args[1];
                char separaterCharRef = charStrRef.charAt(0); // comma or semicolon

                // feed in your array (or convert your data to an array)
                try (CSVWriter writer = new CSVWriter(new FileWriter(fileName), separaterCharRef)) {
                    // feed in your array (or convert your data to an array)
                    String[] entries = "first#second#third#fourth#fifth#sixth#seven".split("#");

                    for (int index = 1; index <= rowsNeeded; index++) {
                        writer.writeNext(entries);
                        writer.flush();
                    } // end loop

                    long m2 = System.currentTimeMillis();
                    System.out.println("CSV fake data file generation is done successfully and took: " + ((m2 - m1) / 1000) + " seconds");
                    System.out.println("CSV fake data file generated at this location: " + fileName);
                } // end try
            } catch (IOException | NumberFormatException exceptionRef) {
                System.err.println(">>>>>>>>>Exception in tool usage: integer number should used in 1st command line argument and > zero...");
                System.err.println(">>>>>>>>>Exception message: " + exceptionRef);
                CsvFakeDataFileGeneratorToolClass.showProgramUsageMessageToUser();
            } // end catch  
        } // end if
        else {
            CsvFakeDataFileGeneratorToolClass.showProgramUsageMessageToUser();
        } // end else
    } // end main()

    // *********************************************************************************
    private static void showProgramUsageMessageToUser() {
        System.out.println("==================================================");
        System.out.println("Program usage:\n >java -jar CsvFakeDataFileGeneratorTool.jar <total rows to generate in CSV file> <comma or semicolon>");
        System.out.println("Example usage:\n >java -jar CsvFakeDataFileGeneratorTool.jar 1000000 ,\n");
        System.out.println(">java -jar CsvFakeDataFileGeneratorTool.jar 100000000 ,\n");
        System.out.println(">java -jar CsvFakeDataFileGeneratorTool.jar 200000000 ,\n");
        System.out.println("Thank you for using my small CSV data file generation tool. (c)2017 October - Mohee Jarada <Budapest-Hungary>");
        System.out.println("==================================================");
    } // end showProgramUsageMessageToUser
} // end class
