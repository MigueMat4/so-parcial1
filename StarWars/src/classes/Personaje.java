/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author Miguel Matul <https://github.com/MigueMat4>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Personaje {
    private String name;
    private String gender;
    private String height;
    private String mass;
    private String birth_year;

    public Personaje() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }
    
    @Override
    public String toString() {
        return "Personaje de StarWars{" +
                "nombre='" + name + '\'' +
                ", altura='" + height + '\'' +
                ", peso='" + mass + '\'' +
                '}';
    }
}
