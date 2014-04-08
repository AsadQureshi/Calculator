package com.metikulous.calculator;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
 
public class MainActivity extends Activity {
     
 public String str ="";
 Character op = null;
 float num,numtemp;
 EditText showResult;
 //EditText preview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        
//        int firstET = num;
//		String firstString = firstET.getText().toString();   // get string from first EditText
//		int secondET = numtemp;
//		String  secondString = secondET.getid.toString();  // get string from second EditText
//        EditText concatenatedET = (EditText) findViewById(R.id.preview);  //declare EditText you want them put in together
//        TextView concatentatedET = null;
//		concatentatedET.setText(firstString + secondString); 
//        
        
        
        
        
        showResult = (EditText)findViewById(R.id.result_id);
         
         
    }
    public void btn0Clicked(View v){
        insert(0);
         
       }  
    public void btn1Clicked(View v){
       insert(1);
        
      }
       
 public void btn2Clicked(View v){
       insert(2);
        
      }
      public void btn3Clicked(View v){
       insert(3);
        
      }
      public void btn4Clicked(View v){
       insert(4);
        
      }
      public void btn5Clicked(View v){
       insert(5);
        
      }
      public void btn6Clicked(View v){
       insert(6);
      }
      public void btn7Clicked(View v){
       insert(7);
        
      }
      public void btn8Clicked(View v){
       insert(8);
        
      }
      public void btn9Clicked(View v){
       insert(9);
        
      }
      public void btnplusClicked(View v){
       perform();
       op = '+';
    
      }
       
 public void btnminusClicked(View v){
    perform();
         op = '-';
    
      }
      public void btndivideClicked(View v){
       perform();
       op = '/';
    
      }
      public void btnmultiClicked(View v){
       perform();
       op = '*';
      
      }
      public void btnequalClicked(View v){
       calculate();
        
      }
       
 public void btnclearClicked(View v){
       reset();
      }
      private void reset() {
  // TODO Auto-generated method stub
   str ="";
   op =null;
   num = 0;
   numtemp = 0;
   showResult.setText("");
 }
 private void insert(int j) {
    // TODO Auto-generated method stub
       str = str+Integer.toString(j);
       num = Integer.valueOf(str).intValue();
       showResult.setText(str);
        
     
   }
      private void perform() {
    // TODO Auto-generated method stub
    str = "";
    numtemp = num;
   }
      private void calculate() {
    // TODO Auto-generated method stub
    if(op == '+')
     num = numtemp+num;
    else if(op == '-')
     num = numtemp-num;
    else if(op == '/')
     num = numtemp/num;
    else if(op == '*')
     num = numtemp*num;
    showResult.setText(""+num);
   }
     
}