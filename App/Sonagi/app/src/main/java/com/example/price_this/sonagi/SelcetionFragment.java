package com.example.price_this.sonagi;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import org.greenrobot.eventbus.EventBus;


public class SelcetionFragment extends Fragment {


    boolean isToilet;
    boolean isTrashCan;
    boolean isVending;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_selection, container, false);

        final CheckBox checkToilet = (CheckBox) rootView.findViewById(R.id.checkToilet);
        final CheckBox checkTrashCan = (CheckBox) rootView.findViewById(R.id.checkTrash);
        final CheckBox checkVending = (CheckBox) rootView.findViewById(R.id.checkVending);



        checkToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isToilet = checkToilet.isChecked();
                isTrashCan = checkTrashCan.isChecked();
                isVending = checkVending.isChecked();

            }
        });

        checkTrashCan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isToilet = checkToilet.isChecked();
                isTrashCan = checkTrashCan.isChecked();
                isVending = checkVending.isChecked();

            }
        });

        checkVending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isToilet = checkToilet.isChecked();
                isTrashCan = checkTrashCan.isChecked();
                isVending = checkVending.isChecked();

            }
        });


        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister( this );
    }




}
