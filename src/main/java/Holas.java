import java.util.Scanner;
public class Holas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean verificar=false;
        int numeroFila=0, numeroColumna=0;
        System.out.println("Suma Fila Matriz escogida por usuario.\n");
        System.out.print("Inserta numero Filas: ");
        int nFilas=sc.nextInt();
        System.out.print("Inserta numero Columnas: ");
        int nColumnas=sc.nextInt();
        
        int matriz[][] = new int [nFilas][nColumnas];
        
        System.out.println("Guardar Matriz:");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("["+i+"]["+j+"]: ");
                matriz[i][j]=sc.nextInt();
            }
        }
            
        //Se muestra Matriz guardada
        System.out.println("\nMatriz:");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("["+matriz[i][j]+"]"  +" ");
            }
                System.out.println("");
        }
        
        //Validacion de Sumatoria de Filas
        do{
        verificar=false;
        System.out.print("\n¿Que fila deseas Sumar?: ");
        numeroFila=sc.nextInt();
        if(numeroFila <= 0 || numeroFila >nFilas){
            verificar=true;
            System.out.println("Fila no valida, intentalo nuevamente.\n");
        }
        }while(verificar!=false);
        
        //Suma de Fila escogida por el usuario
        System.out.println("Fila a Sumar ["+numeroFila+"]");
        int sumatoriaFila=0;
        for(int i=0; i<numeroFila; i++){
            sumatoriaFila=0;
            for(int j=0; j<nColumnas; j++){
                sumatoriaFila += matriz[i][j];
            }
        }
        System.out.println("La sumatoria de la Fila ["+numeroFila+"] es: "+sumatoriaFila);
        
        //Validacion de Sumatoria de Columnas
        do{
        verificar=false;
        System.out.print("\n¿Que numero de Columna deseas Sumar?: ");
        numeroColumna=sc.nextInt();
        if(numeroColumna < 0 || numeroColumna>nColumnas){
            verificar=true;
            System.out.println("Columna no valida, intentalo nuevamente.\n");
        }
        }while(verificar!=false);
        
        //Suma de Columna escogida por el usuario
        System.out.println("Columna a Sumar ["+numeroColumna+"]");
        int sumatoriaColumna=0;
        for(int j=0; j<numeroColumna; j++){
            sumatoriaColumna=0;
            for(int i=0; i<nFilas; i++){
                sumatoriaColumna += matriz[i][j];
            }
            System.out.println("La sumatoria de la Columna ["+numeroColumna+"] es: "+sumatoriaColumna);
        } 
    }
}