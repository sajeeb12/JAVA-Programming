/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author sajeeb
 */
public class Author {
    private String name;
    private String email;
    private String gender;
    
    
    Author(String name,String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getGender(){
        return this.gender;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
}
