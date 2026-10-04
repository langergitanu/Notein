package oO0o0o0o;

import java.util.concurrent.Executor;
import o00o0o0o.C25446OooO0Oo;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.AbstractC33659Oooooo;
import oO0o0Ooo.C33841OooOo0O;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0o0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ExecutorC33873OooO0O0 extends AbstractC33659Oooooo implements Executor {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final AbstractC33630OooOooO f122044OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final ExecutorC33873OooO0O0 f122045OooOoO0 = new ExecutorC33873OooO0O0();

    static {
        C33880OooOO0 c33880OooOO0 = C33880OooOO0.f122052OooOoO0;
        int i = C33841OooOo0O.f121953OooO00o;
        if (64 >= i) {
            i = 64;
        }
        f122044OooOoO = c33880OooOO0.o000OOo0(C25446OooO0Oo.OooOOO0(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o0OoO0o(oOo0000O.OooO.f123416OooOo0o, runnable);
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o000OO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        f122044OooOoO.o000OO0o(interfaceC34415OooO0oo, runnable);
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final AbstractC33630OooOooO o000OOo0(int i) {
        return C33880OooOO0.f122052OooOoO0.o000OOo0(i);
    }

    @Override // oO0o0OO.AbstractC33659Oooooo
    public final Executor o000OOoO() {
        return this;
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o0OoO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        f122044OooOoO.o0OoO0o(interfaceC34415OooO0oo, runnable);
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final String toString() {
        return "Dispatchers.IO";
    }
}
