package oO0oO0Oo;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: oO0oO0Oo.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34072o00000oO extends o0000oO {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final byte[] f122431OooOoOO = new byte[0];

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f122432OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f122433OooOoO0;

    public C34072o00000oO(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            OooO00o();
        }
        this.f122433OooOoO0 = i;
        this.f122432OooOoO = i;
    }

    public final byte[] OooO0OO() throws IOException {
        int i = this.f122432OooOoO;
        if (i == 0) {
            return f122431OooOoOO;
        }
        int i2 = this.f122438OooOo;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f122432OooOoO + " >= " + i2);
        }
        byte[] bArr = new byte[i];
        int iOooO0O0 = i - oOO00.OooO00o.OooO0O0(this.f122439OooOo0o, bArr, 0, i);
        this.f122432OooOoO = iOooO0O0;
        if (iOooO0O0 == 0) {
            OooO00o();
            return bArr;
        }
        throw new EOFException("DEF length " + this.f122433OooOoO0 + " object truncated by " + this.f122432OooOoO);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f122432OooOoO == 0) {
            return -1;
        }
        int i = this.f122439OooOo0o.read();
        if (i >= 0) {
            int i2 = this.f122432OooOoO - 1;
            this.f122432OooOoO = i2;
            if (i2 == 0) {
                OooO00o();
            }
            return i;
        }
        throw new EOFException("DEF length " + this.f122433OooOoO0 + " object truncated by " + this.f122432OooOoO);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f122432OooOoO;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f122439OooOo0o.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            int i5 = this.f122432OooOoO - i4;
            this.f122432OooOoO = i5;
            if (i5 == 0) {
                OooO00o();
            }
            return i4;
        }
        throw new EOFException("DEF length " + this.f122433OooOoO0 + " object truncated by " + this.f122432OooOoO);
    }
}
