/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author harsh
 */
public class Animal {
    
    private String name;
    private int weight;
    private String sound;
    public Fly flyingType;

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getSound() {
        return this.sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
          this.weight = weight;
        } else {
            System.out.println("Error wrong weight");
        }
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    
    public String tryToFly(){
        return flyingType.fly();
    }
    
    public void setFly(Fly newFlying) {
        flyingType = newFlying;
    }
    
    
    
}
