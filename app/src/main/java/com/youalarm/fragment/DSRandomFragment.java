package com.youalarm.fragment;

import android.os.Bundle;
import android.projetos.br.youalarm.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youalarm.model.YTPlayerFragment;

public class DSRandomFragment extends Fragment {

    private static String TAG = "DSRANDOM";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        setRetainInstance(false);
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dsrandom, container, false);

        YTPlayerFragment video = YTPlayerFragment.newInstance("Gs069dndIYk");

        getChildFragmentManager().beginTransaction().replace(R.id.fragment_youtube_player3, video).addToBackStack(null).commit();

        return view;
    }

}
