package de.Dortmund.Guide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Info extends Activity {
	private TextView info1;
	private TextView info2;
	private TextView info3;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        
        info1 = (TextView)findViewById(R.id.info1);
        info1.setTextSize(25);
        info1.setText(R.string.app_name);
        
        info2 = (TextView)findViewById(R.id.info2);
        info2.setTextSize(15);
        info2.setText(R.string.infoText);
        
        info3 = (TextView)findViewById(R.id.info3);
        info3.setTextSize(15);
        info3.setText(R.string.version);
	}
}
