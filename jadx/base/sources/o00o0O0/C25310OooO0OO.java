package o00o0O0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import o00oO0O.o0OoOo0;

/* JADX INFO: renamed from: o00o0O0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25310OooO0OO extends FilterInputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f86144OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f86145OooOo0o;

    public C25310OooO0OO(InputStream inputStream, long j) {
        super(inputStream);
        this.f86145OooOo0o = j;
    }

    public final void OooO00o(int i) throws IOException {
        if (i >= 0) {
            this.f86144OooOo += i;
            return;
        }
        long j = this.f86144OooOo;
        long j2 = this.f86145OooOo0o;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(j2, "Failed to read all expected data, expected: ", ", but read: ");
        sbOooO00o.append(this.f86144OooOo);
        throw new IOException(sbOooO00o.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f86145OooOo0o - ((long) this.f86144OooOo), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        int i;
        i = super.read();
        OooO00o(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        i3 = super.read(bArr, i, i2);
        OooO00o(i3);
        return i3;
    }
}
