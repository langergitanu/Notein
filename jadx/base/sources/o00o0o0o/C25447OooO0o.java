package o00o0o0o;

import OooOoo0.OooOo00;
import java.io.IOException;
import java.io.InputStream;
import o00o0o.InterfaceC25436OooO0OO;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;

/* JADX INFO: renamed from: o00o0o0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25447OooO0o extends InputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final byte[] f86728OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InputStream f86729OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f86730OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC25436OooO0OO<byte[]> f86731OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f86732OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f86733OooOoo0;

    public C25447OooO0o(InputStream inputStream, byte[] bArr, InterfaceC25436OooO0OO<byte[]> interfaceC25436OooO0OO) {
        this.f86729OooOo0o = inputStream;
        bArr.getClass();
        this.f86728OooOo = bArr;
        interfaceC25436OooO0OO.getClass();
        this.f86731OooOoO0 = interfaceC25436OooO0OO;
        this.f86730OooOoO = 0;
        this.f86732OooOoOO = 0;
        this.f86733OooOoo0 = false;
    }

    public final void OooO00o() throws IOException {
        if (this.f86733OooOoo0) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        OooOo00.OooO0o(this.f86732OooOoOO <= this.f86730OooOoO);
        OooO00o();
        return this.f86729OooOo0o.available() + (this.f86730OooOoO - this.f86732OooOoOO);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f86733OooOoo0) {
            return;
        }
        this.f86733OooOoo0 = true;
        this.f86731OooOoO0.release(this.f86728OooOo);
        super.close();
    }

    public final void finalize() throws Throwable {
        if (!this.f86733OooOoo0) {
            if (C25438OooO00o.f86720OooO00o.OooO00o(6)) {
                C25439OooO0O0.OooO0O0(6, "PooledByteInputStream", "Finalized without closing");
            }
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        OooOo00.OooO0o(this.f86732OooOoOO <= this.f86730OooOoO);
        OooO00o();
        int i = this.f86732OooOoOO;
        int i2 = this.f86730OooOoO;
        byte[] bArr = this.f86728OooOo;
        if (i >= i2) {
            int i3 = this.f86729OooOo0o.read(bArr);
            if (i3 <= 0) {
                return -1;
            }
            this.f86730OooOoO = i3;
            this.f86732OooOoOO = 0;
        }
        int i4 = this.f86732OooOoOO;
        this.f86732OooOoOO = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        OooOo00.OooO0o(this.f86732OooOoOO <= this.f86730OooOoO);
        OooO00o();
        int i = this.f86730OooOoO;
        int i2 = this.f86732OooOoOO;
        long j2 = i - i2;
        if (j2 >= j) {
            this.f86732OooOoOO = (int) (((long) i2) + j);
            return j;
        }
        this.f86732OooOoOO = i;
        return this.f86729OooOo0o.skip(j - j2) + j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        OooOo00.OooO0o(this.f86732OooOoOO <= this.f86730OooOoO);
        OooO00o();
        int i3 = this.f86732OooOoOO;
        int i4 = this.f86730OooOoO;
        byte[] bArr2 = this.f86728OooOo;
        if (i3 >= i4) {
            int i5 = this.f86729OooOo0o.read(bArr2);
            if (i5 <= 0) {
                return -1;
            }
            this.f86730OooOoO = i5;
            this.f86732OooOoOO = 0;
        }
        int iMin = Math.min(this.f86730OooOoO - this.f86732OooOoOO, i2);
        System.arraycopy(bArr2, this.f86732OooOoOO, bArr, i, iMin);
        this.f86732OooOoOO += iMin;
        return iMin;
    }
}
