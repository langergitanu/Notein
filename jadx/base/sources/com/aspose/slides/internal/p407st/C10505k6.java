package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.k6 */
/* JADX INFO: loaded from: classes4.dex */
public class C10505k6 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37139k4;

    /* JADX INFO: renamed from: kk */
    private int f37140kk = 2;

    /* JADX INFO: renamed from: x1 */
    private int f37141x1;

    public C10505k6() {
        m51409um().m51916k4((byte) 2);
        m51409um().m51917k4(1024);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 12;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51099x1() {
        return this.f37139k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51097k4(long j) {
        this.f37139k4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37139k4 = c3134k4.m13384uz();
        this.f37141x1 = c3134k4.m13386x6();
        this.f37140kk = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37139k4 & 4294967295L);
        c3149x1.m13455x1(this.f37141x1);
        c3149x1.m13455x1(this.f37140kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51098k4(boolean z) {
        this.f37141x1 = z ? 1 : 0;
    }
}
