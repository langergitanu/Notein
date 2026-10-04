package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.dl */
/* JADX INFO: loaded from: classes4.dex */
public class C10404dl extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f36944k4;

    public C10404dl() {
        m51409um().m51917k4(EditingLanguage.SPANISH_SPAIN_TRADITIONAL_SORT);
        this.f36944k4 = 1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m50689x1() {
        return ((long) this.f36944k4) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50688k4(long j) {
        this.f36944k4 = (int) j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36944k4 = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f36944k4);
    }
}
