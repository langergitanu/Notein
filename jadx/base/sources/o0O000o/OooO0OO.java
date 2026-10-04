package o0O000o;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0ooOoOO.C31666OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0OO f88130OooO0OO = new OooO0OO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ThreadPoolExecutor f88131OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31666OooO0OO.OooO00o f88132OooO0O0;

    public OooO0OO() {
        C31666OooO0OO c31666OooO0OO = C31666OooO0OO.f113193OooO0O0;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C31666OooO0OO.f113194OooO0OO, C31666OooO0OO.f113195OooO0Oo, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f88131OooO00o = threadPoolExecutor;
        this.f88132OooO0O0 = C31666OooO0OO.f113193OooO0O0.f113196OooO00o;
    }
}
