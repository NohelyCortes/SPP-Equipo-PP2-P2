/*Ángel Ávalos Ortega A01410325
Alberto Isaac Gómez Jiménez A01410769
Jorge Daniel Bombardier
Miguel Ángel Méndez 
Nohely Cortés del Ángel A01410768
*/
package spp.equipo.pp2.p2;
import java.util.*;
/**
 *
 * @author Nohely C
 */
public class SPPEquipoPP2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa evaluara si los arreglos son iguales");
        Scanner kb=new Scanner(System.in);
        int b;       
        System.out.println("Introduzca el largo y ancho de su arrgeglo");
        b=pedirDato();
        int [][] matrixa=new int[b][b];
        int [][] matrixb=new int[b][b];
        System.out.println("Intrpduzca los datos de su primer arreglo");
        matrixa= matrix(b);
        System.out.println("Introduzca los datos de su segundo arreglo");
        matrixb= matrix(b);
        evaluar(matrixa,matrixb);
    }
public static int pedirDato (){
    Scanner kb= new Scanner(System.in);
    boolean flag;
    int n=0;
        do{
        System.out.println("Introduzca un numero entero");
        try{
           n=kb.nextInt();
           flag=false;        
        }catch(Exception er){
            System.out.println("Intentelo de nuevo");
            flag=true;
            kb.nextLine();
        }        
    }while (flag);
            return n;
}
public static int [][] matrix(int b){
 int [][]matrix=new int [b][b];
    for (int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix.length;j++)
        {
            matrix[i][j]=pedirDato();
        }  
        }
        return matrix;
}  
public static void evaluar(int[][]matrixa,int [][]matrixb){
int x=0;
    for (int i=0;i<matrixa.length;i++){
        for (int j=0;j<matrixa.length;j++){
            
            x=matrixa[i][j]-matrixb[i][j]; 
            if (x==0){
            }else{
                System.out.println("Sus arreglos son diferentes");
                x=2;
                break;
            }
} 
}
if(x==0){
    System.out.println("Sus arreglos son iguales");
}else{
}     
}
}