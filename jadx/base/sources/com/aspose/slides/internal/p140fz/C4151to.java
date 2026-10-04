package com.aspose.slides.internal.p140fz;

import com.aspose.slides.internal.p315od.C7024du;

/* JADX INFO: renamed from: com.aspose.slides.internal.fz.to */
/* JADX INFO: loaded from: classes.dex */
public class C4151to extends AbstractC4148k4 {

    /* JADX INFO: renamed from: kk */
    protected float f11334kk;

    /* JADX INFO: renamed from: to */
    private float f11335to;

    /* JADX INFO: renamed from: x1 */
    protected float f11336x1;

    public C4151to(float f, float f2, float f3) {
        this.f11335to = f;
        this.f11336x1 = f2;
        this.f11334kk = f3;
    }

    @Override // com.aspose.slides.internal.p140fz.AbstractC4148k4, com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: k4 */
    public C7024du mo16587k4(float f, float f2) {
        return m16613k4(f, f2, 1.0f - this.f11336x1, 1.0f - this.f11334kk);
    }

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: x1 */
    public C7024du mo16588x1(float f, float f2) {
        return m16613k4(f, f2, this.f11336x1, this.f11334kk);
    }

    /* JADX INFO: renamed from: k4 */
    public C7024du m16613k4(float f, float f2, float f3, float f4) {
        C7024du c7024du = new C7024du();
        float f5 = (f2 * f2) + (f * f);
        if (f5 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f5);
            float f6 = this.f11335to;
            float f7 = (f2 * f6) / fSqrt;
            float f8 = (-(f * f6)) / fSqrt;
            float f9 = (-f7) - f7;
            c7024du.f19088k4 = (f9 * f3) + f7;
            float f10 = (-f8) - f8;
            c7024du.f19091x1 = (f3 * f10) + f8;
            c7024du.f19089kk = (f9 * f4) + f7;
            c7024du.f19090to = (f10 * f4) + f8;
        }
        return c7024du;
    }
}
