package com.bumptech.glide.load.data;

import androidx.appcompat.widget.C21532OooOOo;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22257OooO0oO extends FilterInputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f67206OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte f67207OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final byte[] f67205OooOoO0 = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final int f67204OooOoO = 31;

    public C22257OooO0oO(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Cannot add invalid orientation: "));
        }
        this.f67207OooOo0o = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2 = this.f67206OooOo;
        int i3 = (i2 < 2 || i2 > (i = f67204OooOoO)) ? super.read() : i2 == i ? this.f67207OooOo0o : f67205OooOoO0[i2 - 2] & 255;
        if (i3 != -1) {
            this.f67206OooOo++;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f67206OooOo = (int) (((long) this.f67206OooOo) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f67206OooOo;
        int i5 = f67204OooOoO;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f67207OooOo0o;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f67205OooOoO0, this.f67206OooOo - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f67206OooOo += i3;
        }
        return i3;
    }
}
