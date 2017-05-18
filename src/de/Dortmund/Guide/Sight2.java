package de.Dortmund.Guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Sight2 extends Activity {
	
	//Erstellen der Activity
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sight);		
		
		//Initialisierung der beiden TextView mit individuellem Design + Text
		TextView t1 = (TextView)findViewById(R.id.TextView01);
		t1.setTextSize(25);
		
		TextView t2 = (TextView)findViewById(R.id.TextView02);
		t2.setTextSize(15);
		
		//Übernahme des Button-Index
		Intent intent = getIntent();
		long index = intent.getLongExtra("clickedButton",0);
		
		//Initialisierung des ImageView
		ImageView iv = (ImageView)findViewById(R.id.ImageView01);
		
		//Ausgabe des Textes je nach ausgewählter Sehenswürdigkeit
		if(index == R.id.aturm){
			iv.setImageResource(R.drawable.adlerturm);
			t1.setText(R.string.aturm);
			t2.setText(R.string.aturmtext);
		}
		
		else if(index == R.id.altmarkt){
			iv.setImageResource(R.drawable.altermarkt);
			t1.setText(R.string.altmarkt);
			t2.setText(R.string.altmarkttext);
			}
		
		else if(index == R.id.bplatz){
			iv.setImageResource(R.drawable.borsigplatz);
			t1.setText(R.string.bplatz);
			t2.setText(R.string.bplatztext);
			}
			
		else if(index == R.id.bruckstr){
			iv.setImageResource(R.drawable.bruckstrasse);
			t1.setText(R.string.bruckstr);
			t2.setText(R.string.bruckstrtext);
			}
			
		else if(index == R.id.casino){
			iv.setImageResource(R.drawable.casino);
			t1.setText(R.string.casino);
			t2.setText(R.string.casinotext);
			}
			
		else if(index == R.id.airport){
			iv.setImageResource(R.drawable.airport);
			t1.setText(R.string.airport);
			t2.setText(R.string.airporttext);
			}
		
		else if(index == R.id.dohbf){
			iv.setImageResource(R.drawable.hauptbahnhof);
			t1.setText(R.string.dohbf);
			t2.setText(R.string.dohbftext);
			}
		
		else if(index == R.id.zoo){
			iv.setImageResource(R.drawable.zoo);
			t1.setText(R.string.zoo);
			t2.setText(R.string.zootext);
			}
		
		else if(index == R.id.fpark){
			iv.setImageResource(R.drawable.fredenbaum);
			t1.setText(R.string.fpark);
			t2.setText(R.string.fparktext);
			}
			
		else if(index == R.id.fplatz){
			iv.setImageResource(R.drawable.friedensplatz);
			t1.setText(R.string.fplatz);
			t2.setText(R.string.fplatztext);
			}
			
		else if(index == R.id.hplatz){
			iv.setImageResource(R.drawable.hansaplatz);
			t1.setText(R.string.hplatz);
			t2.setText(R.string.hplatztext);
			}
			
		else if(index == R.id.kreuz){
			iv.setImageResource(R.drawable.kreuzstrasse);
			t1.setText(R.string.kreuz);
			t2.setText(R.string.kreuztext);
			}
			
		else if(index == R.id.phoensee){
			iv.setImageResource(R.drawable.phoenixsee);
			t1.setText(R.string.phoensee);
			t2.setText(R.string.phoenseetext);
			}
			
		else if(index == R.id.rkirche){
			iv.setImageResource(R.drawable.reinoldikirche);
			t1.setText(R.string.reinoldikirche);
			t2.setText(R.string.rkirchetext);
			}
		
		else if(index == R.id.rpark){
			iv.setImageResource(R.drawable.android);
			t1.setText(R.string.rpark);
			t2.setText(R.string.rparktext);
			}
		
		else if(index == R.id.stadion){
			iv.setImageResource(R.drawable.stadion);
			t1.setText(R.string.stadion);
			t2.setText(R.string.stadiontext);
			}
		
		else if(index == R.id.garten){
			iv.setImageResource(R.drawable.stadtgarten);
			t1.setText(R.string.garten);
			t2.setText(R.string.gartentext);
			}
		
		else if(index == R.id.wache){
			iv.setImageResource(R.drawable.steinwache);
			t1.setText(R.string.wache);
			t2.setText(R.string.wachetext);
			}
			
		else if(index == R.id.uturm){
			iv.setImageResource(R.drawable.uturm);
			t1.setText(R.string.uturm);
			t2.setText(R.string.uturmtext);
			}
			
		else if(index == R.id.westhell){
			iv.setImageResource(R.drawable.westenhellweg);
			t1.setText(R.string.westhell);
			t2.setText(R.string.westhelltext);
			}
		
		else if(index == R.id.westfalenhallen){
			iv.setImageResource(R.drawable.westfalenhalle);
			t1.setText(R.string.westfalenhallen);
			t2.setText(R.string.whallentext);
			}
			
		else if(index == R.id.westfalenpark){
			iv.setImageResource(R.drawable.westfalenpark);
			t1.setText(R.string.westfalenpark);
			t2.setText(R.string.wparktext);
			}
		
		else if(index == R.id.minstein){
			iv.setImageResource(R.drawable.ministerstein);
			t1.setText(R.string.minstein);
			t2.setText(R.string.minsteintext);
			}
		
		
		else if(index == R.id.burger){
			iv.setImageResource(R.drawable.burgerking);
			t1.setText(R.string.burger);
			t2.setText(R.string.burgertext);
			}
		
		else if(index == R.id.thuring){
			iv.setImageResource(R.drawable.android);
			t1.setText(R.string.thuring);
			t2.setText(R.string.thuringtext);
			}
		
		else if(index == R.id.kfc){
			iv.setImageResource(R.drawable.kfc);
			t1.setText(R.string.kfc);
			t2.setText(R.string.kfctext);
			}
		
		else if(index == R.id.grand){
			iv.setImageResource(R.drawable.legrand);
			t1.setText(R.string.grand);
			t2.setText(R.string.grandtext);
			}
		
		else if(index == R.id.maredo){
			iv.setImageResource(R.drawable.maredo);
			t1.setText(R.string.maredo);
			t2.setText(R.string.maredotext);
			}
		
		else if(index == R.id.mcdonald){
			iv.setImageResource(R.drawable.mcdonald);
			t1.setText(R.string.mcdonald);
			t2.setText(R.string.mcdonaldtext);
			}
		
		else if(index == R.id.nightrooms){
			iv.setImageResource(R.drawable.nightrooms);
			t1.setText(R.string.nightrooms);
			t2.setText(R.string.nightroomstext);
			}
		
		else if(index == R.id.passion){
			iv.setImageResource(R.drawable.passion);
			t1.setText(R.string.passion);
			t2.setText(R.string.passiontext);
			}
			
		else if(index == R.id.prisma){
			iv.setImageResource(R.drawable.prisma);
			t1.setText(R.string.prisma);
			t2.setText(R.string.prismatext);
			}
			
		else if(index == R.id.rush){
			iv.setImageResource(R.drawable.rush);
			t1.setText(R.string.rush);
			t2.setText(R.string.rushtext);
			}
		
		else if(index == R.id.ssinners){
			iv.setImageResource(R.drawable.sinners);
			t1.setText(R.string.ssinners);
			t2.setText(R.string.ssinnerstext);
			}
		
		else if(index == R.id.strobel){
			iv.setImageResource(R.drawable.android);
			t1.setText(R.string.strobel);
			t2.setText(R.string.strobeltext);
			}
			
		else if(index == R.id.vapiano){
			iv.setImageResource(R.drawable.vapiano);
			t1.setText(R.string.vapiano);
			t2.setText(R.string.vapianotext);
			}
			
		else if(index == R.id.view){
			iv.setImageResource(R.drawable.view);
			t1.setText(R.string.view);
			t2.setText(R.string.viewtext);
			}
		
		else if(index == R.id.village){
			iv.setImageResource(R.drawable.village);
			t1.setText(R.string.village);
			t2.setText(R.string.villagetext);
		}
			
		else{
			iv.setImageResource(R.drawable.android);
			t1.setText(R.string.app_name);
			t2.setText(R.string.version);
		}
	}
}
