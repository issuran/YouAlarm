package com.youalarm.fragment;

import android.os.Bundle;
import android.projetos.br.youalarm.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DSStyleFragment extends Fragment {

    private static String TAG = "DSSTYLE";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        setRetainInstance(false);
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dsstyle, container, false);
//
//        YTPlayerFragment video = YTPlayerFragment.newInstance("Zi_XLOBDo_Y");
//

//        getChildFragmentManager().beginTransaction().replace(R.id.fragment_youtube_player2, video).addToBackStack(null).commit();

        return view;
    }

}
