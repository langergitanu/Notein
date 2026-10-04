package oO000Oo;

import oO000Oo.o0000O0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0O0 implements InterfaceC32047o0000oO {
    public final void OooO00o(int i) {
        if (OooO0O0() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public boolean markSupported() {
        return this instanceof o0000O0.OooO0O0;
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public void o0OoOo0() {
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
