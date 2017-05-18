package de.Dortmund.Guide;

import android.os.Bundle;
//import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
//import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

public class DortmundMap extends MapActivity {

	private MapView mapView;
	//private MapController mapController;
	
	//private static int mio = 1000000;
	//private int lati = 0;
	//private int longi = 0;
	
	//GeoPoint myGP = new GeoPoint(lati, longi);
	
	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setTitle(R.string.app_name);
		setContentView(R.layout.map);
		mapView = (MapView)findViewById(R.id.mapview);
		mapView.setBuiltInZoomControls(true);
		
		//this.getCodes();
		
		//mapController = mapView.getController();
		//mapController.setCenter(myGP);
		//mapController.setZoom(12);
	}
	
	//public void getCodes(){
		//String rkirchelat = getString(R.string.rkirchelat);
		//String rkirchelong = getString(R.string.rkirchelong);
		
		//lati = (int)Double.parseDouble(rkirchelat) * mio;
		//longi = (int)Double.parseDouble(rkirchelong) * mio;
	//}
	
	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}

}
