/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pack1;

/**
 *
 * @author danie
 */
public class Estadistica {
    public double capturaDeCadena(String cadenilla,int n){
    String DatosLetras []= cadenilla.split(",");
    double DatosNumeros []= new double[n];
    double media=0;
    double promedio;
    for(int i=0; i<n;i++){
        DatosNumeros[i] = Double.valueOf(DatosLetras[i]);
    }
    for (int j=0; j<n;j++){
        media=media+DatosNumeros[j];
    }
    promedio=media/n;
    return promedio;
    
    }
    
    public void calculomediana(String cadenilla2,int n2){
        String DatosLetras2 []= cadenilla2.split(",");
        double DatosNumeros2 []= new double[n2];
            for(int i=0; i<n2;i++){
            DatosNumeros2[i] = Double.valueOf(DatosLetras2[i]);
            }
            double temp;
            for(int a=1; a<n2;a++){
                for(int b=0;b<n2-a;b++){
                    if(DatosNumeros2[b]>DatosNumeros2[b+1]){
                        temp=DatosNumeros2[b];
                        DatosNumeros2[b]=DatosNumeros2[b+1];
                        DatosNumeros2[b+1]=temp;
                    }
                }
            
            }
            double posibilidad=n2%2;
            if (posibilidad==0){
                int r=(n2)/2;
                double mediana=((DatosNumeros2[r-1]+DatosNumeros2[r])/2);
                System.out.println("La mediana de los datos ingresados es:->>>>>>> "+mediana);
            
            }
            else{
                int w=n2/2;
                double mediana=DatosNumeros2[w];
                System.out.println("La mediana de los datos ingresados es:->>>>>>> "+mediana);
            }
    }
    
    public void moda(String cadenilla3, int n3){
        String DatosLetras3 []= cadenilla3.split(",");
        double DatosNumeros3 []= new double[n3];
            for(int i=0; i<n3;i++){
            DatosNumeros3[i] = Double.valueOf(DatosLetras3[i]);
            }
            double temp;
            double max=0;
            int contadormax=0;
            
            for (int j=0; j<n3; j++){
                temp=DatosNumeros3[j];
                int contador=0;
                for(int k=0; k<n3;k++){
                    if (temp==DatosNumeros3[k]){
                    contador=contador+1;
                    }
                }
                if (contador>contadormax){
                    max=temp;
                }
            }
            System.out.println("La moda de los datos mostrados es: ->>>>>>> "+max);
    
    }
    public double varianza(String cadenilla4, int n4, double prome){
        String DatosLetras4 []= cadenilla4.split(",");
        double DatosNumeros4 []= new double[n4];
            for(int i=0; i<n4;i++){
            DatosNumeros4[i] = Double.valueOf(DatosLetras4[i]);
            }
            double serie=0;
            for(int j=0; j<n4;j++){
            double tempi=DatosNumeros4[j]-prome;
            double sum=tempi*tempi;
            serie=serie+sum; 
            }
            double varianza=serie/n4;
        return varianza;
     }
    
    public void desviacionEstandar(double vari5){
        double z=1;
        for(int i=0;i<50;i++){

            z=(z+vari5/z)/2;
        }
        System.out.println("La desviación estandar de los datos ingresados es:->>>>>>>"+z);
    }    
}