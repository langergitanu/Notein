package com.aspose.slides.internal.p174hz;

import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4733m2 implements InterfaceC4752ts, IDisposable {

    /* JADX INFO: renamed from: k4 */
    private C4725j5 f13202k4;

    /* JADX INFO: renamed from: x1 */
    private int f13203x1;

    public C4733m2(AbstractC4771y2 abstractC4771y2, boolean z, byte[] bArr, byte[] bArr2) {
        this.f13202k4 = new C4725j5(abstractC4771y2, z, bArr, bArr2);
        this.f13203x1 = abstractC4771y2.m19683dy();
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public boolean ap_() {
        return this.f13202k4.ap_();
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public int aq_() {
        return this.f13202k4.aq_();
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public int ar_() {
        return this.f13202k4.ar_();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f13202k4.m19651du();
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public int mo19562k4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.f13202k4.mo19562k4(bArr, i, i2, bArr2, i3);
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: kk */
    public boolean mo19566kk() {
        return this.f13202k4.mo19566kk();
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19564k4(byte[] bArr, int i, int i2) {
        return this.f13202k4.mo19564k4(bArr, i, i2);
    }
}
