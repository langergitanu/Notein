package o0O000oo;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final LinkedBlockingQueue f88137OooO0O0 = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f88138OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f88139OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static OooO0O0 f88140OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ThreadPoolExecutor f88141OooO00o;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f88138OooO0OO = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        f88139OooO0Oo = (iAvailableProcessors * 2) + 1;
    }

    public OooO0O0() {
        new Handler(Looper.getMainLooper());
        this.f88141OooO00o = new ThreadPoolExecutor(f88138OooO0OO, f88139OooO0Oo, 30L, TimeUnit.SECONDS, f88137OooO0O0);
    }
}
