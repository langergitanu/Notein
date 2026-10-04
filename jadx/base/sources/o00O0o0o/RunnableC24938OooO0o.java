package o00O0o0o;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o00O0o0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24938OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24936OooO0OO f84612OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O0.OooO00o f84613OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24941OooO0oo f84614OooOoO0;

    public RunnableC24938OooO0o(o00000O0.OooO00o oooO00o, InterfaceC24936OooO0OO interfaceC24936OooO0OO, C24941OooO0oo c24941OooO0oo) {
        this.f84613OooOo0o = oooO00o;
        this.f84612OooOo = interfaceC24936OooO0OO;
        this.f84614OooOoO0 = c24941OooO0oo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00000O0.OooO00o oooO00o = this.f84613OooOo0o;
        C24941OooO0oo c24941OooO0oo = (C24941OooO0oo) oooO00o.f81237OooO00o;
        try {
            this.f84612OooOo.OooO00o(this.f84614OooOoO0);
            if (c24941OooO0oo.OooO0oO(null)) {
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
