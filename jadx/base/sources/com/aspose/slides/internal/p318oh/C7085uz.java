package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13358ak;
import com.aspose.slides.internal.p539z4.C13404ss;
import com.aspose.slides.internal.p539z4.C13428yd;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C7085uz extends AbstractC7052e0 {

    /* JADX INFO: renamed from: k4 */
    private final long f19218k4;

    public C7085uz(long j) {
        this.f19218k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27606k4(C3134k4 c3134k4) {
        C13428yd c13428yd = new C13428yd();
        if ((this.f19218k4 & 1) > 0) {
            c13428yd.m62493k4((C13358ak) new C7083um().m27604k4(c3134k4));
        }
        if ((this.f19218k4 & 2) > 0) {
            c13428yd.m62494k4((C13404ss) new C7049dq().m27571k4(c3134k4));
        }
        return c13428yd;
    }
}
