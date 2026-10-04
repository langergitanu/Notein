package com.aspose.slides.internal.p140fz;

import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p340pm.C9464du;
import com.aspose.slides.internal.p340pm.C9466kk;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.fz.up */
/* JADX INFO: loaded from: classes.dex */
public class C4152up extends AbstractC4148k4 {

    /* JADX INFO: renamed from: kk */
    private C9464du f11337kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f11338x1;

    public C4152up(boolean z, C9464du c9464du) {
        this.f11338x1 = z;
        this.f11337kk = c9464du;
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
        c7024du.f19088k4 = 0.0f;
        c7024du.f19091x1 = 0.0f;
        if (f3 == 0.0f) {
            c7024du.f19089kk = 0.0f;
            c7024du.f19090to = 0.0f;
            return c7024du;
        }
        float[] fArrM46503k4 = this.f11337kk.m46503k4(f, f2);
        float f4 = -fArrM46503k4[0];
        float f5 = -fArrM46503k4[1];
        C9466kk.k4 k4VarM46515k4 = C9466kk.m46515k4(new C12025x6(0.0f, 0.0f), new C12025x6(f, f2), new C12025x6(f4, f5));
        if (this.f11338x1 ? k4VarM46515k4 != C9466kk.k4.RIGHT : k4VarM46515k4 != C9466kk.k4.LEFT) {
            f4 = -f4;
            f5 = -f5;
        }
        c7024du.f19089kk = f4 * 2.0f;
        c7024du.f19090to = f5 * 2.0f;
        return c7024du;
    }
}
