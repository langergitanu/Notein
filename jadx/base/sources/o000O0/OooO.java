package o000O0;

import android.view.SurfaceControl;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f82162OooO00o = new OooO();

    public final void OooO00o(SurfaceControl.Transaction transaction, SurfaceControl surfaceControl, float f, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transaction, "transaction");
        kotlin.jvm.internal.OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
        transaction.setFrameRate(surfaceControl, f, i);
    }
}
