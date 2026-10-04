package com.aspose.slides.internal.p361qh;

import com.aspose.slides.internal.p390s1.C10129kk;
import com.aspose.slides.internal.p390s1.C10130to;

/* JADX INFO: renamed from: com.aspose.slides.internal.qh.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9881to extends C9878du {
    public C9881to(C10130to c10130to, C10129kk c10129kk) {
        super(c10130to, c10129kk);
    }

    @Override // com.aspose.slides.internal.p361qh.C9878du, com.aspose.slides.internal.p390s1.InterfaceC10127du
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
        if (m48705x1()) {
            C10129kk c10129kk3 = this.f35721k4;
            c10129kk3.f36287ck = Math.min(iIndexOf + 1, c10129kk3.f36293k4.length());
        } else {
            int iM48699k4 = m48699k4(this.f35721k4);
            this.f35721k4.f36287ck = Math.min(iM48699k4, iIndexOf + 1);
            C10129kk c10129kk4 = this.f35721k4;
            c10129kk4.f36287ck = Math.min(c10129kk4.f36287ck, c10129kk4.f36293k4.length());
        }
        m48700k4(this.f35721k4.f36287ck);
    }

    @Override // com.aspose.slides.internal.p361qh.C9878du, com.aspose.slides.internal.p361qh.AbstractC9879k4
    /* JADX INFO: renamed from: x1 */
    public int mo48691x1(C10129kk c10129kk) {
        return m48703to(c10129kk);
    }
}
