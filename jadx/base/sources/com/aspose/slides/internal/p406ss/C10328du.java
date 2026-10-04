package com.aspose.slides.internal.p406ss;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10328du extends AbstractC3524ks {

    /* JADX INFO: renamed from: h4 */
    private String f36771h4;

    /* JADX INFO: renamed from: m9 */
    private boolean f36772m9;

    public C10328du(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f36772m9 = false;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks
    /* JADX INFO: renamed from: ar */
    public boolean mo14315ar() {
        return true;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (!this.f36772m9) {
            m14123x1("marker* (%block;)+");
        }
        mo14107n_().mo14197x1(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        if (C14113y2.m67411k4(this.f36771h4)) {
            m14104kk("flow-name");
        }
        mo14107n_().mo14170k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 16;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f36771h4 = abstractC3533um.m14402to(98).mo9926j_();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "flow";
    }

    /* JADX INFO: renamed from: ts */
    public final String m50347ts() {
        return this.f36771h4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (this.f36772m9) {
                    m14122x1(interfaceC3757h4, "fo:marker", "(%block;)");
                }
            } else if (m14332x1(str, str2)) {
                this.f36772m9 = true;
            } else {
                m14103kk(interfaceC3757h4, str, str2);
            }
        }
    }
}
