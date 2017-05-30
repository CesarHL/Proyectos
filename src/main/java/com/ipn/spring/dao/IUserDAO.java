package com.ipn.spring.dao;

import com.ipn.spring.pojo.Usuario;
import java.util.List;

public interface IUserDAO {

    public boolean crearUsuario(Usuario usuario);

    public Usuario leerUsuarioId(Integer idUsuario);

    public List<Usuario> leerUsuarios();

    public boolean actualizarUsuario(Usuario usuario);

    public boolean borrarUsuario(Integer usuario);

}
