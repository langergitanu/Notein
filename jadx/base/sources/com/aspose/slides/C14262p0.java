package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.p0 */
/* JADX INFO: loaded from: classes3.dex */
class C14262p0 extends AbstractC14770x9 {

    /* JADX INFO: renamed from: kk */
    private AbstractC14763x3 f47987kk;

    /* JADX INFO: renamed from: x1 */
    private List<C1098ff> f47988x1 = new List<>();

    /* JADX INFO: renamed from: k4 */
    private List<C1098ff> f47986k4 = new List<>();

    public C14262p0(AbstractC14763x3 abstractC14763x3) {
        this.f47987kk = abstractC14763x3;
    }

    /* JADX INFO: renamed from: dy */
    private boolean m68919dy() {
        return C7019kk.m27469x1(this.f47987kk, d6s.class) || C7019kk.m27469x1(this.f47987kk, tsh.class) || C7019kk.m27469x1(this.f47987kk, f2h.class) || C7019kk.m27469x1(this.f47987kk, iuf.class);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68920k4(C1098ff c1098ff) {
        if (!this.f47987kk.m73021fa().mo3221T_() || this.f47987kk.m73021fa().m73026k4().m73384dy().getFormat().getLine().getFillFormat().getFillType() == 0) {
            return;
        }
        if (m68919dy() && c1098ff.m73219qm() == this.f47987kk.mo63718up()) {
            c1098ff.mo63967x1(false);
        }
        if (m68919dy() || c1098ff.m73205bz() != this.f47987kk.mo63718up()) {
            return;
        }
        c1098ff.mo63967x1(false);
    }

    /* JADX INFO: renamed from: m9 */
    private void m68921m9() {
        List.Enumerator<C1098ff> it = this.f47988x1.iterator();
        while (true) {
            try {
                float fM6150to = 0.0f;
                if (!it.hasNext()) {
                    break;
                }
                C1098ff next = it.next();
                next.m73208du(m68919dy() ? 0.0f : next.m6150to());
                if (m68919dy()) {
                    fM6150to = next.m6150to();
                }
                next.m73212h4(fM6150to);
                next.m73220ss();
                m68920k4(next);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f47986k4.iterator();
        while (it.hasNext()) {
            try {
                C1098ff next2 = it.next();
                next2.m73208du(m68919dy() ? 0.0f : next2.m6150to());
                next2.m73212h4(m68919dy() ? next2.m6150to() : 0.0f);
                next2.m73220ss();
                m68920k4(next2);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: to */
    private void m68922to() {
        List.Enumerator<C1098ff> it = this.f47988x1.iterator();
        while (it.hasNext()) {
            try {
                C1098ff next = it.next();
                next.m73208du((m73225wy() / 2.0f) - (next.m73225wy() / 2.0f));
                next.m73212h4((m73203ak() / 2.0f) - (next.m73203ak() / 2.0f));
                next.m73220ss();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f47986k4.iterator();
        while (it.hasNext()) {
            try {
                C1098ff next2 = it.next();
                next2.m73208du((m73225wy() / 2.0f) - (next2.m73225wy() / 2.0f));
                next2.m73212h4((m73203ak() / 2.0f) - (next2.m73203ak() / 2.0f));
                next2.m73220ss();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 2;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: U_ */
    public void mo5524U_() {
        if (mo3221T_()) {
            for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
                abstractC14770x9.mo5524U_();
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        if (ChartTypeCharacterizer.isChartTypeRadar(this.f47987kk.f49908x1.get_Item(0).m64945h4().getType())) {
            m68922to();
        } else {
            m68921m9();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        if (this.f47987kk.m73026k4().m73384dy().getShowMinorGridLines()) {
            for (float f : C3085sv.m13067du(this.f47987kk.mo63719uz())) {
                C1098ff c1098ff = new C1098ff(this.f47987kk, false, f);
                this.f47988x1.addItem(c1098ff);
                m73215k4((AbstractC14770x9) c1098ff);
                c1098ff.m73210fa(c14713vw);
            }
        }
        if (this.f47987kk.m73026k4().m73384dy().getShowMajorGridLines()) {
            for (float f2 : C3085sv.m13067du(this.f47987kk.mo63717u4())) {
                C1098ff c1098ff2 = new C1098ff(this.f47987kk, true, f2);
                this.f47986k4.addItem(c1098ff2);
                m73215k4((AbstractC14770x9) c1098ff2);
                c1098ff2.m73210fa(c14713vw);
            }
        }
    }
}
