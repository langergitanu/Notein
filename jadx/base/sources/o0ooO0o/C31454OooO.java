package o0ooO0o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: o0ooO0o.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31454OooO implements InterfaceC31461OooO0oO, Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C31462OooO0oo f112483OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f112484OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f112485OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f112487OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f112488OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public byte[] f112489OooOoo0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f112486OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f112490OooOooO = false;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int[] f112491OooOooo = new int[16];

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f112492Oooo000 = 0;

    public C31454OooO(C31462OooO0oo c31462OooO0oo) throws IOException {
        c31462OooO0oo.OooO00o();
        this.f112483OooOo = c31462OooO0oo;
        this.f112484OooOo0o = 4096;
        OooO00o();
    }

    public final void OooO00o() throws IOException {
        int iNextSetBit;
        int i = this.f112492Oooo000;
        int i2 = i + 1;
        int[] iArr = this.f112491OooOooo;
        if (i2 >= iArr.length) {
            int length = iArr.length * 2;
            if (length < iArr.length) {
                if (iArr.length == Integer.MAX_VALUE) {
                    throw new IOException("Maximum buffer size reached.");
                }
                length = Integer.MAX_VALUE;
            }
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.f112491OooOooo = iArr2;
        }
        C31462OooO0oo c31462OooO0oo = this.f112483OooOo;
        synchronized (c31462OooO0oo.f112526OooOoo0) {
            try {
                iNextSetBit = c31462OooO0oo.f112526OooOoo0.nextSetBit(0);
                if (iNextSetBit < 0) {
                    c31462OooO0oo.OooO0OO();
                    iNextSetBit = c31462OooO0oo.f112526OooOoo0.nextSetBit(0);
                    if (iNextSetBit < 0) {
                        throw new IOException("Maximum allowed scratch file memory exceeded.");
                    }
                }
                c31462OooO0oo.f112526OooOoo0.clear(iNextSetBit);
                if (iNextSetBit >= c31462OooO0oo.f112524OooOoOO) {
                    c31462OooO0oo.f112524OooOoOO = iNextSetBit + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = this.f112491OooOooo;
        int i3 = this.f112492Oooo000;
        iArr3[i3] = iNextSetBit;
        this.f112485OooOoO = i3;
        int i4 = this.f112484OooOo0o;
        this.f112487OooOoOO = ((long) i3) * ((long) i4);
        this.f112492Oooo000 = i3 + 1;
        this.f112489OooOoo0 = new byte[i4];
        this.f112488OooOoo = 0;
    }

    public final void OooO0OO() throws IOException {
        C31462OooO0oo c31462OooO0oo = this.f112483OooOo;
        if (c31462OooO0oo == null) {
            throw new IOException("Buffer already closed");
        }
        c31462OooO0oo.OooO00o();
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final byte[] OooO0oo(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        do {
            int i3 = read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new EOFException();
            }
            i2 += i3;
        } while (i2 < i);
        return bArr;
    }

    public final boolean OooOOO0(boolean z) throws IOException {
        int i = this.f112488OooOoo;
        int i2 = this.f112484OooOo0o;
        if (i < i2) {
            return true;
        }
        if (this.f112490OooOooO) {
            this.f112483OooOo.OooOOoo(this.f112491OooOooo[this.f112485OooOoO], this.f112489OooOoo0);
            this.f112490OooOooO = false;
        }
        int i3 = this.f112485OooOoO + 1;
        if (i3 >= this.f112492Oooo000) {
            if (!z) {
                return false;
            }
            OooO00o();
            return true;
        }
        C31462OooO0oo c31462OooO0oo = this.f112483OooOo;
        int[] iArr = this.f112491OooOooo;
        this.f112485OooOoO = i3;
        this.f112489OooOoo0 = c31462OooO0oo.OooOOo0(iArr[i3]);
        this.f112487OooOoOO = ((long) this.f112485OooOoO) * ((long) i2);
        this.f112488OooOoo = 0;
        return true;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final boolean OooOOOo() throws IOException {
        OooO0OO();
        return this.f112487OooOoOO + ((long) this.f112488OooOoo) >= this.f112486OooOoO0;
    }

    public final void OooOOo0(int i) throws IOException {
        OooO0OO();
        OooOOO0(true);
        byte[] bArr = this.f112489OooOoo0;
        int i2 = this.f112488OooOoo;
        int i3 = i2 + 1;
        this.f112488OooOoo = i3;
        bArr[i2] = (byte) i;
        this.f112490OooOooO = true;
        long j = this.f112487OooOoOO;
        if (((long) i3) + j > this.f112486OooOoO0) {
            this.f112486OooOoO0 = j + ((long) i3);
        }
    }

    public final void OooOOoo(byte[] bArr) throws IOException {
        OooOooo(bArr, 0, bArr.length);
    }

    public final void OooOooo(byte[] bArr, int i, int i2) throws IOException {
        OooO0OO();
        while (i2 > 0) {
            OooOOO0(true);
            int iMin = Math.min(i2, this.f112484OooOo0o - this.f112488OooOoo);
            System.arraycopy(bArr, i, this.f112489OooOoo0, this.f112488OooOoo, iMin);
            this.f112488OooOoo += iMin;
            this.f112490OooOooO = true;
            i += iMin;
            i2 -= iMin;
        }
        long j = this.f112487OooOoOO + ((long) this.f112488OooOoo);
        if (j > this.f112486OooOoO0) {
            this.f112486OooOoO0 = j;
        }
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final void Ooooo00(int i) throws IOException {
        seek((this.f112487OooOoOO + ((long) this.f112488OooOoo)) - ((long) i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C31462OooO0oo c31462OooO0oo = this.f112483OooOo;
        if (c31462OooO0oo != null) {
            int[] iArr = this.f112491OooOooo;
            int i = this.f112492Oooo000;
            synchronized (c31462OooO0oo.f112526OooOoo0) {
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        int i3 = iArr[i2];
                        if (i3 >= 0 && i3 < c31462OooO0oo.f112524OooOoOO && !c31462OooO0oo.f112526OooOoo0.get(i3)) {
                            c31462OooO0oo.f112526OooOoo0.set(i3);
                            if (i3 < c31462OooO0oo.f112527OooOooO) {
                                c31462OooO0oo.f112525OooOoo[i3] = null;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f112483OooOo = null;
            this.f112491OooOooo = null;
            this.f112489OooOoo0 = null;
            this.f112487OooOoOO = 0L;
            this.f112485OooOoO = -1;
            this.f112488OooOoo = 0;
            this.f112486OooOoO0 = 0L;
        }
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final long getPosition() throws IOException {
        OooO0OO();
        return this.f112487OooOoOO + ((long) this.f112488OooOoo);
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final long length() throws IOException {
        return this.f112486OooOoO0;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final int peek() throws IOException {
        int i;
        OooO0OO();
        if (this.f112487OooOoOO + ((long) this.f112488OooOoo) >= this.f112486OooOoO0) {
            i = -1;
        } else {
            if (!OooOOO0(false)) {
                throw new IOException("Unexpectedly no bytes available for read in buffer.");
            }
            byte[] bArr = this.f112489OooOoo0;
            int i2 = this.f112488OooOoo;
            this.f112488OooOoo = i2 + 1;
            i = bArr[i2] & 255;
        }
        if (i != -1) {
            Ooooo00(1);
        }
        return i;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final int read() throws IOException {
        OooO0OO();
        if (this.f112487OooOoOO + ((long) this.f112488OooOoo) >= this.f112486OooOoO0) {
            return -1;
        }
        if (!OooOOO0(false)) {
            throw new IOException("Unexpectedly no bytes available for read in buffer.");
        }
        byte[] bArr = this.f112489OooOoo0;
        int i = this.f112488OooOoo;
        this.f112488OooOoo = i + 1;
        return bArr[i] & 255;
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final void seek(long j) throws IOException {
        OooO0OO();
        if (j > this.f112486OooOoO0) {
            throw new EOFException();
        }
        if (j < 0) {
            throw new IOException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "Negative seek offset: "));
        }
        long j2 = this.f112487OooOoOO;
        int i = this.f112484OooOo0o;
        if (j >= j2 && j <= ((long) i) + j2) {
            this.f112488OooOoo = (int) (j - j2);
            return;
        }
        if (this.f112490OooOooO) {
            this.f112483OooOo.OooOOoo(this.f112491OooOooo[this.f112485OooOoO], this.f112489OooOoo0);
            this.f112490OooOooO = false;
        }
        long j3 = i;
        int i2 = (int) (j / j3);
        if (j % j3 == 0 && j == this.f112486OooOoO0) {
            i2--;
        }
        this.f112489OooOoo0 = this.f112483OooOo.OooOOo0(this.f112491OooOooo[i2]);
        this.f112485OooOoO = i2;
        long j4 = ((long) i2) * j3;
        this.f112487OooOoOO = j4;
        this.f112488OooOoo = (int) (j - j4);
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // o0ooO0o.InterfaceC31461OooO0oO
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        OooO0OO();
        long j = this.f112487OooOoOO + ((long) this.f112488OooOoo);
        long j2 = this.f112486OooOoO0;
        if (j >= j2) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j2 - j);
        int i3 = 0;
        while (iMin > 0) {
            if (OooOOO0(false)) {
                int iMin2 = Math.min(iMin, this.f112484OooOo0o - this.f112488OooOoo);
                System.arraycopy(this.f112489OooOoo0, this.f112488OooOoo, bArr, i, iMin2);
                this.f112488OooOoo += iMin2;
                i3 += iMin2;
                i += iMin2;
                iMin -= iMin2;
            } else {
                throw new IOException("Unexpectedly no bytes available for read in buffer.");
            }
        }
        return i3;
    }
}
