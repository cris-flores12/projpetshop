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
public class Atendimento {
    private Animal animal;
    private String descricaoServico;
    private double valor;

  
    public Atendimento(Animal animal, String descricaoServico) {
        this.animal = animal;
        this.descricaoServico = descricaoServico;
       
        this.valor = animal.calcularBanho();
    }
    public void exibirResumo() {
        System.out.println("------------------------------");
        System.out.println("Atendimento para: " + animal.getNome());
        System.out.println("Serviço: " + descricaoServico);
        System.out.println("Valor cobrado: R$ " + valor);
        System.out.println("Som do animal no banho: " + animal.emitirSom());
        System.out.println("------------------------------");
    }
}
