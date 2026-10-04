package com.aspose.slides.internal.p232kl;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1765wl;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p441ui.C11316k4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p498xe.C12522wl;
import com.aspose.slides.internal.p533yv.AbstractC13336x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.kl.uz */
/* JADX INFO: loaded from: classes.dex */
public class C5871uz extends AbstractC13336x1 {
    @Override // com.aspose.slides.internal.p533yv.AbstractC13336x1
    /* JADX INFO: renamed from: k4 */
    public C11316k4 mo23714k4(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C12522wl c12522wl;
        C1765wl c1765wl = (C1765wl) c1752sv;
        if ((c1765wl.m9488k4() & 65535) < c11315h4.m54440m9().length && (c12522wl = (C12522wl) C7019kk.m27452k4(c11315h4.m54440m9()[c1765wl.m9488k4() & 65535], C12522wl.class)) != null) {
            return new C11316k4(c12522wl.m58268kk().m58223h4().Clone());
        }
        return C11316k4.m54471kk();
    }
}
