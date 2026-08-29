
package constructoreswt;


public class Estudiante extends Persona{
   
    private String carrera="";
    
    public Estudiante(String nombre, int edad, String carrera) {
    super(nombre, edad);
    this.carrera = carrera;
    }
    public Estudiante(String nombre, int edad) {
    super(nombre, edad);
    }
    public Estudiante(String nombre, String carrera) {
    super(nombre);
    this.carrera = carrera;
    }
    public Estudiante(String nombre) {
    super(nombre);
    }
    public Estudiante(int edad, String carrera) {
    super(edad);
    this.carrera = carrera;
    }
    public Estudiante(int edad) {
    super(edad);
    }
    public Estudiante() {
    this.carrera = "Ninguna";
    }
    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
}
