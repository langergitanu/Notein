package com.aspose.slides.internal.p481wp;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.x6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12242x6 extends AbstractC3524ks implements InterfaceC4260ak {

    /* JADX INFO: renamed from: m9 */
    private static boolean f40788m9 = false;

    /* JADX INFO: renamed from: c5 */
    private boolean f40789c5;

    /* JADX INFO: renamed from: dy */
    private boolean f40790dy;

    /* JADX INFO: renamed from: h4 */
    private C4270dy f40791h4;

    public C12242x6(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f40790dy = false;
        this.f40789c5 = false;
        if (f40788m9) {
            return;
        }
        m14118up().mo14340h4(this, m14105ks(), "fo:table-and-caption", m14106m_());
        f40788m9 = true;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f40789c5) {
            return;
        }
        m14123x1("marker* table-caption? table");
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 72;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f40791h4 = C4270dy.m17199k4(abstractC3533um);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "table-and-caption";
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f40791h4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (this.f40790dy) {
                    m14122x1(interfaceC3757h4, "fo:marker", "fo:table-caption");
                    return;
                } else {
                    if (this.f40789c5) {
                        m14122x1(interfaceC3757h4, "fo:marker", "fo:table");
                        return;
                    }
                    return;
                }
            }
            if (C14113y2.m67363du(str2, "table-caption")) {
                if (this.f40790dy) {
                    m14093k4(interfaceC3757h4, "fo:table-caption");
                    return;
                } else if (this.f40789c5) {
                    m14122x1(interfaceC3757h4, "fo:table-caption", "fo:table");
                    return;
                } else {
                    this.f40790dy = true;
                    return;
                }
            }
            if (!C14113y2.m67363du(str2, "table")) {
                m14103kk(interfaceC3757h4, str, str2);
            } else if (this.f40789c5) {
                m14093k4(interfaceC3757h4, "fo:table");
            } else {
                this.f40789c5 = true;
            }
        }
    }
}
