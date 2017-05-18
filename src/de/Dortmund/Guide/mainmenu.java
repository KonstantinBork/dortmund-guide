package de.Dortmund.Guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class mainmenu extends Activity implements OnClickListener {
	private Button mapButton;
	private Button sightButton;
	private Button clubButton;
	private Button infoButton;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
        
        mapButton = (Button)findViewById(R.id.mapButton);
        mapButton.setOnClickListener(this);
        
        sightButton = (Button)findViewById(R.id.sightButton);
        sightButton.setOnClickListener(this);
        
        clubButton = (Button)findViewById(R.id.clubButton);
        clubButton.setOnClickListener(this);
        
        infoButton = (Button)findViewById(R.id.infoButton);
        infoButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v == mapButton){
			startActivity(new Intent(mainmenu.this, DortmundMap.class));
			onPause();	//pausieren dieser Activity
		}
		else if(v == sightButton){
			startActivity(new Intent(mainmenu.this, menu.class));
			onPause();
		}
		else if(v == clubButton){
			startActivity(new Intent(mainmenu.this, Club.class));
			onPause();
		}
		else if(v == infoButton){
			startActivity(new Intent(mainmenu.this, Info.class));
			onPause();
		}
	}
	
}
