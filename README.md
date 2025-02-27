# EJERCICIOS-JAVA-CADENA-DE-CARACTERES

## Ejercicio1

```sh
public class Ejercicio1 {
    public static void main(String[] args){
        for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
            String xxxx = Integer.toHexString(codePoint); //convierte un número en su representación hexadecimal
            System.out.println("\\u" + xxxx + ":" + codePoint);
        }
    }
}
```

## Ejercicio2

```sh
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera frase: ");
        String frase1 = sc.nextLine();
        
        System.out.println("Segunada frase");
        String frase2 = sc.nextLine();
        
        int longFrase1 = frase1.length();
        int longFrase2 = frase2.length();
        
        if (longFrase1 == longFrase2) {
            System.out.println("Tienen la misma longitud");
        }else if(longFrase1 < longFrase2){
            System.out.println(frase1 + " es mas corta que " + frase2);
        }else{
            System.out.println(frase2 + " es mas corta que " + frase1);
        }
    }
}
```

## Ejercicio3

```sh
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String paswd, palabra;
        System.out.println("Jugador1 Introduce la contrasena: ");
        paswd = sc.nextLine();
    /**    
        do{
            System.out.println("Jugador2 palabra: ");
            palabra : sc.nextLine();
            int comparacion = paswd.compareTo(palabra);
            
            if (comparacion == 0) {
                System.out.println("Acertaste");
            }else if(comparacion < 0){
                
            }
        }
  */  }
}

```

## Ejercicio4

```sh
import java.util.Scanner;

public class Ejercicio4 {
    private String frase;
    private int numEspacios;
    
    // Constructor que recibe la frase y cuenta los espacios
    public Ejercicio4(String frase) {
        this.frase = frase;
        this.numEspacios = contarEspacios();
    }
    
    // Método privado para contar los espacios en blanco
    public int contarEspacios() {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            if (Character.isSpaceChar(frase.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        String frase = sc.nextLine();
        
        // Se crea el objeto y se realiza el conteo en el constructor
        Ejercicio4 contador = new Ejercicio4(frase);
        System.out.println("Tiene: " + contador.numEspacios + " espacios en blanco");
    }
}
```

## Ejercicio5

```sh
import java.util.Scanner;

public class Ejercicio5 {
    private String cadena;
    
    public Ejercicio5(String cadena){
        this.cadena = cadena;
    }

    private String alReves(String original) {
        String nueva = " ";
        for (int i = 0; i < original.length(); i++) {
            nueva = original.charAt(i) + nueva;
        }
        return nueva;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String cadena = sc.nextLine();  
        
        Ejercicio5 nueva = new Ejercicio5(cadena);
        System.out.println(nueva);
    }
}
```
