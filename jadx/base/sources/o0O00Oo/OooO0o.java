package o0O00Oo;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C25839OooO0oO f88167OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C25840OooO0oo f88168OooOo0o;

    public OooO0o(C25839OooO0oO c25839OooO0oO, C25840OooO0oo c25840OooO0oo) {
        this.f88167OooOo = c25839OooO0oO;
        this.f88168OooOo0o = c25840OooO0oo;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f88167OooOo.f88174OooO0OO) {
            this.f88167OooOo.f88172OooO00o.onSuccess((TResult) this.f88168OooOo0o.OooO0oO());
        }
    }
}
