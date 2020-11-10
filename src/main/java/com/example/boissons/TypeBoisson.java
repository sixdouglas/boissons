package com.example.boissons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import java.util.List;

@Entity
@Data
public class TypeBoisson {
    @Id
    private int id;
    private String name;
    @OneToMany
    @JoinColumn(name = "type_boisson_id")
    @OrderBy("name")
    @JsonIgnoreProperties
    private List<Boisson> boissons;
}
