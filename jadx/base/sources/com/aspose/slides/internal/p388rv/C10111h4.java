package com.aspose.slides.internal.p388rv;

import com.aspose.slides.internal.p237ks.C5906k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.rv.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10111h4 extends AbstractC10113kk {

    /* JADX INFO: renamed from: k4 */
    private int f36246k4;

    public C10111h4(C5906k4 c5906k4) {
        super(c5906k4);
        this.f36246k4 = m49693k4().m23790to().size();
    }

    @Override // com.aspose.slides.internal.p388rv.AbstractC10113kk
    /* JADX INFO: renamed from: k4 */
    public String mo49689k4(int i) {
        int i2 = this.f36246k4;
        if (i2 == 0) {
            return C14113y2.f47374k4;
        }
        int i3 = i % i2;
        return m49693k4().m23790to().get_Item(i3 == 0 ? i2 - 1 : i3 - 1);
    }
}
