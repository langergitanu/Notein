package com.aspose.slides.internal.p328p3;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p109ei.AbstractC3728du;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p251li.C6052dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p372qx.C9962k4;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p460vf.C11640to;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.p3.to */
/* JADX INFO: loaded from: classes4.dex */
public class C7171to extends AbstractC3728du {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3734k4 f19317k4 = new C7165k4(this);

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC3734k4 mo15042k4() {
        return this.f19317k4;
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3728du
    /* JADX INFO: renamed from: k4 */
    public void mo15015k4(C6052dy c6052dy, C2638du c2638du) {
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c6052dy.m24487c5()));
        for (int i = 0; i < c6052dy.m24489jd().length; i++) {
            c6052dy.m24489jd()[i].mo19089k4().CloneTo(c12025x6Arr[i]);
        }
        C10971um c10971umM54753k4 = C11640to.m54753k4(c12025x6Arr);
        c10971umM54753k4.m53099k4(C9962k4.m49061k4(c2638du.m12070rv()));
        if (c2638du.m12045dy() != null) {
            c10971umM54753k4.m53100k4(C9962k4.m49062k4(c2638du.m12045dy()));
        }
        ((AbstractC10957fa) c2638du.m12052k4()).m52930k4(c10971umM54753k4);
    }
}
