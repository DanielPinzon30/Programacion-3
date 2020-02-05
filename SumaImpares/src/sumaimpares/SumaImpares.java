package sumaimpares;


public class SumaImpares {
    public static void main(String[] args) {
        System.out.println("Suma de numero simpares hasta 100.000.000");
        long x,suma=0;
        for(x=0;x<=100000000;x++){
        if(x%2!=0){
        suma+=x;
        }else{}
        
        }
        System.out.println("La suma total es: "+suma);
        }
    }
