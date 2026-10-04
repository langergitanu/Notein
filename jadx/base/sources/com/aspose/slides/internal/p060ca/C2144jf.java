package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.jf */
/* JADX INFO: loaded from: classes3.dex */
public class C2144jf extends AbstractC2167ks {

    /* JADX INFO: renamed from: du */
    private double f7428du;

    /* JADX INFO: renamed from: h4 */
    private C6765kp f7429h4;

    public C2144jf(AbstractC2167ks abstractC2167ks, byte[] bArr) {
        super(abstractC2167ks, bArr);
        this.f7515x1 = new byte[0][];
        this.f7511k4 = new byte[0][];
        this.f7429h4 = new C6765kp();
    }

    /* JADX INFO: renamed from: k4 */
    public final double m10840k4() {
        return this.f7428du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7428du = -1.7976931348623157E308d;
        this.f7429h4 = new C6765kp();
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: x1 */
    public /* bridge */ /* synthetic */ void mo10280x1(int i, int[] iArr) {
        super.mo10280x1(i, iArr);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: z_ */
    public void mo10281z_() {
        this.f7428du = C2016br.m10272x1(this.f7429h4.toString());
        super.mo10281z_();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        this.f7429h4.m26792k4(AbstractC6747ar.m26650yj().m26681x1(new byte[]{this.f7514to[i]}));
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ void mo10226k4(Object obj) {
        super.mo10226k4(obj);
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

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public byte[] mo10279k4(int i, int[] iArr) {
        iArr[0] = -1;
        if (C2016br.m10271k4(this.f7514to, i)) {
            return null;
        }
        iArr[0] = i - 1;
        return new byte[0];
    }
}
