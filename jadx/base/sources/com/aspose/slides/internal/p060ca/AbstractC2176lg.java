package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.lg */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2176lg extends AbstractC2282s0 {
    public AbstractC2176lg() {
        super(0L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11019k4(long j, long j2, C2212n9 c2212n9) {
        if (j2 == 0) {
            throw new C2243pd("Trying to load table with zero offset");
        }
        this.f7845k4 = (j + j2) & 4294967295L;
        mo10153k4(c2212n9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m11018k4(List<C2293sn> list, int i) {
        List.Enumerator<C2293sn> it = list.m80682iterator();
        while (it.hasNext()) {
            try {
                if ((it.next().m11417k4() & 65535) > i - 1) {
                    throw new C2243pd(C14113y2.m67408k4("Incorrect sequence index in rule table", " exceeds input glyph count"));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
