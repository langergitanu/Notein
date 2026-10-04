package oOO000o;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22226Oooo0oo;
import o00o0oo.C25466OooO0o;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oOO000o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34328OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f123241OooO00o;

    public C34328OooO0Oo(byte[] bArr) {
        int i;
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int iOooO0O0 = o00OO0O0.OooO0O0.OooO0O0(0, bArr);
        int i2 = iOooO0O0 - 1;
        int i3 = OooO0OO.f123240OooO00o;
        if (i2 == 0) {
            i = 1;
        } else {
            i = 0;
            for (i2 = i2 < 0 ? -i2 : i2; i2 > 0; i2 >>>= 8) {
                i++;
            }
        }
        if (bArr.length != (iOooO0O0 * i) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.f123241OooO00o = new int[iOooO0O0];
        for (int i4 = 0; i4 < iOooO0O0; i4++) {
            int[] iArr = this.f123241OooO00o;
            int i5 = (i4 * i) + 4;
            int i6 = 0;
            for (int i7 = i - 1; i7 >= 0; i7--) {
                i6 |= (bArr[i5 + i7] & 255) << (i7 * 8);
            }
            iArr[i4] = i6;
        }
        int[] iArr2 = this.f123241OooO00o;
        int length = iArr2.length;
        boolean[] zArr = new boolean[length];
        for (int i8 : iArr2) {
            if (i8 < 0 || i8 >= length || zArr[i8]) {
                throw new IllegalArgumentException("invalid encoding");
            }
            zArr[i8] = true;
        }
    }

    public final byte[] OooO00o() {
        int i;
        int[] iArr = this.f123241OooO00o;
        int length = iArr.length;
        int i2 = length - 1;
        int i3 = OooO0OO.f123240OooO00o;
        if (i2 == 0) {
            i = 1;
        } else {
            if (i2 < 0) {
                i2 = -i2;
            }
            i = 0;
            while (i2 > 0) {
                i++;
                i2 >>>= 8;
            }
        }
        byte[] bArr = new byte[(length * i) + 4];
        o00OO0O0.OooO0O0.OooO00o(length, 0, bArr);
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            int i6 = (i4 * i) + 4;
            for (int i7 = i - 1; i7 >= 0; i7--) {
                bArr[i6 + i7] = (byte) (i5 >>> (i7 * 8));
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34328OooO0Oo) {
            return C25466OooO0o.OooO00o(this.f123241OooO00o, ((C34328OooO0Oo) obj).f123241OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return C34332OooO00o.OooO0o(this.f123241OooO00o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.f123241OooO00o;
        sb.append(iArr[0]);
        String string = sb.toString();
        for (int i = 1; i < iArr.length; i++) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(string, ", ");
            sbOooO0OO.append(iArr[i]);
            string = sbOooO0OO.toString();
        }
        return C21111o0ooOoO.OooO0Oo(string, "]");
    }
}
