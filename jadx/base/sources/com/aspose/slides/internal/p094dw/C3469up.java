package com.aspose.slides.internal.p094dw;

import OooO0O0.OooO0OO;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p260ly.C6283to;
import com.aspose.slides.internal.p349q3.C9681ne;
import com.aspose.slides.internal.p349q3.C9733x6;
import com.aspose.slides.internal.p422tl.C11054kk;
import com.aspose.slides.internal.p488x0.C12350uz;

/* JADX INFO: renamed from: com.aspose.slides.internal.dw.up */
/* JADX INFO: loaded from: classes3.dex */
public class C3469up {
    /* JADX INFO: renamed from: k4 */
    public final boolean m14027k4(C9681ne[] c9681neArr, AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C9733x6 c9733x6 = new C9733x6(c9681neArr[0]);
        c9733x6.m47829k4((C12350uz) OooO0OO.OooO0O0(c3134k4));
        long jM13384uz = c3134k4.m13384uz();
        c9733x6.m47828k4(jM13384uz);
        long j = jM13384uz & 4294967295L;
        c9733x6.m47831k4(new C6283to[(int) j]);
        long jM25625kk = 0;
        for (int i = 0; i < j; i++) {
            C6283to c6283to = (C6283to) new C11054kk().m53486k4(c3134k4);
            jM25625kk = ((jM25625kk & 4294967295L) + (c6283to.m25625kk() & 4294967295L)) & 4294967295L;
            c9733x6.m47833kk()[i] = c6283to;
        }
        c9733x6.m47830k4(c3134k4.m13372dy((int) jM25625kk));
        c9681neArr[0] = c9733x6;
        return true;
    }
}
