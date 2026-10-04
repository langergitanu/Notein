package oO0o0OO;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: oO0o0OO.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ExecutorC33648OoooOOO implements Executor {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC33630OooOooO f121327OooOo0o;

    public ExecutorC33648OoooOOO(AbstractC33630OooOooO abstractC33630OooOooO) {
        this.f121327OooOo0o = abstractC33630OooOooO;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        AbstractC33630OooOooO abstractC33630OooOooO = this.f121327OooOo0o;
        if (abstractC33630OooOooO.o000OOO(oooO)) {
            abstractC33630OooOooO.o0OoO0o(oooO, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f121327OooOo0o.toString();
    }
}
