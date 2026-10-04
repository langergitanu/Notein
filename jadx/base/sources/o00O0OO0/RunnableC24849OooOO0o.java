package o00O0OO0;

import o00O0o00.C24932OooO0OO;

/* JADX INFO: renamed from: o00O0OO0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24849OooOO0o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24932OooO0OO f84368OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24932OooO0OO f84369OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOO f84370OooOoO0;

    public RunnableC24849OooOO0o(OooOOO oooOOO, C24932OooO0OO c24932OooO0OO, C24932OooO0OO c24932OooO0OO2) {
        this.f84370OooOoO0 = oooOOO;
        this.f84369OooOo0o = c24932OooO0OO;
        this.f84368OooOo = c24932OooO0OO2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C24932OooO0OO c24932OooO0OO = this.f84368OooOo;
        OooOOO oooOOO = this.f84370OooOoO0;
        try {
            this.f84369OooOo0o.get();
            o00O0O0o.OooOO0O.OooO0OO().OooO00o(OooOOO.f84371Oooo0oo, "Starting work for " + oooOOO.f84374OooOoO.f84459OooO0OO, new Throwable[0]);
            C24932OooO0OO c24932OooO0OOOooO0o0 = oooOOO.f84376OooOoOO.OooO0o0();
            oooOOO.f84387Oooo0o = c24932OooO0OOOooO0o0;
            c24932OooO0OO.OooOO0O(c24932OooO0OOOooO0o0);
        } catch (Throwable th) {
            c24932OooO0OO.OooOO0(th);
        }
    }
}
