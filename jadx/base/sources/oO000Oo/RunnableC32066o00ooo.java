package oO000Oo;

import com.google.common.base.Preconditions;
import com.google.firebase.firestore.remote.RunnableC22702OooOOo0;
import java.util.concurrent.Executor;
import oO000Oo.OooOo;

/* JADX INFO: renamed from: oO000Oo.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC32066o00ooo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ oO0OOo0o.OooOOO f114741OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ RunnableC22702OooOOo0 f114742OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f114743OooOoO0;

    public RunnableC32066o00ooo(o00Ooo o00ooo2, RunnableC22702OooOOo0 runnableC22702OooOOo0, oO0OOo0o.OooOOO oooOOO) {
        this.f114743OooOoO0 = o00ooo2;
        this.f114742OooOo0o = runnableC22702OooOOo0;
        this.f114741OooOo = oooOOO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00Ooo o00ooo2 = this.f114743OooOoO0;
        OooOo oooOo = o00ooo2.f114635OooOo00;
        RunnableC22702OooOOo0 runnableC22702OooOOo0 = this.f114742OooOo0o;
        Executor executor = o00ooo2.f114614OooO;
        oO0OOo0o.OooOOO oooOOO = this.f114741OooOo;
        oooOo.getClass();
        Preconditions.checkNotNull(runnableC22702OooOOo0, "callback");
        Preconditions.checkNotNull(executor, "executor");
        Preconditions.checkNotNull(oooOOO, "source");
        OooOo.OooO00o oooO00o = new OooOo.OooO00o(runnableC22702OooOOo0, executor);
        if (oooOo.f114039OooO0O0 != oooOOO) {
            executor.execute(runnableC22702OooOOo0);
        } else {
            oooOo.f114038OooO00o.add(oooO00o);
        }
    }
}
