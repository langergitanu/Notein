package o0o000;

import android.media.projection.MediaProjection;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends MediaProjection.Callback {
    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        super.onStop();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("ScreenCaptureForegroundService");
        c20358OooO00o.OooO0o0("mediaProjection onStop.", new Object[0]);
    }
}
