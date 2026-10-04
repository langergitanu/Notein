package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.tl */
/* JADX INFO: loaded from: classes4.dex */
public class C10651tl extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37399k4;

    /* JADX INFO: renamed from: x1 */
    private int f37400x1;

    public C10651tl() {
        m51409um().m51917k4(4049);
        this.f37399k4 = 0L;
        this.f37400x1 = 1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 12;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51755x1() {
        return this.f37400x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51753k4(int i) {
        this.f37400x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51754k4(long j) {
        this.f37399k4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37399k4 = c3134k4.m13384uz();
        this.f37400x1 = c3134k4.m13386x6();
        c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37399k4 & 4294967295L);
        c3149x1.m13455x1(this.f37400x1);
        c3149x1.m13455x1(0);
    }
}
