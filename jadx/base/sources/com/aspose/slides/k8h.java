package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class k8h extends ValueAxisBase {
    public k8h(C14787xi c14787xi) {
        super(c14787xi);
    }

    /* JADX INFO: renamed from: ar */
    private boolean m63714ar() {
        List.Enumerator<C13847mr> it = ((AbstractC14763x3) this).f49908x1.iterator();
        while (it.hasNext()) {
            try {
                if (ChartTypeCharacterizer.m761jd(it.next().m64945h4().getType())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    private double m63715kk(double d) {
        boolean z = d >= 0.0d;
        double dM67475k4 = C14116yg.m67475k4(d);
        if (z) {
            return kc0.m63762x1(dM67475k4);
        }
        double dM63762x1 = kc0.m63762x1(dM67475k4);
        if (dM63762x1 != dM67475k4) {
            dM63762x1 += 1.0d;
        }
        return -dM63762x1;
    }

    /* JADX INFO: renamed from: x1 */
    private double m63716x1(double d) {
        boolean z = d >= 0.0d;
        double dM67475k4 = C14116yg.m67475k4(d);
        if (!z) {
            return -kc0.m63762x1(dM67475k4);
        }
        double dM63762x1 = kc0.m63762x1(dM67475k4);
        return dM63762x1 != dM67475k4 ? dM63762x1 + 1.0d : dM63762x1;
    }

    @Override // com.aspose.slides.ValueAxisBase
    /* JADX INFO: renamed from: qq */
    public void mo3038qq() {
        double dM73391k4;
        this.f3633fa = m73026k4().m73384dy().isAutomaticMinValue();
        this.f3638up = m73026k4().m73384dy().isAutomaticMaxValue();
        this.f3639yj = 1;
        this.f3631ck = 1.0d;
        if (!m73026k4().m73384dy().isAutomaticMajorUnit()) {
            this.f3631ck = C14116yg.m67502x1(m73026k4().m73391k4(m73026k4().m73384dy().getMajorUnit()), 1.0d);
        }
        ((ValueAxisBase) this).f3630c5 = m63715kk(((ValueAxisBase) this).f3630c5);
        ((ValueAxisBase) this).f3634jd = m63716x1(((ValueAxisBase) this).f3634jd);
        if (m73026k4().m73384dy().isAutomaticMaxValue() && m73026k4().m73384dy().isAutomaticMinValue()) {
            this.f3639yj = 1;
        } else {
            if (!m73026k4().m73384dy().isAutomaticMaxValue() && m73026k4().m73384dy().isAutomaticMinValue()) {
                this.f3639yj = 1;
                dM73391k4 = C14116yg.m67477k4(m73026k4().m73391k4(m73026k4().m73384dy().getMaxValue()), 10);
            } else if (!m73026k4().m73384dy().isAutomaticMaxValue() || m73026k4().m73384dy().isAutomaticMinValue()) {
                ((ValueAxisBase) this).f3630c5 = m73026k4().m73391k4(m73026k4().m73384dy().getMinValue());
                dM73391k4 = m73026k4().m73391k4(m73026k4().m73384dy().getMaxValue());
            } else {
                this.f3639yj = 1;
                ((ValueAxisBase) this).f3630c5 = C14116yg.m67477k4(m73026k4().m73391k4(m73026k4().m73384dy().getMinValue()), 10);
            }
            ((ValueAxisBase) this).f3634jd = dM73391k4;
        }
        while (true) {
            double d = ((ValueAxisBase) this).f3634jd - ((ValueAxisBase) this).f3630c5;
            double d2 = this.f3631ck;
            if (d / d2 <= 1000.0d) {
                return;
            } else {
                this.f3631ck = d2 * 2.0d;
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: u4 */
    public List<Float> mo63717u4() {
        List<Float> list = new List<>();
        double dM73391k4 = m73026k4().m73391k4(m3033gi());
        double dM73391k42 = m73026k4().m73391k4(m3039s7());
        float fM73203ak = m73020du() ? m73203ak() : m73225wy();
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            if (((AbstractC14763x3) this).f49904k4.get_Item(i).mo3221T_()) {
                double dM73391k43 = m73026k4().m73391k4(((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(i).m68259m9(), Double.TYPE)).doubleValue());
                list.addItem(Float.valueOf(((m73026k4().m73384dy().isPlotOrderReversed() || m73020du()) && !(m73026k4().m73384dy().isPlotOrderReversed() && m73020du())) ? (float) (((dM73391k4 - dM73391k43) / (dM73391k4 - dM73391k42)) * ((double) fM73203ak)) : fM73203ak - ((float) (((dM73391k4 - dM73391k43) / (dM73391k4 - dM73391k42)) * ((double) fM73203ak)))));
            }
        }
        return list;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: up */
    public float mo63718up() {
        return mo4964k4(mo63720yj());
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: uz */
    public List<Float> mo63719uz() {
        List<Float> list = new List<>();
        double dM73391k4 = m73026k4().m73391k4(m3033gi());
        double dM73391k42 = m73026k4().m73391k4(m3039s7());
        float fM73203ak = m73020du() ? m73203ak() : m73225wy();
        double dM3039s7 = m3039s7() * 2.0d;
        double dM3039s72 = m3039s7();
        while (dM3039s7 < m3033gi()) {
            while (dM3039s7 < m73026k4().m73384dy().getLogBase() * dM3039s72 && dM3039s7 < m3033gi()) {
                double dM73391k43 = m73026k4().m73391k4(dM3039s7);
                dM3039s7 += dM3039s72;
                list.addItem(Float.valueOf(((m73026k4().m73384dy().isPlotOrderReversed() || m73020du()) && !(m73026k4().m73384dy().isPlotOrderReversed() && m73020du())) ? (float) (((dM73391k4 - dM73391k43) / (dM73391k4 - dM73391k42)) * ((double) fM73203ak)) : fM73203ak - ((float) (((dM73391k4 - dM73391k43) / (dM73391k4 - dM73391k42)) * ((double) fM73203ak)))));
            }
            dM3039s72 *= m73026k4().m73384dy().getLogBase();
            dM3039s7 = dM3039s72 * 2.0d;
        }
        return list;
    }

    @Override // com.aspose.slides.ValueAxisBase
    /* JADX INFO: renamed from: wl */
    public void mo3042wl() {
        ((AbstractC14763x3) this).f49904k4.clear();
        m73224wp();
        double d = ((ValueAxisBase) this).f3630c5;
        while (d < ((ValueAxisBase) this).f3634jd) {
            m73025k4(Double.valueOf(m73026k4().m73424x1(d)));
            d += this.f3631ck;
        }
        m73025k4(Double.valueOf(C14116yg.m67477k4(m73026k4().m73424x1(((ValueAxisBase) this).f3634jd), 10)));
        if (C14116yg.m67477k4(d, 4) > C14116yg.m67477k4(((ValueAxisBase) this).f3634jd, 4)) {
            ((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).mo63967x1(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: yj */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double mo63720yj() {
        double dM73391k4;
        if (m73026k4().m73384dy().getCrossAt() == 0.0f) {
            double d = ((ValueAxisBase) this).f3630c5;
            dM73391k4 = (d <= 0.0d || d >= 1.0d) ? m73026k4().m73391k4(m73026k4().m73384dy().getCrossAt()) : m73026k4().m73391k4(1.0d);
        }
        double dM73391k42 = m73026k4().m73391k4(((ValueAxisBase) this).f3634jd);
        double dM73391k43 = m73026k4().m73391k4(((ValueAxisBase) this).f3630c5);
        if (m73026k4().m73384dy().getCrossType() == 1) {
            dM73391k4 = dM73391k42;
        }
        if (dM73391k4 > dM73391k42) {
            dM73391k4 = dM73391k42;
        }
        if (dM73391k4 >= dM73391k43) {
            dM73391k43 = dM73391k4;
        }
        return (m73026k4().m73384dy().getCrossType() == 0 && m63714ar()) ? dM73391k42 : dM73391k43;
    }
}
