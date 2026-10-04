package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14074ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ca */
/* JADX INFO: loaded from: classes3.dex */
class C0847ca extends fml {

    /* JADX INFO: renamed from: k4 */
    private List<AbstractC1164gw> f4297k4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0847ca(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        this.f4297k4 = new List<>();
        boolean zM4525k4 = m4525k4(m6220yj());
        for (int i = 0; i < m6220yj().m64944dy().size(); i++) {
            C0886d8 c0886d8 = m6220yj().m64944dy().get_Item(i);
            C14396ri c14396ri = new C14396ri(c0886d8);
            ((fml) this).f5072x1.addItem(c14396ri);
            m73215k4(c14396ri);
            if ((!zM4525k4 || i <= 0) && c0886d8.m5003ks() != null && c0886d8.m5003ks().m4569up()) {
                C14610tz c14610tz = new C14610tz(c14396ri);
                c14396ri.m6925x1((C14177nd) c14610tz);
                ((fml) this).f5069kk.addItem(c14610tz);
                m73215k4(c14610tz);
                if (c0886d8.m5003ks().m4570x1().getDataLabelFormat().getShowLeaderLines() || c13847mr.m64945h4().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                    klm klmVar = new klm(c0886d8);
                    c14396ri.m6922k4(klmVar);
                    ((fml) this).f5071to.addItem(klmVar);
                    m73215k4(klmVar);
                }
            }
        }
        List.Enumerator<C0886d8> it = m6220yj().m64944dy().iterator();
        while (it.hasNext()) {
            try {
                C14396ri c14396ri2 = new C14396ri(it.next());
                this.f4297k4.addItem(c14396ri2);
                m73215k4(c14396ri2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<C12025x6> m4522k4(List<C12025x6> list, C12025x6 c12025x6, C12025x6 c12025x62) {
        List<C12025x6> list2 = new List<>();
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            int size = i2 % list.size();
            C12025x6 c12025x6Clone = list.get_Item(i).Clone();
            C12025x6 c12025x6Clone2 = list.get_Item(size).Clone();
            boolean zM4524k4 = m4524k4(c12025x6.Clone(), c12025x62.Clone(), c12025x6Clone.Clone());
            boolean zM4524k42 = m4524k4(c12025x6.Clone(), c12025x62.Clone(), c12025x6Clone2.Clone());
            if (!zM4524k4 || !zM4524k42) {
                if (zM4524k4 || zM4524k42) {
                    list2.addItem(m4523k4(c12025x6.Clone(), c12025x62.Clone(), c12025x6Clone.Clone(), c12025x6Clone2.Clone()).Clone().Clone());
                    if (zM4524k42) {
                        list2.addItem(c12025x6Clone2.Clone());
                    }
                }
            }
            i = i2;
        }
        return list2;
    }

    /* JADX INFO: renamed from: kk */
    private void m4527kk(C14713vw c14713vw) {
        C12025x6 c12025x6;
        float fM73205bz;
        float fM73219qm;
        for (int i = 0; i < ((fml) this).f5069kk.size(); i++) {
            C14396ri c14396ri = (C14396ri) ((C14610tz) C7019kk.m27452k4((Object) ((fml) this).f5069kk.get_Item(i), C14610tz.class)).m71462to();
            C14177nd c14177nd = ((fml) this).f5069kk.get_Item(i);
            new C12025x6();
            if (!m4525k4(m6220yj())) {
                c12025x6 = (ChartTypeCharacterizer.m758dy(m6220yj().m64945h4().getType()) || ChartTypeCharacterizer.m761jd(m6220yj().m64945h4().getType())) ? new C12025x6(c14396ri.m73205bz(), (this.f4297k4.get_Item((((fml) this).f5072x1.size() - 1) - i).m73219qm() + c14396ri.m73219qm()) / 2.0f) : new C12025x6(c14396ri.m73205bz(), (m6216ks().f45394x1.mo63718up() + c14396ri.m73219qm()) / 2.0f);
            } else if (m6220yj().m64944dy().size() % 2 > 0) {
                List<AbstractC1164gw> list = ((fml) this).f5072x1;
                double dM6918fa = list.get_Item(list.size() / 2).m6918fa();
                c12025x6 = new C12025x6(c14713vw.m72555k4() / 2.0f, m6216ks().f45394x1.mo4964k4(OooOO0.OooO00o(dM6918fa, this.f4297k4.get_Item(((fml) this).f5072x1.size() / 2).m6918fa(), 2.0d, dM6918fa / 2.0d)));
            } else {
                double dM6918fa2 = ((fml) this).f5072x1.get_Item((r4.size() / 2) - 1).m6918fa();
                double dM6918fa3 = this.f4297k4.get_Item((((fml) this).f5072x1.size() / 2) - 1).m6918fa();
                List<AbstractC1164gw> list2 = ((fml) this).f5072x1;
                double dM6918fa4 = list2.get_Item(list2.size() / 2).m6918fa();
                c12025x6 = new C12025x6(c14713vw.m72555k4() / 2.0f, m6216ks().f45394x1.mo4964k4(((((dM6918fa2 - dM6918fa3) + dM6918fa4) - this.f4297k4.get_Item(((fml) this).f5072x1.size() / 2).m6918fa()) / 4.0d) + ((dM6918fa2 + dM6918fa4) / 4.0d)));
            }
            c12025x6.m56891k4(c12025x6.m56897x1() - (c14177nd.m73225wy() / 2.0f));
            C22207OooOOoo.OooO0O0(c12025x6, c14177nd.m73203ak(), 2.0f, c12025x6.m56895kk());
            mxy mxyVar = (mxy) c14713vw;
            C12025x6 c12025x6Clone = c14177nd.m67976x1(c12025x6.Clone(), new C12007ix(-mxyVar.m67814to(), -mxyVar.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak()).Clone()).Clone();
            if (((fml) this).f5071to.size() > 0) {
                ((fml) this).f5071to.get_Item(i).m63972k4(C12025x6.m56888x1(c12025x6Clone, c12025x6));
            }
            c14177nd.m73208du(c12025x6Clone.m56897x1());
            c14177nd.m73212h4(c12025x6Clone.m56895kk());
            c14177nd.m73220ss();
            if (m6220yj().m64945h4().getType() == 48 || m6220yj().m64945h4().getType() == 49) {
                C12025x6 c12025x62 = new C12025x6(c14396ri.m73205bz(), (this.f4297k4.get_Item((((fml) this).f5072x1.size() - 1) - i).m73219qm() + c14396ri.m73219qm()) / 2.0f);
                float fM56897x1 = c12025x62.m56897x1() - c14177nd.m73205bz();
                float fM56895kk = c12025x62.m56895kk() - c14177nd.m73219qm();
                fM73205bz = fM56897x1;
                fM73219qm = fM56895kk;
            } else {
                fM73205bz = c14396ri.m73205bz() - c14177nd.m73205bz();
                fM73219qm = c14396ri.m73219qm() - c14177nd.m73219qm();
            }
            c14177nd.m67969k4(new C12025x6(fM73205bz, fM73219qm));
        }
    }

    /* JADX INFO: renamed from: m9 */
    private C12025x6[] m4528m9() {
        List list = new List();
        List.Enumerator<AbstractC1164gw> it = ((fml) this).f5072x1.iterator();
        while (it.hasNext()) {
            try {
                C12025x6 c12025x6Clone = it.next().m73223ts().Clone();
                if (c12025x6Clone.m56895kk() < -1000000.0f) {
                    c12025x6Clone.m56898x1(-1000000.0f);
                }
                if (c12025x6Clone.m56895kk() > 1000000.0f) {
                    c12025x6Clone.m56898x1(1000000.0f);
                }
                list.addItem(c12025x6Clone.Clone());
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f4297k4.iterator();
        while (it.hasNext()) {
            try {
                C12025x6 c12025x6Clone2 = it.next().m73223ts().Clone();
                if (c12025x6Clone2.m56895kk() < -1000000.0f) {
                    c12025x6Clone2.m56898x1(-1000000.0f);
                }
                if (c12025x6Clone2.m56895kk() > 1000000.0f) {
                    c12025x6Clone2.m56898x1(1000000.0f);
                }
                list.addItem(c12025x6Clone2.Clone());
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return (C12025x6[]) list.toArray(new C12025x6[0]);
    }

    /* JADX INFO: renamed from: to */
    private void m4529to() {
        for (int i = 0; i < ((fml) this).f5071to.size(); i++) {
            klm klmVar = ((fml) this).f5071to.get_Item(i);
            C14610tz c14610tz = (C14610tz) ((fml) this).f5069kk.get_Item(i);
            C14396ri c14396ri = (C14396ri) c14610tz.m71462to();
            C12025x6 c12025x6 = new C12025x6();
            boolean z = true;
            if (ChartTypeCharacterizer.m758dy(m6220yj().m64945h4().getType()) || ChartTypeCharacterizer.m761jd(m6220yj().m64945h4().getType())) {
                c12025x6 = new C12025x6(c14396ri.m73205bz(), (this.f4297k4.get_Item((((fml) this).f5072x1.size() - 1) - i).m73219qm() + c14396ri.m73219qm()) / 2.0f);
            } else {
                c14396ri.mo3520k4((C14177nd) c14610tz).CloneTo(c12025x6);
            }
            if (!klmVar.m63973k4(c14610tz.m73209e0().Clone(), new C12025x6[]{c12025x6}, (c14610tz.m73227xk() > c12025x6.m56897x1() || c14610tz.m73227xk() + c14610tz.m73225wy() < c12025x6.m56897x1()) ? c14610tz.m67973ne() : c14610tz.m67965ix()) || c14610tz.m73209e0().m56569kk(c14396ri.m73209e0().Clone()) || !klmVar.mo3221T_()) {
                z = false;
            }
            klmVar.m63972k4(z);
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C12025x6[] c12025x6ArrM4526k4 = m4526k4(m4528m9(), m73228yd().m73218lr().m73209e0().Clone());
        C14851yl c14851yl = new C14851yl(m6220yj().m64941c5());
        c14851yl.m73924k4(new C12007ix(m73228yd().m73227xk(), m73228yd().m73206c6(), m73228yd().m73225wy(), m73228yd().m73203ak()).Clone());
        try {
            C11896dy c11896dy = new C11896dy();
            if (c12025x6ArrM4526k4.length > 3) {
                c11896dy.m55570to(c12025x6ArrM4526k4);
            } else if (c12025x6ArrM4526k4.length == 2) {
                c11896dy.m55547k4(c12025x6ArrM4526k4[0].Clone(), c12025x6ArrM4526k4[1].Clone());
            }
            if (!m6220yj().m64959kk(c11896dy)) {
                m6220yj().m64964x1(c11896dy);
                m6220yj().m64948k4(c11896dy);
            }
            c14851yl.m73923k4();
        } catch (Throwable th) {
            c14851yl.m73923k4();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m4523k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64) {
        float fM56897x1 = c12025x62.m56897x1() - c12025x6.m56897x1();
        float fM56895kk = c12025x62.m56895kk() - c12025x6.m56895kk();
        float fM56897x12 = c12025x64.m56897x1() - c12025x63.m56897x1();
        float fM56895kk2 = c12025x64.m56895kk() - c12025x63.m56895kk();
        float f = (fM56897x1 * fM56895kk2) - (fM56895kk * fM56897x12);
        if (f == 0.0f) {
            return c12025x63;
        }
        float fM56897x13 = (((c12025x63.m56897x1() - c12025x6.m56897x1()) * fM56895kk) - ((c12025x63.m56895kk() - c12025x6.m56895kk()) * fM56897x1)) / f;
        return new C12025x6((fM56897x12 * fM56897x13) + c12025x63.m56897x1(), (fM56897x13 * fM56895kk2) + c12025x63.m56895kk());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        m4530k4();
        m4527kk(c14713vw);
        m4529to();
        m6210fa();
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021e  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4530k4() {
        AbstractC1164gw abstractC1164gw;
        float fMo63718up;
        boolean zM73375b3 = m6216ks().f45392kk.m73026k4().m73375b3();
        float fM73225wy = m6216ks().f45392kk.m73225wy();
        int size = m6216ks().f45392kk.f49904k4.size();
        if (!zM73375b3) {
            size--;
        }
        double d = fM73225wy / size;
        ValueAxisBase valueAxisBase = (ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45394x1, ValueAxisBase.class);
        if (m6216ks().f45392kk.m73026k4().m73384dy().getCategoryAxisType() == 1) {
            ((fml) this).f5072x1.sort(new AbstractC14074ks<AbstractC1164gw>() { // from class: com.aspose.slides.ca.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
                /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public int mo1193k4(AbstractC1164gw abstractC1164gw2, AbstractC1164gw abstractC1164gw3) {
                    return C14044b3.m66430k4(abstractC1164gw2.m6926yj().m5015x1(), abstractC1164gw3.m6926yj().m5015x1());
                }
            });
        }
        if (m6216ks().f45392kk.m73026k4().m73384dy().getCategoryAxisType() == 1) {
            this.f4297k4.sort(new AbstractC14074ks<AbstractC1164gw>() { // from class: com.aspose.slides.ca.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
                /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public int mo1193k4(AbstractC1164gw abstractC1164gw2, AbstractC1164gw abstractC1164gw3) {
                    return C14044b3.m66430k4(abstractC1164gw2.m6926yj().m5015x1(), abstractC1164gw3.m6926yj().m5015x1());
                }
            });
        }
        int iIndexOf = m6216ks().f45391k4.indexOf(this);
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            if (valueAxisBase.m73026k4().m73384dy().isLogarithmic() && C14044b3.m66437kk(((fml) this).f5072x1.get_Item(i).m6918fa())) {
                ((fml) this).f5072x1.get_Item(i).m6920k4(0.0d);
            }
            ((fml) this).f5072x1.get_Item(i).m73208du(((float) d) * i);
            if (zM73375b3 || m6220yj().m64941c5().m69834fa().hasDataTable()) {
                ((fml) this).f5072x1.get_Item(i).m73208du(((fml) this).f5072x1.get_Item(i).m73205bz() + ((float) (d / 2.0d)));
            }
            if (m6216ks().f45392kk.m73026k4().m73384dy().isPlotOrderReversed()) {
                ((fml) this).f5072x1.get_Item(i).m73208du(m6216ks().f45392kk.m73225wy() - ((fml) this).f5072x1.get_Item(i).m73205bz());
            }
            if (!C7019kk.m27469x1(m6216ks().f45392kk, AbstractC14464sp.class)) {
                ((fml) this).f5072x1.get_Item(i).m73212h4(m6216ks().f45394x1.mo4964k4(((fml) this).f5072x1.get_Item(i).m6918fa()));
                this.f4297k4.get_Item((((fml) this).f5072x1.size() - 1) - i).m73208du(((fml) this).f5072x1.get_Item(i).m73205bz());
                if (iIndexOf <= 0) {
                    int i2 = iIndexOf - 1;
                    if (i >= m6216ks().f45391k4.get_Item(i2).f5072x1.size() || !(ChartTypeCharacterizer.m758dy(m6220yj().m64945h4().getType()) || ChartTypeCharacterizer.m761jd(m6220yj().m64945h4().getType()))) {
                        abstractC1164gw = this.f4297k4.get_Item((((fml) this).f5072x1.size() - 1) - i);
                        fMo63718up = m6216ks().f45394x1.mo63718up();
                    } else {
                        abstractC1164gw = this.f4297k4.get_Item((((fml) this).f5072x1.size() - 1) - i);
                        fMo63718up = m6216ks().f45391k4.get_Item(i2).f5072x1.get_Item(i).m73219qm();
                    }
                    abstractC1164gw.m73212h4(fMo63718up);
                }
            } else if (!C14044b3.m66437kk(((fml) this).f5072x1.get_Item(i).m6926yj().m5015x1())) {
                ((fml) this).f5072x1.get_Item(i).m73208du(m6216ks().f45392kk.mo4964k4(((fml) this).f5072x1.get_Item(i).m6926yj().m5015x1()));
                ((fml) this).f5072x1.get_Item(i).m73212h4(m6216ks().f45394x1.mo4964k4(((fml) this).f5072x1.get_Item(i).m6918fa()));
                this.f4297k4.get_Item((((fml) this).f5072x1.size() - 1) - i).m73208du(((fml) this).f5072x1.get_Item(i).m73205bz());
                if (iIndexOf <= 0) {
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
        List.Enumerator<AbstractC1164gw> it2 = this.f4297k4.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().m73210fa(new C14713vw(0.0f, 0.0f));
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        List.Enumerator<C14177nd> it3 = ((fml) this).f5069kk.iterator();
        while (it3.hasNext()) {
            try {
                C14177nd next = it3.next();
                next.m73210fa(next.m67979yj());
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
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
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m4524k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63) {
        return ((c12025x63.m56895kk() - c12025x6.m56895kk()) * (c12025x62.m56897x1() - c12025x6.m56897x1())) - ((c12025x63.m56897x1() - c12025x6.m56897x1()) * (c12025x62.m56895kk() - c12025x6.m56895kk())) >= 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m4525k4(C13847mr c13847mr) {
        if (!c13847mr.m64945h4().getLabels().getDefaultDataLabelFormat().getShowSeriesName() || c13847mr.m64945h4().getLabels().getDefaultDataLabelFormat().getShowCategoryName() || c13847mr.m64945h4().getLabels().getDefaultDataLabelFormat().getShowLabelValueFromCell() || c13847mr.m64945h4().getLabels().getDefaultDataLabelFormat().getShowValue()) {
            return false;
        }
        if (m6220yj().m64944dy().size() > 1) {
            for (int i = 1; i < m6220yj().m64944dy().size(); i++) {
                DataLabel dataLabelM4570x1 = m6220yj().m64944dy().get_Item(i).m5003ks().m4570x1();
                if (!m6220yj().m64944dy().get_Item(i).m5003ks().m4569up() || !dataLabelM4570x1.getDataLabelFormat().getShowSeriesName() || dataLabelM4570x1.getDataLabelFormat().getShowCategoryName() || dataLabelM4570x1.getDataLabelFormat().getShowLabelValueFromCell() || dataLabelM4570x1.getDataLabelFormat().getShowValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6[] m4526k4(C12025x6[] c12025x6Arr, C12007ix c12007ix) {
        List<C12025x6> list = new List<>(AbstractC14092to.m67204k4((Object[]) c12025x6Arr));
        if (list.size() > 2) {
            C12025x6[] c12025x6Arr2 = {new C12025x6(c12007ix.m56571to(), c12007ix.m56554dy()), new C12025x6(c12007ix.m56556h4(), c12007ix.m56554dy()), new C12025x6(c12007ix.m56556h4(), c12007ix.m56558k4()), new C12025x6(c12007ix.m56571to(), c12007ix.m56558k4())};
            int i = 0;
            while (i < 4) {
                int i2 = i + 1;
                list = m4522k4(list, c12025x6Arr2[i].Clone(), c12025x6Arr2[i2 % 4].Clone());
                i = i2;
            }
        }
        return list.toArray(new C12025x6[0]);
    }
}
