package com.example.potluck;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class PersonFood {
    @NotNull
    @Id
    private String name;
    @NotNull
    private String food;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
