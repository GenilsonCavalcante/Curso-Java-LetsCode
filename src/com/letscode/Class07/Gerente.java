package com.letscode.Class07;

//OBS: Quando extendemos uma outra classe que possui um método construtor, acusará um erro na classe que está
// herdando esse método construtor, pelo motivo dela não estar pegando os valores do parâmetro. Logo, devemos
// declarar novamente o construtor aqui, e passar os parâmetros para que esta consiga funcionar. Pois o método
// construtor dessa classe é o método padrão, que vem vazio e não o que foi herdado.


/*
* Um método é formado por:
* visibilidade, retorno, nome, parâmetros
*
* Visibilidade => public, final, protect, private, default
* Retorno => void, boolean, String, int, Pessoa(um tipo objeto)...
* Nome => Nome dado ao método
* Parâmetros => parâmetros dados ao método
* */


/*
* Métodos de sobrecarga:
* Métodos que possuem o mesmo nome mas tipos de retornos diferentes, são métodos completamente diferentes, assim como
*  também esses métodos terem parâmetros diferentes;
* EXEMPLOS de MÈTODOS DIFERENTES:
*
* public void alterarCanal() {
*   System.out.println("Trocou de canal");
* }
*
* public void alterarCanal(int numeroDoCanal) {
*   System.out.println("Trocou de canal para " + numeroDoCanal);
* }
*
* public void alterarCanal(int numeroDoCanal, String modeloDoAparelho) {
*   System.out.println("Trocou de canal para " + numeroDoCanal + " do modelo " + modeloDoAparelho);
* }
*
* E dessa forma podemos chamar cada um desses canais diferentemente, o primeiro apenas instanciamos, o segund além de
*  instaciarmos, devemos passar um parâmetro e para chamar o terceiro devemos chamar os dois parâmetros.
* */

import java.math.BigDecimal;

public class Gerente extends Empregado {

  private int contVendedores;
  private Vendedor[] vendedores;

  public Gerente(String nome, int matricula, BigDecimal salario) {

    super(nome, matricula, salario);//SUPER - Herda os parâmetros da classe pai. E só pode ser usado na primeira
    // linha do construtor.

    this.vendedores = new Vendedor[10];
  }

  @Override//Sobreescrita do método pai.
  public void baterPonto() {
    System.out.println("Gerente bateu ponto");
  }

  //Getters & Setters


  public int getContVendedores() {
    return contVendedores;
  }

  public void setContVendedores(int contVendedores) {
    this.contVendedores = contVendedores;
  }

  public Vendedor[] getVendedores() {
    return vendedores;
  }

  public void setVendedores(Vendedor[] vendedores) {
    this.vendedores = vendedores;
  }

  //Métodos
  public void contratar(Vendedor novoVendedor) {
    this.vendedores[contVendedores] = novoVendedor;
    this.contVendedores++;
  }
  public void demitir(int indiceDoEmpregado) {
    this.vendedores[indiceDoEmpregado] = null;
    this.contVendedores--;

  }


}
