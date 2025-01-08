package io.mohit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Pokemons {
    
    @Id
    @Column(name = "POKEMON_NAME", nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String type;
    
    @Column
    private int power;
    
    @Enumerated(EnumType.STRING)
    @Column
    private Color color;
    
   

    public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getPower() + " " + this.getType();
    }
}
