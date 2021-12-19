package com.letscode.Class06.Banco;

public class Conta {

  private String nomeCliente;
  private long numero;
  private double saldo;

  //O cliente deve ter obrigatoriamente:(Construtor)
  public Conta(String nomeCliente, long numero) {

    this.nomeCliente = nomeCliente;
    this.numero = numero;

  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public long getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {

    if (saldo > 0 ) {
      this.saldo = saldo;
    } else {
      System.out.println("Saldo informado inválido");
    }

  }

  public boolean sacar(double valor) {

    if (isSaldoSuficiente(valor) && valor > 0) {
      this.saldo -= valor;
      return true;
    } else {
      System.out.println("Valor insuficiente");
      return false;
    }

  }

  public double depositar(double valor) {
    this.saldo += valor;
    return valor;
  }

  private boolean isSaldoSuficiente(double valor) {

    if (this.saldo > valor) {
      return true;
    } else {
      return false;
    }

  }

  //Método toString para sobreescrever o método pradão do toString do java, onde que ele impedir que imprimemos os
  // valores do nosso objeto.
  @Override
  public String toString() {
    return "Conta{" +
            "nomeCliente='" + nomeCliente + '\'' +
            ", numero=" + numero +
            ", saldo=" + saldo +
            '}';
  }
}
