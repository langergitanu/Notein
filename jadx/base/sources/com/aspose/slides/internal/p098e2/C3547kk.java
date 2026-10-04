package com.aspose.slides.internal.p098e2;

import com.aspose.slides.internal.p044bq.C1834du;
import com.aspose.slides.internal.p044bq.C1835h4;
import com.aspose.slides.internal.p044bq.C1837kk;
import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.e2.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3547kk extends AbstractC3546k4 {
    public C3547kk(C1837kk c1837kk) {
        super(c1837kk);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9584k4() {
        C1834du c1834du = this.f9880kk;
        if (!C9467to.m46529k4(c1834du.f6624du, c1834du.f6628kk, 0.001f)) {
            mo9603x1(this.f9880kk.f6628kk.m56897x1(), this.f9880kk.f6628kk.m56895kk());
        }
        for (C1835h4 c1835h4 : this.f9881to) {
            float fM56897x1 = this.f9880kk.f6628kk.m56897x1();
            float fM56895kk = this.f9880kk.f6628kk.m56895kk();
            C7024du c7024du = c1835h4.f6640kk;
            float f = c7024du.f19088k4;
            float f2 = c7024du.f19091x1;
            float f3 = c7024du.f19089kk;
            float f4 = c7024du.f19090to;
            c1835h4.f6632c5 = null;
            c1835h4.f6638jd = null;
            c1835h4.f6633ck = null;
            c1835h4.f6636fa = null;
            mo14417k4(c1835h4, this.f9880kk.f6630to, c7024du);
            C12025x6 c12025x6 = c1835h4.f6632c5;
            if (c12025x6 != null) {
                this.f9882x1.m9598kk(c1835h4, c12025x6);
                this.f9882x1.m9595k4(c1835h4, c1835h4.f6638jd);
            }
            m14421k4(c1835h4);
            C12025x6 c12025x62 = c1835h4.f6633ck;
            if (c12025x62 != null) {
                this.f9882x1.m9600to(c1835h4, c12025x62);
                this.f9882x1.m9607x1(c1835h4, c1835h4.f6636fa);
                fM56897x1 = c1835h4.f6633ck.m56897x1();
                fM56895kk = c1835h4.f6633ck.m56895kk();
                f3 = 0.0f;
                f4 = 0.0f;
            }
            m14422k4(c1835h4, fM56897x1, fM56895kk, f3, f4);
        }
        m14423kk();
    }

    @Override // com.aspose.slides.internal.p098e2.AbstractC3546k4, com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9602x1() {
        m14423kk();
        super.mo9602x1();
    }

    @Override // com.aspose.slides.internal.p098e2.AbstractC3546k4, com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9585k4(float f, float f2) {
        m14423kk();
        super.mo9585k4(f, f2);
    }

    @Override // com.aspose.slides.internal.p098e2.AbstractC3546k4
    /* JADX INFO: renamed from: k4 */
    public void mo14417k4(C1835h4 c1835h4, C12025x6 c12025x6, C7024du c7024du) {
        if (c1835h4.f6634du.m12020k4() == 0) {
            m14426x1(c1835h4, c12025x6, c7024du);
        }
        c1835h4.f6643x1.mo23002k4(this.f9882x1, c1835h4, c12025x6, c7024du, C9467to.m46526k4(this.f9880kk.f6626h4.m56897x1(), this.f9880kk.f6626h4.m56895kk(), c12025x6.m56897x1(), c12025x6.m56895kk()));
    }
}
