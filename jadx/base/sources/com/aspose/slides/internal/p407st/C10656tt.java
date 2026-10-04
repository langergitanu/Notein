package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.tt */
/* JADX INFO: loaded from: classes4.dex */
class C10656tt extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    long[] f37414k4;

    public C10656tt() {
        m51409um().m51917k4(EditingLanguage.KOREAN);
        m51409um().m51920k4((short) 0);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return this.f37414k4.length * 4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37414k4 = new long[m51409um().m51914du() / 4];
        int i = 0;
        while (true) {
            long[] jArr = this.f37414k4;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = c3134k4.m13384uz();
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        int i = 0;
        while (true) {
            long[] jArr = this.f37414k4;
            if (i >= jArr.length) {
                return;
            }
            c3149x1.m13447k4(jArr[i] & 4294967295L);
            i++;
        }
    }
}
