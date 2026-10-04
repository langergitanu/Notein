package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.o9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10572o9 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37260k4;

    /* JADX INFO: renamed from: kk */
    private int f37261kk;

    /* JADX INFO: renamed from: x1 */
    private int f37262x1;

    public C10572o9() {
        m51409um().m51917k4(EditingLanguage.CHINESE_SINGAPORE);
        this.f37262x1 = 0;
        this.f37261kk = EditingLanguage.ISI_ZULU;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m51417kk() {
        return (this.f37262x1 & 1) == 1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m51418to() {
        return (this.f37262x1 & 2) == 2;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51419x1() {
        return this.f37260k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51415k4(long j) {
        this.f37260k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51420x1(boolean z) {
        this.f37262x1 = z ? this.f37262x1 | 2 : this.f37262x1 & (-3);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37260k4 = c3134k4.m13384uz();
        this.f37262x1 = c3134k4.m13382u4() & 65535;
        this.f37261kk = c3134k4.m13382u4() & 65535;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37260k4 & 4294967295L);
        c3149x1.m13446k4(this.f37262x1 & 65535);
        c3149x1.m13446k4(this.f37261kk & 65535);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51416k4(boolean z) {
        this.f37262x1 = z ? this.f37262x1 | 1 : this.f37262x1 & (-2);
    }
}
