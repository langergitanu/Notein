package com.aspose.slides.internal.p064cj;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p147ga.C4249yj;
import com.aspose.slides.internal.p310o3.AbstractC6973k4;
import com.aspose.slides.internal.p349q3.C9705sv;
import com.aspose.slides.internal.p349q3.C9723vw;

/* JADX INFO: renamed from: com.aspose.slides.internal.cj.c6 */
/* JADX INFO: loaded from: classes3.dex */
public class C2449c6 extends AbstractC6973k4 {
    @Override // com.aspose.slides.internal.p310o3.AbstractC6973k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo11861x1(C9723vw c9723vw, C3149x1 c3149x1) {
        AbstractC6973k4.m27276k4(c9723vw, c3149x1);
        C9705sv c9705sv = (C9705sv) c9723vw;
        c3149x1.m13447k4(c9705sv.m47649k4() & 4294967295L);
        c3149x1.m13447k4(c9705sv.m47654x1() & 4294967295L);
        if ((c9705sv.m47649k4() & 4294967295L) <= 0) {
            return true;
        }
        new C4249yj().m17078k4(c3149x1, c9705sv.m47653kk());
        return true;
    }
}
