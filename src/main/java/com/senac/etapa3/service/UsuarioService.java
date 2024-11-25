package com.senac.etapa3.service;

import com.senac.etapa3.data.UsuarioRepository;
import com.senac.etapa3.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<UsuarioEntity> getTodosUsuarios(){
       return usuarioRepository.findAll();
    }

    public boolean autenticar(String usuario, String senha){
        List<UsuarioEntity> usuarios = getTodosUsuarios();
        for (UsuarioEntity u : usuarios){
            if (u.getUsuario().equals(usuario) && u.getSenha().equals(Criptografia.getMD5(senha))){
                return UserLog.atualizarAcesso(true);
            }
        }
        return false;
    }
}