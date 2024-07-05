package com.curso.ecommerce.service;

import com.curso.ecommerce.model.Usuario;

import java.util.Optional;

/**
 * @author Javier
 */
public interface IUsuarioService {
    Optional<Usuario> findById(Integer id);
}
