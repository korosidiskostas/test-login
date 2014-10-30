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

 public class CheckPassword
 {
    public static boolean main(String name, String password) 
    {
        boolean confirmPassword;
        int indexName;
        indexName=-1;
        confirmPassword=false;
    boolean exists;
    exists=false;
   
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
           
            i=0;
           
    }
    
    //Close the buffer reader
    bufferReader.close();
    exists = parts.contains(name);
           System.out.println(exists);
           indexName=parts.indexOf(name);
           confirmPassword= password.equals(parts.get(indexName+1));
           return confirmPassword;
    }catch(IOException e){
            System.out.println("Error while reading file line by line:" 
            + e.getMessage());                      
    }
return exists;
    }
  }