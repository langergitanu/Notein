package androidx.ink.authoring.internal;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceHolder;
import androidx.ink.authoring.internal.OooO0o;
import o000O0oo.C24442Oooo00o;

/* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderCallback2C21942OooO0oo implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object> f65262OooOo0o;

    public SurfaceHolderCallback2C21942OooO0oo(OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0o) {
        this.f65262OooOo0o = oooO0o;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0o = this.f65262OooOo0o;
        if (i2 == 0 || i3 == 0) {
            oooO0o.getClass();
            C24442Oooo00o.OooO00o();
            OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object>.C19024OooO0o c19024OooO0o = oooO0o.f65213OooOO0O;
            if (c19024OooO0o != null) {
                c19024OooO0o.OooO0OO();
            }
            oooO0o.f65213OooOO0O = null;
            return;
        }
        oooO0o.getClass();
        C24442Oooo00o.OooO00o();
        OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object>.C19024OooO0o c19024OooO0o2 = oooO0o.f65213OooOO0O;
        OooO0o.OooO00o oooO00o = c19024OooO0o2 != null ? c19024OooO0o2.f65234OooO00o : null;
        C24442Oooo00o.OooO00o();
        AttachedSurfaceControl rootSurfaceControl = oooO0o.f65206OooO0OO.getRootSurfaceControl();
        if (rootSurfaceControl == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int bufferTransformHint = rootSurfaceControl.getBufferTransformHint();
        OooO0o.OooO00o oooO00o2 = (oooO00o != null && oooO00o.f65219OooO00o == i2 && oooO00o.f65220OooO0O0 == i3 && oooO00o.f65221OooO0OO == bufferTransformHint) ? null : new OooO0o.OooO00o(i2, i3, bufferTransformHint);
        if (oooO00o2 == null) {
            return;
        }
        if (c19024OooO0o2 != null) {
            c19024OooO0o2.OooO0OO();
        }
        OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o3 = new OooO0o.C19024OooO0o(oooO00o2);
        oooO0o.f65213OooOO0O = c19024OooO0o3;
        if (oooO0o.f65214OooOO0o.getAndUpdate(new o000O0oo.OooOOO0()) > 0) {
            C24442Oooo00o.OooO00o();
            c19024OooO0o3.f65235OooO0O0.execute(c19024OooO0o3.f65241OooO0oo);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder holder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0o = this.f65262OooOo0o;
        oooO0o.getClass();
        C24442Oooo00o.OooO00o();
        OooO0o<Object, o000O0oO.OooO0O0<Object, Object>, Object>.C19024OooO0o c19024OooO0o = oooO0o.f65213OooOO0O;
        if (c19024OooO0o != null) {
            c19024OooO0o.OooO0OO();
        }
        oooO0o.f65213OooOO0O = null;
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder holder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
    }
}
