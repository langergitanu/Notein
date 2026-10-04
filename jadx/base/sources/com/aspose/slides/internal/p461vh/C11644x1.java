package com.aspose.slides.internal.p461vh;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p034b3.C1581c5;
import com.aspose.slides.internal.p034b3.C1589jd;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.AbstractC10794x1;
import com.aspose.slides.internal.p409sv.C10784qq;
import com.aspose.slides.internal.p409sv.C10792wl;
import com.aspose.slides.internal.p513xw.AbstractC12732up;
import com.aspose.slides.internal.p513xw.C12684bs;
import com.aspose.slides.internal.p513xw.C12691dq;
import com.aspose.slides.internal.p513xw.C12695em;
import com.aspose.slides.internal.p513xw.C12696f9;
import com.aspose.slides.internal.p513xw.C12712m2;
import com.aspose.slides.internal.p513xw.C12717os;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.internal.p513xw.InterfaceC12711lr;

/* JADX INFO: renamed from: com.aspose.slides.internal.vh.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11644x1 extends AbstractC12732up {

    /* JADX INFO: renamed from: c5 */
    private C1581c5 f39253c5;

    /* JADX INFO: renamed from: uz */
    private int f39254uz;

    /* JADX INFO: renamed from: wl */
    private int f39255wl;

    public C11644x1(C10784qq c10784qq) {
        super(c10784qq);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: dq */
    public C4266c6 mo49021dq() {
        return m54781yd().m52359e0();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: gi */
    public C12691dq mo48946gi() {
        return C12691dq.f42215k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public C1606x1 mo48951k4(C1606x1 c1606x1) {
        if (this.f39253c5 == null) {
            C1581c5 c1581c5 = new C1581c5();
            this.f39253c5 = c1581c5;
            c1581c5.m8502c5(2);
            this.f39253c5.m8581k4(this.f39254uz, false, false);
            this.f39253c5.m8679x1(this.f39255wl);
            C12712m2.m59048k4(this.f39253c5, m54781yd().mo14334yd());
            this.f39253c5.m8679x1(this.f42381to.mo48951k4(this.f39253c5).m8678x1());
            m59277k4((C1589jd) this.f39253c5);
        }
        return this.f39253c5;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: s7 */
    public C12691dq mo48956s7() {
        return C12691dq.f42215k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public void mo48960x1(C1606x1 c1606x1) {
        C1581c5 c1581c5 = this.f39253c5;
        if (c1581c5 != null) {
            c1581c5.mo8483x1((C1581c5) c1606x1);
        }
    }

    /* JADX INFO: renamed from: yd */
    public final AbstractC10794x1 m54781yd() {
        return (AbstractC10794x1) this.f42282kk;
    }

    public C11644x1(C10792wl c10792wl) {
        super(c10792wl);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo49023k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        mo48951k4((C1606x1) null);
        mo54817v4();
        C12724ss c12724ss2 = new C12724ss(0);
        List list = new List();
        C12717os c12717os = null;
        C12717os c12717os2 = null;
        InterfaceC12711lr interfaceC12711lr = null;
        InterfaceC12711lr interfaceC12711lrM59077to = null;
        while (interfaceC1870up.mo9764x1()) {
            C12717os c12717osMo9760kk = interfaceC1870up.mo9760kk();
            if (c12717osMo9760kk != null) {
                if (c12717osMo9760kk.m59073du() >= 0) {
                    if (c12717os == null) {
                        c12717os = c12717osMo9760kk;
                    }
                    c12717os2 = c12717osMo9760kk;
                }
                if (C7019kk.m27469x1(c12717osMo9760kk, C12696f9.class)) {
                    list.addItem(c12717osMo9760kk.mo58860kk());
                    interfaceC12711lrM59077to = c12717osMo9760kk.mo58860kk().m59077to();
                    if (interfaceC12711lr == null) {
                        interfaceC12711lr = interfaceC12711lrM59077to;
                    }
                } else if (C7019kk.m27469x1(c12717osMo9760kk, C12684bs.k4.class)) {
                    list.addItem(c12717osMo9760kk);
                }
            }
        }
        m59227k4(true, m59239x1(c12717os), m59230kk(c12717os2));
        C12695em c12695em = new C12695em(new C1869to(list));
        while (true) {
            InterfaceC12711lr interfaceC12711lrM58935h4 = c12695em.m58935h4();
            if (interfaceC12711lrM58935h4 == null) {
                m59227k4(false, m59239x1(c12717os), m59230kk(c12717os2));
                mo58877ak();
                this.f39253c5 = null;
                m59233to(c12717os2);
                return;
            }
            c12724ss2.m59158k4(32, interfaceC12711lrM58935h4 == interfaceC12711lr);
            c12724ss2.m59158k4(128, interfaceC12711lrM58935h4 == interfaceC12711lrM59077to);
            c12724ss2.m59156k4(c12724ss.m59183wl());
            c12724ss2.m59160k4(c12724ss.m59173ne());
            interfaceC12711lrM58935h4.mo49023k4(c12695em, c12724ss2);
        }
    }
}
