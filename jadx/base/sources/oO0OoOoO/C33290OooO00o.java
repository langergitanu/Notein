package oO0OoOoO;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: renamed from: oO0OoOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33290OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f120515OooO00o = 0;

    static {
        StrictMath.log(Double.MAX_VALUE);
    }

    public static double OooO00o(double d) {
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d) & LocationRequestCompat.PASSIVE_INTERVAL);
    }
}
