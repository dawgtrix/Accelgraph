package com.example.johndoe.accelgraph;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by John Doe on 09/03/2016.
 */
/*public class SavedGraphFragment extends Fragment {

    private static Button SaveGraphButton;

    Listener activityCommander;

    //ensures that the method is implemented in the MainActivty
    public interface Listener{
        //would enter strings
        public void createSave(Boolean saveButton);
    }
    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            activityCommander = (Listener) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_saved_graph, container, false);

        SaveGraphButton = (Button) view.findViewById(R.id.button);

        buttonClicked(
                new View.OnClickListener(){
                    public void OnClick(View v){
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }

    //Calls this when button is clicked
    public void buttonClicked(View view){
        activityCommander.createSave();
    }*/

//    @Override
//     public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//    super.onActivityCreated(savedInstanceState);
//}


public class SavedGraphFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_saved_graph, container, false);
    }

}