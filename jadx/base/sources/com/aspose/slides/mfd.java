package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class mfd extends AbstractC13749kv {
    public mfd(AbstractC1164gw abstractC1164gw) {
        m64192k4(abstractC1164gw);
    }

    /* JADX INFO: renamed from: ks */
    private boolean m64870ks() {
        return ChartTypeCharacterizer.isChartTypeBar(m64185ck().m6926yj().m5012up().m64945h4().getType());
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: dy */
    public C14567tm mo64187dy() {
        return m64185ck().m6926yj().m4980ck();
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: fa */
    public void mo64188fa() {
        if (mo64187dy().m71247k4().getType() == 1 || mo64187dy().m71247k4().getType() == 0) {
            mo64187dy().m71249k4(((AbstractC13749kv) this).f45882k4.m73223ts().Clone(), new C12025x6(((AbstractC13749kv) this).f45883kk.m73227xk(), ((AbstractC13749kv) this).f45883kk.m73206c6()));
            if (mo64187dy().m71247k4().hasEndCap()) {
                mo64187dy().m71248k4(((AbstractC13749kv) this).f45882k4.m73227xk(), ((AbstractC13749kv) this).f45882k4.m73206c6() - 3.0f, ((AbstractC13749kv) this).f45882k4.m73227xk(), ((AbstractC13749kv) this).f45882k4.m73206c6() + 3.0f);
            }
        }
        if (mo64187dy().m71247k4().getType() == 2 || mo64187dy().m71247k4().getType() == 0) {
            mo64187dy().m71249k4(((AbstractC13749kv) this).f45885x1.m73223ts().Clone(), new C12025x6(((AbstractC13749kv) this).f45883kk.m73227xk(), ((AbstractC13749kv) this).f45883kk.m73206c6()));
            if (mo64187dy().m71247k4().hasEndCap()) {
                mo64187dy().m71248k4(((AbstractC13749kv) this).f45885x1.m73227xk(), ((AbstractC13749kv) this).f45885x1.m73206c6() - 3.0f, ((AbstractC13749kv) this).f45885x1.m73227xk(), ((AbstractC13749kv) this).f45885x1.m73206c6() + 3.0f);
            }
        }
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: m9 */
    public double mo64194m9() {
        List<AbstractC1164gw> list = ((fml) C7019kk.m27452k4((Object) m64185ck().m73228yd(), fml.class)).f5072x1;
        double dM67469du = 0.0d;
        if (list.size() <= 1) {
            return 0.0d;
        }
        double dMo64197up = mo64197up();
        for (int i = 0; i < list.size(); i++) {
            dM67469du += C14116yg.m67469du((m64870ks() ? list.get_Item(i).m6918fa() : list.get_Item(i).m6923up()) - dMo64197up, 2.0d);
        }
        return C14116yg.m67496rv(dM67469du / ((double) (list.size() - 1)));
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: to */
    public void mo64195to() {
        double dM6918fa = m64870ks() ? m64185ck().m6918fa() : m64185ck().m6923up();
        int valueType = mo64187dy().m71247k4().getValueType();
        if (valueType == 0) {
            mo64199x1(m64185ck());
            return;
        }
        if (valueType == 1) {
            m64191k4(dM6918fa);
            return;
        }
        if (valueType == 2) {
            m64198x1(dM6918fa);
        } else if (valueType == 3) {
            m64193kk(dM6918fa);
        } else {
            if (valueType != 4) {
                return;
            }
            m64196to(dM6918fa);
        }
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: up */
    public double mo64197up() {
        List<AbstractC1164gw> list = ((fml) C7019kk.m27452k4((Object) m64185ck().m73228yd(), fml.class)).f5072x1;
        List.Enumerator<AbstractC1164gw> it = list.iterator();
        double dM6918fa = 0.0d;
        while (it.hasNext()) {
            try {
                AbstractC1164gw next = it.next();
                dM6918fa += m64870ks() ? next.m6918fa() : next.m6923up();
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
        return dM6918fa / ((double) list.size());
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: x1 */
    public void mo64199x1(AbstractC1164gw abstractC1164gw) {
        double dM6918fa = m64870ks() ? m64185ck().m6918fa() : m64185ck().m6923up();
        double dM1419k4 = ((ErrorBarsCustomValues) abstractC1164gw.m6926yj().m4988jd().getErrorBarsCustomValues()).m1419k4();
        double dM1422x1 = ((ErrorBarsCustomValues) abstractC1164gw.m6926yj().m4988jd().getErrorBarsCustomValues()).m1422x1();
        m64186du(dM6918fa - dM1419k4);
        m64189h4(dM6918fa + dM1422x1);
    }

    /* JADX INFO: renamed from: yj */
    public final void m64871yj() {
        g2y g2yVar;
        float fM56897x1;
        AbstractC14763x3 abstractC14763x3 = ((fml) C7019kk.m27452k4((Object) m73228yd(), fml.class)).m6216ks().f45392kk;
        C12025x6 c12025x6Clone = m64185ck().mo3519k4().Clone();
        if (mo64187dy().m71247k4().getValueType() == 3) {
            g2yVar = ((AbstractC13749kv) this).f45883kk;
            fM56897x1 = abstractC14763x3.mo4964k4(mo64197up());
        } else {
            g2yVar = ((AbstractC13749kv) this).f45883kk;
            fM56897x1 = c12025x6Clone.m56897x1();
        }
        g2yVar.m73208du(fM56897x1);
        ((AbstractC13749kv) this).f45883kk.m73212h4(c12025x6Clone.m56895kk());
        if (mo64187dy().m71247k4().getType() == 1 || mo64187dy().m71247k4().getType() == 0) {
            g2y g2yVar2 = ((AbstractC13749kv) this).f45882k4;
            boolean zM27469x1 = C7019kk.m27469x1(abstractC14763x3, AbstractC14265p3.class);
            double dM64184c5 = m64184c5();
            if (zM27469x1) {
                dM64184c5 += 0.5d;
            }
            g2yVar2.m73208du(abstractC14763x3.mo4964k4(dM64184c5));
            ((AbstractC13749kv) this).f45882k4.m73212h4(((AbstractC13749kv) this).f45883kk.m73219qm());
        }
        if (mo64187dy().m71247k4().getType() == 2 || mo64187dy().m71247k4().getType() == 0) {
            g2y g2yVar3 = ((AbstractC13749kv) this).f45885x1;
            boolean zM27469x12 = C7019kk.m27469x1(abstractC14763x3, AbstractC14265p3.class);
            double dM64190jd = m64190jd();
            if (zM27469x12) {
                dM64190jd += 0.5d;
            }
            g2yVar3.m73208du(abstractC14763x3.mo4964k4(dM64190jd));
            ((AbstractC13749kv) this).f45885x1.m73212h4(((AbstractC13749kv) this).f45883kk.m73219qm());
        }
        ((AbstractC13749kv) this).f45883kk.m73220ss();
        ((AbstractC13749kv) this).f45885x1.m73220ss();
        ((AbstractC13749kv) this).f45882k4.m73220ss();
    }
}
