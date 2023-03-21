package desafio_spring2;

public class BilheteEstudante extends Bilhete {
    private int cota = 0;


    public BilheteEstudante( Pessoa usuario){
        super(usuario);


    }


    public void recarregarBilhete(){
        cota = cota + 48;


    }

    public void pagarPassagem(){
        cota = cota - 1;

    }

    public String toString() {
        String dados = "";
        dados += "nome do usuario : " + this.usuario.getNome() + ("  ");
        dados += " codigo do bilhete : " + this.codigodoBilhete + ("  ");
        dados += " cota: " + this.cota + ("  ");

        return dados;
    }




}
