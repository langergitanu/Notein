package o0oOoo;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oOoo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31107OooO0Oo extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C31108OooO0o f111010OooO00o;

    public C31107OooO0Oo(C31108OooO0o c31108OooO0o) {
        this.f111010OooO00o = c31108OooO0o;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        OooOOO0.OooO0oO(detector, "detector");
        C31111OooO0oo c31111OooO0oo = this.f111010OooO00o.f111011OooO00o;
        float scaleFactor = detector.getScaleFactor();
        float focusX = detector.getFocusX();
        float focusY = detector.getFocusY();
        ImageCropView imageCropView = c31111OooO0oo.f111019OooO00o;
        if (!ImageCropView.OooO0O0(imageCropView, scaleFactor)) {
            Matrix matrix = imageCropView.f80161OoooO0;
            matrix.reset();
            Matrix matrix2 = imageCropView.f80155Oooo0OO;
            matrix2.invert(matrix);
            float[] fArr = imageCropView.f80162OoooO00;
            fArr[0] = focusX;
            fArr[1] = focusY;
            matrix.mapPoints(fArr);
            matrix2.preScale(scaleFactor, scaleFactor, fArr[0], fArr[1]);
            imageCropView.OooO0o0();
            imageCropView.invalidate();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        OooOOO0.OooO0oO(detector, "detector");
        super.onScaleEnd(detector);
        this.f111010OooO00o.f111011OooO00o.OooO00o();
    }
}
