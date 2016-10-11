package com.redes.comunicacionlinternas.rt_x.Codigos;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.redes.comunicacionlinternas.rt_x.HomeActivity;
import com.redes.comunicacionlinternas.rt_x.R;

public class CodigosActivity extends AppCompatActivity implements View.OnClickListener
{
    private static final String TAG = "RX" ;

    /*Codificación de cada Imágen */

    TextView Codigoa;
    TextView Codigob;
    TextView Codigoc;
    TextView Codigod;
    TextView Codigoe;
    TextView Codigof;
    TextView Codigog;
    TextView Codigoh;
    TextView Codigoend;
    TextView Codigorep;
    TextView Codigorep1;
    TextView Codigosalto;

    ImageView TvCodigo;
    ImageButton Btsalto;

    EditText EditNuevoCodigo;

    String StringGuardar;
    String Codigo_Recibido;
    String StringNuevoCodigo;
    String BanderaImagenActual;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_codigos);

        toolbar = (Toolbar) findViewById(R.id.toolbarhome);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.Blanco));
        getSupportActionBar().setTitle("RT-x Códigos");

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras != null){
            Codigo_Recibido = extras.getString("CODIGO_GUARDADO");
            Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        }

        Codigoa=(TextView)findViewById(R.id.Codigoa);
        Codigob=(TextView)findViewById(R.id.Codigob);
        Codigoc=(TextView)findViewById(R.id.Codigoc);
        Codigod=(TextView)findViewById(R.id.Codigod);
        Codigoe=(TextView)findViewById(R.id.Codigoe);
        Codigof=(TextView)findViewById(R.id.Codigof);
        Codigog=(TextView)findViewById(R.id.Codigog);
        Codigoh=(TextView)findViewById(R.id.Codigoh);
        Codigoend=(TextView)findViewById(R.id.Codigoend);
        Codigorep=(TextView)findViewById(R.id.Codigorep);
        Codigorep1=(TextView)findViewById(R.id.Codigorep1);
        Codigosalto=(TextView)findViewById(R.id.Codigosalto);

        MostrarCodigos_Guardados(Codigo_Recibido);

        EditNuevoCodigo=(EditText)findViewById(R.id.editText);

        Btsalto=(ImageButton)findViewById(R.id.buttonSalto);
        TvCodigo=(ImageView)findViewById(R.id.imageButtonnuevo);

        assert EditNuevoCodigo != null;
        EditNuevoCodigo.setEnabled(false);

        EditNuevoCodigo.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                CambiarCodigo();
                return true;
            }
        });
    }

    @Override
    public void onClick(View v)
    {
        Log.i(TAG, "Log >> OnClick: Funciona");
        EditNuevoCodigo.setEnabled(true);

        switch (v.getId()) {
            case R.id.imageButtona:
                BanderaImagenActual = "a";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: "+ BanderaImagenActual);
                break;
            case R.id.imageButtonb:
                BanderaImagenActual = "b";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
            case R.id.imageButtonc:
                BanderaImagenActual = "c";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
            case R.id.imageButtond:
                BanderaImagenActual = "d";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
            case R.id.imageButtone:
                BanderaImagenActual = "e";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
            case R.id.imageButtonf:
                BanderaImagenActual = "f";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
            case R.id.imageButtong:
                BanderaImagenActual = "g";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
            case R.id.imageButtonh:
                BanderaImagenActual = "h";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
            case R.id.buttonEnd:
                BanderaImagenActual = "end";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
            case R.id.buttonRep:
                BanderaImagenActual = "rep";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
            case R.id.buttonRep1:
                BanderaImagenActual = "rep1";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
            case R.id.buttonSalto:
                BanderaImagenActual = "salto";
                MostrarImagen(BanderaImagenActual);
                Log.i(TAG, "Log >> OnClick: " + BanderaImagenActual);
                break;
        }
    }

    public void MostrarImagen(String x)
    {
            if(x.equals("a"))
            {
                TvCodigo.setImageResource(R.drawable.a);
            }
            if(x.equals("b"))
            {
                TvCodigo.setImageResource(R.drawable.b);
            }
            if(x.equals("c"))
            {
                TvCodigo.setImageResource(R.drawable.c);
            }
            if(x.equals("d"))
            {
                TvCodigo.setImageResource(R.drawable.d);
            }
            if(x.equals("e"))
            {
                TvCodigo.setImageResource(R.drawable.e);
            }
            if(x.equals("f"))
            {
                TvCodigo.setImageResource(R.drawable.f);
            }
            if(x.equals("g"))
            {
                TvCodigo.setImageResource(R.drawable.g);
            }
            if(x.equals("h"))
            {
                TvCodigo.setImageResource(R.drawable.h);
            }
            if(x.equals("salto"))
            {
                TvCodigo.setImageResource(R.drawable.salto);
            }
            if(x.equals("rep"))
            {
                TvCodigo.setImageResource(R.drawable.repeat);
            }
            if(x.equals("rep1"))
            {
                TvCodigo.setImageResource(R.drawable.plus);
            }
            if(x.equals("end"))
            {
                TvCodigo.setImageResource(R.drawable.end);
            }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void CambiarCodigo()
    {
        String StringIngresado = EditNuevoCodigo.getText().toString();

        if(StringIngresado.length() > 3)
        {
            StringNuevoCodigo = StringIngresado.substring(0,3);
        }
        else
        {
            StringNuevoCodigo = StringIngresado;
        }

        if(StringIngresado.length() != 0)
        {
            Log.i(TAG, "Log >> BanderaImagenActual: " + BanderaImagenActual);
            Log.i(TAG, "Log >> StringNuevoCodigo: " + StringNuevoCodigo);

            if (BanderaImagenActual.equals("a"))
            {
                Codigoa.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("b"))
            {
                Codigob.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("c"))
            {
                Codigoc.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("d"))
            {
                Codigod.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("e"))
            {
                Codigoe.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("f"))
            {
                Codigof.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("g"))
            {
                Codigog.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("h"))
            {
                Codigoh.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("end"))
            {
                Codigoend.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("rep"))
            {
                Codigorep.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("rep1"))
            {
                Codigorep1.setText(StringNuevoCodigo);
            }
            if (BanderaImagenActual.equals("salto"))
            {
                Codigosalto.setText(StringNuevoCodigo);
            }
        }
        else
        {
            EditNuevoCodigo.setError("Ingrese Código Válido");
        }
    }

    @Override
    public void onBackPressed()
    {
        StringGuardar = Integer.toString(Codigoa.length());
        StringGuardar = StringGuardar + Codigoa.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigob.length());
        StringGuardar = StringGuardar + Codigob.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigoc.length());
        StringGuardar = StringGuardar + Codigoc.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigod.length());
        StringGuardar = StringGuardar + Codigod.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigoe.length());
        StringGuardar = StringGuardar + Codigoe.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigof.length());
        StringGuardar = StringGuardar + Codigof.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigog.length());
        StringGuardar = StringGuardar + Codigog.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigoh.length());
        StringGuardar = StringGuardar + Codigoh.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigosalto.length());
        StringGuardar = StringGuardar + Codigosalto.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigorep.length());
        StringGuardar = StringGuardar + Codigorep.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigorep1.length());
        StringGuardar = StringGuardar + Codigorep1.getText();

        StringGuardar = StringGuardar + Integer.toString(Codigoend.length());
        StringGuardar = StringGuardar + Codigoend.getText();

        if(Codigo_Recibido.equals(StringGuardar))
        {
            Intent intent = new Intent(CodigosActivity.this,HomeActivity.class);
            intent.putExtra("NUEVO_CODIGO","0");
            Log.i(TAG, "Log >> StringEnviado: " + "0");
            startActivity(intent);
            CodigosActivity.this.finish();
        }
        else
        {
            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.fox)
                    .setTitle("RT-x")
                    .setMessage("Desea Guardar los Cambios?")
                    .setPositiveButton("Si", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            Intent intent = new Intent(CodigosActivity.this,HomeActivity.class);
                            intent.putExtra("NUEVO_CODIGO",StringGuardar);
                            Log.i(TAG, "Log >> StringEnviado: " + StringGuardar);
                            startActivity(intent);
                            CodigosActivity.this.finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            Intent intent = new Intent(CodigosActivity.this,HomeActivity.class);
                            intent.putExtra("NUEVO_CODIGO","0");
                            Log.i(TAG, "Log >> StringEnviado: " + "0");
                            startActivity(intent);
                            CodigosActivity.this.finish();
                        }
                    })
                    .show();
        }
    }

    void MostrarCodigos_Guardados(String Codigo_Recibido)
    {
        String codigoguardado_a;
        String codigoguardado_b;
        String codigoguardado_c;
        String codigoguardado_d;
        String codigoguardado_e;
        String codigoguardado_f;
        String codigoguardado_g;
        String codigoguardado_h;
        String codigoguardado_end;
        String codigoguardado_rep;
        String codigoguardado_rep1;
        String codigoguardado_salto;

        int Tamaño_Figuras;
        int Tamaño_Salto;
        int Tamaño_End;
        int Tamaño_Rep;
        int Tamaño_Rep1;

        int end = 1;

        Tamaño_Figuras = Integer.parseInt(Codigo_Recibido.substring(0, end)); //(0,1)
        codigoguardado_a = Codigo_Recibido.substring(end, end + Tamaño_Figuras); //(1,5)
        Log.i(TAG, "Log >> Codigoguardado_a: " + codigoguardado_a + " end: " + end + " Tamaño: " + Tamaño_Figuras);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigoa.setText(codigoguardado_a);
        end = end + Tamaño_Figuras;

        Tamaño_Figuras = Integer.parseInt(Codigo_Recibido.substring(end, end + 1)); //(5,6)
        codigoguardado_b = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_Figuras); //(6,10)
        Log.i(TAG, "Log >> Codigoguardado_b: " + codigoguardado_b + " end: " + end + " Tamaño: " + Tamaño_Figuras);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigob.setText(codigoguardado_b);
        end = end + Tamaño_Figuras + 1;

        Tamaño_Figuras = Integer.parseInt(Codigo_Recibido.substring(end, end + 1));
        codigoguardado_c = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_Figuras);
        Log.i(TAG, "Log >> Codigoguardado_c: " + codigoguardado_c + " end: " + end + " Tamaño: " + Tamaño_Figuras);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigoc.setText(codigoguardado_c);
        end = end + Tamaño_Figuras + 1;

        Tamaño_Figuras = Integer.parseInt(Codigo_Recibido.substring(end, end + 1));
        codigoguardado_d = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_Figuras);
        Log.i(TAG, "Log >> Codigoguardado_d: " + codigoguardado_d + " end: " + end + " Tamaño: " + Tamaño_Figuras);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigod.setText(codigoguardado_d);
        end = end + Tamaño_Figuras + 1;

        Tamaño_Figuras = Integer.parseInt(Codigo_Recibido.substring(end, end + 1));
        codigoguardado_e = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_Figuras);
        Log.i(TAG, "Log >> Codigoguardado_e: " + codigoguardado_e + " end: " + end + " Tamaño: " + Tamaño_Figuras);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigoe.setText(codigoguardado_e);
        end = end + Tamaño_Figuras + 1;

        Tamaño_Figuras = Integer.parseInt(Codigo_Recibido.substring(end, end + 1));
        codigoguardado_f = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_Figuras);
        Log.i(TAG, "Log >> Codigoguardado_f: " + codigoguardado_f + " end: " + end + " Tamaño: " + Tamaño_Figuras);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigof.setText(codigoguardado_f);
        end = end + Tamaño_Figuras + 1;

        Tamaño_Figuras = Integer.parseInt(Codigo_Recibido.substring(end, end + 1));
        codigoguardado_g = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_Figuras);
        Log.i(TAG, "Log >> Codigoguardado_g: " + codigoguardado_g + " end: " + end + " Tamaño: " + Tamaño_Figuras);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigog.setText(codigoguardado_g);
        end = end + Tamaño_Figuras + 1;

        Tamaño_Figuras = Integer.parseInt(Codigo_Recibido.substring(end, end + 1));
        codigoguardado_h = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_Figuras);
        Log.i(TAG, "Log >> Codigoguardado_h: " + codigoguardado_h + " end: " + end + " Tamaño: " + Tamaño_Figuras);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigoh.setText(codigoguardado_h);
        end = end + Tamaño_Figuras + 1;

        Tamaño_Salto = Integer.parseInt(Codigo_Recibido.substring(end, end + 1));
        codigoguardado_salto = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_Salto);
        Log.i(TAG, "Log >> Codigoguardado_salto: " + codigoguardado_salto + " end: " + end + " Tamaño: " + Tamaño_Salto);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigosalto.setText(codigoguardado_salto);
        end = end + Tamaño_Salto + 1;

        Tamaño_Rep = Integer.parseInt(Codigo_Recibido.substring(end, end + 1));
        codigoguardado_rep = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_Rep);
        Log.i(TAG, "Log >> Codigoguardado_rep: " + codigoguardado_rep + " end: " + end + " Tamaño: " + Tamaño_Rep);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigorep.setText(codigoguardado_rep);
        end = end + Tamaño_Rep + 1;

        Tamaño_Rep1 = Integer.parseInt(Codigo_Recibido.substring(end, end + 1));
        codigoguardado_rep1 = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_Rep1);
        Log.i(TAG, "Log >> Codigoguardado_rep1: " + codigoguardado_rep1 + " end: " + end + " Tamaño: " + Tamaño_Rep1);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigorep1.setText(codigoguardado_rep1);
        end = end + Tamaño_Rep1 + 1;

        Tamaño_End = Integer.parseInt(Codigo_Recibido.substring(end, end + 1));
        codigoguardado_end = Codigo_Recibido.substring(end + 1, end + 1 + Tamaño_End);
        Log.i(TAG, "Log >> Codigoguardado_end: " + codigoguardado_end + " end: " + end + " Tamaño: " + Tamaño_End);
        Log.i(TAG, "Log >> StringRecibido: " + Codigo_Recibido);
        Codigoend.setText(codigoguardado_end);
    }
}