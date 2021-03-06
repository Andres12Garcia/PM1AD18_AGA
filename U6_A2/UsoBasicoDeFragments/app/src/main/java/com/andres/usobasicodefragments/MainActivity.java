package com.andres.usobasicodefragments;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.R;

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
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .replace(R.id.contenedor,new FragmentoA())
                        .addToBackStack(null)
                        .commit();
            }
        });
        Button btnFragmentoB=(Button)findViewById(R.id.boton2);
        btnFragmentoB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(R.anim.enter_anim, R.anim.enter_anim)
                        .replace(R.id.contenedor,new FragmetoB())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }
}
