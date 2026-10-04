package o0oo0oo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o0oo0oo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31395Oooo00O extends AbstractC31397Oooo0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final File f112108OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C31359OooO00o f112109OooOo0o;

    public C31395Oooo00O(File file) throws IOException {
        this.f112109OooOo0o = null;
        this.f112108OooOo = null;
        this.f112109OooOo0o = new C31359OooO00o(file);
        this.f112108OooOo = file;
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final long OooO00o() throws IOException {
        return this.f112109OooOo0o.getFilePointer();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final InputStream OooO0OO() throws IOException {
        return new FileInputStream(this.f112108OooOo);
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final long OooOOO0() {
        return this.f112108OooOo.length();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final short Oooo000() throws IOException {
        return this.f112109OooOo0o.readShort();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C31359OooO00o c31359OooO00o = this.f112109OooOo0o;
        if (c31359OooO00o != null) {
            c31359OooO00o.close();
            this.f112109OooOo0o = null;
        }
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final int ooOO() throws IOException {
        return this.f112109OooOo0o.readUnsignedShort();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final int read() throws IOException {
        return this.f112109OooOo0o.read();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final long readLong() throws IOException {
        return this.f112109OooOo0o.readLong();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final void seek(long j) throws IOException {
        this.f112109OooOo0o.seek(j);
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f112109OooOo0o.read(bArr, i, i2);
    }
}
