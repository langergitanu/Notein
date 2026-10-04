package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.of */
/* JADX INFO: loaded from: classes3.dex */
public class C2230of extends AbstractC2166kq {

    /* JADX INFO: renamed from: kk */
    private List<C2159ke> f7687kk;

    /* JADX INFO: renamed from: x1 */
    private C2330uy f7688x1;

    public C2230of(long j, int i) {
        super(j, i);
        this.f7687kk = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C2159ke m11189k4(int i) {
        return this.f7687kk.get_Item(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final C2330uy m11190x1() {
        return this.f7688x1;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        long jM11154k4 = c2212n9.m11154k4();
        long j = this.f7845k4;
        if (jM11154k4 != (((j & 4294967295L) + 2) & 4294967295L)) {
            c2212n9.m11159k4(((j & 4294967295L) + 2) & 4294967295L);
        }
        int iM11151fa = c2212n9.m11151fa() & 65535;
        List<Integer> listM11354x1 = AbstractC2282s0.m11354x1(c2212n9);
        this.f7688x1 = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & 4294967295L, iM11151fa), c2212n9);
        for (int i = 0; i < listM11354x1.size(); i++) {
            this.f7687kk.addItem((C2159ke) AbstractC2282s0.m11353k4(new C2159ke(this.f7845k4 & 4294967295L, listM11354x1.get_Item(i).intValue() & 65535), c2212n9));
        }
    }
}
