package examen1poo;

public class avionPasajero extends vehiculoAereo{
      private int calidadAsientos; 

      public avionPasajero(){
          super("Avion de Pasajeros", 680, 325, 1, 0, 193, 2); 
          //nombre, peso, capacidad de carga, helices, turbinas, velocidad maxima y numero de pasajeros, siguiendo el orden de cada uno
          calidadAsientos = 5; 
      }

      public void setCalidad(int cal){
          calidadAsientos = cal;
          System.out.println("Ahora la calidad de los asientos es de: " + cal);
      }
 //Esto para mencionar la calidad de los asientos METODOS SETTER Y GETTER
      
      public void getCalidad(){
          System.out.println("La calidad de los asientos de este avion de pasajeros es de: " + calidadAsientos);
      }

      public void calcularPrecioEspecifico(){
          float precioBase = calcularPrecioBase();
          float precioEspecifico = precioBase + calidadAsientos * 250;
          System.out.println("El Precio especifico de este avion de carga es de: " + precioEspecifico);
      }
  }
