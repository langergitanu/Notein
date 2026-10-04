package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ljk extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private List<List<C1118fr>> f46006k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private wnb f46007kk;

    /* JADX INFO: renamed from: x1 */
    private C14328q5 f46008x1;

    public ljk(C14328q5 c14328q5, wnb wnbVar) {
        C14365qy c14365qyM69408m9 = c14328q5.m69408m9();
        this.f46008x1 = c14328q5;
        this.f46007kk = wnbVar;
        List.Enumerator<C0886d8> it = c14365qyM69408m9.m69865up().iterator();
        while (it.hasNext()) {
            try {
                C13847mr next = it.next();
                List<C1118fr> list = new List<>();
                this.f46006k4.addItem(list);
                it = next.m64944dy().iterator();
                while (it.hasNext()) {
                    try {
                        C0886d8 next2 = it.next();
                        C1118fr c1118fr = new C1118fr(C13729ki.m63880k4((Object) Double.valueOf(next2.m4989k4()), next2.m5008to(), false), c14328q5);
                        c1118fr.mo63967x1(!next2.m4983dy());
                        list.addItem(c1118fr);
                        m73215k4(c1118fr);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f46008x1.m69408m9().m69865up().size(); i3++) {
            if (ChartTypeCharacterizer.isChartTypeColumn(this.f46008x1.m69408m9().m69865up().get_Item(i3).m64945h4().getType()) && (ChartTypeCharacterizer.m758dy(this.f46008x1.m69408m9().m69865up().get_Item(i3).m64945h4().getType()) || ChartTypeCharacterizer.m761jd(this.f46008x1.m69408m9().m69865up().get_Item(i3).m64945h4().getType()))) {
                i = i == -1 ? i3 : i;
                i2++;
                if (i3 == this.f46008x1.m69408m9().m69865up().size() - 1 && i2 > 1) {
                    this.f46006k4.reverse(i, i2);
                }
            } else if (i != -1) {
                this.f46006k4.reverse(i, i2);
                i = -1;
                i2 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private float m64404to() {
        return 1.5f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        float fM72556x1 = c14713vw.m72556x1() / this.f46006k4.size();
        if (C14064he.m66715kk(fM72556x1)) {
            fM72556x1 = c14713vw.m72556x1();
        }
        List.Enumerator<C1118fr> it = this.f46006k4.iterator();
        while (it.hasNext()) {
            try {
                List<C1118fr> next = it.next();
                float fM72555k4 = c14713vw.m72555k4() / next.size();
                if (C14064he.m66715kk(fM72555k4) || fM72555k4 < 0.0f) {
                    fM72555k4 = 0.0f;
                }
                it = next.iterator();
                while (it.hasNext()) {
                    try {
                        C1118fr next2 = it.next();
                        oju ojuVarClone = next2.m73363k4(next2.m6282m9(), fM72555k4, fM72556x1).Clone();
                        ojuVarClone.f47837x1 = (m64404to() * 2.0f) + ojuVarClone.f47837x1;
                        next2.m73210fa(new C14713vw(ojuVarClone.f47836k4, ojuVarClone.f47837x1));
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C12007ix c12007ix = new C12007ix(m73218lr().m73227xk(), m73218lr().m73206c6(), m73218lr().m73225wy(), m73218lr().m73203ak());
        C14851yl c14851yl = new C14851yl(this.f46008x1.m69408m9());
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            super.mo3482x1();
            C14365qy c14365qyM69408m9 = this.f46008x1.m69408m9();
            DataTable dataTable = (DataTable) this.f46008x1.m69408m9().m69834fa().getChartDataTable();
            if (dataTable.hasBorderOutline()) {
                im9.m7709k4(new C12025x6(m73227xk(), m73206c6()), new C12025x6(m73227xk() + m73225wy(), m73206c6()), this.f46008x1.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
                im9.m7709k4(new C12025x6(m73227xk(), m73206c6()), new C12025x6(m73227xk(), m73206c6() + m73203ak()), this.f46008x1.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
                im9.m7709k4(new C12025x6(m73227xk(), m73206c6() + m73203ak()), new C12025x6(m73227xk() + m73225wy(), m73206c6() + m73203ak()), this.f46008x1.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
                im9.m7709k4(new C12025x6(m73227xk() + m73225wy(), m73206c6()), new C12025x6(m73227xk() + m73225wy(), m73206c6() + m73203ak()), this.f46008x1.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
            }
            if (dataTable.hasBorderHorizontal()) {
                float fM73203ak = 0.0f;
                for (int i = 0; i < this.f46007kk.m72840m9().size() - 1; i++) {
                    fM73203ak += this.f46007kk.m72840m9().get_Item(i).m73203ak();
                    im9.m7709k4(new C12025x6(m73227xk(), m73206c6() + fM73203ak), new C12025x6(m73227xk() + m73225wy(), m73206c6() + fM73203ak), this.f46008x1.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
                }
            }
            if (dataTable.hasBorderVertical()) {
                float fM73225wy = m73225wy() / this.f46006k4.get_Item(0).size();
                for (int i2 = 0; i2 < this.f46006k4.get_Item(0).size(); i2++) {
                    float fM73227xk = (i2 * fM73225wy) + m73227xk();
                    im9.m7709k4(new C12025x6(fM73227xk, m73206c6()), new C12025x6(fM73227xk, m73206c6() + m73203ak()), this.f46008x1.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
                }
            }
            c14851yl.m73923k4();
        } catch (Throwable th) {
            c14851yl.m73923k4();
            throw th;
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        float fM73203ak = 0.0f;
        for (int i = 0; i < this.f46007kk.m72840m9().size(); i++) {
            float fM73203ak2 = (this.f46007kk.m72840m9().get_Item(i).m73203ak() / 2.0f) + fM73203ak;
            float fM72555k4 = c14713vw.m72555k4() / this.f46006k4.get_Item(i).size();
            for (int i2 = 0; i2 < this.f46006k4.get_Item(i).size(); i2++) {
                C1118fr c1118fr = this.f46006k4.get_Item(i).get_Item(i2);
                c1118fr.m73208du(((fM72555k4 / 2.0f) + (i2 * fM72555k4)) - (c1118fr.m73225wy() / 2.0f));
                c1118fr.m73212h4((fM73203ak2 - (c1118fr.m73203ak() / 2.0f)) + m64404to());
                c1118fr.m73220ss();
            }
            fM73203ak += this.f46007kk.m72840m9().get_Item(i).m73203ak();
        }
    }
}
