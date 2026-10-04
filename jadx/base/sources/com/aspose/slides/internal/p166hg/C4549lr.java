package com.aspose.slides.internal.p166hg;

import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.lr */
/* JADX INFO: loaded from: classes.dex */
class C4549lr extends AbstractC4541h4 {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C4568v4 f12692k4;

    public C4549lr(C4568v4 c4568v4) {
        this.f12692k4 = c4568v4;
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4541h4
    /* JADX INFO: renamed from: k4 */
    public AbstractC4709du mo18690k4(C3817h4 c3817h4, String str) {
        Iterator it = ((AbstractC7018k4) this.f12692k4).f19081x1.iterator();
        AbstractC4709du abstractC4709duMo18690k4 = null;
        while (it.hasNext()) {
            abstractC4709duMo18690k4 = ((AbstractC4541h4) it.next()).mo18690k4(c3817h4, str);
        }
        return abstractC4709duMo18690k4;
    }
}
