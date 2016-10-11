package com.redes.comunicacionlinternas.rt_x;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.redes.comunicacionlinternas.rt_x.Codigos.CodigosActivity;
import com.redes.comunicacionlinternas.rt_x.Decodificador.DecodificadorActivity;
import com.redes.comunicacionlinternas.rt_x.MatricesEjemplo.MatricesEjemploActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener
{
    private static final String TAG = "HomeActivity" ;

    String Codigo_Recibido;

    int Confirmacion_Cambio_Codigo;

    SharedPreferences pref;

    Toolbar toolbar;

    public static final String PREF_CODIGO = "NUEVO_CODIGO";
    public static final String PREF_CODIGO_VALOR = "Valor_Nuevo";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_home);

        toolbar = (Toolbar) findViewById(R.id.toolbarhome);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.Blanco));
        getSupportActionBar().setTitle("RT-x");

        pref = getSharedPreferences(HomeActivity.PREF_CODIGO, MODE_PRIVATE);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras != null)
        {
            Codigo_Recibido = extras.getString("NUEVO_CODIGO");
            Log.i(TAG, "Log >> StringRecibido_1: " + Codigo_Recibido);

            Confirmacion_Cambio_Codigo = Integer.parseInt(Codigo_Recibido.substring(0, 1)); //(0,1)

            if(Codigo_Recibido != null && Confirmacion_Cambio_Codigo != 0)
            {
                SharedPreferences.Editor editor = pref.edit();
                editor.putString(PREF_CODIGO_VALOR, String.valueOf(Codigo_Recibido));
                Log.i(TAG, "Log >> StringRecibido_2: " + Codigo_Recibido);
                editor.commit();
            }
        }
        if(Codigo_Recibido == null || Confirmacion_Cambio_Codigo == 0)
        {
            Codigo_Recibido = (pref.getString(HomeActivity.PREF_CODIGO_VALOR, "3777377737773777377737773777377737773777173777")); //Es el primer juego de claves
            Log.i(TAG, "Log >> StringGuardado: " + Codigo_Recibido);
        }
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.code:
                Intent intent = new Intent(this, CodigosActivity.class);
                intent.putExtra("CODIGO_GUARDADO", Codigo_Recibido);
                startActivity(intent);
                HomeActivity.this.finish();
                break;
            case R.id.deco:
                new AlertDialog.Builder(this)
                        .setIcon(R.drawable.fox)
                        .setTitle("RT-x")
                        .setMessage("Orden de Transmisión")
                        .setPositiveButton("Columnas", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                Intent intent2 = new Intent(HomeActivity.this, DecodificadorActivity.class);
                                intent2.putExtra("CODIGO_GUARDADO", Codigo_Recibido);
                                intent2.putExtra("ORDEN", "Columnas");
                                startActivity(intent2);
                                HomeActivity.this.finish();
                            }
                        })
                        .setNegativeButton("Filas", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                Intent intent2 = new Intent(HomeActivity.this, DecodificadorActivity.class);
                                intent2.putExtra("CODIGO_GUARDADO", Codigo_Recibido);
                                intent2.putExtra("ORDEN", "Filas");
                                startActivity(intent2);
                                HomeActivity.this.finish();
                            }
                        })
                        .show();
                break;
            case R.id.matricesimagen:
                new AlertDialog.Builder(this)
                        .setIcon(R.drawable.fox)
                        .setTitle("RT-x")
                        .setMessage("Orden de Transmisión")
                        .setPositiveButton("Columnas", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                Intent intent3 = new Intent(HomeActivity.this, MatricesEjemploActivity.class);
                                intent3.putExtra("CODIGO_GUARDADO", Codigo_Recibido);
                                intent3.putExtra("ORDEN", "Columnas");
                                startActivity(intent3);
                                HomeActivity.this.finish();
                            }
                        })
                        .setNegativeButton("Filas", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                Intent intent3 = new Intent(HomeActivity.this, MatricesEjemploActivity.class);
                                intent3.putExtra("CODIGO_GUARDADO", Codigo_Recibido);
                                intent3.putExtra("ORDEN", "Filas");
                                startActivity(intent3);
                                HomeActivity.this.finish();
                            }
                        })
                        .show();
                break;
        }
    }
}