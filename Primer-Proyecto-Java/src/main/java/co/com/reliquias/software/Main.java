package co.com.reliquias.software;





public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!, estoy aprendiendo java");
        
        Carro objetoCarro = new Carro();
        Carro objetoCarroConId = new Carro("Carro con id");

        objetoCarro.setId("Carro sin id, se cargo desde setId");

        objetoCarro.acelerar(1);
        objetoCarroConId.frenar(2);

        System.out.println(objetoCarro);
        System.out.println(objetoCarroConId);




    }
}