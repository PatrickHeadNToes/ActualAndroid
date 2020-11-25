package com.example.actualandroid;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class GLActivity extends Activity {

    private GLSurfaceView gLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gLView = new MyGLSurfaceView(this);
        setContentView(gLView);

    }

}
