package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class knb extends gmx {
    public knb(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        List.Enumerator<C0886d8> it = m6220yj().m64944dy().iterator();
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                uqw uqwVar = new uqw(next);
                ((fml) this).f5072x1.addItem(uqwVar);
                m73215k4((AbstractC14770x9) uqwVar);
                if (!uqwVar.m6926yj().m4983dy() && next.m5003ks() != null && next.m5003ks().m4569up()) {
                    C14610tz c14610tz = new C14610tz(uqwVar);
                    uqwVar.m6925x1((C14177nd) c14610tz);
                    ((fml) this).f5069kk.addItem(c14610tz);
                    m73215k4(c14610tz);
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

    /* JADX INFO: renamed from: to */
    private void m64049to() {
        for (int i = 0; i < ((fml) this).f5071to.size(); i++) {
            AbstractC1164gw abstractC1164gwM71462to = ((C14610tz) ((fml) this).f5069kk.get_Item(i)).m71462to();
            C14177nd c14177nd = ((fml) this).f5069kk.get_Item(i);
            klm klmVar = ((fml) this).f5071to.get_Item(i);
            C12025x6 c12025x6Clone = abstractC1164gwM71462to.mo3520k4(c14177nd).Clone();
            if (!klmVar.m63973k4(c14177nd.m73209e0().Clone(), new C12025x6[]{c12025x6Clone}, (c14177nd.m73227xk() > c12025x6Clone.m56897x1() || c14177nd.m73227xk() + c14177nd.m73225wy() < c12025x6Clone.m56897x1()) ? c14177nd.m67973ne() : c14177nd.m67965ix()) || c14177nd.m73209e0().m56569kk(abstractC1164gwM71462to.m73209e0().Clone()) || (c14177nd.m67962c5() == 0.0f && c14177nd.m67966jd() == 0.0f)) {
                klmVar.m63972k4(false);
            } else {
                klmVar.m63972k4(true);
            }
            klmVar.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            ((fml) this).f5072x1.get_Item(i).m73210fa(c14713vw);
        }
        List.Enumerator<klm> it = ((fml) this).f5069kk.iterator();
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
        it = ((fml) this).f5071to.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
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
                if (i == ((fml) this).f5072x1.size() - 1 && !((fml) this).f5072x1.get_Item(0).m6926yj().m4983dy()) {
                    list.addItem(((fml) this).f5072x1.get_Item(0));
                }
            }
            if (list.size() > 0) {
                if (m6220yj().m64945h4().getType() == 72) {
                    C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), list.size()));
                    for (int i2 = 0; i2 < c12025x6Arr.length; i2++) {
                        c12025x6Arr[i2] = new C12025x6(list.get_Item(i2).m73227xk(), list.get_Item(i2).m73206c6());
                    }
                    C11896dy c11896dy = new C11896dy();
                    c11896dy.m55570to(c12025x6Arr);
                    m6220yj().m64964x1(c11896dy);
                    m6220yj().m64948k4(c11896dy);
                } else {
                    m6768k4(list);
                }
            }
            c14851yl.m73923k4();
        } catch (Throwable th) {
            c14851yl.m73923k4();
            throw th;
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        float f;
        double d;
        float f2 = 2.0f;
        double dM73225wy = m73225wy() / 2.0f;
        double dM73203ak = m73203ak() / 2.0f;
        double dM73225wy2 = m73225wy() / 2.0f;
        double size = 6.283185307179586d / ((double) ((fml) this).f5072x1.size());
        double d2 = 1.5707963267948966d;
        int i = 0;
        while (i < ((fml) this).f5072x1.size()) {
            ValueAxisBase valueAxisBase = (ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45394x1, ValueAxisBase.class);
            if (valueAxisBase.m73026k4().m73384dy().isLogarithmic()) {
                f = f2;
                d = dM73225wy;
                C14116yg.m67476k4(valueAxisBase.m3033gi(), valueAxisBase.m73026k4().m73384dy().getLogBase());
            } else {
                f = f2;
                d = dM73225wy;
                valueAxisBase.m3033gi();
            }
            if (valueAxisBase.m73026k4().m73384dy().isLogarithmic()) {
                C14116yg.m67476k4(valueAxisBase.m3039s7(), valueAxisBase.m73026k4().m73384dy().getLogBase());
            } else {
                valueAxisBase.m3039s7();
            }
            double dM73203ak2 = m6216ks().f45394x1.m73203ak() - m6216ks().f45394x1.mo4964k4(((fml) this).f5072x1.get_Item(i).m6918fa());
            double dM67470dy = (C14116yg.m67470dy(d2) * dM73203ak2) + d;
            double dM67495m9 = dM73203ak - (C14116yg.m67495m9(d2) * dM73203ak2);
            ((fml) this).f5072x1.get_Item(i).m73208du(((float) dM67470dy) - (((fml) this).f5072x1.get_Item(i).m73225wy() / f));
            ((fml) this).f5072x1.get_Item(i).m73212h4(((float) dM67495m9) - (((fml) this).f5072x1.get_Item(i).m73203ak() / f));
            if (((fml) this).f5072x1.get_Item(i).m6919jd() != null) {
                C14177nd c14177ndM6919jd = ((fml) this).f5072x1.get_Item(i).m6919jd();
                double d3 = (0.2d * dM73225wy2) + dM73203ak2;
                double dM67470dy2 = (C14116yg.m67470dy(d2) * d3) + d;
                double dM67495m92 = dM73203ak - (C14116yg.m67495m9(d2) * d3);
                c14177ndM6919jd.m73208du(((float) dM67470dy2) - (c14177ndM6919jd.m73225wy() / f));
                c14177ndM6919jd.m73212h4(((float) dM67495m92) - (c14177ndM6919jd.m73203ak() / f));
                mxy mxyVar = (mxy) c14713vw;
                C12025x6 c12025x6Clone = c14177ndM6919jd.m67976x1(new C12025x6(c14177ndM6919jd.m73205bz(), c14177ndM6919jd.m73219qm()), new C12007ix(-mxyVar.m67814to(), -mxyVar.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak()).Clone()).Clone();
                c14177ndM6919jd.m73208du(c12025x6Clone.m56897x1());
                c14177ndM6919jd.m73212h4(c12025x6Clone.m56895kk());
                ((fml) this).f5072x1.get_Item(i).m6919jd().m73220ss();
            }
            d2 -= size;
            ((fml) this).f5072x1.get_Item(i).m73220ss();
            i++;
            f2 = f;
            dM73225wy = d;
        }
        m64049to();
    }
}
