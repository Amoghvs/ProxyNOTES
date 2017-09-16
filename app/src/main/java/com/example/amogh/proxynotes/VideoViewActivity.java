package com.example.amogh.proxynotes;

/**
 * Created by amogh on 16/9/17.
 */

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.util.Log;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoViewActivity extends Activity {

    // Declare variables
    ProgressDialog pDialog;
    VideoView videoview;
    String url;

    // Insert your Video URL
    String VideoURL1 = "http://proxynotes.com/assignmnet/test.mp4?videoid=0001";
    String VideoURL2 = "http://proxynotes.com/assignmnet/test.mp4?videoid=0002";
    String VideoURL3 = "http://proxynotes.com/assignmnet/test.mp4?videoid=0003";
    String VideoURL4 = "http://proxynotes.com/assignmnet/test.mp4?videoid=0004";
    String VideoURL5 = "http://proxynotes.com/assignmnet/test.mp4?videoid=0005";
    String VideoURL6 = "http://proxynotes.com/assignmnet/test.mp4?videoid=0006";
    String VideoURL7 = "http://proxynotes.com/assignmnet/test.mp4?videoid=0007";
    String VideoURL8 = "http://proxynotes.com/assignmnet/test.mp4?videoid=0008";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the layout from video_main.xml
        setContentView(R.layout.videoview_main);
        // Find your VideoView in your video_main.xml layout
        videoview = (VideoView) findViewById(R.id.VideoView);
        // Execute StreamVideo AsyncTask

        // Create a progressbar
        pDialog = new ProgressDialog(VideoViewActivity.this);
        // Set progressbar title
        pDialog.setTitle("Streaming");
        // Set progressbar message
        pDialog.setMessage("Buffering...");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(false);
        // Show progressbar
        pDialog.show();

        try {
            // Start the MediaController
            MediaController mediacontroller = new MediaController(
                    VideoViewActivity.this);
            mediacontroller.setAnchorView(videoview);


            /*  switch(R.id.MyButton)
              {

                  case 1:
                      //R.id.MyButton=R.id.MyButton2;
                      VideoURL1=url;
                      break;
                  case 2:
                      //R.id.MyButton=R.id.MyButton2;

                      VideoURL1=url;
                      break;
                  case 3:
                     // R.id.MyButton=R.id.MyButton3;

                      VideoURL1=url;
                      break;
                  case 4:
                     // R.id.MyButton=R.id.MyButton4;

                      VideoURL1=url;
                      break;
                  case 5:
                      //R.id.MyButton=R.id.MyButton2;

                      VideoURL1=url;
                      break;
                  case 6:
                     // R.id.MyButton=R.id.MyButton2;

                      VideoURL1=url;
                      break;
                  case 7:
                     // R.id.MyButton=R.id.MyButton2;

                      VideoURL1=url;
                      break;
                  case 8:
                      //R.id.MyButton=R.id.MyButton2;

                      VideoURL1=url;
                      break;
           }*/


            // Get the URL from String VideoURL
                Uri video = Uri.parse(VideoURL1);

                videoview.setMediaController(mediacontroller);
                videoview.setVideoURI(video);


        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        videoview.requestFocus();
        videoview.setOnPreparedListener(new OnPreparedListener() {
            // Close the progress bar and play the video
            public void onPrepared(MediaPlayer mp) {
                pDialog.dismiss();
                videoview.start();
            }
        });

    }

}