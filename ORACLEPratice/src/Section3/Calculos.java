package Section3;

import javax.swing.JOptionPane;

public class Calculos {
    Pessoa pessoa = new Pessoa();

    /* Fazendo o cálculo da idade */
    private int idade = 0;
    private double salario = 0;
    private int horatrabalhada;
    private String hoursworked;
    private int valorhora = 0;
    private String timevalue;
    private String salarious;
    private boolean CLT = false;
    private boolean PJ = false;
    private boolean Horista = false;
    private int anoatual = pessoa.getAnoatual();
    private int anonascimento = pessoa.getAnonascimento();
    private double vgm = 0;
    private double vag = 0;
    private double vmtotal = 0;

    /* Getters e Setters */
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHoratrabalhada() {
        return horatrabalhada;
    }

    public void setHoratrabalhada(int horatrabalhada) {
        this.horatrabalhada = horatrabalhada;
    }

    public int getValorhora() {
        return valorhora;
    }

    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }

    public String getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(String hoursworked) {
        this.hoursworked = hoursworked;
    }

    public String getTimevalue() {
        return timevalue;
    }

    public void setTimevalue(String timevalue) {
        this.timevalue = timevalue;
    }

    public String getSalarious() {
        return salarious;
    }

    public void setSalarious(String salarious) {
        this.salarious = salarious;
    }

    public double getVgm() {
        return vgm;
    }

    public void setVgm(double vgm) {
        this.vgm = vgm;
    }

    public double getVag() {
        return vag;
    }

    public void setVag(double vag) {
        this.vag = vag;
    }

    public double getVmtotal() {
        return vmtotal;
    }

    public void setVmtotal(double vmtotal) {
        this.vmtotal = vmtotal;
    }

    /* Fazendo os cálculos */
    public void calcular() {
        String payment = pessoa.getPayment();
        if (payment != null && payment.equalsIgnoreCase("CLT")) {
            CLT = true;
        } else if (payment != null && payment.equalsIgnoreCase("Horista")) {
            Horista = true;
        } else if (payment != null && payment.equalsIgnoreCase("PJ")) {
            PJ = true;
        }

        if (CLT) {
            salarious = JOptionPane.showInputDialog(null, "Digite o valor que você recebe mensalmente: ");
            salario = Double.parseDouble(salarious);
            setSalario(salario);
        } else if (Horista) {
            hoursworked = JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas: ");
            horatrabalhada = Integer.parseInt(hoursworked);
            timevalue = JOptionPane.showInputDialog(null, "Digite o valor a receber por hora trabalhada: ");
            valorhora = Integer.parseInt(timevalue);

            salario = valorhora * horatrabalhada;

        } else if (PJ) {
            salarious = JOptionPane.showInputDialog(null, "Informe o valor que você recebe pelo contrato: ");
            salario = Double.parseDouble(salarious);
        }

        /* Cálculo da idade */
        idade = anoatual - anonascimento;

        /* Cálculo do valor para a viagem */

        vag = pessoa.getValorguardado();
        vgm = pessoa.getValorguardandomes();
        vmtotal = vgm * vag * 12;
    }

}