package com.andres.interfazusuarioviewsbasicos;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;


import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    public static TextView txtHoraNacimiento, txtFechaNacimiento;
    public TextView txtUserName, txtPassword, txtNombrePila;
    public CheckBox chkJava, chkDotNet, chkPhyton;
    public RadioButton rdbMasculino, rdbFemenino;
    public Switch swNotificaciones;
    public ToggleButton tbPublicidad;
    public Spinner spOrigen;

    public ImageButton btnHoraNacimiento,btnFechaNacimiento;
    public Button btnGuardar;
    public static int year, month, date, hrs, min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUserName = (EditText) findViewById(R.id.et_username);
        txtPassword = (EditText) findViewById(R.id.et_password);
        txtNombrePila = (EditText) findViewById(R.id.et_nombrePila);
        chkDotNet = (CheckBox) findViewById(R.id.cb_dotnet);
        chkJava = (CheckBox) findViewById(R.id.cb_java);
        chkPhyton = (CheckBox) findViewById(R.id.cb_phyton);
        rdbFemenino = (RadioButton) findViewById(R.id.rd_femenino);
        rdbMasculino = (RadioButton) findViewById(R.id.rd_masculino);
        swNotificaciones = (Switch) findViewById(R.id.sw_notificaciones);
        tbPublicidad = (ToggleButton) findViewById(R.id.tg_publicidad);
        spOrigen = (Spinner) findViewById(R.id.sp_origen);

        btnHoraNacimiento =
                (ImageButton)findViewById(R.id.ib_horaFechaNacimiento);
        btnFechaNacimiento =
                (ImageButton)findViewById(R.id.ib_calenFechaNacimiento);

        txtHoraNacimiento =
                (TextView) findViewById(R.id.tv_horaNacimiento);
        txtFechaNacimiento =
                (TextView) findViewById(R.id.tv_fechaNacimiento);

        btnGuardar =
                (Button) findViewById(R.id.btn_guardar);


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("GUARDAR");
                builder.setMessage("ESTAS SEGURO DE GUARDAR LOS DATOS ");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Usuario objUsr = new Usuario();
                        objUsr.setUsername(txtUserName.getText().toString());
                        objUsr.setPassword(txtPassword.getText().toString());
                        objUsr.setNombrePila(txtNombrePila.getText().toString());

                        String tecnologias = "";
                        tecnologias += (chkDotNet.isChecked())? ".NET;" : "";
                        tecnologias += (chkJava.isChecked())? "JAVA;" : "";
                        tecnologias += (chkPhyton.isChecked())? "PHYTON;":"";
                        objUsr.setTecnologias(tecnologias );

                        objUsr.setGenero((rdbFemenino.isChecked())?"FEMENINO":"MASCULINO");
                        objUsr.setNotificaciones(swNotificaciones.isChecked());
                        objUsr.setPublicidad(tbPublicidad.isChecked());
                        objUsr.setIes_origen(spOrigen.getSelectedItem().toString() );
                        objUsr.setFechaHoraNacimiento(new Date(year, month, date, hrs, min));

                        String FILENAME = "archivo.txt";
                        String datoAEscribir= objUsr.toString();

                        try {
                            FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
                            PrintWriter writer = new PrintWriter(fos);
                            writer.println(datoAEscribir);
                            writer.close();
                            fos.close();
                            Toast.makeText(MainActivity.this, "DATOS CORRECTAMENTE"+ datoAEscribir, Toast.LENGTH_SHORT).show();
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "Error al escribir los datos", Toast.LENGTH_SHORT).show();
                        }

                        try {
                            FileInputStream fis = openFileInput(FILENAME);
                            InputStreamReader isr = new InputStreamReader(fis);
                            BufferedReader reader = new BufferedReader(isr);
                            String datosLeidos = reader.readLine();
                            reader.close();
                            Toast.makeText(MainActivity.this, "DATOS RECUPERADOS", Toast.LENGTH_LONG).show();
                        }catch (Exception ex){
                            Toast.makeText(MainActivity.this, "ERROR AL LEEER LOS DATOS", Toast.LENGTH_LONG).show();
                        }
                    }
                });
                builder.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "A ELEGIDO NO GUARDAR EL REGISTRO", Toast.LENGTH_LONG).show();
                    }
                });
                Dialog dialog = builder.create();
                dialog.show();

            }
        });


        btnHoraNacimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                newFragment.show(getFragmentManager(), "timePicker");
            }
        });
        btnFechaNacimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new DatePickerFragment();
                newFragment.show(getFragmentManager(), "DatePicker");
            }
        });

    }

    public static class TimePickerFragment extends DialogFragment
            implements TimePickerDialog.OnTimeSetListener{

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current time as the default values for the picker
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            // Create a new instance of TimePickerDialog and return it
            return new TimePickerDialog(getActivity(), this, hour, minute,
                    DateFormat.is24HourFormat(getActivity()));
        }

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            //Programar nuestro código en respuesta a que se seleccionó hora
            hrs = hourOfDay;
            min = minute;
            txtHoraNacimiento.setText("Hora:" + hourOfDay + " Minuto:" + minute);
        }
    }

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);

        }

        public void onDateSet(DatePicker view, int y, int m, int d) {
            // Do something with the date chosen by the user
            year = y;
            month = m+1;
            date = d;
            txtFechaNacimiento.setText("Día:" + date +
                    " Mes:" + month +
                    " Año:" + year);

        }
    }

}
