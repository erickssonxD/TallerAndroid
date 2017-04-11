package com.example.ericksson.tallerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SaludarActivity extends AppCompatActivity {

    @BindView(R.id.saludo_nombre_usuario) TextView saludoNombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludar);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        String nombreUsuario = intent.getExtras().getString(Constants.NOMBRE_USUARIO_TAG);
        saludoNombreUsuario.setText(String.format(Locale.getDefault(), "Hola: %s", nombreUsuario));
    }


}
