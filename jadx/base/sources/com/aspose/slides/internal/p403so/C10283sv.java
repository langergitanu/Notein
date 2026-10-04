package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p047bu.C1853kk;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4650qw;
import com.aspose.slides.internal.p171hq.C4657to;
import com.aspose.slides.internal.p171hq.C4658tq;
import com.aspose.slides.internal.p171hq.C4659ts;
import com.aspose.slides.internal.p171hq.C4675xw;
import com.aspose.slides.internal.p542z7.C13454kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C10283sv extends AbstractC10258e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50237k4(C3134k4 c3134k4) {
        C4657to[] c4657toArr;
        C4675xw c4675xw = new C4675xw();
        C4659ts c4659ts = new C4659ts();
        c4659ts.mo19106k4(Integer.valueOf(c3134k4.m13386x6()));
        c4675xw.m19054k4(c4659ts);
        c4675xw.m19488k4(c3134k4.m13384uz());
        short sM13381rv = c3134k4.m13381rv();
        c4675xw.m19489k4(sM13381rv);
        c4675xw.m19496x1(c3134k4.m13381rv());
        c4675xw.m19491k4(C1853kk.m9663k4(sM13381rv, 11) ? C13454kk.m62591kk(c4675xw.m19487k4(), c3134k4) : C1853kk.m9663k4(sM13381rv, 14) ? C13454kk.m62595x1(c4675xw.m19487k4(), c3134k4) : C13454kk.m62593to(c4675xw.m19487k4(), c3134k4));
        boolean zM9663k4 = C1853kk.m9663k4(sM13381rv, 11);
        int i = 0;
        long jM19487k4 = c4675xw.m19487k4();
        if (zM9663k4) {
            int i2 = (int) jM19487k4;
            c4657toArr = new C4658tq[i2];
            while (i < i2) {
                C4658tq c4658tq = new C4658tq();
                c4658tq.m19355k4(c3134k4.m13387yj() & 255);
                c4657toArr[i] = c4658tq;
                i++;
            }
        } else {
            int i3 = (int) jM19487k4;
            c4657toArr = new C4650qw[i3];
            while (i < i3) {
                C4650qw c4650qw = new C4650qw();
                c4650qw.m19316k4(c3134k4.m13387yj() & 255);
                c4657toArr[i] = c4650qw;
                i++;
            }
        }
        c4675xw.m19497x1(c4657toArr);
        int position = (4 - ((int) c3134k4.m13371ck().getPosition())) & 3;
        if (position > 0) {
            c4675xw.m19490k4(c3134k4.m13372dy(position));
        }
        return c4675xw;
    }
}
