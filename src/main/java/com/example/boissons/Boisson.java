package com.example.boissons;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Boisson {
    @Id
    private int id;
    @NotBlank(message="Il faut remplir le nom")
    private String name;
    @ManyToOne
    @JsonIgnoreProperties(value = "boissons")
    private TypeBoisson typeBoisson;

    public Boisson() {
    }
}
