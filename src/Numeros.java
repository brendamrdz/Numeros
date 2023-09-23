import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) throws Exception {
        Numeros numeros = new Numeros();
        numeros.numeroPalabra();
    }

    public void numeroPalabra(){
    	int num;
    	do {
    		System.out.println("Ingresa un numero entero positivo:");
        	Scanner sc = new Scanner(System.in);
        	num = sc.nextInt();
        	if(num<=0) {
        		System.out.println("Numero no valido");
        	}
    	}while(num<=0);
       String separado = Integer.toString(num);
        for(int i=0;i<separado.length();i++){
            char s = separado.charAt(i);
           
        switch(s) {
            case '0':
              System.out.println("cero");
              break;
            case '1':
              System.out.println("uno");
              break;
            case '2':
              System.out.println("dos");
              break;
            case '3':
              System.out.println("tres");
              break;
            case '4':
              System.out.println("cuatro");
              break;
            case '5':
              System.out.println("cinco");
              break;
            case '6':
              System.out.println("seis");
              break;
            case '7':
              System.out.println("siete");
              break;
            case '8':
              System.out.println("ocho");
              break;
            case '9':
              System.out.println("nueve");
              break;
              
        }
        }

    }
}
