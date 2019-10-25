package com.example.fragmentproject;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFag extends ListFragment {

    itemSelected activity;

    public interface itemSelected{
        void onItemSelected(int index);
    }

    public ListFag() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("Fragment Life cycle","onActivityCreate called");
        super.onActivityCreated(savedInstanceState);

        ArrayList<String> data = new ArrayList<String>();
        data.add("1.This is item 1");
        data.add("2.This is item 2");
        data.add("3.This is item 3");

        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,data));
    }

    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("Fragment Life cycle","onAttach called");
        super.onAttach(context);

        activity = (itemSelected) context;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {

        activity.onItemSelected(position);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("Fragment Life cycle","onCreateView called");
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("Fragment Life cycle","onCreate called");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("Fragment Life cycle","onStart called");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("Fragment Life cycle","onResume called");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("Fragment Life cycle","onPause called");

        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("Fragment Life cycle","onStop called");
        super.onStop();
    }

    @Override
    public void onDetach() {
        Log.d("Fragment Life cycle","onDetach called");
        super.onDetach();
    }

    @Override
    public void onDestroyView() {
        Log.d("Fragment Life cycle","onDestroyView called");
        super.onDestroyView();
    }
}
