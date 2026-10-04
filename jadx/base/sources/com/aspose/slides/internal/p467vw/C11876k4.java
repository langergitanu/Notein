package com.aspose.slides.internal.p467vw;

import com.aspose.slides.internal.p046bs.C1847du;
import com.aspose.slides.internal.p046bs.C1850to;
import com.aspose.slides.internal.p046bs.InterfaceC1849kk;
import com.aspose.slides.internal.p231kk.C5801ss;
import com.aspose.slides.internal.p231kk.C5811wp;
import com.aspose.slides.internal.p231kk.InterfaceC5815xk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.vw.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11876k4 implements InterfaceC5815xk {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC1849kk f39994k4;

    public C11876k4(InterfaceC1849kk interfaceC1849kk) {
        this.f39994k4 = interfaceC1849kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static C1850to m55460k4(C5811wp c5811wp) {
        return new C1850to(c5811wp.m23710k4());
    }

    /* JADX INFO: renamed from: k4 */
    private static C5801ss m55461k4(C1847du c1847du) {
        return (C14113y2.m67411k4(c1847du.m9636to()) || (!C14113y2.m67411k4(c1847du.m9636to()) && "text/css".equals(c1847du.m9636to()))) ? new C5801ss(c1847du.m9634k4(), c1847du.m9635kk()) : new C5801ss(null);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5815xk
    /* JADX INFO: renamed from: k4 */
    public final C5801ss mo14413k4(Object obj, C5811wp c5811wp) {
        return m55461k4(this.f39994k4.mo9646k4(obj, m55460k4(c5811wp)));
    }
}
