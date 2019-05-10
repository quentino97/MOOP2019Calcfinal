package com.example.quentino.calculatormoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etAngka1,etAngka2;
    String calculate;
    TextView tvResult;
    int angka1,angka2;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Kalkulator");

        etAngka1 = (EditText) findViewById(R.id.etAngka1);
        etAngka2 = (EditText) findViewById(R.id.etAngka2);
        tvResult = (TextView) findViewById(R.id.tvResult);

//        String input1 = etAngka1.getText().toString();
//        angka1 = Str.parseInt(input1);
//
//        String input2 = etAngka1.getText().toString();
//        angka2 = Integer.parseInt(input2);

    }

    public void getNum(){

        try{
            if(etAngka1.getText().toString().isEmpty()){
                angka1 = 0;
            }
            else{
                String input1 = etAngka1.getText().toString();
                angka1 = Integer.parseInt(input1);
            }
            if(etAngka2.getText().toString().isEmpty()){
                angka1 = 0;
            }
            else{
                String input2 = etAngka2.getText().toString();
                angka2 = Integer.parseInt(input2);
            }
        }catch( Exception e){
            Log.d("exeption", e.toString());
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }

//        switch(calculate){
//            case "add" :
//                int Result = angka1 + angka2;
//                tvResult.setText("Hasil : " + Result);
//                break;
//            case "subtract" :
//                Result = angka1 - angka2;
//                tvResult.setText("Hasil : " +Result);
//                break;
//            case "multiply" :
//                Result = angka1 * angka2;
//                tvResult.setText("Hasil : " +Result);
//                break;
//            case "divide" :
//                if(angka2 == 0){
//                    Toast.makeText(this, "Cant divide by zero", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    result = (float) angka1 / angka2;
//                    String fResult = Float.toString(result);
//                    tvResult.setText("Hasil : " +fResult);
//                }
//                break;
//        }
    }

    public void Add(View view) {

        calculate = "add";
        getNum();

        int Result = angka1 + angka2;
        tvResult.setText(angka1 + " + " + angka2 + " = " + Result);

    }

    public void Subtract(View view) {

        calculate = "subtract";
        getNum();
        int Result = angka1 - angka2;
        tvResult.setText(angka1 + " - " + angka2 + " = " + Result);
    }

    public void Multiply(View view) {
        calculate = "multiply";
        getNum();
        int Result = angka1 * angka2;
        tvResult.setText(angka1 + " * " + angka2 + " = " + Result);
    }

    public void Divide(View view) {
        calculate = "divide";
        getNum();
        if(angka1 == 0 && angka2 == 0){
            Toast.makeText(this, "Isi untuk dapat membagi", Toast.LENGTH_SHORT).show();
        }
        else if(angka2 == 0){
            Toast.makeText(this, "Cant divide by zero", Toast.LENGTH_SHORT).show();
        }
        else{
            result = (float) angka1 / angka2;
            String fResult = Float.toString(result);
            tvResult.setText(angka1 + " / " + angka2 + " = " + fResult);
        }

    }
}
