package Section3;

import javax.swing.JOptionPane;

public class Pessoa {
  /* Fazendo a entrada de dados */

  /* Nome, idade e comida // Getters e Setters */
  private String nome;
  private int anonascimento;
  private String anonascim;
  private int anoatual;
  private String Currentyear;
  private String comida;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAnonascimento() {
    return anonascimento;
  }

  public void setAnonascimento(int anonascimento) {
    this.anonascimento = anonascimento;
  }

  public String getAnonascim() {
    return anonascim;
  }

  public void setAnonascim(String anonascim) {
    this.anonascim = anonascim;
  }

  public int getAnoatual() {
    return anoatual;
  }

  public void setAnoatual(int anoatual) {
    this.anoatual = anoatual;
  }

  public String getCurrentyear() {
    return Currentyear;
  }

  public void setCurrentyear(String currentyear) {
    Currentyear = currentyear;
  }

  public String getComida() {
    return comida;
  }

  public void setComida(String comida) {
    this.comida = comida;
  }

  /* Altura e lugar dos sonhos // Getters e Setters */
  private float altura;
  private String Size;
  private String lugarsonhos;

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public String getSize() {
    return Size;
  }

  public void setSize(String size) {
    Size = size;
  }

  public String getLugarsonhos() {
    return lugarsonhos;
  }

  public void setLugarsonhos(String lugarsonhos) {
    this.lugarsonhos = lugarsonhos;
  }

  /* Profissão e salário // Getters e Setters */
  private String profissao;
  private double salario;
  private String payment;

  public String getProfissao() {
    return profissao;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }

  /*
   * Dinheiro a guardar para a viajem e também o(s) ano(s) que irá juntar o
   * dinheiro
   */

  private String anosguardando;
  private double valorguardado;
  private double valorguardandomes;
  private String valorguardar;

  public String getAnosguardando() {
    return anosguardando;
  }

  public void setAnosguardando(String anosguardando) {
    this.anosguardando = anosguardando;
  }

  public double getValorguardado() {
    return valorguardado;
  }

  public void setValorguardado(double valorguardado) {
    this.valorguardado = valorguardado;
  }

  public double getValorguardandomes() {
    return valorguardandomes;
  }

  public void setValorguardandomes(double valorguardandomes) {
    this.valorguardandomes = valorguardandomes;
  }

  public String getValorguardar() {
    return valorguardar;
  }

  public void setValorguardar(String valorguardar) {
    this.valorguardar = valorguardar;

  }

  public void Dados() {
    /* Entrada de dados no JOptionPanel */
    nome = JOptionPane.showInputDialog("Digite o seu nome: ");
    anonascim = JOptionPane.showInputDialog("Digite o ano em que você nasceu: ");
    anonascimento = Integer.parseInt(anonascim);
    Currentyear = JOptionPane.showInputDialog("Digite o ano atual: ");
    anoatual = Integer.parseInt(Currentyear);
    Size = JOptionPane.showInputDialog("Digite a sua altura(em metros): ");
    altura = Float.parseFloat(Size);
    lugarsonhos = JOptionPane.showInputDialog("Digite o lugar que você deseja conhecer: ");
    profissao = JOptionPane.showInputDialog("Digite a sua profissão: ");
    comida = JOptionPane.showInputDialog("Digite a sua comida favorita: ");
    anosguardando = JOptionPane.showInputDialog("Digite a quantidade de anos que irá guardar dinheiro:");
    valorguardado = Double.parseDouble(anosguardando);
    valorguardar = JOptionPane.showInputDialog("Digite o valor mensal que será guardado: ");
    valorguardandomes = Double.parseDouble(valorguardar);

  }

}