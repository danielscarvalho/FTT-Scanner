package br.cefsa.ftt.ec;

import java.io.File;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SourceScanner {

	public static void main(String[] args) {

		System.out.print(new Date());
		System.out.println(" - Source Scanner...");

		// Analyse file as a simple text using regex, instead of parsing the XML...

        try {

            File file = new File("resources//data.xml");

            Scanner input = new Scanner(file);

            int count = 0;
            String line;

            //https://regex101.com/

            Pattern p = Pattern.compile("<\\/*([a-z]+)>");

            while (input.hasNext(p)) {
            	//line = input.next();
            	line = input.next(p);

            	System.out.print(count + ": ");
            	System.out.println(line);
            	count++;
            } //while

            input.close();

       } catch (Exception ex) {
            ex.printStackTrace();
       } //try
   } //main
} //SourceScanner
