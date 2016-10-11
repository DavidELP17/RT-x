package com.redes.comunicacionlinternas.rt_x.Decodificador;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.redes.comunicacionlinternas.rt_x.HomeActivity;
import com.redes.comunicacionlinternas.rt_x.R;

public class DecodificadorActivity extends AppCompatActivity implements View.OnClickListener
{
    private static final String TAG = "Deco" ;

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

    int BanderaRep=0;

    String captura;
    int revision_000=0;
    private MediaPlayer sonido_error;
    boolean mostrar_data = false;
    String Datos_Recogidos = "Data ";

    int Columnaout=0;
    int Filaout=0;
    int primeratrama=0;
    int gone = 15;
    int LimGone;
    int contador_errores = 0;

    private EditText passwordEditText;
    private TextView textView;

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

    String codigoguardado_erro = "212";
    String codigoguardado_elimdeco = "Fox";

    String Codigo_Recibido;
    String Orden_Recibido;

    String Memoria = "Fox";

    Toolbar toolbar;

    int offset = 3;

    int Bandera_InFn_Rep = 0;

    ImageView F0C0;
    ImageView F0C1;
    ImageView F0C2;
    ImageView F0C3;
    ImageView F0C4;
    ImageView F0C5;
    ImageView F0C6;
    ImageView F0C7;
    ImageView F0C8;
    ImageView F0C9;
    ImageView F0C10;
    ImageView F0C11;
    ImageView F0C12;
    ImageView F0C13;
    ImageView F0C14;
    ImageView F0C15;
    ImageView F0C16;

    ImageButton buttonRep;
    ImageButton buttonRep1;

    ImageView F1C0;
    ImageView F1C1;
    ImageView F1C2;
    ImageView F1C3;
    ImageView F1C4;
    ImageView F1C5;
    ImageView F1C6;
    ImageView F1C7;
    ImageView F1C8;
    ImageView F1C9;
    ImageView F1C10;
    ImageView F1C11;
    ImageView F1C12;
    ImageView F1C13;
    ImageView F1C14;
    ImageView F1C15;
    ImageView F1C16;

    ImageView F2C0;
    ImageView F2C1;
    ImageView F2C2;
    ImageView F2C3;
    ImageView F2C4;
    ImageView F2C5;
    ImageView F2C6;
    ImageView F2C7;
    ImageView F2C8;
    ImageView F2C9;
    ImageView F2C10;
    ImageView F2C11;
    ImageView F2C12;
    ImageView F2C13;
    ImageView F2C14;
    ImageView F2C15;
    ImageView F2C16;

    ImageView F3C0;
    ImageView F3C1;
    ImageView F3C2;
    ImageView F3C3;
    ImageView F3C4;
    ImageView F3C5;
    ImageView F3C6;
    ImageView F3C7;
    ImageView F3C8;
    ImageView F3C9;
    ImageView F3C10;
    ImageView F3C11;
    ImageView F3C12;
    ImageView F3C13;
    ImageView F3C14;
    ImageView F3C15;
    ImageView F3C16;

    ImageView F4C0;
    ImageView F4C1;
    ImageView F4C2;
    ImageView F4C3;
    ImageView F4C4;
    ImageView F4C5;
    ImageView F4C6;
    ImageView F4C7;
    ImageView F4C8;
    ImageView F4C9;
    ImageView F4C10;
    ImageView F4C11;
    ImageView F4C12;
    ImageView F4C13;
    ImageView F4C14;
    ImageView F4C15;
    ImageView F4C16;

    ImageView F5C0;
    ImageView F5C1;
    ImageView F5C2;
    ImageView F5C3;
    ImageView F5C4;
    ImageView F5C5;
    ImageView F5C6;
    ImageView F5C7;
    ImageView F5C8;
    ImageView F5C9;
    ImageView F5C10;
    ImageView F5C11;
    ImageView F5C12;
    ImageView F5C13;
    ImageView F5C14;
    ImageView F5C15;
    ImageView F5C16;

    ImageView F6C0;
    ImageView F6C1;
    ImageView F6C2;
    ImageView F6C3;
    ImageView F6C4;
    ImageView F6C5;
    ImageView F6C6;
    ImageView F6C7;
    ImageView F6C8;
    ImageView F6C9;
    ImageView F6C10;
    ImageView F6C11;
    ImageView F6C12;
    ImageView F6C13;
    ImageView F6C14;
    ImageView F6C15;
    ImageView F6C16;

    ImageView F7C0;
    ImageView F7C1;
    ImageView F7C2;
    ImageView F7C3;
    ImageView F7C4;
    ImageView F7C5;
    ImageView F7C6;
    ImageView F7C7;
    ImageView F7C8;
    ImageView F7C9;
    ImageView F7C10;
    ImageView F7C11;
    ImageView F7C12;
    ImageView F7C13;
    ImageView F7C14;
    ImageView F7C15;
    ImageView F7C16;

    ImageView F8C0;
    ImageView F8C1;
    ImageView F8C2;
    ImageView F8C3;
    ImageView F8C4;
    ImageView F8C5;
    ImageView F8C6;
    ImageView F8C7;
    ImageView F8C8;
    ImageView F8C9;
    ImageView F8C10;
    ImageView F8C11;
    ImageView F8C12;
    ImageView F8C13;
    ImageView F8C14;
    ImageView F8C15;
    ImageView F8C16;

    ImageView F9C0;
    ImageView F9C1;
    ImageView F9C2;
    ImageView F9C3;
    ImageView F9C4;
    ImageView F9C5;
    ImageView F9C6;
    ImageView F9C7;
    ImageView F9C8;
    ImageView F9C9;
    ImageView F9C10;
    ImageView F9C11;
    ImageView F9C12;
    ImageView F9C13;
    ImageView F9C14;
    ImageView F9C15;
    ImageView F9C16;

    ImageView F10C0;
    ImageView F10C1;
    ImageView F10C2;
    ImageView F10C3;
    ImageView F10C4;
    ImageView F10C5;
    ImageView F10C6;
    ImageView F10C7;
    ImageView F10C8;
    ImageView F10C9;
    ImageView F10C10;
    ImageView F10C11;
    ImageView F10C12;
    ImageView F10C13;
    ImageView F10C14;
    ImageView F10C15;
    ImageView F10C16;

    ImageView F11C0;
    ImageView F11C1;
    ImageView F11C2;
    ImageView F11C3;
    ImageView F11C4;
    ImageView F11C5;
    ImageView F11C6;
    ImageView F11C7;
    ImageView F11C8;
    ImageView F11C9;
    ImageView F11C10;
    ImageView F11C11;
    ImageView F11C12;
    ImageView F11C13;
    ImageView F11C14;
    ImageView F11C15;
    ImageView F11C16;

    ImageView F12C0;
    ImageView F12C1;
    ImageView F12C2;
    ImageView F12C3;
    ImageView F12C4;
    ImageView F12C5;
    ImageView F12C6;
    ImageView F12C7;
    ImageView F12C8;
    ImageView F12C9;
    ImageView F12C10;
    ImageView F12C11;
    ImageView F12C12;
    ImageView F12C13;
    ImageView F12C14;
    ImageView F12C15;
    ImageView F12C16;

    ImageView F13C0;
    ImageView F13C1;
    ImageView F13C2;
    ImageView F13C3;
    ImageView F13C4;
    ImageView F13C5;
    ImageView F13C6;
    ImageView F13C7;
    ImageView F13C8;
    ImageView F13C9;
    ImageView F13C10;
    ImageView F13C11;
    ImageView F13C12;
    ImageView F13C13;
    ImageView F13C14;
    ImageView F13C15;
    ImageView F13C16;

    ImageView F14C0;
    ImageView F14C1;
    ImageView F14C2;
    ImageView F14C3;
    ImageView F14C4;
    ImageView F14C5;
    ImageView F14C6;
    ImageView F14C7;
    ImageView F14C8;
    ImageView F14C9;
    ImageView F14C10;
    ImageView F14C11;
    ImageView F14C12;
    ImageView F14C13;
    ImageView F14C14;
    ImageView F14C15;
    ImageView F14C16;

    ImageView F15C0;
    ImageView F15C1;
    ImageView F15C2;
    ImageView F15C3;
    ImageView F15C4;
    ImageView F15C5;
    ImageView F15C6;
    ImageView F15C7;
    ImageView F15C8;
    ImageView F15C9;
    ImageView F15C10;
    ImageView F15C11;
    ImageView F15C12;
    ImageView F15C13;
    ImageView F15C14;
    ImageView F15C15;
    ImageView F15C16;

    ImageView F16C0;
    ImageView F16C1;
    ImageView F16C2;
    ImageView F16C3;
    ImageView F16C4;
    ImageView F16C5;
    ImageView F16C6;
    ImageView F16C7;
    ImageView F16C8;
    ImageView F16C9;
    ImageView F16C10;
    ImageView F16C11;
    ImageView F16C12;
    ImageView F16C13;
    ImageView F16C14;
    ImageView F16C15;
    ImageView F16C16;

    int Fila=0;
    int Columna=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_decodificador);

        /* Initializing views */
        passwordEditText = (EditText) findViewById(R.id.password);
        textView = (TextView) findViewById(R.id.passwordHint);

        /* Set Text Watcher listener */
        passwordEditText.addTextChangedListener(passwordWatcher);

        toolbar = (Toolbar) findViewById(R.id.toolbardeco);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.Blanco));

        Codigoa=(TextView)findViewById(R.id.Codigoa);
        Codigob=(TextView)findViewById(R.id.Codigob);
        Codigoc=(TextView)findViewById(R.id.Codigoc);
        Codigod=(TextView)findViewById(R.id.Codigod);
        Codigoe=(TextView)findViewById(R.id.Codigoe);
        Codigof=(TextView)findViewById(R.id.Codigof);
        Codigog=(TextView)findViewById(R.id.Codigog);
        Codigoh=(TextView)findViewById(R.id.Codigoh);
        Codigosalto=(TextView)findViewById(R.id.Codigosalto);
        Codigorep=(TextView)findViewById(R.id.Codigorep);
        Codigorep1=(TextView)findViewById(R.id.Codigorep1);
        Codigoend=(TextView)findViewById(R.id.Codigoend);

        buttonRep1 = (ImageButton)findViewById(R.id.buttonRep1);
        buttonRep = (ImageButton)findViewById(R.id.buttonRep);
        Codigorep1 = (TextView)findViewById(R.id.Codigorep1);
        Codigorep = (TextView)findViewById(R.id.Codigorep);
        buttonRep1.setVisibility(View.GONE);
        Codigorep1.setVisibility(View.GONE);

        F0C0 = (ImageView)findViewById(R.id.F0C0);
        F0C1 = (ImageView)findViewById(R.id.F0C1);
        F0C2 = (ImageView)findViewById(R.id.F0C2);
        F0C3 = (ImageView)findViewById(R.id.F0C3);
        F0C4 = (ImageView)findViewById(R.id.F0C4);
        F0C5 = (ImageView)findViewById(R.id.F0C5);
        F0C6 = (ImageView)findViewById(R.id.F0C6);
        F0C7 = (ImageView)findViewById(R.id.F0C7);
        F0C8 = (ImageView)findViewById(R.id.F0C8);
        F0C9 = (ImageView)findViewById(R.id.F0C9);
        F0C10 = (ImageView)findViewById(R.id.F0C10);
        F0C11 = (ImageView)findViewById(R.id.F0C11);
        F0C12 = (ImageView)findViewById(R.id.F0C12);
        F0C13 = (ImageView)findViewById(R.id.F0C13);
        F0C14 = (ImageView)findViewById(R.id.F0C14);
        F0C15 = (ImageView)findViewById(R.id.F0C15);
        F0C16 = (ImageView)findViewById(R.id.F0C16);

        F1C0 = (ImageView)findViewById(R.id.F1C0);
        F1C1 = (ImageView)findViewById(R.id.F1C1);
        F1C2 = (ImageView)findViewById(R.id.F1C2);
        F1C3 = (ImageView)findViewById(R.id.F1C3);
        F1C4 = (ImageView)findViewById(R.id.F1C4);
        F1C5 = (ImageView)findViewById(R.id.F1C5);
        F1C6 = (ImageView)findViewById(R.id.F1C6);
        F1C7 = (ImageView)findViewById(R.id.F1C7);
        F1C8 = (ImageView)findViewById(R.id.F1C8);
        F1C9 = (ImageView)findViewById(R.id.F1C9);
        F1C10 = (ImageView)findViewById(R.id.F1C10);
        F1C11 = (ImageView)findViewById(R.id.F1C11);
        F1C12 = (ImageView)findViewById(R.id.F1C12);
        F1C13 = (ImageView)findViewById(R.id.F1C13);
        F1C14 = (ImageView)findViewById(R.id.F1C14);
        F1C15 = (ImageView)findViewById(R.id.F1C15);
        F1C16 = (ImageView)findViewById(R.id.F1C16);

        F2C0 = (ImageView)findViewById(R.id.F2C0);
        F2C1 = (ImageView)findViewById(R.id.F2C1);
        F2C2 = (ImageView)findViewById(R.id.F2C2);
        F2C3 = (ImageView)findViewById(R.id.F2C3);
        F2C4 = (ImageView)findViewById(R.id.F2C4);
        F2C5 = (ImageView)findViewById(R.id.F2C5);
        F2C6 = (ImageView)findViewById(R.id.F2C6);
        F2C7 = (ImageView)findViewById(R.id.F2C7);
        F2C8 = (ImageView)findViewById(R.id.F2C8);
        F2C9 = (ImageView)findViewById(R.id.F2C9);
        F2C10 = (ImageView)findViewById(R.id.F2C10);
        F2C11 = (ImageView)findViewById(R.id.F2C11);
        F2C12 = (ImageView)findViewById(R.id.F2C12);
        F2C13 = (ImageView)findViewById(R.id.F2C13);
        F2C14 = (ImageView)findViewById(R.id.F2C14);
        F2C15 = (ImageView)findViewById(R.id.F2C15);
        F2C16 = (ImageView)findViewById(R.id.F2C16);

        F3C0 = (ImageView)findViewById(R.id.F3C0);
        F3C1 = (ImageView)findViewById(R.id.F3C1);
        F3C2 = (ImageView)findViewById(R.id.F3C2);
        F3C3 = (ImageView)findViewById(R.id.F3C3);
        F3C4 = (ImageView)findViewById(R.id.F3C4);
        F3C5 = (ImageView)findViewById(R.id.F3C5);
        F3C6 = (ImageView)findViewById(R.id.F3C6);
        F3C7 = (ImageView)findViewById(R.id.F3C7);
        F3C8 = (ImageView)findViewById(R.id.F3C8);
        F3C9 = (ImageView)findViewById(R.id.F3C9);
        F3C10 = (ImageView)findViewById(R.id.F3C10);
        F3C11 = (ImageView)findViewById(R.id.F3C11);
        F3C12 = (ImageView)findViewById(R.id.F3C12);
        F3C13 = (ImageView)findViewById(R.id.F3C13);
        F3C14 = (ImageView)findViewById(R.id.F3C14);
        F3C15 = (ImageView)findViewById(R.id.F3C15);
        F3C16 = (ImageView)findViewById(R.id.F3C16);

        F4C0 = (ImageView)findViewById(R.id.F4C0);
        F4C1 = (ImageView)findViewById(R.id.F4C1);
        F4C2 = (ImageView)findViewById(R.id.F4C2);
        F4C3 = (ImageView)findViewById(R.id.F4C3);
        F4C4 = (ImageView)findViewById(R.id.F4C4);
        F4C5 = (ImageView)findViewById(R.id.F4C5);
        F4C6 = (ImageView)findViewById(R.id.F4C6);
        F4C7 = (ImageView)findViewById(R.id.F4C7);
        F4C8 = (ImageView)findViewById(R.id.F4C8);
        F4C9 = (ImageView)findViewById(R.id.F4C9);
        F4C10 = (ImageView)findViewById(R.id.F4C10);
        F4C11 = (ImageView)findViewById(R.id.F4C11);
        F4C12 = (ImageView)findViewById(R.id.F4C12);
        F4C13 = (ImageView)findViewById(R.id.F4C13);
        F4C14 = (ImageView)findViewById(R.id.F4C14);
        F4C15 = (ImageView)findViewById(R.id.F4C15);
        F4C16 = (ImageView)findViewById(R.id.F4C16);

        F5C0 = (ImageView)findViewById(R.id.F5C0);
        F5C1 = (ImageView)findViewById(R.id.F5C1);
        F5C2 = (ImageView)findViewById(R.id.F5C2);
        F5C3 = (ImageView)findViewById(R.id.F5C3);
        F5C4 = (ImageView)findViewById(R.id.F5C4);
        F5C5 = (ImageView)findViewById(R.id.F5C5);
        F5C6 = (ImageView)findViewById(R.id.F5C6);
        F5C7 = (ImageView)findViewById(R.id.F5C7);
        F5C8 = (ImageView)findViewById(R.id.F5C8);
        F5C9 = (ImageView)findViewById(R.id.F5C9);
        F5C10 = (ImageView)findViewById(R.id.F5C10);
        F5C11 = (ImageView)findViewById(R.id.F5C11);
        F5C12 = (ImageView)findViewById(R.id.F5C12);
        F5C13 = (ImageView)findViewById(R.id.F5C13);
        F5C14 = (ImageView)findViewById(R.id.F5C14);
        F5C15 = (ImageView)findViewById(R.id.F5C15);
        F5C16 = (ImageView)findViewById(R.id.F5C16);

        F6C0 = (ImageView)findViewById(R.id.F6C0);
        F6C1 = (ImageView)findViewById(R.id.F6C1);
        F6C2 = (ImageView)findViewById(R.id.F6C2);
        F6C3 = (ImageView)findViewById(R.id.F6C3);
        F6C4 = (ImageView)findViewById(R.id.F6C4);
        F6C5 = (ImageView)findViewById(R.id.F6C5);
        F6C6 = (ImageView)findViewById(R.id.F6C6);
        F6C7 = (ImageView)findViewById(R.id.F6C7);
        F6C8 = (ImageView)findViewById(R.id.F6C8);
        F6C9 = (ImageView)findViewById(R.id.F6C9);
        F6C10 = (ImageView)findViewById(R.id.F6C10);
        F6C11 = (ImageView)findViewById(R.id.F6C11);
        F6C12 = (ImageView)findViewById(R.id.F6C12);
        F6C13 = (ImageView)findViewById(R.id.F6C13);
        F6C14 = (ImageView)findViewById(R.id.F6C14);
        F6C15 = (ImageView)findViewById(R.id.F6C15);
        F6C16 = (ImageView)findViewById(R.id.F6C16);

        F7C0 = (ImageView)findViewById(R.id.F7C0);
        F7C1 = (ImageView)findViewById(R.id.F7C1);
        F7C2 = (ImageView)findViewById(R.id.F7C2);
        F7C3 = (ImageView)findViewById(R.id.F7C3);
        F7C4 = (ImageView)findViewById(R.id.F7C4);
        F7C5 = (ImageView)findViewById(R.id.F7C5);
        F7C6 = (ImageView)findViewById(R.id.F7C6);
        F7C7 = (ImageView)findViewById(R.id.F7C7);
        F7C8 = (ImageView)findViewById(R.id.F7C8);
        F7C9 = (ImageView)findViewById(R.id.F7C9);
        F7C10 = (ImageView)findViewById(R.id.F7C10);
        F7C11 = (ImageView)findViewById(R.id.F7C11);
        F7C12 = (ImageView)findViewById(R.id.F7C12);
        F7C13 = (ImageView)findViewById(R.id.F7C13);
        F7C14 = (ImageView)findViewById(R.id.F7C14);
        F7C15 = (ImageView)findViewById(R.id.F7C15);
        F7C16 = (ImageView)findViewById(R.id.F7C16);

        F8C0 = (ImageView)findViewById(R.id.F8C0);
        F8C1 = (ImageView)findViewById(R.id.F8C1);
        F8C2 = (ImageView)findViewById(R.id.F8C2);
        F8C3 = (ImageView)findViewById(R.id.F8C3);
        F8C4 = (ImageView)findViewById(R.id.F8C4);
        F8C5 = (ImageView)findViewById(R.id.F8C5);
        F8C6 = (ImageView)findViewById(R.id.F8C6);
        F8C7 = (ImageView)findViewById(R.id.F8C7);
        F8C8 = (ImageView)findViewById(R.id.F8C8);
        F8C9 = (ImageView)findViewById(R.id.F8C9);
        F8C10 = (ImageView)findViewById(R.id.F8C10);
        F8C11 = (ImageView)findViewById(R.id.F8C11);
        F8C12 = (ImageView)findViewById(R.id.F8C12);
        F8C13 = (ImageView)findViewById(R.id.F8C13);
        F8C14 = (ImageView)findViewById(R.id.F8C14);
        F8C15 = (ImageView)findViewById(R.id.F8C15);
        F8C16 = (ImageView)findViewById(R.id.F8C16);

        F9C0 = (ImageView)findViewById(R.id.F9C0);
        F9C1 = (ImageView)findViewById(R.id.F9C1);
        F9C2 = (ImageView)findViewById(R.id.F9C2);
        F9C3 = (ImageView)findViewById(R.id.F9C3);
        F9C4 = (ImageView)findViewById(R.id.F9C4);
        F9C5 = (ImageView)findViewById(R.id.F9C5);
        F9C6 = (ImageView)findViewById(R.id.F9C6);
        F9C7 = (ImageView)findViewById(R.id.F9C7);
        F9C8 = (ImageView)findViewById(R.id.F9C8);
        F9C9 = (ImageView)findViewById(R.id.F9C9);
        F9C10 = (ImageView)findViewById(R.id.F9C10);
        F9C11 = (ImageView)findViewById(R.id.F9C11);
        F9C12 = (ImageView)findViewById(R.id.F9C12);
        F9C13 = (ImageView)findViewById(R.id.F9C13);
        F9C14 = (ImageView)findViewById(R.id.F9C14);
        F9C15 = (ImageView)findViewById(R.id.F9C15);
        F9C16 = (ImageView)findViewById(R.id.F9C16);

        F10C0 = (ImageView)findViewById(R.id.F10C0);
        F10C1 = (ImageView)findViewById(R.id.F10C1);
        F10C2 = (ImageView)findViewById(R.id.F10C2);
        F10C3 = (ImageView)findViewById(R.id.F10C3);
        F10C4 = (ImageView)findViewById(R.id.F10C4);
        F10C5 = (ImageView)findViewById(R.id.F10C5);
        F10C6 = (ImageView)findViewById(R.id.F10C6);
        F10C7 = (ImageView)findViewById(R.id.F10C7);
        F10C8 = (ImageView)findViewById(R.id.F10C8);
        F10C9 = (ImageView)findViewById(R.id.F10C9);
        F10C10 = (ImageView)findViewById(R.id.F10C10);
        F10C11 = (ImageView)findViewById(R.id.F10C11);
        F10C12 = (ImageView)findViewById(R.id.F10C12);
        F10C13 = (ImageView)findViewById(R.id.F10C13);
        F10C14 = (ImageView)findViewById(R.id.F10C14);
        F10C15 = (ImageView)findViewById(R.id.F10C15);
        F10C16 = (ImageView)findViewById(R.id.F10C16);

        F11C0 = (ImageView)findViewById(R.id.F11C0);
        F11C1 = (ImageView)findViewById(R.id.F11C1);
        F11C2 = (ImageView)findViewById(R.id.F11C2);
        F11C3 = (ImageView)findViewById(R.id.F11C3);
        F11C4 = (ImageView)findViewById(R.id.F11C4);
        F11C5 = (ImageView)findViewById(R.id.F11C5);
        F11C6 = (ImageView)findViewById(R.id.F11C6);
        F11C7 = (ImageView)findViewById(R.id.F11C7);
        F11C8 = (ImageView)findViewById(R.id.F11C8);
        F11C9 = (ImageView)findViewById(R.id.F11C9);
        F11C10 = (ImageView)findViewById(R.id.F11C10);
        F11C11 = (ImageView)findViewById(R.id.F11C11);
        F11C12 = (ImageView)findViewById(R.id.F11C12);
        F11C13 = (ImageView)findViewById(R.id.F11C13);
        F11C14 = (ImageView)findViewById(R.id.F11C14);
        F11C15 = (ImageView)findViewById(R.id.F11C15);
        F11C16 = (ImageView)findViewById(R.id.F11C16);

        F12C0 = (ImageView)findViewById(R.id.F12C0);
        F12C1 = (ImageView)findViewById(R.id.F12C1);
        F12C2 = (ImageView)findViewById(R.id.F12C2);
        F12C3 = (ImageView)findViewById(R.id.F12C3);
        F12C4 = (ImageView)findViewById(R.id.F12C4);
        F12C5 = (ImageView)findViewById(R.id.F12C5);
        F12C6 = (ImageView)findViewById(R.id.F12C6);
        F12C7 = (ImageView)findViewById(R.id.F12C7);
        F12C8 = (ImageView)findViewById(R.id.F12C8);
        F12C9 = (ImageView)findViewById(R.id.F12C9);
        F12C10 = (ImageView)findViewById(R.id.F12C10);
        F12C11 = (ImageView)findViewById(R.id.F12C11);
        F12C12 = (ImageView)findViewById(R.id.F12C12);
        F12C13 = (ImageView)findViewById(R.id.F12C13);
        F12C14 = (ImageView)findViewById(R.id.F12C14);
        F12C15 = (ImageView)findViewById(R.id.F12C15);
        F12C16 = (ImageView)findViewById(R.id.F12C16);

        F13C0 = (ImageView)findViewById(R.id.F13C0);
        F13C1 = (ImageView)findViewById(R.id.F13C1);
        F13C2 = (ImageView)findViewById(R.id.F13C2);
        F13C3 = (ImageView)findViewById(R.id.F13C3);
        F13C4 = (ImageView)findViewById(R.id.F13C4);
        F13C5 = (ImageView)findViewById(R.id.F13C5);
        F13C6 = (ImageView)findViewById(R.id.F13C6);
        F13C7 = (ImageView)findViewById(R.id.F13C7);
        F13C8 = (ImageView)findViewById(R.id.F13C8);
        F13C9 = (ImageView)findViewById(R.id.F13C9);
        F13C10 = (ImageView)findViewById(R.id.F13C10);
        F13C11 = (ImageView)findViewById(R.id.F13C11);
        F13C12 = (ImageView)findViewById(R.id.F13C12);
        F13C13 = (ImageView)findViewById(R.id.F13C13);
        F13C14 = (ImageView)findViewById(R.id.F13C14);
        F13C15 = (ImageView)findViewById(R.id.F13C15);
        F13C16 = (ImageView)findViewById(R.id.F13C16);

        F14C0 = (ImageView)findViewById(R.id.F14C0);
        F14C1 = (ImageView)findViewById(R.id.F14C1);
        F14C2 = (ImageView)findViewById(R.id.F14C2);
        F14C3 = (ImageView)findViewById(R.id.F14C3);
        F14C4 = (ImageView)findViewById(R.id.F14C4);
        F14C5 = (ImageView)findViewById(R.id.F14C5);
        F14C6 = (ImageView)findViewById(R.id.F14C6);
        F14C7 = (ImageView)findViewById(R.id.F14C7);
        F14C8 = (ImageView)findViewById(R.id.F14C8);
        F14C9 = (ImageView)findViewById(R.id.F14C9);
        F14C10 = (ImageView)findViewById(R.id.F14C10);
        F14C11 = (ImageView)findViewById(R.id.F14C11);
        F14C12 = (ImageView)findViewById(R.id.F14C12);
        F14C13 = (ImageView)findViewById(R.id.F14C13);
        F14C14 = (ImageView)findViewById(R.id.F14C14);
        F14C15 = (ImageView)findViewById(R.id.F14C15);
        F14C16 = (ImageView)findViewById(R.id.F14C16);

        F15C0 = (ImageView)findViewById(R.id.F15C0);
        F15C1 = (ImageView)findViewById(R.id.F15C1);
        F15C2 = (ImageView)findViewById(R.id.F15C2);
        F15C3 = (ImageView)findViewById(R.id.F15C3);
        F15C4 = (ImageView)findViewById(R.id.F15C4);
        F15C5 = (ImageView)findViewById(R.id.F15C5);
        F15C6 = (ImageView)findViewById(R.id.F15C6);
        F15C7 = (ImageView)findViewById(R.id.F15C7);
        F15C8 = (ImageView)findViewById(R.id.F15C8);
        F15C9 = (ImageView)findViewById(R.id.F15C9);
        F15C10 = (ImageView)findViewById(R.id.F15C10);
        F15C11 = (ImageView)findViewById(R.id.F15C11);
        F15C12 = (ImageView)findViewById(R.id.F15C12);
        F15C13 = (ImageView)findViewById(R.id.F15C13);
        F15C14 = (ImageView)findViewById(R.id.F15C14);
        F15C15 = (ImageView)findViewById(R.id.F15C15);
        F15C16 = (ImageView)findViewById(R.id.F15C16);

        F16C0 = (ImageView)findViewById(R.id.F16C0);
        F16C1 = (ImageView)findViewById(R.id.F16C1);
        F16C2 = (ImageView)findViewById(R.id.F16C2);
        F16C3 = (ImageView)findViewById(R.id.F16C3);
        F16C4 = (ImageView)findViewById(R.id.F16C4);
        F16C5 = (ImageView)findViewById(R.id.F16C5);
        F16C6 = (ImageView)findViewById(R.id.F16C6);
        F16C7 = (ImageView)findViewById(R.id.F16C7);
        F16C8 = (ImageView)findViewById(R.id.F16C8);
        F16C9 = (ImageView)findViewById(R.id.F16C9);
        F16C10 = (ImageView)findViewById(R.id.F16C10);
        F16C11 = (ImageView)findViewById(R.id.F16C11);
        F16C12 = (ImageView)findViewById(R.id.F16C12);
        F16C13 = (ImageView)findViewById(R.id.F16C13);
        F16C14 = (ImageView)findViewById(R.id.F16C14);
        F16C15 = (ImageView)findViewById(R.id.F16C15);
        F16C16 = (ImageView)findViewById(R.id.F16C16);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras != null)
        {
            Codigo_Recibido = extras.getString("CODIGO_GUARDADO");
            Log.i(TAG, "Log >> StringRecibido_Deco1: " + Codigo_Recibido);

            Orden_Recibido = extras.getString("ORDEN");
            Log.i(TAG, "Log >> OrdenRecibido_Deco1: " + Orden_Recibido);

            if(Codigo_Recibido != null)
            {
                MostrarCodigos_Guardados(Codigo_Recibido);
            }
            if(Orden_Recibido != null)
            {
                getSupportActionBar().setTitle("RT-x Imágen - " + Orden_Recibido);
            }
        }

        if(Orden_Recibido.equals("Columnas"))
        {
            for (int i = 0; i <= 16; i++)
            {
                ImageView ImageActual = ImageViewUsar(i, 16);

                AgregarImagen(i, 16, "Transparente", ImageActual);
            }
        }

        if(Orden_Recibido.equals("Filas"))
        {
            for (int i = 0; i <= 16; i++)
            {
                ImageView ImageActual = ImageViewUsar(16, i);

                AgregarImagen(16, i, "Transparente", ImageActual);
            }
        }
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.imageButtona:
                Rellenar(codigoguardado_a);
                break;
            case R.id.imageButtonb:
                Rellenar(codigoguardado_b);
                break;
            case R.id.imageButtonc:
                Rellenar(codigoguardado_c);
                break;
            case R.id.imageButtond:
                Rellenar(codigoguardado_d);
                break;
            case R.id.imageButtone:
                Rellenar(codigoguardado_e);
                break;
            case R.id.imageButtonf:
                Rellenar(codigoguardado_f);
                break;
            case R.id.imageButtong:
                Rellenar(codigoguardado_g);
                break;
            case R.id.imageButtonh:
                Rellenar(codigoguardado_h);
                break;
            case R.id.buttonSalto:
                Rellenar(codigoguardado_salto);
                break;
            case R.id.buttonRep:
                Rellenar(codigoguardado_rep);
                break;
            case R.id.buttonRep1:
                Rellenar(codigoguardado_rep1);
                break;
            case R.id.buttonEnd:
                Rellenar(codigoguardado_end);
                break;
            case R.id.buttonErro:
                Rellenar(codigoguardado_erro);
                break;
            case R.id.button_ElimDeco:
                Rellenar(codigoguardado_elimdeco);
                break;
            case R.id.passwordHint:
                Mostrar_DatosRecogidos();
                break;
        }
    }

    void MostrarCodigos_Guardados(String Codigo_Recibido)
    {
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

    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(DecodificadorActivity.this,HomeActivity.class);
        startActivity(intent);
        DecodificadorActivity.this.finish();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void Rellenar(String x)
    {
        //TODO Limpieza del EditText
        passwordEditText.setText("");

        Log.i(TAG, "Log >> OnClick:Funciona");
        Log.i(TAG, "Log >> Rellenar: " + x);

        if(!x.equals(codigoguardado_rep) && !x.equals(codigoguardado_rep1) && !x.equals("2") && !x.equals("3") && offset!=1)
        {
            Memoria = x;
        }
        if(x.equals(codigoguardado_rep))
        {
            x = Memoria;

            Bandera_InFn_Rep++;
            if(Bandera_InFn_Rep == 1)
            {
                buttonRep.setVisibility(View.GONE);
                Codigorep.setVisibility(View.GONE);
                buttonRep1.setVisibility(View.VISIBLE);
                Codigorep1.setVisibility(View.VISIBLE);
            }
            if(Bandera_InFn_Rep >= 2)
            {
                buttonRep1.setVisibility(View.GONE);
                Codigorep1.setVisibility(View.GONE);
                Bandera_InFn_Rep=0;
            }
        }
        if(x.equals(codigoguardado_rep1))
        {
            x = Memoria;

            if(Bandera_InFn_Rep == 1)
            {
                buttonRep.setVisibility(View.VISIBLE);
                Codigorep.setVisibility(View.VISIBLE);
            }
            Bandera_InFn_Rep++;
        }

        if(Orden_Recibido.equals("Columnas"))
        {
            if(Fila==(gone+1))
            {
                Columna++;
                Fila=0;
            }

            if(x.equals(codigoguardado_salto) && Columna!=16 && Fila!=16)
            {
                if(primeratrama==0)
                {
                    for (Columnaout = 0; Columnaout <= 15; Columnaout++) {
                        for (gone = Fila; gone <= 15; gone++) {
                            ImageView ImageActual = ImageViewUsar(gone, Columnaout);

                            AgregarImagen(gone, Columna, "Transparente", ImageActual);
                            LimGone = Fila;
                        }
                    }
                    Contar_Errores_columnas(Columna,contador_errores);
                    contador_errores=0;
                }
                if(primeratrama>0)
                {
                    for (int gone2 = Fila; gone2 <= LimGone; gone2++)
                    {
                        ImageView ImageActual = ImageViewUsar(gone2, Columna);

                        AgregarImagen(gone2, Columna, codigoguardado_erro, ImageActual);
                    }
                    Contar_Errores_columnas(Columna,contador_errores-1);
                    contador_errores=0;
                }
                primeratrama++;
                Columna++;
                Fila=0;
            }
            if(!x.equals(codigoguardado_salto) && Columna!=16 && Fila!=16)
            {
                if(x.equals(codigoguardado_elimdeco))
                {
                    if(Fila == 0)
                    {
                        Columna--;
                        if(primeratrama>0)
                        {
                            Fila = LimGone;
                        }
                    }
                    Fila--;
                }
                if(x.equals(codigoguardado_elimdeco) && Columna<0)
                {
                    Columna=0;
                    Fila=0;
                }
                ImageView ImageActual = ImageViewUsar(Fila, Columna);

                AgregarImagen(Fila, Columna, x, ImageActual);

                if(!x.equals(codigoguardado_elimdeco))
                {
                    Fila++;
                }
            }
            if(x.equals(codigoguardado_end))
            {
                int limite=15;
                ImageView ImageActual = null;

                if(Fila==LimGone)
                {
                    ImageActual = ImageViewUsar(16, Columna);

                    AgregarImagen(gone, Columna, "Transparente", ImageActual);
                }

                for(int columnagone=Columna;columnagone<=15;columnagone++)
                {
                    if(columnagone==Columna)
                    {
                        limite=15;
                    }
                    else
                    {
                        limite=16;
                    }
                    for (int gone = Fila-1; gone <= limite; gone++)
                    {
                        ImageActual = ImageViewUsar(gone, columnagone);

                        AgregarImagen(gone, Columna, "Transparente", ImageActual);
                    }
                    Fila = 0;
                }
                Contar_Errores_columnas(Columna,contador_errores);
                contador_errores=0;
                Columna=16;
                Fila=16;
                F16C16.setVisibility(View.VISIBLE);
            }
        }
        if(Orden_Recibido.equals("Filas"))
        {
            if(Columna==(gone+1))
            {
                Fila++;
                Columna=0;
            }

            if(x.equals(codigoguardado_salto) && Columna!=16 && Fila!=16)
            {
                if(primeratrama==0)
                {
                    for (Filaout = 0; Filaout <= 15; Filaout++) {
                        for (gone = Columna; gone <= 15; gone++) {
                            ImageView ImageActual = ImageViewUsar(Filaout, gone);

                            AgregarImagen(Fila, gone, "Transparente", ImageActual);
                            LimGone = Columna;
                        }
                    }
                    Contar_Errores_filas(Fila, contador_errores);
                    contador_errores=0;
                }
                if(primeratrama>0)
                {
                    for (int gone2 = Columna; gone2 <= LimGone; gone2++)
                    {
                        ImageView ImageActual = ImageViewUsar(Fila, gone2);

                        AgregarImagen(Fila, gone2, codigoguardado_erro, ImageActual);
                    }
                    Contar_Errores_filas(Fila,contador_errores-1);
                    contador_errores=0;
                }
                primeratrama++;
                Fila++;
                Columna=0;
            }
            if(!x.equals(codigoguardado_salto) && Columna!=16 && Fila!=16)
            {
                if(x.equals(codigoguardado_elimdeco))
                {
                    if(Columna == 0)
                    {
                        Fila--;
                        if(primeratrama>0)
                        {
                            Columna = LimGone;
                        }
                    }
                    Columna--;
                }
                if(x.equals(codigoguardado_elimdeco) && Fila<0)
                {
                    Columna=0;
                    Fila=0;
                }

                ImageView ImageActual = ImageViewUsar(Fila, Columna);

                AgregarImagen(Fila, Columna, x, ImageActual);

                if(!x.equals(codigoguardado_elimdeco))
                {
                    Columna++;
                }
            }
            if(x.equals(codigoguardado_end))
            {
                int limite = 15;
                ImageView ImageActual = null;

                for (int filagone = Fila; filagone <= 15; filagone++)
                {
                    if (filagone == Fila)
                    {
                        limite = 15;
                    } else
                    {
                        limite = 16;
                    }
                    for (int gone = Columna - 1; gone <= limite; gone++)
                    {
                        ImageActual = ImageViewUsar(filagone, gone);

                        AgregarImagen(Fila, gone, "Transparente", ImageActual);
                    }
                    Columna = 0;
                }
                if(Columna==0)
                {
                    ImageActual = ImageViewUsar(Fila, 16);

                    AgregarImagen(Fila, gone, "Transparente", ImageActual);
                }
                Contar_Errores_columnas(Fila,contador_errores);
                contador_errores=0;
                Columna=16;
                Fila=16;
                F16C16.setVisibility(View.VISIBLE);
            }
        }
    }

    public ImageView ImageViewUsar(int Fila, int Columna)
    {
        if(Fila==0 && Columna==0) return F0C0;
        if(Fila==0 && Columna==1) return F0C1;
        if(Fila==0 && Columna==2) return F0C2;
        if(Fila==0 && Columna==3) return F0C3;
        if(Fila==0 && Columna==4) return F0C4;
        if(Fila==0 && Columna==5) return F0C5;
        if(Fila==0 && Columna==6) return F0C6;
        if(Fila==0 && Columna==7) return F0C7;
        if(Fila==0 && Columna==8) return F0C8;
        if(Fila==0 && Columna==9) return F0C9;
        if(Fila==0 && Columna==10) return F0C10;
        if(Fila==0 && Columna==11) return F0C11;
        if(Fila==0 && Columna==12) return F0C12;
        if(Fila==0 && Columna==13) return F0C13;
        if(Fila==0 && Columna==14) return F0C14;
        if(Fila==0 && Columna==15) return F0C15;
        if(Fila==0 && Columna==16) return F0C16;

        if(Fila==1 && Columna==0) return F1C0;
        if(Fila==1 && Columna==1) return F1C1;
        if(Fila==1 && Columna==2) return F1C2;
        if(Fila==1 && Columna==3) return F1C3;
        if(Fila==1 && Columna==4) return F1C4;
        if(Fila==1 && Columna==5) return F1C5;
        if(Fila==1 && Columna==6) return F1C6;
        if(Fila==1 && Columna==7) return F1C7;
        if(Fila==1 && Columna==8) return F1C8;
        if(Fila==1 && Columna==9) return F1C9;
        if(Fila==1 && Columna==10) return F1C10;
        if(Fila==1 && Columna==11) return F1C11;
        if(Fila==1 && Columna==12) return F1C12;
        if(Fila==1 && Columna==13) return F1C13;
        if(Fila==1 && Columna==14) return F1C14;
        if(Fila==1 && Columna==15) return F1C15;
        if(Fila==1 && Columna==16) return F1C16;

        if(Fila==2 && Columna==0) return F2C0;
        if(Fila==2 && Columna==1) return F2C1;
        if(Fila==2 && Columna==2) return F2C2;
        if(Fila==2 && Columna==3) return F2C3;
        if(Fila==2 && Columna==4) return F2C4;
        if(Fila==2 && Columna==5) return F2C5;
        if(Fila==2 && Columna==6) return F2C6;
        if(Fila==2 && Columna==7) return F2C7;
        if(Fila==2 && Columna==8) return F2C8;
        if(Fila==2 && Columna==9) return F2C9;
        if(Fila==2 && Columna==10) return F2C10;
        if(Fila==2 && Columna==11) return F2C11;
        if(Fila==2 && Columna==12) return F2C12;
        if(Fila==2 && Columna==13) return F2C13;
        if(Fila==2 && Columna==14) return F2C14;
        if(Fila==2 && Columna==15) return F2C15;
        if(Fila==2 && Columna==16) return F2C16;

        if(Fila==3 && Columna==0) return F3C0;
        if(Fila==3 && Columna==1) return F3C1;
        if(Fila==3 && Columna==2) return F3C2;
        if(Fila==3 && Columna==3) return F3C3;
        if(Fila==3 && Columna==4) return F3C4;
        if(Fila==3 && Columna==5) return F3C5;
        if(Fila==3 && Columna==6) return F3C6;
        if(Fila==3 && Columna==7) return F3C7;
        if(Fila==3 && Columna==8) return F3C8;
        if(Fila==3 && Columna==9) return F3C9;
        if(Fila==3 && Columna==10) return F3C10;
        if(Fila==3 && Columna==11) return F3C11;
        if(Fila==3 && Columna==12) return F3C12;
        if(Fila==3 && Columna==13) return F3C13;
        if(Fila==3 && Columna==14) return F3C14;
        if(Fila==3 && Columna==15) return F3C15;
        if(Fila==3 && Columna==16) return F3C16;

        if(Fila==4 && Columna==0) return F4C0;
        if(Fila==4 && Columna==1) return F4C1;
        if(Fila==4 && Columna==2) return F4C2;
        if(Fila==4 && Columna==3) return F4C3;
        if(Fila==4 && Columna==4) return F4C4;
        if(Fila==4 && Columna==5) return F4C5;
        if(Fila==4 && Columna==6) return F4C6;
        if(Fila==4 && Columna==7) return F4C7;
        if(Fila==4 && Columna==8) return F4C8;
        if(Fila==4 && Columna==9) return F4C9;
        if(Fila==4 && Columna==10) return F4C10;
        if(Fila==4 && Columna==11) return F4C11;
        if(Fila==4 && Columna==12) return F4C12;
        if(Fila==4 && Columna==13) return F4C13;
        if(Fila==4 && Columna==14) return F4C14;
        if(Fila==4 && Columna==15) return F4C15;
        if(Fila==4 && Columna==16) return F4C16;

        if(Fila==5 && Columna==0) return F5C0;
        if(Fila==5 && Columna==1) return F5C1;
        if(Fila==5 && Columna==2) return F5C2;
        if(Fila==5 && Columna==3) return F5C3;
        if(Fila==5 && Columna==4) return F5C4;
        if(Fila==5 && Columna==5) return F5C5;
        if(Fila==5 && Columna==6) return F5C6;
        if(Fila==5 && Columna==7) return F5C7;
        if(Fila==5 && Columna==8) return F5C8;
        if(Fila==5 && Columna==9) return F5C9;
        if(Fila==5 && Columna==10) return F5C10;
        if(Fila==5 && Columna==11) return F5C11;
        if(Fila==5 && Columna==12) return F5C12;
        if(Fila==5 && Columna==13) return F5C13;
        if(Fila==5 && Columna==14) return F5C14;
        if(Fila==5 && Columna==15) return F5C15;
        if(Fila==5 && Columna==16) return F5C16;

        if(Fila==6 && Columna==0) return F6C0;
        if(Fila==6 && Columna==1) return F6C1;
        if(Fila==6 && Columna==2) return F6C2;
        if(Fila==6 && Columna==3) return F6C3;
        if(Fila==6 && Columna==4) return F6C4;
        if(Fila==6 && Columna==5) return F6C5;
        if(Fila==6 && Columna==6) return F6C6;
        if(Fila==6 && Columna==7) return F6C7;
        if(Fila==6 && Columna==8) return F6C8;
        if(Fila==6 && Columna==9) return F6C9;
        if(Fila==6 && Columna==10) return F6C10;
        if(Fila==6 && Columna==11) return F6C11;
        if(Fila==6 && Columna==12) return F6C12;
        if(Fila==6 && Columna==13) return F6C13;
        if(Fila==6 && Columna==14) return F6C14;
        if(Fila==6 && Columna==15) return F6C15;
        if(Fila==6 && Columna==16) return F6C16;

        if(Fila==7 && Columna==0) return F7C0;
        if(Fila==7 && Columna==1) return F7C1;
        if(Fila==7 && Columna==2) return F7C2;
        if(Fila==7 && Columna==3) return F7C3;
        if(Fila==7 && Columna==4) return F7C4;
        if(Fila==7 && Columna==5) return F7C5;
        if(Fila==7 && Columna==6) return F7C6;
        if(Fila==7 && Columna==7) return F7C7;
        if(Fila==7 && Columna==8) return F7C8;
        if(Fila==7 && Columna==9) return F7C9;
        if(Fila==7 && Columna==10) return F7C10;
        if(Fila==7 && Columna==11) return F7C11;
        if(Fila==7 && Columna==12) return F7C12;
        if(Fila==7 && Columna==13) return F7C13;
        if(Fila==7 && Columna==14) return F7C14;
        if(Fila==7 && Columna==15) return F7C15;
        if(Fila==7 && Columna==16) return F7C16;

        if(Fila==8 && Columna==0) return F8C0;
        if(Fila==8 && Columna==1) return F8C1;
        if(Fila==8 && Columna==2) return F8C2;
        if(Fila==8 && Columna==3) return F8C3;
        if(Fila==8 && Columna==4) return F8C4;
        if(Fila==8 && Columna==5) return F8C5;
        if(Fila==8 && Columna==6) return F8C6;
        if(Fila==8 && Columna==7) return F8C7;
        if(Fila==8 && Columna==8) return F8C8;
        if(Fila==8 && Columna==9) return F8C9;
        if(Fila==8 && Columna==10) return F8C10;
        if(Fila==8 && Columna==11) return F8C11;
        if(Fila==8 && Columna==12) return F8C12;
        if(Fila==8 && Columna==13) return F8C13;
        if(Fila==8 && Columna==14) return F8C14;
        if(Fila==8 && Columna==15) return F8C15;
        if(Fila==8 && Columna==16) return F8C16;

        if(Fila==9 && Columna==0) return F9C0;
        if(Fila==9 && Columna==1) return F9C1;
        if(Fila==9 && Columna==2) return F9C2;
        if(Fila==9 && Columna==3) return F9C3;
        if(Fila==9 && Columna==4) return F9C4;
        if(Fila==9 && Columna==5) return F9C5;
        if(Fila==9 && Columna==6) return F9C6;
        if(Fila==9 && Columna==7) return F9C7;
        if(Fila==9 && Columna==8) return F9C8;
        if(Fila==9 && Columna==9) return F9C9;
        if(Fila==9 && Columna==10) return F9C10;
        if(Fila==9 && Columna==11) return F9C11;
        if(Fila==9 && Columna==12) return F9C12;
        if(Fila==9 && Columna==13) return F9C13;
        if(Fila==9 && Columna==14) return F9C14;
        if(Fila==9 && Columna==15) return F9C15;
        if(Fila==9 && Columna==16) return F9C16;

        if(Fila==10 && Columna==0) return F10C0;
        if(Fila==10 && Columna==1) return F10C1;
        if(Fila==10 && Columna==2) return F10C2;
        if(Fila==10 && Columna==3) return F10C3;
        if(Fila==10 && Columna==4) return F10C4;
        if(Fila==10 && Columna==5) return F10C5;
        if(Fila==10 && Columna==6) return F10C6;
        if(Fila==10 && Columna==7) return F10C7;
        if(Fila==10 && Columna==8) return F10C8;
        if(Fila==10 && Columna==9) return F10C9;
        if(Fila==10 && Columna==10) return F10C10;
        if(Fila==10 && Columna==11) return F10C11;
        if(Fila==10 && Columna==12) return F10C12;
        if(Fila==10 && Columna==13) return F10C13;
        if(Fila==10 && Columna==14) return F10C14;
        if(Fila==10 && Columna==15) return F10C15;
        if(Fila==10 && Columna==16) return F10C16;

        if(Fila==11 && Columna==0) return F11C0;
        if(Fila==11 && Columna==1) return F11C1;
        if(Fila==11 && Columna==2) return F11C2;
        if(Fila==11 && Columna==3) return F11C3;
        if(Fila==11 && Columna==4) return F11C4;
        if(Fila==11 && Columna==5) return F11C5;
        if(Fila==11 && Columna==6) return F11C6;
        if(Fila==11 && Columna==7) return F11C7;
        if(Fila==11 && Columna==8) return F11C8;
        if(Fila==11 && Columna==9) return F11C9;
        if(Fila==11 && Columna==10) return F11C10;
        if(Fila==11 && Columna==11) return F11C11;
        if(Fila==11 && Columna==12) return F11C12;
        if(Fila==11 && Columna==13) return F11C13;
        if(Fila==11 && Columna==14) return F11C14;
        if(Fila==11 && Columna==15) return F11C15;
        if(Fila==11 && Columna==16) return F11C16;

        if(Fila==12 && Columna==0) return F12C0;
        if(Fila==12 && Columna==1) return F12C1;
        if(Fila==12 && Columna==2) return F12C2;
        if(Fila==12 && Columna==3) return F12C3;
        if(Fila==12 && Columna==4) return F12C4;
        if(Fila==12 && Columna==5) return F12C5;
        if(Fila==12 && Columna==6) return F12C6;
        if(Fila==12 && Columna==7) return F12C7;
        if(Fila==12 && Columna==8) return F12C8;
        if(Fila==12 && Columna==9) return F12C9;
        if(Fila==12 && Columna==10) return F12C10;
        if(Fila==12 && Columna==11) return F12C11;
        if(Fila==12 && Columna==12) return F12C12;
        if(Fila==12 && Columna==13) return F12C13;
        if(Fila==12 && Columna==14) return F12C14;
        if(Fila==12 && Columna==15) return F12C15;
        if(Fila==12 && Columna==16) return F12C16;

        if(Fila==13 && Columna==0) return F13C0;
        if(Fila==13 && Columna==1) return F13C1;
        if(Fila==13 && Columna==2) return F13C2;
        if(Fila==13 && Columna==3) return F13C3;
        if(Fila==13 && Columna==4) return F13C4;
        if(Fila==13 && Columna==5) return F13C5;
        if(Fila==13 && Columna==6) return F13C6;
        if(Fila==13 && Columna==7) return F13C7;
        if(Fila==13 && Columna==8) return F13C8;
        if(Fila==13 && Columna==9) return F13C9;
        if(Fila==13 && Columna==10) return F13C10;
        if(Fila==13 && Columna==11) return F13C11;
        if(Fila==13 && Columna==12) return F13C12;
        if(Fila==13 && Columna==13) return F13C13;
        if(Fila==13 && Columna==14) return F13C14;
        if(Fila==13 && Columna==15) return F13C15;
        if(Fila==13 && Columna==16) return F13C16;

        if(Fila==14 && Columna==0) return F14C0;
        if(Fila==14 && Columna==1) return F14C1;
        if(Fila==14 && Columna==2) return F14C2;
        if(Fila==14 && Columna==3) return F14C3;
        if(Fila==14 && Columna==4) return F14C4;
        if(Fila==14 && Columna==5) return F14C5;
        if(Fila==14 && Columna==6) return F14C6;
        if(Fila==14 && Columna==7) return F14C7;
        if(Fila==14 && Columna==8) return F14C8;
        if(Fila==14 && Columna==9) return F14C9;
        if(Fila==14 && Columna==10) return F14C10;
        if(Fila==14 && Columna==11) return F14C11;
        if(Fila==14 && Columna==12) return F14C12;
        if(Fila==14 && Columna==13) return F14C13;
        if(Fila==14 && Columna==14) return F14C14;
        if(Fila==14 && Columna==15) return F14C15;
        if(Fila==14 && Columna==16) return F14C16;

        if(Fila==15 && Columna==0) return F15C0;
        if(Fila==15 && Columna==1) return F15C1;
        if(Fila==15 && Columna==2) return F15C2;
        if(Fila==15 && Columna==3) return F15C3;
        if(Fila==15 && Columna==4) return F15C4;
        if(Fila==15 && Columna==5) return F15C5;
        if(Fila==15 && Columna==6) return F15C6;
        if(Fila==15 && Columna==7) return F15C7;
        if(Fila==15 && Columna==8) return F15C8;
        if(Fila==15 && Columna==9) return F15C9;
        if(Fila==15 && Columna==10) return F15C10;
        if(Fila==15 && Columna==11) return F15C11;
        if(Fila==15 && Columna==12) return F15C12;
        if(Fila==15 && Columna==13) return F15C13;
        if(Fila==15 && Columna==14) return F15C14;
        if(Fila==15 && Columna==15) return F15C15;
        if(Fila==15 && Columna==16) return F15C16;

        if(Fila==16 && Columna==0) return F16C0;
        if(Fila==16 && Columna==1) return F16C1;
        if(Fila==16 && Columna==2) return F16C2;
        if(Fila==16 && Columna==3) return F16C3;
        if(Fila==16 && Columna==4) return F16C4;
        if(Fila==16 && Columna==5) return F16C5;
        if(Fila==16 && Columna==6) return F16C6;
        if(Fila==16 && Columna==7) return F16C7;
        if(Fila==16 && Columna==8) return F16C8;
        if(Fila==16 && Columna==9) return F16C9;
        if(Fila==16 && Columna==10) return F16C10;
        if(Fila==16 && Columna==11) return F16C11;
        if(Fila==16 && Columna==12) return F16C12;
        if(Fila==16 && Columna==13) return F16C13;
        if(Fila==16 && Columna==14) return F16C14;
        if(Fila==16 && Columna==15) return F16C15;
        if(Fila==16 && Columna==16) return F16C16;

        return F16C16;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void AgregarImagen(int Fila, int Columna,String Bits,ImageView Imagen)
    {
        Log.i(TAG, "Log >> AgregandoImagen: Fila " + Fila + "  Columna " + Columna + "  Dato " + Bits);

        if (Bits.equals(codigoguardado_a))
        {
            Imagen.setBackground(getDrawable(R.drawable.a));
        }
        if (Bits.equals(codigoguardado_b))
        {
            Imagen.setBackground(getDrawable(R.drawable.b));
        }
        if (Bits.equals(codigoguardado_c))
        {
            Imagen.setBackground(getDrawable(R.drawable.c));
        }
        if (Bits.equals(codigoguardado_d))
        {
            Imagen.setBackground(getDrawable(R.drawable.d));
        }
        if (Bits.equals(codigoguardado_e))
        {
            Imagen.setBackground(getDrawable(R.drawable.e));
        }
        if (Bits.equals(codigoguardado_f))
        {
            Imagen.setBackground(getDrawable(R.drawable.f));
        }
        if (Bits.equals(codigoguardado_g))
        {
            Imagen.setBackground(getDrawable(R.drawable.g));
        }
        if (Bits.equals(codigoguardado_h))
        {
            Imagen.setBackground(getDrawable(R.drawable.h));
        }
        if (Bits.equals(codigoguardado_erro))
        {
            Imagen.setBackground(getDrawable(R.drawable.cancelando));
            contador_errores = contador_errores+1;
        }
        if (Bits.equals("Transparente"))
        {
            Imagen.setVisibility(View.GONE);
        }
        if (Bits.equals("Fox"))
        {
            Imagen.setBackground(getDrawable(R.drawable.fox));
        }
        if (Bits.equals("0Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q0));
        }
        if (Bits.equals("1Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q1));
        }
        if (Bits.equals("2Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q2));
        }
        if (Bits.equals("3Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q3));
        }
        if (Bits.equals("4Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q4));
        }
        if (Bits.equals("5Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q5));
        }
        if (Bits.equals("6Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q6));
        }
        if (Bits.equals("7Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q7));
        }
        if (Bits.equals("8Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q8));
        }
        if (Bits.equals("9Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q9));
        }
        if (Bits.equals("10Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q10));
        }
        if (Bits.equals("11Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q11));
        }
        if (Bits.equals("12Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q12));
        }
        if (Bits.equals("13Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q13));
        }
        if (Bits.equals("14Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q14));
        }
        if (Bits.equals("15Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q15));
        }
        if (Bits.equals("16Error"))
        {
            Imagen.setBackground(getDrawable(R.drawable.q16));
        }
    }

    private final TextWatcher passwordWatcher = new TextWatcher()
    {
        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        {

        }

        public void onTextChanged(CharSequence s, int start, int before, int count)
        {

        }

        public void afterTextChanged(Editable s)
        {
            if(s.length() != 0)
            {
                EscrituradeBits(passwordEditText.getText().toString());
            }
        }
    };

    public void EscrituradeBits(String Texto)
    {
        Log.i(TAG, "Log >> Datos llegando: " + passwordEditText.getText());

        if(Texto.length()==3 || offset==1)
        {
            captura = Texto.substring(0, offset); //(0,3)

            Log.i(TAG, "Log >> Datos Obtenidos: " + captura);
            Log.i(TAG, "Log >> BanderaRep: " + BanderaRep);

            //TODO Verificaciones para el 000 1 1 1 1 ... 1 1 1 000
            if(captura.equals(codigoguardado_rep) && BanderaRep==0 && revision_000!=1)
            {
                Log.i(TAG, "Log >> SE INGRESO PRIMERA VEZ 000 - HABILITO EL PLUS+1");
                BanderaRep++;
                offset=1;
            }
            revision_000 = 0;

            if(captura.equals("0") && offset==1 && BanderaRep>=1)
            {
                Log.i(TAG, "Log >> SE INGRESO AL MENOS UN PLUS+1 - HABILITO 000");
                revision_000 = 1;
                BanderaRep=0;
                offset=3;
            }//TODO FIN Verificaciones para el 000 1 1 1 ... 1 1 1 000
            else
            {
                Datos_Recogidos = Datos_Recogidos + " " + captura;

                if(DatoIngresadoFull(captura, codigoguardado_a) ||
                        DatoIngresadoFull(captura, codigoguardado_b) ||
                        DatoIngresadoFull(captura, codigoguardado_c) ||
                        DatoIngresadoFull(captura, codigoguardado_d) ||
                        DatoIngresadoFull(captura, codigoguardado_a) ||
                        DatoIngresadoFull(captura, codigoguardado_f) ||
                        DatoIngresadoFull(captura, codigoguardado_g) ||
                        DatoIngresadoFull(captura, codigoguardado_h) ||
                        DatoIngresadoFull(captura, codigoguardado_salto) ||
                        DatoIngresadoFull(captura, codigoguardado_end) ||
                        DatoIngresadoFull(captura, codigoguardado_rep1) ||
                        DatoIngresadoFull(captura, "Fox") ||
                        DatoIngresadoFull(captura, codigoguardado_rep))
                {
                    Log.i(TAG, "Log >> GenerarDato: Todo está bien");
                }
                else {
                    Log.i(TAG, "Log >> GenerarDato: Hubo Error!");
                    Rellenar("212");
                    Vibrator vibracion = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vibracion.vibrate(300);
                    sonido_error = MediaPlayer.create(this, R.raw.error);
                    sonido_error.start();
                }

                Log.i(TAG, "Log >> Offset Vigente: " + offset);
            }
        }
    }

    public boolean DatoIngresadoFull(String xCaptura,String x)
    {
        if (xCaptura.equals(x))
        {
            Rellenar(x);
            return true;
        }
        return false;
    }

    void Mostrar_DatosRecogidos()
    {
        if(mostrar_data)
        {
            textView.setText(Datos_Recogidos);
            mostrar_data = false;
        }
        else
        {
            textView.setText(R.string.Decodificacion);
            mostrar_data = true;
        }
    }

    void Contar_Errores_filas(int Fila, int Errores)
    {
        ImageView ImageActual;
        String Numero_Error;

        Numero_Error = Errores + "Error";
        Log.i(TAG, "Log >> Numero_Error: " + Numero_Error);

        ImageActual = ImageViewUsar(Fila, 16);

        AgregarImagen(Fila, gone, Numero_Error, ImageActual);
    }

    void Contar_Errores_columnas(int Columna, int Errores)
    {
        ImageView ImageActual;
        String Numero_Error;

        Numero_Error = Errores + "Error";
        Log.i(TAG, "Log >> Numero_Error: " + Numero_Error);

        ImageActual = ImageViewUsar(16, Columna);

        AgregarImagen(Fila, gone, Numero_Error, ImageActual);
    }
}

//meter x si end y trama incompleta
//alcanzo trama no pueda escribir mas
//dio salto y end que se elimine una x que estorba ahi y x queden bien
//cuando se meten 16 se jode tudo eso para dar salto de linea y para borrar
//lenar 212 cuando haya error?
//contar los errores despues del end y en ventana que muestra, relacionado con el //2