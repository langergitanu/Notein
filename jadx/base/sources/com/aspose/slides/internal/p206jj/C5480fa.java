package com.aspose.slides.internal.p206jj;

import com.aspose.slides.internal.p019ac.AbstractC1349ne;
import com.aspose.slides.internal.p019ac.C1359x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p319ok.C7102du;
import com.aspose.slides.internal.p498xe.C12505dy;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.jj.fa */
/* JADX INFO: loaded from: classes.dex */
public class C5480fa extends AbstractC5496yj {
    /* JADX INFO: renamed from: k4 */
    public AbstractC1349ne m22570k4(C3134k4 c3134k4) {
        C1359x6 c1359x6 = new C1359x6();
        c1359x6.m8043k4(c3134k4.m13384uz() & 4294967295L);
        c1359x6.m8053x1(c3134k4.m13384uz());
        c1359x6.m8042k4((int) (c3134k4.m13384uz() & C18177fb.f54859s));
        c1359x6.m8044k4((C12505dy) new C7102du().m27622k4(c3134k4));
        c1359x6.m8048kk(c3134k4.m13384uz());
        c1359x6.m8051to(c3134k4.m13384uz());
        if ((c1359x6.m8037dy() & 4294967295L) > 0) {
            c1359x6.m8045k4(new long[(int) c1359x6.m8037dy()]);
            for (int i = 0; i < (c1359x6.m8037dy() & 4294967295L); i++) {
                c1359x6.m8036c5()[i] = c3134k4.m13384uz();
            }
        }
        return c1359x6;
    }
}
