package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.kh */
/* JADX INFO: loaded from: classes3.dex */
public class C2161kh extends AbstractC2166kq {

    /* JADX INFO: renamed from: kk */
    private List<C2226o4> f7487kk;

    /* JADX INFO: renamed from: x1 */
    private C2330uy f7488x1;

    public C2161kh(long j, int i) {
        super(j, i);
        this.f7487kk = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C2226o4 m10928k4(int i) {
        if (this.f7487kk.size() > i) {
            return this.f7487kk.get_Item(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2330uy m10929x1() {
        return this.f7488x1;
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
        this.f7488x1 = (C2330uy) AbstractC2282s0.m11353k4(new C2330uy(this.f7845k4 & 4294967295L, iM11151fa), c2212n9);
        for (int i = 0; i < listM11354x1.size(); i++) {
            this.f7487kk.addItem((C2226o4) AbstractC2282s0.m11353k4(new C2226o4(this.f7845k4 & 4294967295L, listM11354x1.get_Item(i).intValue() & 65535), c2212n9));
        }
    }
}
