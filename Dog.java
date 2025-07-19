/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication94;

/**
 *
 * @author anzoh
 */
public class Dog extends Animal{
   private String breed;
    
   public Dog(String name, int age, String breed){
   super(name, age);
   this.breed = breed;
   System.out.println("Constructor for " + name + " has been made!");
   }
   
   public String getBreed(){
       return breed;
   }
   
    @Override
    public void makeSound(){
    System.out.println(getName() + " says: WOOF WOOF!");
    }
    
}
