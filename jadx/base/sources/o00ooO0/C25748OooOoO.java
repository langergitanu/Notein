package o00ooO0;

import java.nio.ByteBuffer;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00o0o0o.InterfaceC25449OooO0oO;

/* JADX INFO: renamed from: o00ooO0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25748OooOoO implements InterfaceC25449OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC25434OooO00o<InterfaceC25747OooOo0o> f87873OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f87874OooOo0o;

    public C25748OooOoO(C25435OooO0O0 c25435OooO0O0, int i) {
        c25435OooO0O0.getClass();
        if (!(i >= 0 && i <= ((InterfaceC25747OooOo0o) c25435OooO0O0.Oooo000()).getSize())) {
            throw new IllegalArgumentException();
        }
        this.f87873OooOo = c25435OooO0O0.clone();
        this.f87874OooOo0o = i;
    }

    @Override // o00o0o0o.InterfaceC25449OooO0oO
    public final synchronized long OooO() throws UnsupportedOperationException {
        OooO00o();
        this.f87873OooOo.getClass();
        return this.f87873OooOo.Oooo000().OooO();
    }

    public final synchronized void OooO00o() {
        if (isClosed()) {
            throw new InterfaceC25449OooO0oO.OooO00o("Invalid bytebuf. Already closed");
        }
    }

    @Override // o00o0o0o.InterfaceC25449OooO0oO
    public final synchronized int OooO0Oo(int i, int i2, int i3, byte[] bArr) {
        OooO00o();
        if (!(i + i3 <= this.f87874OooOo0o)) {
            throw new IllegalArgumentException();
        }
        this.f87873OooOo.getClass();
        return this.f87873OooOo.Oooo000().OooO0Oo(i, i2, i3, bArr);
    }

    @Override // o00o0o0o.InterfaceC25449OooO0oO
    public final synchronized ByteBuffer OooOO0o() {
        this.f87873OooOo.getClass();
        return this.f87873OooOo.Oooo000().OooOO0o();
    }

    @Override // o00o0o0o.InterfaceC25449OooO0oO
    public final synchronized byte OooOOO(int i) {
        OooO00o();
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i < this.f87874OooOo0o)) {
            throw new IllegalArgumentException();
        }
        this.f87873OooOo.getClass();
        return this.f87873OooOo.Oooo000().OooOOO(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        AbstractC25434OooO00o.OooOooo(this.f87873OooOo);
        this.f87873OooOo = null;
    }

    @Override // o00o0o0o.InterfaceC25449OooO0oO
    public final synchronized boolean isClosed() {
        return !AbstractC25434OooO00o.ooOO(this.f87873OooOo);
    }

    @Override // o00o0o0o.InterfaceC25449OooO0oO
    public final synchronized int size() {
        OooO00o();
        return this.f87874OooOo0o;
    }
}
