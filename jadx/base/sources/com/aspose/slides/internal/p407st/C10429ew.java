package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ew */
/* JADX INFO: loaded from: classes4.dex */
public class C10429ew extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f36980k4;

    /* JADX INFO: renamed from: x1 */
    private int f36981x1;

    public C10429ew() {
        m51409um().m51917k4(4115);
        m51409um().m51920k4((short) 1);
        m51409um().m51916k4((byte) 1);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m50774x1() {
        return this.f36980k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50773k4(long j) {
        this.f36980k4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36980k4 = c3134k4.m13384uz();
        this.f36981x1 = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f36980k4 & 4294967295L);
        c3149x1.m13455x1(this.f36981x1);
    }
}
