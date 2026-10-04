package o0O00Oo;

/* JADX INFO: renamed from: o0O00Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC25837OooO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C25838OooO0o0 f88165OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C25840OooO0oo f88166OooOo0o;

    public RunnableC25837OooO0Oo(C25838OooO0o0 c25838OooO0o0, C25840OooO0oo c25840OooO0oo) {
        this.f88165OooOo = c25838OooO0o0;
        this.f88166OooOo0o = c25840OooO0oo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f88165OooOo.f88171OooO0OO) {
            this.f88165OooOo.f88169OooO00o.onFailure(this.f88166OooOo0o.OooO0o());
        }
    }
}
