package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.l6 */
/* JADX INFO: loaded from: classes4.dex */
public class C10520l6 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37168k4;

    /* JADX INFO: renamed from: x1 */
    private int f37169x1;

    public C10520l6() {
        m51409um().m51917k4(EditingLanguage.UKRAINIAN);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: kk */
    public final int m51151kk() {
        return this.f37169x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51152x1() {
        return this.f37168k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51149k4(int i) {
        this.f37169x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51150k4(long j) {
        this.f37168k4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37168k4 = c3134k4.m13384uz();
        this.f37169x1 = c3134k4.m13382u4();
        c3134k4.m13382u4();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37168k4 & 4294967295L);
        c3149x1.m13446k4(this.f37169x1 & 65535);
        c3149x1.m13446k4(0);
    }
}
