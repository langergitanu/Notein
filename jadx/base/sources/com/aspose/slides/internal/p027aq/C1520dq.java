package com.aspose.slides.internal.p027aq;

import com.aspose.slides.internal.p047bu.C1853kk;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4607ai;
import com.aspose.slides.internal.p171hq.C4622em;
import com.aspose.slides.internal.p171hq.C4650qw;
import com.aspose.slides.internal.p171hq.C4658tq;
import com.aspose.slides.internal.p171hq.C4675xw;
import com.aspose.slides.internal.p171hq.C4681zj;
import com.aspose.slides.internal.p292n5.C6743to;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.aq.dq */
/* JADX INFO: loaded from: classes3.dex */
public class C1520dq extends AbstractC1559yd {
    /* JADX INFO: renamed from: k4 */
    public void m8308k4(AbstractC4623f9 abstractC4623f9, C3149x1 c3149x1) {
        C4675xw c4675xw = (C4675xw) abstractC4623f9;
        C6743to.m26602k4(c4675xw.m19053c5(), c3149x1);
        c3149x1.m13447k4(c4675xw.m19487k4() & 4294967295L);
        c3149x1.m13448k4(c4675xw.m19495x1());
        c3149x1.m13448k4(c4675xw.m19494to());
        if (C1853kk.m9663k4(c4675xw.m19495x1(), 11)) {
            C6743to.m26603k4((C4607ai[]) C7019kk.m27458kk(c4675xw.m19492kk(), C4607ai[].class), c3149x1);
        } else if (C1853kk.m9663k4(c4675xw.m19495x1(), 14)) {
            C6743to.m26605k4((C4622em[]) C7019kk.m27458kk(c4675xw.m19492kk(), C4622em[].class), c3149x1);
        } else {
            C6743to.m26608k4((C4681zj[]) C7019kk.m27458kk(c4675xw.m19492kk(), C4681zj[].class), c3149x1);
        }
        int i = 0;
        if (C1853kk.m9663k4(c4675xw.m19495x1(), 11)) {
            while (i < c4675xw.m19485du().length) {
                c3149x1.m13443k4((byte) ((C4658tq) c4675xw.m19485du()[i]).m19359x1());
                i++;
            }
        } else {
            while (i < c4675xw.m19485du().length) {
                c3149x1.m13443k4((byte) ((C4650qw) c4675xw.m19485du()[i]).m19318x1());
                i++;
            }
        }
        if (c4675xw.m19493m9() == null || c4675xw.m19493m9().length <= 0) {
            return;
        }
        c3149x1.m13450k4(c4675xw.m19493m9());
    }
}
