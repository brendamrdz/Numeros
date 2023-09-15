public class Numeros {
    public static void main(String[] args) throws Exception {
        Numeros numeros = new Numeros();
        numeros.numeroPalabra();
    }

    public void numeroPalabra(){
      
        int num1 = 453;
       String separado = Integer.toString(num1);
        for(int i=0;i<separado.length();i++){
            String s = ""+separado.charAt(i);
            int x = Integer.parseInt(s);
        switch(x) {
            case 0:
              System.out.println("cero");
              break;
            case 1:
              System.out.println("uno");
              break;
            case 2:
              System.out.println("dos");
              break;
            case 3:
              System.out.println("tres");
              break;
            case 4:
              System.out.println("cuatro");
              break;
            case 5:
              System.out.println("cinco");
              break;
            case 6:
              System.out.println("seis");
              break;
            case 7:
              System.out.println("siete");
              break;
            case 8:
              System.out.println("ocho");
              break;
            case 9:
              System.out.println("nueve");
              break;
        }
        }

    }
}
