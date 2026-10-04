package o0ooOoOO;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o0ooOoOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31666OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C31666OooO0OO f113193OooO0O0 = new C31666OooO0OO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f113194OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f113195OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f113196OooO00o = new OooO00o();

    /* JADX INFO: renamed from: o0ooOoOO.OooO0OO$OooO00o */
    public static class OooO00o implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f113194OooO0OO = iAvailableProcessors + 1;
        f113195OooO0Oo = (iAvailableProcessors * 2) + 1;
    }
}
