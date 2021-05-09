package com.example.ujiangis2.setyanovantho;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng untad = new LatLng(-0.83609, 119.89365);
        mMap.addMarker(new MarkerOptions().position(untad).title("Saya berada Di UNTAD"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(untad));

        LatLng polda = new LatLng(-0.85451, 119.89305);
        mMap.addMarker(new MarkerOptions().position(polda).title("Kantor Ditlantas Polda Sulteng"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polda));


        mMap.addPolyline(new PolylineOptions().add(
                untad,
                new LatLng(-0.83609, 119.89365),
                new LatLng(-0.83612, 119.88941),
                new LatLng(-0.84375, 119.89100),
                new LatLng(-0.84674, 119.89161),
                new LatLng(-0.85126, 119.89205),
                new LatLng(-0.85568, 119.89148),
                new LatLng(-0.85451, 119.89305),
                polda
                ).width(10)
                .color(Color.RED)

        );
    }
}