package br.com.pontointeligente.api.security.services.impl;

import br.com.pontointeligente.api.security.JwtUserFactory;
import br.com.pontointeligente.api.security.entities.Usuario;
import br.com.pontointeligente.api.security.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsuarioService usuarioService ;
    @Override
    public UserDetails loadUserByUsername (String username )
            throws UsernameNotFoundException {
        Optional<Usuario> funcionario =
                usuarioService . buscarPorEmail ( username );
        if ( funcionario . isPresent ()) {
            return JwtUserFactory. create ( funcionario . get ());
        }
        throw new UsernameNotFoundException ( "Email não encontrado." );
    }
}