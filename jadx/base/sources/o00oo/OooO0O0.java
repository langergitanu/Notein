package o00oo;

import o00o0o.AbstractC25434OooO00o;
import o00o0o00.C25438OooO00o;
import o00oOoo0.C25629OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0O0 extends AbstractC25635OooO00o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C25629OooO0Oo f87493OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f87494OooOoOO;

    @Override // o00oo.InterfaceC25636OooO0Oo
    public final synchronized int OooO0o0() {
        C25629OooO0Oo c25629OooO0Oo;
        c25629OooO0Oo = this.f87493OooOoO;
        return c25629OooO0Oo == null ? 0 : c25629OooO0Oo.f87474OooO00o.OooO0o0();
    }

    @Override // o00oo.InterfaceC25636OooO0Oo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                C25629OooO0Oo c25629OooO0Oo = this.f87493OooOoO;
                if (c25629OooO0Oo == null) {
                    return;
                }
                this.f87493OooOoO = null;
                synchronized (c25629OooO0Oo) {
                    AbstractC25434OooO00o.OooOooo(c25629OooO0Oo.f87476OooO0OO);
                    c25629OooO0Oo.f87476OooO0OO = null;
                    AbstractC25434OooO00o.OooOOoo(c25629OooO0Oo.f87477OooO0Oo);
                    c25629OooO0Oo.f87477OooO0Oo = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        C25438OooO00o.OooOO0("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // o00oo.InterfaceC25636OooO0Oo
    public final synchronized int getHeight() {
        C25629OooO0Oo c25629OooO0Oo;
        c25629OooO0Oo = this.f87493OooOoO;
        return c25629OooO0Oo == null ? 0 : c25629OooO0Oo.f87474OooO00o.getHeight();
    }

    @Override // o00oo.InterfaceC25636OooO0Oo
    public final synchronized int getWidth() {
        C25629OooO0Oo c25629OooO0Oo;
        c25629OooO0Oo = this.f87493OooOoO;
        return c25629OooO0Oo == null ? 0 : c25629OooO0Oo.f87474OooO00o.getWidth();
    }

    @Override // o00oo.InterfaceC25636OooO0Oo
    public final synchronized boolean isClosed() {
        return this.f87493OooOoO == null;
    }

    @Override // o00oo.AbstractC25635OooO00o, o00oo.InterfaceC25636OooO0Oo
    public final boolean o000O() {
        return this.f87494OooOoOO;
    }
}
