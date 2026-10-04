package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p371qw.C9951dy;
import com.aspose.slides.internal.p461vh.C11643kk;
import com.aspose.slides.internal.p462vj.C11663ks;
import com.aspose.slides.internal.p462vj.C11668rv;
import com.aspose.slides.internal.p462vj.C11671u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.uz */
/* JADX INFO: loaded from: classes5.dex */
public class C12733uz {

    /* JADX INFO: renamed from: du */
    private C12719qq f42417du;

    /* JADX INFO: renamed from: h4 */
    private C12702ix f42419h4;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12711lr f42420k4;

    /* JADX INFO: renamed from: kk */
    private C11643kk f42421kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f42422m9;

    /* JADX INFO: renamed from: to */
    private C9951dy f42423to;

    /* JADX INFO: renamed from: x1 */
    private List<C11663ks> f42424x1 = null;

    /* JADX INFO: renamed from: dy */
    private int f42418dy = 0;

    public C12733uz(InterfaceC12711lr interfaceC12711lr) {
        this.f42421kk = null;
        this.f42423to = null;
        this.f42417du = null;
        this.f42422m9 = false;
        this.f42420k4 = interfaceC12711lr;
        this.f42423to = m59300x1(interfaceC12711lr);
        this.f42421kk = m59297k4(this.f42420k4);
        this.f42417du = m59298kk(this.f42420k4);
        this.f42419h4 = m59296du(this.f42420k4);
        this.f42422m9 = m59299to(this.f42420k4) != null;
    }

    /* JADX INFO: renamed from: du */
    private C12702ix m59296du(InterfaceC12711lr interfaceC12711lr) {
        InterfaceC12711lr interfaceC12711lrMo54977m9 = interfaceC12711lr.mo54977m9();
        if (interfaceC12711lrMo54977m9 == null) {
            return null;
        }
        return C7019kk.m27469x1(interfaceC12711lrMo54977m9, C12702ix.class) ? (C12702ix) C7019kk.m27452k4((Object) interfaceC12711lrMo54977m9, C12702ix.class) : m59296du(interfaceC12711lrMo54977m9);
    }

    /* JADX INFO: renamed from: c5 */
    public final List<C11663ks> m59301c5() {
        return m59306k4(false);
    }

    /* JADX INFO: renamed from: dy */
    public final List<C11663ks> m59303dy() {
        C12719qq c12719qq = this.f42417du;
        if (c12719qq == null) {
            return null;
        }
        return c12719qq.m59090yd();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m59304h4() {
        return this.f42422m9;
    }

    /* JADX INFO: renamed from: jd */
    public final List<C11663ks> m59305jd() {
        int i;
        this.f42418dy = 0;
        List<C11663ks> listM59303dy = this.f42424x1;
        if (listM59303dy != null) {
            i = 1;
        } else if (this.f42423to == null || C11668rv.m54919x1().m54929kk() || (listM59303dy = C11668rv.m54919x1().m54923k4(this.f42423to)) == null) {
            listM59303dy = m59303dy();
            if (listM59303dy != null) {
                i = 4;
            } else {
                listM59303dy = m59301c5();
                if (listM59303dy == null) {
                    return listM59303dy;
                }
                i = 2;
            }
        } else {
            i = 3;
        }
        this.f42418dy = i;
        return listM59303dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C11663ks> m59306k4(boolean z) {
        C12702ix c12702ix = this.f42419h4;
        if (c12702ix == null) {
            return null;
        }
        if (z || !c12702ix.m58987yd()) {
            return this.f42419h4.m58954b3();
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final C11643kk m59309kk() {
        return this.f42421kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m59310m9() {
        return this.f42420k4.mo54979qq().m59235um().m59334ck().m8480uz();
    }

    /* JADX INFO: renamed from: to */
    public final C9951dy m59311to() {
        return this.f42423to;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C11663ks> m59312x1() {
        return this.f42424x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11643kk m59297k4(InterfaceC12711lr interfaceC12711lr) {
        if (interfaceC12711lr == null) {
            return null;
        }
        C11643kk c11643kk = (C11643kk) C7019kk.m27452k4((Object) interfaceC12711lr, C11643kk.class);
        return c11643kk != null ? c11643kk : m59297k4(interfaceC12711lr.mo54977m9());
    }

    /* JADX INFO: renamed from: kk */
    private C12719qq m59298kk(InterfaceC12711lr interfaceC12711lr) {
        InterfaceC12711lr interfaceC12711lrMo54977m9 = interfaceC12711lr.mo54977m9();
        if (interfaceC12711lrMo54977m9 == null || C7019kk.m27469x1(interfaceC12711lrMo54977m9, C12702ix.class)) {
            return null;
        }
        return C7019kk.m27469x1(interfaceC12711lrMo54977m9, C12719qq.class) ? (C12719qq) C7019kk.m27452k4((Object) interfaceC12711lrMo54977m9, C12719qq.class) : m59298kk(interfaceC12711lrMo54977m9);
    }

    /* JADX INFO: renamed from: to */
    private C11671u4 m59299to(InterfaceC12711lr interfaceC12711lr) {
        InterfaceC12711lr interfaceC12711lrMo54977m9 = interfaceC12711lr.mo54977m9();
        if (interfaceC12711lrMo54977m9 == null) {
            return null;
        }
        return C7019kk.m27469x1(interfaceC12711lrMo54977m9, C11671u4.class) ? (C11671u4) C7019kk.m27452k4((Object) interfaceC12711lrMo54977m9, C11671u4.class) : m59299to(interfaceC12711lrMo54977m9);
    }

    /* JADX INFO: renamed from: x1 */
    private C9951dy m59300x1(InterfaceC12711lr interfaceC12711lr) {
        if (interfaceC12711lr == null) {
            return null;
        }
        C9951dy c9951dy = (C9951dy) C7019kk.m27452k4((Object) interfaceC12711lr, C9951dy.class);
        return c9951dy != null ? c9951dy : m59300x1(interfaceC12711lr.mo54977m9());
    }

    /* JADX INFO: renamed from: du */
    public final C12719qq m59302du() {
        return this.f42417du;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12711lr m59307k4() {
        return this.f42420k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59308k4(List<C11663ks> list) {
        this.f42424x1 = list;
    }
}
