package com.aspose.slides;

import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.AbstractC14070jw;

/* JADX INFO: renamed from: com.aspose.slides.xr */
/* JADX INFO: loaded from: classes3.dex */
final class C14815xr {

    /* JADX INFO: renamed from: du */
    private static final AbstractC14070jw f50181du = AbstractC14070jw.m66790x1();

    /* JADX INFO: renamed from: k4 */
    private final String f50182k4;

    /* JADX INFO: renamed from: kk */
    private boolean f50183kk;

    /* JADX INFO: renamed from: to */
    private C12380dy f50184to;

    /* JADX INFO: renamed from: x1 */
    private int f50185x1;

    public C14815xr(String str, boolean z, int i) {
        this.f50184to = null;
        this.f50182k4 = str;
        this.f50183kk = z;
        if (z) {
            this.f50184to = new C12380dy(str, 66);
        }
        this.f50185x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m73568k4() {
        return this.f50185x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m73569k4(String str) {
        return this.f50183kk ? this.f50184to.m57988to(str) : f50181du.compare(str, this.f50182k4) == 0;
    }
}
