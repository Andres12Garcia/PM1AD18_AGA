package com.andres.interfazusuarioviewsbasicos;

import android.provider.BaseColumns;

public final class BaseDeDatosContract {
    private BaseDeDatosContract(){}

    // crear subcalse que representa una tabla en la base de cdatos


    public  static class TablaUsuario implements BaseColumns{

        public static final String Tabble_NAME = "usuarios";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String COLUMN_NAME_PASSWORD = "usuarios";
        public static final String COLUMN_NAME_NOMBRE_PILA = "usuarios";
        public static final String COLUMN_NAME_TECNOLOGIAS = "usuarios";
        public static final String COLUMN_NAME_GENERO = "usuarios";
        public static final String COLUMN_NAME_NOTIFICACIONES = "usuarios";
        public static final String COLUMN_NAME_PUBLICIDAD = "usuarios";
        public static final String COLUMN_NAME_INSTITUCIONES = "usuarios";
        public static final String COLUMN_NAME_FECHA_NACIMIENTO = "usuarios";
    }
}
