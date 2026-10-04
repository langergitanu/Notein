package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.dv */
/* JADX INFO: loaded from: classes4.dex */
public class C10410dv extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f36949k4;

    /* JADX INFO: renamed from: x1 */
    private long f36950x1;

    public C10410dv() {
        m51409um().m51917k4(61754);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50711k4(int i) {
        this.f36950x1 = ((long) i) & 4294967295L;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36949k4 = c3134k4.m13386x6();
        this.f36950x1 = c3134k4.m13384uz();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f36949k4);
        c3149x1.m13447k4(this.f36950x1 & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50712k4(boolean z) {
        this.f36949k4 = z ? this.f36949k4 | 1 : this.f36949k4 & (-2);
    }
}
