/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.io.*;
import java.util.*;

/**
 *
 * @author khalloway
 */
public class Lab1 {
    public static void main(String[] args) throws IOException {
        File data = new File("src" + File.separatorChar + "records.txt");
    
        BufferedReader in = null;
        //read and output all to console
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
        //output only 2nd record
        System.out.println();
        int count = 0;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
               if((count >= 3) && (count <=5)){
		  System.out.println(line);
               }
		  line = in.readLine();  // strips out any carriage return chars
                  count++;
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
        System.out.println();
        //append a record, then output all records
        boolean append = true;
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));
        out.print("\r");
        out.println("Santa Claus");
        out.println("1 Candy Cane Ln");
        out.println("North Pole, 11111");
        out.close();
        
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
                  count++;
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
    }
}
