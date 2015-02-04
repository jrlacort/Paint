/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author Javier Fernandez-Trapa
 */
public class SameStarCharJavierFernandez {
    public boolean sameStarChar(String str) {
        boolean aux=false;
        if(str.length()>=3){
            for (int i=0;i<str.length();i++){
                
                if (str.charAt(i)=='*' && i>0 && i<str.length()-1){
                    if(str.charAt(i-1)==str.charAt(i+1)){
                        aux=true;
                        
                    }else{
                        aux=false;
                    }
                }
            }
        }else{
            aux=true;
        }
        if(!str.contains("*")){
            aux=true;
        }
        return aux;
    }
}
