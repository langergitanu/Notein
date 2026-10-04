package com.aspose.slides.internal.p525yi;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4718gk;
import com.aspose.slides.internal.p174hz.AbstractC4720he;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.AbstractC4765wz;
import com.aspose.slides.internal.p174hz.AbstractC4777yo;
import com.aspose.slides.internal.p174hz.C4756up;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14118yn;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.ar */
/* JADX INFO: loaded from: classes5.dex */
public final class C12817ar {

    /* JADX INFO: renamed from: k4 */
    private static byte[] f42639k4 = {-38, 57, -93, -18, 94, 107, 75, 13, PatternStyle.Vertical, 85, -65, -17, -107, 96, 24, -112, -81, -40, 7, 9};

    /* JADX INFO: renamed from: x1 */
    private static byte[] f42642x1 = {-29, -80, -60, 66, -104, -4, 28, 20, -102, -5, -12, -56, -103, 111, -71, 36, 39, -82, 65, -28, 100, -101, -109, 76, -92, -107, -103, 27, 120, 82, -72, 85};

    /* JADX INFO: renamed from: kk */
    private static byte[] f42640kk = {56, -80, 96, -89, 81, -84, -106, 56, 76, -39, PatternStyle.Vertical, 126, -79, -79, -29, 106, 33, -3, -73, 17, 20, -66, 7, 67, 76, 12, -57, -65, 99, -10, -31, -38, 39, 78, -34, -65, -25, 111, 101, -5, -43, 26, -46, -15, 72, -104, -71, 91};

    /* JADX INFO: renamed from: to */
    private static byte[] f42641to = {-49, -125, -31, PatternStyle.UpwardDiagonal, 126, -17, -72, -67, -15, 84, 40, 80, -42, 109, UnsignedBytes.MAX_POWER_OF_TWO, 7, -42, 32, -28, 5, 11, 87, 21, -36, -125, -12, -87, 33, -45, 108, -23, -50, 71, -48, -47, 60, 93, -123, -14, -80, -1, -125, 24, -46, -121, 126, -20, PatternStyle.Shingle, 99, -71, PatternStyle.Horizontal, -67, 71, 65, 122, -127, -91, 56, PatternStyle.Vertical, 122, -7, 39, -38, 62};

    /* JADX INFO: renamed from: du */
    public static byte[] m59592du(AbstractC4751tq abstractC4751tq, byte[] bArr) {
        byte b;
        int iMo19591k4 = abstractC4751tq.mo19591k4() >> 3;
        if (iMo19591k4 < 11 || bArr.length > iMo19591k4) {
            throw new CryptographicException("decryption error");
        }
        byte[] bArrM59603k4 = m59603k4(m59608x1(abstractC4751tq, m59602k4(bArr)), iMo19591k4);
        if (bArrM59603k4[0] != 0 || bArrM59603k4[1] != 2) {
            return null;
        }
        int i = 10;
        while (true) {
            b = bArrM59603k4[i];
            if (b == 0 || i >= bArrM59603k4.length) {
                break;
            }
            i++;
        }
        if (b != 0) {
            return null;
        }
        int i2 = i + 1;
        int length = bArrM59603k4.length - i2;
        byte[] bArr2 = new byte[length];
        C14058fa.m66596k4(bArrM59603k4, i2, bArr2, 0, length);
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m59593k4(AbstractC4751tq abstractC4751tq, AbstractC4705c6 abstractC4705c6, byte[] bArr, byte[] bArr2) {
        return m59594k4(abstractC4751tq, abstractC4705c6, bArr, bArr2, false);
    }

    /* JADX INFO: renamed from: kk */
    public static byte[] m59604kk(AbstractC4751tq abstractC4751tq, byte[] bArr) {
        return abstractC4751tq.mo19643x1(bArr);
    }

    /* JADX INFO: renamed from: to */
    public static byte[] m59605to(AbstractC4751tq abstractC4751tq, byte[] bArr) {
        return abstractC4751tq.mo19640k4(bArr);
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m59606x1(AbstractC4705c6 abstractC4705c6, byte[] bArr, int i) {
        if (i < 0) {
            throw new OverflowException();
        }
        int length = bArr.length;
        int iM19587up = abstractC4705c6.m19587up() >> 3;
        int i2 = i / iM19587up;
        if (i % iM19587up != 0) {
            i2++;
        }
        byte[] bArr2 = new byte[i2 * iM19587up];
        byte[] bArr3 = new byte[length + 4];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArrM59596k4 = m59596k4(i4, 4);
            C14058fa.m66596k4(bArr, 0, bArr3, 0, length);
            C14058fa.m66596k4(bArrM59596k4, 0, bArr3, length, 4);
            C14058fa.m66596k4(abstractC4705c6.m19588x1(bArr3), 0, bArr2, i3, iM19587up);
            i3 += length;
        }
        byte[] bArr4 = new byte[i];
        C14058fa.m66596k4(bArr2, 0, bArr4, 0, i);
        return bArr4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m59594k4(AbstractC4751tq abstractC4751tq, AbstractC4705c6 abstractC4705c6, byte[] bArr, byte[] bArr2, boolean z) {
        int iMo19591k4 = abstractC4751tq.mo19591k4() >> 3;
        byte[] bArrM59603k4 = m59603k4(m59605to(abstractC4751tq, m59602k4(bArr2)), iMo19591k4);
        boolean zM59595k4 = m59595k4(m59598k4(abstractC4705c6, bArr, iMo19591k4), bArrM59603k4);
        if (!zM59595k4 && z) {
            zM59595k4 = false;
            if (bArrM59603k4[0] == 0 && bArrM59603k4[1] == 1) {
                int i = 2;
                while (i < (bArrM59603k4.length - bArr.length) - 1) {
                    if ((bArrM59603k4[i] & 255) != 255) {
                        return false;
                    }
                    i++;
                }
                int i2 = i + 1;
                if (bArrM59603k4[i] != 0) {
                    return false;
                }
                int length = bArr.length;
                byte[] bArr3 = new byte[length];
                C14058fa.m66596k4(bArrM59603k4, i2, bArr3, 0, length);
                return m59595k4(bArr3, bArr);
            }
        }
        return zM59595k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m59607x1(AbstractC4751tq abstractC4751tq, AbstractC4705c6 abstractC4705c6, byte[] bArr) {
        int iMo19591k4 = abstractC4751tq.mo19591k4() >> 3;
        return m59603k4(m59604kk(abstractC4751tq, m59602k4(m59598k4(abstractC4705c6, bArr, iMo19591k4))), iMo19591k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m59595k4(byte[] bArr, byte[] bArr2) {
        boolean z = bArr.length == bArr2.length;
        if (z) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m59608x1(AbstractC4751tq abstractC4751tq, byte[] bArr) {
        return abstractC4751tq.mo19643x1(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m59596k4(int i, int i2) {
        byte[] bArrM66785x1 = C14069jd.m66785x1(i);
        C14118yn.m67557k4(bArrM66785x1, 0, bArrM66785x1.length);
        return m59603k4(bArrM66785x1, i2);
    }

    /* JADX INFO: renamed from: x1 */
    private static byte[] m59609x1(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) ((bArr[i] & 255) ^ (bArr2[i] & 255));
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m59597k4(AbstractC4705c6 abstractC4705c6) {
        return abstractC4705c6 instanceof AbstractC4739nv ? f42639k4 : abstractC4705c6 instanceof AbstractC4718gk ? f42642x1 : abstractC4705c6 instanceof AbstractC4777yo ? f42640kk : abstractC4705c6 instanceof AbstractC4765wz ? f42641to : abstractC4705c6.m19588x1(null);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m59598k4(AbstractC4705c6 abstractC4705c6, byte[] bArr, int i) {
        byte[] bArrM59708du;
        if (bArr.length != (abstractC4705c6.m19587up() >> 3)) {
            throw new CryptographicException("bad hash length for " + abstractC4705c6.toString());
        }
        String strM19764x1 = C4756up.m19764x1(abstractC4705c6.toString());
        if (strM19764x1 != null) {
            C12842x1 c12842x1 = new C12842x1(PatternStyle.Wave);
            c12842x1.m59712k4(new C12842x1(C4756up.m19763kk(strM19764x1)));
            c12842x1.m59712k4(new C12842x1((byte) 5));
            C12842x1 c12842x12 = new C12842x1((byte) 4, bArr);
            C12842x1 c12842x13 = new C12842x1(PatternStyle.Wave);
            c12842x13.m59712k4(c12842x1);
            c12842x13.m59712k4(c12842x12);
            bArrM59708du = c12842x13.m59708du();
        } else {
            bArrM59708du = bArr;
        }
        C14058fa.m66596k4(bArr, 0, bArrM59708du, bArrM59708du.length - bArr.length, bArr.length);
        int iMax = Math.max(8, (i - bArrM59708du.length) - 3);
        byte[] bArr2 = new byte[bArrM59708du.length + iMax + 3];
        bArr2[1] = 1;
        for (int i2 = 2; i2 < iMax + 2; i2++) {
            bArr2[i2] = -1;
        }
        C14058fa.m66596k4(bArrM59708du, 0, bArr2, iMax + 3, bArrM59708du.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m59599k4(AbstractC4751tq abstractC4751tq, AbstractC4705c6 abstractC4705c6, byte[] bArr) {
        int iMo19591k4 = abstractC4751tq.mo19591k4() / 8;
        int iM19587up = abstractC4705c6.m19587up() / 8;
        if (iMo19591k4 < (iM19587up * 2) + 2 || bArr.length != iMo19591k4) {
            throw new CryptographicException("decryption error");
        }
        byte[] bArrM59603k4 = m59603k4(m59608x1(abstractC4751tq, m59602k4(bArr)), iMo19591k4);
        byte[] bArr2 = new byte[iM19587up];
        C14058fa.m66596k4(bArrM59603k4, 1, bArr2, 0, iM19587up);
        int i = (iMo19591k4 - iM19587up) - 1;
        byte[] bArr3 = new byte[i];
        C14058fa.m66596k4(bArrM59603k4, bArrM59603k4.length - i, bArr3, 0, i);
        byte[] bArrM59609x1 = m59609x1(bArr3, m59606x1(abstractC4705c6, m59609x1(bArr2, m59606x1(abstractC4705c6, bArr3, iM19587up)), i));
        byte[] bArrM59597k4 = m59597k4(abstractC4705c6);
        int length = bArrM59597k4.length;
        byte[] bArr4 = new byte[length];
        C14058fa.m66596k4(bArrM59609x1, 0, bArr4, 0, length);
        boolean zM59595k4 = m59595k4(bArrM59597k4, bArr4);
        int length2 = bArrM59597k4.length;
        while (bArrM59609x1[length2] == 0) {
            length2++;
        }
        int length3 = (bArrM59609x1.length - length2) - 1;
        byte[] bArr5 = new byte[length3];
        C14058fa.m66596k4(bArrM59609x1, length2 + 1, bArr5, 0, length3);
        if (bArrM59603k4[0] == 0 && zM59595k4 && bArrM59609x1[length2] == 1) {
            return bArr5;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m59600k4(AbstractC4751tq abstractC4751tq, AbstractC4720he abstractC4720he, byte[] bArr) {
        int iMo19591k4 = abstractC4751tq.mo19591k4() / 8;
        if (bArr.length > iMo19591k4 - 11) {
            throw new CryptographicException("message too long");
        }
        int iMax = Math.max(8, (iMo19591k4 - bArr.length) - 3);
        byte[] bArr2 = new byte[iMax];
        abstractC4720he.mo19625x1(bArr2);
        byte[] bArr3 = new byte[iMo19591k4];
        bArr3[1] = 2;
        C14058fa.m66596k4(bArr2, 0, bArr3, 2, iMax);
        C14058fa.m66596k4(bArr, 0, bArr3, iMo19591k4 - bArr.length, bArr.length);
        return m59603k4(m59601k4(abstractC4751tq, m59602k4(bArr3)), iMo19591k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m59601k4(AbstractC4751tq abstractC4751tq, byte[] bArr) {
        return abstractC4751tq.mo19640k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m59602k4(byte[] bArr) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (bArr[i] != 0 || i2 >= bArr.length) {
                break;
            }
            i = i2;
        }
        if (i <= 0) {
            return bArr;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        C14058fa.m66596k4(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m59603k4(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        C14058fa.m66596k4(bArr, 0, bArr2, i - bArr.length, bArr.length);
        return bArr2;
    }
}
