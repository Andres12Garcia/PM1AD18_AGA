package com.andres.loginargumentos.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.andres.loginargumentos.R;
import com.andres.loginargumentos.models.Usuario;

public class MainActivity extends Activity {
    public static final int LOGIN_INTENT_CODE=30; //Constatnte final
    TextView usuario, apPaterno, apMaterno, Nacionalidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent loginIntent = new Intent(MainActivity.this, Login.class);
        loginIntent.putExtra("titulo", "INICIAR LOGEO");
        startActivityForResult(loginIntent,LOGIN_INTENT_CODE);

        usuario=(TextView) findViewById(R.id.textView);
        apPaterno= (TextView)findViewById(R.id.textView2);
        apMaterno=(TextView)findViewById(R.id.textView3);
        Nacionalidad=(TextView)findViewById(R.id.textView4);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == LOGIN_INTENT_CODE){
            Usuario resultado = (Usuario) data.getSerializableExtra("Resultado");


            Toast.makeText(this,"Bienvenido"+resultado.getUsuario(), Toast.LENGTH_SHORT).show();
            apMaterno.setText(resultado.getApellidoM());
            apPaterno.setText(resultado.getApellidoP());
            usuario.setText(resultado.getUsuario());
            Nacionalidad.setText(resultado.getNacionalidad());



        }
    }

    }

