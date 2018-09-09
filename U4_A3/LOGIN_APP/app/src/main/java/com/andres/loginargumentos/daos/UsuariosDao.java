package com.andres.loginargumentos.daos;

import com.andres.loginargumentos.models.Usuario;

import java.util.HashSet;
import java.util.Set;

public class UsuariosDao {
    private Set<Usuario> listaUsuariosDao;

    public UsuariosDao() {
        listaUsuariosDao = new HashSet<>();
    }

    public Set<Usuario> listaUs(){
        listaUsuariosDao.add(new Usuario("Betoneytor", "12345"));
        listaUsuariosDao.add(new Usuario("B", "B"));

        return listaUsuariosDao;
    }

    public  boolean usuarioExist(final Usuario usAValidar){
        listaUsuariosDao=listaUs();
        // listaUsuariosDao.stream().anyMatch(usr -> usr.getUsuario().equals(usAValidar.getUsuario()));
        for (Usuario usr:listaUsuariosDao) {
            if (usr.getUsuario().equals(usAValidar.getUsuario()) &&
                    usr.getPassword().equals(usAValidar.getPassword()) ){
                return true;

            }
        }
        return false;
        //boolean rex=listaUsuariosDao.contains(usAValidar);
        //return rex;
    }


}
