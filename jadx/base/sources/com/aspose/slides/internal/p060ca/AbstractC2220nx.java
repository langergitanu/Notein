package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.nx */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2220nx {
    /* JADX INFO: renamed from: k4 */
    public static boolean m11180k4(AbstractC2220nx abstractC2220nx, Object obj) {
        return abstractC2220nx != null ? !abstractC2220nx.equals(obj) : obj != null;
    }

    public boolean equals(Object obj) {
        C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) this, C2334v6.class);
        C2334v6 c2334v62 = (C2334v6) C7019kk.m27452k4(obj, C2334v6.class);
        if (c2334v62 != null && c2334v6 != null) {
            return c2334v6.m11556k4() == c2334v62.m11556k4();
        }
        C2319ub c2319ub = (C2319ub) C7019kk.m27452k4((Object) this, C2319ub.class);
        C2319ub c2319ub2 = (C2319ub) C7019kk.m27452k4(obj, C2319ub.class);
        if (c2319ub == null || c2319ub2 == null) {
            return false;
        }
        return C14113y2.m67363du(c2319ub.m11480k4(), c2319ub2.m11480k4());
    }

    public abstract int hashCode();

    public abstract String toString();
}
