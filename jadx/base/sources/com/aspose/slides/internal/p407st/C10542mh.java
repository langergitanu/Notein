package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.mh */
/* JADX INFO: loaded from: classes4.dex */
public class C10542mh extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f37221k4;

    public C10542mh() {
        m51409um().m51917k4(EditingLanguage.URDU);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51286x1() {
        return this.f37221k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51285k4(int i) {
        this.f37221k4 = i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37221k4 = c3134k4.m13387yj() & 255;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13443k4((byte) this.f37221k4);
    }
}
