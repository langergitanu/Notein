package com.aspose.slides.internal.p413t1;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C4988gf;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.ks */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10822ks extends AbstractC5120du {
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        C4988gf c4988gf = (C4988gf) c5061vw;
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), (int) c4988gf.m21064k4()));
        for (int i = 0; i < c12025x6Arr.length; i++) {
            c4988gf.m21069x1()[i].m58124x1().CloneTo(c12025x6Arr[i]);
        }
        if (c4201h4.m16781yj()) {
            c4201h4.m16755up().m55555k4(c12025x6Arr);
        } else if (c4201h4.m16688dy() != null) {
            mo16668k4(c12025x6Arr, c4201h4);
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return !c4201h4.m16781yj();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16668k4(C12025x6[] c12025x6Arr, C4201h4 c4201h4);
}
