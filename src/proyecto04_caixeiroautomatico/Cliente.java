
package proyecto04_caixeiroautomatico;

public class Cliente {
    
    private String nome;
    private String apelidos;
    private String dni;

    public Cliente(String nome, String apelidos, String dni) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    

}
