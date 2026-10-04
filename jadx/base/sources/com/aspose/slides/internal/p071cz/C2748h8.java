package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.h8 */
/* JADX INFO: loaded from: classes3.dex */
final class C2748h8 extends AbstractC2788k9 {
    public C2748h8(C2696dd c2696dd, AbstractC2725fb abstractC2725fb, AbstractC2759hz abstractC2759hz, AbstractC2720f3 abstractC2720f3, C2778ji c2778ji, C2867q6 c2867q6) {
        super(c2696dd, abstractC2725fb, abstractC2759hz, abstractC2720f3, c2778ji);
        C2918tx c2918tx = new C2918tx(m12390x1(), c2867q6);
        String strM12302dy = m12302dy();
        for (int i = 0; i < strM12302dy.length(); i++) {
            c2918tx.m12548k4(strM12302dy.charAt(i));
        }
        m12492k4(c2918tx);
    }

    /* JADX INFO: renamed from: dy */
    private String m12302dy() {
        C2696dd c2696dd = (C2696dd) m12389k4();
        int iM12582k4 = c2696dd.m12199k4().m12582k4();
        int iM12202x1 = c2696dd.m12202x1();
        if (iM12202x1 == 0) {
            return C14113y2.m67402k4("({0})", C14113y2.m67368h4(m12303k4(iM12582k4)));
        }
        if (iM12202x1 == 1) {
            return C14113y2.m67402k4("{0})", C14113y2.m67368h4(m12303k4(iM12582k4)));
        }
        if (iM12202x1 == 2) {
            return C14113y2.m67402k4("{0}.", C14113y2.m67368h4(m12303k4(iM12582k4)));
        }
        if (iM12202x1 == 3) {
            return C14113y2.m67402k4("({0})", C14113y2.m67368h4(m12303k4(iM12582k4)));
        }
        if (iM12202x1 == 4) {
            return C14113y2.m67402k4("{0})", C14113y2.m67368h4(m12303k4(iM12582k4)));
        }
        if (iM12202x1 == 5) {
            return C14113y2.m67402k4("{0}.", C14113y2.m67368h4(m12303k4(iM12582k4)));
        }
        switch (iM12202x1) {
            case 10:
                return C14113y2.m67402k4("({0})", Integer.valueOf(iM12582k4));
            case 11:
                return C14113y2.m67402k4("{0})", Integer.valueOf(iM12582k4));
            case 12:
                return C14113y2.m67402k4("{0}.", Integer.valueOf(iM12582k4));
            default:
                switch (iM12202x1) {
                    case 29:
                        return C14113y2.m67368h4(C14113y2.m67402k4("({0})", m12304x1(iM12582k4)));
                    case 30:
                        return C14113y2.m67368h4(C14113y2.m67402k4("{0})", m12304x1(iM12582k4)));
                    case 31:
                        return C14113y2.m67368h4(C14113y2.m67402k4("{0}.", m12304x1(iM12582k4)));
                    case 32:
                        return C14113y2.m67402k4("({0})", m12304x1(iM12582k4));
                    case 33:
                        return C14113y2.m67402k4("{0})", m12304x1(iM12582k4));
                    case 34:
                        return C14113y2.m67402k4("{0}.", m12304x1(iM12582k4));
                    default:
                        throw new ArgumentNullException();
                }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private String m12303k4(int i) {
        C6765kp c6765kp = new C6765kp();
        while (i > 0) {
            c6765kp.m26808x1(0, (char) ((i % 26) + 64));
            i /= 26;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    private static String m12304x1(int i) {
        if (-9999 >= i || i >= 9999) {
            throw new ArgumentOutOfRangeException("num");
        }
        if (i == 0) {
            return "NUL";
        }
        C6765kp c6765kp = new C6765kp(10);
        if (i < 0) {
            c6765kp.m26780k4('-');
            i *= -1;
        }
        String[][] strArr = {new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, new String[]{"", "M", "MM", "MMM", "M(V)", "(V)", "(V)M", "(V)MM", "(V)MMM", "M(X)"}};
        int i2 = 1000;
        int i3 = 3;
        while (i2 > 0) {
            int i4 = i / i2;
            c6765kp.m26792k4(strArr[i3][i4]);
            i -= i4 * i2;
            i2 /= 10;
            i3--;
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2871qe
    /* JADX INFO: renamed from: kk */
    public C2867q6 mo12122kk() {
        return m12491h4()[0].mo12122kk();
    }
}
