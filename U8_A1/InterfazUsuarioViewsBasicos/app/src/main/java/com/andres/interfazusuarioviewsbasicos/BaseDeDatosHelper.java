package com.andres.interfazusuarioviewsbasicos;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDeDatosHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION =1;
    public static final String DATABASE_NAME = "BaseDeDatos.db";

    public BaseDeDatosHelper( Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query_crear_tablas =

                        "CREATE TABLE " +    BaseDeDatosContract.TablaUsuario.Tabble_NAME +
               "( " +     BaseDeDatosContract.TablaUsuario._ID + "INTEGER PRIMARY KEY,"+
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_USERNAME + "TEXT,"+
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_PASSWORD + "TEXT,"+
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_NOMBRE_PILA + "TEXT,"+
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_GENERO + "TEXT,"+
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_TECNOLOGIAS + "TEXT,"+
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_INSTITUCIONES + "TEXT,"+
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_NOTIFICACIONES + "TEXT,"+
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_PUBLICIDAD + "TEXT,"+
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_PUBLICIDAD + "TEXT"+
                " )";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
