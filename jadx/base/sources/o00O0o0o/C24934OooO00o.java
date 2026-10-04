package o00O0o0o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o00O0o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24934OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C24934OooO00o f84603OooO0O0 = new C24934OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f84604OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f84605OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorC19659OooO00o f84606OooO00o = new ExecutorC19659OooO00o();

    /* JADX INFO: renamed from: o00O0o0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class ExecutorC19659OooO00o implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f84604OooO0OO = iAvailableProcessors + 1;
        f84605OooO0Oo = (iAvailableProcessors * 2) + 1;
    }
}
