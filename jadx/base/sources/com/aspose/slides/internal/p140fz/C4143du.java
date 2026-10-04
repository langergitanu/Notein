package com.aspose.slides.internal.p140fz;

import com.aspose.slides.internal.p315od.C7024du;

/* JADX INFO: renamed from: com.aspose.slides.internal.fz.du */
/* JADX INFO: loaded from: classes.dex */
public class C4143du extends AbstractC4148k4 {

    /* JADX INFO: renamed from: kk */
    private boolean f11319kk;

    /* JADX INFO: renamed from: x1 */
    private float f11320x1;

    public C4143du(float f, boolean z) {
        this.f11320x1 = f;
        this.f11319kk = z;
    }

    @Override // com.aspose.slides.internal.p140fz.AbstractC4148k4, com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: kk */
    public boolean mo16589kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: x1 */
    public C7024du mo16588x1(float f, float f2) {
        C7024du c7024du = new C7024du();
        float f3 = (f2 * f2) + (f * f);
        if (f3 == 0.0f) {
            c7024du.f19088k4 = 0.0f;
            c7024du.f19091x1 = 0.0f;
            c7024du.f19089kk = 0.0f;
            c7024du.f19090to = 0.0f;
            return c7024du;
        }
        float fSqrt = (float) Math.sqrt(f3);
        c7024du.f19088k4 = 0.0f;
        c7024du.f19091x1 = 0.0f;
        float f4 = this.f11320x1;
        float f5 = ((f2 * 2.0f) * f4) / fSqrt;
        c7024du.f19089kk = f5;
        float f6 = (-((f * 2.0f) * f4)) / fSqrt;
        c7024du.f19090to = f6;
        if (!this.f11319kk) {
            c7024du.f19089kk = -f5;
            c7024du.f19090to = -f6;
        }
        return c7024du;
    }
}
