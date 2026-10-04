package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
class gz8 {
    /* JADX INFO: renamed from: k4 */
    public static void m6949k4(IEffectFormat iEffectFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        if (iEffectFormat == null) {
            throw new ArgumentNullException("effectFormat");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        C14461sm.m70670k4(iEffectFormat, rsvVar, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6950k4(IFillFormat iFillFormat, com.aspose.slides.internal.p332p7.nk7 nk7Var, wxb wxbVar) {
        if (iFillFormat == null) {
            throw new ArgumentNullException("fillFormat");
        }
        if (nk7Var == null) {
            throw new ArgumentNullException("pagePropertiesContent");
        }
        C13706jy.m63566k4(iFillFormat, nk7Var, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6951k4(IFillFormat iFillFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        if (iFillFormat == null) {
            throw new ArgumentNullException("fillFormat");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        C13706jy.m63567k4(iFillFormat, rsvVar, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6952k4(ILineFormat iLineFormat, IFillFormat iFillFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        if (iLineFormat == null) {
            throw new ArgumentNullException("lineFormat");
        }
        if (iFillFormat == null) {
            throw new ArgumentNullException("fillFormat");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        eem.m5506k4(iLineFormat, rsvVar, wxbVar);
        C13706jy.m63567k4(iFillFormat, rsvVar, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6953k4(ILineFormat iLineFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        if (iLineFormat == null) {
            throw new ArgumentNullException("lineFormat");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        eem.m5506k4(iLineFormat, rsvVar, wxbVar);
    }
}
