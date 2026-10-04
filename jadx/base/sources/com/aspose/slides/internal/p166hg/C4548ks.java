package com.aspose.slides.internal.p166hg;

import com.aspose.slides.internal.p118ex.C3817h4;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.ks */
/* JADX INFO: loaded from: classes.dex */
class C4548ks extends AbstractC4560t6 {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C4580yj f12691k4;

    public C4548ks(C4580yj c4580yj) {
        this.f12691k4 = c4580yj;
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4560t6
    /* JADX INFO: renamed from: k4 */
    public boolean mo18777k4(C3817h4 c3817h4, int[] iArr) {
        Class cls = Boolean.TYPE;
        boolean zBooleanValue = ((Boolean) C7019kk.m27464to(C7019kk.m27467x1(cls), cls)).booleanValue();
        Iterator it = ((AbstractC7018k4) this.f12691k4).f19081x1.iterator();
        while (it.hasNext()) {
            zBooleanValue = ((AbstractC4560t6) it.next()).mo18777k4(c3817h4, iArr);
        }
        return zBooleanValue;
    }
}
