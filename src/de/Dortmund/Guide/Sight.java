package de.Dortmund.Guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Sight extends Activity {
	
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
		int index = intent.getIntExtra("clickedButton",0);
		
		//Initialisierung des ImageView
		ImageView iv = (ImageView)findViewById(R.id.ImageView01);
		
		//Ausgabe des Textes je nach ausgewählter Sehenswürdigkeit
		switch (index){
		case 1:
			iv.setImageResource(R.drawable.adlerturm);
			t1.setText(R.string.aturm);
			t2.setText(R.string.aturmtext);
			break;
		
		case 2:
			iv.setImageResource(R.drawable.altermarkt);
			t1.setText(R.string.altmarkt);
			t2.setText(R.string.altmarkttext);
			break;
		
		case 3:
			iv.setImageResource(R.drawable.borsigplatz);
			t1.setText(R.string.bplatz);
			t2.setText(R.string.bplatztext);
			break;
			
		case 4:
			iv.setImageResource(R.drawable.bruckstrasse);
			t1.setText(R.string.bruckstr);
			t2.setText(R.string.bruckstrtext);
			break;
			
		case 5:
			iv.setImageResource(R.drawable.casino);
			t1.setText(R.string.casino);
			t2.setText(R.string.casinotext);
			break;
			
		case 6:
			iv.setImageResource(R.drawable.airport);
			t1.setText(R.string.airport);
			t2.setText(R.string.airporttext);
			break;
		
		case 7:
			iv.setImageResource(R.drawable.hauptbahnhof);
			t1.setText(R.string.dohbf);
			t2.setText(R.string.dohbftext);
			break;
		
		case 8:
			iv.setImageResource(R.drawable.zoo);
			t1.setText(R.string.zoo);
			t2.setText(R.string.zootext);
			break;
		
		case 9:
			iv.setImageResource(R.drawable.fredenbaum);
			t1.setText(R.string.fpark);
			t2.setText(R.string.fparktext);
			break;
			
		case 10:
			iv.setImageResource(R.drawable.friedensplatz);
			t1.setText(R.string.fplatz);
			t2.setText(R.string.fplatztext);
			break;
			
		case 11:
			iv.setImageResource(R.drawable.hansaplatz);
			t1.setText(R.string.hplatz);
			t2.setText(R.string.hplatztext);
			break;
			
		case 12:
			iv.setImageResource(R.drawable.kreuzstrasse);
			t1.setText(R.string.kreuz);
			t2.setText(R.string.kreuztext);
			break;
			
		case 13:
			iv.setImageResource(R.drawable.phoenixsee);
			t1.setText(R.string.phoensee);
			t2.setText(R.string.phoenseetext);
			break;
			
		case 14:
			iv.setImageResource(R.drawable.reinoldikirche);
			t1.setText(R.string.reinoldikirche);
			t2.setText(R.string.rkirchetext);
			break;
		
		case 15:
			iv.setImageResource(R.drawable.android);
			t1.setText(R.string.rpark);
			t2.setText(R.string.rparktext);
			break;
		
		case 16:
			iv.setImageResource(R.drawable.stadion);
			t1.setText(R.string.stadion);
			t2.setText(R.string.stadiontext);
			break;
		
		case 17:
			iv.setImageResource(R.drawable.stadtgarten);
			t1.setText(R.string.garten);
			t2.setText(R.string.gartentext);
			break;
		
		case 18:
			iv.setImageResource(R.drawable.steinwache);
			t1.setText(R.string.wache);
			t2.setText(R.string.wachetext);
			break;
			
		case 19:
			iv.setImageResource(R.drawable.uturm);
			t1.setText(R.string.uturm);
			t2.setText(R.string.uturmtext);
			break;
			
		case 20:
			iv.setImageResource(R.drawable.westenhellweg);
			t1.setText(R.string.westhell);
			t2.setText(R.string.westhelltext);
			break;
		
		case 21:
			iv.setImageResource(R.drawable.westfalenhalle);
			t1.setText(R.string.westfalenhallen);
			t2.setText(R.string.whallentext);
			break;
			
		case 22:
			iv.setImageResource(R.drawable.westfalenpark);
			t1.setText(R.string.westfalenpark);
			t2.setText(R.string.wparktext);
			break;
		
		case 23:
			iv.setImageResource(R.drawable.ministerstein);
			t1.setText(R.string.minstein);
			t2.setText(R.string.minsteintext);
			break;
		
		
		case 101:
			iv.setImageResource(R.drawable.burgerking);
			t1.setText(R.string.burger);
			t2.setText(R.string.burgertext);
			break;
		
		case 102:
			iv.setImageResource(R.drawable.android);
			t1.setText(R.string.thuring);
			t2.setText(R.string.thuringtext);
			break;
		
		case 103:
			iv.setImageResource(R.drawable.kfc);
			t1.setText(R.string.kfc);
			t2.setText(R.string.kfctext);
			break;
		
		case 104:
			iv.setImageResource(R.drawable.legrand);
			t1.setText(R.string.grand);
			t2.setText(R.string.grandtext);
			break;
		
		case 105:
			iv.setImageResource(R.drawable.maredo);
			t1.setText(R.string.maredo);
			t2.setText(R.string.maredotext);
			break;
		
		case 106:
			iv.setImageResource(R.drawable.mcdonald);
			t1.setText(R.string.mcdonald);
			t2.setText(R.string.mcdonaldtext);
			break;
		
		case 107:
			iv.setImageResource(R.drawable.nightrooms);
			t1.setText(R.string.nightrooms);
			t2.setText(R.string.nightroomstext);
			break;
		
		case 108:
			iv.setImageResource(R.drawable.passion);
			t1.setText(R.string.passion);
			t2.setText(R.string.passiontext);
			break;
			
		case 109:
			iv.setImageResource(R.drawable.prisma);
			t1.setText(R.string.prisma);
			t2.setText(R.string.prismatext);
			break;
			
		case 110:
			iv.setImageResource(R.drawable.rush);
			t1.setText(R.string.rush);
			t2.setText(R.string.rushtext);
			break;
		
		case 111:
			iv.setImageResource(R.drawable.sinners);
			t1.setText(R.string.ssinners);
			t2.setText(R.string.ssinnerstext);
			break;
		
		case 112:
			iv.setImageResource(R.drawable.android);
			t1.setText(R.string.strobel);
			t2.setText(R.string.strobeltext);
			break;
			
		case 113:
			iv.setImageResource(R.drawable.vapiano);
			t1.setText(R.string.vapiano);
			t2.setText(R.string.vapianotext);
			break;
			
		case 114:
			iv.setImageResource(R.drawable.view);
			t1.setText(R.string.view);
			t2.setText(R.string.viewtext);
			break;
		
		case 115:
			iv.setImageResource(R.drawable.village);
			t1.setText(R.string.village);
			t2.setText(R.string.villagetext);
			break;
			
		default:
			iv.setImageResource(R.drawable.android);
			t1.setText(R.string.app_name);
			t2.setText(R.string.version);
		}
	}
}
