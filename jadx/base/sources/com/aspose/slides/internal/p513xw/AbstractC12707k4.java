package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.k4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12707k4 implements InterfaceC12711lr {

    /* JADX INFO: renamed from: k4 */
    protected boolean f42281k4;

    /* JADX INFO: renamed from: kk */
    protected AbstractC3524ks f42282kk;

    /* JADX INFO: renamed from: x1 */
    protected boolean f42283x1;

    public AbstractC12707k4() {
        this.f42281k4 = false;
        this.f42283x1 = false;
        this.f42282kk = null;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: c5 */
    public int mo48941c5() {
        throw new NotSupportedException("getContentAreaBPD() called when it should have been overridden");
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: ck */
    public boolean mo48943ck() {
        return this.f42283x1;
    }

    /* JADX INFO: renamed from: du */
    public final int m59006du() {
        for (InterfaceC12711lr interfaceC12711lrMo54977m9 = mo54977m9(); interfaceC12711lrMo54977m9 != null; interfaceC12711lrMo54977m9 = interfaceC12711lrMo54977m9.mo54977m9()) {
            if (interfaceC12711lrMo54977m9.mo48948jd()) {
                return interfaceC12711lrMo54977m9.mo48944dy();
            }
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: dy */
    public int mo48944dy() {
        throw new NotSupportedException("getContentAreaIPD() called when it should have been overridden");
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: fa */
    public boolean mo54972fa() {
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m59007h4() {
        for (InterfaceC12711lr interfaceC12711lrMo54977m9 = mo54977m9(); interfaceC12711lrMo54977m9 != null; interfaceC12711lrMo54977m9 = interfaceC12711lrMo54977m9.mo54977m9()) {
            if (interfaceC12711lrMo54977m9.mo48948jd()) {
                if (C7019kk.m27469x1(interfaceC12711lrMo54977m9, C12687c5.class)) {
                    int i = ((C12687c5) C7019kk.m27452k4((Object) interfaceC12711lrMo54977m9, C12687c5.class)).m58881ts().m52241ts().f11697k4;
                    if (i == 1 || i == 51 || i == 206 || i == 215) {
                        return interfaceC12711lrMo54977m9.mo48941c5();
                    }
                } else if (C7019kk.m27469x1(interfaceC12711lrMo54977m9, C12719qq.class)) {
                    return interfaceC12711lrMo54977m9.mo48941c5();
                }
            }
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: jd */
    public boolean mo48948jd() {
        return this.f42281k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m59008k4() {
        for (InterfaceC12711lr interfaceC12711lrMo54977m9 = mo54977m9(); interfaceC12711lrMo54977m9 != null; interfaceC12711lrMo54977m9 = interfaceC12711lrMo54977m9.mo54977m9()) {
            if (interfaceC12711lrMo54977m9.mo48943ck() && !interfaceC12711lrMo54977m9.mo54972fa()) {
                return interfaceC12711lrMo54977m9.mo48944dy();
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public final C12687c5 m59010kk() {
        C12687c5 c12687c5;
        for (InterfaceC12711lr interfaceC12711lrMo54977m9 = mo54977m9(); interfaceC12711lrMo54977m9 != null; interfaceC12711lrMo54977m9 = interfaceC12711lrMo54977m9.mo54977m9()) {
            C12687c5 c12687c52 = (C12687c5) C7019kk.m27452k4((Object) interfaceC12711lrMo54977m9, C12687c5.class);
            if (c12687c52 != null) {
                int i = c12687c52.m58883yd().f11697k4;
                if (i != 1 && i != 206 && i != 110) {
                    if (c12687c52.m58881ts().m52246zj()) {
                        return (C12687c5) C7019kk.m27452k4((Object) c12687c52.mo54977m9().mo54977m9(), C12687c5.class);
                    }
                    if ((i != 9 || (c12687c5 = (C12687c5) C7019kk.m27452k4((Object) this, C12687c5.class)) == null || c12687c5.m58883yd().f11697k4 != 1 || c12687c5.m58883yd().f11696du.m10115du() != 9 || c12687c5.m58883yd().f11698kk.m10115du() != 9 || c12687c5.m58883yd().f11700x1.m10115du() != 9 || c12687c5.m58883yd().f11699to.m10115du() != 9) && !C7019kk.m27469x1(interfaceC12711lrMo54977m9.mo54977m9(), C12719qq.class)) {
                    }
                }
                return c12687c52;
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: ks */
    public void mo49027ks() {
        throw new NotSupportedException("Not implemented");
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: m9 */
    public abstract InterfaceC12711lr mo54977m9();

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: rv */
    public boolean mo55014rv() {
        return false;
    }

    /* JADX INFO: renamed from: to */
    public final int m59011to() {
        InterfaceC12711lr interfaceC12711lrMo54977m9 = mo54977m9();
        if (interfaceC12711lrMo54977m9 != null) {
            return interfaceC12711lrMo54977m9.mo48944dy();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: up */
    public final AbstractC3524ks mo59012up() {
        return this.f42282kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m59013x1() {
        for (InterfaceC12711lr interfaceC12711lrMo54977m9 = mo54977m9(); interfaceC12711lrMo54977m9 != null; interfaceC12711lrMo54977m9 = interfaceC12711lrMo54977m9.mo54977m9()) {
            if (interfaceC12711lrMo54977m9.mo48943ck() && !interfaceC12711lrMo54977m9.mo54972fa()) {
                return interfaceC12711lrMo54977m9.mo48941c5();
            }
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: yj */
    public boolean mo48963yj() {
        InterfaceC12711lr interfaceC12711lrMo54977m9 = mo54977m9();
        if (interfaceC12711lrMo54977m9 == null) {
            return false;
        }
        return interfaceC12711lrMo54977m9.mo48963yj();
    }

    public AbstractC12707k4(AbstractC3524ks abstractC3524ks) {
        this.f42281k4 = false;
        this.f42283x1 = false;
        this.f42282kk = abstractC3524ks;
        m59009k4(abstractC3524ks.mo14315ar());
        if (mo48948jd()) {
            m59014x1(true);
        }
    }

    @Override // com.aspose.slides.internal.p057c6.InterfaceC1981h4
    /* JADX INFO: renamed from: k4 */
    public int mo10099k4(int i, AbstractC3524ks abstractC3524ks) {
        if (abstractC3524ks != this.f42282kk) {
            InterfaceC12711lr interfaceC12711lrMo54977m9 = mo54977m9();
            while (interfaceC12711lrMo54977m9 != null && abstractC3524ks != interfaceC12711lrMo54977m9.mo59012up()) {
                interfaceC12711lrMo54977m9 = interfaceC12711lrMo54977m9.mo54977m9();
            }
            if (interfaceC12711lrMo54977m9 != null) {
                return interfaceC12711lrMo54977m9.mo10099k4(i, abstractC3524ks);
            }
            return 0;
        }
        if (i == 3) {
            return m59011to();
        }
        if (i == 4) {
            return m59006du();
        }
        if (i == 5) {
            return m59008k4();
        }
        if (i != 6) {
            return 0;
        }
        return m59013x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59014x1(boolean z) {
        this.f42283x1 = z;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo58879k4(C12724ss c12724ss, int i, Stack<InterfaceC12711lr> stack, C12717os c12717os, InterfaceC12711lr interfaceC12711lr) {
        throw new NotSupportedException("Not implemented");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59009k4(boolean z) {
        this.f42281k4 = z;
    }
}
