package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class wm6 extends AbstractC13749kv {
    public wm6(AbstractC1164gw abstractC1164gw) {
        m64192k4(abstractC1164gw);
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: dy */
    public C14567tm mo64187dy() {
        return m64185ck().m6926yj().m4984fa();
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: fa */
    public void mo64188fa() {
        if (mo64187dy().m71247k4().getType() == 1 || mo64187dy().m71247k4().getType() == 0) {
            mo64187dy().m71249k4(((AbstractC13749kv) this).f45882k4.m73223ts().Clone(), new C12025x6(((AbstractC13749kv) this).f45883kk.m73227xk(), ((AbstractC13749kv) this).f45883kk.m73206c6()));
            if (mo64187dy().m71247k4().hasEndCap()) {
                mo64187dy().m71248k4(((AbstractC13749kv) this).f45882k4.m73227xk() - 3.0f, ((AbstractC13749kv) this).f45882k4.m73206c6(), ((AbstractC13749kv) this).f45882k4.m73227xk() + 3.0f, ((AbstractC13749kv) this).f45882k4.m73206c6());
            }
        }
        if (mo64187dy().m71247k4().getType() == 2 || mo64187dy().m71247k4().getType() == 0) {
            mo64187dy().m71249k4(((AbstractC13749kv) this).f45885x1.m73223ts().Clone(), new C12025x6(((AbstractC13749kv) this).f45883kk.m73227xk(), ((AbstractC13749kv) this).f45883kk.m73206c6()));
            if (mo64187dy().m71247k4().hasEndCap()) {
                mo64187dy().m71248k4(((AbstractC13749kv) this).f45885x1.m73227xk() - 3.0f, ((AbstractC13749kv) this).f45885x1.m73206c6(), ((AbstractC13749kv) this).f45885x1.m73227xk() + 3.0f, ((AbstractC13749kv) this).f45885x1.m73206c6());
            }
        }
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: m9 */
    public double mo64194m9() {
        List<AbstractC1164gw> list = ((fml) C7019kk.m27452k4((Object) m64185ck().m73228yd(), fml.class)).f5072x1;
        double dMo64197up = mo64197up();
        double dM67469du = 0.0d;
        for (int i = 0; i < list.size(); i++) {
            dM67469du += C14116yg.m67469du(list.get_Item(i).m6918fa() - dMo64197up, 2.0d);
        }
        return C14116yg.m67496rv(dM67469du / ((double) (list.size() - 1)));
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: to */
    public void mo64195to() {
        int valueType = mo64187dy().m71247k4().getValueType();
        if (valueType == 0) {
            mo64199x1(m64185ck());
            return;
        }
        if (valueType == 1) {
            m64191k4(m64185ck().m6918fa());
            return;
        }
        if (valueType == 2) {
            m64198x1(m64185ck().m6918fa());
        } else if (valueType == 3) {
            m64193kk(m64185ck().m6918fa());
        } else {
            if (valueType != 4) {
                return;
            }
            m64196to(m64185ck().m6918fa());
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
                dM6918fa += it.next().m6918fa();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return dM6918fa / ((double) list.size());
    }

    @Override // com.aspose.slides.AbstractC13749kv
    /* JADX INFO: renamed from: x1 */
    public void mo64199x1(AbstractC1164gw abstractC1164gw) {
        double dM6918fa = m64185ck().m6918fa();
        double dM1420kk = ((ErrorBarsCustomValues) abstractC1164gw.m6926yj().m4988jd().getErrorBarsCustomValues()).m1420kk();
        double dM1421to = ((ErrorBarsCustomValues) abstractC1164gw.m6926yj().m4988jd().getErrorBarsCustomValues()).m1421to();
        m64186du(dM6918fa - dM1420kk);
        m64189h4(dM6918fa + dM1421to);
    }

    /* JADX INFO: renamed from: yj */
    public final void m72828yj() {
        ValueAxisBase valueAxisBase = (ValueAxisBase) C7019kk.m27452k4((Object) ((fml) C7019kk.m27452k4((Object) m73228yd(), fml.class)).m6216ks().f45394x1, ValueAxisBase.class);
        C12025x6 c12025x6Clone = m64185ck().mo3519k4().Clone();
        if (mo64187dy().m71247k4().getValueType() == 3) {
            ((AbstractC13749kv) this).f45883kk.m73212h4(valueAxisBase.mo4964k4(mo64197up()));
            ((AbstractC13749kv) this).f45883kk.m73208du(c12025x6Clone.m56897x1());
        } else {
            ((AbstractC13749kv) this).f45883kk.m73208du(c12025x6Clone.m56897x1());
            ((AbstractC13749kv) this).f45883kk.m73212h4(c12025x6Clone.m56895kk());
        }
        if (mo64187dy().m71247k4().getType() == 1 || mo64187dy().m71247k4().getType() == 0) {
            ((AbstractC13749kv) this).f45882k4.m73212h4(valueAxisBase.mo4964k4(m64184c5()));
            ((AbstractC13749kv) this).f45882k4.m73208du(((AbstractC13749kv) this).f45883kk.m73205bz());
        }
        if (mo64187dy().m71247k4().getType() == 2 || mo64187dy().m71247k4().getType() == 0) {
            ((AbstractC13749kv) this).f45885x1.m73212h4(valueAxisBase.mo4964k4(m64190jd()));
            ((AbstractC13749kv) this).f45885x1.m73208du(((AbstractC13749kv) this).f45883kk.m73205bz());
        }
        ((AbstractC13749kv) this).f45883kk.m73220ss();
        ((AbstractC13749kv) this).f45885x1.m73220ss();
        ((AbstractC13749kv) this).f45882k4.m73220ss();
    }
}
