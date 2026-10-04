package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.en */
/* JADX INFO: loaded from: classes3.dex */
public class C2071en {

    /* JADX INFO: renamed from: du */
    public int f7171du;

    /* JADX INFO: renamed from: h4 */
    public C2175ld[] f7172h4;

    /* JADX INFO: renamed from: k4 */
    public long f7173k4;

    /* JADX INFO: renamed from: kk */
    public int f7174kk;

    /* JADX INFO: renamed from: to */
    public int f7175to;

    /* JADX INFO: renamed from: x1 */
    public int f7176x1;

    public C2071en(byte[] bArr) {
        C2364x6 c2364x6 = new C2364x6(bArr);
        this.f7173k4 = c2364x6.m11674to();
        this.f7176x1 = c2364x6.m11669h4();
        this.f7174kk = c2364x6.m11669h4();
        this.f7175to = c2364x6.m11669h4();
        this.f7171du = c2364x6.m11669h4();
        List list = new List(this.f7176x1 & 65535);
        for (int i = 0; i < (this.f7176x1 & 65535); i++) {
            C2175ld c2175ld = new C2175ld();
            c2175ld.f7567k4 = C2335ve.m11558k4(c2364x6.m11674to());
            c2175ld.f7570x1 = c2364x6.m11674to();
            c2175ld.f7568kk = c2364x6.m11674to();
            c2175ld.f7569to = c2364x6.m11674to();
            if (!"DSIG".equals(c2175ld.f7567k4)) {
                list.addItem(c2175ld);
            }
        }
        this.f7176x1 = list.size() & 65535;
        this.f7172h4 = (C2175ld[]) list.toArray(new C2175ld[0]);
    }
}
