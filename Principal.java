/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pack1;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean flag1=true;
        while (flag1){
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("*****************************************MENU*************************************");
            System.out.println("\n");
            System.out.println("A continuación se muestran los números que corresponden a las diferentes areas.");
            System.out.println("\n");
            System.out.println("1. Aritmetica");
            System.out.println("2. Trigonometria");
            System.out.println("3. Estadistica");
            System.out.println("4. Cálculo");
            System.out.println("5. Salir");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("\n");
            System.out.print("Ingrese el número de la opción que desea realizar: ");
            int NumOpcion=teclado.nextInt();
            switch(NumOpcion){
                case 1:
                    boolean flagcaso1=true;
                    while (flagcaso1){
                    System.out.println("----------------------------------------------------------------------------------");  
                        System.out.println("*****************************ARITMETICA****************************************");
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Multiplicación");
                    System.out.println("4. División");
                    System.out.println("5. Potencia");
                    System.out.println("6. Salir");
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("\n");
                    System.out.print("Ingrese el número de la operación que desea realizar: ");
                    Scanner opArit=new Scanner(System.in);
                    int opcaso1=opArit.nextInt();
                    switch(opcaso1){
                        case 1:
                            Aritmetica llamador1=new Aritmetica();
                            llamador1.suma();
                            break;
                        case 2:
                            Aritmetica llamador2=new Aritmetica();
                            llamador2.resta();
                            break;
                        case 3:
                            Aritmetica llamador3=new Aritmetica();
                            llamador3.multiplicacion();
                            break;
                        case 4:
                            Aritmetica llamador4=new Aritmetica();
                            llamador4.division();
                            break;
                        case 5:
                            Aritmetica llamador5=new Aritmetica();
                            llamador5.potencia();
                            break;
                        case 6:
                            flagcaso1=false;
                            break;
                        default:
                            System.out.println("Ha seleccionado una opción inválida");
                            System.out.println("Vuelva a ingresar una opción válida");                            
                            break;      
                    }
                    Scanner salto1 = new Scanner(System.in);
                    String brinco1=salto1.nextLine();
                    }
                    break;
                case 2:
                    boolean flag2=true;
                    while (flag2){  
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("********************************TRIGONOMETRÍA*************************************");
                        System.out.println("1. Seno");
                        System.out.println("2. Coseno");
                        System.out.println("3. Tangente");
                        System.out.println("4. Salir");
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("\n");
                        System.out.print("Ingrese el número de la operación que desea realizar: ");
                        Scanner opGeo = new Scanner(System.in);
                        int opcaso2=opGeo.nextInt();
                        switch(opcaso2){
                            case 1:
                                Trigonometría llamada1=new Trigonometría();
                                Scanner obtrigo1=new Scanner(System.in);
                                System.out.print("Ingrese el angulo->>>>>>> ");
                                double x=obtrigo1.nextDouble();
                                double y=(x*(3.1416/180));
                                System.out.print("Ingrese la cantidad de iteraciones requeridas:->>>>>>> ");
                                double iteracion=obtrigo1.nextDouble();
                                double senito=0;
                                for (int j=0; j<=iteracion;j++){
                                senito=senito+((llamada1.privalor(j)*llamada1.segundovalor(j, y))/llamada1.tercervalor(j));
                                }
                                System.out.println("El seno del angulo ingresado es ->>>>>>>: "+senito);
                                System.out.println("");
                                break;
                            case 2:
                                Trigonometría llamada2=new Trigonometría();
                                Scanner obtrigo2=new Scanner(System.in);
                                System.out.print("Ingrese el angulo:->>>>>>> ");
                                double o=obtrigo2.nextDouble();
                                double s=(o*(3.1416/180));
                                System.out.print("Ingrese la cantidad de iteraciones requeridas:->>>>>>> ");
                                double itera=obtrigo2.nextDouble();
                                double cosenito=0;
                                for (int k=0; k<=itera;k++){
                                cosenito=cosenito+((llamada2.valorcoseno1(k)*llamada2.valorcoseno2(k,s))/llamada2.valorcoseno3(k));
                                }
                                System.out.println("El coseno del ángulo ingresado es ->>>>>>>: "+cosenito);
                                System.out.println("");
                                break;
                            case 3:
                                Trigonometría llamada3=new Trigonometría();
                                Scanner obtrigo3=new Scanner(System.in);
                                System.out.print("Ingrese el angulo:->>>>>>>> ");
                                double grad=obtrigo3.nextDouble();
                                double grado=(grad*(3.1416/180));
                                System.out.print("Ingrese la cantidad de iteraciones requeridas:->>>>>>>> ");
                                double iteraGrado=obtrigo3.nextDouble();
                                double senote=0;
                                double cosenote=0;
                                for (int rs=0; rs<=iteraGrado;rs++){
                                senote=senote+((llamada3.privalor(rs)*llamada3.segundovalor(rs, grado))/llamada3.tercervalor(rs));
                                }
                                for (int sr=0; sr<=iteraGrado;sr++){
                                cosenote=cosenote+((llamada3.valorcoseno1(sr)*llamada3.valorcoseno2(sr,grado))/llamada3.valorcoseno3(sr));
                                }
                                double tangente=senote/cosenote;
                                System.out.println("La tangente del angulo ingresado es->>>>>>>: "+tangente);
                                System.out.println("");
                                break;
                            case 4:
                                System.out.println("Adios");
                                flag2=false;
                                break;
                            default:
                                System.out.println("----------------------------------------------------------------------------------");
                                System.out.println("Ha seleccionado una opción inválida");
                                System.out.println("Vuelva a ingresar una opción válida"); 
                                System.out.println("----------------------------------------------------------------------------------");
                                System.out.println("");
                                break;   
                        }
                    
                    }
                    Scanner salto2 = new Scanner(System.in);
                    String brinco2=salto2.nextLine();
                    break;
                case 3:
                    boolean flag3=true;
                    while (flag3){
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("***********************************ESTADISTICA************************************");
                        System.out.println("1. Promedio");
                        System.out.println("2. Mediana");
                        System.out.println("3. Moda");
                        System.out.println("4. Varianza");
                        System.out.println("5. Desviación estandar");
                        System.out.println("6. Salir ");
                        System.out.println("----------------------------------------------------------------------------------");
                        System.out.println("\n");
                        System.out.print("Ingrese el número de la operación que desea realizar:->>>>>>> ");
                        Scanner opEst = new Scanner(System.in);
                        int opcaso3=opEst.nextInt();
                        switch(opcaso3){
                            case 1: 
                                Estadistica obEst1= new Estadistica();
                                Scanner jalador1 = new Scanner(System.in);
                                System.out.print("Ingrese el tamaño del arreglo:->>>>>>> ");
                                int tam=jalador1.nextInt();
                                System.out.print("Ingrese los datos del arreglo separados por una coma:->>>>>>> ");
                                String cad = jalador1.next();
                                System.out.println("El promedio de los datos es de:->>>>>>> "+obEst1.capturaDeCadena(cad, tam));
                                System.out.println("");
                                break;
                            case 2:
                                Estadistica obEst2= new Estadistica();
                                Scanner jalador2 = new Scanner(System.in);
                                System.out.print("Ingrese el tamaño del arreglo:->>>>>>> ");
                                int tam2=jalador2.nextInt();
                                System.out.print("Ingrese los datos del arreglo separados por una coma:->>>>>>> ");
                                String cad2 = jalador2.next();
                                obEst2.calculomediana(cad2, tam2);
                                System.out.println("");
                                break;
                            case 3:
                                Estadistica obEst3= new Estadistica();
                                Scanner jalador3 = new Scanner(System.in);
                                System.out.print("Ingrese el tamaño del arreglo:->>>>>>> ");
                                int tam3=jalador3.nextInt();
                                System.out.print("Ingrese los datos del arreglo separados por una coma:->>>>>>> ");
                                String cad3 = jalador3.next();
                                obEst3.moda(cad3, tam3);
                                System.out.println("");
                                break;
                            case 4:
                                Estadistica obEst4= new Estadistica();
                                Scanner jalador4 = new Scanner(System.in);
                                System.out.print("Ingrese el tamaño del arreglo:->>>>>>> ");
                                int tam4=jalador4.nextInt();
                                System.out.print("Ingrese los datos del arreglo separados por una coma:->>>>>>> ");
                                String cad4 = jalador4.next();
                                double promevarianza=obEst4.capturaDeCadena(cad4, tam4);
                                System.out.print("La varianza de los datos ingresados es;->>>>>>> "+obEst4.varianza(cad4, tam4, promevarianza));   
                                System.out.println("");
                                break;
                            case 5:
                                Estadistica obEst5= new Estadistica();
                                Scanner jalador5 = new Scanner(System.in);
                                System.out.print("Ingrese el tamaño del arreglo:->>>>>>> ");
                                int tam5=jalador5.nextInt();
                                System.out.print("Ingrese los datos del arreglo separados por una coma:->>>>>>> ");
                                String cad5 = jalador5.next();
                                double promedesvi=obEst5.capturaDeCadena(cad5, tam5);
                                double varianzadesvi=obEst5.varianza(cad5, tam5, promedesvi);
                                obEst5.desviacionEstandar(varianzadesvi);
                                System.out.println("");
                                break;
                            case 6:
                                flag3=false;
                                break;
                            default:
                                System.out.println("\n");
                                System.out.println("----------------------------------------------------------------------------------");
                                System.out.println("Ha seleccionado una opción inválida");
                                System.out.println("Vuelva a ingresar una opción válida"); 
                                System.out.println("----------------------------------------------------------------------------------");
                                System.out.println("\n");
                                break;        
                        }
                    }
                    Scanner salto3 = new Scanner(System.in);
                    String brinco3=salto3.nextLine();
                    break;
                case 4:
                    boolean flag4=true;
                    while(flag4){
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("***************************************CÄLCULO************************************");
                    System.out.println("1. Resolver sistemas de Ecauciones Lineales NxN por Gauss-Jordan");
                    System.out.println("2. Salir");
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("\n");
                    System.out.println("Ingrese el número de la operación que desea realizar:->>>>>>> ");
                    Scanner opAlg = new Scanner(System.in);
                        int opcaso4=opAlg.nextInt();
                        switch(opcaso4){
                            case 1:
                                Calculo objeCal=new Calculo();
                                int fil7=objeCal.fila();
                                int col7=objeCal.columna();
                                String array7[]=objeCal.array1(fil7);
                                String matriz7[][]=objeCal.matriz1(array7, fil7, (col7+1));
                                double matrizNumerica7[][]=objeCal.matrizNumerica(matriz7, fil7,(col7+1));
                                double matrizGaussJordan[][]=objeCal.matrizgauss(matrizNumerica7, fil7, (col7+1));
                                System.out.println("La ecuación resuelta por el metodo de Gauss-Jordan queda de la siguiente manera:");
                                objeCal.respuesta(matrizGaussJordan, fil7, (col7+1));
                                System.out.println("");
                                break;
                                
                            case 2:
                                flag4=false;
                                break;
                            default:
                                System.out.println("\n");
                                System.out.println("----------------------------------------------------------------------------------");
                                System.out.println("Ha seleccionado una opción inválida");
                                System.out.println("Vuelva a ingresar una opción válida"); 
                                System.out.println("----------------------------------------------------------------------------------");
                                System.out.println("\n");
                                System.out.println("");
                                break;
                        }
                    }
                    Scanner salto4 = new Scanner(System.in);
                    String brinco4=salto4.nextLine();
                    break;
                case 5:
                    System.out.println("Finaliza el programa");
                    System.exit(0);
                default:
                    System.out.println("\n");
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("Ha seleccionado una opción inválida");
                    System.out.println("Vuelva a ingresar una opción válida");
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("\n");
                    Scanner salto5 = new Scanner(System.in);
                    String brinco5=salto5.nextLine();
                    break;
                    
            }
        
        
        
        }
    }
    
}
