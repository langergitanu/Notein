package o00O0o0o;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o00O0o0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24940OooO0oO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Callable f84618OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O0.OooO00o f84619OooOo0o;

    public RunnableC24940OooO0oO(o00000O0.OooO00o oooO00o, Callable callable) {
        this.f84619OooOo0o = oooO00o;
        this.f84618OooOo = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00000O0.OooO00o oooO00o = this.f84619OooOo0o;
        C24941OooO0oo c24941OooO0oo = (C24941OooO0oo) oooO00o.f81237OooO00o;
        try {
            if (c24941OooO0oo.OooO0oO(this.f84618OooOo.call())) {
            } else {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            }
        } catch (CancellationException unused) {
            if (!c24941OooO0oo.OooO0o()) {
                throw new IllegalStateException("Cannot cancel a completed task.");
            }
        } catch (Exception e) {
            oooO00o.OooO00o(e);
        }
    }
}
