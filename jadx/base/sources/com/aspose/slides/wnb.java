package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class wnb extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private C14328q5 f49826k4;

    /* JADX INFO: renamed from: x1 */
    private List<ssa> f49827x1 = new List<>();

    public wnb(C14328q5 c14328q5) {
        C14365qy c14365qyM69408m9 = c14328q5.m69408m9();
        this.f49826k4 = c14328q5;
        List.Enumerator<C13847mr> it = c14365qyM69408m9.m69865up().iterator();
        while (it.hasNext()) {
            try {
                ssa ssaVar = new ssa(it.next());
                m73215k4(ssaVar);
                this.f49827x1.addItem(ssaVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < this.f49826k4.m69408m9().m69865up().size(); i3++) {
            if (ChartTypeCharacterizer.isChartTypeColumn(this.f49826k4.m69408m9().m69865up().get_Item(i3).m64945h4().getType()) && (ChartTypeCharacterizer.m758dy(this.f49826k4.m69408m9().m69865up().get_Item(i3).m64945h4().getType()) || ChartTypeCharacterizer.m761jd(this.f49826k4.m69408m9().m69865up().get_Item(i3).m64945h4().getType()))) {
                i2 = i2 == -1 ? i3 : i2;
                i++;
                if (i3 == this.f49826k4.m69408m9().m69865up().size() - 1 && i > 1) {
                    this.f49827x1.reverse(i2, i);
                }
            } else if (i2 != -1) {
                this.f49827x1.reverse(i2, i);
                i = 0;
                i2 = -1;
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        List.Enumerator<ssa> it = this.f49827x1.iterator();
        float fM73203ak = 0.0f;
        float fM73225wy = 0.0f;
        while (it.hasNext()) {
            try {
                ssa next = it.next();
                next.m73210fa(new C14713vw(c14713vw.m72555k4() * 0.35f, c14713vw.m72556x1()));
                fM73203ak += next.m73203ak();
                if (next.m73225wy() > fM73225wy) {
                    fM73225wy = next.m73225wy();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m73222to(fM73203ak);
        m73217kk(fM73225wy);
    }

    /* JADX INFO: renamed from: m9 */
    public final List<ssa> m72840m9() {
        return this.f49827x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m72841to() {
        List.Enumerator<ssa> it = m72840m9().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                int iMo6844to = it.next().m70762to().mo6844to();
                if (iMo6844to == 2) {
                    return 2;
                }
                if (iMo6844to == 1 && i != 1) {
                    i = 1;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return i;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C12007ix c12007ix = new C12007ix(m73218lr().m73227xk(), m73218lr().m73206c6(), m73218lr().m73225wy(), m73218lr().m73203ak());
        C14851yl c14851yl = new C14851yl(this.f49826k4.m69408m9());
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            super.mo3482x1();
            C14365qy c14365qyM69408m9 = this.f49826k4.m69408m9();
            DataTable dataTable = (DataTable) this.f49826k4.m69408m9().m69834fa().getChartDataTable();
            if (dataTable.hasBorderOutline()) {
                im9.m7709k4(new C12025x6(m73227xk(), m73206c6()), new C12025x6(m73227xk() + m73225wy(), m73206c6()), this.f49826k4.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
                im9.m7709k4(new C12025x6(m73227xk(), m73206c6()), new C12025x6(m73227xk(), m73206c6() + m73203ak()), this.f49826k4.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
                im9.m7709k4(new C12025x6(m73227xk(), m73206c6() + m73203ak()), new C12025x6(m73227xk() + m73225wy(), m73206c6() + m73203ak()), this.f49826k4.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
            }
            if (dataTable.hasBorderHorizontal()) {
                float fM73203ak = 0.0f;
                for (int i = 0; i < this.f49827x1.size() - 1; i++) {
                    fM73203ak += this.f49827x1.get_Item(i).m73203ak();
                    im9.m7709k4(new C12025x6(m73227xk(), m73206c6() + fM73203ak), new C12025x6(m73227xk() + m73225wy(), m73206c6() + fM73203ak), this.f49826k4.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
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
        for (int i = 0; i < this.f49827x1.size(); i++) {
            this.f49827x1.get_Item(i).m73212h4(fM73203ak);
            fM73203ak += this.f49827x1.get_Item(i).m73203ak();
            this.f49827x1.get_Item(i).m73220ss();
        }
    }
}
