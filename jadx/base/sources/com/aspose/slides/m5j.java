package com.aspose.slides;

import OooO0o.C20424OooO0Oo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class m5j extends fml {

    /* JADX INFO: renamed from: k4 */
    private List<C0809b9> f46177k4;

    public m5j(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        this.f46177k4 = new List<>();
        double dM4989k4 = 0.0d;
        for (int i = 0; i < c13847mr.m64944dy().size(); i++) {
            C0886d8 c0886d8 = c13847mr.m64944dy().get_Item(i);
            dM4989k4 = c0886d8.m4988jd().getSetAsTotal() ? c0886d8.m4989k4() : dM4989k4 + c0886d8.m4989k4();
            aeq aeqVar = new aeq(c0886d8);
            ((fml) this).f5072x1.addItem(aeqVar);
            aeqVar.m6920k4(dM4989k4);
            m73215k4(aeqVar);
            if (!c0886d8.m4983dy() && c0886d8.m5003ks() != null && c0886d8.m5003ks().m4569up()) {
                C14610tz c14610tz = new C14610tz(aeqVar);
                ((fml) this).f5069kk.addItem(c14610tz);
                m73215k4(c14610tz);
            }
        }
        if (m6220yj().m64945h4().getShowConnectorLines()) {
            for (int i2 = 0; i2 < c13847mr.m64944dy().size() - 1; i2++) {
                C0809b9 c0809b9 = new C0809b9(c13847mr);
                m73215k4(c0809b9);
                this.f46177k4.addItem(c0809b9);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r0.m6926yj().m4989k4() < 0.0d) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        r2 = r0.m73219qm() + r0.m73203ak();
        r3 = r1.m73203ak();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        r2 = r0.m73219qm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r0.m6926yj().m4989k4() < 0.0d) goto L23;
     */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m64763kk(C14713vw c14713vw) {
        float fM73219qm;
        for (int i = 0; i < ((fml) this).f5069kk.size(); i++) {
            aeq aeqVar = (aeq) ((C14610tz) C7019kk.m27452k4((Object) ((fml) this).f5069kk.get_Item(i), C14610tz.class)).m71462to();
            C14177nd c14177nd = ((fml) this).f5069kk.get_Item(i);
            int iM4559dy = aeqVar.m6926yj().m5003ks().m4559dy();
            if (iM4559dy == 2) {
                c14177nd.m73212h4(((aeqVar.m73203ak() / 2.0f) + aeqVar.m73219qm()) - (c14177nd.m73203ak() / 2.0f));
            } else if (iM4559dy != 3) {
                if (iM4559dy != 4) {
                    if (iM4559dy == 6) {
                        float fM73203ak = 4.0f;
                        if (aeqVar.m6926yj().m4989k4() < 0.0d) {
                            fM73219qm = aeqVar.m73219qm() + aeqVar.m73203ak() + 4.0f;
                            c14177nd.m73212h4(fM73219qm);
                        } else {
                            float fM73219qm2 = aeqVar.m73219qm() - c14177nd.m73203ak();
                            fM73219qm = fM73219qm2 - fM73203ak;
                            c14177nd.m73212h4(fM73219qm);
                        }
                    }
                }
            }
            c14177nd.m73208du(((aeqVar.m73225wy() / 2.0f) + aeqVar.m73205bz()) - (c14177nd.m73225wy() / 2.0f));
            c14177nd.m73220ss();
        }
    }

    /* JADX INFO: renamed from: m9 */
    private float m64764m9() {
        return m6220yj().m64945h4().getGapWidth() / 100.0f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        ValueAxisBase valueAxisBase = (ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45394x1, ValueAxisBase.class);
        float fMo4964k4 = valueAxisBase.mo4964k4(0.0d);
        int i = 0;
        while (i < ((fml) this).f5072x1.size()) {
            if (((fml) this).f5072x1.get_Item(i).m6926yj().m4988jd().getSetAsTotal()) {
                fMo4964k4 = valueAxisBase.mo4964k4(0.0d);
            }
            float fMo4964k42 = valueAxisBase.mo4964k4(((fml) this).f5072x1.get_Item(i).m6918fa());
            ((fml) this).f5072x1.get_Item(i).m73210fa(new C14713vw(C20424OooO0Oo.OooO0O0(m64765to(), m64764m9(), 2.0f, m64765to()), C14116yg.m67481k4(fMo4964k4, fMo4964k42) - C14116yg.m67504x1(fMo4964k4, fMo4964k42)));
            i++;
            fMo4964k4 = fMo4964k42;
        }
        for (int i2 = 0; i2 < this.f46177k4.size(); i2++) {
            this.f46177k4.get_Item(i2).m73210fa(c14713vw);
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
    }

    /* JADX INFO: renamed from: to */
    public final float m64765to() {
        return C7019kk.m27469x1(m6216ks().f45392kk, AbstractC14464sp.class) ? ((C1195hd) C7019kk.m27452k4((Object) m6216ks().f45392kk, C1195hd.class)).m7099um() : ((C13785ll) C7019kk.m27452k4((Object) m6216ks().f45392kk, C13785ll.class)).m64459kp();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        g2y g2yVarM4052to;
        float fM73219qm;
        g2y g2yVarM4051du;
        float fM73219qm2;
        ValueAxisBase valueAxisBase = (ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45394x1, ValueAxisBase.class);
        float fMo4964k4 = valueAxisBase.mo4964k4(0.0d);
        int i = 0;
        int i2 = 0;
        while (i2 < ((fml) this).f5072x1.size()) {
            if (((fml) this).f5072x1.get_Item(i2).m6926yj().m4988jd().getSetAsTotal()) {
                fMo4964k4 = valueAxisBase.mo4964k4(0.0d);
            }
            float fMo4964k42 = valueAxisBase.mo4964k4(((fml) this).f5072x1.get_Item(i2).m6918fa());
            ((fml) this).f5072x1.get_Item(i2).m73212h4(C14116yg.m67504x1(fMo4964k4, fMo4964k42));
            ((fml) this).f5072x1.get_Item(i2).m73208du(((m64765to() / 2.0f) + (i2 * m64765to())) - (((fml) this).f5072x1.get_Item(i2).m73225wy() / 2.0f));
            ((fml) this).f5072x1.get_Item(i2).m73220ss();
            i2++;
            fMo4964k4 = fMo4964k42;
        }
        while (i < this.f46177k4.size()) {
            if (((fml) this).f5072x1.get_Item(i).m6926yj().m4989k4() < 0.0d) {
                this.f46177k4.get_Item(i).m4052to().m73208du(((fml) this).f5072x1.get_Item(i).m73205bz() + ((fml) this).f5072x1.get_Item(i).m73225wy());
                g2yVarM4052to = this.f46177k4.get_Item(i).m4052to();
                fM73219qm = ((fml) this).f5072x1.get_Item(i).m73219qm() + ((fml) this).f5072x1.get_Item(i).m73203ak();
            } else {
                this.f46177k4.get_Item(i).m4052to().m73208du(((fml) this).f5072x1.get_Item(i).m73205bz() + ((fml) this).f5072x1.get_Item(i).m73225wy());
                g2yVarM4052to = this.f46177k4.get_Item(i).m4052to();
                fM73219qm = ((fml) this).f5072x1.get_Item(i).m73219qm();
            }
            g2yVarM4052to.m73212h4(fM73219qm);
            int i3 = i + 1;
            if (!((fml) this).f5072x1.get_Item(i3).m6926yj().m4988jd().getSetAsTotal() ? ((fml) this).f5072x1.get_Item(i3).m6926yj().m4989k4() < 0.0d : ((fml) this).f5072x1.get_Item(i3).m6926yj().m4989k4() >= 0.0d) {
                this.f46177k4.get_Item(i).m4051du().m73208du(((fml) this).f5072x1.get_Item(i3).m73205bz());
                g2yVarM4051du = this.f46177k4.get_Item(i).m4051du();
                fM73219qm2 = ((fml) this).f5072x1.get_Item(i3).m73219qm() + ((fml) this).f5072x1.get_Item(i3).m73203ak();
            } else {
                this.f46177k4.get_Item(i).m4051du().m73208du(((fml) this).f5072x1.get_Item(i3).m73205bz());
                g2yVarM4051du = this.f46177k4.get_Item(i).m4051du();
                fM73219qm2 = ((fml) this).f5072x1.get_Item(i3).m73219qm();
            }
            g2yVarM4051du.m73212h4(fM73219qm2);
            if (!((fml) this).f5072x1.get_Item(i).mo3221T_() || ((fml) this).f5072x1.get_Item(i).m6926yj().m4983dy()) {
                this.f46177k4.get_Item(i).m4052to().m73208du((((fml) this).f5072x1.get_Item(i).m73225wy() / 2.0f) + ((fml) this).f5072x1.get_Item(i).m73205bz());
                this.f46177k4.get_Item(i).m4052to().m73212h4(((fml) this).f5072x1.get_Item(i).m73219qm() + ((fml) this).f5072x1.get_Item(i).m73203ak());
            }
            if (!((fml) this).f5072x1.get_Item(i3).mo3221T_() || ((fml) this).f5072x1.get_Item(i3).m6926yj().m4983dy()) {
                this.f46177k4.get_Item(i).m4051du().m73208du((((fml) this).f5072x1.get_Item(i3).m73225wy() / 2.0f) + ((fml) this).f5072x1.get_Item(i3).m73205bz());
                this.f46177k4.get_Item(i).m4051du().m73212h4(((fml) this).f5072x1.get_Item(i3).m73219qm() + ((fml) this).f5072x1.get_Item(i3).m73203ak());
            }
            this.f46177k4.get_Item(i).m73220ss();
            i = i3;
        }
        m64763kk(c14713vw);
    }
}
