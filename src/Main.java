/*
* Samuel Michels 04-oct-2022
*
* Proposta:Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança),
* as quais possuem as funcionalidades de
* depósito,
* saque
* e transferência
*
* (entre contas da própria instituição).
* */

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Boolean isContaEntrarValida = false;
        String decisao;

        double saldoTotal = 0, saldoContaCorrente = 0, saldoChequeEspecial = 0, saldoPoupança = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("BEM VINDO AO BANCO DIGITAL TE AMO \n 1.Entrar \n 2.cadastrar\n->");
        decisao = scan.nextLine();

        switch (decisao){
            case "1":
                System.out.println("ENTRAR");
                isContaEntrarValida = new EntrarConta().entrarConta();
            break;

            case "2":
                System.out.println("CADASTRAR");
                new CriarConta().criarConta();
                isContaEntrarValida = new EntrarConta().entrarConta();
            break;

        }

        if (isContaEntrarValida){
            System.out.println("Bem vindo!");



            while(isContaEntrarValida){
                System.out.println("Saldo:"+saldoTotal+" \n 1.Extrato Detalhado\n2.Sacar\n3.Depositar\n4.transferir");
                decisao = scan.nextLine();


            }
        }


    }

    public Double calcularCalcularLimiteInicialChequeEspecial(int scoreSerasa){
        Double valorDoChequeEspecial = 0.0;

        Random random = new Random();

        if (scoreSerasa <= 300){
            valorDoChequeEspecial =+ 300.0;
        } else if(scoreSerasa > 300 && scoreSerasa <=500){
            valorDoChequeEspecial =+ 550.0;
        } else if(scoreSerasa > 500 && scoreSerasa <=700){
            valorDoChequeEspecial =+ 1000.0;
        } else {
            valorDoChequeEspecial =+ 3500.0;
        }

        return valorDoChequeEspecial;
    }






}