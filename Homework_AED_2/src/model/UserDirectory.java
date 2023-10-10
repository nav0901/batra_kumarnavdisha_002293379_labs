/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Person;
import java.util.ArrayList;

/**
 *
 * @author navdishbatra
 */
public class UserDirectory {
    public ArrayList<Person> UserList;
    
    public UserDirectory(){
        this.UserList = new ArrayList<Person>();
        
    }

    public ArrayList<Person> getUserList() {
        return UserList;
    }

    public void setUserList(ArrayList<Person> UserList) {
        this.UserList = UserList;
    }
    
    
    public Person addNewUser(Person newUser){
        //User NewUser = new User();
        UserList.add(newUser);
        return newUser;
    
      }
    
    public Person searchAccount(String NUID){
        //User UserObj = new User();
        for(Person User : UserList){
            if(User.getNUID().equals(NUID)){
                return User;
            }
        }
        return null;
    }
}
