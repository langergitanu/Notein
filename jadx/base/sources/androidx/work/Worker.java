package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import o00O0o00.C24932OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C24932OooO0OO<ListenableWorker.OooO00o> f66690OooOoo0;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final C24932OooO0OO OooO0o0() {
        this.f66690OooOoo0 = new C24932OooO0OO<>();
        this.f66668OooOo.f66693OooO0OO.execute(new OooO0OO(this));
        return this.f66690OooOoo0;
    }

    public abstract ListenableWorker.OooO00o.OooO0OO OooO0oo();
}
