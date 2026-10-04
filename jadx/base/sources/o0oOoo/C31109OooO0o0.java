package o0oOoo;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oOoo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31109OooO0o0 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C31108OooO0o f111016OooO00o;

    public C31109OooO0o0(C31108OooO0o c31108OooO0o) {
        this.f111016OooO00o = c31108OooO0o;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        OooOOO0.OooO0oO(e2, "e2");
        C31108OooO0o c31108OooO0o = this.f111016OooO00o;
        c31108OooO0o.f111012OooO0O0 = true;
        ImageCropView imageCropView = c31108OooO0o.f111011OooO00o.f111019OooO00o;
        imageCropView.f80155Oooo0OO.postTranslate(-f, -f2);
        imageCropView.invalidate();
        return true;
    }
}
