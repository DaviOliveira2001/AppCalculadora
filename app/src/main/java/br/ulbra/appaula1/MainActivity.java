package br.ulbra.appaula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2, edtRes;
    Button btnSomar, btnSub, btnMult, btnDiv;
    TextView txtResultado;
    double v1, v2, soma, sub, multi, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.edt1);
        edt2 = (EditText)findViewById(R.id.edt2);
        btnSomar = (Button)findViewById(R.id.btnSomar);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMult = (Button)findViewById(R.id.btnMult);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        txtResultado = (TextView)findViewById(R.id.txtResultado);
        edtRes = (EditText)findViewById(R.id.txtResult) ;

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edt1.getText().toString());
                v2 = Double.parseDouble(edt2.getText().toString());
                soma = v1 + v2;
                edtRes.setText("Resultado: "+soma);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edt1.getText().toString());
                v2 = Double.parseDouble(edt2.getText().toString());
                sub = v1 - v2;
                edtRes.setText("Resultado: "+sub);
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edt1.getText().toString());
                v2 = Double.parseDouble(edt2.getText().toString());
                multi = v1 * v2;
                edtRes.setText("Resultado: "+multi);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edt1.getText().toString());
                v2 = Double.parseDouble(edt2.getText().toString());
                div = v1 / v2;
                edtRes.setText("Resultado: "+div);
            }
        });
    }
}