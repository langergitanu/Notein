package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.wr */
/* JADX INFO: loaded from: classes3.dex */
public class C2353wr extends AbstractC2282s0 {

    /* JADX INFO: renamed from: kk */
    private List<C2123i2> f8164kk;

    /* JADX INFO: renamed from: x1 */
    private C2330uy f8165x1;

    public C2353wr(long j, long j2) {
        super(j, j2);
        this.f8164kk = new List<>();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        int iM11151fa = c2212n9.m11151fa() & 65535;
        List<Integer> listM11354x1 = AbstractC2282s0.m11354x1(c2212n9);
        this.f8165x1 = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & 4294967295L, iM11151fa), c2212n9);
        for (int i = 0; i < listM11354x1.size(); i++) {
            this.f8164kk.addItem((C2123i2) AbstractC2282s0.m11353k4(new C2123i2(this.f7845k4 & 4294967295L, listM11354x1.get_Item(i).intValue() & 65535), c2212n9));
        }
    }
}
