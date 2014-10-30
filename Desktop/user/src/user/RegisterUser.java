/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author new
 */
public class RegisterUser {
    
     public static boolean register(String username,String password){
    try
{
    String filename= "c:\\user.txt";
    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
  
    fw.write("\r\n"+username+" "+ password);//appends the string to the file
    fw.close();
    return true;
}
catch(IOException ioe)
{
    System.err.println("IOException: " + ioe.getMessage());
    return false;
}
}
}