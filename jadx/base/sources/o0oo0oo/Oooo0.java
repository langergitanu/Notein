package o0oo0oo;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 extends AbstractC31397Oooo0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31395Oooo00O f112103OooOo0o;

    public Oooo0(C31395Oooo00O c31395Oooo00O) {
        this.f112103OooOo0o = c31395Oooo00O;
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final long OooO00o() throws IOException {
        return this.f112103OooOo0o.f112109OooOo0o.getFilePointer();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final InputStream OooO0OO() throws IOException {
        return this.f112103OooOo0o.OooO0OO();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final long OooOOO0() {
        return this.f112103OooOo0o.f112108OooOo.length();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final short Oooo000() throws IOException {
        return this.f112103OooOo0o.f112109OooOo0o.readShort();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final int ooOO() throws IOException {
        return this.f112103OooOo0o.f112109OooOo0o.readUnsignedShort();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final int read() throws IOException {
        return this.f112103OooOo0o.f112109OooOo0o.read();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final long readLong() throws IOException {
        return this.f112103OooOo0o.f112109OooOo0o.readLong();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final void seek(long j) throws IOException {
        this.f112103OooOo0o.seek(j);
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f112103OooOo0o.f112109OooOo0o.read(bArr, i, i2);
    }
}
