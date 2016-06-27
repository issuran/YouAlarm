package com.youalarm.model;

import android.os.Bundle;
import android.util.Log;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.youalarm.Config;

/**
 * Created by Mestre on 6/26/2016.
 */
public class YTPlayerFragment extends YouTubePlayerSupportFragment {

    private YouTubePlayer activePlayer;
    private final static String DEV_KEY = Config.YOUTUBE_API_KEY;

    public static YTPlayerFragment newInstance(String url) {

        YTPlayerFragment player = new YTPlayerFragment();

        Bundle bundle = new Bundle();
        bundle.putString("url", url);

        player.setArguments(bundle);

        return player;
    }

    @Override
    public void onStart() {
        super.onStart();
        init();
    }

    private void init() {
        initialize(DEV_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                activePlayer = youTubePlayer;
                Log.d("YOUTUBE", "Successfully initialized");
                activePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                if (!b) {
                    activePlayer.cueVideo(getArguments().getString("url"));
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.e("YOUTUBE", youTubeInitializationResult.toString());
            }
        });
    }


}