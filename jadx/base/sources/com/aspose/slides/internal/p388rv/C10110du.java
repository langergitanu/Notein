package com.aspose.slides.internal.p388rv;

import com.aspose.slides.internal.p237ks.C5906k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.internal.rv.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10110du extends AbstractC10113kk {
    public C10110du(C5906k4 c5906k4) {
        super(c5906k4);
    }

    @Override // com.aspose.slides.internal.p388rv.AbstractC10113kk
    /* JADX INFO: renamed from: k4 */
    public String mo49689k4(int i) {
        boolean z;
        if (i == 0) {
            return m49693k4().m23790to().get_Item(0);
        }
        long j = i;
        if (j < 0) {
            j *= -1;
            z = true;
        } else {
            z = false;
        }
        C6765kp c6765kp = new C6765kp();
        int size = m49693k4().m23790to().size();
        while (j != 0) {
            long j2 = size;
            c6765kp.m26786k4(0, m49693k4().m23790to().get_Item((int) (j % j2)));
            j = (int) (j / j2);
        }
        if (z) {
            c6765kp.m26786k4(0, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        }
        return c6765kp.toString();
    }
}
