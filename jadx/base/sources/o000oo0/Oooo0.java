package o000oo0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements Executor {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayDeque<Runnable> f83647OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Executor f83648OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Object f83649OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Runnable f83650OooOoO0;

    public Oooo0(Executor executor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        this.f83648OooOo0o = executor;
        this.f83647OooOo = new ArrayDeque<>();
        this.f83649OooOoO = new Object();
    }

    public final void OooO00o() {
        synchronized (this.f83649OooOoO) {
            try {
                Runnable runnablePoll = this.f83647OooOo.poll();
                Runnable runnable = runnablePoll;
                this.f83650OooOoO0 = runnable;
                if (runnablePoll != null) {
                    this.f83648OooOo0o.execute(runnable);
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable command) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(command, "command");
        synchronized (this.f83649OooOoO) {
            try {
                this.f83647OooOo.offer(new Runnable() { // from class: o000oo0.Oooo00o
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable = command;
                        Oooo0 oooo0 = this;
                        try {
                            runnable.run();
                        } finally {
                            oooo0.OooO00o();
                        }
                    }
                });
                if (this.f83650OooOoO0 == null) {
                    OooO00o();
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
