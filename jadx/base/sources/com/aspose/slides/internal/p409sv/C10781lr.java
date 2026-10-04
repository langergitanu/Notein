package com.aspose.slides.internal.p409sv;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C10781lr extends AbstractC3524ks {

    /* JADX INFO: renamed from: h4 */
    private static boolean f37742h4 = false;

    public C10781lr(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        if (f37742h4) {
            return;
        }
        m14118up().mo14340h4(this, m14105ks(), m14105ks(), m14106m_());
        f37742h4 = true;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f9851to == null) {
            m14123x1("(multi-case+)");
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 48;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "multi-switch";
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str) || C14113y2.m67363du(str2, "multi-case")) {
            return;
        }
        m14103kk(interfaceC3757h4, str, str2);
    }
}
