/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Aquino
 */
public class Cliente {

    private String dni;
    private String nombres;
    private String apepaterno;
    private String apematerno;
    private String fec_nacimiento;
    private String sexo;
    private String departamento;
    private String provincia;
    private String distrito;
    private String direccion1;
    private String telefono;
    private String mail;

    public String getApematerno() {
        return apematerno;
    }

    public void setApematerno(String apematerno) {
        this.apematerno = apematerno;
    }

    public String getApepaterno() {
        return apepaterno;
    }

    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFec_nacimiento() {
        return fec_nacimiento;
    }

    public void setFec_nacimiento(String fec_nacimiento) {
        this.fec_nacimiento = fec_nacimiento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
    
}
