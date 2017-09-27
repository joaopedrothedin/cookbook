/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rj.macae.femass.receitas.modelo;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author JoaoPedroThdin
 */
public class Receita {

    private int id;
    private String nome;
    private String preparo;
    private String ModoServir;
    private Categoria categoria;
    private List<Receita_Ingrediente> ingredientes;
    private List<Receita_Ingrediente> receitas;
    
    
    
    public Receita(String nome){
        this.setId(0);
        this.setNome(nome);
    }

    public String toString(){
        return "Receita "+this.getNome();
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ingredientes
     */
    public List<Receita_Ingrediente> getIngredientes() {
        return Collections.unmodifiableList(ingredientes);
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngrediente(Receita_Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void removeIngrediente(Receita_Ingrediente ingrediente){
        if(this.ingredientes.contains(ingrediente)){
            this.ingredientes.remove(ingrediente);
        }
    }
    /**
     * @return the preparo
     */
    public String getPreparo() {
        return preparo;
    }

    /**
     * @param preparo the preparo to set
     */
    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }

    /**
     * @return the ModoServir
     */
    public String getModoServir() {
        return ModoServir;
    }

    /**
     * @param ModoServir the ModoServir to set
     */
    public void setModoServir(String ModoServir) {
        this.ModoServir = ModoServir;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria c) {
        this.categoria = c;
        c.SetReceita(this);
    }

    /**
     * @return the receitas
     */
    public List<Receita_Ingrediente> getReceitas() {
        return Collections.unmodifiableList(receitas);
    }

    /**
     * @param receitas the receitas to set
     */
    public void setReceita(Receita_Ingrediente receita) {
        this.receitas.add(receita);
    }
    
    public void removeReceita(Receita_Ingrediente receita){
        if(this.receitas.contains(receita)){
            this.receitas.remove(receita);
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Receita other = (Receita) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
            
    
}


