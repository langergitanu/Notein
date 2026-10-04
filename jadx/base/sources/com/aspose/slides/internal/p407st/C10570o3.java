package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.o3 */
/* JADX INFO: loaded from: classes4.dex */
public class C10570o3 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f37255k4 = 46448;

    /* JADX INFO: renamed from: x1 */
    private int f37256x1 = 46448;

    public C10570o3() {
        m51409um().m51917k4(EditingLanguage.HEBREW);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51400x1(int i) {
        this.f37256x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51399k4(int i) {
        this.f37255k4 = i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37255k4 = c3134k4.m13386x6();
        this.f37256x1 = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f37255k4);
        c3149x1.m13455x1(this.f37256x1);
    }
}
