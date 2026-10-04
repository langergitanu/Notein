package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p097e0.AbstractC3516dy;
import com.aspose.slides.internal.p145g8.C4226k4;
import com.aspose.slides.internal.p235kp.C5896kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p364qm.InterfaceC9890k4;
import com.aspose.slides.internal.p406ss.AbstractC10334k4;
import com.aspose.slides.internal.p406ss.C10326c5;
import com.aspose.slides.internal.p406ss.C10345uz;
import com.aspose.slides.internal.p462vj.C11668rv;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p513xw.C12703j2;
import com.aspose.slides.internal.p513xw.C12709kp;
import com.aspose.slides.internal.p513xw.C12737w6;
import com.aspose.slides.internal.p513xw.InterfaceC12740wy;
import com.aspose.slides.internal.p513xw.InterfaceC12746yd;
import com.aspose.slides.internal.p523yd.C12813m9;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1584du extends AbstractC3516dy {

    /* JADX INFO: renamed from: c5 */
    private InterfaceC12740wy f6141c5;

    /* JADX INFO: renamed from: du */
    private boolean f6142du;

    /* JADX INFO: renamed from: dy */
    private C12813m9 f6143dy;

    /* JADX INFO: renamed from: h4 */
    private C1595ne f6144h4;

    /* JADX INFO: renamed from: jd */
    private int f6145jd;

    /* JADX INFO: renamed from: k4 */
    protected C1587h4 f6146k4;

    /* JADX INFO: renamed from: m9 */
    private C10345uz f6147m9;

    /* JADX INFO: renamed from: to */
    private InterfaceC12746yd f6148to;

    public C1584du(C12814to c12814to, String str, AbstractC3150x6 abstractC3150x6) {
        super(c12814to);
        this.f6142du = true;
        this.f6143dy = new C12813m9();
        this.f6145jd = 0;
        m8556k4(c12814to, str, abstractC3150x6);
        InterfaceC12746yd interfaceC12746ydM59528dy = c12814to.m59556du().m59528dy();
        this.f6148to = interfaceC12746ydM59528dy;
        if (interfaceC12746ydM59528dy == null) {
            this.f6148to = new C12709kp();
        }
        this.f6144h4 = new C1595ne();
        this.f6142du = c12814to.m59582uz();
    }

    /* JADX INFO: renamed from: du */
    public final C1595ne m8550du() {
        return this.f6144h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m8551h4() {
        return this.f6142du;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3516dy
    /* JADX INFO: renamed from: k4 */
    public void mo8552k4() {
    }

    /* JADX INFO: renamed from: kk */
    public final C1587h4 m8557kk() {
        return this.f6146k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m8558m9() {
        int i = this.f6145jd + 1;
        this.f6145jd = i;
        return C14113y2.m67408k4("P", C14057f9.m66591x1(i));
    }

    /* JADX INFO: renamed from: to */
    public final InterfaceC12746yd m8559to() {
        return this.f6148to;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3516dy
    /* JADX INFO: renamed from: x1 */
    public void mo8560x1() {
        m8548k4((InterfaceC1986to) null);
        C10345uz c10345uz = this.f6147m9;
        if (c10345uz != null) {
            List<C4226k4> listM50398g8 = c10345uz.m50398g8();
            if (listM50398g8 != null) {
                while (listM50398g8.size() > 0) {
                    C4226k4 c4226k4 = listM50398g8.get_Item(0);
                    listM50398g8.removeAt(0);
                    m8547k4(new C1592ks(c4226k4));
                }
            }
            C5896kk c5896kkM50407sv = this.f6147m9.m50407sv();
            if (c5896kkM50407sv != null) {
                C1601up c1601up = new C1601up(c5896kkM50407sv);
                m8547k4(c1601up);
                if (!c1601up.mo8591kk()) {
                    this.f6146k4.mo8486k4(c1601up);
                }
            }
            this.f6144h4.m8613x1(this.f6147m9.mo14334yd());
        }
        this.f6146k4.mo8485k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m8546k4(List<InterfaceC9890k4> list) {
        List.Enumerator<InterfaceC9890k4> it = list.iterator();
        while (it.hasNext()) {
            try {
                m8547k4(new C1600um(it.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3516dy
    /* JADX INFO: renamed from: x1 */
    public void mo8561x1(C10326c5 c10326c5) {
        try {
            if (c10326c5.m50332sv() != null) {
                C12703j2 c12703j2Mo59018k4 = m8559to().mo59018k4(this, c10326c5);
                c12703j2Mo59018k4.m58994xk();
                this.f6141c5 = c12703j2Mo59018k4;
            }
        } finally {
            C11668rv.m54919x1().m54930m9();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m8547k4(InterfaceC1588ix interfaceC1588ix) {
        if (C7019kk.m27469x1(interfaceC1588ix, InterfaceC1599u4.class)) {
            InterfaceC1599u4 interfaceC1599u4 = (InterfaceC1599u4) interfaceC1588ix;
            for (String str : interfaceC1599u4.mo8592to()) {
                List<C12737w6> listM8612to = this.f6144h4.m8612to(str);
                if (listM8612to == null || listM8612to.size() == 0) {
                    C1591kk.m8589k4(mo14167b_().m59580u4()).mo8625k4(this, interfaceC1588ix.mo8576du(), str);
                    this.f6144h4.m8609k4(str, interfaceC1599u4);
                } else {
                    interfaceC1599u4.mo8590k4(str, listM8612to);
                }
            }
            if (!interfaceC1599u4.mo8591kk()) {
                return;
            }
        }
        this.f6146k4.mo8486k4(interfaceC1588ix);
    }

    /* JADX INFO: renamed from: k4 */
    private void m8548k4(InterfaceC1986to interfaceC1986to) {
        InterfaceC12740wy interfaceC12740wy = this.f6141c5;
        if (interfaceC12740wy != null) {
            interfaceC12740wy.mo58919k4(interfaceC1986to);
            this.f6141c5.mo58993v_();
            this.f6141c5 = null;
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3516dy
    /* JADX INFO: renamed from: k4 */
    public void mo8553k4(C10326c5 c10326c5) {
        m8549k4((AbstractC10334k4) c10326c5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m8549k4(AbstractC10334k4 abstractC10334k4) {
        C10345uz c10345uzMo14126yj = abstractC10334k4.mo14126yj();
        this.f6147m9 = c10345uzMo14126yj;
        if (this.f6141c5 == null) {
            m8546k4(c10345uzMo14126yj.m14319dq());
            if (this.f6147m9.m50406qm() != null) {
                m8546k4(this.f6147m9.m50406qm().m14319dq());
            }
        }
        m8548k4(abstractC10334k4.m50361qm());
        abstractC10334k4.m50362ts();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8554k4(AbstractC10334k4 abstractC10334k4, int i) {
        this.f6143dy.m59552k4(abstractC10334k4, i);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3516dy
    /* JADX INFO: renamed from: k4 */
    public void mo8555k4(C10345uz c10345uz) {
        C11697x1 c11697x1M50408wp = c10345uz.m50408wp();
        if (c11697x1M50408wp != null) {
            this.f6146k4.mo8488k4(c11697x1M50408wp);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8556k4(C12814to c12814to, String str, AbstractC3150x6 abstractC3150x6) {
        this.f6146k4 = new C1579b3(c12814to, str, this.f9790kk, abstractC3150x6);
    }
}
