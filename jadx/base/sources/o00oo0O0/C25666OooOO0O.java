package o00oo0O0;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;
import o00o0Ooo.InterfaceC25423OooO;

/* JADX INFO: renamed from: o00oo0O0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25666OooOO0O implements InterfaceC25423OooO<C25677OooOo00> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f87604OooO0O0 = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ActivityManager f87605OooO00o;

    public C25666OooOO0O(ActivityManager activityManager) {
        this.f87605OooO00o = activityManager;
    }

    @Override // o00o0Ooo.InterfaceC25423OooO
    public final C25677OooOo00 get() {
        int iMin = Math.min(this.f87605OooO00o.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return new C25677OooOo00(iMin < 33554432 ? 4194304 : iMin < 67108864 ? 6291456 : iMin / 4, 256, Integer.MAX_VALUE, Integer.MAX_VALUE, f87604OooO0O0);
    }
}
