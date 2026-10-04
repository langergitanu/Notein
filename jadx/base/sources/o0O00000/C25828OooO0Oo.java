package o0O00000;

import android.util.Log;

/* JADX INFO: renamed from: o0O00000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C25828OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f88124OooO00o = "PenKit-".concat(C25828OooO0Oo.class.getSimpleName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C25829OooO0o0 f88125OooO0O0;

    static {
        try {
            Class.forName("com.hihonor.penkit.impl.estimate.HnStrokeEstimateImpl");
            if (f88125OooO0O0 == null) {
                f88125OooO0O0 = new C25829OooO0o0();
            }
        } catch (ClassNotFoundException unused) {
            Log.i(f88124OooO00o, "sEstimate is unavailable");
        }
    }

    public static synchronized boolean OooO00o() {
        C25829OooO0o0 c25829OooO0o0 = f88125OooO0O0;
        if (c25829OooO0o0 != null) {
            return c25829OooO0o0.OooO0OO();
        }
        Log.e(f88124OooO00o, "HnStrokeEstimate, isFeatureEnable error, sEstimate is null!");
        return false;
    }
}
