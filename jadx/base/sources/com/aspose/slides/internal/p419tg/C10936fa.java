package com.aspose.slides.internal.p419tg;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p525yi.C12828kk;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.fa */
/* JADX INFO: loaded from: classes4.dex */
public final class C10936fa {

    /* JADX INFO: renamed from: k4 */
    static byte[] f38038k4 = {85, 4, 6};

    /* JADX INFO: renamed from: x1 */
    static byte[] f38045x1 = {85, 4, 10};

    /* JADX INFO: renamed from: kk */
    static byte[] f38039kk = {85, 4, 11};

    /* JADX INFO: renamed from: to */
    static byte[] f38043to = {85, 4, 3};

    /* JADX INFO: renamed from: du */
    static byte[] f38033du = {85, 4, 7};

    /* JADX INFO: renamed from: h4 */
    static byte[] f38036h4 = {85, 4, 8};

    /* JADX INFO: renamed from: m9 */
    static byte[] f38041m9 = {85, 4, 9};

    /* JADX INFO: renamed from: dy */
    static byte[] f38034dy = {9, -110, 38, -119, -109, -14, PatternStyle.Weave, 100, 1, 25};

    /* JADX INFO: renamed from: c5 */
    static byte[] f38031c5 = {9, -110, 38, -119, -109, -14, PatternStyle.Weave, 100, 1, 1};

    /* JADX INFO: renamed from: jd */
    static byte[] f38037jd = {PatternStyle.Plaid, -122, 72, -122, -9, 13, 1, 9, 1};

    /* JADX INFO: renamed from: ck */
    static byte[] f38032ck = {85, 4, PatternStyle.Divot};

    /* JADX INFO: renamed from: fa */
    static byte[] f38035fa = {85, 4, 12};

    /* JADX INFO: renamed from: up */
    static byte[] f38044up = {85, 4, 4};

    /* JADX INFO: renamed from: yj */
    static byte[] f38046yj = {85, 4, PatternStyle.Plaid};

    /* JADX INFO: renamed from: ks */
    static byte[] f38040ks = {85, 4, PatternStyle.Sphere};

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f38042rv = new C7017h4("C", "O", "OU", "CN", "L", "S", "ST", "E", "DC", "UID", "DNQUALIFIER", "T", "SN", "G", "I");

    /* JADX INFO: renamed from: k4 */
    public static String m52725k4(C12842x1 c12842x1) {
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < c12842x1.m59709k4(); i++) {
            m52727k4(c6765kp, c12842x1.m59710k4(i), true);
            if (i < c12842x1.m59709k4() - 1) {
                c6765kp.m26792k4(", ");
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m52726k4(C12842x1 c12842x1, boolean z, String str, boolean z2) {
        C6765kp c6765kp = new C6765kp();
        if (z) {
            for (int iM59709k4 = c12842x1.m59709k4() - 1; iM59709k4 >= 0; iM59709k4--) {
                m52727k4(c6765kp, c12842x1.m59710k4(iM59709k4), z2);
                if (iM59709k4 > 0) {
                    c6765kp.m26792k4(str);
                }
            }
        } else {
            for (int i = 0; i < c12842x1.m59709k4(); i++) {
                m52727k4(c6765kp, c12842x1.m59710k4(i), z2);
                if (i < c12842x1.m59709k4() - 1) {
                    c6765kp.m26792k4(str);
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m52727k4(C6765kp c6765kp, C12842x1 c12842x1, boolean z) {
        C12842x1 c12842x1M59710k4;
        String str;
        String strM26681x1;
        for (int i = 0; i < c12842x1.m59709k4(); i++) {
            C12842x1 c12842x1M59710k42 = c12842x1.m59710k4(i);
            C12842x1 c12842x1M59710k43 = c12842x1M59710k42.m59710k4(1);
            if (c12842x1M59710k43 != null && (c12842x1M59710k4 = c12842x1M59710k42.m59710k4(0)) != null) {
                if (c12842x1M59710k4.m59719x1(f38038k4)) {
                    str = "C=";
                } else if (c12842x1M59710k4.m59719x1(f38045x1)) {
                    str = "O=";
                } else if (c12842x1M59710k4.m59719x1(f38039kk)) {
                    str = "OU=";
                } else if (c12842x1M59710k4.m59719x1(f38043to)) {
                    str = "CN=";
                } else if (c12842x1M59710k4.m59719x1(f38033du)) {
                    str = "L=";
                } else if (c12842x1M59710k4.m59719x1(f38036h4)) {
                    str = "S=";
                } else if (c12842x1M59710k4.m59719x1(f38041m9)) {
                    str = "STREET=";
                } else if (c12842x1M59710k4.m59719x1(f38034dy)) {
                    str = "DC=";
                } else if (c12842x1M59710k4.m59719x1(f38031c5)) {
                    str = "UID=";
                } else if (c12842x1M59710k4.m59719x1(f38037jd)) {
                    str = "E=";
                } else if (c12842x1M59710k4.m59719x1(f38032ck)) {
                    str = "dnQualifier=";
                } else if (c12842x1M59710k4.m59719x1(f38035fa)) {
                    str = "T=";
                } else if (c12842x1M59710k4.m59719x1(f38044up)) {
                    str = "SN=";
                } else if (c12842x1M59710k4.m59719x1(f38046yj)) {
                    str = "G=";
                } else if (c12842x1M59710k4.m59719x1(f38040ks)) {
                    str = "I=";
                } else {
                    c6765kp.m26792k4("OID.");
                    c6765kp.m26792k4(C12828kk.m59652x1(c12842x1M59710k4));
                    str = "=";
                }
                c6765kp.m26792k4(str);
                if (c12842x1M59710k43.m59718x1() == 30) {
                    C6765kp c6765kp2 = new C6765kp();
                    for (int i2 = 1; i2 < c12842x1M59710k43.m59717to().length; i2 += 2) {
                        c6765kp2.m26780k4((char) c12842x1M59710k43.m59717to()[i2]);
                    }
                    strM26681x1 = c6765kp2.toString();
                } else {
                    strM26681x1 = c12842x1M59710k43.m59718x1() == 20 ? AbstractC6747ar.m26642ne().m26681x1(c12842x1M59710k43.m59717to()) : AbstractC6747ar.m26635ix().m26681x1(c12842x1M59710k43.m59717to());
                    char[] cArr = {',', '+', '\"', IOUtils.DIR_SEPARATOR_WINDOWS, '<', '>', ';'};
                    if (z && (C14113y2.m67386k4(strM26681x1, cArr, 0, strM26681x1.length()) > 0 || C14113y2.m67448x1(strM26681x1, " ") || C14113y2.m67424kk(strM26681x1, " "))) {
                        strM26681x1 = C14113y2.m67408k4("\"", strM26681x1, "\"");
                    }
                }
                c6765kp.m26792k4(strM26681x1);
                if (i < c12842x1.m59709k4() - 1) {
                    c6765kp.m26792k4(", ");
                }
            }
        }
    }
}
