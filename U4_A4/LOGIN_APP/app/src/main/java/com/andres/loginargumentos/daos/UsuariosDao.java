package com.andres.loginargumentos.daos;

import android.widget.Toast;

import com.andres.loginargumentos.models.Usuario;

import java.util.HashSet;
import java.util.Set;

public class UsuariosDao {
    Set<Usuario> listaUsuarioDao;

    public UsuariosDao(){
        listaUsuarioDao = new HashSet<>();
    }

    public Set<Usuario> listaUs(){
        listaUsuarioDao.add(new Usuario("Andres", "123","Garcia","Alejo","Mexicano"));
        listaUsuarioDao.add(new Usuario("admin", "13","Suarez","Diaz","CUBANO"));
        listaUsuarioDao.add(new Usuario("Angel", "14","Jimenez","Andrade","MHondureño"));
        listaUsuarioDao.add(new Usuario("Andres", "15","Caro","Herrejon","Portuges"));

        return listaUsuarioDao;

    }

    public  Usuario usuExist(final Usuario us){
        listaUsuarioDao= listaUs();
        for (Usuario usr:listaUsuarioDao) {
            if(usr.getUsuario().equals(us.getUsuario())&& usr.getPassword().equals(us.getPassword())){
                // serializacion
                return usr;
            }
        }
        return null;
    }

}
