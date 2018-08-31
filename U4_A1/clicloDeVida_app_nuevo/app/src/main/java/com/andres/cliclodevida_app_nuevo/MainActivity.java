package com.andres.cliclodevida_app_nuevo;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView txtEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtEstado=(TextView) findViewById(R.id.txtEstado);
        txtEstado.setMovementMethod(new ScrollingMovementMethod() );
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.d("ESTATE", "ON CREATE");
        txtEstado.setText(txtEstado.getText()+"\n ON CREATE");


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestar", Toast.LENGTH_SHORT).show();
        Log.d("state", "onRestart");
        txtEstado.setText(txtEstado.getText()+"\n onRestar");




    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.d("state", "onStart");
        txtEstado.setText(txtEstado.getText()+"\n onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.d("state", "onResume");
        txtEstado.setText(txtEstado.getText()+"\n onResume");


    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.d("state", "onPause");
        txtEstado.setText(txtEstado.getText()+"\n onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStaop", Toast.LENGTH_SHORT).show();
        Log.d("state", "onStop");
        txtEstado.setText(txtEstado.getText()+"\n onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("state", "onDestroy");
        txtEstado.setText(txtEstado.getText()+"\n onDestroy");

    }
    }

