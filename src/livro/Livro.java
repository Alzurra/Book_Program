/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;

import static java.lang.System.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Livro {

    private String titulo;
    private String categoria;
    private String autor_autora;
    private String editora;
    private Double valor;

    Livro() {
        cadastrar();
        cadcategoria();
        cadautor_autora();
        cadeditora();
        cadvalor();
    }

    public void cadastrar() {
        titulo = JOptionPane.showInputDialog("Digite o título do Livro por gentileza: ");
        validar(1);
        JOptionPane.showMessageDialog(null, "\nTítulo do Livro: " + titulo);

    }

    public void cadcategoria() {
        categoria = JOptionPane.showInputDialog("Digite a categoria do Livro por gentileza: ");
        validar(2);
        JOptionPane.showMessageDialog(null, "\nTema(gênero) do Livro: " + categoria);

    }

    public void cadautor_autora() {
        autor_autora = JOptionPane.showInputDialog("Digite o(a) autor(a) do Livro por gentileza: ");
        validar(3);
        JOptionPane.showMessageDialog(null, "\nAutor(a) do Livro: " + autor_autora);

    }

    public void cadeditora() {
        editora = JOptionPane.showInputDialog("Digite a editora do Livro por gentileza: ");
        validar(4);
        JOptionPane.showMessageDialog(null, "\nEditora do Livro: " + editora);

    }

    public void cadvalor() {
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "\nDigite por gentileza o valor do livro: R$"));
        validar(5);
        JOptionPane.showMessageDialog(null, "\nO preço do livro é = R$" + valor);
        cadvalor(valor);
    }

    public void cadvalor(double valor) {
        JOptionPane.showMessageDialog(null, "\nPreço do Livro: R$" + valor);
        if (valor <= 200) {
            valor = (double) valor - (valor * 0.1);
            JOptionPane.showMessageDialog(null, "\nPreço do Livro com Desconto: R$" + valor);
        } else if (valor > 200 && valor <= 300) {
            valor = (double) valor - (valor * 0.2);
            JOptionPane.showMessageDialog(null, "\nPreço do Livro com Desconto: R$" + valor);
        } else {
            valor = (double) valor - (valor * 0.3);
            JOptionPane.showMessageDialog(null, "\nPreço do Livro com Desconto: R$" + valor);
        }

        JOptionPane.showMessageDialog(null, "\nVALOR COM DESCONTO [PROMOÇÃO]" + "\nLIVRARIA FATEC" + "\nTítulo do Livro: " + titulo + "\nCategoria do Livro: " + categoria
                + "\nAutor(a) do Livro: " + autor_autora + "\nEditora do Livro: " + editora + "\nO preço do livro com desconto é = R$" + valor);
        exit(0);
    }

    public void validar(int etapa) {
        switch (etapa) {
            case 1:
                while ("".equals(titulo)) {
                    titulo = JOptionPane.showInputDialog("[O CAMPO NOME NÂO PODE FICAR VAZIO!!]\n " + "\nDigite o título do livro: ");
                }
                break;
            case 2:
                while ("".equals(categoria)) {
                    categoria = JOptionPane.showInputDialog("[O CAMPO NOME NÂO PODE FICAR VAZIO!!]\n " + "\nDigite a categoria do livro: ");
                }
                break;
            case 3:
                while ("".equals(autor_autora)) {
                    autor_autora = JOptionPane.showInputDialog("[O CAMPO NOME NÂO PODE FICAR VAZIO!!]\n " + "\nDigite o(a) autor(a) do livro: ");
                }
                break;
            case 4:
                while ("".equals(editora)) {
                    editora = JOptionPane.showInputDialog("[O CAMPO NOME NÂO PODE FICAR VAZIO!!]\n " + "\nDigite a editora do livro: ");
                }
                break;
            case 5:
                while (valor < 5) {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("[O VALOR DO LIVRO DEVE SER IGUAL OU SUPERIOR A R$5,00]\n\n"
                            + "LIVRARIA FATEC\n\nDigite o valor do livro novamente: "));
                }
                break;
            default:
                break;
        }

    }

    public static void main(String[] args) {
        Livro l = new Livro();
        l.cadastrar();
        l.cadcategoria();
        l.cadeditora();
        l.cadvalor();
    }
}
