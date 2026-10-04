package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.n4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10555n4 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37237k4;

    /* JADX INFO: renamed from: kk */
    private long f37238kk;

    /* JADX INFO: renamed from: to */
    private int f37239to;

    /* JADX INFO: renamed from: x1 */
    private long f37240x1;

    public C10555n4() {
        m51409um().m51917k4(61736);
    }

    /* JADX INFO: renamed from: du */
    public final int m51349du() {
        return this.f37239to;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 16;
    }

    /* JADX INFO: renamed from: kk */
    public final long m51352kk() {
        return this.f37240x1;
    }

    /* JADX INFO: renamed from: to */
    public final long m51353to() {
        return this.f37238kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51354x1() {
        return (int) this.f37237k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51350k4(int i) {
        this.f37237k4 = ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51355x1(int i) {
        this.f37239to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51351k4(long j) {
        this.f37240x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51356x1(long j) {
        this.f37238kk = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37237k4 = c3134k4.m13384uz();
        this.f37240x1 = c3134k4.m13384uz();
        this.f37238kk = c3134k4.m13384uz();
        this.f37239to = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37237k4 & 4294967295L);
        c3149x1.m13447k4(this.f37240x1 & 4294967295L);
        c3149x1.m13447k4(this.f37238kk & 4294967295L);
        c3149x1.m13455x1(this.f37239to);
    }
}
