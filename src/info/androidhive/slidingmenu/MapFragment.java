package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MapFragment extends Fragment {
	
	private static View rootView;
	
	public MapFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        if(rootView != null) {
        	ViewGroup parent = (ViewGroup) rootView.getParent();
        	if(parent != null)
        		parent.removeView(rootView);
        }
        try {
        	rootView = inflater.inflate(R.layout.fragment_map, container, false);
        } catch (InflateException e) {
        	
        }
        
        //MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        //mapFragment.getMapAsync(this);  /** WHAT DA FUCK IS DIS?!?! */
        
        return rootView;
    }	
}
