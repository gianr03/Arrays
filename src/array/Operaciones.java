
package array;

import java.util.Scanner;



public class Operaciones {
    
    public int [] arreglo = new int[10];
    public int opcion;
    
    
    public Operaciones(){
    
    this.mostrarMenu();
   
    
     }
    
    public void mostrarMenu(){
    
    
        System.out.println("opciones\n"
                + "1-llenar Array\n"
                + "2-Escribir Array\n"
                + "3-Sumatoria\n"
                + "4-Productoria\n"
                + "5-Tamaño del Array\n"
                + "6-Salir\n"
                + "escoja opcion");
        Scanner lectura=new Scanner(System.in);
        opcion=lectura.nextInt();
        this.cargarOpcion(opcion);
    
    }
    
    public void leerArreglo(){
    
        System.out.println("la opcion escogida es leer arreglo");
    }
    
    public void escribirArreglo(){
    
        System.out.println("la opcion escogida es escribir arreglo");
    
    }
    
    public void sumatoria(){
        
        System.out.println("la opcion escogida es sumatoria");
    
    
    
    }
    
    public void productoria(){
    
        System.out.println("la opcion escogida es productoria");
    
    
    }
    
    public void cargarOpcion(int op){
    
        
        
        switch(op){
        
            case 1: this.leerArreglo();
            break;
            case 2: this.escribirArreglo();
            break;
            case 3: this.sumatoria();
            break;
            case 4: this.productoria();
            break;
            case 5:
            break;
            case 6: System.out.println("usted ha finalizado el programa ");
            break;
        
        
        
        }
    
    
    }
    
    
    
    
    
    
    
    
}
