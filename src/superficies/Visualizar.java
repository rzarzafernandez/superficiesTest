package superficies;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static superficies.Logic.calcular;

/**
 * @author rzarzafernandez
 */
public class Visualizar {

    /**
     * metodo que nos manda en ventana el resultado del area calculada
     * @param contenedor
     */
    
    public static void menu(Modelo contenedor){
        int opcion = 0;
        do{
            switch(Integer.parseInt(JOptionPane.showInputDialog("****\"What shape would you like to find the area of? (square, circle, triangle, rectangle):\"****\n"
                    + "1.- SQUARE\n"
                    + "2.- CIRCLE\n"
                    + "3.- TRIANGLE\n"
                    + "4.- RECTANGLE\n"
                    + "5.- SALIR\n"))){
                case 1:
                    contenedor.setSelectArea(0);
                    contenedor.setSideLength(Float.valueOf(JOptionPane.showInputDialog("what is the side length?")));
                    calcular(contenedor);
                    Visualizar.Imprimir(contenedor);
                    break;
                case 2:
                    contenedor.setSelectArea(1);
                    contenedor.setRadius(Float.valueOf(JOptionPane.showInputDialog("What is the radius of the circle?")));
                    calcular(contenedor);
                    Visualizar.Imprimir(contenedor);
                    break;
                case 3:
                    contenedor.setSelectArea(2);
                    contenedor.setBaseLength(Float.valueOf(JOptionPane.showInputDialog("What is the base length of the triangle?")));
                    contenedor.setHeight(Float.valueOf(JOptionPane.showInputDialog("What is the height of the triangle?")));
                    calcular(contenedor);
                    Visualizar.Imprimir(contenedor);
                    break;
                case 4:
                    contenedor.setSelectArea(3);
                    contenedor.setSideLength(Float.valueOf(JOptionPane.showInputDialog("what is the rectangles width?")));
                    contenedor.setSideHeight(Float.valueOf(JOptionPane.showInputDialog("What is the rectangles height?")));
                    calcular(contenedor);
                    Visualizar.Imprimir(contenedor);
                    break;
                case 5:
                    System.exit(opcion);
                    break;
            }
            
        }while(opcion < 6 || opcion > 0 );
    }
    
    public static void Imprimir(Modelo contenedor){
        if (contenedor.getSelectArea() == 0){
            JOptionPane.showMessageDialog(null, "The area for your square:  "+contenedor.getSquareArea());
        }else if(contenedor.getSelectArea() == 1){
            JOptionPane.showMessageDialog(null, "Your Circles area is:  "+contenedor.getCircleArea());
        }else if(contenedor.getSelectArea() == 2){
            JOptionPane.showMessageDialog(null, "Your triangles area is:  "+contenedor.getTriangleArea());
        }else if(contenedor.getSelectArea()== 3){
            JOptionPane.showMessageDialog(null, "The area for your rectangle is:  "+contenedor.getRectangleArea());
        }
    }
    
}