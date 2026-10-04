package o00oOo00;

import OooOoOO.C20519OooO0Oo;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: o00oOo00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25605OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicInteger f87351OooO00o = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final AtomicInteger f87352OooO0O0 = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AtomicInteger f87353OooO0OO = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ConcurrentHashMap<OooO, Integer> f87354OooO0Oo = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final RunnableC25603OooO0OO f87355OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C32447OooOOo f87356OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final RunnableC25604OooO0Oo f87357OooO0oO;

    static {
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C25602OooO0O0(0));
        f87356OooO0o0 = c32447OooOOoOooO0OO;
        RunnableC25603OooO0OO runnableC25603OooO0OO = new RunnableC25603OooO0OO();
        f87355OooO0o = runnableC25603OooO0OO;
        RunnableC25604OooO0Oo runnableC25604OooO0Oo = new RunnableC25604OooO0Oo();
        f87357OooO0oO = runnableC25604OooO0Oo;
        ((Handler) c32447OooOOoOooO0OO.getValue()).post(runnableC25603OooO0OO);
        ((Handler) c32447OooOOoOooO0OO.getValue()).post(runnableC25604OooO0Oo);
    }

    public static void OooO00o(OooO oooO, int i) {
        float fOooO0OO = oooO.OooO0OO() * 0.5f;
        if (fOooO0OO < 1.0f) {
            fOooO0OO = 1.0f;
        }
        int iOooO0o = oO0O00oo.OooOO0.OooO0o(oooO.OooO0O0() + i, (int) fOooO0OO, oooO.OooO0OO());
        if (iOooO0o != oooO.OooO0O0()) {
            oooO.OooO00o(iOooO0o);
        }
    }
}
