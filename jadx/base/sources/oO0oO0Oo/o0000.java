package oO0oO0Oo;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000 extends o0000oO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f122419OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f122420OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f122421OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f122422OooOoo0;

    public o0000(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f122421OooOoOO = false;
        this.f122422OooOoo0 = true;
        this.f122420OooOoO0 = inputStream.read();
        int i2 = inputStream.read();
        this.f122419OooOoO = i2;
        if (i2 < 0) {
            throw new EOFException();
        }
        OooO0OO();
    }

    public final boolean OooO0OO() {
        if (!this.f122421OooOoOO && this.f122422OooOoo0 && this.f122420OooOoO0 == 0 && this.f122419OooOoO == 0) {
            this.f122421OooOoOO = true;
            OooO00o();
        }
        return this.f122421OooOoOO;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (OooO0OO()) {
            return -1;
        }
        int i = this.f122439OooOo0o.read();
        if (i < 0) {
            throw new EOFException();
        }
        int i2 = this.f122420OooOoO0;
        this.f122420OooOoO0 = this.f122419OooOoO;
        this.f122419OooOoO = i;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f122422OooOoo0 || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f122421OooOoOO) {
            return -1;
        }
        InputStream inputStream = this.f122439OooOo0o;
        int i3 = inputStream.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.f122420OooOoO0;
        bArr[i + 1] = (byte) this.f122419OooOoO;
        this.f122420OooOoO0 = inputStream.read();
        int i4 = inputStream.read();
        this.f122419OooOoO = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        throw new EOFException();
    }
}
