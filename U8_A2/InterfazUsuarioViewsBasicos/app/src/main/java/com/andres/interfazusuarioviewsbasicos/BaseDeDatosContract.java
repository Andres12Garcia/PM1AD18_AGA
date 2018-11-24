package com.andres.interfazusuarioviewsbasicos;

import android.provider.BaseColumns;

public final class BaseDeDatosContract {
    private BaseDeDatosContract(){}

    // crear subcalse que representa una tabla en la base de cdatos


    public  static class TablaUsuario implements BaseColumns{

        //Clase interna que representa una tabla en la base de datos

            public static final String TABLE_NAME = "usuarios";
            public static final String COLUMN_NAME_USERNAME = "username";
            public static final String COLUMN_NAME_PASSWORD = "password";
            public static final String COLUMN_NAME_NOMBRE_PILA = "nombrePila";
            public static final String COLUMN_NAME_TECNOLOGIAS = "tecnologias";
            public static final String COLUMN_NAME_GENERO = "genero";
            public static final String COLUMN_NAME_NOTIFICACIONES = "notificaciones";
            public static final String COLUMN_NAME_PUBLICIDAD = "publicidad";
            public static final String COLUMN_NAME_INSTITUCION = "institucion";
            public static final String COLUMN_NAME_FECHA_NACIMIENTO = "fecha_nacimiento";

        }
}
