package br.com.etecia.terceiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MediaValores extends AppCompatActivity {

    private EditText id_numero1,id_numero2,id_numero3;
    private Button btnLimpar, btnCalculaMedia;
    private TextView id_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_valores_layout);

        id_numero1 = (EditText)findViewById(R.id.id_numero1);
        id_numero2 = (EditText)findViewById(R.id.id_numero2);
        id_numero3 = (EditText)findViewById(R.id.id_numero3);

        id_resultado= (TextView) findViewById(R.id.id_resultado);

        btnLimpar = (Button)findViewById(R.id.btnLimpar);
        btnCalculaMedia = (Button)findViewById(R.id.btnCalculaMedia);

    }
}
