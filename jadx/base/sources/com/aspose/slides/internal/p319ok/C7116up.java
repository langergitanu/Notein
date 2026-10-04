package com.aspose.slides.internal.p319ok;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p498xe.C12512ks;
import com.aspose.slides.internal.p498xe.C12525yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ok.up */
/* JADX INFO: loaded from: classes4.dex */
public class C7116up extends AbstractC7101ck {
    /* JADX INFO: renamed from: k4 */
    public C3023to m27640k4(C3134k4 c3134k4) {
        C12525yj c12525yj = new C12525yj();
        c12525yj.m58294k4(c3134k4.m13382u4());
        if ((c12525yj.m58293k4() & 65535) != 768) {
            c3134k4.m13371ck().seek(c12525yj.m58293k4() & 65535, 0);
        }
        c12525yj.m58298x1(c3134k4.m13382u4());
        c12525yj.m58295k4(new C12512ks[c12525yj.m58297x1()]);
        for (int i = 0; i < (c12525yj.m58297x1() & 65535); i++) {
            c12525yj.m58296kk()[i] = (C12512ks) new C7104fa().m27624k4(c3134k4);
        }
        return c12525yj;
    }
}
