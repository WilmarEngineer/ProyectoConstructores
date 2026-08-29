
package constructoreswt;


public class Profesor extends Persona {
   
    private String asignatura="";
    public Profesor(String nombre, int edad, String asignatura) {
    super(nombre, edad);
    this.asignatura = asignatura;
    }
    public Profesor(String nombre, int edad) {
    super(nombre, edad);
    }
    public Profesor(String nombre, String asignatura) {
    super(nombre);
    this.asignatura = asignatura;
    }
    public Profesor(String nombre) {
    super(nombre);
    }
    public Profesor(int edad, String asignatura) {
    super(edad);
    this.asignatura = asignatura;
    }
    public Profesor(int edad) {
    super(edad);
    }
    public Profesor() {
    this.asignatura = "Ninguna";
    }
    public String getAsignatura(){
        return asignatura;
    }
   public void setAsignatura(String asignatura){
       this.asignatura = asignatura;
   }
}
