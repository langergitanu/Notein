package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14074ks;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class h8q extends gmx {

    /* JADX INFO: renamed from: k4 */
    private List<List<AbstractC1164gw>> f5461k4;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x0018, B:5:0x001e, B:8:0x0038, B:10:0x0043, B:17:0x0063, B:19:0x006d, B:20:0x0075, B:21:0x0089, B:23:0x008f, B:25:0x0099, B:27:0x00bb, B:29:0x00cd, B:15:0x0055), top: B:39:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h8q(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        this.f5461k4 = new List<>();
        List.Enumerator<C0886d8> it = m6220yj().m64944dy().iterator();
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                klc klcVar = new klc(next);
                ((fml) this).f5072x1.addItem(klcVar);
                m73215k4((AbstractC14770x9) klcVar);
                if (klcVar.mo3221T_()) {
                    if (next.m4988jd().m599x1() == null || next.m4988jd().getMarker().getSymbol() == 4) {
                        if (c13847mr.m64945h4().getMarker().getSymbol() != 4) {
                            IMarker iMarkerM599x1 = next.m4988jd().m599x1();
                            lyj lyjVar = new lyj(iMarkerM599x1 == null ? c13847mr.m64945h4().getMarker() : iMarkerM599x1, next.m5012up());
                            klcVar.m63964k4(lyjVar);
                            ((fml) this).f5067h4.addItem(lyjVar);
                            m73215k4(lyjVar);
                        }
                        if (next.m5003ks() != null && next.m5003ks().m4569up()) {
                            C14610tz c14610tz = new C14610tz(klcVar);
                            klcVar.m6925x1((C14177nd) c14610tz);
                            ((fml) this).f5069kk.addItem(c14610tz);
                            m73215k4(c14610tz);
                            if (next.m5003ks().m4570x1().getDataLabelFormat().getShowLeaderLines() || c13847mr.m64945h4().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                                klm klmVar = new klm(next);
                                klcVar.m6922k4(klmVar);
                                ((fml) this).f5071to.addItem(klmVar);
                                m73215k4(klmVar);
                            }
                        }
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

    /* JADX INFO: renamed from: c5 */
    private void m7073c5() {
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            lyj lyjVarM63966to = ((klc) ((fml) this).f5072x1.get_Item(i)).m63966to();
            if (lyjVarM63966to != null && lyjVarM63966to.mo3221T_()) {
                lyjVarM63966to.m73208du(((fml) this).f5072x1.get_Item(i).m73227xk() - (lyjVarM63966to.m73225wy() / 2.0f));
                lyjVarM63966to.m73212h4(((fml) this).f5072x1.get_Item(i).m73206c6() - (lyjVarM63966to.m73203ak() / 2.0f));
                lyjVarM63966to.m73220ss();
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m7074dy() {
        for (int i = 0; i < ((fml) this).f5071to.size(); i++) {
            klm klmVar = ((fml) this).f5071to.get_Item(i);
            C14610tz c14610tz = (C14610tz) ((fml) this).f5069kk.get_Item(i);
            C12025x6 c12025x6Clone = ((klc) c14610tz.m71462to()).mo3520k4((C14177nd) c14610tz).Clone();
            klmVar.m63972k4(klmVar.m63973k4(c14610tz.m73209e0().Clone(), new C12025x6[]{c12025x6Clone}, ((c14610tz.m73227xk() > c12025x6Clone.m56897x1() ? 1 : (c14610tz.m73227xk() == c12025x6Clone.m56897x1() ? 0 : -1)) > 0 || ((c14610tz.m73227xk() + c14610tz.m73225wy()) > c12025x6Clone.m56897x1() ? 1 : ((c14610tz.m73227xk() + c14610tz.m73225wy()) == c12025x6Clone.m56897x1() ? 0 : -1)) < 0) ? c14610tz.m67973ne() : c14610tz.m67965ix()) && !(c14610tz.m67962c5() == 0.0f && c14610tz.m67966jd() == 0.0f));
            klmVar.m73220ss();
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m7075m9(C14713vw c14713vw) {
        float fM73225wy;
        float fM56895kk;
        float fM73203ak;
        for (int i = 0; i < ((fml) this).f5069kk.size(); i++) {
            klc klcVar = (klc) ((C14610tz) C7019kk.m27452k4((Object) ((fml) this).f5069kk.get_Item(i), C14610tz.class)).m71462to();
            C14177nd c14177nd = ((fml) this).f5069kk.get_Item(i);
            float fM73203ak2 = 6.0f;
            if (klcVar.m63966to() != null) {
                fM73225wy = (klcVar.m63966to().m73225wy() + 6.0f) / 2.0f;
                fM73203ak2 = (klcVar.m63966to().m73203ak() + 6.0f) / 2.0f;
            } else {
                fM73225wy = 6.0f;
            }
            C12025x6 c12025x6 = new C12025x6(klcVar.m73205bz(), klcVar.m73219qm());
            int iMo4194dy = c14177nd.mo4194dy();
            if (iMo4194dy != 0) {
                if (iMo4194dy == 2) {
                    c12025x6.m56891k4(c12025x6.m56897x1() - (c14177nd.m73225wy() / 2.0f));
                } else if (iMo4194dy == 5) {
                    c12025x6.m56891k4(c12025x6.m56897x1() - (c14177nd.m73225wy() + fM73225wy));
                } else if (iMo4194dy == 7) {
                    c12025x6.m56891k4(c12025x6.m56897x1() + fM73225wy);
                    fM56895kk = c12025x6.m56895kk();
                    fM73203ak = c14177nd.m73203ak();
                    C22207OooOOoo.OooO0O0(c12025x6, fM73203ak, 2.0f, fM56895kk);
                } else if (iMo4194dy == 8) {
                    c12025x6.m56891k4(c12025x6.m56897x1() - (c14177nd.m73225wy() / 2.0f));
                    c12025x6.m56898x1(c12025x6.m56895kk() - (c14177nd.m73203ak() + fM73203ak2));
                }
                fM56895kk = c12025x6.m56895kk();
                fM73203ak = c14177nd.m73203ak();
                C22207OooOOoo.OooO0O0(c12025x6, fM73203ak, 2.0f, fM56895kk);
            } else {
                c12025x6.m56891k4(c12025x6.m56897x1() - (c14177nd.m73225wy() / 2.0f));
                c12025x6.m56898x1(c12025x6.m56895kk() + fM73203ak2);
            }
            mxy mxyVar = (mxy) c14713vw;
            C12025x6 c12025x6Clone = c14177nd.m67976x1(c12025x6.Clone(), new C12007ix(-mxyVar.m67814to(), -mxyVar.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak()).Clone()).Clone();
            c14177nd.m73208du(c12025x6Clone.m56897x1());
            c14177nd.m73212h4(c12025x6Clone.m56895kk());
            c14177nd.m73220ss();
            c14177nd.m67969k4(new C12025x6(klcVar.m73205bz() - c14177nd.m73205bz(), klcVar.m73219qm() - c14177nd.m73219qm()));
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m7076rv() {
        List<AbstractC1164gw> list = new List<>();
        this.f5461k4.addItem(list);
        List.Enumerator<AbstractC1164gw> it = ((fml) this).f5072x1.iterator();
        while (it.hasNext()) {
            try {
                AbstractC1164gw next = it.next();
                if (!next.mo3221T_()) {
                    if (m6220yj().m64941c5().m69834fa().getDisplayBlanksAs() == 0) {
                        if (!ChartTypeCharacterizer.m758dy(m6220yj().m64945h4().getType()) && !ChartTypeCharacterizer.m761jd(m6220yj().m64945h4().getType()) && (!next.m6926yj().m4979c5() || m73218lr().m7149to().m69834fa().mo268du().m5189yj())) {
                            list = new List<>();
                            this.f5461k4.addItem(list);
                        }
                    } else if (m6220yj().m64941c5().m69834fa().getDisplayBlanksAs() == 1) {
                    }
                }
                list.addItem(next);
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
        int i = 0;
        while (i < this.f5461k4.size()) {
            if (this.f5461k4.get_Item(i).size() == 0) {
                this.f5461k4.removeAt(i);
                i--;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: to */
    private void m7077to() {
        boolean zM73375b3 = m6216ks().f45392kk.m73026k4().m73375b3();
        ValueAxisBase valueAxisBase = (ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45394x1, ValueAxisBase.class);
        if (m6216ks().f45392kk.m73026k4().m73384dy().getCategoryAxisType() == 1) {
            ((fml) this).f5072x1.sort(new AbstractC14074ks<AbstractC1164gw>() { // from class: com.aspose.slides.h8q.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
                /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public int mo1193k4(AbstractC1164gw abstractC1164gw, AbstractC1164gw abstractC1164gw2) {
                    return C14044b3.m66430k4(abstractC1164gw.m6926yj().m5015x1(), abstractC1164gw2.m6926yj().m5015x1());
                }
            });
        }
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            if ((valueAxisBase.m73026k4().m73384dy().isLogarithmic() && C14044b3.m66437kk(((fml) this).f5072x1.get_Item(i).m6918fa())) || (m6216ks().f45392kk.m73026k4().m73384dy().getCategoryAxisType() == 1 && C14044b3.m66437kk(((fml) this).f5072x1.get_Item(i).m6926yj().m5015x1()))) {
                ((fml) this).f5072x1.get_Item(i).mo63967x1(false);
            } else {
                double dM6769m9 = m6769m9() * i;
                if (!C14044b3.m66437kk(((fml) this).f5072x1.get_Item(i).m6926yj().m5015x1())) {
                    dM6769m9 = m6216ks().f45392kk.mo4964k4(((fml) this).f5072x1.get_Item(i).m6926yj().m5015x1());
                }
                if (zM73375b3 || m6220yj().m64941c5().m69834fa().hasDataTable()) {
                    dM6769m9 += (double) (m6769m9() / 2.0f);
                }
                if (m6216ks().f45392kk.m73026k4().m73384dy().isPlotOrderReversed()) {
                    dM6769m9 = ((double) m6216ks().f45392kk.m73225wy()) - dM6769m9;
                }
                double dMo4964k4 = m6216ks().f45394x1.mo4964k4(((fml) this).f5072x1.get_Item(i).m6918fa());
                ((fml) this).f5072x1.get_Item(i).m73208du((float) dM6769m9);
                ((fml) this).f5072x1.get_Item(i).m73212h4((float) dMo4964k4);
            }
        }
    }

    @Override // com.aspose.slides.fml, com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 4;
    }

    /* JADX INFO: renamed from: du */
    public final void m7078du(C14713vw c14713vw) {
        List.Enumerator<zsm> it = ((fml) this).f5065du.iterator();
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
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        List.Enumerator<klm> it = ((fml) this).f5072x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(new C14713vw(0.0f, 0.0f));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<C14177nd> it2 = ((fml) this).f5069kk.iterator();
        while (it2.hasNext()) {
            try {
                C14177nd next = it2.next();
                next.m73210fa(next.m67979yj());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
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
        m6211h4(c14713vw);
        m7078du(c14713vw);
        m7079kk(c14713vw);
    }

    /* JADX INFO: renamed from: kk */
    public final void m7079kk(C14713vw c14713vw) {
        List.Enumerator<lyj> it = ((fml) this).f5067h4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(new C14713vw(100.0f, 100.0f));
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
            m7076rv();
            List.Enumerator<List<AbstractC1164gw>> it = this.f5461k4.iterator();
            while (it.hasNext()) {
                try {
                    m6768k4(it.next());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        } finally {
            c14851yl.m73923k4();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        m7077to();
        m6210fa();
        m7073c5();
        m6209ck();
        m7075m9(c14713vw);
        m7074dy();
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }
}
