package oO0o0o0o;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.TimeUnit;
import o00o0o0o.C25446OooO0Oo;
import oO0o0Ooo.C33841OooOo0O;

/* JADX INFO: renamed from: oO0o0o0o.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33871OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f122012OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f122013OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f122014OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f122015OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C33877OooO0o0 f122016OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final long f122017OooO0o0;

    static {
        String property;
        int i = C33841OooOo0O.f121953OooO00o;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f122012OooO00o = property;
        f122013OooO0O0 = C25446OooO0Oo.OooOO0o("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, LocationRequestCompat.PASSIVE_INTERVAL);
        int i2 = C33841OooOo0O.f121953OooO00o;
        if (i2 < 2) {
            i2 = 2;
        }
        f122014OooO0OO = C25446OooO0Oo.OooOOO0(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f122015OooO0Oo = C25446OooO0Oo.OooOOO0(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f122017OooO0o0 = TimeUnit.SECONDS.toNanos(C25446OooO0Oo.OooOO0o("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, LocationRequestCompat.PASSIVE_INTERVAL));
        f122016OooO0o = C33877OooO0o0.f122048OooOo0o;
    }
}
