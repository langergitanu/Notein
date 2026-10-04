package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7445cv;
import com.aspose.slides.internal.p332p7.C7534e4;
import com.aspose.slides.internal.p332p7.C7943in;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class rrr {
    /* JADX INFO: renamed from: k4 */
    public static void m70333k4(fre freVar, AbstractC4685kk<C7943in> abstractC4685kk) {
        if (m70335k4(freVar)) {
            C7943in c7943inInvoke = abstractC4685kk.invoke();
            C7445cv c7445cvM34313k4 = c7943inInvoke.m34313k4();
            if (!C14064he.m66715kk(freVar.getX())) {
                c7445cvM34313k4.m29957x1().m29596k4(freVar.getX());
            }
            if (!C14064he.m66715kk(freVar.getY())) {
                c7445cvM34313k4.m29950kk().m29596k4(freVar.getY());
            }
            if (!C7019kk.m27469x1(freVar, C0799b6.class)) {
                if (!C14064he.m66715kk(freVar.getWidth())) {
                    c7445cvM34313k4.m29954to().m29596k4(freVar.getWidth());
                }
                if (!C14064he.m66715kk(freVar.getHeight())) {
                    c7445cvM34313k4.m29942du().m29596k4(freVar.getHeight());
                }
                C7534e4 c7534e4M6286h4 = freVar.m6286h4();
                if (c7534e4M6286h4 == null) {
                    c7534e4M6286h4 = new C7534e4();
                    c7534e4M6286h4.m30788k4(1);
                }
                c7445cvM34313k4.m29949k4(c7534e4M6286h4);
                C7534e4 c7534e4M6291m9 = freVar.m6291m9();
                if (c7534e4M6291m9 == null) {
                    c7534e4M6291m9 = new C7534e4();
                    c7534e4M6291m9.m30788k4(1);
                }
                c7445cvM34313k4.m29958x1(c7534e4M6291m9);
            }
            c7445cvM34313k4.m29955to(freVar.m6283c5());
            c7445cvM34313k4.m29951kk(freVar.m6285dy());
            if (C7019kk.m27469x1(freVar, C14361qv.class)) {
                c7445cvM34313k4.m29947k4().m44306k4(freVar.getChart().getPlotArea().getLayoutTargetType() != 0 ? 2 : 1);
            }
            c7943inInvoke.m34314k4(freVar.m6287jd());
            c7445cvM34313k4.m29948k4(freVar.m6284ck());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70334k4(fre freVar, C7943in c7943in) {
        C7445cv c7445cvM34316x1;
        float fM29595k4;
        float fM29595k42;
        if (c7943in == null || (c7445cvM34316x1 = c7943in.m34316x1()) == null || !m70336k4(c7445cvM34316x1)) {
            return;
        }
        if (C7019kk.m27469x1(freVar, C14361qv.class) && c7445cvM34316x1.m29953m9() == null) {
            freVar.setX(Float.NaN);
        } else if (c7445cvM34316x1.m29941ck() != null) {
            freVar.setX((float) c7445cvM34316x1.m29941ck().m29595k4());
        }
        if (C7019kk.m27469x1(freVar, C14361qv.class) && c7445cvM34316x1.m29943dy() == null) {
            freVar.setY(Float.NaN);
        } else if (c7445cvM34316x1.m29944fa() != null) {
            freVar.setY((float) c7445cvM34316x1.m29944fa().m29595k4());
        }
        if (c7445cvM34316x1.m29956up() != null) {
            if (c7445cvM34316x1.m29940c5() == null || c7445cvM34316x1.m29940c5().m30787k4() != 1) {
                fM29595k42 = (float) c7445cvM34316x1.m29956up().m29595k4();
            } else {
                if (c7445cvM34316x1.m29941ck() == null) {
                    throw new NotImplementedException();
                }
                fM29595k42 = (float) (c7445cvM34316x1.m29956up().m29595k4() + c7445cvM34316x1.m29941ck().m29595k4());
            }
            freVar.setWidth(fM29595k42);
        }
        if (c7445cvM34316x1.m29959yj() != null) {
            if (c7445cvM34316x1.m29946jd() == null || c7445cvM34316x1.m29946jd().m30787k4() != 1) {
                fM29595k4 = (float) c7445cvM34316x1.m29959yj().m29595k4();
            } else {
                if (c7445cvM34316x1.m29944fa() == null) {
                    throw new NotImplementedException();
                }
                fM29595k4 = (float) (c7445cvM34316x1.m29959yj().m29595k4() + c7445cvM34316x1.m29944fa().m29595k4());
            }
            freVar.setHeight(fM29595k4);
        }
        if (c7445cvM34316x1.m29953m9() != null) {
            freVar.m6288k4(c7445cvM34316x1.m29953m9());
        }
        if (c7445cvM34316x1.m29943dy() != null) {
            freVar.m6294x1(c7445cvM34316x1.m29943dy());
        }
        if (c7445cvM34316x1.m29946jd() != null) {
            freVar.m6292to(c7445cvM34316x1.m29946jd());
        }
        if (c7445cvM34316x1.m29940c5() != null) {
            freVar.m6290kk(c7445cvM34316x1.m29940c5());
        }
        if (C7019kk.m27469x1(freVar, C14361qv.class) && c7445cvM34316x1.m29945h4() != null) {
            freVar.getChart().getPlotArea().setLayoutTargetType(c7445cvM34316x1.m29945h4().m44305k4() != 2 ? 0 : 1);
        }
        if (c7943in.m34315kk() != null) {
            freVar.m6293x1(c7943in.m34315kk());
        }
        if (c7445cvM34316x1.m29952ks() != null) {
            freVar.m6289kk(c7445cvM34316x1.m29952ks());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m70335k4(fre freVar) {
        return (C14064he.m66715kk(freVar.getX()) && C14064he.m66715kk(freVar.getY()) && C14064he.m66715kk(freVar.getWidth()) && C14064he.m66715kk(freVar.getHeight())) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m70336k4(C7445cv c7445cv) {
        if (c7445cv.m29941ck() != null && ((c7445cv.m29941ck().m29595k4() < 0.0d || c7445cv.m29941ck().m29595k4() > 1.0d) && c7445cv.m29953m9() != null && c7445cv.m29953m9().m30787k4() == 1)) {
            return false;
        }
        if (c7445cv.m29944fa() != null && ((c7445cv.m29944fa().m29595k4() < 0.0d || c7445cv.m29944fa().m29595k4() > 1.0d) && c7445cv.m29943dy() != null && c7445cv.m29943dy().m30787k4() == 1)) {
            return false;
        }
        if (c7445cv.m29959yj() == null || (c7445cv.m29959yj().m29595k4() >= 0.0d && c7445cv.m29959yj().m29595k4() <= 1.0d)) {
            return c7445cv.m29956up() == null || (c7445cv.m29956up().m29595k4() >= 0.0d && c7445cv.m29956up().m29595k4() <= 1.0d);
        }
        return false;
    }
}
