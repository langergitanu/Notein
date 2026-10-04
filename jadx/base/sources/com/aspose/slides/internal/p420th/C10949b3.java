package com.aspose.slides.internal.p420th;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p151gj.AbstractC4323ks;
import com.aspose.slides.internal.p151gj.C4314c5;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.b3 */
/* JADX INFO: loaded from: classes4.dex */
public class C10949b3 extends AbstractC10972up {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<C5659x1, C5659x1> f38158k4 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private boolean f38159kk;

    /* JADX INFO: renamed from: x1 */
    private float f38160x1;

    /* JADX INFO: renamed from: k4 */
    private float m52877k4() {
        return this.f38160x1;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13516x1(C10971um c10971um) {
        if (c10971um.mo52909to() != null) {
            m52882k4(c10971um.mo52909to());
        }
        if (c10971um.m53098k4() != null) {
            m52883k4(c10971um.m53098k4());
        }
        if (c10971um.m53107x1() != null) {
            m52884k4(c10971um.m53107x1());
        }
        if (c10971um.mo52902du() != null) {
            m53112x1((AbstractC10973uz) c10971um.mo52902du());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C10959ix m52878k4(C10959ix c10959ix) {
        return new C10959ix(m52886k4(c10959ix.m52939k4().Clone()).Clone(), c10959ix.m52941kk(), c10959ix.m52942m9());
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m52886k4(C12007ix c12007ix) {
        return new C12007ix(c12007ix.m56557jd() * m52877k4(), c12007ix.m56551ck() * m52877k4(), c12007ix.m56550c5() * m52877k4(), c12007ix.m56575x1() * m52877k4());
    }

    /* JADX INFO: renamed from: k4 */
    private C12015qq m52879k4(C12015qq c12015qq) {
        return new C12015qq(c12015qq.m56699x1() * m52877k4(), c12015qq.m56697kk() * m52877k4());
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m52880k4(C12025x6 c12025x6) {
        return new C12025x6(c12025x6.m56897x1() * m52877k4(), c12025x6.m56895kk() * m52877k4());
    }

    /* JADX INFO: renamed from: k4 */
    private void m52881k4(float f) {
        this.f38160x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m52882k4(C4317dy c4317dy) {
        c4317dy.m17336k4(m52877k4(), m52877k4(), 1);
        c4317dy.m17336k4((float) (1.0d / ((double) m52877k4())), (float) (1.0d / ((double) m52877k4())), 0);
    }

    /* JADX INFO: renamed from: k4 */
    private void m52883k4(C4320jd c4320jd) {
        c4320jd.m17366k4(c4320jd.m17375x1() * m52877k4());
    }

    /* JADX INFO: renamed from: k4 */
    private void m52884k4(C4328x1 c4328x1) {
        AbstractC4323ks abstractC4323ks = (AbstractC4323ks) C7019kk.m27452k4((Object) c4328x1, AbstractC4323ks.class);
        if (abstractC4323ks == null) {
            return;
        }
        m52882k4(abstractC4323ks.m17385fa());
        int iM17417k4 = c4328x1.m17417k4();
        if (iM17417k4 == 3) {
            C4324m9 c4324m9 = (C4324m9) c4328x1;
            c4324m9.m17397k4(m52886k4(c4324m9.m17391du().Clone()).Clone());
        } else {
            if (iM17417k4 != 4) {
                return;
            }
            C4314c5 c4314c5 = (C4314c5) c4328x1;
            c4314c5.m17304k4(m52880k4(c4314c5.m17306m9().Clone()).Clone());
            m53112x1((AbstractC10973uz) c4314c5.m17301h4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m52885k4(C5659x1 c5659x1) {
        if (this.f38158k4.containsKey(c5659x1)) {
            return;
        }
        this.f38158k4.addItem(c5659x1, c5659x1);
        if (this.f38159kk) {
            c5659x1.m23121k4(c5659x1.m23114dy() * m52877k4());
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16971k4(C10947ak c10947ak) {
        c10947ak.m53144k4(m52880k4(c10947ak.m53142h4().Clone()).Clone());
        c10947ak.m52863k4(m52879k4(c10947ak.m52858ck().Clone()).Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16972k4(C10948ar c10948ar) {
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13521k4(C10950bv c10950bv) {
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13522k4(C10951c5 c10951c5) {
        if (c10951c5.mo52909to() != null) {
            m52882k4(c10951c5.mo52909to());
        }
        if (c10951c5.m52903h4() != null) {
            c10951c5.m52906k4(m52878k4(c10951c5.m52903h4()));
        }
        if (c10951c5.mo52902du() != null) {
            m53112x1((AbstractC10973uz) c10951c5.mo52902du());
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16973k4(C10953ck c10953ck) {
        c10953ck.m53144k4(m52880k4(c10953ck.m53142h4().Clone()).Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13523k4(C10955du c10955du) {
        C10969to c10969to = new C10969to();
        c10969to.m53058x1(m52880k4(c10955du.m52919k4().m53057x1().Clone()).Clone());
        c10969to.m53054kk(m52880k4(c10955du.m52919k4().m53053kk().Clone()).Clone());
        c10969to.m53056to(m52880k4(c10955du.m52919k4().m53055to().Clone()).Clone());
        c10969to.m53052k4(m52880k4(c10955du.m52919k4().m53050k4().Clone()).Clone());
        c10955du.m52920k4(c10969to.Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16975k4(C10958h4 c10958h4) {
        c10958h4.m52934k4(m52880k4(c10958h4.m52933k4().Clone()).Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16976k4(C10960jd c10960jd) {
        c10960jd.m53144k4(m52880k4(c10960jd.m53142h4().Clone()).Clone());
        c10960jd.m52945k4(c10960jd.m52948x1() * m52877k4());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13524k4(C10963ks c10963ks) {
        if (c10963ks.mo52902du() != null) {
            m53112x1((AbstractC10973uz) c10963ks.mo52902du());
        }
        if (c10963ks.mo52909to() != null) {
            m52882k4(c10963ks.mo52909to());
        }
        if (c10963ks.m53005x1() != null) {
            m52885k4(c10963ks.m53005x1());
        }
        c10963ks.m52990k4(m52880k4(c10963ks.m52982jd().Clone()).Clone());
        c10963ks.m52989k4(m52879k4(c10963ks.m53002up().Clone()).Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16977k4(C10967qq c10967qq) {
        c10967qq.m53028k4(m52880k4(c10967qq.m53027k4().Clone()).Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13525k4(C10970u4 c10970u4) {
        if (c10970u4.m53081m9() != null) {
            c10970u4.m53075k4(m52878k4(c10970u4.m53081m9()));
        }
        c10970u4.m53077k4(m52880k4(c10970u4.m53072k4().Clone()).Clone());
        c10970u4.m53076k4(m52879k4(c10970u4.m53083x1().Clone()).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52887k4(AbstractC10973uz abstractC10973uz, double d) {
        m52881k4((float) d);
        m53112x1(abstractC10973uz);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13528k4(C10974v4 c10974v4) {
        for (int i = 0; i < c10974v4.m53117k4().size(); i++) {
            c10974v4.m53117k4().set_Item(i, m52880k4(c10974v4.m53117k4().get_Item(i).Clone()).Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52888k4(boolean z) {
        this.f38159kk = z;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public boolean mo22157k4(C10966ne c10966ne) {
        return true;
    }
}
