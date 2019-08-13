/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploinstanceof;

/**
 *
 * @author john hernandez
 */
public class EjemploInstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FiguraGeometrica figura;
        figura = new Elipse();
        determinarTipo(figura);
        
        System.out.println("\nTodos Sus Tipos :");
        determinaTodosLosTipos(figura);
        
        
    }
    
    private static void determinaTodosLosTipos(FiguraGeometrica figura){
        if (figura instanceof Elipse) {
            // procesa algo particular de la elipse
            System.out.println("es una elipse");
            
        }
        if (figura instanceof  Circulo) {
            System.out.println("es un circulo");
            
        }
        if (figura instanceof Rectangulo) {
            System.out.println("es un rectangulo");
            
        }
        if (figura instanceof Triangulo) {
            System.out.println("es un triangulo");
            
        }
        if (figura instanceof FiguraGeometrica) {
            System.out.println("es una figura geometrica");
            
        }
        if (figura instanceof Object) {
             System.out.println("es un object");
            
        }else{
            System.out.println("no se encontro el tipo");
        }
        
        
    }
    private static void determinarTipo(FiguraGeometrica figura){
        if (figura instanceof Elipse) {
            System.out.println("es un object");
            
        }else if (figura instanceof  Circulo) {
            System.out.println("es una elipse");
            
        }else if (figura instanceof Rectangulo) {
            System.out.println("es un circulo");
            
        }else if (figura instanceof Triangulo) {
            System.out.println("es un rectangulo");
            
        }else if (figura instanceof FiguraGeometrica) {
            System.out.println("es un triangulo");
            
        }else if (figura instanceof Object ) {
            System.out.println("es una figura geometrica");
            
        }else{
            System.out.println("no se encontro el tipo");
        }
    }
    
}
