package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.lq */
/* JADX INFO: loaded from: classes3.dex */
class C13790lq extends nl8 {
    public C13790lq(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        List.Enumerator<C0886d8> it = m6220yj().m64944dy().iterator();
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                C13846mq c13846mq = new C13846mq(next);
                ((fml) this).f5072x1.addItem(c13846mq);
                m73215k4((AbstractC14770x9) c13846mq);
                if (!c13846mq.m6926yj().m4983dy() && next.m5003ks() != null && next.m5003ks().m4569up()) {
                    dt0 dt0Var = new dt0(c13846mq);
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
        double dM68933to = ((C14266p4) C7019kk.m27452k4((Object) m6216ks(), C14266p4.class)).m68933to();
        float fM64503to = m64503to();
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            if (C14044b3.m66437kk(((fml) this).f5072x1.get_Item(i).m6926yj().m4999kk())) {
                ((fml) this).f5072x1.get_Item(i).m73210fa(new C14713vw(0.0f, 0.0f));
            } else {
                float bubbleSizeScale = (((fml) this).f5072x1.get_Item(i).m6926yj().m5012up().m64945h4().getBubbleSizeScale() / 100.0f) + 1.0f;
                float fM67496rv = ((float) C14116yg.m67496rv((((fml) this).f5072x1.get_Item(i).m6926yj().m4999kk() * ((double) ((float) ((C14116yg.m67469du(fM64503to, 2.0d) * 3.141592653589793d) / dM68933to)))) / 3.141592653589793d)) * ((float) C14116yg.m67476k4(bubbleSizeScale, bubbleSizeScale < 2.0f ? 2.0799999237060547d : 2.03f - (bubbleSizeScale / 50.0f)));
                ILineFormat line = ((fml) this).f5072x1.get_Item(i).m6926yj().m4988jd().getFormat().getLine();
                if (line.isFormatNotDefined()) {
                    line = m6220yj().m64945h4().getFormat().getLine();
                }
                float width = (fM67496rv * 2.0f) - (C14044b3.m66437kk(line.getWidth()) ? 0.0f : ((float) line.getWidth()) / 2.0f);
                ((fml) this).f5072x1.get_Item(i).m73210fa(new C14713vw(width, width));
            }
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

    /* JADX INFO: renamed from: to */
    public final float m64503to() {
        mxy mxyVarM5806du = ((C0974f2) C7019kk.m27452k4((Object) m73228yd().m73228yd().m73228yd(), C0974f2.class)).m5806du(new C14713vw(m6220yj().m64941c5().m69867v4(), m6220yj().m64941c5().m69852lr()));
        return C14116yg.m67504x1(mxyVarM5806du.m72555k4(), mxyVarM5806du.m72556x1()) / 8.4f;
    }
}
