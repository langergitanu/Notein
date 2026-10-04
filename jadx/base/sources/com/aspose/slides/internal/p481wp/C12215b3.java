package com.aspose.slides.internal.p481wp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.b3 */
/* JADX INFO: loaded from: classes5.dex */
public class C12215b3 {

    /* JADX INFO: renamed from: k4 */
    private int f40638k4;

    /* JADX INFO: renamed from: kk */
    private int f40639kk = 0;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC1870up<List<List<C12220dy>>> f40640x1;

    public C12215b3(C12232rv c12232rv, int i) {
        this.f40638k4 = i;
        if (i != 0) {
            if (i == 1) {
                this.f40640x1 = new C1869to(c12232rv.m57092kp().m57062g8());
                return;
            } else {
                if (i != 2) {
                    throw new ArgumentException(C14113y2.m67408k4("Unrecognised TablePart: ", C14057f9.m66591x1(i)));
                }
                this.f40640x1 = new C1869to(c12232rv.m57090gi().m57062g8());
                return;
            }
        }
        List list = new List();
        AbstractC3511c5.k4 k4VarMo14080ck = c12232rv.mo14080ck();
        while (k4VarMo14080ck.mo9764x1()) {
            AbstractC3511c5 abstractC3511c5Mo14128dy = k4VarMo14080ck.mo14128dy();
            if (C7019kk.m27469x1(abstractC3511c5Mo14128dy, C12230ne.class)) {
                list.addRange(((C12230ne) abstractC3511c5Mo14128dy).m57062g8());
            }
        }
        this.f40640x1 = new C1869to(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C12219du[] m56997k4() {
        if (!this.f40640x1.mo9764x1()) {
            return null;
        }
        List<List<C12220dy>> listMo9760kk = this.f40640x1.mo9760kk();
        C12219du[] c12219duArr = new C12219du[listMo9760kk.size()];
        C1869to c1869to = new C1869to(listMo9760kk);
        int i = 0;
        while (c1869to.mo9764x1()) {
            List list = (List) c1869to.mo9760kk();
            int i2 = this.f40639kk;
            this.f40639kk = i2 + 1;
            c12219duArr[i] = new C12219du(i2, this.f40638k4, list);
            i++;
        }
        return c12219duArr;
    }
}
