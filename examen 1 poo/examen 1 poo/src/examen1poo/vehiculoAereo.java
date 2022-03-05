package examen1poo;
public class vehiculoAereo {
	  
    private String modelo;
    private float peso;
    private float cargaMaxima;
    private int numeroHelices;
    private int numeroTurbinas;
    private int velocidadMaxima;
    private int numeroPasajeros;
    private boolean encendido = false;
    private boolean enAire = false;

    public vehiculoAereo(String modelo, float peso, float cargaMaxima, int numeroHelices, int numeroTurbinas, int velocidadMaxima, int numeroPasajeros){
        this.modelo = modelo;
        this.peso = peso;
        this.cargaMaxima = cargaMaxima;
        this.numeroHelices = numeroHelices;
        this.numeroTurbinas = numeroTurbinas;
        this.velocidadMaxima = velocidadMaxima;
        this.numeroPasajeros = numeroPasajeros;
    }

    //SETTERS
    public void setPeso(float pes){
        peso = pes;
        System.out.println("el peso es de: " + pes);
    }

    public void setHelices(int hel){
        numeroHelices = hel;
        System.out.println("el numero de helices es de: " + hel);
    }

    public void setTurbinas(int tur){
        numeroTurbinas = tur;
        System.err.println("el numero de turbinas es de: " + tur);
    }

    public void setVelM(int maxi){
        velocidadMaxima = maxi;
        System.out.println("la velocidad maxima es de: " + maxi);
    }

    public void setPasajeros(int pasa){
        numeroPasajeros = pasa;
        System.out.println("el numero de pasajeros es de: " + pasa);;
    }

    public void setCargaMaxima(float car){
        cargaMaxima = car;
        System.out.println("la carga maxima es de: " + car);
    }

    //METODOS
    public void encender(){
        if(encendido){
            System.out.println("El vehiculo aereo ya esta encendido");
        }
        else{
            System.out.println("Encendiendo el vehiculo");
            encendido = true;
        }
    }

    public void apagar(){
        if(encendido == false){
            System.out.println("El vehiculo aereo ya esta apagado");
            return;
        }
        if(enAire){
            System.out.println("NO SE PUEDE APAGAR UN VEHICULO AEREO EN EL AIRE >:(");
        }
        else{
            encendido = false;
        }
    }

    public void despegar(){
        if(enAire){
            System.out.println("El vehiculo aereo ya despego");
            return;  
        }

        if(encendido == false){
            System.out.println("No se puede despegar con el vehiculo apagado :C, prendelo porfa");
        }

        else{
            System.out.println("Despegando");
            enAire = true;
        }
    }

    public void aterrizar(){
        if(enAire == false){
            System.out.println("El vehiculo aereo ya esta en tierra");
            return;
        }

        System.out.println("Dirigiendose a tierra");
        enAire = false;
    }

    //GETTERS ESPECIALES :)
    //GETTER GENERAL PARA IMPRESION DE DATOS
    public void imprimirCaracteristicas(){
        System.out.println("El modelo del vehiculo es: " + modelo);
        System.out.println("El peso del vehiculo es: " + peso);
        System.out.println("La carga maxima del vehiculo es: " + cargaMaxima);
        System.out.println("El numero de helices del vehiculo es: " + numeroHelices);
        System.out.println("El numero de turbinas del vehiculo es: " + numeroTurbinas);
        System.out.println("La velocidad maxima del vehiculo es: " + velocidadMaxima);
        System.out.println("La capacidad maxima de pasajeros del vehiculo es: " + numeroPasajeros);
    }

    //GETTER PARA EL CALCULO DEL PRECIO DEL VEHICULO
    public float calcularPrecioBase(){
        float precio = 50 * peso + 20 * cargaMaxima + 4* numeroPasajeros; 
        return precio;
    }

}