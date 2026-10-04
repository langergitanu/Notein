package org.opencv.android;

import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CameraBridgeViewBase extends SurfaceView implements SurfaceHolder.Callback {

    public interface OooO00o {
    }

    public interface OooO0O0 {
    }

    public class OooO0OO implements OooO00o {
    }

    public void setCameraIndex(int i) {
    }

    public void setCvCameraViewListener(OooO00o oooO00o) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Log.d("CameraBridge", "call surfaceChanged event");
        throw null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        throw null;
    }

    public void setCvCameraViewListener(OooO0O0 oooO0O0) {
    }
}
