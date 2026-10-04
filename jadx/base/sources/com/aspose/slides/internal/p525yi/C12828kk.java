package com.aspose.slides.internal.p525yi;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p174hz.C4756up;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14118yn;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12828kk {
    /* JADX INFO: renamed from: k4 */
    public static int m59648k4(C12842x1 c12842x1) {
        if (c12842x1 == null) {
            throw new ArgumentNullException("asn1");
        }
        if (c12842x1.m59718x1() != 2) {
            throw new FormatException("Only integer can be converted");
        }
        int i = 0;
        for (int i2 = 0; i2 < c12842x1.m59717to().length; i2++) {
            i = (i << 8) + (c12842x1.m59717to()[i2] & 255);
        }
        return i;
    }

    /* JADX INFO: renamed from: kk */
    public static C14084qq m59651kk(C12842x1 c12842x1) {
        String str;
        if (c12842x1 == null) {
            throw new ArgumentNullException("time");
        }
        String strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(c12842x1.m59717to());
        int length = strM26681x1.length();
        if (length != 11) {
            str = "yyyyMMddHHmmssZ";
            if (length == 13) {
                strM26681x1 = C14080ne.m66879du(strM26681x1.substring(0, 2), (InterfaceC14073kp) C11697x1.m55250kk()) >= 50 ? "19".concat(strM26681x1) : "20".concat(strM26681x1);
            } else if (length != 15) {
                if (length != 17) {
                    str = null;
                } else {
                    strM26681x1 = C14113y2.m67402k4("{0}{1}{2}{3}{4}:{5}{6}", C14080ne.m66879du(strM26681x1.substring(0, 2), (InterfaceC14073kp) C11697x1.m55250kk()) >= 50 ? "19" : "20", strM26681x1.substring(0, 12), Character.valueOf(strM26681x1.charAt(12) == '+' ? '-' : '+'), Character.valueOf(strM26681x1.charAt(13)), Character.valueOf(strM26681x1.charAt(14)), Character.valueOf(strM26681x1.charAt(15)), Character.valueOf(strM26681x1.charAt(16)));
                    str = "yyyyMMddHHmmsszzz";
                }
            }
        } else {
            str = "yyMMddHHmmZ";
        }
        return C14084qq.m67091k4(strM26681x1, str, C11697x1.m55250kk(), 16);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m59652x1(C12842x1 c12842x1) {
        if (c12842x1 == null) {
            throw new ArgumentNullException("asn1");
        }
        byte[] bArrM59717to = c12842x1.m59717to();
        StringBuilder sb = new StringBuilder();
        byte b = bArrM59717to[0];
        byte b2 = (byte) ((b & 255) / 40);
        byte b3 = (byte) ((b & 255) % 40);
        int i = b2 & 255;
        if (i > 2) {
            b3 = (byte) ((b3 & 255) + (((byte) ((i - 2) * 40)) & 255));
            b2 = 2;
        }
        sb.append(C14098up.m67319k4(b2, (InterfaceC14073kp) C11697x1.m55250kk()));
        sb.append(".");
        sb.append(C14098up.m67319k4(b3, (InterfaceC14073kp) C11697x1.m55250kk()));
        byte b4 = 1;
        long j = 0;
        while (true) {
            int i2 = b4 & 255;
            if (i2 >= bArrM59717to.length) {
                return sb.toString();
            }
            byte b5 = bArrM59717to[i2];
            j = (j << 7) | ((long) ((byte) (b5 & Ascii.DEL)));
            if ((b5 & UnsignedBytes.MAX_POWER_OF_TWO) != 128) {
                sb.append(".");
                sb.append(C14091t6.m67186k4(j, (InterfaceC14073kp) C11697x1.m55250kk()));
                j = 0;
            }
            b4 = (byte) (b4 + 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12842x1 m59649k4(int i) {
        byte[] bArrM66785x1 = C14069jd.m66785x1(i);
        C14118yn.m67556k4(bArrM66785x1);
        int i2 = 0;
        while (i2 < bArrM66785x1.length && bArrM66785x1[i2] == 0) {
            i2++;
        }
        C12842x1 c12842x1 = new C12842x1((byte) 2);
        if (i2 == 0) {
            c12842x1.m59713k4(bArrM66785x1);
            return c12842x1;
        }
        if (i2 == 4) {
            c12842x1.m59713k4(new byte[1]);
            return c12842x1;
        }
        int i3 = 4 - i2;
        byte[] bArr = new byte[i3];
        C14058fa.m66596k4(bArrM66785x1, i2, bArr, 0, i3);
        c12842x1.m59713k4(bArr);
        return c12842x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12842x1 m59650k4(String str) {
        if (str != null) {
            return new C12842x1(C4756up.m19763kk(str));
        }
        throw new ArgumentNullException("oid");
    }
}
