package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2018bu extends AbstractC2167ks {

    /* JADX INFO: renamed from: du */
    private String f7022du;

    /* JADX INFO: renamed from: h4 */
    private C6765kp f7023h4;

    /* JADX INFO: renamed from: m9 */
    private int f7024m9;

    public C2018bu(AbstractC2167ks abstractC2167ks, byte[] bArr) {
        super(abstractC2167ks, bArr);
        m10979kk(true);
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("[")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("]")};
        this.f7023h4 = new C6765kp();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m10278k4() {
        return this.f7022du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7022du = null;
        this.f7023h4 = new C6765kp();
        this.f7024m9 = 0;
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
        this.f7022du = this.f7023h4.toString();
        super.mo10281z_();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        int i2;
        byte b = this.f7514to[i];
        if ((b & 255) != 91) {
            if ((b & 255) == 93) {
                i2 = this.f7024m9 - 1;
            }
            this.f7023h4.m26792k4(AbstractC6747ar.m26650yj().m26681x1(new byte[]{this.f7514to[i]}));
            super.mo10225k4(i);
        }
        i2 = this.f7024m9 + 1;
        this.f7024m9 = i2;
        this.f7023h4.m26792k4(AbstractC6747ar.m26650yj().m26681x1(new byte[]{this.f7514to[i]}));
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ void mo10226k4(Object obj) {
        super.mo10226k4(obj);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public byte[] mo10279k4(int i, int[] iArr) {
        iArr[0] = -1;
        byte[] bArrMo26677to = AbstractC6747ar.m26650yj().mo26677to("]");
        if (!C2266qq.m11311k4(this.f7514to, i, bArrMo26677to) || this.f7024m9 != 0) {
            return null;
        }
        iArr[0] = i;
        return bArrMo26677to;
    }
}
