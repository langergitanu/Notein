package com.aspose.slides.internal.p140fz;

import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p340pm.C9464du;

/* JADX INFO: renamed from: com.aspose.slides.internal.fz.fa */
/* JADX INFO: loaded from: classes.dex */
public class C4145fa extends AbstractC4148k4 {

    /* JADX INFO: renamed from: kk */
    private final float f11324kk;

    /* JADX INFO: renamed from: to */
    private final C9464du f11325to;

    /* JADX INFO: renamed from: x1 */
    private final float f11326x1;

    public C4145fa(float f, float f2, C9464du c9464du) {
        this.f11326x1 = f;
        this.f11324kk = f2;
        this.f11325to = c9464du;
    }

    @Override // com.aspose.slides.internal.p140fz.AbstractC4148k4, com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: k4 */
    public C7024du mo16587k4(float f, float f2) {
        return m16590k4(f, f2, 1.0f - this.f11326x1, 1.0f - this.f11324kk);
    }

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: x1 */
    public C7024du mo16588x1(float f, float f2) {
        return m16590k4(f, f2, this.f11326x1, this.f11324kk);
    }

    /* JADX INFO: renamed from: k4 */
    private C7024du m16590k4(float f, float f2, float f3, float f4) {
        C7024du c7024du = new C7024du();
        if ((f2 * f2) + (f * f) != 0.0f) {
            float[] fArrM46503k4 = this.f11325to.m46503k4(f, f2);
            float f5 = fArrM46503k4[0];
            float f6 = fArrM46503k4[1];
            float f7 = (-f5) - f5;
            c7024du.f19088k4 = (f7 * f3) + f5;
            float f8 = (-f6) - f6;
            c7024du.f19091x1 = (f3 * f8) + f6;
            c7024du.f19089kk = (f7 * f4) + f5;
            c7024du.f19090to = (f8 * f4) + f6;
        }
        return c7024du;
    }
}
