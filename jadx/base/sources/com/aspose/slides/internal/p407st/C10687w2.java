package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.w2 */
/* JADX INFO: loaded from: classes4.dex */
class C10687w2 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37458k4;

    /* JADX INFO: renamed from: x1 */
    private long f37459x1;

    public C10687w2() {
        m51409um().m51917k4(4015);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51891x1() {
        return this.f37458k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37458k4 = c3134k4.m13384uz();
        this.f37459x1 = c3134k4.m13384uz();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37458k4 & 4294967295L);
        c3149x1.m13447k4(this.f37459x1 & 4294967295L);
    }
}
