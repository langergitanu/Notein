package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.oa */
/* JADX INFO: loaded from: classes4.dex */
public class C10573oa extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f37263k4;

    /* JADX INFO: renamed from: x1 */
    private long f37264x1;

    public C10573oa() {
        m51409um().m51917k4(61755);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m51423kk() {
        return (this.f37263k4 & 2) == 2;
    }

    /* JADX INFO: renamed from: to */
    public final long m51424to() {
        return this.f37264x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51425x1(boolean z) {
        this.f37263k4 = z ? this.f37263k4 | 2 : this.f37263k4 & (-3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51421k4(long j) {
        this.f37264x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m51426x1() {
        return (this.f37263k4 & 1) == 1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37263k4 = c3134k4.m13386x6();
        this.f37264x1 = c3134k4.m13384uz();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f37263k4);
        c3149x1.m13447k4(this.f37264x1 & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51422k4(boolean z) {
        this.f37263k4 = z ? this.f37263k4 | 1 : this.f37263k4 & (-2);
    }
}
