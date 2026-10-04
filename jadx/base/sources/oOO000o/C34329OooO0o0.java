package oOO000o;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22218Oooo;
import o0Oo0o00.o0OOO0o;

/* JADX INFO: renamed from: oOO000o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34329OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0O0 f123246OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f123247OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int[] f123248OooO0OO;

    public C34329OooO0o0(OooO0O0 oooO0O0, byte[] bArr) {
        this.f123246OooO00o = oooO0O0;
        int i = 8;
        int i2 = 1;
        while (oooO0O0.f123238OooO00o > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.f123248OooO0OO = new int[bArr.length / i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f123248OooO0OO;
            if (i3 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                OooO0OO();
                return;
            }
            int i5 = 0;
            while (i5 < i) {
                int[] iArr2 = this.f123248OooO0OO;
                iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                i5 += 8;
                i4++;
            }
            if (!this.f123246OooO00o.OooO0O0(this.f123248OooO0OO[i3])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i3++;
        }
    }

    public static int OooO0O0(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    public final int[] OooO00o(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i = iArr3[length];
            int i2 = iArr[length];
            this.f123246OooO00o.getClass();
            iArr3[length] = i ^ i2;
        }
        return iArr3;
    }

    public final void OooO0OO() {
        int length = this.f123248OooO0OO.length;
        do {
            this.f123247OooO0O0 = length - 1;
            length = this.f123247OooO0O0;
            if (length < 0) {
                return;
            }
        } while (this.f123248OooO0OO[length] == 0);
    }

    public final int OooO0Oo(int i) {
        if (i < 0 || i > this.f123247OooO0O0) {
            return 0;
        }
        return this.f123248OooO0OO[i];
    }

    public final int[] OooO0o(int[] iArr, int i) {
        int iOooO0O0 = OooO0O0(iArr);
        if (iOooO0O0 == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        int[] iArr3 = new int[iOooO0O0 + 1];
        while (iOooO0O0 >= 0) {
            iArr3[iOooO0O0] = o0OOO0o.OooO0OO(iArr[iOooO0O0], i, this.f123246OooO00o.f123239OooO0O0);
            iOooO0O0--;
        }
        return iArr3;
    }

    public final byte[] OooO0o0() {
        int i = 8;
        int i2 = 1;
        while (this.f123246OooO00o.f123238OooO00o > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[this.f123248OooO0OO.length * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f123248OooO0OO.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.f123248OooO0OO[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C34329OooO0o0)) {
            C34329OooO0o0 c34329OooO0o0 = (C34329OooO0o0) obj;
            if (this.f123246OooO00o.equals(c34329OooO0o0.f123246OooO00o) && this.f123247OooO0O0 == c34329OooO0o0.f123247OooO0O0) {
                int[] iArr = this.f123248OooO0OO;
                int[] iArr2 = c34329OooO0o0.f123248OooO0OO;
                int iOooO0O0 = OooO0O0(iArr);
                if (iOooO0O0 == OooO0O0(iArr2)) {
                    for (int i = 0; i <= iOooO0O0; i++) {
                        if (iArr[i] == iArr2[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f123246OooO00o.f123239OooO0O0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f123248OooO0OO;
            if (i2 >= iArr.length) {
                return i;
            }
            i = (i * 31) + iArr[i2];
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" Polynomial over ");
        OooO0O0 oooO0O0 = this.f123246OooO00o;
        sb.append(oooO0O0.toString());
        sb.append(": \n");
        String string = sb.toString();
        for (int i = 0; i < this.f123248OooO0OO.length; i++) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(string);
            int i2 = this.f123248OooO0OO[i];
            String strOooO00o = "";
            for (int i3 = 0; i3 < oooO0O0.f123238OooO00o; i3++) {
                strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o((((byte) i2) & 1) == 0 ? "0" : "1", strOooO00o);
                i2 >>>= 1;
            }
            sbOooO0OO.append(strOooO00o);
            sbOooO0OO.append("Y^");
            sbOooO0OO.append(i);
            sbOooO0OO.append("+");
            string = sbOooO0OO.toString();
        }
        return C21111o0ooOoO.OooO0Oo(string, ";");
    }

    public C34329OooO0o0(OooO0O0 oooO0O0, int[] iArr) {
        int[] iArr2;
        this.f123246OooO00o = oooO0O0;
        int iOooO0O0 = OooO0O0(iArr);
        if (iOooO0O0 == -1) {
            iArr2 = new int[1];
        } else {
            int i = iOooO0O0 + 1;
            if (iArr.length == i) {
                iArr2 = new int[iArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                int[] iArr3 = new int[i];
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr2 = iArr3;
            }
        }
        this.f123248OooO0OO = iArr2;
        OooO0OO();
    }
}
