public class Vuelo {
   private int numeroVuelo;
    private String destino;
    private int horaVuelo;
   private int numerodesillas;
   private String nombreAerolinea;

   //metodo contructor para crear un vuelo
   public Vuelo(int numeroVuelo, String destino, int horaVuelo, int numerodesillas , String nombreAerolinea) {
       this.numeroVuelo = numeroVuelo;
       this.destino = destino;
       this.horaVuelo = horaVuelo;
       this.numerodesillas = numerodesillas;
       this.nombreAerolinea = nombreAerolinea;
   }

   //metodo para obtener la informaicon de vuelos
   public int getNumeroVuelo() { return numeroVuelo; }
    public String getDestino() { return destino; }
    public int gethoraVuelo() { return horaVuelo; }
    public int getNumerodesillas() { return numerodesillas;}
    public String getnombreAerolinea(){ return nombreAerolinea; }

    public String toString(){
       return "numero de vuelo---" +numeroVuelo +",Destino---" +destino +"hora de vuelo---" +horaVuelo +"numero de sillas---"+numerodesillas +"nombre de vuelo---"+nombreAerolinea;}
    }

