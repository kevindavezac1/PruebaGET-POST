package com.MejorPrecio.MejorPrecio.Service;

import com.MejorPrecio.MejorPrecio.Model.Usuario;
import com.MejorPrecio.MejorPrecio.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findByCorreoElectronico(String correo) {
        return usuarioRepository.findByCorreoElectronico(correo)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con correo: " + correo));
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }
}
