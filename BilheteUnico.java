package desafio_spring2;

import java.util.Random;

public class BilheteUnico extends Bilhete {

private double saldo;

    public BilheteUnico( Pessoa usuario) {
     super(usuario);
        this.saldo = saldo;


    }

    public void recarregarBilhete(double valor) {
        saldo = valor + saldo;




    }
    public void pagarPassagem () {
        saldo = saldo - 5;


    }

    public void pesquisarBilhetePorCpf() {


    }


    @Override
    public String toString() {
        String dados = "";
        dados += "nome do usuario : " + this.usuario.getNome() + ("  ");
        dados += " codigo do bilhete : " + this.codigodoBilhete + ("  ");
        dados += " saldo: " + this.saldo + ("  ");


        return dados;

    }
}