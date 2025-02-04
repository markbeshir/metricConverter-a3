# metricConverter
A simple command-line application that converts between different metric and imperial units.
Supported Conversions: 
Kilograms (kg) to Pounds (lb)
Grams (g) to Ounces (oz)
Kilometers (km) to Miles (mi)
Millimeters (mm) to Inches (in)

#How to Use:

Run the program using the JAR file:
Copyjava -jar MetricConverter.jar

Enter your conversion query in the following format:
Copy[value] [from-unit] = [to-unit]
For example:

1 kg = lb
100 g = oz
5 km = mi
10 mm = in


To exit the program, type either:

exit or 
-1



Example Usage
CopyWelcome to metric converter!
Please input your query. For example, '1 kg = lb'

Enter your conversion query: 1 kg = lb
1.00 kg = 2.20 lb

Enter your conversion query: 100 g = oz
100.00 g = 3.53 oz

Enter your conversion query: exit
Thank you for using metric converter. Goodbye!
Error Handling
If you enter an invalid query or unsupported conversion, the program will display an error message and ask you to try again with a valid format.
