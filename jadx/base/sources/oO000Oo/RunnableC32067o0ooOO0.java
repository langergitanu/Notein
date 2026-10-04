package oO000Oo;

/* JADX INFO: renamed from: oO000Oo.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC32067o0ooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f114760OooOo0o;

    public RunnableC32067o0ooOO0(o00Ooo o00ooo2) {
        this.f114760OooOo0o = o00ooo2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00Ooo o00ooo2 = this.f114760OooOo0o;
        if (o00ooo2.f114650Oooo0O0) {
            return;
        }
        o00ooo2.f114650Oooo0O0 = true;
        o00Ooo.OooOOOO(o00ooo2);
    }
}
