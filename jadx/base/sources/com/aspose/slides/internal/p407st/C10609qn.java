package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.qn */
/* JADX INFO: loaded from: classes4.dex */
public class C10609qn extends AbstractC10739yw {

    /* JADX INFO: renamed from: k4 */
    private long f37326k4;

    public C10609qn(int i, long j) {
        super(i, false);
        this.f37326k4 = j;
    }

    /* JADX INFO: renamed from: ar */
    public final long m51597ar() {
        return this.f37326k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10739yw
    /* JADX INFO: renamed from: k4 */
    public int mo50416k4() {
        return 6;
    }

    public C10609qn(int i, boolean z, long j) {
        super(i, z);
        this.f37326k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51598k4(long j) {
        this.f37326k4 = j;
    }

    public C10609qn(C10609qn c10609qn) {
        super(c10609qn.m52116up(), c10609qn.m52117yj());
        this.f37326k4 = c10609qn.m51597ar();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10739yw
    /* JADX INFO: renamed from: k4 */
    public void mo50419k4(C3149x1 c3149x1) {
        c3149x1.m13448k4((short) (m52116up() | (m52117yj() ? 16384 : 0)));
        c3149x1.m13447k4(this.f37326k4 & 4294967295L);
    }
}
