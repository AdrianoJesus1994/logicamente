/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicamente.dto;

import java.sql.Date;

/**
 *
 * @author Adriano.jesus
 */
public class UsuarioDto {
    
    private int id;
    private String email;
    private String nome;
    private String senha;
    private Date dtNasc;

    public UsuarioDto() {
    }

    public UsuarioDto(int id, String email, String nome, String senha, Date dtNasc) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.dtNasc = dtNasc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }
    
    
    
}
