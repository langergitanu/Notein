package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.by */
/* JADX INFO: loaded from: classes3.dex */
public class C2021by extends AbstractC2282s0 {

    /* JADX INFO: renamed from: x1 */
    private List<C2065ee> f7025x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.by$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public int f7026k4;

        /* JADX INFO: renamed from: x1 */
        public int f7027x1;

        public k4(int i, int i2) {
            this.f7026k4 = i;
            this.f7027x1 = i2;
        }
    }

    public C2021by(long j) {
        super(j);
        this.f7025x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C2065ee m10283k4(int i) {
        return this.f7025x1.get_Item(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m10284x1() {
        return this.f7025x1.size();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        int iM11151fa = c2212n9.m11151fa();
        List list = new List();
        for (int i = 0; i < (iM11151fa & 65535); i++) {
            list.addItem(new k4(c2212n9.m11151fa(), c2212n9.m11151fa()));
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f7025x1.addItem(new C2065ee(((k4) list.get_Item(i2)).f7026k4 & 65535, (C2231og) AbstractC2282s0.m11353k4(new C2231og(((this.f7845k4 & 4294967295L) + ((long) (((k4) list.get_Item(i2)).f7027x1 & 65535))) & 4294967295L), c2212n9)));
        }
    }
}
