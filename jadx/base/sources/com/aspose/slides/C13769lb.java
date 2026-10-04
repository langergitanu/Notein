package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.lb */
/* JADX INFO: loaded from: classes3.dex */
class C13769lb extends fml {

    /* JADX INFO: renamed from: c5 */
    private List<C0953ej> f45955c5;

    /* JADX INFO: renamed from: k4 */
    private List<C14279pf> f45956k4;

    public C13769lb(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        this.f45956k4 = new List<>();
        this.f45955c5 = new List<>();
        int iM72973k4 = c13847mr.m64945h4().m719c5().m72973k4();
        for (int i = 0; i < iM72973k4; i++) {
            C0791b3 c0791b3M72975k4 = m6220yj().m64945h4().m719c5().m72975k4(i);
            C14279pf c14279pf = new C14279pf(c13847mr, c0791b3M72975k4);
            this.f45956k4.addItem(c14279pf);
            m73215k4(c14279pf);
            if (c13847mr.m64945h4().getLabels().isVisible()) {
                C0953ej c0953ej = new C0953ej(c0791b3M72975k4, new C0852cf((DataLabel) c0791b3M72975k4.m3961m9(), c13847mr.m64941c5()));
                this.f45955c5.addItem(c0953ej);
                m73215k4(c0953ej);
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m64332m9() {
        float fM73219qm;
        float fM73203ak;
        int iM72973k4 = m6220yj().m64945h4().m719c5().m72973k4();
        for (int i = 0; i < iM72973k4; i++) {
            C14279pf c14279pf = this.f45956k4.get_Item(i);
            C0953ej c0953ej = this.f45955c5.get_Item(i);
            int position = m6220yj().m64945h4().m719c5().m72975k4(i).m3961m9().getDataLabelFormat().getPosition();
            if (position != 2) {
                if (position == 3) {
                    fM73219qm = c14279pf.m73219qm() + c14279pf.m73203ak();
                } else if (position != 4) {
                    fM73219qm = c14279pf.m73219qm();
                } else {
                    fM73203ak = c14279pf.m73219qm();
                    c0953ej.m73212h4(fM73203ak);
                }
                fM73203ak = fM73219qm - c0953ej.m73203ak();
                c0953ej.m73212h4(fM73203ak);
            } else {
                c0953ej.m73212h4(((c14279pf.m73203ak() / 2.0f) + c14279pf.m73219qm()) - (c0953ej.m73203ak() / 2.0f));
            }
            c0953ej.m73208du(((c14279pf.m73225wy() / 2.0f) + c14279pf.m73205bz()) - (c0953ej.m73225wy() / 2.0f));
            c0953ej.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        float fM72555k4 = (c14713vw.m72555k4() / m6220yj().m64945h4().m719c5().m72973k4()) / (m64333to() + 1.0f);
        for (int i = 0; i < m6220yj().m64945h4().m719c5().m72973k4(); i++) {
            this.f45956k4.get_Item(i).m73210fa(new C14713vw(fM72555k4, c14713vw.m72556x1() - m6216ks().f45394x1.mo4964k4(m6220yj().m64945h4().m719c5().m72975k4(i).m3950fa())));
            if (m6220yj().m64945h4().getLabels().isVisible()) {
                this.f45955c5.get_Item(i).m73210fa(c14713vw);
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public final float m64333to() {
        return m6220yj().m64945h4().getGapWidth() / 100.0f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        int iM72973k4 = m6220yj().m64945h4().m719c5().m72973k4();
        float fM72555k4 = c14713vw.m72555k4() / iM72973k4;
        for (int i = 0; i < iM72973k4; i++) {
            this.f45956k4.get_Item(i).m73212h4(m6216ks().f45394x1.mo4964k4(m6220yj().m64945h4().m719c5().m72975k4(i).m3950fa()));
            this.f45956k4.get_Item(i).m73208du(((fM72555k4 / 2.0f) + (i * fM72555k4)) - (this.f45956k4.get_Item(i).m73225wy() / 2.0f));
            this.f45956k4.get_Item(i).m73220ss();
        }
        if (m6220yj().m64945h4().getLabels().isVisible()) {
            m64332m9();
        }
    }

    @Override // com.aspose.slides.fml
    /* JADX INFO: renamed from: k4 */
    public void mo3716k4(double[] dArr, double[] dArr2) {
        C0791b3 c0791b3M72975k4 = m6220yj().m64945h4().m719c5().m72975k4(0);
        dArr[0] = c0791b3M72975k4.m3950fa();
        dArr2[0] = c0791b3M72975k4.m3950fa();
        if (m6220yj().m64945h4().m719c5().m72973k4() > 1) {
            for (int i = 1; i < m6220yj().m64945h4().m719c5().m72973k4(); i++) {
                C0791b3 c0791b3M72975k42 = m6220yj().m64945h4().m719c5().m72975k4(i);
                if (c0791b3M72975k42.m3950fa() > dArr2[0]) {
                    dArr2[0] = c0791b3M72975k42.m3950fa();
                }
                if (c0791b3M72975k42.m3950fa() < dArr[0]) {
                    dArr[0] = c0791b3M72975k42.m3950fa();
                }
            }
        }
    }
}
