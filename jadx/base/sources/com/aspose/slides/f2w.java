package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class f2w extends nl8 {
    public f2w(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        List.Enumerator<C0886d8> it = m6220yj().m64944dy().iterator();
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                jai jaiVar = new jai(next);
                ((fml) this).f5072x1.addItem(jaiVar);
                m73215k4((AbstractC14770x9) jaiVar);
                if (!jaiVar.m6926yj().m4983dy() && next.m5003ks() != null && next.m5003ks().m4569up()) {
                    dt0 dt0Var = new dt0(jaiVar);
                    ((fml) this).f5069kk.addItem(dt0Var);
                    m73215k4(dt0Var);
                    if (next.m5003ks().m4570x1().getDataLabelFormat().getShowLeaderLines() || c13847mr.m64945h4().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                        klm klmVar = new klm(next);
                        ((fml) this).f5071to.addItem(klmVar);
                        m73215k4(klmVar);
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    @Override // com.aspose.slides.fml, com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            ((fml) this).f5072x1.get_Item(i).m73210fa(c14713vw);
        }
        List.Enumerator<C14177nd> it = ((fml) this).f5069kk.iterator();
        while (it.hasNext()) {
            try {
                C14177nd next = it.next();
                next.m73210fa(next.m67979yj());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<zsm> it2 = ((fml) this).f5071to.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it2 = ((fml) this).f5065du.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        m6211h4(c14713vw);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C12007ix c12007ix = new C12007ix(m73228yd().m73227xk(), m73228yd().m73206c6(), m73228yd().m73225wy(), m73228yd().m73203ak());
        C14851yl c14851yl = new C14851yl(m6220yj().m64941c5());
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            List<AbstractC1164gw> list = new List<>();
            for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
                if (!((fml) this).f5072x1.get_Item(i).m6926yj().m4983dy()) {
                    list.addItem(((fml) this).f5072x1.get_Item(i));
                } else if (m6220yj().m64941c5().m69834fa().getDisplayBlanksAs() == 0) {
                    m6768k4(list);
                    list.clear();
                }
            }
            if (list.size() > 0) {
                m6768k4(list);
            }
            c14851yl.m73923k4();
        } catch (Throwable th) {
            c14851yl.m73923k4();
            throw th;
        }
    }
}
