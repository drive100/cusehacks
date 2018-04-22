package com.example.danielr258.cusewalks;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.LocationSource;
import com.google.maps.android.data.kml.*;
//import com.google.maps.android.data.kml.KmlPlacemark;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.lang.Object.*;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //setUpMap();

        //GoogleMap map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMapAsync(this);
        //var KmlLayer = new google.maps.KmlLayer("Layers/", myKmlOptions);
        try {
            KmlLayer layer = new KmlLayer(googleMap, R.raw.crime_map_syracuse, getApplicationContext());
            layer.addLayerToMap();
           // layer.setVisibility(View.VISIBLE);
            //moveCameraToKml(layer);
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(43.0392, -76.1351);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Syracuse"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }


}
