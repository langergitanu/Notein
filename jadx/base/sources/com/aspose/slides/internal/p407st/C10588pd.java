package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.huawei.hms.network.embedded.C18163eb;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.pd */
/* JADX INFO: loaded from: classes4.dex */
public class C10588pd extends AbstractC10571o4 {

    /* JADX INFO: renamed from: du */
    private byte[] f37285du;

    /* JADX INFO: renamed from: h4 */
    private int f37286h4;

    /* JADX INFO: renamed from: k4 */
    private long f37287k4;

    /* JADX INFO: renamed from: kk */
    private short f37288kk;

    /* JADX INFO: renamed from: to */
    private short f37289to;

    /* JADX INFO: renamed from: x1 */
    private int f37290x1;

    public C10588pd() {
        m51409um().m51917k4(1025);
        m51409um().m51916k4((byte) 1);
        this.f37287k4 = C18163eb.f54662y;
        this.f37290x1 = Integer.MAX_VALUE;
        this.f37288kk = (short) 0;
        this.f37289to = (short) 0;
        this.f37286h4 = 1;
        this.f37285du = new byte[64];
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 80;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37287k4 = c3134k4.m13384uz();
        this.f37290x1 = c3134k4.m13386x6();
        this.f37288kk = c3134k4.m13381rv();
        this.f37289to = c3134k4.m13381rv();
        this.f37285du = c3134k4.m13372dy(64);
        this.f37286h4 = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37287k4 & 4294967295L);
        c3149x1.m13455x1(this.f37290x1);
        c3149x1.m13448k4(this.f37288kk);
        c3149x1.m13448k4(this.f37289to);
        byte[] bArr = new byte[64];
        System.arraycopy(this.f37285du, 0, bArr, 0, 64);
        c3149x1.m13450k4(bArr);
        c3149x1.m13455x1(this.f37286h4);
    }
}
