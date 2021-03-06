package model;
// Generated Nov 3, 2016 4:38:15 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblUsuarios generated by hbm2java
 */
public class TblUsuarios implements java.io.Serializable {

    private Integer id;
    private String name;
    private String password;
    private int deleted;
    private Integer tipo;

    public TblUsuarios() {
    }

    public TblUsuarios(String name, String password) {
        this.name = name;
        this.password = password;
    }
    

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    
    
}
