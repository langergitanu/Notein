package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.cx */
/* JADX INFO: loaded from: classes3.dex */
class C0873cx {
    /* JADX INFO: renamed from: k4 */
    public static float m4838k4(fqc fqcVar) {
        if (fqcVar.getIndent() >= 0.0f) {
            return fqcVar.getMarginLeft();
        }
        float marginLeft = fqcVar.getMarginLeft() + fqcVar.getIndent();
        if (marginLeft >= 0.0f) {
            return marginLeft;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m4839k4(nrw nrwVar) {
        float marginLeft;
        fqc fqcVar = nrwVar.f47603k4;
        if (t5o.m70967k4(nrwVar)) {
            marginLeft = fqcVar.getMarginLeft() + fqcVar.getIndent();
            if (fqcVar.getIndent() < 0.0f) {
                marginLeft = marginLeft >= 0.0f ? fqcVar.getMarginLeft() : -fqcVar.getIndent();
            }
        } else {
            marginLeft = fqcVar.getMarginLeft() + fqcVar.getIndent();
        }
        if (marginLeft > 0.0f) {
            return t5o.m70967k4(nrwVar) ? marginLeft + 0.05f : marginLeft;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m4840k4(nrw nrwVar, float f) {
        return C14116yg.m67481k4(0.0f, C14116yg.m67481k4(m4838k4(nrwVar.f47603k4) + f, m4839k4(nrwVar)));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m4841k4(String str, boolean z) {
        if (!z) {
            return str;
        }
        String[] strArr = {str};
        C3047dy.m12865k4(strArr);
        return strArr[0];
    }
}
