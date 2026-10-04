package org.opencv.android;

import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes10.dex */
public class CameraGLSurfaceView extends GLSurfaceView {

    public interface OooO00o {
    }

    public OooO00o getCameraTextureListener() {
        return null;
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        Log.i("CameraGLSurfaceView", "onPause");
        throw null;
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        Log.i("CameraGLSurfaceView", "onResume");
        super.onResume();
        throw null;
    }

    public void setCameraIndex(int i) {
        throw null;
    }

    public void setCameraTextureListener(OooO00o oooO00o) {
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        throw null;
    }
}
