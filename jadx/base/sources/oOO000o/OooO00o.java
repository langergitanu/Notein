package oOO000o;

import com.aspose.words.ControlChar;
import java.lang.reflect.Array;
import o00o0oo.C25466OooO0o;
import oOO000oO.C34332OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f123234OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f123235OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int[][] f123236OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f123237OooO0Oo;

    public OooO00o(OooO00o oooO00o) {
        this.f123235OooO0O0 = oooO00o.f123235OooO0O0;
        this.f123234OooO00o = oooO00o.f123234OooO00o;
        this.f123237OooO0Oo = oooO00o.f123237OooO0Oo;
        this.f123236OooO0OO = new int[oooO00o.f123236OooO0OO.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.f123236OooO0OO;
            if (i >= iArr.length) {
                return;
            }
            int[] iArr2 = oooO00o.f123236OooO0OO[i];
            int[] iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr[i] = iArr3;
            i++;
        }
    }

    public final byte[] OooO00o() {
        int[][] iArr;
        int i = this.f123235OooO0O0;
        int i2 = this.f123234OooO00o;
        int i3 = 8;
        byte[] bArr = new byte[(((i + 7) >>> 3) * i2) + 8];
        o00OO0O0.OooO0O0.OooO00o(i2, 0, bArr);
        o00OO0O0.OooO0O0.OooO00o(i, 4, bArr);
        int i4 = i >>> 5;
        int i5 = i & 31;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = 0;
            while (true) {
                iArr = this.f123236OooO0OO;
                if (i7 >= i4) {
                    break;
                }
                o00OO0O0.OooO0O0.OooO00o(iArr[i6][i7], i3, bArr);
                i7++;
                i3 += 4;
            }
            int i8 = 0;
            while (i8 < i5) {
                bArr[i3] = (byte) ((iArr[i6][i4] >>> i8) & 255);
                i8 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        int i = oooO00o.f123234OooO00o;
        int i2 = this.f123234OooO00o;
        if (i2 != i || this.f123235OooO0O0 != oooO00o.f123235OooO0O0 || this.f123237OooO0Oo != oooO00o.f123237OooO0Oo) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C25466OooO0o.OooO00o(this.f123236OooO0OO[i3], oooO00o.f123236OooO0OO[i3])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f123234OooO00o;
        int iOooO0o = (((i * 31) + this.f123235OooO0O0) * 31) + this.f123237OooO0Oo;
        for (int i2 = 0; i2 < i; i2++) {
            iOooO0o = (iOooO0o * 31) + C34332OooO00o.OooO0o(this.f123236OooO0OO[i2]);
        }
        return iOooO0o;
    }

    public final String toString() {
        int[][] iArr;
        int i = this.f123235OooO0O0 & 31;
        int i2 = this.f123237OooO0Oo;
        int i3 = i == 0 ? i2 : i2 - 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < this.f123234OooO00o; i4++) {
            stringBuffer.append(i4 + ": ");
            int i5 = 0;
            while (true) {
                iArr = this.f123236OooO0OO;
                if (i5 >= i3) {
                    break;
                }
                int i6 = iArr[i4][i5];
                for (int i7 = 0; i7 < 32; i7++) {
                    if (((i6 >>> i7) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(ControlChar.SPACE_CHAR);
                i5++;
            }
            int i8 = iArr[i4][i2 - 1];
            for (int i9 = 0; i9 < i; i9++) {
                if (((i8 >>> i9) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public OooO00o(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        int iOooO0O0 = o00OO0O0.OooO0O0.OooO0O0(0, bArr);
        this.f123234OooO00o = iOooO0O0;
        int iOooO0O02 = o00OO0O0.OooO0O0.OooO0O0(4, bArr);
        this.f123235OooO0O0 = iOooO0O02;
        int i = ((iOooO0O02 + 7) >>> 3) * iOooO0O0;
        if (iOooO0O0 > 0) {
            int i2 = 8;
            if (i == bArr.length - 8) {
                int i3 = (iOooO0O02 + 31) >>> 5;
                this.f123237OooO0Oo = i3;
                this.f123236OooO0OO = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iOooO0O0, i3);
                int i4 = iOooO0O02 >> 5;
                int i5 = iOooO0O02 & 31;
                for (int i6 = 0; i6 < this.f123234OooO00o; i6++) {
                    int i7 = 0;
                    while (i7 < i4) {
                        this.f123236OooO0OO[i6][i7] = o00OO0O0.OooO0O0.OooO0O0(i2, bArr);
                        i7++;
                        i2 += 4;
                    }
                    int i8 = 0;
                    while (i8 < i5) {
                        int[] iArr = this.f123236OooO0OO[i6];
                        iArr[i4] = ((bArr[i2] & 255) << i8) ^ iArr[i4];
                        i8 += 8;
                        i2++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
