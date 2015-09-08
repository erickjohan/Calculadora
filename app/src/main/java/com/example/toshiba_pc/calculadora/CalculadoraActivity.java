package com.example.toshiba_pc.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CalculadoraActivity extends ActionBarActivity{

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnmas,btnmenos,btnmul,btndiv,btnigual;
    private EditText edtValor;

    double result=0,result1=0;
    boolean flag=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        edtValor=(EditText)findViewById(R.id.EdtValor);

        btnigual = (Button) findViewById(R.id.BtnIgu);
        btnmas = (Button) findViewById(R.id.BtnMas);
        btnmenos = (Button) findViewById(R.id.BtnRes);
        btnmul = (Button) findViewById(R.id.BtnMul);
        btndiv = (Button) findViewById(R.id.BtnDiv);
        btn0=(Button)findViewById(R.id.Btn0);
        btn1=(Button)findViewById(R.id.Btn1);
        btn2=(Button)findViewById(R.id.Btn2);
        btn3=(Button)findViewById(R.id.Btn3);
        btn4=(Button)findViewById(R.id.Btn4);
        btn5=(Button)findViewById(R.id.Btn5);
        btn6=(Button)findViewById(R.id.Btn6);
        btn7=(Button)findViewById(R.id.Btn7);
        btn8=(Button)findViewById(R.id.Btn8);
        btn9=(Button)findViewById(R.id.Btn9);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn0.getText().toString());
                edtValor.setText(edtValor.getText().toString() + btn0.getText().toString());
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn1.getText().toString());
                edtValor.setText(edtValor.getText().toString() + btn1.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn2.getText().toString());
                edtValor.setText(edtValor.getText().toString() + btn2.getText().toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn3.getText().toString());
                edtValor.setText(edtValor.getText().toString() + btn3.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn4.getText().toString());
                edtValor.setText(edtValor.getText().toString() + btn4.getText().toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn5.getText().toString());
                edtValor.setText(edtValor.getText().toString() + btn5.getText().toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn6.getText().toString());
                edtValor.setText(edtValor.getText().toString() + btn6.getText().toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn7.getText().toString());
                edtValor.setText(edtValor.getText().toString() + btn7.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn8.getText().toString());
                edtValor.setText(edtValor.getText().toString() + btn8.getText().toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = Integer.parseInt(btn9.getText().toString());
                edtValor.setText(edtValor.getText().toString() + btn9.getText().toString());
            }
        });
        btnmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result+result1;
                edtValor.setText(edtValor.getText().toString()+btnmas.getText().toString());
            }
        });
        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result - result1;
                edtValor.setText(edtValor.getText().toString() + btnmenos.getText().toString());
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result * result1;
                edtValor.setText(edtValor.getText().toString() + btnmul.getText().toString());
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = result / result1;
                edtValor.setText(edtValor.getText().toString() + btndiv.getText().toString());
            }
        });
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=result+result1;
                edtValor.setText(result+"");
                result1=0;
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
