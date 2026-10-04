package com.aspose.slides.internal.p077d8;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.b3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3036b3 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f8901k4 = new C7017h4("Choice", "Fallback", ContextChain.TAG_PRODUCT, "a");

    /* JADX INFO: renamed from: k4 */
    private static int m12774k4(C3112yj c3112yj) {
        int i = 2;
        while (i < c3112yj.m13266k4() && !"AlternateContent".equals(c3112yj.m13267k4(i).f9184h4)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C3042ca m12775k4(AbstractC3150x6 abstractC3150x6, boolean z) {
        return m12776k4(abstractC3150x6, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0714 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3042ca m12776k4(AbstractC3150x6 abstractC3150x6, boolean z, boolean z2) {
        C3081ri c3081ri;
        C6765kp c6765kp;
        int iMo13056h4;
        String string;
        String str;
        boolean z3;
        boolean zEquals;
        int i;
        int iM12774k4;
        C3093up c3093upM13267k4;
        C3093up c3093upM13267k42;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str2;
        String string2;
        char cMo13056h4;
        String str3;
        String str4;
        C6765kp c6765kp2;
        char c;
        int i7;
        C3081ri c3081ri2 = new C3081ri(abstractC3150x6);
        C3042ca c3042ca = new C3042ca();
        C3112yj c3112yj = new C3112yj();
        C3087to c3087to = new C3087to();
        C6765kp c6765kp3 = new C6765kp();
        while (true) {
            int iMo13056h42 = c3081ri2.mo13056h4();
            if (iMo13056h42 < 0) {
                return c3042ca;
            }
            if (iMo13056h42 == 60) {
                int iM13057k4 = c3081ri2.m13057k4() - 1;
                c6765kp3.m26809x1(0, c6765kp3.m26807x1());
                char cMo13056h42 = (char) c3081ri2.mo13056h4();
                char c2 = '>';
                char c3 = ControlChar.SPACE_CHAR;
                if (cMo13056h42 != '!') {
                    String str5 = "Choice";
                    String str6 = "http://schemas.openxmlformats.org/markup-compatibility/2006";
                    char c4 = IOUtils.DIR_SEPARATOR_UNIX;
                    if (cMo13056h42 == '/') {
                        c3081ri = c3081ri2;
                        c6765kp = c6765kp3;
                        C3093up c3093upM13271kk = c3112yj.m13271kk();
                        if (c3093upM13271kk.f9181du != null) {
                            for (int i8 = 0; i8 < c3093upM13271kk.f9181du.length(); i8++) {
                                if (c3081ri.mo13056h4() != c3093upM13271kk.f9181du.charAt(i8)) {
                                    throw new Exception(C14113y2.m67402k4("Non matching element close tag: expected </{0}:{1}>", c3093upM13271kk.f9181du, c3093upM13271kk.f9184h4));
                                }
                            }
                            if (c3081ri.mo13056h4() != 58) {
                                throw new Exception(C14113y2.m67402k4("Non matching element close tag: expected </{0}:{1}>", c3093upM13271kk.f9181du, c3093upM13271kk.f9184h4));
                            }
                        }
                        for (int i9 = 0; i9 < c3093upM13271kk.f9184h4.length(); i9++) {
                            if (c3081ri.mo13056h4() != c3093upM13271kk.f9184h4.charAt(i9)) {
                                throw new Exception(C14113y2.m67402k4("Non matching element close tag: expected </{0}>", c3093upM13271kk.f9184h4));
                            }
                        }
                        char cMo13056h43 = (char) c3081ri.mo13056h4();
                        while (cMo13056h43 <= ' ') {
                            cMo13056h43 = (char) c3081ri.mo13056h4();
                        }
                        if (cMo13056h43 != '>') {
                            throw new Exception(C14113y2.m67402k4("Non matching element close tag: expected </{0}>", c3093upM13271kk.f9184h4));
                        }
                        int iM13057k42 = c3081ri.m13057k4();
                        String str7 = c3093upM13271kk.f9181du;
                        if (str7 != null && "http://schemas.openxmlformats.org/markup-compatibility/2006".equals(c3112yj.m13268k4(str7)) && (("Choice".equals(c3093upM13271kk.f9184h4) || "Fallback".equals(c3093upM13271kk.f9184h4)) && c3093upM13271kk.f9189to == 0 && !c3093upM13271kk.f9187kk)) {
                            int i10 = c3093upM13271kk.f9188m9;
                            c3042ca.m12827k4(i10, iM13057k42 - i10);
                        }
                        if (c3093upM13271kk.f9186k4) {
                            if (c3112yj.m13270k4(c3093upM13271kk.f9181du, c3093upM13271kk.f9184h4)) {
                                int i11 = c3093upM13271kk.f9188m9;
                                c3042ca.m12827k4(i11, c3093upM13271kk.f9182dy - i11);
                                c3042ca.m12827k4(iM13057k4, iM13057k42 - iM13057k4);
                            } else {
                                int i12 = c3093upM13271kk.f9188m9;
                                c3042ca.m12827k4(i12, iM13057k42 - i12);
                            }
                        }
                    } else if (cMo13056h42 != '?') {
                        c6765kp3.m26809x1(0, c6765kp3.m26807x1());
                        while (cMo13056h42 > ' ' && cMo13056h42 != '/' && cMo13056h42 != '>' && cMo13056h42 != ':') {
                            c6765kp3.m26780k4(cMo13056h42);
                            int iMo13056h43 = c3081ri2.mo13056h4();
                            if (iMo13056h43 < 0) {
                                throw new Exception("Error in element name.");
                            }
                            cMo13056h42 = (char) iMo13056h43;
                        }
                        String string3 = c6765kp3.toString();
                        int i13 = 1;
                        if (cMo13056h42 == ':') {
                            c6765kp3.m26809x1(0, c6765kp3.m26807x1());
                            int iMo13056h44 = c3081ri2.mo13056h4();
                            do {
                                cMo13056h42 = (char) iMo13056h44;
                                if (cMo13056h42 <= ' ' || cMo13056h42 == '/' || cMo13056h42 == '>') {
                                    string = c6765kp3.toString();
                                    str = string3;
                                } else {
                                    c6765kp3.m26780k4(cMo13056h42);
                                    iMo13056h44 = c3081ri2.mo13056h4();
                                }
                            } while (iMo13056h44 >= 0);
                            throw new Exception("Error in element name.");
                        }
                        string = string3;
                        str = null;
                        if (z && c3112yj.m13266k4() == 0) {
                            c3042ca.m12828k4(C3083s7.f9153kk, c3081ri2.m13057k4() - 1);
                        }
                        while (cMo13056h42 <= ' ') {
                            cMo13056h42 = (char) c3081ri2.mo13056h4();
                        }
                        C3093up c3093up = new C3093up(str, string);
                        c3087to.m13120x1();
                        while (cMo13056h42 != c4 && cMo13056h42 != c2) {
                            c6765kp3.m26809x1(0, c6765kp3.m26807x1());
                            int iM13057k43 = c3081ri2.m13057k4() - 1;
                            while (cMo13056h42 > c3 && cMo13056h42 != '=' && cMo13056h42 != ':') {
                                c6765kp3.m26780k4(cMo13056h42);
                                int iMo13056h45 = c3081ri2.mo13056h4();
                                if (iMo13056h45 < 0) {
                                    throw new Exception("Error in attribute name.");
                                }
                                cMo13056h42 = (char) iMo13056h45;
                            }
                            String string4 = c6765kp3.toString();
                            if (cMo13056h42 == ':') {
                                c6765kp3.m26809x1(0, c6765kp3.m26807x1());
                                int iMo13056h46 = c3081ri2.mo13056h4();
                                do {
                                    cMo13056h42 = (char) iMo13056h46;
                                    if (cMo13056h42 <= c3 || cMo13056h42 == '=') {
                                        str2 = str5;
                                        string2 = c6765kp3.toString();
                                    } else {
                                        c6765kp3.m26780k4(cMo13056h42);
                                        iMo13056h46 = c3081ri2.mo13056h4();
                                    }
                                } while (iMo13056h46 >= 0);
                                throw new Exception("Error in attribute name.");
                            }
                            str2 = str5;
                            string2 = string4;
                            string4 = null;
                            while (cMo13056h42 <= c3) {
                                cMo13056h42 = (char) c3081ri2.mo13056h4();
                            }
                            if (cMo13056h42 != '=') {
                                throw new Exception("Error in attribute syntax.");
                            }
                            do {
                                cMo13056h4 = (char) c3081ri2.mo13056h4();
                            } while (cMo13056h4 <= ' ');
                            if (cMo13056h4 != '\'' && cMo13056h4 != '\"') {
                                throw new Exception("Error in attribute syntax.");
                            }
                            int iM13057k44 = c3081ri2.m13057k4();
                            C3081ri c3081ri3 = c3081ri2;
                            c6765kp3.m26809x1(0, c6765kp3.m26807x1());
                            int iMo13056h47 = c3081ri3.mo13056h4();
                            while (iMo13056h47 >= 0 && iMo13056h47 != cMo13056h4) {
                                if (iMo13056h47 > 31) {
                                    c6765kp3.m26780k4((char) iMo13056h47);
                                    i7 = i13;
                                } else {
                                    i7 = i13;
                                    c3042ca.m12827k4(c3081ri3.m13057k4() - 1, i7);
                                }
                                iMo13056h47 = c3081ri3.mo13056h4();
                                i13 = i7;
                            }
                            int i14 = i13;
                            if (iMo13056h47 != cMo13056h4) {
                                throw new Exception("Unexpected EOF in attribute value.");
                            }
                            int iM13057k45 = c3081ri3.m13057k4() - i14;
                            String str8 = str6;
                            String string5 = c6765kp3.toString();
                            char cMo13056h44 = (char) c3081ri3.mo13056h4();
                            while (cMo13056h44 <= ' ') {
                                cMo13056h44 = (char) c3081ri3.mo13056h4();
                            }
                            int iM13057k46 = c3081ri3.m13057k4() - 1;
                            if ("xmlns".equals(string4)) {
                                if ("http://schemas.microsoft.com/office/powerpoint/2007/7/12/main".equals(string5)) {
                                    c3042ca.m12827k4(iM13057k44, iM13057k45 - iM13057k44);
                                    c3042ca.m12828k4(C3083s7.f9154x1, iM13057k44);
                                }
                                c3093up.m13140k4(string2, string5);
                                str3 = str8;
                                str4 = str2;
                                c6765kp2 = c6765kp3;
                                c = IOUtils.DIR_SEPARATOR_UNIX;
                            } else {
                                String str9 = string4;
                                str3 = str8;
                                str4 = str2;
                                c6765kp2 = c6765kp3;
                                c = IOUtils.DIR_SEPARATOR_UNIX;
                                c3087to.m13119k4(str9, string2, string5, iM13057k43, iM13057k46, c3042ca, z2);
                            }
                            str5 = str4;
                            c4 = c;
                            str6 = str3;
                            cMo13056h42 = cMo13056h44;
                            c6765kp3 = c6765kp2;
                            c3081ri2 = c3081ri3;
                            i13 = 1;
                            c2 = '>';
                            c3 = ControlChar.SPACE_CHAR;
                        }
                        c3081ri = c3081ri2;
                        String str10 = str5;
                        String str11 = str6;
                        c6765kp = c6765kp3;
                        if (cMo13056h42 != c4) {
                            z3 = false;
                        } else {
                            if (c3081ri.mo13056h4() != 62) {
                                throw new Exception("Error in element.");
                            }
                            z3 = true;
                        }
                        int iM13057k47 = c3081ri.m13057k4();
                        c3093up.f9188m9 = iM13057k4;
                        c3093up.f9182dy = iM13057k47;
                        c3112yj.m13269k4(c3093up);
                        String str12 = c3093up.f9181du;
                        if (str12 != null) {
                            if (str11.equals(c3112yj.m13268k4(str12))) {
                                int iM27428k4 = f8901k4.m27428k4(c3093up.f9184h4);
                                if (iM27428k4 == 0) {
                                    C3093up c3093upM13267k43 = c3112yj.m13267k4(1);
                                    if (!"AlternateContent".equals(c3093upM13267k43.f9184h4)) {
                                        throw new Exception("Choice element found not within AlternativeContent");
                                    }
                                    if (c3093upM13267k43.f9189to != 0) {
                                        c3093up.f9189to = 0;
                                    } else {
                                        int i15 = 0;
                                        while (i15 < c3087to.m13117k4()) {
                                            C3066kk c3066kkM13118k4 = c3087to.m13118k4(i15);
                                            if (c3066kkM13118k4.f9103k4 == null && "Requires".equals(c3066kkM13118k4.f9106x1)) {
                                                c3093up.f9189to = 1;
                                                int i16 = 0;
                                                String strM67443x1 = null;
                                                while (true) {
                                                    if (i16 >= c3066kkM13118k4.f9104kk.length()) {
                                                        i4 = i15;
                                                        i5 = 0;
                                                        i6 = Integer.MAX_VALUE;
                                                        break;
                                                    }
                                                    while (true) {
                                                        if (i16 >= c3066kkM13118k4.f9104kk.length()) {
                                                            i6 = Integer.MAX_VALUE;
                                                            break;
                                                        }
                                                        i6 = Integer.MAX_VALUE;
                                                        if (c3066kkM13118k4.f9104kk.charAt(i16) > ' ') {
                                                            break;
                                                        }
                                                        i16++;
                                                    }
                                                    int i17 = i16;
                                                    while (true) {
                                                        if (i17 >= c3066kkM13118k4.f9104kk.length()) {
                                                            i4 = i15;
                                                            break;
                                                        }
                                                        i4 = i15;
                                                        if (c3066kkM13118k4.f9104kk.charAt(i17) <= ' ') {
                                                            break;
                                                        }
                                                        i17++;
                                                        i15 = i4;
                                                    }
                                                    if (i17 > i16) {
                                                        strM67443x1 = C14113y2.m67443x1(c3066kkM13118k4.f9104kk, i16, i17 - i16);
                                                        if (!c3112yj.m13273to(strM67443x1)) {
                                                            i5 = 0;
                                                            c3093up.f9189to = 0;
                                                            break;
                                                        }
                                                    }
                                                    i16 = i17;
                                                    i15 = i4;
                                                }
                                                if (c3093up.f9189to != 0) {
                                                    c3093upM13267k43.f9189to = 1;
                                                    int[] iArr = new int[1];
                                                    iArr[i5] = i5;
                                                    boolean zM13141k4 = c3093upM13267k43.m13141k4(strM67443x1, iArr);
                                                    int i18 = iArr[i5];
                                                    if (zM13141k4) {
                                                        c3093up.f9189to = i6 - i18;
                                                    } else {
                                                        iArr[i5] = i18;
                                                        boolean zM13141k42 = c3093up.m13141k4(strM67443x1, iArr);
                                                        int i19 = iArr[i5];
                                                        if (zM13141k42) {
                                                            int i20 = i6;
                                                            c3093upM13267k43.f9189to = i20;
                                                            c3093up.f9189to = i20 - i19;
                                                        } else {
                                                            c3093up.f9189to = i5;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i4 = i15;
                                            }
                                            i15 = i4 + 1;
                                        }
                                    }
                                } else if (iM27428k4 == 1) {
                                    C3093up c3093upM13267k44 = c3112yj.m13267k4(1);
                                    if (!"AlternateContent".equals(c3093upM13267k44.f9184h4)) {
                                        throw new Exception("Fallback element found not within AlternativeContent");
                                    }
                                    if (c3093upM13267k44.f9189to == 0 || c3093upM13267k44.f9187kk) {
                                        c3093up.f9189to = 1;
                                        c3093upM13267k44.f9189to = 1;
                                    } else {
                                        c3093up.f9189to = 0;
                                    }
                                }
                            } else if (c3112yj.m13266k4() > 2) {
                                C3093up c3093upM13267k45 = c3112yj.m13267k4(2);
                                if ("AlternateContent".equals(c3093upM13267k45.f9184h4)) {
                                    C3093up c3093upM13267k46 = c3112yj.m13267k4(1);
                                    if (str10.equals(c3093upM13267k46.f9184h4) && (i2 = c3093upM13267k45.f9189to) != 0 && (i3 = c3093upM13267k46.f9189to) != 0) {
                                        String strM13138k4 = i2 == Integer.MAX_VALUE ? c3093upM13267k46.m13138k4(Integer.MAX_VALUE - i3) : c3093upM13267k45.m13138k4(Integer.MAX_VALUE - i3);
                                        int i21 = 0;
                                        while (true) {
                                            C3034ar c3034ar = C3083s7.f9152k4;
                                            if (i21 >= c3034ar.m12771k4()) {
                                                break;
                                            }
                                            if (C14113y2.m67363du(strM13138k4, c3034ar.m12772k4(i21).m13026x1()) && c3034ar.m12772k4(i21).m13025kk() != C3079qq.m13023k4() && !c3034ar.m12772k4(i21).m13025kk().containsItem(c3093up.f9184h4)) {
                                                c3093upM13267k45.f9189to = 0;
                                                c3093upM13267k46.f9189to = 0;
                                            }
                                            i21++;
                                        }
                                    }
                                }
                            }
                        }
                        int iM27428k42 = f8901k4.m27428k4(c3093up.f9181du);
                        if (iM27428k42 != 2) {
                            zEquals = iM27428k42 != 3 ? false : "tbl".equals(c3093up.f9184h4);
                            if (zEquals && (iM12774k4 = m12774k4(c3112yj)) < c3112yj.m13266k4()) {
                                c3093upM13267k4 = c3112yj.m13267k4(iM12774k4);
                                if (c3093upM13267k4.f9186k4 && c3093upM13267k4.f9191x1 != null) {
                                    m12778k4(c3042ca, c3093upM13267k4);
                                }
                                c3093upM13267k42 = c3112yj.m13267k4(iM12774k4 - 1);
                                if (str10.equals(c3093upM13267k42.f9184h4) && c3093upM13267k42.f9186k4 && c3093upM13267k42.f9191x1 != null) {
                                    m12778k4(c3042ca, c3093upM13267k42);
                                }
                            }
                            if (str != null || !c3112yj.m13275x1(str)) {
                                for (i = 0; i < c3087to.m13117k4(); i++) {
                                    C3066kk c3066kkM13118k42 = c3087to.m13118k4(i);
                                    String str13 = c3066kkM13118k42.f9103k4;
                                    if (str13 != null) {
                                        String strM13268k4 = c3112yj.m13268k4(str13);
                                        if (str11.equals(strM13268k4) || c3112yj.m13272kk(strM13268k4)) {
                                            int i22 = c3066kkM13118k42.f9105to;
                                            c3042ca.m12827k4(i22, c3066kkM13118k42.f9102du - i22);
                                        }
                                        if (str11.equals(strM13268k4)) {
                                            if ("Ignorable".equals(c3066kkM13118k42.f9106x1)) {
                                                int i23 = 0;
                                                while (i23 < c3066kkM13118k42.f9104kk.length()) {
                                                    while (i23 < c3066kkM13118k42.f9104kk.length() && c3066kkM13118k42.f9104kk.charAt(i23) <= ' ') {
                                                        i23++;
                                                    }
                                                    int i24 = i23;
                                                    while (i24 < c3066kkM13118k42.f9104kk.length() && c3066kkM13118k42.f9104kk.charAt(i24) > ' ') {
                                                        i24++;
                                                    }
                                                    if (i24 > i23) {
                                                        c3093up.m13139k4(c3112yj.m13268k4(C14113y2.m67443x1(c3066kkM13118k42.f9104kk, i23, i24 - i23)));
                                                    }
                                                    i23 = i24;
                                                }
                                            } else if ("ProcessContent".equals(c3066kkM13118k42.f9106x1)) {
                                                int i25 = 0;
                                                while (i25 < c3066kkM13118k42.f9104kk.length()) {
                                                    while (i25 < c3066kkM13118k42.f9104kk.length() && c3066kkM13118k42.f9104kk.charAt(i25) <= ' ') {
                                                        i25++;
                                                    }
                                                    int i26 = i25;
                                                    while (i26 < c3066kkM13118k42.f9104kk.length() && c3066kkM13118k42.f9104kk.charAt(i26) > ' ') {
                                                        if (c3066kkM13118k42.f9104kk.charAt(i26) == ':') {
                                                            break;
                                                        }
                                                        i26++;
                                                    }
                                                    int i27 = i26 + 1;
                                                    int i28 = i27;
                                                    while (i28 < c3066kkM13118k42.f9104kk.length() && c3066kkM13118k42.f9104kk.charAt(i28) > ' ') {
                                                        i28++;
                                                    }
                                                    if (i28 > i27 && i26 > i25) {
                                                        String strM67443x12 = C14113y2.m67443x1(c3066kkM13118k42.f9104kk, i27, (i28 - i26) - 1);
                                                        String strM13268k42 = c3112yj.m13268k4(C14113y2.m67443x1(c3066kkM13118k42.f9104kk, i25, i26 - i25));
                                                        if (C18358t1.g.f56183c.equals(strM67443x12)) {
                                                            strM67443x12 = null;
                                                        }
                                                        c3093up.m13145x1(strM13268k42, strM67443x12);
                                                    }
                                                    i25 = i28;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z3) {
                                }
                            } else if (c3112yj.m13266k4() > 2) {
                                C3093up c3093upM13267k47 = c3112yj.m13267k4(1);
                                boolean z4 = "AlternateContent".equals(c3093upM13267k47.f9184h4) && c3093upM13267k47.f9187kk;
                                if (!z4) {
                                    c3093up.f9186k4 = true;
                                    int i29 = c3093up.f9188m9;
                                    c3093up.f9191x1 = new C3116zj(i29, new C3032ai(i29, c3093up.f9182dy, null));
                                    int i30 = c3093up.f9188m9;
                                    c3042ca.m12827k4(i30, c3093up.f9182dy - i30);
                                }
                                while (i < c3087to.m13117k4()) {
                                }
                                if (z3) {
                                }
                            }
                        } else {
                            if ("sp".equals(c3093up.f9184h4) || "graphicFrame".equals(c3093up.f9184h4) || "contentPart".equals(c3093up.f9184h4)) {
                                zEquals = true;
                            }
                            if (zEquals) {
                                c3093upM13267k4 = c3112yj.m13267k4(iM12774k4);
                                if (c3093upM13267k4.f9186k4) {
                                    m12778k4(c3042ca, c3093upM13267k4);
                                }
                                c3093upM13267k42 = c3112yj.m13267k4(iM12774k4 - 1);
                                if (str10.equals(c3093upM13267k42.f9184h4)) {
                                    m12778k4(c3042ca, c3093upM13267k42);
                                }
                            }
                            if (str != null) {
                                while (i < c3087to.m13117k4()) {
                                }
                                if (z3) {
                                }
                            }
                        }
                    } else {
                        c3081ri = c3081ri2;
                        c6765kp = c6765kp3;
                        char c5 = '>';
                        char c6 = ControlChar.SPACE_CHAR;
                        while (true) {
                            if (cMo13056h42 != c5 || c6 != '?') {
                                int iMo13056h48 = c3081ri.mo13056h4();
                                if (iMo13056h48 < 0) {
                                    throw new Exception("EOF in processing directive.");
                                }
                                c6 = cMo13056h42;
                                c5 = '>';
                                cMo13056h42 = (char) iMo13056h48;
                            }
                        }
                    }
                    c3112yj.m13274x1();
                } else {
                    c3081ri = c3081ri2;
                    c6765kp = c6765kp3;
                    char cMo13056h45 = (char) c3081ri.mo13056h4();
                    if (cMo13056h45 == '[') {
                        do {
                            iMo13056h4 = c3081ri.mo13056h4();
                            if (iMo13056h4 == 91) {
                                break;
                            }
                        } while (iMo13056h4 > 0);
                        while (true) {
                            char c7 = c3;
                            c3 = cMo13056h45;
                            if (c3 == ']' || c7 == ']') {
                                break;
                            }
                            int iMo13056h49 = c3081ri.mo13056h4();
                            if (iMo13056h49 < 0) {
                                throw new Exception("EOF in comment.");
                            }
                            cMo13056h45 = (char) iMo13056h49;
                        }
                    } else if (cMo13056h45 != '!') {
                        continue;
                    } else {
                        if (c3081ri.mo13056h4() != 45) {
                            throw new Exception("Error in comment.");
                        }
                        while (true) {
                            char c8 = c3;
                            c3 = cMo13056h45;
                            if (c3 == '-' || c8 == '-') {
                                break;
                            }
                            int iMo13056h410 = c3081ri.mo13056h4();
                            if (iMo13056h410 < 0) {
                                throw new Exception("EOF in comment.");
                            }
                            cMo13056h45 = (char) iMo13056h410;
                        }
                        if (c3081ri.mo13056h4() != 62) {
                            throw new Exception("Error in comment.");
                        }
                    }
                }
            } else {
                c3081ri = c3081ri2;
                c6765kp = c6765kp3;
            }
            c6765kp3 = c6765kp;
            c3081ri2 = c3081ri;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3150x6 m12777k4(AbstractC3150x6 abstractC3150x6) {
        boolean z;
        String strM66952k4;
        int iMo13056h4;
        int iMo13056h42;
        C3148wl c3148wl = new C3148wl(abstractC3150x6);
        AbstractC6747ar abstractC6747arMo13440x1 = c3148wl.mo13440x1();
        C3152yj c3152yj = new C3152yj();
        C3123ar c3123ar = new C3123ar(c3152yj, abstractC6747arMo13440x1);
        while (true) {
            int iMo13056h43 = c3148wl.mo13056h4();
            if (iMo13056h43 < 0) {
                break;
            }
            c3123ar.mo13302k4((char) iMo13056h43);
            if (iMo13056h43 == 60) {
                int iMo13056h44 = c3148wl.mo13056h4();
                c3123ar.mo13302k4((char) iMo13056h44);
                if (iMo13056h44 == 33) {
                    int iMo13056h45 = c3148wl.mo13056h4();
                    if (iMo13056h45 < 0) {
                        break;
                    }
                    if (iMo13056h45 == 91) {
                        int iMo13056h46 = c3148wl.mo13056h4();
                        if (iMo13056h46 < 0) {
                            c3123ar.mo13302k4((char) iMo13056h45);
                            break;
                        }
                        if (iMo13056h46 == 67) {
                            c3123ar.mo13302k4((char) iMo13056h45);
                            c3123ar.mo13302k4((char) iMo13056h46);
                            do {
                                z = true;
                                while (true) {
                                    int iMo13056h47 = c3148wl.mo13056h4();
                                    if (iMo13056h47 >= 0) {
                                        c3123ar.mo13302k4((char) iMo13056h47);
                                        if (iMo13056h47 == 93) {
                                            break;
                                        }
                                        z = false;
                                    }
                                }
                            } while (!z);
                        } else {
                            C6765kp c6765kp = new C6765kp();
                            c6765kp.m26780k4((char) iMo13056h45);
                            c6765kp.m26780k4((char) iMo13056h46);
                            char c = ' ';
                            while (c != ']') {
                                int iMo13056h48 = c3148wl.mo13056h4();
                                if (iMo13056h48 < 0) {
                                    break;
                                }
                                c = (char) iMo13056h48;
                                c6765kp.m26780k4(c);
                            }
                            while (true) {
                                int iMo13055du = c3148wl.mo13055du();
                                if (iMo13055du < 0 || (iMo13055du > 32 && iMo13055du != 45)) {
                                    break;
                                }
                                c3148wl.mo13056h4();
                                c6765kp.m26780k4((char) iMo13055du);
                            }
                            c3123ar.mo13304k4("-- ");
                            strM66952k4 = C14080ne.m66952k4(AbstractC6747ar.m26635ix().mo26677to(c6765kp.toString()));
                            c3123ar.mo13304k4(strM66952k4);
                            c3123ar.mo13304k4(" --");
                        }
                    } else if (iMo13056h45 == 45) {
                        C6765kp c6765kp2 = new C6765kp();
                        c6765kp2.m26780k4((char) iMo13056h45);
                        int iMo13056h49 = c3148wl.mo13056h4();
                        if (iMo13056h49 < 0) {
                            break;
                        }
                        c6765kp2.m26780k4((char) iMo13056h49);
                        do {
                            iMo13056h4 = c3148wl.mo13056h4();
                            if (iMo13056h4 < 0) {
                                break;
                            }
                            c6765kp2.m26780k4((char) iMo13056h4);
                        } while (iMo13056h4 <= 32);
                        if (iMo13056h4 == 91) {
                            char c2 = ' ';
                            while (c2 != ']' && c2 != '-') {
                                int iMo13056h410 = c3148wl.mo13056h4();
                                if (iMo13056h410 < 0) {
                                    break;
                                }
                                c2 = (char) iMo13056h410;
                                c6765kp2.m26780k4(c2);
                            }
                            while (true) {
                                int iMo13055du2 = c3148wl.mo13055du();
                                if (iMo13055du2 < 0 || (iMo13055du2 > 32 && iMo13055du2 != 45)) {
                                    break;
                                }
                                c3148wl.mo13056h4();
                                c6765kp2.m26780k4((char) iMo13055du2);
                            }
                            c3123ar.mo13304k4("-- ");
                            strM66952k4 = C14080ne.m66952k4(AbstractC6747ar.m26635ix().mo26677to(c6765kp2.toString()));
                            c3123ar.mo13304k4(strM66952k4);
                            c3123ar.mo13304k4(" --");
                        } else {
                            while (true) {
                                int i = 0;
                                while (true) {
                                    iMo13056h42 = c3148wl.mo13056h4();
                                    if (iMo13056h42 < 0 || (iMo13056h42 == 62 && i >= 2)) {
                                        break;
                                    }
                                    c6765kp2.m26780k4((char) iMo13056h42);
                                    if (iMo13056h42 == 45) {
                                        i++;
                                    }
                                }
                            }
                            c3123ar.mo13304k4("-- ");
                            c3123ar.mo13304k4(C14080ne.m66952k4(AbstractC6747ar.m26635ix().mo26677to(c6765kp2.toString())));
                            c3123ar.mo13304k4(" --");
                            if (iMo13056h42 >= 0) {
                                c3123ar.mo13302k4((char) iMo13056h42);
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        c3123ar.mo13308kk();
        c3152yj.seek(0L, 0);
        return c3152yj;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m12778k4(C3042ca c3042ca, C3093up c3093up) {
        c3093up.f9186k4 = false;
        c3093up.f9187kk = true;
        C3116zj c3116zj = c3093up.f9191x1;
        int i = c3116zj.f9253k4;
        c3042ca.m12829k4(null, i, c3116zj.f9254x1.f8885x1, i);
    }
}
