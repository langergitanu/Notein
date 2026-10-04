package com.aspose.slides.internal.p409sv;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.dq */
/* JADX INFO: loaded from: classes4.dex */
public class C10771dq extends AbstractC10786to {

    /* JADX INFO: renamed from: c5 */
    private int f37635c5;

    /* JADX INFO: renamed from: dy */
    private int f37636dy;

    public C10771dq(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    /* JADX INFO: renamed from: bz */
    public final int m52214bz() {
        return this.f37635c5;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m52215e0() {
        return this.f37636dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 64;
    }

    @Override // com.aspose.slides.internal.p409sv.AbstractC10786to, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f37636dy = abstractC3533um.m14402to(208).mo17251du();
        this.f37635c5 = abstractC3533um.m14402to(205).mo17251du();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "retrieve-marker";
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14098k4(String str, InterfaceC3757h4 interfaceC3757h4, InterfaceC3760kk interfaceC3760kk, AbstractC3533um abstractC3533um) {
        if (m14323kk(70) < 0) {
            m14095k4(this.f9753kk, m14115s_().m14105ks(), "http://www.w3.org/1999/XSL/Format", mo14114rv(), "rule.retrieveMarkerDescendantOfStaticContent");
        } else {
            super.mo14098k4(str, interfaceC3757h4, interfaceC3760kk, abstractC3533um);
        }
    }
}
