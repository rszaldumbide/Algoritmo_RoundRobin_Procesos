/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RR;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rszaldumbide
 */
public class metodosRR {

    private char[] matrizChar;
    private String[] matrizString;
    private int cont;
    
    public metodosRR() {
    }
    
    
    public void algoritmoPrioridad(int[] arrL, int[] arrU, int[] arrP, String[] arrN){
        
        String baseN;
        int baseL, baseU, baseP;
        int rafaga = arrU[0]+arrL[0];
        
        for (int i=0; i<arrP.length-1; i++){
            baseN=arrN[i+1];
            baseL=arrL[i+1];
            baseU=arrU[i+1];
            baseP=arrP[i+1];
            for (int j=i+1; j<arrP.length-1; j++) {
                if (arrP[j+1]<baseP) {
                    if (arrL[j+1]<= rafaga){
                        //si cumple la condicion ordenamos en burbuja
                        //paso 1
                        baseN=arrN[j+1];
                        baseL=arrL[j+1];
                        baseU=arrU[j+1];
                        baseP=arrP[j+1];
                        //paso 2
                        arrN[j+1]=arrN[i+1];
                        arrL[j+1]=arrL[i+1];
                        arrU[j+1]=arrU[i+1];
                        arrP[j+1]=arrP[i+1];
                        //paso 3
                        arrN[i+1]=baseN;
                        arrL[i+1]=baseL;
                        arrU[i+1]=baseU;
                        arrP[i+1]=baseP;
                    }
                }   
            }
            rafaga+=arrU[i+1];
        }
        
        for(int i=0; i<arrU.length; i++){
            System.out.println("\nN"+arrN[i]+" l"+arrL[i]+" u"+arrU[i]+" p"+arrP[i]+"\n"); 
        }
    }
    
    public char[] MatrizChar(int tamaño) {
                
        matrizChar = new char[tamaño];
        cont=0;                                                                                                             
        
        for(int fila=0; fila<tamaño; fila++){
            matrizChar[fila]=(char)('A'+cont);
            cont++;
            }

        return matrizChar;   
    }
    
    public void imprimirMatriz(char[] matriz, int filas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        int col=0;
        for (int fila = 0; fila < filas; fila++) {
            nombre.setValueAt(matriz[fila], fila, col);
        }   
    }
    
    public void imprimirMatriz(String matriz[], int filas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        int col=0;
        for (int fila = 0; fila < filas; fila++) {
            nombre.setValueAt(matriz[fila], fila, col);
        }   
    }
    
    public String[] MatrizString(int tamaño) {
                
        matrizString = new String[tamaño];                                                                                                           
        
        for(int fila=0; fila<tamaño; fila++){
            matrizString[fila]="";
            }

        return matrizString;   
    }
    
    
    public void imprimirMatrizRafaga(String[] matriz, int filas, int rafagas, JTable nombre) {

        DefaultTableModel modelo = (DefaultTableModel) nombre.getModel();

        modelo.setRowCount(filas);
        
        String vector[]=new String[rafagas];
        cont=0;
        for(int i=0; i<rafagas; i++){
            if(i==0){
                vector[i]="procesos/rafaga";
            }else{
                vector[i]=""+cont;
                cont++;
            }
        }
        modelo.setColumnIdentifiers(vector);
        
        int col=0;
        cont=0;
        for (int fila = 0; fila < filas; fila++) {
            if(col==0){
            }else{
                nombre.setValueAt(matriz[fila], fila, col);
            }
        }   
    }

}
