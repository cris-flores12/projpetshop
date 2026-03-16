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
public abstract class Animal {
    
    protected String nome;
    protected int idade;
    protected Dono dono; 
    public Animal(String nome, int idade, Dono dono) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }
    public String getNome() { 
        return nome; 
    }
    public int getIdade() { 
        return idade;
    }
    public Dono getDono() { 
        return dono;
    }
    public abstract String emitirSom();
    public abstract double calcularBanho();
    public void exibirDados() {
        System.out.println("--- Dados do Animal ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Som: " + emitirSom());
        System.out.println(dono);
    }
}