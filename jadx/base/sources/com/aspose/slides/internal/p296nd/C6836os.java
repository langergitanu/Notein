package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1778zj;
import com.aspose.slides.internal.p441ui.AbstractC11319to;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p498xe.C12525yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.os */
/* JADX INFO: loaded from: classes4.dex */
public class C6836os extends AbstractC11319to {
    @Override // com.aspose.slides.internal.p441ui.AbstractC11319to
    /* JADX INFO: renamed from: k4 */
    public void mo26873k4(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C12525yj c12525yjM9556k4 = ((C1778zj) c1752sv).m9556k4();
        if (c11315h4.m54398ck() == null || c11315h4.m54398ck().m12714kk() != (c12525yjM9556k4.m58297x1() & 65535)) {
            return;
        }
        for (int i = 0; i < (c12525yjM9556k4.m58297x1() & 65535); i++) {
            c12525yjM9556k4.m58296kk()[i].m58178h4().CloneTo(c11315h4.m54398ck().m12715x1()[i]);
            c11315h4.m54398ck().m12713k4()[i] = c12525yjM9556k4.m58296kk()[i].m58179k4();
        }
    }
}
