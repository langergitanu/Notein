package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.h9 */
/* JADX INFO: loaded from: classes3.dex */
class C1191h9 extends fml {

    /* JADX INFO: renamed from: c5 */
    private List<C0949eg> f5463c5;

    /* JADX INFO: renamed from: ck */
    private List<v1u> f5464ck;

    /* JADX INFO: renamed from: fa */
    private List<lyj> f5465fa;

    /* JADX INFO: renamed from: ix */
    private C0966ev[] f5466ix;

    /* JADX INFO: renamed from: jd */
    private List<v1u> f5467jd;

    /* JADX INFO: renamed from: k4 */
    private float f5468k4;

    /* JADX INFO: renamed from: ks */
    private oul f5469ks;

    /* JADX INFO: renamed from: ne */
    private C0966ev[] f5470ne;

    /* JADX INFO: renamed from: rv */
    private C0966ev[] f5471rv;

    /* JADX INFO: renamed from: u4 */
    private C0966ev[] f5472u4;

    /* JADX INFO: renamed from: up */
    private List<C13824m8[]> f5473up;

    /* JADX INFO: renamed from: uz */
    private C0966ev[] f5474uz;

    /* JADX INFO: renamed from: x6 */
    private C0966ev[] f5475x6;

    /* JADX INFO: renamed from: yj */
    private List<C13824m8[]> f5476yj;

    public C1191h9(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        this.f5468k4 = -0.08f;
        this.f5463c5 = new List<>();
        this.f5467jd = new List<>();
        this.f5464ck = new List<>();
        this.f5465fa = new List<>();
        this.f5473up = new List<>();
        this.f5476yj = new List<>();
        int iM72973k4 = c13847mr.m64945h4().m719c5().m72973k4();
        if (c13847mr.m64945h4().getLabels().isVisible()) {
            this.f5471rv = new C0966ev[iM72973k4];
            this.f5475x6 = new C0966ev[iM72973k4];
            this.f5470ne = new C0966ev[iM72973k4];
            this.f5466ix = new C0966ev[iM72973k4];
            this.f5474uz = new C0966ev[iM72973k4];
            this.f5472u4 = new C0966ev[iM72973k4];
        }
        for (int i = 0; i < c13847mr.m64945h4().m719c5().m72973k4(); i++) {
            C0791b3 c0791b3M72975k4 = m6220yj().m64945h4().m719c5().m72975k4(i);
            C0949eg c0949eg = new C0949eg(c13847mr);
            this.f5463c5.addItem(c0949eg);
            m73215k4(c0949eg);
            v1u v1uVar = new v1u(true, c13847mr);
            this.f5467jd.addItem(v1uVar);
            m73215k4(v1uVar);
            v1u v1uVar2 = new v1u(false, c13847mr);
            this.f5464ck.addItem(v1uVar2);
            m73215k4(v1uVar2);
            C14365qy c14365qyM64941c5 = c13847mr.m64941c5();
            if (c13847mr.m64945h4().getShowMeanMarkers()) {
                m7081k4(c13847mr);
                if (c13847mr.m64945h4().getLabels().isVisible()) {
                    this.f5474uz[i] = new C0966ev(c0791b3M72975k4, new C0852cf((DataLabel) c0791b3M72975k4.m3954k4(), c14365qyM64941c5), 4);
                    m73215k4(this.f5474uz[i]);
                }
            }
            if (c13847mr.m64945h4().getLabels().isVisible()) {
                this.f5471rv[i] = new C0966ev(c0791b3M72975k4, new C0852cf((DataLabel) c0791b3M72975k4.m3951h4(), c14365qyM64941c5), 0);
                m73215k4(this.f5471rv[i]);
                this.f5475x6[i] = new C0966ev(c0791b3M72975k4, new C0852cf((DataLabel) c0791b3M72975k4.m3948du(), c14365qyM64941c5), 1);
                m73215k4(this.f5475x6[i]);
                this.f5470ne[i] = new C0966ev(c0791b3M72975k4, new C0852cf((DataLabel) c0791b3M72975k4.m3965to(), c14365qyM64941c5), 2);
                m73215k4(this.f5470ne[i]);
                this.f5466ix[i] = new C0966ev(c0791b3M72975k4, new C0852cf((DataLabel) c0791b3M72975k4.m3959kk(), c14365qyM64941c5), 3);
                m73215k4(this.f5466ix[i]);
                this.f5472u4[i] = new C0966ev(c0791b3M72975k4, new C0852cf((DataLabel) c0791b3M72975k4.m3970x1(), c14365qyM64941c5), 5);
                m73215k4(this.f5472u4[i]);
            }
            this.f5473up.addItem(new C13824m8[c0791b3M72975k4.m3968uz().size()]);
            this.f5476yj.addItem(new C13824m8[c0791b3M72975k4.m3969wl().size()]);
            for (int i2 = 0; i2 < c0791b3M72975k4.m3968uz().size(); i2++) {
                AbstractC14770x9 c13824m8 = new C13824m8(c13847mr, c0791b3M72975k4.m3968uz().get_Item(i2));
                this.f5473up.get_Item(i)[i2] = c13824m8;
                m73215k4(c13824m8);
            }
            for (int i3 = 0; i3 < c0791b3M72975k4.m3969wl().size(); i3++) {
                AbstractC14770x9 c13824m82 = new C13824m8(c13847mr, c0791b3M72975k4.m3969wl().get_Item(i3));
                this.f5476yj.get_Item(i)[i3] = c13824m82;
                m73215k4(c13824m82);
            }
        }
        if (c13847mr.m64945h4().getShowMeanLine()) {
            oul oulVar = new oul(c13847mr.m64945h4().m719c5().m72973k4(), c13847mr);
            this.f5469ks = oulVar;
            m73215k4(oulVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m7080k4(C0949eg c0949eg, C0966ev c0966ev, double d) {
        float fM73203ak;
        float fM73225wy = (c0949eg.m73225wy() / 2.0f) + c0949eg.m73205bz();
        float fMo4964k4 = m6216ks().f45394x1.mo4964k4(d);
        int position = m6220yj().m64945h4().getLabels().getDefaultDataLabelFormat().getPosition();
        if (position != 0) {
            if (position != 5) {
                if (position == 8) {
                    c0966ev.m73208du(fM73225wy - (c0966ev.m73225wy() / 2.0f));
                    fM73203ak = c0966ev.m73203ak();
                }
                fMo4964k4 -= fM73203ak;
            } else {
                fM73225wy -= c0966ev.m73225wy();
            }
            c0966ev.m73208du(fM73225wy);
            fM73203ak = c0966ev.m73203ak() / 2.0f;
            fMo4964k4 -= fM73203ak;
        } else {
            c0966ev.m73208du(fM73225wy - (c0966ev.m73225wy() / 2.0f));
        }
        c0966ev.m73212h4(fMo4964k4);
    }

    /* JADX INFO: renamed from: x1 */
    private void m7083x1(C0949eg c0949eg, C0966ev c0966ev, double d) {
        float fM73203ak;
        float fMo4964k4 = m6216ks().f45394x1.mo4964k4(d);
        int position = m6220yj().m64945h4().getLabels().getDefaultDataLabelFormat().getPosition();
        if (position != 0) {
            if (position == 5) {
                c0966ev.m73208du(c0949eg.m73205bz() - c0966ev.m73225wy());
            } else if (position != 8) {
                c0966ev.m73208du(c0949eg.m73205bz() + c0949eg.m73225wy());
            } else {
                c0966ev.m73208du(((c0949eg.m73225wy() / 2.0f) + c0949eg.m73205bz()) - (c0966ev.m73225wy() / 2.0f));
                fM73203ak = c0966ev.m73203ak();
                fMo4964k4 -= fM73203ak;
            }
            fM73203ak = c0966ev.m73203ak() / 2.0f;
            fMo4964k4 -= fM73203ak;
        } else {
            c0966ev.m73208du(((c0949eg.m73225wy() / 2.0f) + c0949eg.m73205bz()) - (c0966ev.m73225wy() / 2.0f));
        }
        c0966ev.m73212h4(fMo4964k4);
    }

    /* JADX INFO: renamed from: to */
    public final float m7084to() {
        return (m6220yj().m64945h4().getGapWidth() / 100.0f) * 1.5f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m7081k4(C13847mr c13847mr) {
        Marker marker = new Marker(null, c13847mr.m64945h4());
        marker.setSymbol(10);
        marker.f2675k4 = 6;
        C12003du c12003duClone = igr.m7634x1(c13847mr.m64945h4().m734m9().Clone(), 0.25d).Clone();
        C12003du.m56400k4(255, c12003duClone.Clone()).CloneTo(c12003duClone);
        marker.getFormat().getLine().getFillFormat().setFillType((byte) 1);
        ((ColorFormat) marker.getFormat().getLine().getFillFormat().getSolidFillColor()).m1080k4(c12003duClone.Clone());
        lyj lyjVar = new lyj(marker, c13847mr);
        this.f5465fa.addItem(lyjVar);
        m73215k4(lyjVar);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        C14757wy c14757wyM719c5 = m6220yj().m64945h4().m719c5();
        for (int i = 0; i < c14757wyM719c5.m72973k4(); i++) {
            C0791b3 c0791b3M72975k4 = c14757wyM719c5.m72975k4(i);
            C0949eg c0949eg = this.f5463c5.get_Item(i);
            c0949eg.m73212h4(m6216ks().f45394x1.mo4964k4(c0791b3M72975k4.m3962ne()));
            c0949eg.m73208du(((c0949eg.m73225wy() * m7084to()) / 2.0f) + (((C13785ll) C7019kk.m27452k4((Object) m6216ks().f45392kk, C13785ll.class)).m64459kp() * i) + ((c0949eg.m73225wy() - (c0949eg.m73225wy() * this.f5468k4)) * m6216ks().f45391k4.indexOf(this)));
            c0949eg.m5521k4(m6216ks().f45394x1.mo4964k4(c0791b3M72975k4.m3964rv()) - c0949eg.m73219qm());
            float fM73225wy = ((c0949eg.m73225wy() / 2.0f) + c0949eg.m73205bz()) - (this.f5467jd.get_Item(i).m73225wy() / 2.0f);
            this.f5467jd.get_Item(i).m73208du(fM73225wy);
            this.f5464ck.get_Item(i).m73208du(fM73225wy);
            this.f5467jd.get_Item(i).m73212h4(m6216ks().f45394x1.mo4964k4(c0791b3M72975k4.m3966u4()));
            this.f5464ck.get_Item(i).m73212h4(m6216ks().f45394x1.mo4964k4(c0791b3M72975k4.m3971x6()));
            if (this.f5465fa.size() > 0) {
                this.f5465fa.get_Item(i).m73208du(((c0949eg.m73225wy() / 2.0f) + c0949eg.m73205bz()) - (this.f5465fa.get_Item(i).m73225wy() / 2.0f));
                this.f5465fa.get_Item(i).m73212h4(m6216ks().f45394x1.mo4964k4(c0791b3M72975k4.m3960ks()) - (this.f5465fa.get_Item(i).m73203ak() / 2.0f));
            }
            oul oulVar = this.f5469ks;
            if (oulVar != null) {
                oulVar.m68864to()[i].m73208du((c0949eg.m73225wy() / 2.0f) + c0949eg.m73205bz());
                this.f5469ks.m68864to()[i].m73212h4(m6216ks().f45394x1.mo4964k4(c0791b3M72975k4.m3960ks()));
            }
            if (m6220yj().m64945h4().getLabels().isVisible()) {
                m7082k4(this.f5467jd.get_Item(i), this.f5471rv[i], c0791b3M72975k4.m3966u4());
                m7082k4(this.f5464ck.get_Item(i), this.f5475x6[i], c0791b3M72975k4.m3952ix());
                m7083x1(c0949eg, this.f5470ne[i], c0791b3M72975k4.m3962ne());
                m7083x1(c0949eg, this.f5466ix[i], c0791b3M72975k4.m3971x6());
                m7083x1(c0949eg, this.f5472u4[i], c0791b3M72975k4.m3964rv());
                if (m6220yj().m64945h4().getShowMeanMarkers()) {
                    m7080k4(c0949eg, this.f5474uz[i], c0791b3M72975k4.m3960ks());
                }
            }
            for (C13824m8 c13824m8 : this.f5473up.get_Item(i)) {
                c13824m8.m73208du((c0949eg.m73225wy() / 2.0f) + c0949eg.m73205bz());
                c13824m8.m73212h4(m6216ks().f45394x1.mo4964k4(c14757wyM719c5.m72972k4(c13824m8.m64787to())));
            }
            for (C13824m8 c13824m82 : this.f5476yj.get_Item(i)) {
                c13824m82.m73208du((c0949eg.m73225wy() / 2.0f) + c0949eg.m73205bz());
                c13824m82.m73212h4(m6216ks().f45394x1.mo4964k4(c14757wyM719c5.m72972k4(c13824m82.m64787to())));
            }
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m7082k4(v1u v1uVar, C0966ev c0966ev, double d) {
        float fM73203ak;
        float fMo4964k4 = m6216ks().f45394x1.mo4964k4(d);
        int position = m6220yj().m64945h4().getLabels().getDefaultDataLabelFormat().getPosition();
        if (position != 0) {
            if (position == 5) {
                c0966ev.m73208du(v1uVar.m73205bz() - c0966ev.m73225wy());
            } else if (position != 8) {
                c0966ev.m73208du(v1uVar.m73205bz() + v1uVar.m73225wy());
            } else {
                c0966ev.m73208du(((v1uVar.m73225wy() / 2.0f) + v1uVar.m73205bz()) - (c0966ev.m73225wy() / 2.0f));
                fM73203ak = c0966ev.m73203ak();
                fMo4964k4 -= fM73203ak;
            }
            fM73203ak = c0966ev.m73203ak() / 2.0f;
            fMo4964k4 -= fM73203ak;
        } else {
            c0966ev.m73208du(((v1uVar.m73225wy() / 2.0f) + v1uVar.m73205bz()) - (c0966ev.m73225wy() / 2.0f));
        }
        c0966ev.m73212h4(fMo4964k4);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        for (int i = 0; i < m6220yj().m64945h4().m719c5().m72973k4(); i++) {
            C0791b3 c0791b3M72975k4 = m6220yj().m64945h4().m719c5().m72975k4(i);
            C0949eg c0949eg = this.f5463c5.get_Item(i);
            float fM64459kp = ((C13785ll) C7019kk.m27452k4((Object) m6216ks().f45392kk, C13785ll.class)).m64459kp() / ((m6216ks().f45391k4.size() - (this.f5468k4 * (m6216ks().f45391k4.size() - 1))) + m7084to());
            float fMo4964k4 = m6216ks().f45394x1.mo4964k4(c0791b3M72975k4.m3962ne());
            float fMo4964k42 = m6216ks().f45394x1.mo4964k4(c0791b3M72975k4.m3971x6());
            c0949eg.m73210fa(new C14713vw(fM64459kp, fMo4964k42 - fMo4964k4));
            float fMo4964k43 = m6216ks().f45394x1.mo4964k4(c0791b3M72975k4.m3966u4());
            float fMo4964k44 = m6216ks().f45394x1.mo4964k4(c0791b3M72975k4.m3952ix());
            this.f5467jd.get_Item(i).m73210fa(new C14713vw(c0949eg.m73225wy() / 4.0f, fMo4964k4 - fMo4964k43));
            this.f5464ck.get_Item(i).m73210fa(new C14713vw(c0949eg.m73225wy() / 4.0f, fMo4964k44 - fMo4964k42));
            for (C13824m8 c13824m8 : this.f5473up.get_Item(i)) {
                c13824m8.m73210fa(c14713vw);
            }
            for (C13824m8 c13824m82 : this.f5476yj.get_Item(i)) {
                c13824m82.m73210fa(c14713vw);
            }
            if (m6220yj().m64945h4().getLabels().isVisible()) {
                this.f5471rv[i].m73210fa(c14713vw);
                this.f5475x6[i].m73210fa(c14713vw);
                this.f5470ne[i].m73210fa(c14713vw);
                this.f5466ix[i].m73210fa(c14713vw);
                this.f5472u4[i].m73210fa(c14713vw);
                if (m6220yj().m64945h4().getShowMeanMarkers()) {
                    this.f5474uz[i].m73210fa(c14713vw);
                }
            }
        }
        List.Enumerator<lyj> it = this.f5465fa.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        oul oulVar = this.f5469ks;
        if (oulVar != null) {
            oulVar.m73210fa(c14713vw);
        }
    }

    @Override // com.aspose.slides.fml
    /* JADX INFO: renamed from: k4 */
    public void mo3716k4(double[] dArr, double[] dArr2) {
        C0791b3 c0791b3M72975k4 = m6220yj().m64945h4().m719c5().m72975k4(0);
        dArr[0] = c0791b3M72975k4.m3967up();
        dArr2[0] = c0791b3M72975k4.m3972yj();
        if (m6220yj().m64945h4().m719c5().m72973k4() > 1) {
            for (int i = 1; i < m6220yj().m64945h4().m719c5().m72973k4(); i++) {
                C0791b3 c0791b3M72975k42 = m6220yj().m64945h4().m719c5().m72975k4(i);
                if (c0791b3M72975k42.m3972yj() > dArr2[0]) {
                    dArr2[0] = c0791b3M72975k42.m3972yj();
                }
                if (c0791b3M72975k42.m3967up() < dArr[0]) {
                    dArr[0] = c0791b3M72975k42.m3967up();
                }
            }
        }
    }
}
