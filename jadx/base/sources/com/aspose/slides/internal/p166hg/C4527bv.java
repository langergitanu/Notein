package com.aspose.slides.internal.p166hg;

import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p118ex.C3819jd;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.bv */
/* JADX INFO: loaded from: classes.dex */
class C4527bv extends AbstractC4537f9 {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C4565um f12635k4;

    public C4527bv(C4565um c4565um) {
        this.f12635k4 = c4565um;
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4537f9
    /* JADX INFO: renamed from: k4 */
    public C3817h4 mo18687k4(C3819jd c3819jd, C3817h4 c3817h4, String str, C3819jd c3819jd2) {
        Iterator it = ((AbstractC7018k4) this.f12635k4).f19081x1.iterator();
        C3817h4 c3817h4Mo18687k4 = null;
        while (it.hasNext()) {
            c3817h4Mo18687k4 = ((AbstractC4537f9) it.next()).mo18687k4(c3819jd, c3817h4, str, c3819jd2);
        }
        return c3817h4Mo18687k4;
    }
}
