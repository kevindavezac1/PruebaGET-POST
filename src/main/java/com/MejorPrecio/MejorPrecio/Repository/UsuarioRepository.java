package com.MejorPrecio.MejorPrecio.Repository;

import com.MejorPrecio.MejorPrecio.Model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Optional<Usuario> findByCorreoElectronico(String correoElectronico);
}
