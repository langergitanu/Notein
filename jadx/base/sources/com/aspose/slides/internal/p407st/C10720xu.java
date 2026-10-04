package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.xu */
/* JADX INFO: loaded from: classes4.dex */
public class C10720xu extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37521k4;

    /* JADX INFO: renamed from: x1 */
    private long f37522x1;

    public C10720xu() {
        m51409um().m51917k4(61737);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: kk */
    public final long m52013kk() {
        return this.f37522x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m52014x1() {
        return this.f37521k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52012k4(long j) {
        this.f37521k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52015x1(long j) {
        this.f37522x1 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37521k4 = c3134k4.m13384uz();
        this.f37522x1 = c3134k4.m13384uz();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37521k4 & 4294967295L);
        c3149x1.m13447k4(this.f37522x1 & 4294967295L);
    }
}
