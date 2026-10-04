package o0oo0oO0;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: o0oo0oO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C31350OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f111941OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f111942OooO0O0 = 0;

    public C31350OooOOOo(byte[] bArr) {
        this.f111941OooO00o = bArr;
    }

    public final int OooO00o(int i) throws IOException {
        int i2;
        try {
            i2 = this.f111941OooO00o[this.f111942OooO0O0 + i] & 255;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw new EOFException();
    }

    public final int OooO0O0() {
        try {
            byte[] bArr = this.f111941OooO00o;
            int i = this.f111942OooO0O0;
            int i2 = bArr[i] & 255;
            this.f111942OooO0O0 = i + 1;
            return i2;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public final void OooO0OO() throws IOException {
        try {
            byte[] bArr = this.f111941OooO00o;
            int i = this.f111942OooO0O0;
            byte b = bArr[i];
            this.f111942OooO0O0 = i + 1;
        } catch (RuntimeException unused) {
        }
    }

    public final byte[] OooO0Oo(int i) throws IOException {
        if (i < 0) {
            throw new IOException("length is negative");
        }
        byte[] bArr = this.f111941OooO00o;
        int length = bArr.length;
        int i2 = this.f111942OooO0O0;
        if (length - i2 < i) {
            throw new EOFException();
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, i2, bArr2, 0, i);
        this.f111942OooO0O0 += i;
        return bArr2;
    }

    public final int OooO0o() throws IOException {
        int iOooO0O0 = OooO0O0();
        if (iOooO0O0 >= 0) {
            return iOooO0O0;
        }
        throw new EOFException();
    }

    public final int OooO0o0() throws IOException {
        int iOooO0O0 = OooO0O0();
        int iOooO0O02 = OooO0O0();
        int iOooO0O03 = OooO0O0();
        int iOooO0O04 = OooO0O0();
        if ((iOooO0O0 | iOooO0O02 | iOooO0O03 | iOooO0O04) >= 0) {
            return (iOooO0O0 << 24) | (iOooO0O02 << 16) | (iOooO0O03 << 8) | iOooO0O04;
        }
        throw new EOFException();
    }

    public final int OooO0oO() throws IOException {
        int iOooO0O0 = OooO0O0();
        int iOooO0O02 = OooO0O0();
        if ((iOooO0O0 | iOooO0O02) >= 0) {
            return (iOooO0O0 << 8) | iOooO0O02;
        }
        throw new EOFException();
    }
}
