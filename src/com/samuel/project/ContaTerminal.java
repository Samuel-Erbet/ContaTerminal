package com.samuel.project;
import java.util.Scanner;

public class ContaTerminal{
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

   

   
    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
    


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public ContaTerminal(int numero, String agencia, String nomeCliente,
    double saldo){

        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
        +agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("insira o numero do banco:");
        numero = scanner.nextInt();
        
        scanner.nextLine();

        System.out.println("insira o numero da agencia:");
        agencia = scanner.nextLine();
        
        System.out.println("insira o nome do cliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("insira o saldo da conta:");
        saldo = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

         
        scanner.close();
    }
}