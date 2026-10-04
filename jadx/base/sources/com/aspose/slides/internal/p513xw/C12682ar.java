package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.C10789up;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.ar */
/* JADX INFO: loaded from: classes5.dex */
public class C12682ar extends AbstractC12732up {
    public C12682ar(C10789up c10789up) {
        super(c10789up);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: gi */
    public C12691dq mo48946gi() {
        return C12691dq.f42215k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo49023k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        C12724ss c12724ss2 = new C12724ss(0);
        List list = new List();
        InterfaceC12711lr interfaceC12711lrM59077to = null;
        while (interfaceC1870up.mo9764x1()) {
            C12717os c12717osMo9760kk = interfaceC1870up.mo9760kk();
            if (C7019kk.m27469x1(c12717osMo9760kk, C12696f9.class)) {
                C12717os c12717osMo58860kk = c12717osMo9760kk.mo58860kk();
                if (c12717osMo58860kk.m59077to() != this) {
                    list.addItem(c12717osMo58860kk);
                    interfaceC12711lrM59077to = c12717osMo58860kk.m59077to();
                }
            }
        }
        C12695em c12695em = new C12695em(new C1869to(list));
        while (true) {
            InterfaceC12711lr interfaceC12711lrM58935h4 = c12695em.m58935h4();
            if (interfaceC12711lrM58935h4 == null) {
                return;
            }
            c12724ss2.m59158k4(128, c12724ss.m59168kk() && interfaceC12711lrM58935h4 == interfaceC12711lrM59077to);
            interfaceC12711lrM58935h4.mo49023k4(c12695em, c12724ss2);
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.InterfaceC12685bv
    /* JADX INFO: renamed from: kp */
    public C12691dq mo48954kp() {
        return m59271g8();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: s7 */
    public C12691dq mo48956s7() {
        return C12691dq.f42215k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public void mo48960x1(C1606x1 c1606x1) {
        c1606x1.m8666k4(4);
        this.f42381to.mo48960x1(c1606x1);
    }
}
