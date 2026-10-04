package com.aspose.slides.internal.p134fo;

import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p230kj.C5773k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p399si.C10228k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13357ai;
import com.aspose.slides.internal.p539z4.C13372em;
import com.aspose.slides.internal.p539z4.C13400qw;
import com.aspose.slides.internal.p539z4.C13408tq;
import com.aspose.slides.internal.p539z4.C13425xw;
import com.aspose.slides.internal.p539z4.C13431zj;

/* JADX INFO: renamed from: com.aspose.slides.internal.fo.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4085x1 extends AbstractC4081k4 {
    /* JADX INFO: renamed from: k4 */
    public void m16247k4(AbstractC13373f9 abstractC13373f9, C3149x1 c3149x1) {
        C13425xw c13425xw = (C13425xw) abstractC13373f9;
        C5773k4.m23383k4(c13425xw.m62057dy(), c3149x1);
        c3149x1.m13447k4(c13425xw.m62469k4() & 4294967295L);
        c3149x1.m13448k4(c13425xw.m62477x1());
        c3149x1.m13448k4(c13425xw.m62476to());
        if (C10228k4.m50091k4(c13425xw.m62477x1(), 11)) {
            C5773k4.m23384k4((C13357ai[]) C7019kk.m27458kk(c13425xw.m62474kk(), C13357ai[].class), c3149x1);
        } else if (C10228k4.m50091k4(c13425xw.m62477x1(), 14)) {
            C5773k4.m23385k4((C13372em[]) C7019kk.m27458kk(c13425xw.m62474kk(), C13372em[].class), c3149x1);
        } else {
            C5773k4.m23386k4((C13431zj[]) C7019kk.m27458kk(c13425xw.m62474kk(), C13431zj[].class), c3149x1);
        }
        int i = 0;
        if (C10228k4.m50091k4(c13425xw.m62477x1(), 11)) {
            while (i < c13425xw.m62468du().length) {
                c3149x1.m13443k4((byte) ((C13408tq) c13425xw.m62468du()[i]).m62346x1());
                i++;
            }
        } else {
            while (i < c13425xw.m62468du().length) {
                c3149x1.m13443k4((byte) ((C13400qw) c13425xw.m62468du()[i]).m62311x1());
                i++;
            }
        }
        if (c13425xw.m62475m9() == null || c13425xw.m62475m9().length <= 0) {
            return;
        }
        c3149x1.m13450k4(c13425xw.m62475m9());
    }
}
