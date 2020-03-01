import java.util.Scanner;

/**
* Esta clase realiza operaciones basicas en java, esto incluye numeros reales, cadenas y arreglos. <br>
*@author : Jhon Suescun Paz
*@version : 29/02/2020/A
*/

public class JavaOperations{

static int[] array1, array2, array3, A, B, C, unionR;
static Scanner sc;
static int choice1, choice2, globalSize;
static double num1, num2;
static String word1, word2, word3, continue1;
static boolean menu0, menu1, menu2, menu3;

public static void inicializar(){
	choice1= 0;
	choice2 = 0;
	num1 = 0;
	num2 = 0;
	word1 = "";
	word2 = "";
	word3 = "";
	continue1 = "";
	menu0 = true;
	menu1 = true;
	menu2 = true;
	menu3 = true;
	C = new int[214748363];
	sc = new Scanner(System.in);
}

/**
*metodo que muestra el menu principal.<br>
* <b>pre: </b> no se digitara un numero negativo o mayor que 3<br>
* <b>post: </b> se abrira un sub-menu que corresponde al valor digitado <br>
*/
public static void menu0(){
	
	while(menu0){
		System.out.print("  ________________________\n |                        |\n |   >>MENU PRINCIPAL<<   |\n | 1. cadenas             |\n | 2. numeros             |\n | 3. arreglos            |\n | 4. salir               |\n |________________________|\n");
		System.out.println("\n >> ingrese un numero de 1 a 3: "); 
		choice1 = sc.nextInt();
		sc.nextLine();
	
	
		switch (choice1){
			case 1:
				inWords();
				menu1 = true;
				menu1();
			break;
		
			case 2:
				inNumbers();
				menu2 = true;
				menu2();
			break;
		
			case 3:
				inArrays();
				menu3 = true;
				menu3();
			break;
		
			case 4:
				System.out.print(" >> Fin de la ejecucion");
				menu0 = false;
			break;
		}	
	}
}

/**
* metodo que muestra el sub-menu de las operaciones con cadenas de texto. <br>
* <b>pre: </b> no se digitara un numero negativo ni mayor a 5 <br>
* <b>post: </b> se realiza la operacion digitada<br>
*/
public static void menu1(){
	
	while(menu1){
		System.out.print("  _______________________________\n |                               |\n |        >>MENU CADENAS<<       |\n |                               |\n | 1. digitar nuevamente tres    |\n | cadenas                       |\n |                               |\n | 2. Desplegar la longitud de   |\n | cada una de las cadenas       |\n |                               |\n | 3. Concatenar las tres        |\n | cadenas y mostrar en pantalla |\n |                               |\n | 4. Mostrar en pantalla el     |\n | caracter ubicado en una       |\n | posicion de la cadena         |\n |                               |\n | 5. volver al menu principal   |\n |_______________________________|\n");
		System.out.print("\n >> ingrese un numero de 1 a 5: "); 
		choice1 = sc.nextInt();
		sc.nextLine();
		
		switch (choice1){
			case 1:
				inWords();
			break;
		
			case 2:
				longCadena();
				pressEnterToContinue();
			break;
			
			case 3:
				showWords();
				pressEnterToContinue();
			break;
		
			case 4:
				letterOfEachChain();
				pressEnterToContinue();
			break;
		
			case 5:
				menu1 = false;
			break;
		}
	}	
}

/**
* metodo que muestra el sub-menu de las opercaiones con numeros reales. <br>
* <b>pre: </b> no se digitara un numero negativo o mayor a 4 <br>
* <b>post: </b> se realizara la funcion segun el numero digitado <br>
*/
public static void menu2(){
	
	while(menu2){
		System.out.print("  _______________________________\n |                               |\n |        >>MENU NUMEROS<<       |\n |                               |\n | 1. ingresar dos nuevos        |\n | numeros                       |\n |                               |\n | 2. Mostrar la division  de    |\n | ambos numeros                 |\n |                               |\n | 3. Mostrar la division y el   |\n | residuo de la parte entera    |\n | de ambos numeros              |\n |                               |\n | 4. salir al menu principal    |\n |_______________________________|");
		System.out.print("\n\n >> ingrese un numero de 1 a 4: "); 
		choice1 = sc.nextInt();
		sc.nextLine();
		switch (choice1){
			case 1:
				inNumbers();
			break;
			
			case 2:
				division();
				pressEnterToContinue();
			break;
		
			case 3:
				division2();
				pressEnterToContinue();
			break;
			
			case 4:
				menu2 = false;
			break;
		}
	}


}

/**
* metodo que muestra el sub-menu de las operaciones con arreglos. <br>
* <b>pre: </b> no se digitara un numero negativo ni mayor a 9 <br>
* <b>post: </b> se realizara la funcion segun el numero digitado <br>
*/ 
public static void menu3(){
	
	while(menu3){
		System.out.print("\n  ____________________________________\n |                                    |\n |         >>MENU ARREGLOS<<          |\n |                                    |\n | 1. ingresar tres nuevos arreglos   |\n |                                    |\n | 2. Desplegar en pantalla los tres  |\n | arreglos ingresados.               |\n |                                    |\n | 3. Promedio de los valores         |\n | ingresados al arreglo.             |\n |                                    |\n | 4. mayor valor de los valores      |\n | ingresados al arreglo              |\n |                                    |\n | 5. Generar un nuevo arreglo        |\n | (suma, resta o multiplicacion)     |\n |                                    |\n | 6. Generar un nuevo arreglo con    |\n | la union de los tres arreglos      |\n | (con elementos repetidos)          |\n |                                    |\n | 7. Generar un nuevo arreglo con    |\n | la union de los tres arreglos      |\n | (sin elementos repetidos)          |\n |                                    |\n | 8. Generar un nuevo arreglo con la |\n | intercepcion de los tres arreglos  |\n |                                    |\n | 9. Girar los valores de un arreglo |\n |                                    |\n | 10. Ordene de menor a mayor los    |\n | valores del arreglo                |\n |                                    |\n | 11. salir al menu principal        |\n |____________________________________|\n");
		System.out.print("\n\n >> ingrese un numero de 1 a 9: "); 
		choice1 = sc.nextInt();
		switch(choice1){
			case 1:
				inArrays();
			break;
			
			case 2:
				for(int i = 1 ; i<=3 ; i++){
					switch(i){
						case 1:
							C = array1;
							globalSize = array1.length;
							System.out.print("\n\n   ARRAY 1");
							showArrays();
						break;
					
						case 2:
							C = array2;
							globalSize = array2.length;
							System.out.print("\n\n   ARRAY 2");
							showArrays();
						
						break;
					
						case 3:
							C = array3;
							globalSize = array3.length;
							System.out.print("\n\n   ARRAY 3");
							showArrays();
						break;
					}
				}
				pressEnterToContinue();
			break;
		
			case 3:
				averageArray();
				pressEnterToContinue();
			break;
		
			case 4:
				biggerNum();
				pressEnterToContinue();
			break;
		
			case 5:
				operationArray();
				pressEnterToContinue();
			break;
		
			case 6:
				noRepeatArray();
				System.out.print("\n >> El nuevo arreglo union con repeticion es:");
				C = unionR;
				globalSize = unionR.length;
				showArrays();
				pressEnterToContinue();
			break;
		
			case 7:
				noRepeatArray();
				pressEnterToContinue();
			break;
		
			case 8:
				intersectionArray();
				pressEnterToContinue();
			break;
		
			case 9:
				moveArray();
				pressEnterToContinue();
			break;
		
			case 10:
				burbuja();
				pressEnterToContinue();
			break;
			
			case 11:
				menu3 = false;
			break;
		}
	}	
}

/**
* metodo que recoge las cadenas de texto que se usaran para operar. <br>
* <b>pre: </b> <br>
* <b>post: </b> se crean tres nuevos strings <br>
*/ 
public static void inWords(){	
	
	System.out.println(" >> ingrese tres cadenas");
	for(int i=1 ; i<=3 ; i++){
		System.out.print("  > cadena "+i+" : ");
		switch (i){
			case 1:
			word1 = sc.nextLine();
			break;
			
			case 2:
			word2 = sc.nextLine();
			break;
			
			case 3:
			word3 = sc.nextLine();
			break;
		}
	}
}

/**
* metodo que muetra el tamaño de las cadenas recogidas.<br>
* <b>pre: </b> <br>
* <b>post: </b> muestra el tamaño de cada una de las cadenas <br>
*/
public static void longCadena(){
	System.out.println(" >> Las longitudes de las cadenas son: ");
	for(int i = 1 ; i<=3 ; i++){
		System.out.print("  > longitud cadena "+i+" : ");
		switch (i){
			case 1:
				System.out.println(""+word1.length());
			break;
			
			case 2:
				System.out.println(""+word2.length());
			break;
			
			case 3:
				System.out.println(""+word3.length());
			break;
			
		}
	}
}

/**
* metodo que muestra las concatenacion de las cadenas recogidas. <br>
* <b>pre: </b> <br>
* <b>post: </b> muestra las palabras digitadas anteriormente concatenadas <br>
*/
public static void showWords(){
	System.out.println(" >> las cadenas concatenadas son:\n  > "+word1+" "+word2+" "+word3+" <");
}

/**
*metodo que muestra una letra de cada una de las cadenas segun la desicion del usuario. <br>
* <b>pre: </b> no se escogera un numero negativo <br>
* <b>post: </b> se obtiene el caracter de cada arreglos <br>
*/
public static void letterOfEachChain(){
	System.out.print("\n  >> ingrese la posicion del caracter que quiere saber de cada una de las cadenas: ");
	choice1 = sc.nextInt();
	sc.nextLine();
	if (choice1 <= word1.length() && choice1 <= word2.length() && choice1 <= word3.length()){
		for(int i=1 ; i<=3 ; i++){
		System.out.print("  > el caracter elegido de la cadena "+i+" es : ");
		
			switch(i){
				case 1:
					System.out.println(""+word1.substring((choice1-1),choice1));
				break;
		
				case 2:
					System.out.println(""+word2.substring((choice1-1),choice1));
				break;
			
				case 3:
					System.out.println(""+word3.substring((choice1-1),choice1));
				break;
			}	
		}
		
	}
	else
		System.out.println("\n  >>ERROR: el numero escogido es mas grande que alguna de las cadenas<<");
}

/**
* metodo que solicita 2 numeros reales al usuario, para ser usados en operaciones. <br>
* <b>pre: </b> los numeros digitados deben ser mayores a 0 <br>
* <b>post: </b> se guardaran numeros que posteiormente seran usados <br>
*/
public static void inNumbers(){
	System.out.println("\n >> ingrese dos numeros reales mayores a 0: ");
	
	System.out.print("  > digite el primer numero: ");
	num1 = sc.nextDouble();
	while(num1<1){
		System.out.print("\n>> ERROR: digite un numero mayor a 0\n  > digite el primer numero: ");
		num1 = sc.nextDouble();	
	}

	System.out.print("  > digite el segundo numero: ");
	num2 = sc.nextDouble();
	while(num2<1){
		System.out.print("\n >> ERROR: digite un numero mayor a 0\n  > digite el segundo numero: ");
		num2 = sc.nextDouble();	
	}
		
		
}

/**
* metodo que muestra la divion ambos numeros digitados.<br>
* <b>pre: </b> <br>
* <b>post: </b> muestra la division de ambos numeros reales digitados<br>
*/
public static void division(){
	double resultado1,resultado2;
	
	resultado1 = num1/num2;
	resultado2 = num2/num1;
	
	System.out.println("\n >> la division de los numeros insertados\n  > cuando "+num1+"/"+num2+" es: "+resultado1+"\n  > cuando "+num2+"/"+num1+" es: "+resultado2);
}

/**
* metodo que muestra la parte entera y el residuo de la diviosn de ambos numeros digitados.<br>
* <b>pre: </b> <br>
* <b>post: </b> muestra la parte entera y el residuo de la division de ambos numeros anteriormente digitados <br>
*/
public static void division2(){
	double num3;
	int int1,int2,res1,res2;
	
	num3 = num1/num2;
	int1 = (int)num3;
	num3 = num2/num1;
	int2 = (int)num3;
	num3 = num1%num2;
	res1 = (int)num3;
	num3 = num2%num1;
	res2 = (int)num3;
	
	System.out.println("\n >> la division de los numeros insertados\n  > cuando "+num1+"/"+num2+" es: \n   - parte entera: "+int1+"\n   - residuo: "+res1+"\n\n  > cuando "+num2+"/"+num1+" es: \n   - parte entera: "+int1+"\n   - residuo: "+res2);
}

/**
* metodo que recoge 3 arreglos que seran usados en operaciones.
* <b>pre: </b> el tamaño del arreglo no puede ser menor a 0 o mayor a 10^9, ademas solo se pueden usar numeros enteros <br>
* <b>post: </b> se crean tres nuevos arreglos con los datos ingresados por el usuario <br>
*/
public static void inArrays(){
	int tam=0 ;
	for(int i=1 ; i<=3 ; i++){
		System.out.print("\n >> ingrese el tamaño del arreglo "+i+" : ");
		tam = sc.nextInt();
		sc.nextLine();
		System.out.print(" >> ingrese los valores del arreglo "+i+", use espacio para separa entre valores: ");
		switch(i){
			case 1:
				array1 = new int[tam];
				for(int j=0 ; j<tam ; j++){
					array1[j] = sc.nextInt();
					
				}
			break;
			
			case 2:
				array2 = new int[tam];
				for(int j=0 ; j<tam ; j++){
					array2[j] = sc.nextInt();
					
				}
			break;
			
			case 3:
				array3 = new int[tam];
				for(int j=0 ; j<tam ; j++){
					array3[j] = sc.nextInt();
					
				}
			break;
		}
		
	}
	
}//integrer.toString(int)

/**
* metodo que desplega en pantalla los arreglos digitados por el usuario.<br>
* <b>pre: </b> <br>
* <b>post: </b> muestra los arrglos anteriormente digitados en pantalla <br>
*/
public static void showArrays(){
	String word, string1;
	
	word = "";
	string1 = "";
	
	for(int i = 0 ; i<globalSize ; i++){
		word = Integer.toString(C[i]);
		string1 += ("| " + word + " ");
	}
	word = "";
	
	for(int j = 0 ; j<=string1.length(); j++)
		word +="-";
	System.out.print("\n   "+word);
	System.out.print("\n   " + string1 + "|\n   ");
	System.out.print(word);
}

/**
* metodo que muestra el promedio de un arreglo, este es escogido por el usuario. <br>
* <b>pre: </b> el arreglo escogido debe ser un numero positivo y menor o igual a 3, ademas este numero debe ser entero <br>
* <b>post: </b> se devuelve el promedio de arreglo escogido <br>
*/
public static void averageArray(){
	double average, suma;
	suma = 0.0;
	average = 0.0;
	System.out.print("\n >> digite a cual arreglo le desea encontrar su promedio: ");
	choice1 = sc.nextInt();
	switch(choice1){
		case 1:
			for(int i=0 ; i<array1.length ; i++)
				suma += array1[i];
			
			average = suma/array1.length;
			System.out.print("  > el promedio del arreglo 1 es: "+average);
			
		break;
		
		case 2:
			for(int i=0 ; i<array2.length ; i++)
				suma += array2[i];
		
			average = suma/array2.length;
			System.out.print(  "> el promedio del arreglo 2 es: "+average);
		break;
		
		case 3:
			for(int i=0 ; i<array3.length ; i++)
				suma += array3[i];
			
			average = suma/array3.length;
			System.out.print(  "> el promedio del arreglo 3 es: "+average);
		break;
	}
}

/**
* metodo que muestra el mayor valor de los valores en un arreglo, este es escogido por el usuario.<br>
* <b>pre: </b> el arreglo escogido debe ser un numero positivo y menor o igual a 3, ademas este numero debe ser entero <br>
* <b>post: </b> se devuelve el mayor valor, segun el arreglos escogido <br>
*/
public static void biggerNum(){
	int bigger;
	
	System.out.print("\n >> digite a cual arreglo le desea encontrar su numero mayor: ");
	choice1 = sc.nextInt();
	
	switch (choice1){
		case 1:
			bigger = array1[0];
			for(int i = 0 ; i<array1.length ; i++){
				if(array1[i]>bigger)
					bigger = array1[i];
			}
			System.out.print("  > el numero mayor del arreglo 1 es: "+bigger);
		break;
		
		case 2:
			bigger = array2[0];
			for(int i = 0 ; i<array2.length ; i++){
				if(array2[i]>bigger)
					bigger = array2[i];
			}
			System.out.print("  > el numero mayor del arreglo 2 es: "+bigger);
		break;
		
		case 3:
		bigger = array3[0];
			for(int i = 0 ; i<array3.length ; i++){
				if(array3[i]>bigger)
					bigger = array3[i];
			}
			System.out.print("  > el numero mayor del arreglo 3 es: "+bigger);
		break; 	
	}
}


/**
* metodo que suma, resta o multiplica dos de los arreglos digitados por el usuario.<br>
* <b>pre: </b> el valor digitado debe ser entero, positivo y menor o igual a 3 <br>
* <b>post: </b> se realiza la operacion segun el valor escogido <br>
*/
public static void operationArray(){
	boolean identify = true;
	int operation ;
	operation = 0;
	
	
	while (identify){
		System.out.print("\n >> digite la operacion con la que desea formar el nuevo arreglo:\n  (1) suma\n  (2) resta\n  (3) multiplicacion\n\n >> digite un valor de 1 a 3: ");
		operation = sc.nextInt();
		
		if (operation>3 || operation<1)
			System.out.print("ERROR: digite nuevamente la operacion");
		else
			identify = false;
	}
	
	chooseArray();
	
	
	switch (operation){
		case 1:
			additionArray();
		break;
		
		case 2:
			subtractionArray();
		break;
		
		case 3:
			multiplyArrays();
		break;
	}
}

/**
* metodo que solicita cuales seran los 2 metodos que usara en las operaciones. <br>
* <b>pre: </b> el valor digitado debe ser positivo, entero y menor o igual a 3 <br>
* <b>post: </b> se escogeran los dos arreglos usados para las operaciones aritmeticas <br>
*/
public static void chooseArray(){
	boolean identify = true;
	boolean allIdentify = true;
	int tam1, tam2;
	
	tam1 = 0;
	tam2 = 0;


	while(allIdentify){
		while (identify){
			System.out.print(" >> digite el primer arreglo que desea usar: ");
			choice1 = sc.nextInt();
			if(choice1<=3 && choice1>=1)
				identify = false;
			else
				System.out.print("\n >> ERROR: digite un valor entre 1 y 3\n");
		}
	
		while (identify == false){
			System.out.print(" >> digite el segundo arreglo que desea usar: ");
			choice2 = sc.nextInt();
			if(choice2<=3 && choice2>=1)
				identify = true;			
		}
		
		switch(choice1){
			case 1:
				tam1 = array1.length;
			break;
		
			case 2:
				tam1 = array2.length;
			break;
		
			case 3:
				tam1 = array3.length;
			break;
		}
		
		switch(choice2){
			case 1:
				tam2 = array1.length;
			break;
			
			case 2:
				tam2 = array2.length;
			break;
			
			case 3:
				tam2 = array3.length;
			break;
		}
		
		A = new int[tam1];
		B = new int[tam2];
	
		
		if(A.length != B.length){
			System.out.print("\n >> ERROR: los arreglos no tienen el mismo tamaño, digite nuevamente\n");
			allIdentify = true;
		}
		else 
			allIdentify = false;
	}
	
		switch(choice1){
			case 1:
				A = array1;
			break;
		
			case 2:
				A = array2;
			break;
		
			case 3:
				A = array3;
			break;
		}
		
		switch(choice2){
			case 1:
				B = array1;
			break;
			
			case 2:
				B = array2;
			break;
			
			case 3:
				B = array3;
			break;
		}
}

/**
* metodo que suma los dos arreglos escogidos por el usuario. <br>
* <b>pre: </b> <br>
* <b>post: </b> se crea un arreglo suma, con la suma de los valores de los arreglos escogidos <br>
*/
public static void additionArray(){
	int[] sum = new int[A.length];
	
	
	for(int i=0 ; i<A.length ; i++){
		sum[i] += A[i] + B[i];
 	}
	
	System.out.print("\n >> El nuevo arreglo suma es:");
	C = sum;
	globalSize = A.length;
	showArrays();
}

/**
* metodo que resta los arreglos escogidos por el usuario. <br>
* <b>pre: </b> <br>
* <b>post: </b> crea un arreglos resta, con los arreglos escogidos por el usuario <br>
*/
public static void subtractionArray(){
	
	int[] subtraction = new int[A.length];
	
	for(int i=0 ; i<A.length ; i++)
		subtraction[i] = A[i]-B[i]; 
	
	System.out.print("\n >> El nuevo arreglo resta es:");
	C = subtraction;
	globalSize = A.length;
	showArrays();
}

/**
* metodo que multiplica los arreglos escogidos por el usuario. <br>
* <b>pre: </b> <br>
* <b>post: </b> crea un arreglo multiplicacion, con los arreglos escogidos por el usuario <br>
*/
public static void multiplyArrays(){
	int[] multiply = new int[A.length];
	
	for(int i = 0 ; i<A.length ; i++)
		multiply[i] = A[i]*B[i];
	
	System.out.print("\n >> El nuevo arreglo multiplicacion es:");
	C = multiply;
	globalSize = A.length;
	showArrays();
	
	
}

/**
* metodo que genera un nuevo arreglo con la union de los valores de los tres arreglos digitados por el usuario, este contiene valores repetidos. <br>
* <b>pre: </b> <br>
* <b>post: </b> crea un arreglo, con la union de los valores de los tres primeros arreglos digitados <br>
*/
public static void repeatArray(){
	unionR = new int[array1.length + array2.length + array3.length];
	
	for(int i = 0 ; i<unionR.length ; i++){
		if(i<array1.length){
			unionR[i] = array1[i];
			
		} else if(i<array2.length + array1.length){
			unionR[i] = array2[i-array1.length];
			
		} else 
			unionR[i] = array3[i - array1.length - array2.length];
		
	}
}

/**
* metodo que genera un nuevo arreglo con la union de los valores de los tres arreglos digitados por el usuario, este NO contiene valores repetidos. <br>
* <b>pre: </b> <br>
* <b>post: </b> devuelve un arreglo con la union de los tres arreglos digitados primeramente, con elementos repetidos <br>
*/
public static void noRepeatArray(){
	int[] unionNR;
	int a=1;
	int cont = 0;
	repeatArray();
	C[0] = unionR[0];
	
	for(int i=1 ; i<unionR.length ; i++){
		for(int j=0 ; j<a ; j++){
			if(unionR[i] == C[j])
				cont++;
			
		}
		
		if(cont == 0){
			C[a]=unionR[i];
			a++;
		}
		cont = 0;
	}
	
	unionNR = new int[a];
	for(int i= 0 ; i<a ; i++)
		unionNR[i] = C[i];
	
	
	System.out.print("\n >> El nuevo arreglo union sin repeticion es:");
	C = unionNR;
	globalSize = unionNR.length;
	showArrays();
}

/**
* metodo que genera un nuevo arreglo con la interseccion de los valores de los tres arreglos digitados por el usuario. <br>
* <b>pre: </b> el valor del arreglo escogido debe ser positivo, entero y menor o igual a 3 <br>
* <b>post: </b> devuelve un arreglo con la union de los tres arreglos primeramente digitados, sin elementos repetidos <br>
*/
public static void intersectionArray(){
	String[] array1s =new String[array1.length];
	String[] array2s =new String[array2.length];
	String[] array3s =new String[array3.length];
	int[] array4;
	String[] arrayN =new String[214748363];
	
	int cont = 0;
	int a=0;
	
	for(int i=0 ; i<array1.length ; i++)
		array1s[i] = array1[i]+"";
		
	for(int i=0 ; i<array2.length ; i++)
		array2s[i] = array2[i]+"";
	
	for(int i=0 ; i<array3.length ; i++)
		array3s[i] = array3[i]+"";
	
	
	
	
	for(int i=0 ; i<array1s.length ; i++){
		for(int j=0 ; j<array2s.length ; j++){
			if(array1s[i].equals(array2s[j])){
				array2s[j] = " ";
				cont++;
				j=array2s.length;
			}
		}
		
		for(int j=0 ; j<array3s.length ; j++){
			if(array1s[i].equals(array3s[j])){
				array3s[j] = " ";
				cont++;
				j = array3s.length;
			}
		}
		
		if(cont == 2){
			arrayN[a] = array1s[i];
			a++;
		}
		cont = 0;
	}

	array4 = new int[a];
	for(int i = 0 ; i<a ; i++){
		array4[i] = Integer.parseInt(arrayN[i]);  
	}
	
	
	System.out.print("\n >> El nuevo arreglo interseccion es:");
	C = array4;
	globalSize = array4.length;
	showArrays();
	
}

/**
* metodo que gira los valores de un arreglo segun escoja el usuario, el arreglo que es girado es selecciona igualemnte por el usuario. <br>
* <b>pre: </b> <br>
* <b>post: </b> devuelve un nuevo arreglo con los elementos correspondientes a la interseccion de los tres primeros arreglos digitados <br>
*/
public static void moveArray(){
	int[] save;
	int i = 0;
	
	System.out.print("\n >> digite cual de los tres arreglos desea girar: ");
	choice1 = sc.nextInt();
	
	switch (choice1){
		case 1:
			C = array1;
			globalSize = array1.length;
		break;
		
		case 2:
			C = array2;
			globalSize = array2.length;
		break;
		
		case 3:
			C = array3;
			globalSize = array3.length;
		break;
	}
	
	save = new int[globalSize];
	System.out.print("\n >> digite cuantas veces desea girar el arreglo: ");
	choice2 = sc.nextInt();
	
	if(choice2 > globalSize){
		while(choice2>globalSize)
			choice2 -= globalSize;	
	}
	
	for( int x = globalSize - choice2 ; x<globalSize ; x++){
		save[i]= C[x];
		i++;
	}
		
	
	for(int x = globalSize - choice2 - 1 ; x>=0 ; x--)
		C[choice2 + x] = C[x];


	for(int x = 0; x<choice2 ; x++)
		C[x] = save[x];
	
	switch (choice1){
		case 1:
			array1 = C;
		break;
		
		case 2:
			array2 = C;
		break;
		
		case 3:
			array3 = C;
		break;
	}
	
	System.out.print("\n >> El nuevo arreglo "+choice1+" girado "+choice2+ " posiciones es:");
	showArrays();	
	
}

/**
* metodo que ordena un arreglo a traves del metodo llamado burbuja, el usuario decide cual arreglo sera ordenado. <br>
* <b>pre: </b> el valor del arreglo escogido deber ser un numero positivo, entero y menor o igual a 3 <br>
* <b>post: </b> devuelve el arreglo escogido en orden ascendente<br> 
*/
public static  void burbuja(){
	System.out.print("\n >> digite cual de los tres arreglos desea ordenar: ");
	choice1 = sc.nextInt();
	int save = 0;
	
	switch (choice1){
		case 1:
			C = array1;
			globalSize = array1.length;
		break;
		
		case 2:
			C = array2;
			globalSize = array2.length;
		break;
		
		case 3:
			C = array3;
			globalSize = array3.length;
		break;
	}
	
	for (int i=0 ; i<(globalSize-1); i++){
		for(int j=0 ; j<(globalSize-1-i); j++){
			if(C[j]>C[j+1]){
				save = C[j+1];
				C[j+1] = C[j];
				C[j] = save;
			}
		}
	}
	
	switch (choice1){
		case 1:
			array1 = C;
		break;
		
		case 2:
			array2 = C;
		break;
		
		case 3:
			array3 = C;
		break;
	}
	
	System.out.print("\n >> El nuevo arreglo ordenado es:");
	showArrays();	
}

/**
* metodo que solicita al usuario presionar alguna tecla para continuar con el flujo del programa. <br>
* <b>pre: </b> <br>
* <b>post: </b> se continua con el flujo del programa <br>
*/
public static void pressEnterToContinue(){
	System.out.print("\n\n  > presione enter para ir al menu...");
	sc.nextLine();
	continue1 = sc.nextLine();
}


 public static void main(String args[]){
	inicializar();
	menu0();
  }
}