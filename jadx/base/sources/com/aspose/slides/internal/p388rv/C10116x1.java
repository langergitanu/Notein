package com.aspose.slides.internal.p388rv;

import com.aspose.slides.internal.p237ks.C5906k4;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.rv.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10116x1 extends AbstractC10113kk {
    public C10116x1(C5906k4 c5906k4) {
        super(c5906k4);
    }

    @Override // com.aspose.slides.internal.p388rv.AbstractC10113kk
    /* JADX INFO: renamed from: k4 */
    public String mo49689k4(int i) {
        if (i <= 0) {
            return m49693k4().m23789m9().mo49689k4(i);
        }
        C6765kp c6765kp = new C6765kp();
        int size = m49693k4().m23790to().size();
        while (i != 0) {
            int i2 = i - 1;
            c6765kp.m26786k4(0, m49693k4().m23790to().get_Item(i2 % size));
            i = i2 / size;
        }
        return c6765kp.toString();
    }
}
