// Autor: Brayan RIncones - 1673847-3743
//        Julian Castaño - 1625743-3743


package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
    public EditText text;
    public double op1, op2, res;
    int oper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText)findViewById(R.id.area);

        b0= (Button) findViewById(R.id.bt0);
        b1= (Button) findViewById(R.id.bt1);
        b2= (Button) findViewById(R.id.bt2);
        b3= (Button) findViewById(R.id.bt3);
        b4= (Button) findViewById(R.id.bt4);
        b5= (Button) findViewById(R.id.bt5);
        b6= (Button) findViewById(R.id.bt6);
        b7= (Button) findViewById(R.id.bt7);
        b8= (Button) findViewById(R.id.bt8);
        b9= (Button) findViewById(R.id.bt9);
        b10= (Button) findViewById(R.id.btc);
        b11= (Button) findViewById(R.id.btatras);
        b12= (Button) findViewById(R.id.btpun);
        b13= (Button) findViewById(R.id.btsum);
        b14= (Button) findViewById(R.id.btres);
        b15= (Button) findViewById(R.id.btmul);
        b16= (Button) findViewById(R.id.btdivi);
        b17= (Button) findViewById(R.id.btpot);
        b18= (Button) findViewById(R.id.btraiz);
        b19= (Button) findViewById(R.id.bteq);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt0(v);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1(v);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt2(v);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt3(v);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt4(v);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt5(v);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt6(v);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt7(v);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt8(v);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt9(v);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiar(v);
            }
        });

        //b1.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        bt1(v);
        //    }
        //});

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btpun(v);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suma(v);
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resta(v);
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multi(v);
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divi(v);
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potencia(v);
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raiz(v);
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                igual(v);
            }
        });
    }

    public void bt1 (View v){
        String lec=text.getText().toString();
        lec += "1";
        text.setText(lec);
    }

    public void bt2 (View v){
        String lec=text.getText().toString();
        lec += "2";
        text.setText(lec);
    }

    public void bt3 (View v){
        String lec=text.getText().toString();
        lec += "3";
        text.setText(lec);
    }

    public void bt4 (View v){
        String lec=text.getText().toString();
        lec += "4";
        text.setText(lec);
    }

    public void bt5 (View v){
        String lec=text.getText().toString();
        lec += "5";
        text.setText(lec);
    }

    public void bt6 (View v){
        String lec=text.getText().toString();
        lec += "6";
        text.setText(lec);
    }

    public void bt7 (View v){
        String lec=text.getText().toString();
        lec += "7";
        text.setText(lec);
    }

    public void bt8 (View v){
        String lec=text.getText().toString();
        lec += "8";
        text.setText(lec);
    }

    public void bt9 (View v){
        String lec=text.getText().toString();
        lec += "9";
        text.setText(lec);
    }

    public void bt0 (View v){
        String lec=text.getText().toString();
        lec += "0";
        text.setText(lec);
    }

    public void btpun (View v){
        String lec=text.getText().toString();
        lec += ".";
        text.setText(lec);
    }

    public void limpiar(View v){
        text.setText("");
        op1=0.0;
        op2=0.0;
        res=0.0;
    }

    public void salir(View v){
        finish();
    }

    public void suma (View v){
        try {
            String aux1=text.getText().toString();
            op1=Double.parseDouble(aux1);
        }catch (NumberFormatException err){}
        text.setText("");
        oper=1;
    }

    public void resta (View v){
        try {
            String aux1=text.getText().toString();
            op1=Double.parseDouble(aux1);
        }catch (NumberFormatException err){}
        text.setText("");
        oper=2;
    }

    public void multi (View v){
        try {
            String aux1=text.getText().toString();
            op1=Double.parseDouble(aux1);
        }catch (NumberFormatException err){}
        text.setText("");
        oper=3;
    }

    public void divi (View v){
        try {
            String aux1=text.getText().toString();
            op1=Double.parseDouble(aux1);
        }catch (NumberFormatException err){}
        text.setText("");
        oper=4;
    }

    public void potencia (View v){
        try {
            String aux1=text.getText().toString();
            op1=Double.parseDouble(aux1);
        }catch (NumberFormatException err){}
        text.setText("");
        oper=5;
    }

    public void raiz (View v){
        try {
            String aux1=text.getText().toString();
            op1=Double.parseDouble(aux1);
        }catch (NumberFormatException err){}
        text.setText("");
        oper=6;
    }

    public void igual (View v) {
        try {
            String aux2 = text.getText().toString();
            op2 = Double.parseDouble(aux2);
        } catch (NumberFormatException err) {}
        text.setText("");

        if (oper == 1) {
            res = op1 + op2;

        } else if (oper == 2) {
            res = op1 - op2;

        } else if (oper == 3) {
            res = op1 * op2;

        } else if (oper == 4) {
            if (op2 == 0) {
                text.setText("Error");
            } else {
                res = op1 / op2;
            }

        } else if (oper == 5) {
            res = Math.pow(op1, op2);

        } else if (oper == 6) {
            res = Math.sqrt(op1);
        }

        text.setText(""+res);
        op1=res;
    }
}
