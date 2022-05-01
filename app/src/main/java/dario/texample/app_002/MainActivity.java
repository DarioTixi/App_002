package dario.texample.app_002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText edt1;
private EditText edt2;
private EditText edt3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1= findViewById(R.id.edt1_numero1);
        edt2= findViewById(R.id.edt2_numero2);
        edt3= findViewById(R.id.edt_resultado);

    }
         public void Potencia(View view){
        String b= edt1.getText().toString();
             String e= edt2.getText().toString();
       int base= Integer.parseInt(b);
       int exponente=Integer.parseInt( e);
        int resultado=1;
        for (int i=1;i<=exponente;i++){
            resultado *= base;
        }
        edt3.setText(String.valueOf(resultado));
         }
}