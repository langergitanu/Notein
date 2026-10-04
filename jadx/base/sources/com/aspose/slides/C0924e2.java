package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.e2 */
/* JADX INFO: loaded from: classes3.dex */
class C0924e2 extends AbstractC7020m9<C0924e2> {
    /* JADX INFO: renamed from: x1 */
    private boolean m5333x1(C0924e2 c0924e2) {
        return true;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C0924e2) {
            return m5333x1((C0924e2) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C0924e2 Clone() {
        C0924e2 c0924e2 = new C0924e2();
        CloneTo(c0924e2);
        return c0924e2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m5332k4(C12003du c12003du, float f) {
        float fOooO0O0;
        float fOooO0O02;
        float fOooO0O03;
        if (f == 0.0f) {
            return c12003du;
        }
        float fM56507jd = c12003du.m56507jd() & 255;
        float fM56502ck = c12003du.m56502ck() & 255;
        float fM56505fa = c12003du.m56505fa() & 255;
        if (f < 0.0f) {
            float f2 = f + 1.0f;
            fOooO0O0 = fM56507jd * f2;
            fOooO0O02 = fM56502ck * f2;
            fOooO0O03 = fM56505fa * f2;
        } else {
            fOooO0O0 = OooOO0.OooO0OO.OooO0O0(255.0f, fM56507jd, f, fM56507jd);
            fOooO0O02 = OooOO0.OooO0OO.OooO0O0(255.0f, fM56502ck, f, fM56502ck);
            fOooO0O03 = OooOO0.OooO0OO.OooO0O0(255.0f, fM56505fa, f, fM56505fa);
        }
        return C12003du.m56398k4(c12003du.m56501c5() & 255, C7019kk.m27462to(Float.valueOf(fOooO0O0), 13), C7019kk.m27462to(Float.valueOf(fOooO0O02), 13), C7019kk.m27462to(Float.valueOf(fOooO0O03), 13));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C0924e2 c0924e2) {
    }
}
