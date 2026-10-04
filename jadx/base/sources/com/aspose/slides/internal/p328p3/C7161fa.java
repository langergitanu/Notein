package com.aspose.slides.internal.p328p3;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p109ei.AbstractC3743up;
import com.aspose.slides.internal.p372qx.C9962k4;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p460vf.C11640to;

/* JADX INFO: renamed from: com.aspose.slides.internal.p3.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C7161fa extends AbstractC3743up {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3734k4 f19307k4 = new C7165k4(this);

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC3734k4 mo15042k4() {
        return this.f19307k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.aspose.slides.internal.p109ei.AbstractC3743up
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo15039k4(C2638du c2638du) {
        boolean z;
        int[] iArrM49069k4 = C9962k4.m49069k4(c2638du.m12051jd());
        if (iArrM49069k4.length > 0) {
            z = (iArrM49069k4[iArrM49069k4.length - 1] & 128) == 128;
        }
        C10971um c10971umM54755k4 = C11640to.m54755k4(c2638du.m12051jd().m55565kk(), iArrM49069k4, z);
        c10971umM54755k4.m53099k4(C9962k4.m49061k4(c2638du.m12070rv()));
        c10971umM54755k4.m53100k4(C9962k4.m49062k4(c2638du.m12045dy()));
        ((AbstractC10957fa) c2638du.m12052k4()).m52930k4(c10971umM54755k4);
    }
}
