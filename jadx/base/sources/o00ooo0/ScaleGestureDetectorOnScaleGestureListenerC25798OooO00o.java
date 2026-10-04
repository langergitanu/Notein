package o00ooo0;

import android.view.ScaleGestureDetector;

/* JADX INFO: renamed from: o00ooo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC25798OooO00o implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C25799OooO0O0 f87974OooO00o;

    public ScaleGestureDetectorOnScaleGestureListenerC25798OooO00o(C25799OooO0O0 c25799OooO0O0) {
        this.f87974OooO00o = c25799OooO0O0;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        if (scaleFactor < 0.0f) {
            return true;
        }
        this.f87974OooO00o.f87984OooOO0.OooO00o(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
