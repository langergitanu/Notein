package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p288n1.C6682kk;
import com.aspose.slides.internal.p399si.C10228k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13400qw;
import com.aspose.slides.internal.p539z4.C13407to;
import com.aspose.slides.internal.p539z4.C13408tq;
import com.aspose.slides.internal.p539z4.C13409ts;
import com.aspose.slides.internal.p539z4.C13425xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C7077sv extends AbstractC7052e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27598k4(C3134k4 c3134k4) {
        C13407to[] c13407toArr;
        C13425xw c13425xw = new C13425xw();
        C13409ts c13409ts = new C13409ts();
        c13409ts.mo62106k4(Integer.valueOf(c3134k4.m13386x6()));
        c13425xw.m62058k4(c13409ts);
        c13425xw.m62470k4(c3134k4.m13384uz());
        short sM13381rv = c3134k4.m13381rv();
        c13425xw.m62471k4(sM13381rv);
        c13425xw.m62478x1(c3134k4.m13381rv());
        c13425xw.m62473k4(C10228k4.m50091k4(sM13381rv, 11) ? C6682kk.m26436kk(c13425xw.m62469k4(), c3134k4) : C10228k4.m50091k4(sM13381rv, 14) ? C6682kk.m26440x1(c13425xw.m62469k4(), c3134k4) : C6682kk.m26438to(c13425xw.m62469k4(), c3134k4));
        boolean zM50091k4 = C10228k4.m50091k4(sM13381rv, 11);
        int i = 0;
        long jM62469k4 = c13425xw.m62469k4();
        if (zM50091k4) {
            int i2 = (int) jM62469k4;
            c13407toArr = new C13408tq[i2];
            while (i < i2) {
                C13408tq c13408tq = new C13408tq();
                c13408tq.m62342k4(c3134k4.m13387yj() & 255);
                c13407toArr[i] = c13408tq;
                i++;
            }
        } else {
            int i3 = (int) jM62469k4;
            c13407toArr = new C13400qw[i3];
            while (i < i3) {
                C13400qw c13400qw = new C13400qw();
                c13400qw.m62309k4(c3134k4.m13387yj() & 255);
                c13407toArr[i] = c13400qw;
                i++;
            }
        }
        c13425xw.m62479x1(c13407toArr);
        int position = (4 - ((int) c3134k4.m13371ck().getPosition())) & 3;
        if (position > 0) {
            c13425xw.m62472k4(c3134k4.m13372dy(position));
        }
        return c13425xw;
    }
}
