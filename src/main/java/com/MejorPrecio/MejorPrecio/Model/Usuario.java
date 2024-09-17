package com.MejorPrecio.MejorPrecio.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    private String id;

    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String contrasena;  // Recuerda encriptar las contraseñas
    private String telefono;
    private Date fechaNacimiento;
    private String direccion;
    private String rol;  // Ejemplo: "usuario", "admin"
    private boolean cuentaActiva;

    // Relación con Comercio
    private Integer comercioId;  // Id del comercio que controla el usuario
}
