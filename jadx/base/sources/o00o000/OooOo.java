package o00o000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import o00OooOO.C25159OooO0oO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOo extends FilterInputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f85912OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile byte[] f85913OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f85914OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f85915OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f85916OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C25159OooO0oO f85917OooOoo0;

    public static class OooO00o extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;
    }

    public OooOo(InputStream inputStream, C25159OooO0oO c25159OooO0oO) {
        super(inputStream);
        this.f85914OooOoO = -1;
        this.f85917OooOoo0 = c25159OooO0oO;
        this.f85913OooOo0o = (byte[]) c25159OooO0oO.OooO0Oo(byte[].class, 65536);
    }

    public static void OooO0OO() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int OooO00o(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f85914OooOoO;
        if (i != -1) {
            int i2 = this.f85916OooOoOO - i;
            int i3 = this.f85915OooOoO0;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f85912OooOo == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f85917OooOoo0.OooO0Oo(byte[].class, i3);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f85913OooOo0o = bArr2;
                    this.f85917OooOoo0.OooO0oo(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f85916OooOoOO - this.f85914OooOoO;
                this.f85916OooOoOO = i4;
                this.f85914OooOoO = 0;
                this.f85912OooOo = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f85916OooOoOO;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f85912OooOo = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f85914OooOoO = -1;
            this.f85916OooOoOO = 0;
            this.f85912OooOo = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f85913OooOo0o == null || inputStream == null) {
            OooO0OO();
            throw null;
        }
        return (this.f85912OooOo - this.f85916OooOoOO) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f85913OooOo0o != null) {
            this.f85917OooOoo0.OooO0oo(this.f85913OooOo0o);
            this.f85913OooOo0o = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f85915OooOoO0 = Math.max(this.f85915OooOoO0, i);
        this.f85914OooOoO = this.f85916OooOoOO;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = this.f85913OooOo0o;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            OooO0OO();
            throw null;
        }
        if (this.f85916OooOoOO >= this.f85912OooOo && OooO00o(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f85913OooOo0o && (bArr = this.f85913OooOo0o) == null) {
            OooO0OO();
            throw null;
        }
        int i = this.f85912OooOo;
        int i2 = this.f85916OooOoOO;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f85916OooOoOO = i2 + 1;
        return bArr[i2] & 255;
    }

    public final synchronized void release() {
        if (this.f85913OooOo0o != null) {
            this.f85917OooOoo0.OooO0oo(this.f85913OooOo0o);
            this.f85913OooOo0o = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.f85913OooOo0o == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f85914OooOoO;
        if (-1 == i) {
            throw new OooO00o("Mark has been invalidated, pos: " + this.f85916OooOoOO + " markLimit: " + this.f85915OooOoO0);
        }
        this.f85916OooOoOO = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f85913OooOo0o;
        if (bArr == null) {
            OooO0OO();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            OooO0OO();
            throw null;
        }
        int i = this.f85912OooOo;
        int i2 = this.f85916OooOoOO;
        if (i - i2 >= j) {
            this.f85916OooOoOO = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f85916OooOoOO = i;
        if (this.f85914OooOoO == -1 || j > this.f85915OooOoO0) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f85914OooOoO = -1;
            }
            return j2 + jSkip;
        }
        if (OooO00o(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f85912OooOo;
        int i4 = this.f85916OooOoOO;
        if (i3 - i4 >= j - j2) {
            this.f85916OooOoOO = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f85916OooOoOO = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f85913OooOo0o;
        if (bArr2 == null) {
            OooO0OO();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f85916OooOoOO;
            int i6 = this.f85912OooOo;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f85916OooOoOO += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f85914OooOoO == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (OooO00o(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f85913OooOo0o && (bArr2 = this.f85913OooOo0o) == null) {
                        OooO0OO();
                        throw null;
                    }
                    int i8 = this.f85912OooOo;
                    int i9 = this.f85916OooOoOO;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f85916OooOoOO += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            OooO0OO();
            throw null;
        }
    }
}
