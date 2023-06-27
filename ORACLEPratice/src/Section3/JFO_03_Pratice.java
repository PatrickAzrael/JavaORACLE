package Section3;

import javax.swing.JOptionPane;

public class JFO_03_Pratice {
        public static void main(String[] args) {
                /* Pegando os dados de "Pessoa" */
                Pessoa pessoa = new Pessoa();
                pessoa.Dados();
                String nome = pessoa.getNome();
                float altura = pessoa.getAltura();
                String lugarsonhos = pessoa.getLugarsonhos();
                String profissao = pessoa.getProfissao();
                String comida = pessoa.getComida();
                double anosGuardar = pessoa.getValorguardado();
                double valormensal = pessoa.getValorguardandomes();

                /* Pegando os dados de "Calculos" */
                Calculos calculos = new Calculos();
                calculos.calcular();
                int idade = calculos.getIdade();
                double salario = calculos.getSalario();
                double valortotal = calculos.getVmtotal();

                /* Contando a história */
                JOptionPane.showMessageDialog(null, "Era uma vez uma pessoa chamada " + nome);
                JOptionPane.showMessageDialog(null,
                                "Ele(a) tinha " + idade + " anos de idade e era muito curioso(a).");
                JOptionPane.showMessageDialog(null,
                                "Com uma altura de " + altura + " metros, ele(a) se destacava na multidão.");
                JOptionPane.showMessageDialog(null,
                                "Seu maior sonho era visitar " + lugarsonhos + " e explorar suas maravilhas.");
                JOptionPane.showMessageDialog(null,
                                "Entre todas as comidas, sua favorita era " + comida + ", uma verdadeira delícia.");
                JOptionPane.showMessageDialog(null,
                                "Ele(a) é um(a) " + profissao + ", usando seus talentos para fazer a diferença.");
                JOptionPane.showMessageDialog(null,
                                "Por ser um(a) excelente profissional recebe o valor de " + salario + " mensalmente.");
                JOptionPane.showMessageDialog(null,
                                "Para realizar o seu sonho, ele(a) irá guardar um montante de " + valormensal
                                                + " por mês durante "
                                                + anosGuardar
                                                + " anos.");
                JOptionPane.showMessageDialog(null,
                                "Após " + anosGuardar + " ano(s), o montante total guardado será de R$" + valortotal
                                                + ".");
        }
}
