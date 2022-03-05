package examen1poo;

public class avionCarga extends vehiculoAereo{
      private int volumenDisponible; 

      public avionCarga(){
          super("Avion de Carga", 128100, 137250, 0, 4, 830, 121); 
          //nombre, peso, capacidad de carga, helices, turbinas, velocidad maxima y numero de pasajeros
          volumenDisponible = 83; //Metros cubicos
      }

      public void setVolumen(int vol){
          volumenDisponible = vol;
          System.out.println("\n La capacidad del avion de carga es de: " + vol);
      }

      public void getVolumen(){
          System.out.println("\n La capacidad del avion es de: " + volumenDisponible);
      }

      public void calcularPrecioEspecifico(){
          float precioBase = calcularPrecioBase();
          float precioEspecifico = precioBase + volumenDisponible * 300;
          System.out.println("El Precio Especifico de este avion de carga es de: " + precioEspecifico);
      }

  
}



  
  
  
  
  
  
  
  
  


