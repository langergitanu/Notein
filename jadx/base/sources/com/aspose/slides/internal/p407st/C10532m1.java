package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.m1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10532m1 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f37203k4;

    /* JADX INFO: renamed from: kk */
    private long f37204kk;

    /* JADX INFO: renamed from: to */
    private long f37205to;

    /* JADX INFO: renamed from: x1 */
    private long f37206x1;

    public C10532m1() {
        m51409um().m51917k4(61747);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 16;
    }

    /* JADX INFO: renamed from: kk */
    public final long m51232kk() {
        return this.f37206x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51234x1(long j) {
        this.f37204kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51230k4(long j) {
        this.f37206x1 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51233kk(long j) {
        this.f37205to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51235x1(boolean z) {
        this.f37203k4 = z ? this.f37203k4 | 4 : this.f37203k4 & (-5);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37203k4 = c3134k4.m13386x6();
        this.f37206x1 = c3134k4.m13384uz();
        this.f37204kk = c3134k4.m13384uz();
        this.f37205to = c3134k4.m13384uz();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m51236x1() {
        return (this.f37203k4 & 1) == 1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f37203k4);
        c3149x1.m13447k4(this.f37206x1 & 4294967295L);
        c3149x1.m13447k4(this.f37204kk & 4294967295L);
        c3149x1.m13447k4(this.f37205to & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51231k4(boolean z) {
        this.f37203k4 = z ? this.f37203k4 | 1 : this.f37203k4 & (-2);
    }
}
