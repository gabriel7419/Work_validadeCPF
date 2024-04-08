package com.unialfa;



import javax.swing.*;


import java.awt.*;

public class App extends  JFrame {

    private JTextField campoValor1;
    private JTextField campoValor2;
    private JButton botao;
    public void conferirCPF(){
        JFrame jFrame = new JFrame("validando cpf");
        //tamanho da janela
        setSize(400,500);
        // qunado fechar a pagina para o progrma
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // a interface vai para o meio da tela
        setLocationRelativeTo(null);

        GridBagConstraints constraints = new GridBagConstraints();
        JPanel panel = new JPanel(new GridBagLayout());

        var label1 = new JLabel("Nome");
        label1.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 20));
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(label1, constraints);

        var label2 = new JLabel("CPF");
        label2.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 20));
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(label2, constraints);

        campoValor1 = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(campoValor1, constraints);

        campoValor2 = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(campoValor2, constraints);

        botao = new JButton("Enviar!");
        botao.addActionListener(e -> validarCPF());
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(botao, constraints);


        add(panel);
        //possibilitar a abertura da tela com o "true", caso false não iria abrir
        setVisible(true);
    }

    private void validarCPF() {
        String cpf = campoValor2.getText();
        if (validarCPF(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF válido");
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido");
        }
    }

    private static void validarCampos(String campo, String valor) {
        if (valor.isEmpty()) throw new RuntimeException("%s Não pode ser vazio!".formatted(campo));
        if (valor.isBlank()) throw new RuntimeException("%s Não pode ter espaços em branco!".formatted(campo));
        // tirar todos os "." e "-" do cpf deifar apenas numeros
        valor = valor.replaceAll("[^0-9]", "");
        //vaerificar se o cpf tem 11 digitos
        if(valor.length() != 11) throw  new RuntimeException("%s não a o numero de digitos necessario");
    }

    private static boolean validarCPF(String cpf) {
        try {
            validarCampos("CPF", cpf);
            // cálculo do primeiro dígito verificador
            int sm = 0, num, r;
            int peso = 10;
            for (int i = 0; i < 9; i++) {
                num = (int) (cpf.charAt(i) - '0'); // converter o caractere para número
                sm += num * peso;
                peso--;
            }
            r = 11 - (sm % 11);
            // Verificando se o primeiro dígito verificador está correto
            if (r == 10 || r == 11) {
                r = 0; // se o resultado for 10 ou 11, o dígito verificador é zero
            }
            if (r != (int) (cpf.charAt(9) - '0')) {
                return false;
            }

            // cálculo do segundo dígito verificador
            sm = 0;
            peso = 11;
            for (int i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - '0');
                sm += num * peso;
                peso--;
            }
            r = 11 - (sm % 11);
            // Verificando se o segundo dígito verificador está correto
            if (r == 10 || r == 11) {
                r = 0;
            }
            if (r != (int) (cpf.charAt(10) - '0')) {
                return false;
            }
            return true; // CPF é válido se todos os dígitos verificadores estiverem corretos
        } catch (Exception e) {
            return false;
        }
    }


    public static void main(String[] args) {
        App app = new App();
        app.conferirCPF();

    }
}
