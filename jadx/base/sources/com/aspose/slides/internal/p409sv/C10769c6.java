package com.aspose.slides.internal.p409sv;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3529rv;
import com.aspose.slides.internal.p097e0.C3507ak;
import com.aspose.slides.internal.p097e0.C3513ck;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C10769c6 extends AbstractC3529rv {

    /* JADX INFO: renamed from: dy */
    private boolean f37630dy;

    public C10769c6(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f37630dy = false;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3529rv, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        super.mo14081dy();
        mo14107n_().mo14202x1(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14175k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 81;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3529rv, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        super.mo14089k4(abstractC3511c5);
        if (C7019kk.m27469x1(abstractC3511c5, C3513ck.class) && ((C3513ck) abstractC3511c5).m14154um()) {
            AbstractC3511c5 abstractC3511c5M14115s_ = this.f9752k4;
            while (abstractC3511c5M14115s_.mo14084ix() == 81) {
                abstractC3511c5M14115s_ = abstractC3511c5M14115s_.m14115s_();
            }
            if (C7019kk.m27469x1(abstractC3511c5M14115s_, AbstractC3529rv.class)) {
                return;
            }
            m14095k4(m14106m_(), mo14114rv(), "http://www.w3.org/1999/XSL/Format", "#PCDATA", "rule.wrapperInvalidChildForParent");
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "wrapper";
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        C10769c6 c10769c6;
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (!C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (!m14328to(str, str2)) {
                    m14103kk(interfaceC3757h4, str, str2);
                    return;
                }
                try {
                    AbstractC3511c5.m14074k4(this.f9752k4, interfaceC3757h4, str, str2);
                    c10769c6 = this;
                } catch (C3507ak unused) {
                    c10769c6 = this;
                    c10769c6.m14095k4(interfaceC3757h4, m14105ks(), "http://www.w3.org/1999/XSL/Format", str2, "rule.wrapperInvalidChildForParent");
                }
                c10769c6.f37630dy = true;
                return;
            }
            if (this.f37630dy) {
                m14122x1(interfaceC3757h4, "fo:marker", "(#PCDATA|%inline;|%block;)");
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public boolean mo14101k4(int i) {
        return false;
    }
}
