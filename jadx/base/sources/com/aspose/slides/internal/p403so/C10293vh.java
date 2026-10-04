package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.AbstractC4626gf;
import com.aspose.slides.internal.p171hq.C4616ca;
import com.aspose.slides.internal.p171hq.C4636jw;
import com.aspose.slides.internal.p171hq.C4643m4;
import com.aspose.slides.internal.p171hq.C4676y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.vh */
/* JADX INFO: loaded from: classes4.dex */
public class C10293vh extends AbstractC10258e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50247k4(C3134k4 c3134k4) {
        C10302xw c10302xw;
        AbstractC4626gf abstractC4626gf;
        C4636jw c4636jw = new C4636jw();
        c4636jw.m19169k4(c3134k4.m13384uz() & 4294967295L);
        int iM19172x1 = (int) c4636jw.m19172x1();
        if (iM19172x1 == 1) {
            c10302xw = new C10302xw(0);
        } else if (iM19172x1 == 2) {
            c10302xw = new C10302xw(1);
        } else if (iM19172x1 == 3) {
            c10302xw = new C10302xw(2);
        } else if (iM19172x1 == 4) {
            c10302xw = new C10302xw(3);
        } else {
            if (iM19172x1 != 5) {
                abstractC4626gf = iM19172x1 != 268435456 ? iM19172x1 != 268435457 ? null : (C4643m4) new C10294vj().m50248k4(c3134k4) : (C4616ca) new C10281s7().m50235k4(c3134k4);
                c4636jw.m19170k4(abstractC4626gf);
                return c4636jw;
            }
            c10302xw = new C10302xw(4);
        }
        abstractC4626gf = (C4676y2) c10302xw.m50256k4(c3134k4);
        c4636jw.m19170k4(abstractC4626gf);
        return c4636jw;
    }
}
