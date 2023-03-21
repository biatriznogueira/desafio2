package desafio_spring2;

import java.util.Random;

public class Bilhete {


protected String codigodoBilhete;
protected Pessoa usuario;


    public Bilhete( Pessoa usuario) {
        this.codigodoBilhete = gerarCodigo();
        this.usuario = usuario;

}

    public Pessoa getUsuario() {
        return usuario;
    }

    public String getCodigodoBilhete() {
        return codigodoBilhete;
    }


    public void pagarPassagem(){

    }

    public void recarregarBilhete(){

    }

    public void pisquisarBilhetePorCpf(){

    }
    public void recarregarBilhete(double valor){

    }


    public String gerarCodigo() {
        double bilhete;


        Random random = new Random();
        bilhete = (int) (random.nextDouble() * 1000);
        return String.valueOf(bilhete);

    }












}