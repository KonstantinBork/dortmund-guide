package de.Dortmund.Guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class menu extends Activity implements OnClickListener  {
	//Deklarierung der einzelnen Buttons
	private Button button1; private Button button2;
	private Button button3; private Button button4;
	private Button button5; private Button button6;
	private Button button7;	private Button button8;
	private Button button9;	private Button button10;
	private Button button11; private Button button12;
	private Button button13; private Button button14;
	private Button button15; private Button button16;
	private Button button17; private Button button18;
	private Button button19; private Button button20;
	private Button button21; private Button button22;
	private Button button23;
	
    //Erstellen der Activity
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        
        //Initialisierung der Buttons
        button1 = (Button)findViewById(R.id.aturm);
        button1.setOnClickListener(this);
        
        button2 = (Button)findViewById(R.id.altmarkt);
        button2.setOnClickListener(this);
        
        button3 = (Button)findViewById(R.id.bplatz);
        button3.setOnClickListener(this);
        
        button4 = (Button)findViewById(R.id.bruckstr);
        button4.setOnClickListener(this);
        
        button5 = (Button)findViewById(R.id.casino);
        button5.setOnClickListener(this);
        
        button6 = (Button)findViewById(R.id.airport);
        button6.setOnClickListener(this);
        
        button7 = (Button)findViewById(R.id.dohbf);
        button7.setOnClickListener(this);
        
        button8 = (Button)findViewById(R.id.zoo);
        button8.setOnClickListener(this);
        
        button9 = (Button)findViewById(R.id.fpark);
        button9.setOnClickListener(this);
        
        button10 = (Button)findViewById(R.id.fplatz);
        button10.setOnClickListener(this);
        
        button11 = (Button)findViewById(R.id.hplatz);
        button11.setOnClickListener(this);
        
        button12 = (Button)findViewById(R.id.kreuz);
        button12.setOnClickListener(this);
        
        button13 = (Button)findViewById(R.id.phoensee);
        button13.setOnClickListener(this);
        
        button14 = (Button)findViewById(R.id.rkirche);
        button14.setOnClickListener(this);
        
        button15 = (Button)findViewById(R.id.rpark);
        button15.setOnClickListener(this);
        
        button16 = (Button)findViewById(R.id.stadion);
        button16.setOnClickListener(this);
        
        button17 = (Button)findViewById(R.id.garten);
        button17.setOnClickListener(this);
        
        button18 = (Button)findViewById(R.id.wache);
        button18.setOnClickListener(this);
        
        button19 = (Button)findViewById(R.id.uturm);
        button19.setOnClickListener(this);
        
        button20 = (Button)findViewById(R.id.westhell);
        button20.setOnClickListener(this);
        
        button21 = (Button)findViewById(R.id.westfalenhallen);
        button21.setOnClickListener(this);
        
        button22 = (Button)findViewById(R.id.westfalenpark);
        button22.setOnClickListener(this);
        
        button23 = (Button)findViewById(R.id.minstein);
        button23.setOnClickListener(this);
    }

	//Handlung bei Klick eines Buttons
	@Override
	public void onClick(View v) {
		//Initialisierung eines Intents,um Daten einer neuen Activity zu übergeben
		Intent intent;
		
		intent = new Intent(menu.this, Sight.class);	//Intent-Initialisierung
		
		//falls button1
		if(v == button1){
			intent.putExtra("clickedButton",1);	//Übergabe des Button-Index
		}
		
		else if(v == button2){
			intent.putExtra("clickedButton", 2);
		}
		
		else if(v == button3){
			intent.putExtra("clickedButton", 3);
		}
		
		else if(v == button4){
			intent.putExtra("clickedButton", 4);
		}
		
		else if(v == button5){
			intent.putExtra("clickedButton", 5);
		}
		
		else if(v == button6){
			intent.putExtra("clickedButton",6);
		}
		
		else if(v == button7){
			intent.putExtra("clickedButton",7);
		}
		
		else if(v == button8){
			intent.putExtra("clickedButton",8);
		}
		
		else if(v == button9){
			intent.putExtra("clickedButton",9);
			}
		
		else if(v == button10){
			intent.putExtra("clickedButton",10);
		}
		
		else if(v == button11){
			intent.putExtra("clickedButton",11);
			}
		
		else if(v == button12){
			intent.putExtra("clickedButton",12);
		}
		
		else if(v == button13){
			intent.putExtra("clickedButton",13);
		}
		
		else if(v == button14){
			intent.putExtra("clickedButton",14);
		}
		
		else if(v == button15){
			intent.putExtra("clickedButton",15);
		}
		
		else if(v == button16){
			intent.putExtra("clickedButton",16);
		}
		
		else if(v == button17){
			intent.putExtra("clickedButton",17);
		}
		
		else if(v == button18){
			intent.putExtra("clickedButton",18);
		}
		
		else if(v == button19){
			intent.putExtra("clickedButton",19);
		}
		
		else if(v == button20){
			intent.putExtra("clickedButton",20);
		}
		
		else if(v == button21){
			intent.putExtra("clickedButton",21);
		}
		
		else if(v == button22){
			intent.putExtra("clickedButton",22);
		}
		
		else if(v == button23){
			intent.putExtra("clickedButton",23);
		}
		
		startActivity(intent); //starten der neuen Activity
		onPause();	//pausieren dieser Activity
		
	}		
}