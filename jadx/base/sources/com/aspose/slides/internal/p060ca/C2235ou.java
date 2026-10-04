package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p492x4.C12380dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ou */
/* JADX INFO: loaded from: classes3.dex */
public class C2235ou extends AbstractC2167ks {

    /* JADX INFO: renamed from: m9 */
    private static final C12380dy f7705m9 = new C12380dy("[a-zA-Z]", 0);

    /* JADX INFO: renamed from: du */
    private String f7706du;

    /* JADX INFO: renamed from: h4 */
    private C6765kp f7707h4;

    public C2235ou(AbstractC2167ks abstractC2167ks, byte[] bArr) {
        super(abstractC2167ks, bArr);
        this.f7515x1 = new byte[0][];
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to(" ")};
        this.f7707h4 = new C6765kp();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m11214k4() {
        return this.f7706du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7706du = null;
        this.f7707h4 = new C6765kp();
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
        this.f7706du = this.f7707h4.toString();
        super.mo10281z_();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        this.f7707h4.m26792k4(AbstractC6747ar.m26650yj().m26681x1(new byte[]{this.f7514to[i]}));
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
        if (!f7705m9.m57988to(AbstractC6747ar.m26650yj().m26681x1(new byte[]{this.f7514to[i]}))) {
            return super.mo10302k4(i, bArr, iArr);
        }
        iArr[0] = i;
        bArr[0] = new byte[0];
        return true;
    }
}
