package o000oo0O;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o000oo0.AbstractC24673OooOo0O;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000oo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24703OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC24673OooOo0O.C24675OooO0o0 f83745OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicInteger f83746OooO0O0 = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AtomicBoolean f83747OooO0OO = new AtomicBoolean(false);

    public C24703OooO00o(AbstractC24673OooOo0O.C24675OooO0o0 c24675OooO0o0) {
        this.f83745OooO00o = c24675OooO0o0;
    }

    public final boolean OooO00o() {
        synchronized (this) {
            if (this.f83747OooO0OO.get()) {
                return false;
            }
            this.f83746OooO0O0.incrementAndGet();
            return true;
        }
    }

    public final void OooO0O0() {
        synchronized (this) {
            this.f83746OooO0O0.decrementAndGet();
            if (this.f83746OooO0O0.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }
}
