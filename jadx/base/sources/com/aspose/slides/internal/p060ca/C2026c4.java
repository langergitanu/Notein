package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.c4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2026c4 extends AbstractC2167ks {

    /* JADX INFO: renamed from: du */
    private String f7038du;

    /* JADX INFO: renamed from: h4 */
    private C6765kp f7039h4;

    public C2026c4(AbstractC2167ks abstractC2167ks, byte[] bArr) {
        super(abstractC2167ks, bArr);
        this.f7515x1 = new byte[0][];
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to(" "), AbstractC6747ar.m26650yj().mo26677to("{"), AbstractC6747ar.m26650yj().mo26677to("["), AbstractC6747ar.m26650yj().mo26677to("\r"), AbstractC6747ar.m26650yj().mo26677to(IOUtils.LINE_SEPARATOR_UNIX)};
        this.f7039h4 = new C6765kp();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m10301k4() {
        return this.f7038du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7038du = null;
        this.f7039h4 = new C6765kp();
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
        this.f7038du = this.f7039h4.toString();
        m10977k4(false);
        super.mo10281z_();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        if ((this.f7514to[i] & 255) != 32) {
            this.f7039h4.m26792k4(AbstractC6747ar.m26650yj().m26681x1(new byte[]{this.f7514to[i]}));
        }
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
        iArr[0] = i;
        bArr[0] = new byte[0];
        return true;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public byte[] mo10279k4(int i, int[] iArr) {
        byte[] bArrMo10279k4 = super.mo10279k4(i, iArr);
        if (bArrMo10279k4 != null && (this.f7514to[iArr[0]] & 255) != (AbstractC6747ar.m26650yj().mo26677to(" ")[0] & 255) && (this.f7514to[iArr[0]] & 255) != (AbstractC6747ar.m26650yj().mo26677to("\r")[0] & 255) && (this.f7514to[iArr[0]] & 255) != (AbstractC6747ar.m26650yj().mo26677to(IOUtils.LINE_SEPARATOR_UNIX)[0] & 255)) {
            iArr[0] = i - 1;
        }
        return bArrMo10279k4;
    }
}
