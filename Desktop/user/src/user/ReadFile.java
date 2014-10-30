/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user;
import java.util.*;
import java.io.*;
/**
* This example code shows you how to read file in Java
*
* IN MY CASE RAILWAY IS MY TEXT FILE WHICH I WANT TO DISPLAY YOU CHANGE WITH YOUR   OWN     */

 public class ReadFile
 {
    public static boolean main(String name) 
    {
    boolean exists;
    exists=false;
    System.out.println("Reading File from Java code");
    //Name of the file
    String fileName="c:\\user.txt";
    try{

    //Create object of FileReader
    FileReader inputFile = new FileReader(fileName);

    //Instantiate the BufferedReader Class
    BufferedReader bufferReader = new BufferedReader(inputFile);

    //Variable to hold the one line data
    String line;
    int i;
    i=0;
ArrayList parts = new ArrayList();
    // Read file line by line and print on the console
    while ((line = bufferReader.readLine()) != null)   {
        String[] partss = null;
        partss = line.split("\\s");
        parts.add(partss[i]);
        i++;
        parts.add(partss[i]);
            System.out.println(line);
            System.out.println("Contents of al: " + parts);
            i=0;
           exists = parts.contains(name);
           System.out.println(exists);
    }
    //Close the buffer reader
    bufferReader.close();
    }catch(IOException e){
            System.out.println("Error while reading file line by line:" 
            + e.getMessage());                      
    }
return exists;
    }
  }