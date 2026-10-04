package com.aspose.words.internal;

import Oooo0.C20856OooooOo;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFC extends Reader {
    final zzZHC zzWML;
    int zzWMl;
    char[] zzWMm;
    final Reader zzWMn;
    final int zzZja;

    public zzZFC(zzZHC zzzhc, Reader reader, char[] cArr, int i, int i2) {
        this.zzWML = zzzhc;
        this.zzWMn = reader;
        this.zzWMm = cArr;
        this.zzWMl = i;
        this.zzZja = i2;
        if (cArr != null && i >= i2) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Trying to construct MergedReader with empty contents (start ", i, ", end ", ")", i2));
        }
    }

    private void zzXNk() {
        char[] cArr = this.zzWMm;
        if (cArr != null) {
            this.zzWMm = null;
            zzZHC zzzhc = this.zzWML;
            if (zzzhc != null) {
                zzzhc.zzP(cArr);
            }
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        zzXNk();
        this.zzWMn.close();
    }

    @Override // java.io.Reader
    public final void mark(int i) throws IOException {
        if (this.zzWMm == null) {
            this.zzWMn.mark(i);
        }
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return this.zzWMm == null && this.zzWMn.markSupported();
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        char[] cArr = this.zzWMm;
        if (cArr == null) {
            return this.zzWMn.read();
        }
        int i = this.zzWMl;
        int i2 = i + 1;
        this.zzWMl = i2;
        int i3 = cArr[i] & 255;
        if (i2 >= this.zzZja) {
            zzXNk();
        }
        return i3;
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        return this.zzWMm != null || this.zzWMn.ready();
    }

    @Override // java.io.Reader
    public final void reset() throws IOException {
        if (this.zzWMm == null) {
            this.zzWMn.reset();
        }
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        long j2;
        if (this.zzWMm != null) {
            int i = this.zzZja;
            int i2 = this.zzWMl;
            j2 = i - i2;
            if (j2 > j) {
                this.zzWMl = i2 + ((int) j);
                return j2;
            }
            zzXNk();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? this.zzWMn.skip(j) + j2 : j2;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr) throws IOException {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        char[] cArr2 = this.zzWMm;
        if (cArr2 != null) {
            int i3 = this.zzZja;
            int i4 = this.zzWMl;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(cArr2, i4, cArr, i, i2);
            int i6 = this.zzWMl + i2;
            this.zzWMl = i6;
            if (i6 >= this.zzZja) {
                zzXNk();
            }
            return i2;
        }
        return this.zzWMn.read(cArr, i, i2);
    }
}
