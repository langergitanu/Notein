package com.aspose.slides.internal.p361qh;

import com.aspose.slides.internal.p390s1.C10129kk;
import com.aspose.slides.internal.p390s1.C10130to;

/* JADX INFO: renamed from: com.aspose.slides.internal.qh.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9880kk extends C9882x1 {
    public C9880kk(C10130to c10130to, C10129kk c10129kk) {
        super(c10130to, c10129kk);
    }

    @Override // com.aspose.slides.internal.p361qh.C9882x1, com.aspose.slides.internal.p390s1.InterfaceC10127du
    /* JADX INFO: renamed from: k4 */
    public void mo48690k4() {
        C10129kk c10129kk = this.f35721k4;
        int iIndexOf = c10129kk.f36293k4.indexOf(c10129kk.f36286c5, c10129kk.f36292jd);
        if (iIndexOf == -1) {
            iIndexOf = this.f35721k4.f36293k4.length();
        }
        C10129kk c10129kk2 = this.f35721k4;
        if (c10129kk2.f36293k4.indexOf("\t", c10129kk2.f36292jd) > iIndexOf) {
            super.mo48690k4();
            return;
        }
        C10129kk c10129kk3 = this.f35721k4;
        c10129kk3.f36287ck = Math.min(iIndexOf + 1, c10129kk3.f36293k4.length());
        m48700k4((m48702kk() || m48705x1()) ? this.f35721k4.f36287ck : Math.min(m48699k4(this.f35721k4), this.f35721k4.f36287ck));
    }

    @Override // com.aspose.slides.internal.p361qh.C9882x1, com.aspose.slides.internal.p361qh.AbstractC9879k4
    /* JADX INFO: renamed from: x1 */
    public int mo48691x1(C10129kk c10129kk) {
        return m48703to(c10129kk);
    }
}
