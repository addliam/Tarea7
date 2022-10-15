
package tarea7;


public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int añosExperiencia;

    public Masajista(){
        super();
    }    
    
    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int añosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    
    @Override
    public void entrenamiento(){
        System.out.println("de asistencia en el entrenamiento (clase masajista)"); }
    
    public void darMasaje(){
            System.out.println("da un masaje");
    }
            
}
