package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.bb */
/* JADX INFO: loaded from: classes3.dex */
public class C2010bb extends AbstractC2282s0 {

    /* JADX INFO: renamed from: kk */
    private int f6994kk;

    /* JADX INFO: renamed from: to */
    private List<Integer> f6995to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC2220nx f6996x1;

    public C2010bb(long j, long j2) {
        super(j, j2);
        this.f6995to = new List<>();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        this.f6996x1 = new C2334v6(c2212n9.m11151fa() & 65535);
        this.f6994kk = c2212n9.m11151fa();
        for (int i = 0; i < (this.f6994kk & 65535) - 1; i++) {
            this.f6995to.addItem(Integer.valueOf(c2212n9.m11151fa()));
        }
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m10238kk() {
        return C2027c5.m10306x1(this.f6995to);
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC2220nx m10239to() {
        return this.f6996x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m10240x1() {
        return this.f6994kk & 65535;
    }
}
