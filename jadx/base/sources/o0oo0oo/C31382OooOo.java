package o0oo0oo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o0oo0oo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31382OooOo extends AbstractC31397Oooo0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f112067OooOo = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f112068OooOo0o;

    public C31382OooOo(FilterInputStream filterInputStream) throws IOException {
        this.f112068OooOo0o = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(filterInputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int i = filterInputStream.read(bArr);
                if (i == -1) {
                    this.f112068OooOo0o = byteArrayOutputStream.toByteArray();
                    filterInputStream.close();
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            filterInputStream.close();
            throw th;
        }
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final long OooO00o() throws IOException {
        return this.f112067OooOo;
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final InputStream OooO0OO() throws IOException {
        return new ByteArrayInputStream(this.f112068OooOo0o);
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final long OooOOO0() {
        return this.f112068OooOo0o.length;
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final short Oooo000() throws IOException {
        int i = read();
        int i2 = read();
        if ((i | i2) >= 0) {
            return (short) ((i << 8) + i2);
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    public final int o0Oo0oo() throws IOException {
        int i = read();
        int i2 = read();
        int i3 = read();
        int i4 = read();
        if ((i | i2 | i3 | i4) >= 0) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new EOFException();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final int ooOO() throws IOException {
        int i = read();
        int i2 = read();
        if ((i | i2) >= 0) {
            return (i << 8) + i2;
        }
        throw new EOFException();
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final int read() throws IOException {
        int i = this.f112067OooOo;
        byte[] bArr = this.f112068OooOo0o;
        if (i >= bArr.length) {
            return -1;
        }
        byte b = bArr[i];
        this.f112067OooOo = i + 1;
        return (b + 256) % 256;
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final long readLong() throws IOException {
        return (((long) o0Oo0oo()) << 32) + (((long) o0Oo0oo()) & 4294967295L);
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final void seek(long j) throws IOException {
        if (j < 0 || j > 2147483647L) {
            throw new IOException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "Illegal seek position: "));
        }
        this.f112067OooOo = (int) j;
    }

    @Override // o0oo0oo.AbstractC31397Oooo0O0
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f112067OooOo;
        byte[] bArr2 = this.f112068OooOo0o;
        if (i3 >= bArr2.length) {
            return -1;
        }
        int iMin = Math.min(i2, bArr2.length - i3);
        System.arraycopy(bArr2, this.f112067OooOo, bArr, i, iMin);
        this.f112067OooOo += iMin;
        return iMin;
    }
}
