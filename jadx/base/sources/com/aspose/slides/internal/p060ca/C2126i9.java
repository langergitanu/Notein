package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.i9 */
/* JADX INFO: loaded from: classes3.dex */
public class C2126i9 extends AbstractC2282s0 {

    /* JADX INFO: renamed from: du */
    private List<C2293sn> f7333du;

    /* JADX INFO: renamed from: kk */
    private List<Integer> f7334kk;

    /* JADX INFO: renamed from: to */
    private List<Integer> f7335to;

    /* JADX INFO: renamed from: x1 */
    private List<Integer> f7336x1;

    public C2126i9(long j) {
        super(j);
        this.f7334kk = new List<>();
        this.f7333du = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final int[] m10709du() {
        return C2027c5.m10306x1(this.f7335to);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2293sn m10710k4(int i) {
        return this.f7333du.get_Item(i);
    }

    /* JADX INFO: renamed from: kk */
    public final int m10711kk() {
        return this.f7334kk.size() + 1;
    }

    /* JADX INFO: renamed from: to */
    public final int[] m10712to() {
        return C2027c5.m10306x1(this.f7334kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final int[] m10713x1() {
        return C2027c5.m10306x1(this.f7336x1);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        this.f7336x1 = AbstractC2282s0.m11354x1(c2212n9);
        int iM11151fa = c2212n9.m11151fa();
        for (int i = 0; i < (iM11151fa & 65535) - 1; i++) {
            this.f7334kk.addItem(Integer.valueOf(c2212n9.m11151fa()));
        }
        this.f7335to = AbstractC2282s0.m11354x1(c2212n9);
        int iM11151fa2 = c2212n9.m11151fa() & 65535;
        for (int i2 = 0; i2 < iM11151fa2; i2++) {
            this.f7333du.addItem(new C2293sn(c2212n9.m11151fa(), c2212n9.m11151fa()));
        }
        AbstractC2176lg.m11018k4(this.f7333du, m10711kk());
    }
}
