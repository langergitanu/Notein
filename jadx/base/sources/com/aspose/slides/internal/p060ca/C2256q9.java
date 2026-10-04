package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.q9 */
/* JADX INFO: loaded from: classes3.dex */
public class C2256q9 {

    /* JADX INFO: renamed from: k4 */
    private int f7759k4;

    /* JADX INFO: renamed from: kk */
    private long f7760kk;

    /* JADX INFO: renamed from: x1 */
    private List<C2231og> f7761x1 = new List<>();

    public C2256q9(long j, int i, List<Integer> list, C2212n9 c2212n9) {
        this.f7759k4 = i;
        if (i != list.size()) {
            throw new C2243pd(C14113y2.m67402k4(C14113y2.m67408k4("array of anchor offsets has incorrect length = {0} ", "when ClassCount for this array = {1}"), Integer.valueOf(list.size()), Integer.valueOf(i)));
        }
        this.f7760kk = 4294967295L & j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7761x1.addItem((C2231og) AbstractC2282s0.m11353k4(new C2231og(((long) (list.get_Item(i2).intValue() & 65535)) + j), c2212n9));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C2231og m11276k4(int i) {
        return this.f7761x1.get_Item(i);
    }
}
