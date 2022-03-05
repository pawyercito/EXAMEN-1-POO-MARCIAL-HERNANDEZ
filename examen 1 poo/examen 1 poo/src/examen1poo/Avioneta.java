package examen1poo;

public class Avioneta extends vehiculoAereo{
    private float coeficienteDeAerodinamismo; /*Numero entre 0 y 1 el cual determina lo eficiente que es la avioneta
    al momento de volar en el aire, siendo 0 muy ineficiente y 1 muy eficiente*/

    public Avioneta(){
        super("Avioneta", 680, 325, 1, 0, 193, 2); 
        //nombre, peso, capacidad de carga, helices, turbinas, velocidad maxima y numero de pasajeros
        coeficienteDeAerodinamismo = 0.5f; 
    }

    public void setAero(float aero){
        coeficienteDeAerodinamismo = aero;
        System.out.println("Ahora el coeficiente de aerodinamismo es de: " + aero);
    }

    public void getAero(){
        System.out.println("El aerodinamismo de la avioneta es de: " + coeficienteDeAerodinamismo);
    }

    public void calcularPrecioEspecifico(){
        float precioBase = calcularPrecioBase();
        float precioEspecifico = precioBase + coeficienteDeAerodinamismo * 175;
        System.out.println("El Precio Especifico de este avion de carga es de: " + precioEspecifico);
    }
}


