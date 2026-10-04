package com.aspose.slides.internal.p481wp;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.ix */
/* JADX INFO: loaded from: classes5.dex */
public class C12223ix extends AbstractC3524ks implements InterfaceC4260ak {

    /* JADX INFO: renamed from: dy */
    private static boolean f40658dy = false;

    /* JADX INFO: renamed from: h4 */
    private C4270dy f40659h4;

    /* JADX INFO: renamed from: m9 */
    private boolean f40660m9;

    public C12223ix(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f40660m9 = false;
        if (f40658dy) {
            return;
        }
        m14118up().mo14340h4(this, m14105ks(), "fo:table-caption", m14106m_());
        f40658dy = true;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f9851to == null) {
            m14123x1("marker* (%block;)");
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 74;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f40659h4 = C4270dy.m17199k4(abstractC3533um);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "table-caption";
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f40659h4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (this.f40660m9) {
                    m14122x1(interfaceC3757h4, "fo:marker", "(%block;)");
                }
            } else if (m14332x1(str, str2)) {
                this.f40660m9 = true;
            } else {
                m14103kk(interfaceC3757h4, str, str2);
            }
        }
    }
}
