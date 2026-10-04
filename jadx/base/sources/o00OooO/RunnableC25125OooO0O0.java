package o00OooO;

import o00OooO.C25126OooO0OO;

/* JADX INFO: renamed from: o00OooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC25125OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C25126OooO0OO f85411OooOo0o;

    public RunnableC25125OooO0O0(C25126OooO0OO c25126OooO0OO) {
        this.f85411OooOo0o = c25126OooO0OO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25126OooO0OO c25126OooO0OO = this.f85411OooOo0o;
        c25126OooO0OO.getClass();
        while (true) {
            try {
                c25126OooO0OO.OooO0O0((C25126OooO0OO.OooO00o) c25126OooO0OO.f85414OooO0OO.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
