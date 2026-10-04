package com.aspose.slides.internal.p140fz;

import com.aspose.slides.internal.p315od.C7024du;

/* JADX INFO: renamed from: com.aspose.slides.internal.fz.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4153x1 extends AbstractC4148k4 {

    /* JADX INFO: renamed from: x1 */
    private float f11339x1;

    public C4153x1(float f) {
        this.f11339x1 = f;
    }

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: x1 */
    public C7024du mo16588x1(float f, float f2) {
        C7024du c7024du = new C7024du();
        float f3 = (f2 * f2) + (f * f);
        if (f3 == 0.0f) {
            c7024du.f19088k4 = 0.0f;
            c7024du.f19091x1 = 0.0f;
        } else {
            float fSqrt = (float) Math.sqrt(f3);
            float f4 = this.f11339x1;
            c7024du.f19088k4 = (f2 * f4) / fSqrt;
            c7024du.f19091x1 = (-(f * f4)) / fSqrt;
        }
        c7024du.f19089kk = -c7024du.f19088k4;
        c7024du.f19090to = -c7024du.f19091x1;
        return c7024du;
    }
}
