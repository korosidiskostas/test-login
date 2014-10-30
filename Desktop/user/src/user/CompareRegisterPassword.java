/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user;

/**
 *
 * @author new
 */
public  class CompareRegisterPassword {
    public static boolean compare(String passA,String passB){
       boolean compare;
        compare = passA.equals(passB);
        return compare;
    }
    
}
