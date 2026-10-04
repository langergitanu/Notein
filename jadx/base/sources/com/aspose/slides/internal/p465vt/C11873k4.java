package com.aspose.slides.internal.p465vt;

import com.aspose.slides.internal.p046bs.C1847du;
import com.aspose.slides.internal.p046bs.C1850to;
import com.aspose.slides.internal.p046bs.InterfaceC1849kk;
import com.aspose.slides.internal.p048bv.C1865ks;
import com.aspose.slides.internal.p048bv.C1873yj;
import com.aspose.slides.internal.p048bv.InterfaceC1859dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.vt.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11873k4 implements InterfaceC1859dy {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC1849kk f39992k4;

    public C11873k4(InterfaceC1849kk interfaceC1849kk) {
        this.f39992k4 = interfaceC1849kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static C1850to m55453k4(C1873yj c1873yj) {
        return new C1850to(c1873yj.m9792k4());
    }

    /* JADX INFO: renamed from: k4 */
    private static C1865ks m55454k4(C1847du c1847du) {
        C1865ks c1865ks = new C1865ks(c1847du.m9634k4(), c1847du.m9635kk());
        c1865ks.m9752k4(c1847du.m9637x1());
        c1865ks.m9753k4(c1847du.m9636to());
        return c1865ks;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1859dy
    /* JADX INFO: renamed from: k4 */
    public final C1865ks mo9717k4(Object obj, C1873yj c1873yj) {
        return m55454k4(this.f39992k4.mo9646k4(obj, m55453k4(c1873yj)));
    }
}
