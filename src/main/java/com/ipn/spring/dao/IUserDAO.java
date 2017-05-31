package com.ipn.spring.dao;

import com.ipn.spring.pojo.Administrador;
import java.util.List;

public interface IUserDAO {

    public boolean crearUsuario(Administrador usuario);

    public Administrador leerUsuarioId(Integer idUsuario);

    public List<Administrador> leerUsuarios();

    public boolean actualizarUsuario(Administrador usuario);

    public boolean borrarUsuario(Integer usuario);

}
