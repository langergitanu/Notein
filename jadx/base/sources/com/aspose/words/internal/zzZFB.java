package com.aspose.words.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFB extends InputStream {
    byte[] zzTZ;
    final InputStream zzWMK;
    final zzZHC zzWML;
    int zzWMl;
    final int zzZja;

    public zzZFB(zzZHC zzzhc, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.zzWML = zzzhc;
        this.zzWMK = inputStream;
        this.zzTZ = bArr;
        this.zzWMl = i;
        this.zzZja = i2;
    }

    private void zzXNk() {
        byte[] bArr = this.zzTZ;
        if (bArr != null) {
            this.zzTZ = null;
            zzZHC zzzhc = this.zzWML;
            if (zzzhc != null) {
                zzzhc.zzXt(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.zzTZ != null ? this.zzZja - this.zzWMl : this.zzWMK.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        zzXNk();
        this.zzWMK.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        if (this.zzTZ == null) {
            this.zzWMK.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zzTZ == null && this.zzWMK.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.zzTZ;
        if (bArr == null) {
            return this.zzWMK.read();
        }
        int i = this.zzWMl;
        int i2 = i + 1;
        this.zzWMl = i2;
        int i3 = bArr[i] & 255;
        if (i2 >= this.zzZja) {
            zzXNk();
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.zzTZ == null) {
            this.zzWMK.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2;
        if (this.zzTZ != null) {
            int i = this.zzZja;
            int i2 = this.zzWMl;
            j2 = i - i2;
            if (j2 > j) {
                this.zzWMl = i2 + ((int) j);
                return j;
            }
            zzXNk();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? this.zzWMK.skip(j) + j2 : j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.zzTZ;
        if (bArr2 != null) {
            int i3 = this.zzZja;
            int i4 = this.zzWMl;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.zzWMl + i2;
            this.zzWMl = i6;
            if (i6 >= this.zzZja) {
                zzXNk();
            }
            return i2;
        }
        return this.zzWMK.read(bArr, i, i2);
    }
}
