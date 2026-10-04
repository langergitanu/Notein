package androidx.ink.authoring.internal;

import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object> f65176OooOo0o;

    public OooO(OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0o) {
        this.f65176OooOo0o = oooO0o;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0o = this.f65176OooOo0o;
        oooO0o.getClass();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        SurfaceView surfaceView = oooO0o.f65212OooOO0;
        oooO0o.f65206OooO0OO.addView(surfaceView, layoutParams);
        surfaceView.getHolder().addCallback(oooO0o.f65216OooOOO0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0o = this.f65176OooOo0o;
        oooO0o.f65206OooO0OO.removeView(oooO0o.f65212OooOO0);
    }
}
