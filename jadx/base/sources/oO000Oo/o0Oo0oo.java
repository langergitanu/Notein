package oO000Oo;

import java.util.concurrent.atomic.AtomicReference;
import oO000Oo.o00Ooo;
import oO0OOo0o.AbstractC33080OooOooo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo.OooOOO0 f114758OooOo0o;

    public o0Oo0oo(o00Ooo.OooOOO0 oooOOO0) {
        this.f114758OooOo0o = oooOOO0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00Ooo.OooOOO0 oooOOO0 = this.f114758OooOo0o;
        if (o00Ooo.this.f114643OooOooO == null) {
            AtomicReference<AbstractC33080OooOooo> atomicReference = oooOOO0.f114704OooO00o;
            if (atomicReference.get() == o00Ooo.f114613ooOO) {
                atomicReference.set(null);
            }
            o00Ooo.this.f114649Oooo00o.OooO00o(o00Ooo.f114609OoooooO);
        }
    }
}
