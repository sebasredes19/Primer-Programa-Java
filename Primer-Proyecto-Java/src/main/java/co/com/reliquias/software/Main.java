package co.com.reliquias.software;


import informacionRestaurante.EstudianteCarnivoro;
import informacionRestaurante.EstudianteVegetariano;
import informacionRestaurante.RestauranteU;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Sebastian", "Espinosa",27, 123, 5f);
        estudiante.mostrarDatosPersonalesEstudiante();


        RestauranteU estudianteRestaurante = new RestauranteU("Carlos", "Valencia", 53,321,"Preferencial");
        estudianteRestaurante.mostrarInformacionEstudianteRestaurante();


        EstudianteCarnivoro comidaCarnivoros = new EstudianteCarnivoro();
        comidaCarnivoros.alimentarse();


        EstudianteVegetariano comidaVegetarianos = new EstudianteVegetariano();
        comidaVegetarianos.alimentarse();
    }

}