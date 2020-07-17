package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button zero;
   private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private  Button equal;
    private Button clear;
    private TextView info;
    private TextView info1;
    private TextView result;
    private TextView opera;
    private final char ADDITION='+';
    private final char SUBTRACTION='-';
    private final char MULTIPLICATION='*';
    private final char DIVISION='/';
    private final char EQU=0;
    private double val1=Double.NaN;
    private double val2;
    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opera.getText().toString()==" + "||opera.getText().toString()==" - "||opera.getText().toString()==" * "||opera.getText().toString()==" / ") {
                    info1.setText(info1.getText().toString() + "0");
                }
                else
                {
                    info.setText(info.getText().toString() + "0");
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opera.getText().toString()==" + "||opera.getText().toString()==" - "||opera.getText().toString()==" * "||opera.getText().toString()==" / ") {
                    info1.setText(info1.getText().toString() + "1");
                }
                else
                {
                    info.setText(info.getText().toString() + "1");
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opera.getText().toString()==" + "||opera.getText().toString()==" - "||opera.getText().toString()==" * "||opera.getText().toString()==" / ") {
                    info1.setText(info1.getText().toString() + "2");
                }
                else
                {
                    info.setText(info.getText().toString() + "2");
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opera.getText().toString()==" + "||opera.getText().toString()==" - "||opera.getText().toString()==" * "||opera.getText().toString()==" / ") {
                    info1.setText(info1.getText().toString() + "3");
                }
                else
                {
                    info.setText(info.getText().toString() + "3");
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opera.getText().toString()==" + "||opera.getText().toString()==" - "||opera.getText().toString()==" * "||opera.getText().toString()==" / ") {
                    info1.setText(info1.getText().toString() + "4");
                }
                else
                {
                    info.setText(info.getText().toString() + "4");
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opera.getText().toString()==" + " ||opera.getText().toString()==" - "||opera.getText().toString()==" * "||opera.getText().toString()==" / ") {
                    info1.setText(info1.getText().toString() + "5");
                }
                else
                {
                    info.setText(info.getText().toString() + "5");
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opera.getText().toString()==" + "||opera.getText().toString()==" - "||opera.getText().toString()==" * "||opera.getText().toString()==" / ") {
                    info1.setText(info1.getText().toString() + "6");
                }
                else
                {
                    info.setText(info.getText().toString() + "6");
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opera.getText().toString()==" + "||opera.getText().toString()==" - "||opera.getText().toString()==" * "||opera.getText().toString()==" / ") {
                    info1.setText(info1.getText().toString() + "7");
                }
                else
                {
                    info.setText(info.getText().toString() + "7");
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opera.getText().toString()==" + "||opera.getText().toString()==" - "||opera.getText().toString()==" * "||opera.getText().toString()==" / ") {
                    info1.setText(info1.getText().toString() + "8");
                }
                else
                {
                    info.setText(info.getText().toString() + "8");
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opera.getText().toString()==" + "||opera.getText().toString()==" - "||opera.getText().toString()==" * "||opera.getText().toString()==" / ") {
                    info1.setText(info1.getText().toString() + "9");
                }
                else
                {
                    info.setText(info.getText().toString() + "9");
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              compute();
                ACTION=ADDITION;
              info.setText(String.valueOf(val1));

                opera.setText(" + ");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION=SUBTRACTION;
                info.setText(String.valueOf(val1));

                opera.setText(" - ");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION=MULTIPLICATION;
                info.setText(String.valueOf(val1));

                opera.setText(" * ");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION=DIVISION;
                info.setText(String.valueOf(val1));

                opera.setText(" / ");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION=EQU;
                compute();
             if(opera.getText().toString()==" + ")
             {
                 result.setText(String.valueOf(val1+val2));
             }
                if(opera.getText().toString()==" - ")
                {
                    result.setText(String.valueOf(val1-val2));
                }
                if(opera.getText().toString()==" * ")
                {
                    result.setText(String.valueOf(val1*val2));
                }
                if(opera.getText().toString()==" / ")
                {
                    result.setText(String.valueOf(val1/val2));
                }





                //5+4=9;
                info.setText(null);
                info1.setText(null);

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length()>0)
                {
                    CharSequence name=info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));
                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    info1.setText(null);
                    opera.setText(null);
                    result.setText(null);
                }
            }
        });
    }
    @SuppressLint("WrongViewCast")
    private void setupUIViews()
    {
        one =(Button)findViewById(R.id.btn1);
        zero =(Button)findViewById(R.id.btn0);
        two =(Button)findViewById(R.id.btn2);
        three =(Button)findViewById(R.id.btn3);
        four =(Button)findViewById(R.id.btn4);
        five =(Button)findViewById(R.id.btn5);
        six =(Button)findViewById(R.id.btn6);
        seven =(Button)findViewById(R.id.btn7);
        eight =(Button)findViewById(R.id.btn8);
        nine =(Button)findViewById(R.id.btn9);
        add =(Button)findViewById(R.id.btnadd);
        sub =(Button)findViewById(R.id.btnsub);
        mul =(Button)findViewById(R.id.btnmul);
        div =(Button)findViewById(R.id.btndiv);
        equal=(Button)findViewById(R.id.btnequal);
        clear=(Button)findViewById(R.id.btnclr);
        info= (TextView) findViewById(R.id.tvcontrol);
        info1= (TextView) findViewById(R.id.tvcontrol1);
        result= (TextView) findViewById(R.id.tvresult);
        opera=(TextView) findViewById(R.id.operation);
    }

    private void compute()
    {
        if(!Double.isNaN(val1))
        {
            val2=Double.parseDouble(info1.getText().toString());

            switch(ACTION)
            {
                case ADDITION:
                    val1=val1+val2;
                       break;
                case SUBTRACTION:
                    val1=val1-val2;
                    break;
                case MULTIPLICATION:
                    val1=val1*val2;
                    break;
                case DIVISION:
                    val1=val1/val2;
                    break;
                case EQU:
                    break;

            }


        }
        else
        {
            val1=Double.parseDouble(info.getText().toString());
        }
    }


    }
