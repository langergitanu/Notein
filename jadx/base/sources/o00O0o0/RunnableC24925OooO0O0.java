package o00O0o0;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: o00O0o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24925OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f84566OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f84567OooOo0o;

    public RunnableC24925OooO0O0(ConstraintTrackingWorker constraintTrackingWorker, ListenableFuture listenableFuture) {
        this.f84566OooOo = constraintTrackingWorker;
        this.f84567OooOo0o = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f84566OooOo.f66743OooOoo) {
            try {
                if (this.f84566OooOo.f66745OooOooO) {
                    ConstraintTrackingWorker constraintTrackingWorker = this.f84566OooOo;
                    constraintTrackingWorker.getClass();
                    constraintTrackingWorker.f66746OooOooo.OooO(new ListenableWorker.OooO00o.OooO0O0());
                } else {
                    this.f84566OooOo.f66746OooOooo.OooOO0O(this.f84567OooOo0o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
