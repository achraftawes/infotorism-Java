/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.esprit.entities;

/**
 *
 * @author MSI
 */
public class Responsable {

   
    private String id;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Responsable(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public Responsable() {
    }

    @Override
    public String toString() {
        return "Responsable{" + "id=" + id + ", password=" + password + '}';
    }
 
    
    
    
    
    
    
    

}