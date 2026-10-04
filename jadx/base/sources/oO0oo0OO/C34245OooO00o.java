package oO0oo0OO;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import oO0oOooO.C34219OooO0O0;

/* JADX INFO: renamed from: oO0oo0OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34245OooO00o extends FilterInputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final byte[] f122993OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Cipher f122994OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public byte[] f122995OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f122996OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f122997OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f122998OooOoo0;

    public C34245OooO00o(ByteArrayInputStream byteArrayInputStream, Cipher cipher) {
        super(byteArrayInputStream);
        this.f122993OooOo = new byte[512];
        this.f122996OooOoO0 = false;
        this.f122994OooOo0o = cipher;
    }

    public final byte[] OooO00o() throws C34219OooO0O0 {
        try {
            if (this.f122996OooOoO0) {
                return null;
            }
            this.f122996OooOoO0 = true;
            return this.f122994OooOo0o.doFinal();
        } catch (GeneralSecurityException e) {
            throw new C34219OooO0O0(e);
        }
    }

    public final int OooO0OO() throws IOException {
        if (!this.f122996OooOoO0) {
            this.f122998OooOoo0 = 0;
            this.f122997OooOoOO = 0;
            while (true) {
                int i = this.f122997OooOoOO;
                if (i != 0) {
                    return i;
                }
                int i2 = ((FilterInputStream) this).in.read(this.f122993OooOo);
                if (i2 == -1) {
                    byte[] bArrOooO00o = OooO00o();
                    this.f122995OooOoO = bArrOooO00o;
                    if (bArrOooO00o != null && bArrOooO00o.length != 0) {
                        int length = bArrOooO00o.length;
                        this.f122997OooOoOO = length;
                        return length;
                    }
                } else {
                    byte[] bArrUpdate = this.f122994OooOo0o.update(this.f122993OooOo, 0, i2);
                    this.f122995OooOoO = bArrUpdate;
                    if (bArrUpdate != null) {
                        this.f122997OooOoOO = bArrUpdate.length;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return this.f122997OooOoOO - this.f122998OooOoo0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            ((FilterInputStream) this).in.close();
            this.f122998OooOoo0 = 0;
            this.f122997OooOoOO = 0;
        } finally {
            if (!this.f122996OooOoO0) {
                OooO00o();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f122998OooOoo0 >= this.f122997OooOoOO && OooO0OO() < 0) {
            return -1;
        }
        byte[] bArr = this.f122995OooOoO;
        int i = this.f122998OooOoo0;
        this.f122998OooOoo0 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j, available());
        this.f122998OooOoo0 += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f122998OooOoo0 >= this.f122997OooOoOO && OooO0OO() < 0) {
            return -1;
        }
        int iMin = Math.min(i2, available());
        System.arraycopy(this.f122995OooOoO, this.f122998OooOoo0, bArr, i, iMin);
        this.f122998OooOoo0 += iMin;
        return iMin;
    }
}
