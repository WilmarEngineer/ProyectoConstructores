
package constructoreswt;


public class ConstructoresWT {

    
    public static void main(String[] args) {
        //INSTANCIACION DE OBJETOS MEDIANTE SETTERS
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Wilmar Tovar");
        estudiante1.setEdad(16);
        estudiante1.setCarrera("Ingenieria de Software");
        
        Profesor profesor1 = new Profesor();
        profesor1.setNombre("William Gil");
        profesor1.setAsignatura("POO y metodologias de software");
        //INSTANCIACION DE OBJETOS MEDIANTE METODOS CONTRUCTORES
        Estudiante estudiante2 = new Estudiante("Wilmar", 16);
        Estudiante estudiante3 = new Estudiante(16, "Ingenieria de Software");
        
        Profesor profesor2 = new Profesor("William", "POO");
        Profesor profesor3 = new Profesor("William");
        
        System.out.println("IMPRESION DE OBJETOS CON INTANCIACION POR MEDIO DE SETTERS");  
        System.out.println(" El estudiante " + estudiante1.getNombre() + " estudia " + estudiante1.getCarrera() );
        System.out.println(" El profesor " + profesor1.getNombre() + " ensena " + profesor1.getAsignatura());
        System.out.println("============================================================");
    }
    
}
