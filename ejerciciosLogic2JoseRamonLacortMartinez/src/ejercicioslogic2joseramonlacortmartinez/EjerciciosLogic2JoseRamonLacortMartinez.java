/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslogic2joseramonlacortmartinez;

/**
 *
 * @author Admin
 */
public class EjerciciosLogic2JoseRamonLacortMartinez {

  /*Tenemos que hacer que nos devuelva true si, hay entre 40 o 60 cigarros o si
    es finde semana de 40 cigarros o mas para ello usaremos lo siguiente:
    1. Usamos if y ponemos el int cigars para que si se encuentra entre 40 0 60
     nos devuelva true
    2. Usamos otro if para que si es finde semana y cigars sea superior o igual a
    40 nos devuelva true
    3. Por ultimo si no cumple ninguno de estos dos casos nos devuelve falso
    */
  public boolean cigarParty(int cigars, boolean isWeekend) {
    if ( cigars >= 40 && cigars <=60  ){
        return true;
        }
    if ( isWeekend && cigars >= 40 ){
        return true;
        }
    else{
        return false;
        }
    }
  
  
  
  /*
  1. Con if hacemos que si nosotros y nuestra pareja tenemos un 2 o menos de
  estilo nos devuelva 0
  2. Otra vez con if si nuestro estilo es 8 o mas nos devulva 2 
  3. Si no ocurre ninguno de estos casos que devuelva 1
  */
  public int dateFashion(int you, int date) {

    if(you<= 2 || date<= 2){
        return 0;
    }
    else if (you>=8 || date>=8){
    return 2;
    }
    else{ 
    return 1;
    }
}

  
  
  
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
