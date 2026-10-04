package com.aspose.slides.internal.p140fz;

import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p340pm.C9464du;

/* JADX INFO: renamed from: com.aspose.slides.internal.fz.ck */
/* JADX INFO: loaded from: classes.dex */
public class C4142ck extends AbstractC4148k4 {

    /* JADX INFO: renamed from: x1 */
    private C9464du f11318x1;

    public C4142ck(C9464du c9464du) {
        this.f11318x1 = c9464du;
    }

    @Override // com.aspose.slides.internal.p140fz.InterfaceC4146h4
    /* JADX INFO: renamed from: x1 */
    public C7024du mo16588x1(float f, float f2) {
        C7024du c7024du = new C7024du();
        if ((f2 * f2) + (f * f) == 0.0f) {
            c7024du.f19088k4 = 0.0f;
            c7024du.f19091x1 = 0.0f;
        } else {
            float[] fArrM46503k4 = this.f11318x1.m46503k4(f, f2);
            c7024du.f19088k4 = fArrM46503k4[0];
            c7024du.f19091x1 = fArrM46503k4[1];
        }
        c7024du.f19089kk = -c7024du.f19088k4;
        c7024du.f19090to = -c7024du.f19091x1;
        return c7024du;
    }
}
