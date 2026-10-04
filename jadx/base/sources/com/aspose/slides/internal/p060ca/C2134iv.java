package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.iv */
/* JADX INFO: loaded from: classes3.dex */
public class C2134iv extends AbstractC2282s0 {

    /* JADX INFO: renamed from: kk */
    private int f7384kk;

    /* JADX INFO: renamed from: to */
    private List<C2256q9> f7385to;

    /* JADX INFO: renamed from: x1 */
    private int f7386x1;

    public C2134iv(long j, int i, int i2) {
        super(j);
        this.f7385to = new List<>();
        this.f7386x1 = i;
        this.f7384kk = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2256q9 m10789k4(int i) {
        return this.f7385to.get_Item(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        int iM11151fa = c2212n9.m11151fa() & 65535;
        if (iM11151fa != this.f7386x1) {
            throw new C2243pd(C14113y2.m67402k4(C14113y2.m67408k4("incorrect format of BaseArray table, BaseCount = {0}", "differs from BaseCoverage count = {1} but must be the same"), Integer.valueOf(iM11151fa), Integer.valueOf(this.f7386x1)));
        }
        List list = new List();
        for (int i = 0; i < iM11151fa; i++) {
            List list2 = new List();
            for (int i2 = 0; i2 < this.f7384kk; i2++) {
                int iM11151fa2 = c2212n9.m11151fa();
                list2.addItem(Integer.valueOf(iM11151fa2));
                if ((iM11151fa2 & 65535) == 0) {
                    throw new C2228oa(C14113y2.m67402k4("Zero Anchor table offset in BaseArray Table(offset={0})", Long.valueOf(this.f7845k4)));
                }
            }
            list.addItem(list2);
        }
        for (int i3 = 0; i3 < iM11151fa; i3++) {
            this.f7385to.addItem(new C2256q9(this.f7845k4 & 4294967295L, this.f7384kk, (List) list.get_Item(i3), c2212n9));
        }
    }
}
