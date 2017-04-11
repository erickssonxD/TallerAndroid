package com.example.ericksson.tallerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editTextNombreUsuario)
    EditText editTextNombreUsuario;

    @OnClick(R.id.button_listo)
    public void buttonListo(){
        String nombreUsuario = String.valueOf(editTextNombreUsuario.getText());
        Intent intent = new Intent(MainActivity.this, SaludarActivity.class);
        intent.putExtra(Constants.NOMBRE_USUARIO_TAG ,nombreUsuario);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
