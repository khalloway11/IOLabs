/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;
import java.io.*;
import java.util.*;

/**
 *
 * @author khalloway
 */
public class Lab2 {
    public static void main(String[] args) throws IOException {
        File data = new File("src" + File.separatorChar + "records.txt");
    
        BufferedReader in = null;
        int record = 3;
        int upper = (record * 3)-1;
        int lower = upper - 2;
        //read a specific record and output to console
        try {
	   in = new BufferedReader(new FileReader(data));
           if(record == 0){
               return;
           }
           int count = 1;
	   String line = in.readLine();
	   while(line != null){
               line = in.readLine();  // strips out any carriage return chars
               if((count >= lower) && (count <= upper)){
		  System.out.println(line);	 
               }
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
