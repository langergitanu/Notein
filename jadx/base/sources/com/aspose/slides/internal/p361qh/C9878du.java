package com.aspose.slides.internal.p361qh;

import com.aspose.slides.internal.p390s1.C10129kk;
import com.aspose.slides.internal.p390s1.C10130to;

/* JADX INFO: renamed from: com.aspose.slides.internal.qh.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9878du extends AbstractC9879k4 {
    public C9878du(C10130to c10130to, C10129kk c10129kk) {
        super(c10130to, c10129kk);
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10127du
    /* JADX INFO: renamed from: k4 */
    public void mo48690k4() {
        C10129kk c10129kk = this.f35721k4;
        int iIndexOf = c10129kk.f36293k4.indexOf(c10129kk.f36286c5, c10129kk.f36292jd);
        if (m48705x1()) {
            C10129kk c10129kk2 = this.f35721k4;
            c10129kk2.f36287ck = iIndexOf == -1 ? c10129kk2.f36293k4.length() : iIndexOf + 1;
        } else {
            int iM48699k4 = m48699k4(this.f35721k4);
            if (iIndexOf == -1) {
                this.f35721k4.f36287ck = iM48699k4;
            } else {
                C10129kk c10129kk3 = this.f35721k4;
                if (iM48699k4 >= iIndexOf) {
                    iM48699k4 = iIndexOf + 1;
                }
                c10129kk3.f36287ck = iM48699k4;
            }
        }
        C10129kk c10129kk4 = this.f35721k4;
        c10129kk4.m49733k4(c10129kk4.f36292jd, c10129kk4.f36287ck, 0.0f);
    }

    @Override // com.aspose.slides.internal.p361qh.AbstractC9879k4
    /* JADX INFO: renamed from: x1 */
    public int mo48691x1(C10129kk c10129kk) {
        return m48701kk(c10129kk);
    }
}
