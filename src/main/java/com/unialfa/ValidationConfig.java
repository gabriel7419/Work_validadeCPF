package com.unialfa;

import javax.swing.*;
import java.awt.*;

public class ValidationConfig {

    // não a necesidade de sem pulbic mais que ira chamar é o validader
    private void conferirNome(String valor) {
        try {
            if (valor.isEmpty()) {
                throw new IllegalArgumentException("O campo Nome não pode ser vazio!");
            }
            if (valor.matches("[^a-zA-Z0-9 ]+")) {
                throw new IllegalArgumentException("O campo Nome não pode conter caracteres especiais!");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // não a necesidade de sem pulbic mais que ira chamar é o validader
    private boolean validarCPF(String cpf) {
        try {

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

    // unico método a ser chamado
    // o método component ele chama algum
    public void validarCPF(Component parentComponent, String nome, String cpf) {

        conferirNome(nome);

        if (validarCPF(cpf)) {
            JOptionPane.showMessageDialog(parentComponent, "CPF válido");
        } else {
            JOptionPane.showMessageDialog(parentComponent, "CPF inválido");
        }
    }
}
