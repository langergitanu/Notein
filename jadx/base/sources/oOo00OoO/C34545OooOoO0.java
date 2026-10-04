package oOo00OoO;

import OoooOOo.C21197OooOO0O;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: oOo00OoO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34545OooOoO0 extends C34527OooO0oO {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final transient byte[][] f123787OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final transient int[] f123788OooOoo0;

    public C34545OooOoO0(byte[][] bArr, int[] iArr) {
        super(C34527OooO0oO.f123734OooOoO.f123736OooOo0o);
        this.f123787OooOoOO = bArr;
        this.f123788OooOoo0 = iArr;
    }

    private final Object writeReplace() {
        return new C34527OooO0oO(OooOO0o());
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final boolean OooO(int i, byte[] other, int i2, int i3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        if (i < 0 || i > OooO0OO() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iOooO0o0 = C21197OooOO0O.OooO0o0(this, i);
        while (i < i4) {
            int[] iArr = this.f123788OooOoo0;
            int i5 = iOooO0o0 == 0 ? 0 : iArr[iOooO0o0 - 1];
            int i6 = iArr[iOooO0o0] - i5;
            byte[][] bArr = this.f123787OooOoOO;
            int i7 = iArr[bArr.length + iOooO0o0];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!C34522OooO0O0.OooO00o((i - i5) + i7, i2, iMin, bArr[iOooO0o0], other)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iOooO0o0++;
        }
        return true;
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final String OooO00o() {
        return new C34527OooO0oO(OooOO0o()).OooO00o();
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final C34527OooO0oO OooO0O0(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f123787OooOoOO;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f123788OooOoo0;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.OooOOO0.OooO0o(digestBytes, "digestBytes");
        return new C34527OooO0oO(digestBytes);
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final int OooO0OO() {
        return this.f123788OooOoo0[this.f123787OooOoOO.length - 1];
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final String OooO0Oo() {
        return new C34527OooO0oO(OooOO0o()).OooO0Oo();
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final byte OooO0o(int i) {
        byte[][] bArr = this.f123787OooOoOO;
        int length = bArr.length - 1;
        int[] iArr = this.f123788OooOoo0;
        C34522OooO0O0.OooO0O0(iArr[length], i, 1L);
        int iOooO0o0 = C21197OooOO0O.OooO0o0(this, i);
        return bArr[iOooO0o0][(i - (iOooO0o0 == 0 ? 0 : iArr[iOooO0o0 - 1])) + iArr[bArr.length + iOooO0o0]];
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final byte[] OooO0o0() {
        return OooOO0o();
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final boolean OooO0oo(int i, C34527OooO0oO other) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        if (OooO0OO() - i >= 0) {
            int iOooO0o0 = C21197OooOO0O.OooO0o0(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.f123788OooOoo0;
                int i4 = iOooO0o0 == 0 ? 0 : iArr[iOooO0o0 - 1];
                int i5 = iArr[iOooO0o0] - i4;
                byte[][] bArr = this.f123787OooOoOO;
                int i6 = iArr[bArr.length + iOooO0o0];
                int iMin = Math.min(i, i5 + i4) - i2;
                if (other.OooO(i3, bArr[iOooO0o0], (i2 - i4) + i6, iMin)) {
                    i3 += iMin;
                    i2 += iMin;
                    iOooO0o0++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final C34527OooO0oO OooOO0O() {
        return new C34527OooO0oO(OooOO0o()).OooOO0O();
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final byte[] OooOO0o() {
        byte[] bArr = new byte[OooO0OO()];
        byte[][] bArr2 = this.f123787OooOoOO;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f123788OooOoo0;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            Oooo.OooO0OO.OooO0o0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final void OooOOO(C34524OooO0Oo buffer, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
        int iOooO0o0 = C21197OooOO0O.OooO0o0(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f123788OooOoo0;
            int i3 = iOooO0o0 == 0 ? 0 : iArr[iOooO0o0 - 1];
            int i4 = iArr[iOooO0o0] - i3;
            byte[][] bArr = this.f123787OooOoOO;
            int i5 = iArr[bArr.length + iOooO0o0];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            C34543OooOo0o c34543OooOo0o = new C34543OooOo0o(bArr[iOooO0o0], i6, i6 + iMin, true, false);
            C34543OooOo0o c34543OooOo0o2 = buffer.f123724OooOo0o;
            if (c34543OooOo0o2 == null) {
                c34543OooOo0o.f123786OooO0oO = c34543OooOo0o;
                c34543OooOo0o.f123784OooO0o = c34543OooOo0o;
                buffer.f123724OooOo0o = c34543OooOo0o;
            } else {
                C34543OooOo0o c34543OooOo0o3 = c34543OooOo0o2.f123786OooO0oO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o3);
                c34543OooOo0o3.OooO0O0(c34543OooOo0o);
            }
            i2 += iMin;
            iOooO0o0++;
        }
        buffer.f123723OooOo += (long) i;
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C34527OooO0oO)) {
            return false;
        }
        C34527OooO0oO c34527OooO0oO = (C34527OooO0oO) obj;
        return c34527OooO0oO.OooO0OO() == OooO0OO() && OooO0oo(OooO0OO(), c34527OooO0oO);
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final int hashCode() {
        int i = this.f123735OooOo;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f123787OooOoOO;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f123788OooOoo0;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f123735OooOo = i3;
        return i3;
    }

    @Override // oOo00OoO.C34527OooO0oO
    public final String toString() {
        return new C34527OooO0oO(OooOO0o()).toString();
    }
}
