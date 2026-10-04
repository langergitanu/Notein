package o00o0O0;

import android.os.SystemClock;

/* JADX INFO: renamed from: o00o0O0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25315OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final double f86153OooO00o = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f86154OooO0O0 = 0;

    public static double OooO00o(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f86153OooO00o;
    }
}
