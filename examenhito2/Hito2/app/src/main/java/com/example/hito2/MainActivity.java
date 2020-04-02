package com.example.hito2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt1, edt2,edt3, edt4,edt5, edt6, edt7,edt8,edt9,edt10;
    private Button btset, btus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }
    public void initializeVariables() {
        edt1 = findViewById(R.id.confircocha);
        edt2 = findViewById(R.id.sospecocha);
        edt3 = findViewById(R.id.sospesanta);
        edt4 = findViewById(R.id.confirsanta);
        edt5 = findViewById(R.id.confiroru);
        edt6 = findViewById(R.id.sospeoru);

        //parte2
        edt7 = findViewById(R.id.setconfi);
        edt8 = findViewById(R.id.setsosp);
        edt9 = findViewById(R.id.setdepa);
        btset = findViewById(R.id.setv);
        btset.setOnClickListener(this);
        //parte3
        btus = findViewById(R.id.uscar);
        btus.setOnClickListener(this);
        edt10 = findViewById(R.id.ingrese);

    }
        @Override
    public void onClick(View v) {

            switch (v.getId())
            {


                case R.id.setv:
                    if(edt9.equals(""))
                    {
                        Toast.makeText(this.getApplication(),"Intente de nuevo", Toast.LENGTH_LONG).show();

                    }
                    else if(edt7.equals(""))
                    {
                        Toast.makeText(this.getApplication(),"Intente de nuevo", Toast.LENGTH_LONG).show();

                    }
                    else if(edt8.equals(""))
                    {
                        Toast.makeText(this.getApplication(),"Intente de nuevo", Toast.LENGTH_LONG).show();

                    }
                    else {
                        if (edt9.getText().toString().equals("ORURO") || edt9.getText().toString().equals("oruro")) {

                            edt5.setText(edt7.getText());
                            edt6.setText(edt8.getText());


                        }

                        else if (edt9.getText().toString().equals("SANTA CRUZ") || edt9.getText().toString().equals("santa cruz")) {

                            edt3.setText(edt8.getText());
                            edt4.setText(edt7.getText());



                        }
                       else if (edt9.getText().toString().equals("COCHABAMBA") || edt9.getText().toString().equals("cochabamba")) {

                            edt1.setText(edt7.getText());
                            edt2.setText(edt8.getText());


                        }
                       else{

                            Toast.makeText(this.getApplication(),"Intente de nuevo", Toast.LENGTH_LONG).show();
                        }

                    }
                    break;
                case R.id.uscar:
                    int n1,n2,n3 , n4,n5,n6;
                    n1 = Integer.parseInt(edt1.getText().toString());
                    n2 = Integer.parseInt(edt3.getText().toString());
                    n3 = Integer.parseInt(edt5.getText().toString());
                    n4 = Integer.parseInt(edt2.getText().toString());
                    n5 = Integer.parseInt(edt4.getText().toString());
                    n6 = Integer.parseInt(edt6.getText().toString());

                    if(edt10.getText().equals("confirmados") ||edt10.getText().equals("CONFIRMADOS") )
                    {
                        if (n1 > n2) {
                            if (n1 > n3) {

                                Toast.makeText(this.getApplication(),"El mayor es: " +n1, Toast.LENGTH_LONG).show();

                            } else {

                                Toast.makeText(this.getApplication(),"El mayor es: " +n3, Toast.LENGTH_LONG).show();

                            }
                        } else if (n2 > n3) {

                            Toast.makeText(this.getApplication(),"El mayor es: " +n2, Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(this.getApplication(),"El mayor es: " +n3, Toast.LENGTH_LONG).show();
                        }
                    }
                   else if(edt10.getText().equals("sospechosos") ||edt10.getText().equals("SOSPECHOSOS") )
                    {
                        if (n4 > n5) {
                            if (n4 > n6) {

                                Toast.makeText(this.getApplication(),"El mayor es: " +n4, Toast.LENGTH_LONG).show();

                            } else {

                                Toast.makeText(this.getApplication(),"El mayor es: " +n6, Toast.LENGTH_LONG).show();

                            }
                        } else if (n5 > n6) {

                            Toast.makeText(this.getApplication(),"El mayor es: " +n5, Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(this.getApplication(),"El mayor es: " +n6, Toast.LENGTH_LONG).show();
                        }
                    }


            }


    }
}
