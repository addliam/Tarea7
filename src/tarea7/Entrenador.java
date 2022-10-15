
package tarea7;


public class Entrenador extends SeleccionFutbol {
    
    private int idFederacion;

    public Entrenador(){
        super();
    }    
    
    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.setIdFederacion(idFederacion);        
    }
    

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    

    @Override
    public void entrenamiento(){
        System.out.println("dirige un entrenamiento (clase entrenador)");}
    
    @Override
    public void partidoFutbol(){
        System.out.println("dirige el partido (clase entrenador)");}
    
    public void planificarEntrenamiento (){
        System.out.println("Planificar entrenamiento "); }
 
}
