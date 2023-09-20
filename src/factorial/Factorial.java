/*
Ejercicio 12: Pedir un número y
calcular su factorial.
El factorial de un número se calcula multiplicando todos 
los números enteros positivos desde 1 hasta ese número.. Se indica con 
el símbolo "!". Por ejemplo, 
el factorial de 5 se escribe como 5! y se calcula como 5 x 4 x 3 x 2 x 1 = 120.
*/
package factorial;

import javax.swing.JOptionPane;

public class Factorial {

    public static void main(String[] args) {
        int numero,factorial=1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para saber \n "
                + "su factorial"));
        
        for (int i =1; i<=numero; i++){
            factorial*=i;
        // factorial=1,despues=1*i1=1  1*i2=2  2*i3=6  6*i4=24  24*i5=120
        }
        //System.out.println("El factorial de "+numero+" es: "+factorial);
        JOptionPane.showConfirmDialog(null, "El factorial de "+numero+" es: "+factorial);
        
        
    }
    
}
