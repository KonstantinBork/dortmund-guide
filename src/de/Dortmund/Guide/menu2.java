package de.Dortmund.Guide;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menu2 extends ListActivity  {
		
    //Erstellen der Activity
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String[] sights = getResources().getStringArray(R.array.Sights);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.menu2, sights));
        
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);
        
        lv.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Intent intent;
				intent = new Intent(menu2.this, Sight2.class);
				
				intent.putExtra("ClickedItem", getListView().getItemIdAtPosition(position));
				
				startActivity(intent);
				onPause();
			}
        	
        });
    }

}