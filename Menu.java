package desafio_spring2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    static List<Bilhete> bilhetes = new ArrayList<>();
    static List<Pessoa> pessoas = new ArrayList<>();




    public void menu(){
        String codigodoBilhete;
        String guardarCodigo;
        int guardarTipodeBilhete;
        int opcaos = 0;


        do {
            System.out.println("-----Menu Principal-----");
            System.out.println("Informe a opção desejada ou 99 para sair: ");
            System.out.println("1 = Cadastrar Usuario: ");
            System.out.println("2 = Cadastrar Bilhete: ");
            System.out.println("3 = Recarregar Bilhete: ");
            System.out.println("4 = Pagar Passagem: ");
            System.out.println("5 = Listar Bilhete: ");
            System.out.println("6 = Pesquisar Bilhete por CPF: ");

            try {
                opcaos = input.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Valor invalido! Tente novamente. ");
                input.next();
            }
            switch (opcaos){

                case 1:

                    System.out.println("1 = Cadstrar usuario: ");
                    input.nextLine();

                    System.out.println("Digite o nome: ");
                    String nome = input.nextLine();

                    System.out.println("Digite o CPF: ");
                    String cpf = input.nextLine();

                    System.out.println(" Digite o telefone: ");
                    String telefone = input.nextLine();

                    System.out.println("Digite o email: ");
                    String email = input.nextLine();





                    Pessoa pessoa = new Pessoa(nome, cpf,telefone, email);
                    pessoas.add(pessoa);
                    break;

                case 2:
                    System.out.println(" 2= Cadastrar Bilhete ");
                    input.nextLine();

                    System.out.println("Insira Seu CPF");
                    String Cpf = input.nextLine();
                    Pessoa p1 = null;
                    boolean achou = false;
                    for (Pessoa p: pessoas) {
                        if (Cpf.equals(p.getCpf())) {
                            p1 = p;
                            achou = true;

                        }
                    }
                    if (!achou) {
                        System.out.println("CPF invalido. Tente Novamente");


                    } else {

                        System.out.println("Qual Tipo de Bilhete voce deseja obter?");
                        System.out.println("1 = Bilhete Estudante");
                        System.out.println("2 = Bilhete Padrao");
                        guardarTipodeBilhete = input.nextInt();
                        Bilhete b1;
                        if (guardarTipodeBilhete == 1) {
                            b1 = new BilheteEstudante(p1);
                            System.out.println("Bilhete de Estudante Cadastrado! ");

                        } else {
                            b1 = new BilheteUnico(p1);
                            System.out.println("Bilhete Unico Cadastrado! ");
                        }
                        bilhetes.add(b1);

                    }


                    break;

                case 3:
                    System.out.println(" 3= Recarregar Bilhete ");
                    System.out.println(" Insira o Codigo do Bilhete ");
                    input.nextLine();
                    guardarCodigo = input.nextLine();

                    Bilhete guardarBilhete = null;
                    boolean achouBilhete = false;
                    for (Bilhete b : bilhetes) {


                        if (b.codigodoBilhete.equals(guardarCodigo)) {
                            guardarBilhete = b;
                            achouBilhete = true;
                        }
                    }

                    if (!achouBilhete) {
                        System.out.println("Codigo invalido. Tente Novamente");
                    } else {

                        if (guardarBilhete instanceof BilheteEstudante) {

                            guardarBilhete.recarregarBilhete();
                            System.out.println("Bilhete recarregado! ");

                        } else {
                            System.out.println("Informe o valor que Deseja Recarregar");

                            double guardarValor = input.nextDouble();
                            guardarBilhete.recarregarBilhete(guardarValor);

                            System.out.println("Bilhete recarregado! ");
                        }
                    }
                    break;

                case 4:
                    achou = false;
                    input.nextLine();
                    System.out.println("Informe Seu Código: ");
                    String codigoDobilhete = input.nextLine();
                    guardarBilhete = null;
                    for (Bilhete value : bilhetes) {
                        if (codigoDobilhete.equals(value.getCodigodoBilhete())) {
                            guardarBilhete = value;
                            achou = true;
                        }
                    }
                    if (achou == false) {


                        System.out.println("Código Inválido. Tente outro Código: ");

                    } else {
                        guardarBilhete.pagarPassagem();
                        System.out.println("Passagem paga");
                    }
                    break;

                case 5:
                    System.out.println(" 5= Listar Bilhetes");
                    input.nextLine();

                    System.out.println("Está é a sua lista de Bilhetes");
                    for (Bilhete bilhete : bilhetes) {
                        System.out.println(bilhete);

                    }
                    break;

                case 6:
                    System.out.println(" 6= Pesquisar Bilhete Por CPF");
                    String nada = input.nextLine();
                    System.out.println("Digite o CPF cadastrado no bilhete: ");
                    String salvarCpf = input.nextLine();

                    Bilhete salvar = null;
                    boolean achei = false;

                    for (Bilhete bilhete : bilhetes) {
                        if (salvarCpf.equals(bilhete.getUsuario().getCpf())) {
                            salvar = bilhete;
                            achei = true;
                        }
                    }


                    if (achei == true)
                        System.out.println("Este é o seu Bilhete! " + salvar);
                    else
                        System.out.println("CPF não encontrado.");
                    break;


            }

        }while (opcaos != 99);

































    }


}
