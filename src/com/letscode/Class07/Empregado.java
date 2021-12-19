package com.letscode.Class07;

import java.math.BigDecimal;

public class Empregado {

  //Atributos
  private String nome;
  private int matricula;
  private BigDecimal salario;

  //Construtor
  public Empregado(String nome, int matricula, BigDecimal salario) {
    this.nome = nome;
    this.matricula = matricula;
    this.salario = salario;
  }

  //Getters & Setters
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getMatricula() {
    return matricula;
  }
  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public BigDecimal getSalario() {
    return salario;
  }
  public void setSalario(BigDecimal salario) {
    this.salario = salario;
  }

  //Métodos
  public void baterPonto() {
    System.out.println("Bater ponto...");
  }

  public void trabalhar() {
    System.out.println("Trabalhar...");
  }

  @Override
  public String toString() {
    return "Empregado{" +
            "nome='" + nome + '\'' +
            ", matricula=" + matricula +
            ", salario=" + salario +
            '}';
  }
}
