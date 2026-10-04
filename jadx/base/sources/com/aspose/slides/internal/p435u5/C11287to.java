package com.aspose.slides.internal.p435u5;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooOo;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.C1570m9;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12381h4;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.internal.p518y4.C12790k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.u5.to */
/* JADX INFO: loaded from: classes4.dex */
public class C11287to {

    /* JADX INFO: renamed from: k4 */
    public static final float[] f38861k4 = {16.0f, 19.5f, 22.5f, 27.5f, 33.5f, 39.5f, 48.0f, 56.5f, 68.5f, 83.0f};

    /* JADX INFO: renamed from: x1 */
    private static final float f38863x1 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1)).mo17483jd();

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f38862kk = new C7017h4("px", TranslateLanguage.PORTUGUESE, "em", "%", "ex", BackupFile.EXTENSION_NOTEIN_FILE, "cm", "mm", "pc");

    /* JADX INFO: renamed from: k4 */
    public static float m54248k4(float f) {
        return (float) C14116yg.m67479k4((f / 100.0f) * 12.0f, (short) 1);
    }

    /* JADX INFO: renamed from: kk */
    public static float m54255kk(float f) {
        return f / (72.0f / f38863x1);
    }

    /* JADX INFO: renamed from: x1 */
    public static float m54256x1(float f) {
        return f * 0.75f;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m54249k4(float f, float f2) {
        return (f / 100.0f) * f2;
    }

    /* JADX INFO: renamed from: x1 */
    public static float m54257x1(float f, float f2) {
        return f * f2;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m54250k4(C1570m9 c1570m9) {
        return m54251k4(c1570m9, 12.0f);
    }

    /* JADX INFO: renamed from: x1 */
    public static C1570m9 m54258x1(String str) {
        if (!C14113y2.m67411k4(str) && !C14113y2.m67432to(str, "auto", (short) 5)) {
            if (!C14113y2.m67432to(str, "inherit", (short) 5)) {
                IGenericList<C1570m9> iGenericListM54252k4 = m54252k4(str);
                return iGenericListM54252k4.size() == 0 ? new C1570m9(true) : iGenericListM54252k4.get_Item(0);
            }
            C1570m9 c1570m9 = new C1570m9(0.0f);
            c1570m9.m8454k4(true);
            return c1570m9;
        }
        return new C1570m9(true);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m54251k4(C1570m9 c1570m9, float f) {
        if (c1570m9.m8456kk()) {
            return f;
        }
        int iM8458x1 = c1570m9.m8458x1();
        float fM8453k4 = c1570m9.m8453k4();
        switch (iM8458x1) {
            case 0:
                return fM8453k4;
            case 1:
                return fM8453k4 * f;
            case 2:
                return (fM8453k4 * f) / 2.0f;
            case 3:
                return (fM8453k4 / 100.0f) * f;
            case 4:
                return (fM8453k4 * 72.0f) / f38863x1;
            case 5:
                return fM8453k4 * 72.0f;
            case 6:
                return (float) (((double) fM8453k4) * 28.3464567d);
            case 7:
                return (float) (((double) fM8453k4) * 2.83464567d);
            case 8:
                return fM8453k4 * 12.0f;
            default:
                return fM8453k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static IGenericList<C1570m9> m54252k4(String str) {
        C1570m9 c1570m9;
        List list = new List();
        if (C14113y2.m67411k4(str)) {
            list.addItem(new C1570m9(true));
            return list;
        }
        C12381h4 c12381h4M57979x1 = C12380dy.m57979x1(str, "([-+]?\\d*\\.?\\d+)(pt|px|em|ex|in|cm|mm|pc|%)?");
        for (int i = 0; i < c12381h4M57979x1.m57991k4(); i++) {
            C12385to c12385toM57992k4 = c12381h4M57979x1.m57992k4(i);
            if (c12385toM57992k4.mo58006to()) {
                new C1570m9(0.0f, 0, true, false);
                Object objM54247k4 = C11286m9.m54247k4(c12385toM57992k4.m58004du().m58000k4(1).mo57995kk());
                if (objM54247k4 == null) {
                    list.addItem(new C1570m9(true));
                } else {
                    float fFloatValue = ((Float) C7019kk.m27464to(objM54247k4, Float.TYPE)).floatValue();
                    switch (f38862kk.m27428k4(C14113y2.m67398k4(OooOo.OooO00o(c12385toM57992k4, 2), C11697x1.m55250kk()))) {
                        case 0:
                            c1570m9 = new C1570m9(fFloatValue, 4);
                            break;
                        case 1:
                            c1570m9 = new C1570m9(fFloatValue, 0);
                            break;
                        case 2:
                            c1570m9 = new C1570m9(fFloatValue, 1);
                            break;
                        case 3:
                            c1570m9 = new C1570m9(fFloatValue, 3);
                            break;
                        case 4:
                            c1570m9 = new C1570m9(fFloatValue, 2);
                            break;
                        case 5:
                            c1570m9 = new C1570m9(fFloatValue, 5);
                            break;
                        case 6:
                            c1570m9 = new C1570m9(fFloatValue, 6);
                            break;
                        case 7:
                            c1570m9 = new C1570m9(fFloatValue, 7);
                            break;
                        case 8:
                            c1570m9 = new C1570m9(fFloatValue, 4);
                            break;
                        default:
                            c1570m9 = new C1570m9(fFloatValue, 0);
                            break;
                    }
                    list.addItem(c1570m9);
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m54253k4(String str, float[] fArr) {
        if (C14113y2.m67411k4(str)) {
            fArr[0] = 0.0f;
            return false;
        }
        if (!C12380dy.m57978to(str, "([-+]?\\d*\\.?\\d+)(pt|px|em|ex|in|cm|mm|pc|%)?")) {
            return false;
        }
        C12385to c12385toM57970k4 = C12380dy.m57970k4(str, "([-+]?\\d*\\.?\\d+)(pt|px|em|ex|in|cm|mm|pc|%)?");
        Object objM54247k4 = C11286m9.m54247k4(OooOo.OooO00o(c12385toM57970k4, 1));
        if (objM54247k4 == null) {
            return false;
        }
        fArr[0] = ((Float) C7019kk.m27464to(objM54247k4, Float.TYPE)).floatValue();
        int iM27428k4 = f38862kk.m27428k4(C14113y2.m67398k4(OooOo.OooO00o(c12385toM57970k4, 2), C11697x1.m55250kk()));
        if (iM27428k4 == 0) {
            fArr[0] = m54256x1(fArr[0]);
        } else if (iM27428k4 == 2) {
            fArr[0] = m54257x1(fArr[0], 0.0f);
        } else if (iM27428k4 == 3) {
            fArr[0] = m54248k4(fArr[0]);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m54254k4(String str, float[] fArr, float f, C1569kk c1569kk) {
        C11284k4.m54244k4((Object) str, "value");
        if ("larger".equals(str)) {
            str = c1569kk.m8445t6().m23810bv().m26927x1().toString();
        }
        if (!C12380dy.m57978to(str, "([-+]?\\d*\\.?\\d+)(pt|px|em|ex|in|cm|mm|pc|%)?")) {
            return false;
        }
        C12385to c12385toM57970k4 = C12380dy.m57970k4(str, "([-+]?\\d*\\.?\\d+)(pt|px|em|ex|in|cm|mm|pc|%)?");
        Object objM54247k4 = C11286m9.m54247k4(OooOo.OooO00o(c12385toM57970k4, 1));
        if (objM54247k4 == null) {
            return false;
        }
        fArr[0] = ((Float) C7019kk.m27464to(objM54247k4, Float.TYPE)).floatValue();
        int iM27428k4 = f38862kk.m27428k4(C14113y2.m67398k4(OooOo.OooO00o(c12385toM57970k4, 2), C11697x1.m55250kk()));
        if (iM27428k4 == 0) {
            fArr[0] = m54256x1(fArr[0]);
        } else if (iM27428k4 == 2) {
            if (c1569kk.m8452xw() != null && c1569kk.m8452xw().mo22608fa() == 1) {
                f = new C12790k4(c1569kk.m8452xw()).m59461x1();
            }
            fArr[0] = m54257x1(fArr[0], f);
        } else if (iM27428k4 == 3) {
            fArr[0] = m54249k4(fArr[0], f);
        }
        return true;
    }
}
