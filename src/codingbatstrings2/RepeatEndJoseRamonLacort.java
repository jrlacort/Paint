/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatstrings2;

/**
 *
 * @author Admin
 */
public class RepeatEndJoseRamonLacort {
public String repeatEnd(String str, int n) {
String ultimo;
String resultado = "";
 
ultimo = str.substring(str.length() - n, str.length());
 
for(int i = 0; i < n; i++) {
resultado += ultimo;
}
return resultado;
}

}
