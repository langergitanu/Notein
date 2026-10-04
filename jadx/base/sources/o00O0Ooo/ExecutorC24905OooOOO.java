package o00O0Ooo;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: o00O0Ooo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC24905OooOOO implements Executor {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ExecutorService f84516OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public volatile Runnable f84518OooOoO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayDeque<OooO00o> f84517OooOo0o = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Object f84519OooOoO0 = new Object();

    /* JADX INFO: renamed from: o00O0Ooo.OooOOO$OooO00o */
    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Runnable f84520OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ExecutorC24905OooOOO f84521OooOo0o;

        public OooO00o(ExecutorC24905OooOOO executorC24905OooOOO, Runnable runnable) {
            this.f84521OooOo0o = executorC24905OooOOO;
            this.f84520OooOo = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ExecutorC24905OooOOO executorC24905OooOOO = this.f84521OooOo0o;
            try {
                this.f84520OooOo.run();
            } finally {
                executorC24905OooOOO.OooO00o();
            }
        }
    }

    public ExecutorC24905OooOOO(ExecutorService executorService) {
        this.f84516OooOo = executorService;
    }

    public final void OooO00o() {
        synchronized (this.f84519OooOoO0) {
            try {
                OooO00o oooO00oPoll = this.f84517OooOo0o.poll();
                this.f84518OooOoO = oooO00oPoll;
                if (oooO00oPoll != null) {
                    this.f84516OooOo.execute(this.f84518OooOoO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f84519OooOoO0) {
            try {
                this.f84517OooOo0o.add(new OooO00o(this, runnable));
                if (this.f84518OooOoO == null) {
                    OooO00o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
