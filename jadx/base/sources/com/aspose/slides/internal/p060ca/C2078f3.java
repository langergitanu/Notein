package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.f3 */
/* JADX INFO: loaded from: classes3.dex */
public class C2078f3 extends AbstractC2221ny {

    /* JADX INFO: renamed from: kk */
    private List<Integer> f7192kk;

    /* JADX INFO: renamed from: to */
    private int f7193to;

    public C2078f3(long j, String str) {
        super(j, str);
        this.f7192kk = new List<>();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        this.f7193to = c2212n9.m11151fa();
        this.f7192kk = AbstractC2282s0.m11354x1(c2212n9);
    }

    /* JADX INFO: renamed from: kk */
    public final Integer[] m10511kk() {
        return this.f7192kk.toArray(new Integer[0]);
    }
}
