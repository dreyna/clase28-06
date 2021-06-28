/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.clase28_06.model;

/**
 *
 * @author dreyna
 */
public class Usuario {
    private int idusuario;
    private String username;
    private String password;
    private int estado;
    private int idempleado;

    public Usuario() {
    }

    public Usuario(String username, String password, int estado, int idempleado) {
        this.username = username;
        this.password = password;
        this.estado = estado;
        this.idempleado = idempleado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }
    
}
