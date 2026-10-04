package com.aspose.slides.internal.p388rv;

import com.aspose.slides.internal.p237ks.C5906k4;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.rv.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10114m9 extends AbstractC10113kk {
    public C10114m9(C5906k4 c5906k4) {
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
        int i2 = i % size;
        int i3 = (i - 1) / size;
        do {
            c6765kp.m26792k4(m49693k4().m23790to().get_Item(i2));
            i3--;
        } while (i3 >= 0);
        return c6765kp.toString();
    }
}
