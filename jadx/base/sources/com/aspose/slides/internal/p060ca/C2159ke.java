package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ke */
/* JADX INFO: loaded from: classes3.dex */
public class C2159ke extends AbstractC2282s0 {

    /* JADX INFO: renamed from: x1 */
    private List<C2010bb> f7484x1;

    public C2159ke(long j, long j2) {
        super(j, j2);
        this.f7484x1 = new List<>();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        List<Integer> listM11354x1 = AbstractC2282s0.m11354x1(c2212n9);
        for (int i = 0; i < listM11354x1.size(); i++) {
            this.f7484x1.addItem((C2010bb) AbstractC2282s0.m11353k4(new C2010bb(this.f7845k4 & 4294967295L, listM11354x1.get_Item(i).intValue() & 65535), c2212n9));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C2010bb[] m10926x1() {
        return this.f7484x1.toArray(new C2010bb[0]);
    }
}
