package com.aspose.slides.internal.p462vj;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p409sv.C10770ck;
import com.aspose.slides.internal.p513xw.AbstractC12727to;
import com.aspose.slides.internal.p513xw.AbstractC12729ts;
import com.aspose.slides.internal.p513xw.C12681ak;
import com.aspose.slides.internal.p513xw.C12702ix;
import com.aspose.slides.internal.p513xw.C12717os;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.internal.p513xw.C12733uz;
import com.aspose.slides.internal.p513xw.InterfaceC12711lr;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C11663ks extends AbstractC12727to implements InterfaceC11646ar {

    /* JADX INFO: renamed from: c5 */
    public AbstractC12729ts f39358c5;

    /* JADX INFO: renamed from: ck */
    private C10770ck f39359ck;

    /* JADX INFO: renamed from: fa */
    private C12702ix f39360fa;

    /* JADX INFO: renamed from: jd */
    public InterfaceC12711lr f39361jd;

    /* JADX INFO: renamed from: ks */
    private C1606x1 f39362ks;

    /* JADX INFO: renamed from: ne */
    private boolean f39363ne;

    /* JADX INFO: renamed from: rv */
    private C11677wy f39364rv;

    /* JADX INFO: renamed from: up */
    private boolean f39365up;

    /* JADX INFO: renamed from: x6 */
    private boolean f39366x6;

    /* JADX INFO: renamed from: yj */
    private boolean f39367yj;

    public C11663ks(C10770ck c10770ck) {
        super(c10770ck);
        this.f39360fa = null;
        this.f39365up = false;
        this.f39367yj = false;
        this.f39364rv = null;
        this.f39361jd = null;
        this.f39366x6 = false;
        this.f39363ne = false;
        this.f39359ck = c10770ck;
    }

    /* JADX INFO: renamed from: ak */
    public final C1606x1 m54901ak() {
        return this.f39362ks;
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m54902b3() {
        return this.f39365up;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: du */
    public final String mo54798du(C12717os c12717os) {
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m54904h4(boolean z) {
        this.f39363ne = z;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: k4 */
    public final List<InterfaceC1861h4> mo54799k4(List<InterfaceC1861h4> list) {
        return list;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: kk */
    public final boolean mo54802kk(List<InterfaceC1861h4> list, int i) {
        return false;
    }

    /* JADX INFO: renamed from: to */
    public final void m54905to(boolean z) {
        this.f39367yj = z;
    }

    /* JADX INFO: renamed from: wy */
    public final C12702ix m54906wy() {
        return this.f39360fa;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: x1 */
    public final List<InterfaceC1861h4> mo54803x1(List<InterfaceC1861h4> list, int i) {
        return list;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x6 */
    public void mo49031x6() {
        if (this.f39360fa == null) {
            this.f39360fa = new C12702ix(this.f39359ck);
        }
    }

    /* JADX INFO: renamed from: yd */
    public final boolean m54907yd() {
        return this.f39367yj;
    }

    /* JADX INFO: renamed from: du */
    public final void m54903du(boolean z) {
        this.f39365up = z;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: k4 */
    public final List<InterfaceC1861h4> mo54800k4(List<InterfaceC1861h4> list, int i, int i2) {
        return null;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public void mo48960x1(C1606x1 c1606x1) {
        if (this.f39363ne) {
            mo54977m9().mo48960x1(c1606x1);
        }
        this.f39362ks = c1606x1;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        List<C11663ks> listM59303dy;
        mo49031x6();
        this.f39360fa.mo54974k4((InterfaceC12711lr) this);
        this.f39360fa.mo49031x6();
        if (this.f39363ne) {
            try {
                return this.f39360fa.mo48950k4(c12724ss, i);
            } finally {
                m59229kk(true);
            }
        }
        if (!this.f39366x6 && (listM59303dy = new C12733uz(this).m59303dy()) != null) {
            listM59303dy.addItem(this);
        }
        List<InterfaceC1861h4> list = new List<>();
        C12681ak c12681ak = new C12681ak();
        C11675v4 c11675v4 = new C11675v4(0, null, null, true);
        this.f39358c5 = c11675v4;
        c11675v4.m54995k4(this.f39360fa);
        c12681ak.addItem(this.f39358c5);
        list.addItem(c12681ak);
        return list;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: x1 */
    public final boolean mo54804x1(List<InterfaceC1861h4> list) {
        return false;
    }

    @Override // com.aspose.slides.internal.p462vj.InterfaceC11646ar
    /* JADX INFO: renamed from: k4 */
    public final void mo54801k4(C12717os c12717os, C11666ne c11666ne) {
    }
}
