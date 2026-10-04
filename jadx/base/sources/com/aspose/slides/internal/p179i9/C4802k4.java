package com.aspose.slides.internal.p179i9;

import com.aspose.slides.Collections.CaseInsensitiveComparer;
import com.aspose.slides.Collections.CaseInsensitiveHashCodeProvider;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.i9.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4802k4 {

    /* JADX INFO: renamed from: k4 */
    private Hashtable f13380k4 = new Hashtable(CaseInsensitiveHashCodeProvider.getDefaultInvariant(), CaseInsensitiveComparer.getDefaultInvariant());

    public C4802k4(Object obj) {
        if (obj == null || !C7019kk.m27469x1(obj, C4802k4.class)) {
            return;
        }
        C4802k4 c4802k4 = (C4802k4) obj;
        for (String str : c4802k4.f13380k4.getKeys()) {
            this.f13380k4.set_Item(str, c4802k4.f13380k4.get_Item(str));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public long m19872k4(String str) {
        Object obj = this.f13380k4.get_Item(str);
        if (obj == null) {
            obj = this.f13380k4.get_Item(C18358t1.g.f56183c);
        }
        return obj == null ? C7019kk.m27435du((Object) 2, 9) : ((Long) C7019kk.m27464to(obj, Long.TYPE)).longValue();
    }
}
