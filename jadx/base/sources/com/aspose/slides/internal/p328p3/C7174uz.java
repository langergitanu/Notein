package com.aspose.slides.internal.p328p3;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p109ei.AbstractC3745wl;
import com.aspose.slides.internal.p171hq.AbstractC4619du;
import com.aspose.slides.internal.p251li.C6099yd;
import com.aspose.slides.internal.p372qx.C9962k4;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.C10971um;

/* JADX INFO: renamed from: com.aspose.slides.internal.p3.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C7174uz extends AbstractC3745wl {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3734k4 f19320k4 = new C7165k4(this);

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC3734k4 mo15042k4() {
        return this.f19320k4;
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3745wl
    /* JADX INFO: renamed from: k4 */
    public void mo15041k4(C6099yd c6099yd, C2638du c2638du) {
        for (AbstractC4619du abstractC4619du : c6099yd.m24705dy()) {
            C10971um c10971umM53087k4 = C10971um.m53087k4(abstractC4619du.mo19058k4().Clone());
            c10971umM53087k4.m53099k4(C9962k4.m49061k4(c2638du.m12070rv()));
            c10971umM53087k4.m53101k4(C9962k4.m49063k4(c2638du.m12066ks()));
            ((AbstractC10957fa) c2638du.m12052k4()).m52930k4(c10971umM53087k4);
        }
    }
}
