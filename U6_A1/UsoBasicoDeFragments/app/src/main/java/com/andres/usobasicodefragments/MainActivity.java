package com.andres.usobasicodefragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnFragmentoA=(Button)findViewById(R.id.boton1);
        btnFragmentoA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor,new FragmentoA())
                        .commit();
            }
        });
        Button btnFragmentoB=(Button)findViewById(R.id.boton2);
        btnFragmentoB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor,new FragmetoB())
                        .commit();
            }
        });

    }
}
