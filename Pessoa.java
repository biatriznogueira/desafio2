package desafio_spring2;

public class Pessoa {


   private String cpf;
    private String telefone;
   private String nome;
    private String email;



    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


    public Pessoa(String nome, String cpf, String telefone,String email){

        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;





    }
}
