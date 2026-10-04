package com.aspose.slides.internal.p097e0;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.bv */
/* JADX INFO: loaded from: classes3.dex */
public class C3510bv extends AbstractC3523kk {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3511c5 f9748k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC3511c5 f9749kk;

    /* JADX INFO: renamed from: to */
    private AbstractC3523kk f9750to = null;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3511c5.k4 f9751x1;

    public C3510bv(AbstractC3524ks abstractC3524ks) {
        this.f9751x1 = null;
        this.f9748k4 = abstractC3524ks;
        this.f9751x1 = abstractC3524ks.mo14080ck();
        m14066dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m14066dy() {
        AbstractC3523kk abstractC3523kkMo14082fa;
        AbstractC3511c5.k4 k4Var = this.f9751x1;
        if (k4Var == null || !k4Var.mo9764x1()) {
            abstractC3523kkMo14082fa = null;
            this.f9749kk = null;
        } else {
            AbstractC3511c5 abstractC3511c5Mo9760kk = this.f9751x1.mo9760kk();
            this.f9749kk = abstractC3511c5Mo9760kk;
            abstractC3523kkMo14082fa = abstractC3511c5Mo9760kk.mo14082fa();
        }
        this.f9750to = abstractC3523kkMo14082fa;
    }

    public final Object clone() {
        C3510bv c3510bv = (C3510bv) deepClone();
        AbstractC3511c5.k4 k4VarMo14102kk = this.f9748k4.mo14102kk(c3510bv.f9749kk);
        c3510bv.f9751x1 = k4VarMo14102kk;
        k4VarMo14102kk.mo9760kk();
        c3510bv.f9750to = (AbstractC3523kk) this.f9750to.deepClone();
        return c3510bv;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk, com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: k4 */
    public void mo9758k4() {
        AbstractC3523kk abstractC3523kk = this.f9750to;
        if (abstractC3523kk != null) {
            abstractC3523kk.mo9758k4();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC3523kk m14068m9() {
        return (AbstractC3523kk) clone();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk
    /* JADX INFO: renamed from: to */
    public char mo14069to() {
        AbstractC3523kk abstractC3523kk = this.f9750to;
        if (abstractC3523kk != null) {
            return abstractC3523kk.mo14069to();
        }
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk, com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: x1 */
    public boolean mo9764x1() {
        while (true) {
            AbstractC3523kk abstractC3523kk = this.f9750to;
            if (abstractC3523kk == null) {
                return false;
            }
            if (abstractC3523kk.mo9764x1()) {
                return true;
            }
            m14066dy();
        }
    }

    public C3510bv(AbstractC3524ks abstractC3524ks, AbstractC3511c5 abstractC3511c5) {
        this.f9751x1 = null;
        this.f9748k4 = abstractC3524ks;
        this.f9751x1 = abstractC3524ks.mo14102kk(abstractC3511c5);
        m14066dy();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk
    /* JADX INFO: renamed from: k4 */
    public void mo14067k4(char c) {
        AbstractC3523kk abstractC3523kk = this.f9750to;
        if (abstractC3523kk != null) {
            abstractC3523kk.mo14067k4(c);
        }
    }
}
