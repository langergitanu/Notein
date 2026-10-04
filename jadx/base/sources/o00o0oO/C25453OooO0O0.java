package o00o0oO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o00o0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25453OooO0O0 extends FilterInputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f86741OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f86742OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f86743OooOoO0;

    public C25453OooO0O0(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f86742OooOo0o = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.f86743OooOoO0 = this.f86741OooOo;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            return i;
        }
        int i2 = this.f86741OooOo;
        byte[] bArr = this.f86742OooOo0o;
        if (i2 >= bArr.length) {
            return -1;
        }
        this.f86741OooOo = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f86741OooOo = this.f86743OooOoO0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i5 < i2) {
            int i6 = this.f86741OooOo;
            byte[] bArr2 = this.f86742OooOo0o;
            if (i6 >= bArr2.length) {
                i3 = -1;
            } else {
                this.f86741OooOo = i6 + 1;
                i3 = bArr2[i6] & 255;
            }
            if (i3 == -1) {
                break;
            }
            bArr[i + i5] = (byte) i3;
            i5++;
        }
        if (i5 > 0) {
            return i5;
        }
        return -1;
    }
}
