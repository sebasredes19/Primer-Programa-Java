package informacionRestaurante;

import co.com.reliquias.software.Persona;

public class RestauranteU extends Persona {

    private int codigoRestaurante;
    public String nivelAsistencia;

    public RestauranteU(String nombre,  String apellido, int edad, int codigoRestaurante, String nivelAsistencia ){
        super(nombre,apellido,edad);
        this.codigoRestaurante = codigoRestaurante;
        this.nivelAsistencia = nivelAsistencia;

    }

    public  void mostrarInformacionEstudianteRestaurante(){
        System.out.println("Nombre: "+getNombre() +
                "\nApellido :"+getApellido() +
                "\nEdad: "+getEdad() +
                "\nCodigo Restaurante: "+codigoRestaurante +
                "\nNivel Asistencia: "+nivelAsistencia
        );
    }
}
