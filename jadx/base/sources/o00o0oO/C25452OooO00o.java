package o00o0oO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o00o0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25452OooO00o extends FilterInputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f86739OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f86740OooOo0o;

    public C25452OooO00o(InputStream inputStream, int i) {
        super(inputStream);
        if (i < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f86740OooOo0o = i;
        this.f86739OooOo = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return Math.min(((FilterInputStream) this).in.available(), this.f86740OooOo0o);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.f86739OooOo = this.f86740OooOo0o;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f86740OooOo0o == 0) {
            return -1;
        }
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f86740OooOo0o--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f86739OooOo == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f86740OooOo0o = this.f86739OooOo;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f86740OooOo0o));
        this.f86740OooOo0o = (int) (((long) this.f86740OooOo0o) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f86740OooOo0o;
        if (i3 == 0) {
            return -1;
        }
        int i4 = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (i4 > 0) {
            this.f86740OooOo0o -= i4;
        }
        return i4;
    }
}
