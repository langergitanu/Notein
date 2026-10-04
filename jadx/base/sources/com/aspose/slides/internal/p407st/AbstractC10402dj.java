package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.dj */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10402dj extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private byte f36930k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f36931x1;

    public AbstractC10402dj() {
        m51409um().m51917k4(61762);
        m51409um().m51916k4((byte) 0);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return this.f36931x1.length + 1;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m50675kk() {
        return this.f36931x1;
    }

    /* JADX INFO: renamed from: to */
    public abstract void mo50573to();

    /* JADX INFO: renamed from: x1 */
    public final int m50676x1() {
        return this.f36930k4 & 255;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50673k4(int i) {
        this.f36930k4 = (byte) i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36930k4 = c3134k4.m13387yj();
        this.f36931x1 = c3134k4.m13372dy(m51409um().m51914du() - 1);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13443k4(this.f36930k4);
        c3149x1.m13450k4(this.f36931x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50674k4(byte[] bArr) {
        this.f36931x1 = bArr;
    }
}
