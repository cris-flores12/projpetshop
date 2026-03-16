/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author crisf
 */
public class Dono {
  
    private String nome;
    private String cpf;
    public Dono(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    @Override
    public String toString() {
        return "Dono: " + nome + " (CPF: " + cpf + ")";
    }
}
