package oO00oO0;

import java.util.concurrent.atomic.AtomicReference;
import oO00oO00.InterfaceC32401OooO00o;
import oO00oOo0.C32430OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0OO.C33669o000oOoO;

/* JADX INFO: renamed from: oO00oO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32396OooO00o extends AtomicReference<InterfaceC32401OooO00o> implements InterfaceC32925OooO0O0 {
    private static final long serialVersionUID = 5718521705281392066L;

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        InterfaceC32401OooO00o andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Throwable th) {
            C33669o000oOoO.OooO0O0(th);
            C32430OooO00o.OooO00o(th);
        }
    }
}
