package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p513xw.C12684bs;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12714m9 {
    /* JADX INFO: renamed from: k4 */
    public static void m59058k4(AbstractC12732up abstractC12732up, InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        C12724ss c12724ss2 = new C12724ss(0);
        if (abstractC12732up != null) {
            abstractC12732up.mo54817v4();
        }
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
        if (c12717os == null) {
            return;
        }
        if (abstractC12732up != null) {
            abstractC12732up.m59227k4(true, abstractC12732up.m59239x1(c12717os), abstractC12732up.m59230kk(c12717os2));
        }
        C12695em c12695em = new C12695em(new C1869to(list));
        while (true) {
            InterfaceC12711lr interfaceC12711lrM58935h4 = c12695em.m58935h4();
            if (interfaceC12711lrM58935h4 == null) {
                break;
            }
            c12724ss2.m59158k4(32, interfaceC12711lrM58935h4 == interfaceC12711lr);
            c12724ss2.m59158k4(128, interfaceC12711lrM58935h4 == interfaceC12711lrM59077to);
            c12724ss2.m59156k4(c12724ss.m59183wl());
            c12724ss2.m59172m9(interfaceC12711lrM58935h4 == interfaceC12711lr ? c12724ss.m59138b3() : 0);
            c12724ss2.m59149dy(c12724ss.m59184wy());
            c12724ss2.m59160k4(c12724ss.m59173ne());
            interfaceC12711lrM58935h4.mo49023k4(c12695em, c12724ss2);
        }
        if (abstractC12732up != null) {
            abstractC12732up.m59227k4(false, abstractC12732up.m59239x1(c12717os), abstractC12732up.m59230kk(c12717os2));
            abstractC12732up.m59233to(c12717os2);
        }
    }
}
