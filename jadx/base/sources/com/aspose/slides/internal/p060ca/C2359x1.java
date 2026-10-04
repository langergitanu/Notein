package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C2359x1 extends AbstractC2281rv {

    /* JADX INFO: renamed from: du */
    private String f8202du;

    /* JADX INFO: renamed from: h4 */
    private C6765kp f8203h4;

    public C2359x1(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(c2120hx, abstractC2281rv);
        m10982to(true);
        this.f7515x1 = new byte[0][];
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to(IOUtils.LINE_SEPARATOR_WINDOWS), AbstractC6747ar.m26650yj().mo26677to("\r"), AbstractC6747ar.m26650yj().mo26677to(IOUtils.LINE_SEPARATOR_UNIX)};
        this.f8203h4 = new C6765kp();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m11643k4() {
        return this.f8202du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f8202du = null;
        this.f8203h4 = new C6765kp();
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: z_ */
    public void mo10281z_() {
        this.f8202du = this.f8203h4.toString();
        super.mo10281z_();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        this.f8203h4.m26792k4(AbstractC6747ar.m26650yj().m26681x1(new byte[]{this.f7514to[i]}));
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public boolean mo10302k4(int i, byte[][] bArr, int[] iArr) {
        iArr[0] = i;
        bArr[0] = new byte[0];
        return true;
    }
}
