package com.aspose.slides.internal.p409sv;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10794x1 extends AbstractC3524ks implements InterfaceC4260ak {

    /* JADX INFO: renamed from: dy */
    private boolean f37829dy;

    /* JADX INFO: renamed from: h4 */
    private C4270dy f37830h4;

    /* JADX INFO: renamed from: m9 */
    private C4266c6 f37831m9;

    public AbstractC10794x1(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f37829dy = false;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f37829dy) {
            return;
        }
        m14118up().mo14353k4((Object) this, m14105ks(), "marker* (%block;)+", true, m14106m_());
    }

    /* JADX INFO: renamed from: e0 */
    public final C4266c6 m52359e0() {
        return this.f37831m9;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f37830h4 = C4270dy.m17199k4(abstractC3533um);
        this.f37831m9 = abstractC3533um.m14385du(131).mo17190up();
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f37830h4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (this.f37829dy) {
                    m14122x1(interfaceC3757h4, "fo:marker", "(%block;)");
                }
            } else if (m14332x1(str, str2)) {
                this.f37829dy = true;
            } else {
                m14103kk(interfaceC3757h4, str, str2);
            }
        }
    }
}
