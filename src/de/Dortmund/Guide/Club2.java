package de.Dortmund.Guide;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Club2 extends ListActivity {
    //Erstellen der Activity
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String[] clubs = getResources().getStringArray(R.array.Clubs);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.club2, clubs));
        
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);
        
        lv.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Intent intent;
				intent = new Intent(Club2.this, Sight2.class);
				
				intent.putExtra("ClickedItem", position);
				
				startActivity(intent);
				onPause();
			}
        	
        });
    }

}