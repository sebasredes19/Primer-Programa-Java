package co.com.reliquias.software;

public class Carro {
    private String id;

    private String color;

    private int velocidad;


    public Carro()
    {

    }
    public Carro(String id)
    {
        this.id = id;

    }

    public Carro(String id, String color)
    {
        this.id = id;
        this.color = color;
    }

    public void setId(String id)
    {
        this. id = id;
    }

    public float acelerar(int aceleracion)
    {
        return velocidad += aceleracion; //velocidad = velocidad + aceleracion
    }

    public float frenar(int aceleracion)
    {
        return velocidad = velocidad - aceleracion;
    }
/*
    sobreescritura de funcionalidad toString
 */
    @Override
    public String toString() {
        return "Carro{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
