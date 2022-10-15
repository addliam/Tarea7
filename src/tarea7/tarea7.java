
package tarea7;

public class tarea7 {
    
    public static void main (String[] args){
       
        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);        
        // Concentracion
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");delBosque.concentrarse();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");iniesta.concentrarse();
        System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");raulMartinez.concentrarse();
        // Viaje
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");delBosque.viajar();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");iniesta.viajar();
        System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");raulMartinez.viajar();
        // Entrenamiento
        System.out.println("\nEntrenamiento: Todos los integrantes tienen su funcion en un entrenamiento (Especializacion)");
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");delBosque.entrenamiento();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");iniesta.entrenamiento();
        System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");raulMartinez.entrenamiento();
        // Partido de futbol
        System.out.println("\nPartido de futbol: Todos los integrantes tienen su funcion en un partido (Especializacion)");
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");delBosque.partidoFutbol();
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");iniesta.partidoFutbol();
        System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");raulMartinez.partidoFutbol();
        // Planificar entrenamiento
        System.out.println("\nPlanificar entrenamiento: Solo el entrenador tiene el metodo para planificar un entrenamiento");
        System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
        ((Entrenador) delBosque).planificarEntrenamiento();
        // Entrevista
        System.out.println("\nEntrevista: Solo el futbolista tiene el metodo para dar una entrevista");
        System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
        ((Futbolista) iniesta).entrevista();
        // Masaje
        System.out.println("\nMasaje: Solo el masajista tiene el metodo para dar un masaje");
        System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");        
        ((Masajista) raulMartinez).darMasaje();
    }
}
