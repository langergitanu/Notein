package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p110ek.C3749k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4646nv;
import com.aspose.slides.internal.p171hq.C4673x6;
import com.aspose.slides.internal.p171hq.C4677y9;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.w6 */
/* JADX INFO: loaded from: classes4.dex */
public class C10295w6 extends AbstractC10258e0 {

    /* JADX INFO: renamed from: k4 */
    private final C4646nv f36722k4;

    public C10295w6(C4646nv c4646nv) {
        this.f36722k4 = c4646nv;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50249k4(C3134k4 c3134k4) {
        C4677y9 c4677y9 = new C4677y9();
        if (this.f36722k4.m19278yj() > 0) {
            c4677y9.m19505k4(C3749k4.m15051kk(this.f36722k4.m19278yj(), c3134k4));
        }
        if (this.f36722k4.m19251jd() > 0) {
            int iM19251jd = this.f36722k4.m19251jd();
            C4673x6[] c4673x6Arr = new C4673x6[iM19251jd];
            for (int i = 0; i < iM19251jd; i++) {
                c4673x6Arr[i] = (C4673x6) new C10254ck().m50209k4(c3134k4);
            }
            c4677y9.m19506k4(c4673x6Arr);
        }
        return c4677y9;
    }
}
