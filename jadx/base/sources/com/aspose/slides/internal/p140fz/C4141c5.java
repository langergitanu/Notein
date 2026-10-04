package com.aspose.slides.internal.p140fz;

import com.aspose.slides.internal.p315od.C7024du;

/* JADX INFO: renamed from: com.aspose.slides.internal.fz.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C4141c5 extends C4151to {

    /* JADX INFO: renamed from: du */
    private float f11316du;

    /* JADX INFO: renamed from: to */
    private float f11317to;

    public C4141c5(float f, float f2, float f3, float f4, float f5) {
        super(f, f2, f3);
        this.f11317to = f4;
        this.f11316du = f5;
    }

    @Override // com.aspose.slides.internal.p140fz.C4151to, com.aspose.slides.internal.p140fz.AbstractC4148k4, com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: k4 */
    public C7024du mo16587k4(float f, float f2) {
        C7024du c7024duMo16587k4 = super.mo16587k4(f, f2);
        m16586k4(c7024duMo16587k4);
        return c7024duMo16587k4;
    }

    @Override // com.aspose.slides.internal.p140fz.C4151to, com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: x1 */
    public C7024du mo16588x1(float f, float f2) {
        C7024du c7024duMo16588x1 = super.mo16588x1(f, f2);
        m16586k4(c7024duMo16588x1);
        return c7024duMo16588x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m16586k4(C7024du c7024du) {
        float f = c7024du.f19088k4;
        float f2 = this.f11317to;
        c7024du.f19088k4 = f * f2;
        float f3 = c7024du.f19091x1;
        float f4 = this.f11316du;
        c7024du.f19091x1 = f3 * f4;
        c7024du.f19089kk *= f2;
        c7024du.f19090to *= f4;
    }
}
