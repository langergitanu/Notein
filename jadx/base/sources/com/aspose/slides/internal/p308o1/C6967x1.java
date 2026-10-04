package com.aspose.slides.internal.p308o1;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11903ks;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.o1.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6967x1 {
    /* JADX INFO: renamed from: k4 */
    public static C11896dy m27238k4(C11896dy c11896dy, C11913yj c11913yj) {
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        if (!c11913yj.m55789x1()) {
            c11896dy2.m55577x1(c11913yj);
            C11903ks c11903ksM55573x1 = c11896dy2.m55573x1();
            C12025x6[] c12025x6ArrM55672k4 = c11903ksM55573x1.m55672k4();
            for (C12025x6 c12025x6 : c12025x6ArrM55672k4) {
                c12025x6.m56891k4(Math.round(c12025x6.m56897x1()));
                c12025x6.m56898x1(Math.round(c12025x6.m56895kk()));
            }
            c11896dy2 = new C11896dy(c12025x6ArrM55672k4, c11903ksM55573x1.m55673x1());
        }
        c11896dy2.m55541k4((C11913yj) null, 0.25f);
        return c11896dy2;
    }
}
