package com.aspose.slides.internal.p462vj;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.C10774fa;
import com.aspose.slides.internal.p513xw.AbstractC12725sv;
import com.aspose.slides.internal.p513xw.AbstractC12729ts;
import com.aspose.slides.internal.p513xw.C12681ak;
import com.aspose.slides.internal.p513xw.C12682ar;
import com.aspose.slides.internal.p513xw.C12695em;
import com.aspose.slides.internal.p513xw.C12696f9;
import com.aspose.slides.internal.p513xw.C12717os;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.internal.p513xw.InterfaceC12711lr;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11679x6 extends AbstractC11672um {

    /* JADX INFO: renamed from: c5 */
    private C10774fa f39490c5;

    /* JADX INFO: renamed from: ck */
    private C12682ar f39491ck;

    /* JADX INFO: renamed from: fa */
    private AbstractC12729ts f39492fa;

    /* JADX INFO: renamed from: jd */
    private AbstractC11672um f39493jd;

    public C11679x6(C10774fa c10774fa) {
        super(c10774fa);
        this.f39490c5 = c10774fa;
    }

    /* JADX INFO: renamed from: kk */
    private void m55027kk(List<InterfaceC1861h4> list) {
        C1869to c1869to = new C1869to(list, list.size());
        C11675v4 c11675v4 = null;
        while (c1869to.mo9762to() && c11675v4 == null) {
            InterfaceC1861h4 interfaceC1861h4 = (InterfaceC1861h4) c1869to.mo9756du();
            if (interfaceC1861h4.mo9728kk()) {
                AbstractC12729ts abstractC12729ts = (AbstractC12729ts) interfaceC1861h4.mo9727k4();
                if (C7019kk.m27469x1(abstractC12729ts, C11675v4.class)) {
                    c11675v4 = (C11675v4) abstractC12729ts;
                }
            } else {
                AbstractC12725sv abstractC12725svMo9730x1 = interfaceC1861h4.mo9730x1();
                C1869to c1869to2 = new C1869to(abstractC12725svMo9730x1, abstractC12725svMo9730x1.size());
                while (c1869to2.mo9762to() && c11675v4 == null) {
                    AbstractC12729ts abstractC12729ts2 = (AbstractC12729ts) ((InterfaceC1861h4) c1869to2.mo9756du()).mo9727k4();
                    if ((C7019kk.m27469x1(abstractC12729ts2, C11675v4.class) && !abstractC12729ts2.m59251ks()) || abstractC12729ts2 == this.f39492fa) {
                        c11675v4 = (C11675v4) abstractC12729ts2;
                    }
                }
            }
        }
        if (c11675v4 != null) {
            c11675v4.m54994k4(this.f39491ck);
        }
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11672um, com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo54800k4(List<InterfaceC1861h4> list, int i, int i2) {
        List<InterfaceC1861h4> listMo54800k4 = super.mo54800k4(list, i, i2);
        m55027kk(listMo54800k4);
        return listMo54800k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x6 */
    public void mo49031x6() {
        this.f39493jd = new C11674uz(this.f39490c5.m52248e0());
        this.f39491ck = new C12682ar(this.f39490c5.m52247bz());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        this.f39493jd.mo54974k4(this);
        this.f39493jd.mo49031x6();
        this.f39491ck.mo54974k4(this);
        this.f39491ck.mo49031x6();
        List<InterfaceC1861h4> list = new List<>();
        while (!this.f39493jd.mo54980wl()) {
            IGenericEnumerable<InterfaceC1861h4> iGenericEnumerableMo48950k4 = this.f39493jd.mo48950k4(c12724ss, i);
            if (iGenericEnumerableMo48950k4 != null) {
                list.addRange(iGenericEnumerableMo48950k4);
            }
        }
        if (list.size() == 0) {
            C12681ak c12681ak = new C12681ak();
            C11675v4 c11675v4 = new C11675v4(0, null, null, true);
            this.f39492fa = c11675v4;
            c12681ak.addItem(c11675v4);
            list.addItem(c12681ak);
        }
        m59229kk(true);
        m55027kk(list);
        C1869to c1869to = new C1869to(list);
        while (c1869to.mo9764x1()) {
            C1869to c1869to2 = new C1869to(((InterfaceC1861h4) c1869to.mo9760kk()).mo9730x1());
            while (c1869to2.mo9764x1()) {
                AbstractC12729ts abstractC12729ts = (AbstractC12729ts) c1869to2.mo9760kk();
                abstractC12729ts.m59132k4(mo54973k4(new C12696f9(this, abstractC12729ts.m59134uz())));
            }
        }
        return list;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo49023k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        List list = new List();
        while (interfaceC1870up.mo9764x1()) {
            C12717os c12717osMo9760kk = interfaceC1870up.mo9760kk();
            if (c12717osMo9760kk != null && c12717osMo9760kk.mo58860kk() != null) {
                list.addItem(c12717osMo9760kk.mo58860kk());
            }
        }
        this.f39493jd.mo54974k4(mo54977m9());
        C12724ss c12724ss2 = new C12724ss(c12724ss);
        C12695em c12695em = new C12695em(new C1869to(list));
        while (true) {
            InterfaceC12711lr interfaceC12711lrM58935h4 = c12695em.m58935h4();
            if (interfaceC12711lrM58935h4 == null) {
                return;
            }
            interfaceC12711lrM58935h4.mo49023k4(c12695em, c12724ss2);
            c12724ss2.m59163k4(c12724ss2.m59195yj());
            c12724ss2.m59158k4(256, true);
        }
    }
}
