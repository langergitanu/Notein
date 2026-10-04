package o0O00Oo;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o0O00Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C25836OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C25836OooO00o f88156OooO0O0 = new C25836OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f88157OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f88158OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorC19721OooO00o f88159OooO00o = new ExecutorC19721OooO00o();

    /* JADX INFO: renamed from: o0O00Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class ExecutorC19721OooO00o implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f88157OooO0OO = iAvailableProcessors + 1;
        f88158OooO0Oo = (iAvailableProcessors * 2) + 1;
    }
}
