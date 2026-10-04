package o00Oo0oO;

import android.os.ConditionVariable;
import o00OOOoO.C25016OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f85073OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C25016OooO00o.RunnableC19667OooO00o f85074OooOo0o;

    public OooOOO(C25016OooO00o.RunnableC19667OooO00o runnableC19667OooO00o, ConditionVariable conditionVariable) {
        this.f85074OooOo0o = runnableC19667OooO00o;
        this.f85073OooOo = conditionVariable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable = this.f85073OooOo;
        try {
            this.f85074OooOo0o.run();
        } finally {
            conditionVariable.open();
        }
    }
}
