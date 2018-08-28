package com.garcia.andres.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends Activity {


    Button btn1, btn2, btn3, btn4,
            btn5, btn6, btn7, btn8, btn9,
            btnSuma, btnResta, btnMultiplica,
            btnDivide, btnLimpiar, btnBorrar,
            btnPunto, btnIgual, btnCero;

    TextView Resultado;

    double resultado;

    String operador, mostrar , reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCero = (Button)findViewById(R.id.Cero);
        btn1 = (Button)findViewById(R.id.Uno);
        btn2 = (Button)findViewById(R.id.Dos);
        btn3 = (Button)findViewById(R.id.Tres);
        btn4 = (Button)findViewById(R.id.Cuatro);
        btn5 = (Button)findViewById(R.id.Cinco);
        btn6 = (Button)findViewById(R.id.Seis);
        btn7 = (Button)findViewById(R.id.Siete);
        btn8 = (Button)findViewById(R.id.Ocho);
        btn9 = (Button)findViewById(R.id.Nueve);
        btnSuma = (Button)findViewById(R.id.Suma);
        btnResta = (Button)findViewById(R.id.Resta);
        btnMultiplica = (Button)findViewById(R.id.Multiplica);
        btnDivide = (Button)findViewById(R.id.Divide);
        btnLimpiar = (Button)findViewById(R.id.limpiar);
        btnBorrar = (Button)findViewById(R.id.Borrar);
        Resultado = (TextView)findViewById(R.id.Etiqueta);
        btnPunto = (Button)findViewById(R.id.Punto);
        btnIgual = (Button)findViewById(R.id.Igual);






        btnCero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "0";
                Resultado.setText(mostrar);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
               Resultado.setText(mostrar);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                  mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                   mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
              mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                 mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                 mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                  reserva = Resultado.getText().toString();
                operador = "+";
                Resultado.setText("");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                 reserva = Resultado.getText().toString();
                operador = "-";
                Resultado.setText("");
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                 reserva = Resultado.getText().toString();
                operador = "*";
                Resultado.setText("");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = Resultado.getText().toString();
                operador = "/";
                Resultado.setText("");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                   mostrar = Resultado.getText().toString();
                mostrar = mostrar + ".";
                Resultado.setText(mostrar);
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                Resultado.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar.substring(0,mostrar.length()-1);
                Resultado.setText(mostrar);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(Resultado.getText().toString());
                    Resultado.setText(String.valueOf(resultado));
                }
            }
        });




    }
}
