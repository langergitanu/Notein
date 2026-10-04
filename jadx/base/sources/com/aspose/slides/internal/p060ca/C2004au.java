package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.au */
/* JADX INFO: loaded from: classes3.dex */
public class C2004au extends AbstractC2282s0 {

    /* JADX INFO: renamed from: x1 */
    private List<C2126i9> f6982x1;

    public C2004au(long j) {
        super(j);
        this.f6982x1 = new List<>();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        List<Integer> listM11354x1 = AbstractC2282s0.m11354x1(c2212n9);
        for (int i = 0; i < listM11354x1.size(); i++) {
            this.f6982x1.addItem((C2126i9) AbstractC2282s0.m11353k4(new C2126i9(((this.f7845k4 & 4294967295L) + ((long) (listM11354x1.get_Item(i).intValue() & 65535))) & 4294967295L), c2212n9));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C2126i9[] m10223x1() {
        return this.f6982x1.toArray(new C2126i9[0]);
    }
}
