package o00o0o0o;

import OooOoo0.OooOo00;
import java.io.InputStream;
import o000OO00.C24472OooOoo;

/* JADX INFO: renamed from: o00o0o0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25450OooO0oo extends InputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f86734OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC25449OooO0oO f86735OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f86736OooOoO0;

    public C25450OooO0oo(InterfaceC25449OooO0oO interfaceC25449OooO0oO) {
        OooOo00.OooO0O0(Boolean.valueOf(!interfaceC25449OooO0oO.isClosed()));
        this.f86735OooOo0o = interfaceC25449OooO0oO;
        this.f86734OooOo = 0;
        this.f86736OooOoO0 = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f86735OooOo0o.size() - this.f86734OooOo;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f86736OooOoO0 = this.f86734OooOo;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i = this.f86734OooOo;
        this.f86734OooOo = i + 1;
        return this.f86735OooOo0o.OooOOO(i) & 255;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f86734OooOo = this.f86736OooOoO0;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        OooOo00.OooO0O0(Boolean.valueOf(j >= 0));
        int iMin = Math.min((int) j, available());
        this.f86734OooOo += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i2 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i2);
            this.f86735OooOo0o.OooO0Oo(this.f86734OooOo, i, iMin, bArr);
            this.f86734OooOo += iMin;
            return iMin;
        }
        StringBuilder sb = new StringBuilder("length=");
        C24472OooOoo.OooO0O0(sb, "; regionStart=", "; regionLength=", bArr.length, i);
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }
}
