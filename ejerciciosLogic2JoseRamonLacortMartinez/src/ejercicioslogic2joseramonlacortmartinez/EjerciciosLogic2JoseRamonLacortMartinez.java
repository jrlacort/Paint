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
    else if (you >=8 || date>=8){
    return 2;
    }
    else{ 
    return 1;
    }
}

  
  
  
  /*1 usamos el if para que si la temperatura este entre 60 y 90 de verdadero.
    2 Usamos otra vez if para decir que si es verano y la temperatura esta entre
    60 y 100 de verdadero.
    3 Si no ocurre ninguno de estos casos devulve false
  
  */
  public boolean squirrelPlay(int temp, boolean isSummer) {
     if(temp>= 60 && temp<= 90){
        return true;
     }
     if (isSummer && temp>= 60 && temp<=100){
        return true;
     }
     else {
        return false;
     }
}
  
  
  /*
  1 Usamos los if para que los dias que sea tu cumpleaños,
  si la velocidad es igual o menor que 65 devulve 0
  si es entre 65 y 85 devuelve 1 y si es igual o mayor de 86 da 2
  2 Ahora usamos los if para cuando no es cumpleaños
  si la velocidad es igual o menor de 60 da 0
  si la velocidad esta entre 60 y 80 da 1
  3 Si no ocurre esto usando else retornamos 2
  */
  
public int caughtSpeeding(int speed, boolean isBirthday) {
   if ( speed <= 65 && isBirthday){
   return 0;
   }
  if ( speed > 65 && speed <= 85 && isBirthday == true ){
   return 1;
   }
  if ( speed >= 86 && isBirthday){
   return 2;
   }

   if ( speed <= 60 ){
   return 0;
   }
  if ( speed > 60 && speed <= 80 ){
   return 1;
   }

  else
   return 2;
   
} 
  
 /* Instamos una nueva int llamada z, que es igual a la suma de a + b.
    Usando if decimos que si z es igual a un resultado ente 10 y 19 retorne 20.
    Si no ocurre esto, que retorne z

*/
 public int sortaSum(int a, int b) {
    int z;
    z = a + b;
    if(z>=10 && z<=19){
        return 20;
    }
    else{
    return z;
    }
}

 
 /*1.Usamos un primer if y decimos que si es vacaciones y es dia de diario retorne 10:00
   2. Otro if para que si es vaciones y es fin de semana nos devuelva off.
   3. El ultimo if lo usamos para que si no es vacaciones y es dia de diario 
    devulva 7:00.
 4. Por ultimo si no ocurre estios casos que que devuelva 10:00
 
 */
 
public String alarmClock(int day, boolean vacation) {
  if (vacation && day == 1 || vacation  && day == 2 || vacation && day == 3 || vacation  && day == 4|| vacation  && day == 5 ){
    return "10:00";
  }
  if (vacation && day==0 || vacation  && day == 6){
    return "off";
  }
  if ( day == 1 ||   day == 2 ||   day == 3 ||   day == 4||  day == 5){
     return "7:00";
  }
  else{
    return "10:00";
  }
 
}


/*
1.Creamos 2 int una llamada suma(suma de a y b) y otra resta (resta de a y b).
2.Con un primer if hacemos que si a o b son igual a 6 nos devuelva true.
3. Usamos otro if para que la suma si es 6 devuelva true.
4. Con el ultimo if Hacemos que si la resta sea 6, aunque utilizamos tambien 
Math.abs(para dar el valor absoluto), nos devuelva true.
5 Si no ocurre nada de los anteriores casos con else nos devuelve false.
*/

public boolean love6(int a, int b) {
    int suma = a + b;
    int resta = a - b;
    if( a == 6 || b == 6){
         return true;
    }
    if (suma == 6){
        return true;
    }
    if (Math.abs(resta) == 6){
        return true;
    }
    else{
        return false;
    }
}


/*
1. Usamos um if para que si outsideMode es falso y n esta entre 1 y 10 incluyendolos 
retorne true.
2. Con otro if si otsideMode es verdadero y n es igual o inferior a 1 o igual o 
superior a 10 retorne true.
3. Si no pasa nada de esto con eslse retorna false.
*/
  
public boolean in1To10(int n, boolean outsideMode) {

    if(outsideMode == false && n>= 1 && n<= 10){
        return true;
    }
    if(outsideMode && n<=1 || outsideMode && n>=10 ){
        return true;
    }
    else{
        return false;
    }

  
}

/*
1.Nos dan el operador % que sirve para saber el resto que nos da.
2. Con if y % sabemos que si un numero dividido entre 11 da de resto 0 es multiplo 
y nos tiene que retornar verdadero.
3. Con otro if hacemos lo mismo que en el anterior pero esta vez de resultado da 
1 el resto y nos tiene que devolver true
4. Si no ocurre esto tiene que devolver false con else
*/
  
public boolean specialEleven(int n) {
   if (n % 11== 0){
        return true;
   }
   if (n % 11 == 1){
        return true;
   }
   else{
        return false;
   }
}



/*
Usamos otra vez el operador %
1 Con if y usando % g¡hacemos que si el resto al dividir n entre 20 da 1 retorne 
true.
2. Hacemos lo mismo que en el paso anterior pero esta vez tiene que dar 2 y nos
volvera a retornar true.
3. Si no ocurre nada de lo anterior con else retorna false.
*/
  public boolean more20(int n) {
    if( n % 20 == 1){
        return true;
    }
    if (n % 20 == 2){
        return true;
    }
    else{
        return false;
    }
}

  
  
  /*
  Usamos el operador % otra vez.
  1. Usamos if y el operador % para que si n es  multiplo de 3 o 5 nos retorne 
  false.
  2. Si en vez de esto n solo es multiplo de uno de los dos nos retorna true.
  3. Si no ocurre ningun caso anterior devuelve falso.
  */
  
  public boolean old35(int n) {
    if(n % 3 == 0 && n % 5 == 0){
        return false;
    }
    else
        if(n % 3 == 0 || n % 5 == 0){
            return true;
        }
   
    else{
            return false;
}
}

  /*
  Usamos el operador %.
  1. Usando if y % hacemos que si n al dividirlo entre 20 da 19 (ya que es el 
  resto que nos daria si fuera un numero inferior a 20) retorne true 
  2 Hacemos lo mismo que antes pero esta vez si es igual a 18(el resto que nos 
  daria si fuese 2 numeros menor) y nos retorna true.
  3 Si no ocurre ninguno de estos dos casos con else retorna false.
  */
  
  public boolean less20(int n) {
    if (n % 20 == 19){
        return true;
    }
    if (n % 20 == 18){
        return true;
    }
    else{
        return false;
    }
  }

  
  
  
  /*
  Usamos el operador %
  1 Usando el if si el resto de dividir de num entre 10 da 2 o menos retorna true
  2 Con otro if si el numero es una o cifras que un multiplo de 10 retorna true
  3 Si no ocurre ninguno de estos casos retorna false
  */
  public boolean nearTen(int num) {
    if (num % 10 <= 2){
        return true;
    }
    if (num % 10 == 9 || num % 10 == 8){
        return true;
    }
    else{
        return false;
    }
  }
  
/*
  1 Creamos un int llamado "suma" que es la suma de a y b.
  2 Con if si a esta entre 13 y 19 incluyendolos nos retorna 19.
  3 Con otro if si b esta entre 13 y 19 incluyendolos como antes volvemos a retornar 19
  4 Si no ocurre ninguno de estos casos retorna suma
  
  */  
 public int teenSum(int a, int b) {
    int suma = a + b;
    if (a >= 13 && a <=19){
        return 19;
    }
    if (b >= 13 && b <= 19){
        return 19;
    }
    else{
        return suma;
    }
} 
  
  
 /*
 1 Si isAsleep es true, nos retorna false.
 2 Si isMorning y isMom es true, retorna true.
 3 Si isMorning es true, retorna false.
 4 Si no ocurren estos casos retorna true.
 */
 
 public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if(isAsleep){
        return false;
    }
    if (isMorning && isMom){
        return true;
    }
    if (isMorning){
        return false;
    }
    else{
        return true;
    }
}

 
 
 /*
 1.Si tea es menor 5 o candy es menor 5 retorna 0
 2. Si tea es mayor o igual al doble de candy y viceversa retorna 2.
 3. Si no aparece ninguno de estos casos retorna 1;
 */
 public int teaParty(int tea, int candy) {
  if (tea <5 || candy < 5){
    return 0;
  }
  if(tea >= candy*2 || candy >= tea*2){
    return 2;
  } 
  else{
    return 1;
  }
}
  
 
 /*
 1. Si el string empieza por f y termina con b retorna FizzBuzz.
 2.Si el string empieza por f solo retorna Fizz.
 3.Si el string termina en b retorna Buzz.
 4. Si no ocurre ninguno de estos casos retorna el string tal y como esta.
 */
 public String fizzString(String str) {
  if(str.startsWith("f") && str.endsWith("b")){
    return "FizzBuzz";
  }
  if(str.startsWith("f")){
    return "Fizz";
  }
  if(str.endsWith("b")){
    return "Buzz";
  }
  else{
    return str;
  }
}

 
 /*
 1. Si el n es multiplo de 3 y 5 retorna FizzBuzz!.
 2. Si n es solo multiplo de 3 retorna Fizz!.
 3. Si n es solo multiplo de 5 retorna Buzz!.
 4. Si ninguno de los casos anteriors se cumple retorna n + !
 */
 public String fizzString2(int n) {

  if (n % 3 == 0 && n % 5 == 0){
    return "FizzBuzz!";
  }
  if(n % 3 == 0){
    return "Fizz!";
  }
  if(n % 5 == 0){
    return "Buzz!";
  }
  else{
    return n + "!";
  }
}

 
 /*
 1.Si la suma de a y b es igual a c retorna true.
 2.Si la suma de a y c es igual a b retorna true.
 3.Si la suma de b y c es igual a a retorna true.
 4.Si ninguno de los casos anteriores se cumplen retorna false.
 */
 public boolean twoAsOne(int a, int b, int c) {
  if(a + b == c){
    return true;
  }
  if(a + c == b){
    return true;
  }
  if(b + c == a){
    return true;
  }
  else{
    return false;
  }
}
 
 /*
 1.Si b es mayor que a, c es mayor que b y bOk es falso retorna true.
 2. Si bOk es verdadero y c es mayor que b retorna true.
 3. Si no ocurre ningun caso anterior retorna false.
 */
 public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (b > a && c > b){
    return true;
  }
  if (bOk && c > b){
    return true;
  }
  else{
    return false;
  }
}
 
 /*
 1.Si a es menor que b, a su vez b es menor que c y equalOk es false, retorna true.
 2.Si equalOk es true, a es menor o igual a b y b es menor o igual a c retorna true.
 3. Si no se cumplen estos casos retorna false.
 */
 public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(a < b && b < c){
    return true;
  }
  if(equalOk && a<= b && b <= c){
    return true;
  }
  else{
    return false;
  }
}
 
 /*
 1.Realizamos tres int uno para cada int y seran igual cada uno al resto de ese
 int al dividirlo de 10, lo que seria igual al digito de la derecha de cada int.
 2.Si el ultimo digito de a es igual de b o el de a igual al de c o el de b 
 igual al de c, retorna true.
 3. Si ninguno de estos casos ocurre retorna false.
 */
 
 public boolean lastDigit(int a, int b, int c) {
  int restoA = a % 10;
  int restoB = b % 10; 
  int restoC = c % 10;
  if (restoA == restoB || restoA == restoC || restoB == restoC){
    return true;
  }
  else{
    return false;
  }
}

 
 /*
 1. Hacemos 3 int que sean igual cada una y respectivamente, al valor absoluto de 
 la resta a y b, al valor absoluto de la resta a y c  y el valor absoluto de la 
 resta de b y c.
 2. Con un if, si alguno de los int puestos son mayor o igual a 10, return true.
 3. Si no ocurre ninguno de estos casos return false.
 */
 public boolean lessBy10(int a, int b, int c) {
  int absolutoAB = Math.abs (a - b);
  int absolutoAC = Math.abs (a - c);
  int absolutoBC = Math.abs (b - c);
  
  if (absolutoAB >= 10 || absolutoAC >= 10 || absolutoBC >= 10){
    return true;
  }
  else{
    return false;
  }
   
}
 
 
 
 
 
 
 
 
 /*
 1. Ponemos 2 int cada uno sera el resto que da a o b.
 2. Si a es igual b, retorna o.
 3. Si el resto de a es igual al de b y a es mayor b, retorna b.
 4. Si el resto de b es igual al de a y b es mayor a, retorna a.
 5. Si es b es mayor que a, retorna b.
 6. Si no ocurre estos casos retorna a.
 */
 public int maxMod5(int a, int b) {
  int restoA = a % 5;
  int restoB = b % 5;
  if(a == b){
    return 0;
  }
  if(restoA == restoB && a > b){
    return b;
  }
  if(restoB == restoA && b > a){
    return a;  
  }  
  if( a < b){
    return b;
  }
  else{
    return a;
  }

 }
 
 /*
 1. Usamos if si a es igual a 2, b igual a 2 y c igual a 2, retorna 10.
 2. Si a es igual b, a igual a c y b igual c; retorna 5.
 3. Si a es diferente de b y c, retorna 1.
 4. Si no ocurren estos casos retorna 0.
 */
 public int redTicket(int a, int b, int c) {
  if(a == 2 && b == 2 && c == 2){
    return 10;
  }
  if(a == b && a == c && b == c){
    return 5;
  }
  if(a != b && a != c){
    return 1;
  }
  else{
    return 0;
  }
}


 /*
 1. Si todos los int son diferentes entre si, retorna 0.
 2. Si todos los int son iguales entre si, retorna 20.
 3. Si no ocurre ninguno de los pasos anteriores retorna 10.
 */
 public int greenTicket(int a, int b, int c) {
  if(a != b && a != c && b != c){
    return 0;
  }
  if(a == b && a == c && b == c){
    return 20;
  }
  else{
    return 10;
  }
}
 
 
 
 /*
 1. Ponemos 3 int, uno para la suma a y b, otro para la suma b y c y el ultimo
 para la suma de a y c.
 2. Si cualquiera de las sumas es 10 retorna 10.
 3. Si la suma ab es 10 veces o mas superior a las otras 2 sumas retorna 5.
 4. Si no ocurren estos casos retorna 0.
 */
 public int blueTicket(int a, int b, int c) {
 int ab = a + b;
 int bc = b + c;
 int ac = a + c;
 if(ab == 10 || bc == 10 || ac == 10){
    return 10;
 }
 if(ab >= 10 + bc || ab >= 10 + ac ){
    return 5;
 }
 else{
    return 0;
 }
}

 /*
 1. Si el primer digito de a coincide con el segundo de b o el segundo de a con 
 el primero de b, retorna true.
 2. Si el primer digito de a coincide con el primero de b o el segundo de a con
 el segundo de b, retorna true.
 3. Si no ocurre ninguno de estos casos retorna false.
 */
 public boolean shareDigit(int a, int b) {
  if(a / 10 == b % 10 || a % 10 == b / 10){
    return true;
  }
  if(a / 10 == b / 10 || a % 10 == b % 10){
    return true;
  }
  else{
    return false;
  }
}
 
 
 /*
 1. Declaramos un int(suma de a y b), un string (el string de la suma) y otro 
 string ( del int a).
 2. Si la longitud de los digitos del string a es distinto al string suma 
 retorna a.
 3. Si no ocurre el caso anterior, retorna el int suma.
 */
 public int sumLimit(int a, int b) {
  int suma = a + b;
  String strSuma = String.valueOf (suma);
  String strA = String.valueOf (a);
  if(strA.length () != strSuma.length ()){
    return a;
  }
  else{
    return suma;
  }
}
 
 
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
