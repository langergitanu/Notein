package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.x7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2365x7 extends AbstractC2176lg {

    /* JADX INFO: renamed from: kk */
    private List<C2293sn> f8208kk = new List<>();

    /* JADX INFO: renamed from: to */
    private List<Integer> f8209to = new List<>();

    /* JADX INFO: renamed from: x1 */
    private int f8210x1;

    /* JADX INFO: renamed from: k4 */
    public final C2293sn m11676k4(int i) {
        return this.f8208kk.get_Item(i);
    }

    /* JADX INFO: renamed from: kk */
    public final int m11677kk() {
        return this.f8208kk.size();
    }

    /* JADX INFO: renamed from: to */
    public final int[] m11678to() {
        return C2027c5.m10306x1(this.f8209to);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11679x1() {
        return this.f8210x1;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        this.f8210x1 = c2212n9.m11151fa() & 65535;
        int iM11151fa = c2212n9.m11151fa() & 65535;
        for (int i = 0; i < this.f8210x1 - 1; i++) {
            this.f8209to.addItem(Integer.valueOf(c2212n9.m11151fa()));
        }
        for (int i2 = 0; i2 < iM11151fa; i2++) {
            this.f8208kk.addItem(new C2293sn(c2212n9.m11151fa(), c2212n9.m11151fa()));
        }
        AbstractC2176lg.m11018k4(this.f8208kk, this.f8210x1);
    }
}
