package examen1poo;

import java.util.Scanner;


public class Codigo {
  
   public static void main(String[] args) throws Exception{
          Scanner input = new Scanner(System.in);
          int opcion, opcion2;
          float set1;
          int set2;
          char continuar;

          System.out.println("COMENZANDO LA CREACION DE UN VEHICULO AEREO");
          System.out.println("SISTEMAS LISTOS, DIGITE EL VEHICULO A CREAR:");
          System.out.println("\t1. Avion de Carga");
          System.out.println("\t2. Avioneta");
          System.out.println("\t3. Avion de Pasajeros");
          System.out.println("\t4. Helicoptero");
          System.out.println("Opcion: ");

          opcion = input.nextInt();



          switch(opcion){
              case 1:
                  System.out.println("Creando un avion de carga");
                  avionCarga slinky = new avionCarga();
                  System.out.println("Avion de carga creado con exito");
                  System.out.println("FASE DE MODIFICACIONES:");
                  while(true){
                      System.out.println();
                      System.out.println("Caracteristicas a Cambiar: ");
                      System.out.println("1. Peso");
                      System.out.println("2. Carga Maxima");
                      System.out.println("3. Numero Helices");
                      System.out.println("4. Numero Turbinas");
                      System.out.println("5. Velocidad Maxima");
                      System.out.println("6. Numero Pasajeros");
                      System.out.println("7. Volumen Disponible");
                      System.out.println("8. Ninguno");
                      System.out.println("Opcion: ");
                      opcion2 = input.nextInt();

                      switch(opcion2){
                          case 1:
                              System.out.println("Modificando el peso: ");
                              set1 = input.nextFloat();
                              slinky.setPeso(set1);
                              break;

                          case 2:
                              System.out.println("Modificando la Carga Maxima: ");
                              set1 = input.nextFloat();
                              slinky.setCargaMaxima(set1);
                              break;

                          case 3:
                              System.out.println("Modificando el Numero de Helices: ");
                              set2 = input.nextInt();
                              slinky.setHelices(set2);
                              break;

                          case 4:
                              System.out.println("Modificando el Numero de Turbinas: ");
                              set2 = input.nextInt();
                              slinky.setTurbinas(set2);
                              break;

                          case 5:
                              System.out.println("Modificando la velocidad maxima: (ES UN ENTERO)");
                              set2 = input.nextInt();
                              slinky.setVelM(set2);
                              break;

                          case 6:
                              System.out.println("Modificando el numero maximo de pasajeros: ");
                              set2 = input.nextInt();
                              slinky.setPasajeros(set2);
                              break;

                          case 7:
                              System.out.println("Modificando el volumen maximo disponible: (ES UN ENTERO)");
                              set2 = input.nextInt();
                              slinky.setVolumen(set2);
                              break;

                          case 8:
                              break;

                          default:
                          System.out.println("Opcion Invalida");
                          continue;


}
                      System.out.println("Desea seguir realizando cambios: (Y/y)?");
                      continuar = input.next().charAt(0);

                      if(continuar != 'Y' && continuar != 'y'){
                          break;
                      }

                  }
                  slinky.imprimirCaracteristicas();
                  slinky.calcularPrecioEspecifico();
                  break;

              case 2:
                  System.out.println("Creando la avioneta");
                  Avioneta blinky = new Avioneta();
                  System.out.println("Avioneta creada satisfactoriamente");
                  System.out.println("FASE DE MODIFICACIONES:");
                  while(true){
                      System.out.println();
                      System.out.println("Caracteristicas a Cambiar: ");
                      System.out.println("1. Peso");
                      System.out.println("2. Carga Maxima");
                      System.out.println("3. Numero Helices");
                      System.out.println("4. Numero Turbinas");
                      System.out.println("5. Velocidad Maxima");
                      System.out.println("6. Numero Pasajeros");
                      System.out.println("7. Coeficiente de Aerodinamismo");
                      System.out.println("8. Ninguno");
                      System.out.println("Opcion: ");
                      opcion2 = input.nextInt();

                      switch(opcion2){
                          case 1:
                              System.out.println("Modificando el peso: ");
                              set1 = input.nextFloat();
                              blinky.setPeso(set1);
                              break;

                          case 2:
                              System.out.println("Modificando la Carga Maxima: ");
                              set1 = input.nextFloat();
                              blinky.setCargaMaxima(set1);
                              break;

                          case 3:
                              System.out.println("Modificando el Numero de Helices: ");
                              set2 = input.nextInt();
                              blinky.setHelices(set2);
                              break;

                          case 4:
                              System.out.println("Modificando el Numero de Turbinas: ");
                              set2 = input.nextInt();
                              blinky.setTurbinas(set2);
                              break;

                          case 5:
                              System.out.println("Modificando la velocidad maxima: (CUIDADO, ES UN ENTERO)");
                              set2 = input.nextInt();
                              blinky.setVelM(set2);
                              break;

                          case 6:
                              System.out.println("Modificando el numero maximo de pasajeros: ");
                              set2 = input.nextInt();
                              blinky.setPasajeros(set2);
                              break;

                          case 7:
                              System.out.println("Modificando el volumen maximo disponible: (CUIDADO, ES UN ENTERO)");
                              set1 = input.nextFloat();
                              blinky.setAero(set1);
                              break;

                          case 8:
                              break;

                          default:
                          System.out.println("Opcion Invalida");
                          continue;

                      }
                      System.out.println("Desea seguir realizando cambios: (Y/y)?");
                      continuar = input.next().charAt(0);

                      if(continuar != 'Y' && continuar != 'y'){
                          break;
                      }


}
                  blinky.imprimirCaracteristicas();
                  blinky.calcularPrecioEspecifico();
                  break;

              case 3:
                  System.out.println("Creando un avion de pasajeros");
                  avionPasajero clinky = new avionPasajero();
                  System.out.println("Avion de pasajeros creado con exito");
                  System.out.println("ENTRANDO EN FASE DE MODIFICACIONES:");
                  while(true){
                      System.out.println();
                      System.out.println("Caracteristicas a Cambiar: ");
                      System.out.println("1. Peso");
                      System.out.println("2. Carga Maxima");
                      System.out.println("3. Numero Helices");
                      System.out.println("4. Numero Turbinas");
                      System.out.println("5. Velocidad Maxima");
                      System.out.println("6. Numero Pasajeros");
                      System.out.println("7. Calidad Asientos");
                      System.out.println("8. Ninguno");
                      System.out.println("Opcion: ");
                      opcion2 = input.nextInt();

                      switch(opcion2){
                          case 1:
                              System.out.println("Modificando el peso: ");
                              set1 = input.nextFloat();
                              clinky.setPeso(set1);
                              break;

                          case 2:
                              System.out.println("Modificando la Carga Maxima: ");
                              set1 = input.nextFloat();
                              clinky.setCargaMaxima(set1);
                              break;

                          case 3:
                              System.out.println("Modificando el Numero de Helices: ");
                              set2 = input.nextInt();
                              clinky.setHelices(set2);
                              break;

                          case 4:
                              System.out.println("Modificando el Numero de Turbinas: ");
                              set2 = input.nextInt();
                              clinky.setTurbinas(set2);
                              break;

                          case 5:
                              System.out.println("Modificando la velocidad maxima: (ES UN ENTERO)");
                              set2 = input.nextInt();
                              clinky.setVelM(set2);
                              break;

                          case 6:
                              System.out.println("Modificando el numero maximo de pasajeros: ");
                              set2 = input.nextInt();
                              clinky.setPasajeros(set2);
                              break;

                          case 7:
                              System.out.println("Modificando el volumen maximo disponible: (ES UN ENTERO)");
                              set2 = input.nextInt();
                              clinky.setCalidad(set2);
                              break;

                          case 8:
                              break;

                          default:
                          System.out.println("Opcion Invalida");
                          continue;

                      }
                      System.out.println("Desea seguir realizando cambios: (Y/N)?");
                      continuar = input.next().charAt(0);

                      if(continuar != 'Y' && continuar != 'y'){
                          break;
                      }

                  }
                  clinky.imprimirCaracteristicas();
                  clinky.calcularPrecioEspecifico();
                  break;


case 4:
                  System.out.println("Creando un Helicoptero");
                  Helicoptero dlinky = new Helicoptero();
                  System.out.println("Avion de pasajeros creado con exito");
                  System.out.println("ENTRANDO EN FASE DE MODIFICACIONES:");
                  while(true){
                      System.out.println();
                      System.out.println("Caracteristicas a Cambiar: ");
                      System.out.println("1. Peso");
                      System.out.println("2. Carga Maxima");
                      System.out.println("3. Numero Helices");
                      System.out.println("4. Numero Turbinas");
                      System.out.println("5. Velocidad Maxima");
                      System.out.println("6. Numero Pasajeros");
                      System.out.println("7. Aceleracion Inmediata");
                      System.out.println("8. Ninguno");
                      System.out.println("Opcion: ");
                      opcion2 = input.nextInt();

                      switch(opcion2){
                          case 1:
                              System.out.println("Modificando el peso: ");
                              set1 = input.nextFloat();
                              dlinky.setPeso(set1);
                              break;

                          case 2:
                              System.out.println("Modificando la Carga Maxima: ");
                              set1 = input.nextFloat();
                              dlinky.setCargaMaxima(set1);
                              break;

                          case 3:
                              System.out.println("Modificando el Numero de Helices: ");
                              set2 = input.nextInt();
                              dlinky.setHelices(set2);
                              break;

                          case 4:
                              System.out.println("Modificando el Numero de Turbinas: ");
                              set2 = input.nextInt();
                              dlinky.setTurbinas(set2);
                              break;

                          case 5:
                              System.out.println("Modificando la velocidad maxima: (CUIDADO, ES UN ENTERO)");
                              set2 = input.nextInt();
                              dlinky.setVelM(set2);
                              break;

                          case 6:
                              System.out.println("Modificando el numero maximo de pasajeros: ");
                              set2 = input.nextInt();
                              dlinky.setPasajeros(set2);
                              break;

                          case 7:
                              System.out.println("Modificando el volumen maximo disponible: (CUIDADO, ES UN ENTERO)");
                              set1 = input.nextFloat();
                              dlinky.setAcce(set1);
                              break;
                          
                          case 8: break;

                          default:
                          System.out.println("Opcion Invalida");
                          continue;

                      }
                      System.out.println("Desea seguir realizando cambios: (Y/y)?");
                      continuar = input.next().charAt(0);

                      if(continuar != 'Y' && continuar != 'y'){
                          break;
                      }

                  }
                  dlinky.imprimirCaracteristicas();
                  dlinky.calcularPrecioEspecifico();
                  break;

              default:
                  System.out.println("Entrada invalida, finalizando el programa");
                  input.close();
                  return;
          }
          System.out.println("PROGRAMA EJECUTADO DE MANERA SATISFACTORIA, PULSE ENTER PARA TERMINAR");
          input.next();


          input.close();

      }
  
  
  
  
  
  
  
  
  
  
  

}
