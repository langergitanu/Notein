package com.aspose.slides.internal.p152gk;

import com.aspose.slides.internal.p181ig.AbstractC4830gf;
import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p181ig.C4861to;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.gk.uz */
/* JADX INFO: loaded from: classes.dex */
public class C4351uz extends AbstractC4331ar {
    @Override // com.aspose.slides.internal.p152gk.AbstractC4331ar
    /* JADX INFO: renamed from: k4 */
    public boolean mo17426k4(AbstractC4830gf abstractC4830gf, C4833h4 c4833h4) {
        if (abstractC4830gf.m19946h4() == 2) {
            C4861to c4861toM19952x6 = abstractC4830gf.m19952x6();
            if (c4861toM19952x6.m20144k4((char) 0)) {
                c4833h4.m20062x1(this);
                return false;
            }
            c4833h4.m20042qq().addItem(c4861toM19952x6);
            return true;
        }
        if (c4833h4.m20042qq().m20122k4()) {
            Iterator<C4861to> it = c4833h4.m20042qq().iterator();
            while (it.hasNext()) {
                c4833h4.m20021k4(it.next());
            }
        } else {
            Iterator<C4861to> it2 = c4833h4.m20042qq().iterator();
            while (it2.hasNext()) {
                AbstractC4331ar.f11830c5.mo17429x1(it2.next(), c4833h4);
            }
        }
        c4833h4.m19991c5();
        return c4833h4.m20025k4(abstractC4830gf);
    }
}
