package kielce.hackathon.pl.appka;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class LokaleFragment extends Fragment {

    private GoogleMap mMap;

    public LokaleFragment() {
        // Required empty public constructor
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        Button btn = (Button)view.findViewById(R.id.open_map_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent new_activity = new Intent(getActivity(),MapsActivity.class);
                startActivity(new_activity);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lokale, container, false);
    }

}
