package o00oOo0O;

/* JADX INFO: renamed from: o00oOo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC25609OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C25610OooO0O0 f87385OooOo0o;

    public RunnableC25609OooO00o(C25610OooO0O0 c25610OooO0O0) {
        this.f87385OooOo0o = c25610OooO0O0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25610OooO0O0 c25610OooO0O0 = this.f87385OooOo0o;
        c25610OooO0O0.unscheduleSelf(this);
        c25610OooO0O0.invalidateSelf();
    }
}
