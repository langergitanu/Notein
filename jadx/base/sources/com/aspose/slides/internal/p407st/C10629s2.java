package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.s2 */
/* JADX INFO: loaded from: classes4.dex */
public class C10629s2 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private C14084qq f37362k4 = new C14084qq();

    public C10629s2() {
        m51409um().m51917k4(12011);
        C14084qq.m67081jd().CloneTo(this.f37362k4);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        try {
            C3085sv.m13106x1(c3134k4.m13380ne()).CloneTo(this.f37362k4);
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            C14084qq.m67120x1(0L).CloneTo(this.f37362k4);
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13456x1(C3085sv.m13076k4(this.f37362k4.Clone()));
    }
}
