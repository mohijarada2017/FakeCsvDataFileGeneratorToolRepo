# FakeCsvDataFileGeneratorToolRepo

## Fake CSV data file generator Java tool for testing BigData stuff like Data Visualizations, BI tools' performance (i.e. > 200 millions of CSV records file can be generated) - generated CSV file with 7 Ms-Excel columns:

* Installation instructions:
1) Please make sure you have JRE 1.7+ installed in prior.
2) Then, please download the zip file named "java_tool_zipfile_to_run.zip", to any folder/sub-folder at your computer/notebook.
3) Just run it with these commands (i.e. tested with 4GB-8GB RAM machines and worked well):

// Below command line will generate 50 millions of CSV data records file reside at $home.dir, in Ms-Windows will be c:\users\..
> java -jar "CsvFakeDataFileGeneratorTool.jar" 50000000 ,

Output will be looks like this (run results) - but of course CSV file generate will reside at your specific folder:

>java -jar CsvFakeDataFileGeneratorTool.jar 50000000 ,<br>
CSV fake data file generation is done successfully and took: 168 seconds<br>
CSV fake data file generated at this location: C:\Users\Mohee_Jarada\fakeCsvDataFile_50000000.csv<br>

// Below command line will generate 100 millions of CSV data records file (comma separated file):
> java -jar "CsvFakeDataFileGeneratorTool.jar" 100000000 ,

// Below command line will generate 200 millions of CSV data records file (comma separated file):
> java -jar "CsvFakeDataFileGeneratorTool.jar" 200000000 ,

// Below command line will generate 10 millions of CSV data records file (semicolon separated file:
> java -jar "CsvFakeDataFileGeneratorTool.jar" 10000000 ;

Enjoy using my tool and happy to hear from you:
(c)2017 October - Mohee Jarada. E-Mail: jarada.mohee@gmail.com
