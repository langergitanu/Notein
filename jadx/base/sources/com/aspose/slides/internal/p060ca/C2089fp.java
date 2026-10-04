package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.fp */
/* JADX INFO: loaded from: classes3.dex */
public class C2089fp extends AbstractC2221ny {

    /* JADX INFO: renamed from: kk */
    private int f7211kk;

    /* JADX INFO: renamed from: to */
    private List<Integer> f7212to;

    public C2089fp(long j, String str) {
        super(j, str);
        this.f7212to = new List<>();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        c2212n9.m11151fa();
        this.f7211kk = c2212n9.m11151fa();
        int iM11151fa = c2212n9.m11151fa() & 65535;
        this.f7212to.setCapacity(iM11151fa);
        for (int i = 0; i < iM11151fa; i++) {
            this.f7212to.addItem(Integer.valueOf(c2212n9.m11151fa()));
        }
    }

    /* JADX INFO: renamed from: kk */
    public final int m10532kk() {
        return this.f7211kk;
    }

    /* JADX INFO: renamed from: to */
    public final Integer[] m10533to() {
        return this.f7212to.toArray(new Integer[0]);
    }
}
