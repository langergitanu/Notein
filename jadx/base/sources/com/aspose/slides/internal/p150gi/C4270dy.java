package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.dy */
/* JADX INFO: loaded from: classes.dex */
public class C4270dy {

    /* JADX INFO: renamed from: k4 */
    private static final C4270dy f11644k4 = new C4270dy(null, null);

    /* JADX INFO: renamed from: kk */
    private final String f11645kk;

    /* JADX INFO: renamed from: x1 */
    private final String f11646x1;

    private C4270dy(String str, String str2) {
        this.f11646x1 = str;
        this.f11645kk = str2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4270dy m17199k4(AbstractC3533um abstractC3533um) {
        String strMo9926j_ = abstractC3533um.m14402to(221).mo9926j_();
        if (C14113y2.m67363du("none", strMo9926j_)) {
            strMo9926j_ = null;
        }
        String strMo9926j_2 = abstractC3533um.m14402to(212).mo9926j_();
        String str = C14113y2.m67363du("none", strMo9926j_2) ? null : strMo9926j_2;
        return (strMo9926j_ == null && str == null) ? f11644k4 : new C4270dy(strMo9926j_, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m17200k4() {
        return this.f11645kk;
    }
}
