package com.unialfa;
import javax.swing.*;
import java.awt.*;

public class App extends  JFrame {

    ValidationConfig VC = new ValidationConfig();
    private JTextField campoValor1;
    private JTextField campoValor2;
    private JButton botao;


    public App(){
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
        botao.addActionListener(e -> {
            String nome = campoValor1.getText();
            String cpf = campoValor2.getText();
            var validate = new ValidationConfig();
            // passano pelo componente
            validate.validarCPF(this,nome,cpf);
        });
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(botao, constraints);


        add(panel);
        //possibilitar a abertura da tela com o "true", caso false não iria abrir
        setVisible(true);
    }

}

