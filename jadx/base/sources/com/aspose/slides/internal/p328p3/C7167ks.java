package com.aspose.slides.internal.p328p3;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p109ei.AbstractC3740rv;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p251li.C6061ix;
import com.aspose.slides.internal.p306ny.C6963x1;
import com.aspose.slides.internal.p311o4.C6975k4;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p372qx.C9962k4;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p3.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C7167ks extends AbstractC3740rv {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3734k4 f19312k4 = new C7165k4(this);

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC3734k4 mo15042k4() {
        return this.f19312k4;
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3740rv
    /* JADX INFO: renamed from: k4 */
    public void mo15036k4(C6061ix c6061ix, C12007ix c12007ix, C12013m9 c12013m9, C12019um c12019um, C2638du c2638du) {
        C12019um c12019um2;
        C5659x1 c5659x1M48331k4 = C9763ck.m48030to().m48331k4(c12013m9.m56648m9(), c12013m9.m56639dy(), c12013m9.m56642jd());
        C4328x1 c4328x1M49063k4 = C9962k4.m49063k4(c2638du.m12066ks());
        C4320jd c4320jd = new C4320jd(C5656k4.f15629ze);
        String[] strArrM67414k4 = C14113y2.m67414k4(c6061ix.m24522fa(), '\n');
        for (int i = 0; i < strArrM67414k4.length; i++) {
            strArrM67414k4[i] = C14113y2.m67401k4(strArrM67414k4[i], "\r", "");
        }
        if (strArrM67414k4.length > 0 && C14113y2.m67411k4(strArrM67414k4[strArrM67414k4.length - 1])) {
            String[] strArr = new String[strArrM67414k4.length - 1];
            System.arraycopy(strArrM67414k4, 0, strArr, 0, strArrM67414k4.length - 1);
            strArrM67414k4 = strArr;
        }
        int i2 = 0;
        while (i2 < strArrM67414k4.length) {
            if (C14113y2.m67411k4(strArrM67414k4[i2]) || c12007ix.m56550c5() <= 0.0f) {
                c12019um2 = c12019um;
            } else {
                c12019um2 = c12019um;
                C6963x1 c6963x1 = new C6963x1(c12019um2);
                try {
                    strArrM67414k4[i2] = C6975k4.m27279k4(c6963x1, strArrM67414k4[i2], c5659x1M48331k4, c12007ix.Clone());
                } finally {
                    c6963x1.dispose();
                }
            }
            int i3 = i2;
            C4328x1 c4328x1 = c4328x1M49063k4;
            C10963ks c10963ks = new C10963ks(c5659x1M48331k4, c4328x1, c4320jd, C10963ks.m52975k4(strArrM67414k4[i2], c5659x1M48331k4, c12007ix.Clone(), c12019um2, i2, strArrM67414k4.length).Clone().Clone(), strArrM67414k4[i3], C12015qq.f40552k4.Clone(), 0.0f);
            c10963ks.m52984k4(C9962k4.m49061k4(c2638du.m12070rv()));
            ((AbstractC10957fa) c2638du.m12052k4()).m52930k4(c10963ks);
            i2 = i3 + 1;
            c4328x1M49063k4 = c4328x1;
        }
    }
}
