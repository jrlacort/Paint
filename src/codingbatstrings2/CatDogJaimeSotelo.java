/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author xp
 */
public class CatDogJaimeSotelo {
    public boolean catDog (String str) {
    int count = 0;
  for (int i=0; i<str.length(); i++) {
    if (str.charAt(i) == 'e') count++;
     }
  if (count == 2){
   return true;
   }
  return false;
}
  

}
