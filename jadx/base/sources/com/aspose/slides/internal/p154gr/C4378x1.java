package com.aspose.slides.internal.p154gr;

import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p274mh.AbstractC6384k4;
import com.aspose.slides.internal.p274mh.C6385kk;
import com.aspose.slides.internal.p316of.C7035kk;
import com.aspose.slides.internal.p316of.C7037to;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.gr.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4378x1 {
    /* JADX INFO: renamed from: k4 */
    public static int m17681k4(AbstractC4584k4 abstractC4584k4, String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (!abstractC4584k4.mo18933k4(cCharAt)) {
                if (!Character.isHighSurrogate(cCharAt) || !abstractC4584k4.mo18938x1(str.codePointAt(i))) {
                    return i;
                }
                i++;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: x1 */
    public static float[] m17688x1(AbstractC12008jd abstractC12008jd, C12013m9 c12013m9) {
        return abstractC12008jd == null ? new float[]{0.0f} : new float[]{((c12013m9.m56639dy() * 0.4f) + 9.5f) * C7035kk.m27493k4(c12013m9, ControlChar.SPACE_CHAR)};
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17682k4(C12013m9 c12013m9, String str) {
        return m17681k4(c12013m9.m56647ks(), str);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4584k4 m17683k4(String str, float f, AbstractC6384k4 abstractC6384k4) {
        AbstractC4584k4[] abstractC4584k4ArrM26212x1 = abstractC6384k4.m26212x1(str);
        abstractC4584k4 = abstractC4584k4ArrM26212x1 != null ? abstractC4584k4ArrM26212x1[0] : null;
        if (abstractC4584k4 == null) {
            for (AbstractC4584k4 abstractC4584k4 : new C6385kk().m26212x1(C7037to.m27506k4(1).m56527du())) {
            }
        }
        return abstractC4584k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m17684k4(AbstractC12008jd abstractC12008jd, C12013m9 c12013m9) {
        double dM17615k4;
        if (!C4375kk.m17630k4(c12013m9.m56640fa())) {
            float fMo17579up = abstractC12008jd.mo17579up();
            if (abstractC12008jd.mo17605yj() == 1) {
                fMo17579up = 1.0f;
            }
            dM17615k4 = C4375kk.m17615k4(c12013m9.m56640fa(), abstractC12008jd.mo17605yj(), (abstractC12008jd.mo17474ck() / C4375kk.m17633to()) * (c12013m9.m56639dy() / fMo17579up));
        } else if (C4375kk.m17630k4(abstractC12008jd.mo17605yj())) {
            dM17615k4 = c12013m9.m56639dy();
        } else {
            dM17615k4 = (abstractC12008jd.mo17474ck() / C4375kk.m17633to()) * c12013m9.m56639dy();
        }
        return C12013m9.m56631k4(c12013m9, (float) dM17615k4, abstractC12008jd.mo17605yj());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m17685k4(C12013m9 c12013m9, C12019um c12019um, int i) {
        return c12013m9;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m17686k4(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        while (true) {
            int i = length - 1;
            if (length <= 0 || !(str.charAt(i) == ' ' || str.charAt(i) == '\t' || str.charAt(i) == '\r' || str.charAt(i) == '\n')) {
                break;
            }
            length = i;
        }
        return length == str.length() ? str : str.substring(0, length);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m17687k4(C12013m9 c12013m9) {
        return false;
    }
}
