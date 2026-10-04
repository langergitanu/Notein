package com.aspose.slides.internal.p115eq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.dy */
/* JADX INFO: loaded from: classes.dex */
public class C3785dy {

    /* JADX INFO: renamed from: k4 */
    public int f10313k4;

    /* JADX INFO: renamed from: kk */
    public Dictionary<Integer, Float> f10314kk = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    public List<Float> f10315x1;

    public C3785dy(int i, float... fArr) {
        this.f10313k4 = 19;
        this.f10315x1 = new List<>();
        this.f10313k4 = i;
        this.f10315x1 = new List<>(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4(fArr)));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m15120k4() {
        int i = this.f10313k4;
        return i == 0 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 13 || i == 15 || i == 17;
    }
}
