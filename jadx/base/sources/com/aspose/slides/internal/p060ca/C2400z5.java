package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.z5 */
/* JADX INFO: loaded from: classes3.dex */
public class C2400z5 extends AbstractC2282s0 {

    /* JADX INFO: renamed from: kk */
    private List<C2330uy> f8338kk;

    /* JADX INFO: renamed from: x1 */
    private int f8339x1;

    public C2400z5(long j, long j2) {
        super(j, j2);
        this.f8338kk = new List<>();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        int iM11151fa = c2212n9.m11151fa() & 65535;
        if (iM11151fa != 1) {
            throw new C2243pd(C14113y2.m67402k4("Incorrect format idenrifier = {0} for MarkGlyphSets table", Integer.valueOf(iM11151fa)));
        }
        this.f8339x1 = c2212n9.m11151fa() & 65535;
        List list = new List();
        for (int i = 0; i < this.f8339x1; i++) {
            list.addItem(Long.valueOf(C7019kk.m27461m9(Long.valueOf(c2212n9.m11164up()), 10)));
        }
        for (int i2 = 0; i2 < this.f8339x1; i2++) {
            this.f8338kk.addItem((C2330uy) AbstractC2282s0.m11353k4(new C2330uy(((Long) list.get_Item(i2)).longValue()), c2212n9));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C2330uy[] m11813x1() {
        return this.f8338kk.toArray(new C2330uy[0]);
    }
}
