package oOo00oO0;

import java.util.concurrent.atomic.AtomicReference;
import oO00oOo0.C32430OooO00o;
import oOo00o0o.C34554OooO00o;
import oOo00oO0.C34561OooO0O0;

/* JADX INFO: renamed from: oOo00oO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34560OooO00o extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public final Throwable OooO00o() {
        C34561OooO0O0.OooO00o oooO00o = C34561OooO0O0.f123804OooO00o;
        Throwable th = get();
        C34561OooO0O0.OooO00o oooO00o2 = C34561OooO0O0.f123804OooO00o;
        return th != oooO00o2 ? getAndSet(oooO00o2) : th;
    }

    public final boolean OooO0O0(Throwable th) {
        C34561OooO0O0.OooO00o oooO00o = C34561OooO0O0.f123804OooO00o;
        while (true) {
            Throwable th2 = get();
            if (th2 == C34561OooO0O0.f123804OooO00o) {
                C32430OooO00o.OooO00o(th);
                return false;
            }
            Throwable c34554OooO00o = th2 == null ? th : new C34554OooO00o(th2, th);
            while (!compareAndSet(th2, c34554OooO00o)) {
                if (get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public final void OooO0OO(oOO00OOO.OooO0O0<?> oooO0O0) {
        Throwable thOooO00o = OooO00o();
        if (thOooO00o == null) {
            oooO0O0.onComplete();
        } else if (thOooO00o != C34561OooO0O0.f123804OooO00o) {
            oooO0O0.onError(thOooO00o);
        }
    }
}
