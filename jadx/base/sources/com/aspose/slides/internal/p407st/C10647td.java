package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.td */
/* JADX INFO: loaded from: classes4.dex */
public class C10647td extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    protected byte[] f37396k4;

    public C10647td() {
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        byte[] bArr = this.f37396k4;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public C10647td(int i) {
        m51409um().m51917k4(i);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37396k4 = c3134k4.m13372dy(m51409um().m51914du());
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        byte[] bArr = this.f37396k4;
        if (bArr != null) {
            c3149x1.m13450k4(bArr);
        }
    }
}
