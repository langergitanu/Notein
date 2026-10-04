package com.aspose.slides.internal.p420th;

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

/* JADX INFO: renamed from: com.aspose.slides.internal.th.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C10976wy extends AbstractC10972up {

    /* JADX INFO: renamed from: k4 */
    private boolean f38266k4;

    /* JADX INFO: renamed from: kk */
    private float f38267kk;

    /* JADX INFO: renamed from: x1 */
    private float f38268x1;

    /* JADX INFO: renamed from: k4 */
    public final float m53126k4() {
        return this.f38268x1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53129kk() {
        return this.f38266k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m53130x1() {
        return this.f38267kk;
    }

    /* JADX INFO: renamed from: k4 */
    private void m53118k4(float f) {
        if (!m53129kk()) {
            this.f38266k4 = true;
            this.f38267kk = f;
            this.f38268x1 = f;
        } else {
            if (f < m53130x1()) {
                this.f38267kk = f;
            }
            if (f > m53126k4()) {
                this.f38268x1 = f;
            }
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13516x1(C10971um c10971um) {
        if (c10971um.mo52909to() != null) {
            m53119k4(c10971um.mo52909to());
        }
        if (c10971um.m53098k4() != null) {
            m53120k4(c10971um.m53098k4());
        }
        if (c10971um.m53107x1() != null) {
            m53121k4(c10971um.m53107x1());
        }
        if (c10971um.mo52902du() != null) {
            m53112x1((AbstractC10973uz) c10971um.mo52902du());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m53119k4(C4317dy c4317dy) {
    }

    /* JADX INFO: renamed from: k4 */
    private void m53120k4(C4320jd c4320jd) {
        m53118k4(c4320jd.m17375x1());
    }

    /* JADX INFO: renamed from: k4 */
    private void m53121k4(C4328x1 c4328x1) {
        AbstractC4323ks abstractC4323ks = (AbstractC4323ks) C7019kk.m27452k4((Object) c4328x1, AbstractC4323ks.class);
        if (abstractC4323ks == null) {
            return;
        }
        m53119k4(abstractC4323ks.m17385fa());
        int iM17417k4 = c4328x1.m17417k4();
        if (iM17417k4 == 3) {
            m53128k4(((C4324m9) c4328x1).m17391du().Clone());
        } else {
            if (iM17417k4 != 4) {
                return;
            }
            C4314c5 c4314c5 = (C4314c5) c4328x1;
            m53125k4(c4314c5.m17306m9().Clone());
            m53112x1((AbstractC10973uz) c4314c5.m17301h4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m53122k4(C5659x1 c5659x1) {
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16971k4(C10947ak c10947ak) {
        m53125k4(c10947ak.m53142h4().Clone());
        m53124k4(c10947ak.m52858ck().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13522k4(C10951c5 c10951c5) {
        if (c10951c5.mo52909to() != null) {
            m53119k4(c10951c5.mo52909to());
        }
        if (c10951c5.m52903h4() != null) {
            m53123k4(c10951c5.m52903h4());
        }
        if (c10951c5.mo52902du() != null) {
            m53112x1((AbstractC10973uz) c10951c5.mo52902du());
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16973k4(C10953ck c10953ck) {
        m53125k4(c10953ck.m53142h4().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13523k4(C10955du c10955du) {
        m53125k4(c10955du.m52919k4().m53057x1().Clone());
        m53125k4(c10955du.m52919k4().m53053kk().Clone());
        m53125k4(c10955du.m52919k4().m53055to().Clone());
        m53125k4(c10955du.m52919k4().m53050k4().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16975k4(C10958h4 c10958h4) {
        m53125k4(c10958h4.m52933k4().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m53123k4(C10959ix c10959ix) {
        m53128k4(c10959ix.m52939k4().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16976k4(C10960jd c10960jd) {
        m53125k4(c10960jd.m53142h4().Clone());
        m53118k4(c10960jd.m52948x1());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13524k4(C10963ks c10963ks) {
        if (c10963ks.mo52902du() != null) {
            m53112x1((AbstractC10973uz) c10963ks.mo52902du());
        }
        if (c10963ks.mo52909to() != null) {
            m53119k4(c10963ks.mo52909to());
        }
        if (c10963ks.m53005x1() != null) {
            m53122k4(c10963ks.m53005x1());
        }
        m53125k4(c10963ks.m52982jd().Clone());
        m53124k4(c10963ks.m53002up().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16977k4(C10967qq c10967qq) {
        m53125k4(c10967qq.m53027k4().Clone());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13525k4(C10970u4 c10970u4) {
        if (c10970u4.m53081m9() != null) {
            m53123k4(c10970u4.m53081m9());
        }
        m53125k4(c10970u4.m53072k4().Clone());
        m53124k4(c10970u4.m53083x1().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53127k4(AbstractC10973uz abstractC10973uz) {
        this.f38267kk = 0.0f;
        this.f38268x1 = 0.0f;
        this.f38266k4 = false;
        m53112x1(abstractC10973uz);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13528k4(C10974v4 c10974v4) {
        for (int i = 0; i < c10974v4.m53117k4().size(); i++) {
            m53125k4(c10974v4.m53117k4().get_Item(i).Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53128k4(C12007ix c12007ix) {
        m53118k4(c12007ix.m56554dy());
        m53118k4(c12007ix.m56571to());
        m53118k4(c12007ix.m56556h4());
        m53118k4(c12007ix.m56558k4());
    }

    /* JADX INFO: renamed from: k4 */
    private void m53124k4(C12015qq c12015qq) {
        m53118k4(c12015qq.m56699x1());
        m53118k4(c12015qq.m56697kk());
    }

    /* JADX INFO: renamed from: k4 */
    private void m53125k4(C12025x6 c12025x6) {
        m53118k4(c12025x6.m56897x1());
        m53118k4(c12025x6.m56895kk());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public boolean mo22157k4(C10966ne c10966ne) {
        return true;
    }
}
