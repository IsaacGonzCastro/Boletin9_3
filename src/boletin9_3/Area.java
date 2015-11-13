
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author igonzalezcastro
 */
public class Area {
    float base;
    float altura;
    float area;
    float dato;
 public float pedirDatos(){
     do{
  dato =  Float.parseFloat(JOptionPane.showInputDialog("Introducir Datos : "));
     }while(dato<=0);
     return dato;
 }
 public void CalcularArea(){
 base=pedirDatos();
 altura=pedirDatos();
     JOptionPane.showMessageDialog(null,"Area = "+ base*altura);
 
 }
} 

 
  
   
    

