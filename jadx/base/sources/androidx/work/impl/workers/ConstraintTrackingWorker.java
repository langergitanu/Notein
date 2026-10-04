package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import o00O0O0o.OooOO0O;
import o00O0OOo.InterfaceC24854OooO0OO;
import o00O0o0.RunnableC24924OooO00o;
import o00O0o00.C24932OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC24854OooO0OO {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final String f66742Oooo00O = OooOO0O.OooO0o0("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Object f66743OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final WorkerParameters f66744OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile boolean f66745OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C24932OooO0OO<ListenableWorker.OooO00o> f66746OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ListenableWorker f66747Oooo000;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f66744OooOoo0 = workerParameters;
        this.f66743OooOoo = new Object();
        this.f66745OooOooO = false;
        this.f66746OooOooo = new C24932OooO0OO<>();
    }

    @Override // androidx.work.ListenableWorker
    public final boolean OooO0O0() {
        ListenableWorker listenableWorker = this.f66747Oooo000;
        return listenableWorker != null && listenableWorker.OooO0O0();
    }

    @Override // androidx.work.ListenableWorker
    public final void OooO0OO() {
        ListenableWorker listenableWorker = this.f66747Oooo000;
        if (listenableWorker == null || listenableWorker.f66671OooOoO0) {
            return;
        }
        this.f66747Oooo000.OooO0oO();
    }

    @Override // o00O0OOo.InterfaceC24854OooO0OO
    public final void OooO0Oo(ArrayList arrayList) {
        OooOO0O.OooO0OO().OooO00o(f66742Oooo00O, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f66743OooOoo) {
            this.f66745OooOooO = true;
        }
    }

    @Override // o00O0OOo.InterfaceC24854OooO0OO
    public final void OooO0o(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public final C24932OooO0OO OooO0o0() {
        this.f66668OooOo.f66693OooO0OO.execute(new RunnableC24924OooO00o(this));
        return this.f66746OooOooo;
    }
}
