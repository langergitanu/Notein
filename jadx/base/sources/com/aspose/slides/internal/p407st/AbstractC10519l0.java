package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.l0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10519l0 extends AbstractC10571o4 implements InterfaceC10589ph {

    /* JADX INFO: renamed from: k4 */
    private byte[] f37166k4;

    /* JADX INFO: renamed from: x1 */
    private C10521l7 f37167x1;

    public AbstractC10519l0(int i) {
        m51409um().m51917k4(i);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        byte[] bArr = this.f37166k4;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10589ph
    /* JADX INFO: renamed from: to */
    public final byte[] mo51148to() {
        return this.f37166k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37166k4 = c3134k4.m13372dy(m51409um().m51914du());
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        byte[] bArr = this.f37166k4;
        if (bArr != null) {
            c3149x1.m13450k4(bArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51147k4(byte[] bArr) {
        this.f37166k4 = bArr;
        C10521l7 c10521l7 = this.f37167x1;
        if (c10521l7 != null) {
            c10521l7.m51153k4();
        }
    }
}
