package com.aspose.slides.internal.p133fk;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.fk.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4078x1 extends C4076kk {

    /* JADX INFO: renamed from: du */
    private boolean f11140du;

    /* JADX INFO: renamed from: to */
    private boolean f11141to;

    public C4078x1(C12007ix c12007ix, boolean z, boolean z2) {
        super(c12007ix);
        this.f11141to = z;
        this.f11140du = z2;
    }

    /* JADX INFO: renamed from: du */
    private void m16240du(C12025x6 c12025x6, C12025x6 c12025x62) {
        if (m16236to(c12025x6) % 2 != 0) {
            c12025x62.m56891k4((this.f11137k4.m56557jd() + this.f11139x1) - c12025x62.m56897x1());
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m16241h4(C12025x6 c12025x6, C12025x6 c12025x62) {
        if (m16232du(c12025x6) % 2 != 0) {
            c12025x62.m56898x1((this.f11137k4.m56551ck() + this.f11138kk) - c12025x62.m56895kk());
        }
    }

    @Override // com.aspose.slides.internal.p133fk.C4076kk
    /* JADX INFO: renamed from: x1 */
    public void mo16239x1(C12025x6 c12025x6, C12025x6 c12025x62) {
        m16235kk(c12025x6, c12025x62);
        m16237to(c12025x6, c12025x62);
        if (this.f11141to) {
            m16240du(c12025x6, c12025x62);
        }
        if (this.f11140du) {
            m16241h4(c12025x6, c12025x62);
        }
    }
}
