package com.teste.testeblg.security;

import com.teste.testeblg.model.Usuario;
import com.teste.testeblg.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserDetailServiceImpl implements UserDetailsService {

    private UsuarioRepository usuarioRepository;

    public UserDetailServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Usuario> user=usuarioRepository.findByUsuario(userName);
        user.orElseThrow(()->new UsernameNotFoundException(userName+" user not found"));

        return user.map(UserDetailsImpl::new).get();
    }
}
