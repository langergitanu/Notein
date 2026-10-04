package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C2059dy extends AbstractC2281rv {

    /* JADX INFO: renamed from: du */
    private C2142jd f7111du;

    /* JADX INFO: renamed from: h4 */
    private List<Byte> f7112h4;

    public C2059dy(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(c2120hx, abstractC2281rv);
        this.f7515x1 = new byte[0][];
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("for")};
    }

    /* JADX INFO: renamed from: k4 */
    public final C2142jd m10442k4() {
        return this.f7111du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7111du = new C2142jd();
        this.f7112h4 = new List<>();
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: z_ */
    public void mo10281z_() {
        this.f7111du.m10816k4(this.f7112h4.toArray(new Byte[0]));
        this.f7111du.m10819x1(1);
        m10977k4(false);
        super.mo10281z_();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        this.f7112h4.addItem(Byte.valueOf(this.f7514to[i]));
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public boolean mo10302k4(int i, byte[][] bArr, int[] iArr) {
        iArr[0] = -1;
        bArr[0] = null;
        if (!C2016br.m10271k4(this.f7514to, i)) {
            return false;
        }
        iArr[0] = i;
        bArr[0] = new byte[0];
        return true;
    }
}
