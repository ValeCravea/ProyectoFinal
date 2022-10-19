import java.util.Scanner;
import java.util.Arrays;
public class ProyectoProgramacion {
                            
                           //----||FUNCIONES||----\\

            //----||FUNCION PARA CARGAR CANTIDAD DE EMPLEADOS||----\\  
            
        
            public static final String ANSI_BLACK = "\u001B[30m";
            public static final String ANSI_RED = "\u001B[31m";
            public static final String ANSI_GREEN = "\u001B[32m";
            public static final String ANSI_YELLOW = "\u001B[33m";
            public static final String ANSI_BLUE = "\u001B[34m";
            public static final String ANSI_PURPLE = "\u001B[35m";
            public static final String ANSI_CYAN = "\u001B[36m";
            public static final String ANSI_WHITE = "\u001B[37m";

            public static final String ANSI_RESET = "\u001B[0m";

            public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";public static final String ANSI_RED_BACKGROUND = "\u001B[41m";public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";



            public static void limpiar(){
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
            }
        
           //----||FUNCION PARA CARGAR SUELDOS (CASE 0)||----\\
           
           public static void Cargarsueldos(int[] sueldos, String[] emple){         //Creamos un Array para importar todos los sueldos de los empleados
            try{
            System.out.println("---------------------------------------------------------------------------");
                Scanner sc = new Scanner(System.in);
                for(int i=0 ; i<sueldos.length;i++){
                    System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "Ingrese el sueldo de " + emple[i] + ANSI_RESET); //color del texto   
                sueldos[i] = sc.nextInt();
                limpiar();
            }
            } catch(java.util.InputMismatchException error){
                System.out.println(ANSI_RED + "ERROR" + ANSI_RESET);   //color del texto 
            }
            limpiar();
            
        }
     
           
           
            //----||FUNCION PARA CARGAR EMPLEADOS (CASE 1)||----\\
            public static void CargarEmpleados(String[] empleados){
                System.out.println("---------------------------------------------------------------------------");
               
                                                        
            
                Scanner sc = new Scanner(System.in);

            for(int i=0 ; i<empleados.length;i++){ 
                System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "Ingrese los nombres de los empleados" + ANSI_RESET);  
                empleados[i] = sc.nextLine();     
                 
            }
       System.out.println("");
       System.out.println(ANSI_GREEN + "Se han ingresado con exito" + ANSI_RESET);    
        }
        




            //----||FUNCION PARA MOSTRAR SUELDOS (CASE 2)||----\\
            public static void MostrarSueldos(int[] sueldos, String[] emple){
                System.out.println("---------------------------------------------------------------------------");
                Scanner sc = new Scanner(System.in);
                for(int i=0 ; i<emple.length;i++){
                    System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "El sueldo de " + emple[i] + " es de " + sueldos[i] + ANSI_RESET);               
                }
            }
           
           
           
            
            //----||FUNCION PARA BUSCAR SUELDOS (CASE 3)||----\\
            public static boolean BuscarSueldos(int[] sueldos, String[] emple){ 
                System.out.println("---------------------------------------------------------------------------");
               
                try{
                int indice = -1;
                Scanner sc = new Scanner(System.in);
                System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "Ingrese el nombre del empleado: " + ANSI_RESET);    
                System.out.println("");
                String buscar=sc.nextLine();
                for(int i=0 ; i<emple.length;i++){
                if(emple[i].equals(buscar)){ 
                indice = i;
                }
                    }                                                                               //.equals es lo mismo que == pero para Strings      
                if(indice >=0){
                    System.out.println("");
                    System.out.println(ANSI_BLUE_BACKGROUND + ANSI_WHITE + "El sueldo de " + emple[indice] + " es "  +  sueldos[indice] + ANSI_RESET);
                    return true;
                }
                 else;
                System.out.println("");
                System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE +"Empleado no valido" + ANSI_RESET);
                 
                } 
            
            catch(java.util.InputMismatchException error){
    

            
              
            }
            return true;
            }


            
            //----||FUNCION PARA RANGO DE SUELDO (CASE 4) ||----\\
            public static void Rangosueldo(int[] sueldos){
                System.out.println("---------------------------------------------------------------------------");
                Scanner sc = new Scanner(System.in);
                int cantidad = 0;
                for(int i=0 ; i<sueldos.length;i++){
                   
                    if(sueldos [i] > 25000 && sueldos [i] < 45000){
                        cantidad++;
                        System.out.println(cantidad + " Cobran entre 25000 y 45000");
                   
                    }else if (sueldos [i] > 45000 && sueldos [i] < 60000){
                            cantidad ++ ;
                            System.out.println(cantidad + " Cobran entre 45000 y 60000");
                        
                    }else if (sueldos [i] >=100000){
                            cantidad ++ ;
                            System.out.println(cantidad + " Cobran mas de 100000");
                
                        
                       }else {
                       System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE +"El valor ingresado no esta en el rango" + ANSI_RESET);

                          }

                            }
                                }

            
            

            //----||FUNCION PARA HACER PROMEDIO (CASE 5) ||----\\
            public static float promedio(int[] sueldos){
                System.out.println("---------------------------------------------------------------------------");                   
                float promedio = 0;
                                for (int i = 0;i<sueldos.length;i++){
                                    promedio += sueldos[i];    
                                }
                                
                                promedio = promedio / sueldos.length;
                                System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "El sueldo promedio es " + promedio + ANSI_RESET);
                                return promedio;
                            }
           
            


            //----||FUNCION PARA AUMENTO DEL SUELDO (CASE 6) ||----\\
            public static float aumento(int[] sueldos, String[] emple){      
                System.out.println("---------------------------------------------------------------------------");
                
                Scanner sc = new Scanner(System.in);
                System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "Ingrese el porcentaje que quiere aumentar (dentro del rango de 5% al 10%)" + ANSI_RESET);   
                int aumento=sc.nextInt();
                
                System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + " Que empleado desea aumentar (debe cobrar entre 15mil a 25mil pesos)" + ANSI_RESET);
                String empleados=sc.next();
                
                for(int i=0; i<emple.length-1 ; i++){
                if (aumento <5 && aumento >10 || sueldos [i] >25000 || sueldos [i] <15000) {  
                System.out.println("");
                System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "ERROR" + ANSI_RESET);
                }
                else 
             
                
                for(i=0 ; i<sueldos.length;i++){
                if (emple[i].equals(empleados)){
                      sueldos[i]=(aumento*sueldos[i]) / 100 + sueldos[i];
                      System.out.println(""); 
                      System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "El sueldo de " + emple[i] + " con el aumento incluido seria de " + sueldos[i] + ANSI_RESET);
                 
                       
            
                    }
                     }
                    }
                return aumento;
                    }
            
            

            
            //----||FUNCION PARA MOSTRAR EL MINIMO DEL SUELDO (CASE 7) ||----\\
            public static void minimo(int[] sueldos, String[] emple, int [] ordenado){
                System.out.println("---------------------------------------------------------------------------");
                        for(int i =0; i<sueldos.length;i++){
                        ordenado[i]=sueldos[i];           
                                }
                               Arrays.sort(ordenado);              //.sort ordena el array                                                       
                          for (int i = 0; i<sueldos.length ; i++) {           
                          if (sueldos[i] == ordenado[0]) { 
                            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "El empleado con el sueldo minimo es " + emple[i] + " que gana " + ordenado[i]  + ANSI_RESET);
                        }

                    } 
                }




            //----||FUNCION PARA MOSTRAR EL MAXIMO DEL SUELDO (CASE 8) ||----\\ 
            public static void maximo(int[] sueldos, String[] emple, int [] ordenado){
                System.out.println("---------------------------------------------------------------------------");        
                for(int i =0; i<sueldos.length;i++){
                            ordenado[i]=sueldos[i];                      // .sort ordena de menor a mayor
                        }
                         for (int i = 0; i<sueldos.length ; i++) {           
                          if (ordenado[ordenado.length-1] == sueldos [i]) {    //
                            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "El empleado con el sueldo maximo es " + emple[i] + " que gana " + ordenado[i]  + ANSI_RESET);
                           } 
                    }
                }
      
                


        //----||METODO MAIN||----\\
        public static void main (String args[]){
        
            boolean hecho = false ;
            Scanner sc = new Scanner (System.in);
            System.out.println("");
            System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Ingerese el numero de empleados de su empresa para ingresar al sistema:" + ANSI_RESET);

            String [] emple = new String [sc.nextInt()];     //Creacion del array emple (lista de empleados) 
            int [] sueldos = new int [emple.length];         //Creacion del array sueldos (lista de sueldos)
            int ordenado []=new int [sueldos.length];        //Creacion del array ordenado (lista de sueldos OREDNADOS)
           
    
       
       
       // ----||MENU DE OPCIONES||----\\
       
        int op = 0;
        while(op!=9){
            if (op>=10){
            System.out.println("");
            System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "Ingrese una opcion valida" + ANSI_RESET);
            }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("");
        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "-----||Bienvenido al sistema||-----" + ANSI_RESET); 
        System.out.println("");
        System.out.println("0- Cargar nombre del empleado");
        System.out.println("1- Cargar sueldos");
        System.out.println("2- Mostrar sueldos");
        System.out.println("3- Buscar sueldos");
        System.out.println("4- Rango de sueldos");
        System.out.println("5- Sueldo promedio");
        System.out.println("6- Aumentar sueldo");
        System.out.println("7- Mostrar sueldo mas bajo ingresado");
        System.out.println("8- Mostrar sueldo mas alto ingresado");
        System.out.println("9- salir");
        op = sc.nextInt();

switch (op) {

case 0:    //Ingrese nombre del empleado
    CargarEmpleados(emple);

    hecho=true;

 break;
case 1:    //Ingrese el sueldo
    Cargarsueldos(sueldos,emple);    

break;


case 2:    //Mostrar sueldos
    if (hecho == true) {
    MostrarSueldos(sueldos, emple); 
    }
    else if (hecho == false){
    System.out.println("");
    System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Usted no a ingresado los sueldos" + ANSI_RESET);
}
break;


case 3:    //Buscar sueldos
    if (hecho == true) {
    BuscarSueldos(sueldos, emple);    
    }
    else if(hecho == false){
    System.out.println("");
    System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Usted no a ingresado los sueldos" + ANSI_RESET);
}
    break;


case 4:  //Rango sueldos
    if (hecho == true) {   
    Rangosueldo(sueldos);
    }
    else if(hecho == false){
    System.out.println("");
    System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Usted no a ingresado los sueldos" + ANSI_RESET);
}
    break;


case 5:    //Promedio sueldos
    if (hecho == true) {  
    promedio(sueldos);
    }
    else if(hecho == false){
    System.out.println("");
    System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Usted no a ingresado los sueldos" + ANSI_RESET);
 }
    break;


case 6:    //Aunento sueldo (con rango)
    if (hecho == true) {    
    aumento(sueldos, emple);
}
 else if(hecho == false){
    System.out.println("");
    System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Usted no a ingresado los sueldoS" + ANSI_RESET);
 }
    break;


case 7:    //Sueldo minimo
    if (hecho == true) {     
    minimo(sueldos, emple, ordenado);
}
   else if ( hecho == false ){
    System.out.println("");
    System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Usted no a ingresado los sueldo" + ANSI_RESET);
   }
    break;


case 8:    //Sueldo maximo
    if (hecho == true) {
    maximo(sueldos, emple, ordenado); 
}
    else if ( hecho == false){
    System.out.println("");
    System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Usted no a ingresado los sueldos" + ANSI_RESET);
}
break;


case 9:    //Salir
System.out.println("");    
System.out.println(ANSI_BLUE_BACKGROUND + ANSI_WHITE + "GRACIAS POR USAR EL SISTEMA" + ANSI_RESET);
System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_WHITE + "UwU" + ANSI_RESET);
    break;




}
}
}
}