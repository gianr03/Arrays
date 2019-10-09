
package array;

import java.util.Scanner;



public class Operaciones {
    
    public int [] arreglo = new int[10];
    Scanner lectura=new Scanner(System.in);
    
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
        
        
        int opcion=lectura.nextInt();
        this.cargarOpcion(opcion);
    
    }
    
    public void leerArreglo(){
    
        System.out.println("la opcion escogida es leer arreglo");
        System.out.println("digite los numeros");
        for(int i=0;i<10;i++){
        
            arreglo[i]=lectura.nextInt();
        
        }
        this.mostrarMenu();
    }
    
    public void escribirArreglo(){
    
        System.out.println("la opcion escogida es escribir arreglo");
        System.out.println("los arreglos son");
        for(int i=0;i<10;i++){
            
            System.out.println(arreglo[i]);
            
        }
        this.mostrarMenu();
    
    }
    
    public void sumatoria(){
        
        System.out.println("la opcion escogida es sumatoria");
         
         int sumatoria = 0;
         for(int i=0;i<10;i++){
           sumatoria = sumatoria + arreglo[i];
                   
        }        
        System.out.println("la sumatoria es "+ sumatoria);
        this.mostrarMenu();
    
    
    }
    
    public void productoria(){
    
        System.out.println("la opcion escogida es productoria");
        this.mostrarMenu();
    
    
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
            default: 
                System.out.println("opcion invalida, intente nuevamente ");
                
                this.mostrarMenu();
        
        
        }
    
    
    }
    
    
    
    
    
    
    
    
}
