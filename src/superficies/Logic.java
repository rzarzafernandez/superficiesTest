package superficies;

/**
 *
 * @author rzarzafernandez
 */
public class Logic {
    public static float calcular(Modelo contenedor){
        float superficie = 0;
        if (contenedor.getSelectArea() == 0){
            contenedor.setSquareArea(contenedor.getSideLength()*contenedor.getSideLength());
            superficie = contenedor.getSquareArea();
        }else if(contenedor.getSelectArea() == 1){
            contenedor.setCircleArea((float) 3.14159265 *(contenedor.getRadius()*contenedor.getRadius()));
            superficie = contenedor.getCircleArea();
        }else if(contenedor.getSelectArea()== 2){
            contenedor.setTriangleArea((contenedor.getBaseLength()*contenedor.getHeight())/2);
            superficie = contenedor.getTriangleArea();
        }else if(contenedor.getSelectArea()== 3){
            contenedor.setRectangleArea(contenedor.getSideHeight()*contenedor.getSideLength());
            superficie = contenedor.getRectangleArea();
        }
        return superficie;
    }
}