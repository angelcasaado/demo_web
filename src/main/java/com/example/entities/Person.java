package com.example.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDateTime;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @NotBlank(message = "El teléfono es obligatorio")
    @Pattern(regexp = "^\\+?[0-9]{7,15}$", message = "Introduce un número de teléfono válido")
    private String telephone;

    @NotBlank(message = "Selecciona una opción")
    private String known;


    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return name; }
    public void setNombre(String nombre) { this.name = nombre; }

    public String getTelefono() { return telephone; }
    public void setTelefono(String telefono) { this.telephone = telefono; }

    public String getConocido() { return known; }
    public void setConocido(String conocido) { this.known = conocido; }

    private LocalDateTime creationClassTime = LocalDateTime.now();

    public LocalDateTime getCreationClassTime() { return creationClassTime; }
    public void setCreationClassTime(LocalDateTime creationClassTime) { this.creationClassTime = creationClassTime; }

}
