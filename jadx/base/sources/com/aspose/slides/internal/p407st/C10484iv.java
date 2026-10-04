package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.iv */
/* JADX INFO: loaded from: classes4.dex */
public class C10484iv extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f37088k4;

    public C10484iv() {
        m51409um().m51917k4(EditingLanguage.ICELANDIC);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        byte[] bArr = this.f37088k4;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m50972x1() {
        return AbstractC6747ar.m26635ix().m26681x1(this.f37088k4);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37088k4 = c3134k4.m13372dy(m51409um().m51914du());
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        byte[] bArr = this.f37088k4;
        if (bArr != null) {
            c3149x1.m13450k4(bArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50971k4(String str) {
        this.f37088k4 = AbstractC6747ar.m26635ix().mo26677to(str);
    }
}
