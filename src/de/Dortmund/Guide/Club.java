package de.Dortmund.Guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Club extends Activity implements OnClickListener {
	private Button button1;	private Button button2;
	private Button button3;	private Button button4;
	private Button button5; private Button button6;
	private Button button7; private Button button8;
	private Button button9; private Button button10;
	private Button button11; private Button button12;
	private Button button13; private Button button14;
	private Button button15;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club);
        
        button1 = (Button)findViewById(R.id.burger);
        button1.setOnClickListener(this);
        
        button2 = (Button)findViewById(R.id.thuring);
        button2.setOnClickListener(this);
        
        button3 = (Button)findViewById(R.id.kfc);
        button3.setOnClickListener(this);
        
        button4 = (Button)findViewById(R.id.grand);
        button4.setOnClickListener(this);
        
        button5 = (Button)findViewById(R.id.maredo);
        button5.setOnClickListener(this);
        
        button6 = (Button)findViewById(R.id.mcdonald);
        button6.setOnClickListener(this);
        
        button7 = (Button)findViewById(R.id.nightrooms);
        button7.setOnClickListener(this);
        
        button8 = (Button)findViewById(R.id.passion);
        button8.setOnClickListener(this);
        
        button9 = (Button)findViewById(R.id.prisma);
        button9.setOnClickListener(this);
        
        button10 = (Button)findViewById(R.id.rush);
        button10.setOnClickListener(this);
        
        button11 = (Button)findViewById(R.id.ssinners);
        button11.setOnClickListener(this);
        
        button12 = (Button)findViewById(R.id.strobel);
        button12.setOnClickListener(this);
        
        button13 = (Button)findViewById(R.id.vapiano);
        button13.setOnClickListener(this);
        
        button14 = (Button)findViewById(R.id.view);
        button14.setOnClickListener(this);
        
        button15 = (Button)findViewById(R.id.village);
        button15.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent; 
		intent = new Intent(Club.this, Sight.class);
		
		if(v == button1){			
			intent.putExtra("clickedButton", 101);	
		}
		else if(v == button2){
			intent.putExtra("clickedButton", 102);
		}
		else if(v == button3){
			intent.putExtra("clickedButton", 103);
		}
		else if(v == button4){
			intent.putExtra("clickedButton", 104);
		}
		else if(v == button5){
			intent.putExtra("clickedButton", 105);
		}
		else if(v == button6){
			intent.putExtra("clickedButton", 106);
		}
		else if(v == button7){
			intent.putExtra("clickedButton", 107);
		}
		else if(v == button8){
			intent.putExtra("clickedButton", 108);
		}
		else if(v == button9){
			intent.putExtra("clickedButton", 109);
		}
		else if(v == button10){
			intent.putExtra("clickedButton", 110);
		}
		else if(v == button11){
			intent.putExtra("clickedButton", 111);
		}
		else if(v == button12){
			intent.putExtra("clickedButton", 112);
		}
		else if(v == button13){
			intent.putExtra("clickedButton", 113);
		}
		else if(v == button14){
			intent.putExtra("clickedButton", 114);
		}
		else if(v == button15){
			intent.putExtra("clickedButton", 115);
		}
		
		startActivity(intent);
		onPause();
	}
}
