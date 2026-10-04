package com.aspose.slides.internal.p049bx;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p488x0.C12354yj;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.bx.up */
/* JADX INFO: loaded from: classes3.dex */
public class C1890up extends AbstractC1875ck {
    /* JADX INFO: renamed from: k4 */
    public void m9810k4(C3149x1 c3149x1, C12535to c12535to) {
        C12354yj c12354yj = (C12354yj) c12535to;
        c3149x1.m13446k4(c12354yj.m57890k4() & 65535);
        if ((c12354yj.m57890k4() & 65535) != 768) {
            c3149x1.m13442k4().seek(c12354yj.m57890k4() & 65535, 0);
        }
        c3149x1.m13446k4(c12354yj.m57894x1() & 65535);
        for (int i = 0; i < (c12354yj.m57894x1() & 65535); i++) {
            new C1878fa().m9796k4(c3149x1, c12354yj.m57893kk()[i]);
        }
    }
}
