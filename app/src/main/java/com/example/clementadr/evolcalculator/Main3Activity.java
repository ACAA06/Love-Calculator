package com.example.clementadr.evolcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
 Button calculate;
 TextView edittext;
 TextView edittext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void calculate(View view)
    { edittext = (TextView) findViewById(R.id.editText);
        String name1 = edittext.getText().toString();
        edittext2 = (TextView) findViewById(R.id.editText2);
        String name2 = edittext2.getText().toString();
        int n1= name1.length();
        int n2= name2.length();
        String name=name1+name2;
        int n=n1+n2;
        int sum=0,sum1=0,a,b,a1,b1,total;
        int[] arr,arr1;
        int i;
        arr= new int[4];
        arr[0]=0;
        arr[1]=0;
        arr[2]=0;
        arr[3]=0;
        arr1= new int[4];
        arr1[0]=0;
        arr1[1]=0;
        arr1[2]=0;
        arr1[3]=0;
        for(i=0;i<n;i++)
         {if(name.charAt(i)=='T'||name.charAt(i)=='t') {
             arr[0]++;
         }
         else{if (name.charAt(i)=='R'||name.charAt(i)=='r') {
             arr[1]++;
         }
         else{if (name.charAt(i)=='U'||name.charAt(i)=='u') {
             arr[2]++;
         }
         else {if (name.charAt(i)=='E'||name.charAt(i)=='e')
             arr[3]++;
         }}}}
        for(i=0;i<n;i++)
        {if(name.charAt(i)=='L'||name.charAt(i)=='l') {
            arr1[0]++;
        }
        else{if (name.charAt(i)=='o'||name.charAt(i)=='O') {
            arr1[1]++;
        }
        else{if (name.charAt(i)=='V'||name.charAt(i)=='v') {
            arr1[2]++;
        }
        else {if (name.charAt(i)=='E'||name.charAt(i)=='e')
            arr1[3]++;
        }}}}
        for(i=0;i<4;i++) {
            sum += arr[i];
            sum1 += arr1[i];
        }
        if(sum>=10)
        {a=sum/10;
        b=sum%10;
        a=a+b;
         }
         else {
            a = sum;
        }
        if(sum1>=10)
        {a1=sum1/10;
            b1=sum1%10;
            a1=a1+b1;
        }
        else {
            a1 = sum1;
        }
        total =a*10+a1;
        display(total);





    }
    private void display(int t)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.textView7);
        TextView quantityTextView1 = (TextView) findViewById(R.id.textView6);
        quantityTextView.setText("Your ♡ percentage is " + t+"% ");
        if(t>50)
        {
        quantityTextView1.setText("\uD83D\uDE31 That's great! \uD83D\uDE0D");
    }
    else {if(t<=50&&t>=35)
        quantityTextView1.setText("That's a good one! \uD83D\uDC4D ");
        else{if(t<=25)
            quantityTextView1.setText("EDHUKU!!! \uD83D\uDE25");
        }
        }
        }

    }

