package com.aspose.slides.internal.p043bp;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6101zj;
import com.aspose.slides.internal.p292n5.AbstractC6744x1;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.bp.vh */
/* JADX INFO: loaded from: classes3.dex */
public class C1822vh extends AbstractC6744x1 {
    @Override // com.aspose.slides.internal.p292n5.AbstractC6744x1
    /* JADX INFO: renamed from: x1 */
    public void mo9558x1(C6045bz c6045bz, AbstractC3150x6 abstractC3150x6) {
        C6101zj c6101zj = (C6101zj) c6045bz;
        C3149x1 c3149x1 = new C3149x1(abstractC3150x6);
        boolean zM24733kk = c6101zj.m24733kk();
        int i = 0;
        C12014ne[] c12014neArrM24730dy = c6101zj.m24730dy();
        if (zM24733kk) {
            int length = c12014neArrM24730dy.length;
            while (i < length) {
                C12014ne c12014ne = c12014neArrM24730dy[i];
                c3149x1.m13443k4((byte) c12014ne.m56669jd());
                c3149x1.m13443k4((byte) c12014ne.m56664ck());
                c3149x1.m13443k4((byte) c12014ne.m56663c5());
                c3149x1.m13443k4((byte) c12014ne.m56683x1());
                i++;
            }
            return;
        }
        int length2 = c12014neArrM24730dy.length;
        while (i < length2) {
            C12014ne c12014ne2 = c12014neArrM24730dy[i];
            c3149x1.m13448k4((short) c12014ne2.m56669jd());
            c3149x1.m13448k4((short) c12014ne2.m56664ck());
            c3149x1.m13448k4((short) c12014ne2.m56663c5());
            c3149x1.m13448k4((short) c12014ne2.m56683x1());
            i++;
        }
    }
}
