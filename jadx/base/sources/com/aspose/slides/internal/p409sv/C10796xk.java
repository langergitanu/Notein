package com.aspose.slides.internal.p409sv;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C10796xk extends AbstractC10786to {

    /* JADX INFO: renamed from: c5 */
    private int f37840c5;

    /* JADX INFO: renamed from: dy */
    private int f37841dy;

    public C10796xk(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 65;
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10786to, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f37841dy = abstractC3533um.m14402to(209).mo17251du();
        this.f37840c5 = abstractC3533um.m14402to(206).mo17251du();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "retrieve-table-marker";
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14098k4(String str, InterfaceC3757h4 interfaceC3757h4, InterfaceC3760kk interfaceC3760kk, AbstractC3533um abstractC3533um) {
        if (m14323kk(78) >= 0 || m14323kk(77) >= 0) {
            super.mo14098k4(str, interfaceC3757h4, interfaceC3760kk, abstractC3533um);
        } else {
            m14095k4(this.f9753kk, m14115s_().m14105ks(), "http://www.w3.org/1999/XSL/Format", m14105ks(), "rule.retrieveTableMarkerDescendantOfHeaderOrFooter");
        }
    }
}
