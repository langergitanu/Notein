package com.aspose.slides.internal.p327ov;

import OooO0O0.OooO00o;
import com.aspose.slides.internal.p156gw.AbstractC4391bv;
import com.aspose.slides.internal.p156gw.C4417x6;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p340pm.C9466kk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ov.du */
/* JADX INFO: loaded from: classes4.dex */
class C7148du implements InterfaceC4809to {

    /* JADX INFO: renamed from: du */
    private float f19269du;

    /* JADX INFO: renamed from: dy */
    private AbstractC4391bv f19270dy;

    /* JADX INFO: renamed from: h4 */
    private float f19271h4;

    /* JADX INFO: renamed from: m9 */
    private float f19274m9;

    /* JADX INFO: renamed from: to */
    private float f19275to;

    /* JADX INFO: renamed from: k4 */
    private List<AbstractC4391bv> f19272k4 = new ArrayList();

    /* JADX INFO: renamed from: x1 */
    private List<List<C9466kk>> f19276x1 = new ArrayList();

    /* JADX INFO: renamed from: kk */
    private List<Boolean> f19273kk = new ArrayList();

    /* JADX INFO: renamed from: du */
    private AbstractC4391bv m27718du() {
        if (this.f19270dy == null) {
            m27720kk(this.f19275to, this.f19269du);
        }
        return this.f19270dy;
    }

    /* JADX INFO: renamed from: h4 */
    private void m27719h4() {
        this.f19273kk.set(r0.size() - 1, Boolean.TRUE);
        this.f19270dy = null;
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9584k4() {
        if (this.f19270dy != null) {
            m27718du().m17825k4();
            ((List) OooO00o.OooO00o(1, this.f19276x1)).add(new C9466kk(this.f19271h4, this.f19274m9, this.f19275to, this.f19269du));
            m27719h4();
        } else {
            if (this.f19272k4.isEmpty()) {
                return;
            }
            ((AbstractC4391bv) OooO00o.OooO00o(1, this.f19272k4)).m17825k4();
            ((List) OooO00o.OooO00o(1, this.f19276x1)).add(new C9466kk(this.f19271h4, this.f19274m9, this.f19275to, this.f19269du));
        }
    }

    /* JADX INFO: renamed from: kk */
    public List<List<C9466kk>> m27721kk() {
        return this.f19276x1;
    }

    /* JADX INFO: renamed from: to */
    public List<Boolean> m27722to() {
        return this.f19273kk;
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9602x1() {
    }

    /* JADX INFO: renamed from: kk */
    private void m27720kk(float f, float f2) {
        C4417x6 c4417x6 = new C4417x6();
        c4417x6.m17842k4(f, f2);
        this.f19272k4.add(c4417x6);
        this.f19276x1.add(new ArrayList());
        this.f19273kk.add(Boolean.FALSE);
        this.f19270dy = c4417x6;
        this.f19275to = f;
        this.f19269du = f2;
        this.f19271h4 = f;
        this.f19274m9 = f2;
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: x1 */
    public void mo9603x1(float f, float f2) {
        m27718du().mo17836to(f, f2);
        ((List) OooO00o.OooO00o(1, this.f19276x1)).add(new C9466kk(this.f19271h4, this.f19274m9, f, f2));
        this.f19271h4 = f;
        this.f19274m9 = f2;
        if (f == this.f19275to && f2 == this.f19269du) {
            m27719h4();
        }
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9585k4(float f, float f2) {
        m27720kk(f, f2);
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9586k4(float f, float f2, float f3, float f4) {
        m27718du().mo17834kk(f, f2, f3, f4);
        this.f19271h4 = f3;
        this.f19274m9 = f4;
        if (f3 == this.f19275to && f4 == this.f19269du) {
            m27719h4();
        }
    }

    @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
    /* JADX INFO: renamed from: k4 */
    public void mo9587k4(float f, float f2, float f3, float f4, float f5, float f6) {
        m27718du().mo17826k4(f, f2, f3, f4, f5, f6);
        this.f19271h4 = f5;
        this.f19274m9 = f6;
        if (f5 == this.f19275to && f6 == this.f19269du) {
            m27719h4();
        }
    }
}
