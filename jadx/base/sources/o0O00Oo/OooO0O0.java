package o0O00Oo;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f88160OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C25840OooO0oo f88161OooOo0o;

    public OooO0O0(OooO0OO oooO0OO, C25840OooO0oo c25840OooO0oo) {
        this.f88160OooOo = oooO0OO;
        this.f88161OooOo0o = c25840OooO0oo;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f88160OooOo.f88164OooO0OO) {
            this.f88160OooOo.f88162OooO00o.onComplete(this.f88161OooOo0o);
        }
    }
}
