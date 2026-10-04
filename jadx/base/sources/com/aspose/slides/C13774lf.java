package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.lf */
/* JADX INFO: loaded from: classes3.dex */
class C13774lf extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC14763x3 f45983k4;

    /* JADX INFO: renamed from: kk */
    private final List<C1118fr> f45984kk = new List<>();

    /* JADX INFO: renamed from: x1 */
    private final C14328q5 f45985x1;

    public C13774lf(C14328q5 c14328q5, AbstractC14763x3 abstractC14763x3) {
        this.f45985x1 = c14328q5;
        this.f45983k4 = abstractC14763x3;
    }

    /* JADX INFO: renamed from: m9 */
    private void m64386m9() {
        List.Enumerator<C13847mr> it = this.f45984kk.iterator();
        while (it.hasNext()) {
            try {
                m73226x1(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        this.f45984kk.clear();
        if (this.f45983k4 == null) {
            return;
        }
        List.Enumerator<C1210hn> it2 = this.f45985x1.m69408m9().m69871x1().iterator();
        while (it2.hasNext()) {
            try {
                C1210hn next = it2.next();
                if (next != null) {
                    C1118fr c1118fr = new C1118fr(C0841c4.m4467k4(next.m7238x1(), this.f45983k4), this.f45985x1);
                    this.f45984kk.addItem(c1118fr);
                    m73215k4(c1118fr);
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it = this.f45985x1.m69408m9().m69865up().iterator();
        int size = 0;
        while (it.hasNext()) {
            try {
                C13847mr next2 = it.next();
                if (size < next2.m64944dy().size()) {
                    size = next2.m64944dy().size();
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        while (this.f45984kk.size() < size) {
            C1118fr c1118fr2 = new C1118fr(C14113y2.f47374k4, this.f45985x1);
            c1118fr2.mo63967x1(false);
            this.f45984kk.addItem(c1118fr2);
            m73215k4(c1118fr2);
        }
    }

    /* JADX INFO: renamed from: to */
    private float m64387to() {
        if (!C7019kk.m27469x1(this.f45983k4, C13785ll.class)) {
            return 0.0f;
        }
        C12013m9 c12013m9M73425x1 = this.f45983k4.m73026k4().m73425x1();
        return OooOOOO.OooO00o(c12013m9M73425x1.m56636c5() * c12013m9M73425x1.m56651x1().m56526du(c12013m9M73425x1.m56642jd()), c12013m9M73425x1.m56651x1().m56535to(c12013m9M73425x1.m56642jd()), 0.076f, 0.21f);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m64386m9();
        float fM72555k4 = c14713vw.m72555k4() / this.f45984kk.size();
        float f = 0.0f;
        if (C14064he.m66715kk(fM72555k4) || fM72555k4 < 0.0f) {
            fM72555k4 = 0.0f;
        }
        List.Enumerator<C1118fr> it = this.f45984kk.iterator();
        while (it.hasNext()) {
            try {
                C1118fr next = it.next();
                oju ojuVarClone = next.m73363k4(next.m6282m9(), fM72555k4, c14713vw.m72556x1()).Clone();
                ojuVarClone.f47837x1 = (m64387to() * 2.0f) + ojuVarClone.f47837x1;
                next.m73210fa(new C14713vw(ojuVarClone.f47836k4, ojuVarClone.f47837x1));
                float f2 = ojuVarClone.f47837x1;
                if (f2 > f) {
                    f = f2;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m73214k4(new oju(c14713vw.m72555k4(), f));
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        super.mo3482x1();
        C14365qy c14365qyM69408m9 = this.f45985x1.m69408m9();
        DataTable dataTable = (DataTable) this.f45985x1.m69408m9().m69834fa().getChartDataTable();
        if (dataTable.hasBorderOutline()) {
            im9.m7709k4(new C12025x6(m73227xk(), m73206c6()), new C12025x6(m73227xk() + m73225wy(), m73206c6()), this.f45985x1.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
            im9.m7709k4(new C12025x6(m73227xk(), m73206c6()), new C12025x6(m73227xk(), m73206c6() + m73203ak()), this.f45985x1.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
            im9.m7709k4(new C12025x6(m73227xk() + m73225wy(), m73206c6()), new C12025x6(m73227xk() + m73225wy(), m73206c6() + m73203ak()), this.f45985x1.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
        }
        if (dataTable.hasBorderVertical()) {
            float fM73225wy = m73225wy() / this.f45984kk.size();
            for (int i = 0; i < this.f45984kk.size(); i++) {
                float fM73227xk = (i * fM73225wy) + m73227xk();
                im9.m7709k4(new C12025x6(fM73227xk, m73206c6()), new C12025x6(fM73227xk, m73206c6() + m73203ak()), this.f45985x1.m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qyM69408m9);
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        float fM72555k4 = c14713vw.m72555k4() / this.f45984kk.size();
        for (int i = 0; i < this.f45984kk.size(); i++) {
            C1118fr c1118fr = this.f45984kk.get_Item(i);
            c1118fr.m73208du(((fM72555k4 / 2.0f) + (i * fM72555k4)) - (c1118fr.m73225wy() / 2.0f));
            c1118fr.m73212h4(((m73203ak() / 2.0f) - (c1118fr.m73203ak() / 2.0f)) + m64387to());
            c1118fr.m73220ss();
        }
    }
}
