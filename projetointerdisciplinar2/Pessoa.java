public abstract class Pessoa  {
    
    private String nome;
    private String cpf;
    private int dataNascimento;

    Pessoa(String n, String c, int d){
        nome = n;
        cpf = c;
        dataNascimento = d;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public abstract String toString();
    
  
    

    
}