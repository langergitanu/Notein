package o0O00OOO;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0O00Oo.C25836OooO00o;

/* JADX INFO: renamed from: o0O00OOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C25835OooO0oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C25835OooO0oo f88151OooO0Oo = new C25835OooO0oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f88152OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ThreadPoolExecutor f88153OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25836OooO00o.ExecutorC19721OooO00o f88154OooO0OO;

    /* JADX INFO: renamed from: o0O00OOO.OooO0oo$OooO00o */
    public static final class OooO00o implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public C25835OooO0oo() {
        C25836OooO00o c25836OooO00o = C25836OooO00o.f88156OooO0O0;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C25836OooO00o.f88157OooO0OO, C25836OooO00o.f88158OooO0Oo, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f88153OooO0O0 = threadPoolExecutor;
        this.f88152OooO00o = new OooO00o();
        this.f88154OooO0OO = C25836OooO00o.f88156OooO0O0.f88159OooO00o;
    }
}
