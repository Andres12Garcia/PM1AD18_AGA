package com.andres.loginargumentos.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.andres.loginargumentos.R;
import com.andres.loginargumentos.daos.UsuariosDao;
import com.andres.loginargumentos.models.Usuario;

public class Login extends Activity{

    Button btnLog;
    EditText txtUsu,txtPass;
    TextView titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);


        btnLog = findViewById(R.id.btnLogin);
        txtPass = findViewById(R.id.txtPassword);
        txtUsu = findViewById(R.id.txtUsuario);
        titulo =  findViewById(R.id.txtTitulo);
        titulo.setText(getIntent().getStringExtra("titulo"));
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                UsuariosDao dao = new UsuariosDao();
                Usuario resultado = (Usuario) dao.usuExist
                        (new Usuario(txtUsu.getText().toString(),txtPass.getText().toString()));

                if (resultado!=null){

                    Intent respuesta = new Intent();
                    respuesta.putExtra("Resultado",resultado);
                    setResult(MainActivity.LOGIN_INTENT_CODE,respuesta);
                    finish();

                }
                else{


                }


            }
        });
    }
    // Metodo para deshabilitar el back
    @Override
    public void onBackPressed() {

    }

}
