package o000O0;

import android.view.SurfaceControl;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0O f82165OooO00o = new OooOO0O();

    public final void OooO00o(SurfaceControl.Transaction transaction, SurfaceControl surfaceControl, float f, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transaction, "transaction");
        kotlin.jvm.internal.OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
        transaction.setFrameRate(surfaceControl, f, i, i2);
    }
}
