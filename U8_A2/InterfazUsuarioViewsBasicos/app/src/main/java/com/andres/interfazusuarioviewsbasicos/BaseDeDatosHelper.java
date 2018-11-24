package com.andres.interfazusuarioviewsbasicos;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDeDatosHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "BaseDatos.db";

    public BaseDeDatosHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query_crear_tablas =
                "CREATE TABLE " + BaseDeDatosContract.TablaUsuario.TABLE_NAME +
                        " (" + BaseDeDatosContract.TablaUsuario._ID + " INTEGER PRIMARY KEY," +
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_USERNAME + " TEXT," +
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_PASSWORD + " TEXT," +
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_NOMBRE_PILA + " TEXT," +
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_GENERO + " TEXT," +
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_TECNOLOGIAS + " TEXT," +
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_INSTITUCION + " TEXT," +
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_NOTIFICACIONES + " INTEGER," +
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_PUBLICIDAD + " INTEGER," +
                        BaseDeDatosContract.TablaUsuario.COLUMN_NAME_FECHA_NACIMIENTO + " INTEGER" +
                        " )";
        db.execSQL(query_crear_tablas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}

