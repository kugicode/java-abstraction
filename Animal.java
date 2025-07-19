/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication94;

/**
 *
 * @author anzoh
 */
public abstract class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    System.out.println("Constructor created for: " + name);
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void eat(){
    System.out.println(name + " is eating!");
    }
    
    public abstract void makeSound();
    
    
    
    
}
