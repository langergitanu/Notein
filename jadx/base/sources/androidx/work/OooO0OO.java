package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Worker f66688OooOo0o;

    public OooO0OO(Worker worker) {
        this.f66688OooOo0o = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f66688OooOo0o;
        try {
            worker.f66690OooOoo0.OooO(worker.OooO0oo());
        } catch (Throwable th) {
            worker.f66690OooOoo0.OooOO0(th);
        }
    }
}
