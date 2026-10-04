package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p525yi.C12836u4;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.qm */
/* JADX INFO: loaded from: classes.dex */
public class C4741qm extends AbstractC4703bz {

    /* JADX INFO: renamed from: h4 */
    private C12836u4 f13243h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC4778yw f13244k4;

    /* JADX INFO: renamed from: m9 */
    private boolean f13245m9;

    public C4741qm() {
        m19714k4(C4780zm.class.getName(), null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m19714k4(String str, byte[] bArr) {
        AbstractC4778yw abstractC4778ywM19837k4 = AbstractC4778yw.m19837k4(str);
        this.f13244k4 = abstractC4778ywM19837k4;
        abstractC4778ywM19837k4.m19691to(3);
        if (bArr != null) {
            this.f13244k4.mo19688kk(bArr);
        }
        this.f13126kk = this.f13244k4.m19683dy();
        mo19577k4(this.f13244k4.mo19693to());
        this.f13243h4 = new C12836u4(this.f13244k4);
        this.f13245m9 = false;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        if (this.f13245m9) {
            throw new ObjectDisposedException("MACTripleDES");
        }
        this.f13127to = 0;
        this.f13243h4.m59680k4(this.f13124du);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        if (this.f13245m9) {
            throw new ObjectDisposedException("MACTripleDES");
        }
        this.f13127to = 0;
        return this.f13243h4.m59682k4();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        if (this.f13245m9) {
            throw new ObjectDisposedException("MACTripleDES");
        }
        if (this.f13127to == 0) {
            mo18846c5();
            this.f13127to = 1;
        }
        this.f13243h4.m59681k4(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4703bz, com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: k4 */
    public void mo19576k4(boolean z) {
        if (this.f13245m9) {
            return;
        }
        byte[] bArr = this.f13124du;
        if (bArr != null) {
            AbstractC14092to.m67225k4(bArr, 0, bArr.length);
        }
        AbstractC4778yw abstractC4778yw = this.f13244k4;
        if (abstractC4778yw != null) {
            abstractC4778yw.m19690m9();
        }
        if (z) {
            this.f13124du = null;
            this.f13244k4 = null;
        }
        super.mo19576k4(z);
        this.f13245m9 = true;
    }
}
