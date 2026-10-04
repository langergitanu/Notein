package oO0OOo0o;

import oO000o00.C32098OooO0oo;
import oO0OOo0o.ExecutorC33121o00ooo;

/* JADX INFO: loaded from: classes10.dex */
public final class oo000o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C32098OooO0oo.RunnableC32099OooO0Oo f119777OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ExecutorC33121o00ooo.OooO0O0 f119778OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ExecutorC33121o00ooo f119779OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ long f119780OooOoO0;

    public oo000o(ExecutorC33121o00ooo executorC33121o00ooo, ExecutorC33121o00ooo.OooO0O0 oooO0O0, C32098OooO0oo.RunnableC32099OooO0Oo runnableC32099OooO0Oo, long j) {
        this.f119779OooOoO = executorC33121o00ooo;
        this.f119778OooOo0o = oooO0O0;
        this.f119777OooOo = runnableC32099OooO0Oo;
        this.f119780OooOoO0 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f119779OooOoO.execute(this.f119778OooOo0o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f119777OooOo.toString());
        sb.append("(scheduled in SynchronizationContext with delay of ");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f119780OooOoO0, ")", sb);
    }
}
