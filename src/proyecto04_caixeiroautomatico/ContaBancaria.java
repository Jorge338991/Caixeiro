package proyecto04_caixeiroautomatico;


import java.io.IOException;



public class ContaBancaria {
    
    //ATRIBUTOS
    private Cliente cliente;
    private int n_conta;
    private double saldo;
    private String[] movimientos;
    private int usados;
    
    //METODOS
    //CONSTRUCTOR
    public ContaBancaria(Cliente cliente, int n_conta, double saldo,int max_movimientos) throws IOException {
        this.cliente = cliente;
        this.n_conta = n_conta;
        this.saldo = saldo;
        this.movimientos = new String[max_movimientos];
        usados = 0;
        
        //leer_ficheiro();
    }
    
    //GETTERS Y SETTERS
    public String[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String[] movimientos) {
        this.movimientos = movimientos;
    }

    public int getUsados() {
        return usados;
    }

    public void setUsados(int usados) {
        this.usados = usados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getN_conta() {
        return n_conta;
    }

    public void setN_conta(int n_conta) {
        this.n_conta = n_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //OUTROS METODOS
    ///////////////////////////////////////////////////////////////////////////
    
    public String[] traerMovimientos(){
        
        String[] datos = new String[usados];
        
            for(int i=0;i<usados;i++){
                
                datos[i] = movimientos[i];
            }
        
        

        
        return datos;
               
           
    }
    
    public String consultarMovimientos(){
        
        int tamano = movimientos.length;

        System.out.println("Os espacios usados son: "+usados);
        
        //String array[] = new String[tamano];
        
        String Contenido = "";
        

        if(usados>0){
            for(int i=0;i<usados;i++){

                Contenido = Contenido+(i+1)+" -  "+movimientos[i]+"\n";

            }
        }        
        if(usados < tamano  ){
            movimientos[usados] = "CONSULTA DE MOVIMIENTOS";
            setUsados(usados+1);
            
        
        }
        
        System.out.println("incremento ejecutadoº");
        
        System.out.println(usados);
        
        
        return Contenido;
        
    }
    ////////////////////////////////////////////////////////////////////////////
    
    
    public void consultarInformacion(){
        
        int tamano = movimientos.length;

        
        
        if(usados < tamano ){
            movimientos[usados] = "CONSULTA DE INFORMACION";
            setUsados(usados+1);
            
        
        }else if(usados == tamano){//Cando esta cheo corremos o array unha posicion para atras e perdemos o da posicion 0
            
            
            for(int i=1; i<tamano;i++){
            
               movimientos[i-1] = movimientos[i];
                             
            }
            
            movimientos[tamano-1] = "CONSULTA DE INFORMACION";
            
        }
        
        
        
        
    }
    
    public void consultarSaldo(){
        
        int tamano = movimientos.length;

        
        
        if(usados < tamano ){
            movimientos[usados] = "CONSULTA DE SALDO";
            setUsados(usados+1);
            
        
        }else if(usados == tamano){//Cando esta cheo corremos o array unha posicion para atras e perdemos o da posicion 0
            
            
            for(int i=1; i<tamano;i++){
            
               movimientos[i-1] = movimientos[i];
                             
            }
            
            movimientos[tamano-1] = "CONSULTA DE SALDO";
            
        }
        
        
        
        
    }
    
    public void ingresarFondos(double cantidade){
        
        int tamano = movimientos.length;

        
        
        if(usados < tamano ){
            movimientos[usados] = "INGRESO DE FONDOS -- "+cantidade+" €";
            setUsados(usados+1);
            
        
        }else if(usados == tamano){//Cando esta cheo corremos o array unha posicion para atras e perdemos o da posicion 0
            
            
            for(int i=1; i<tamano;i++){
            
               movimientos[i-1] = movimientos[i];
                             
            }
            
            movimientos[tamano-1] = "INGRESO DE FONDOS -- "+cantidade+" €";
            
        }
        
        
        
        
    }
    
    
     public void retirarFondos(double cantidade){
        
        int tamano = movimientos.length;
        
        
        
        if(usados < tamano ){
            movimientos[usados] = "RETIRADA DE FONDOS -- "+cantidade+" €";
            setUsados(usados+1);
            
        
        }else if(usados == tamano){//Cando esta cheo corremos o array unha posicion para atras e perdemos o da posicion 0
            
            
            for(int i=1; i<tamano;i++){
            
               movimientos[i-1] = movimientos[i];
                             
            }
            
            movimientos[tamano-1] = "RETIRADA DE FONDOS -- "+cantidade+" €";
            
        }
        
        
        
        
    }
     
    
     
    
    
    
    
    

}
