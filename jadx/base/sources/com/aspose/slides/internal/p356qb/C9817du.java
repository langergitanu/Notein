package com.aspose.slides.internal.p356qb;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.du */
/* JADX INFO: loaded from: classes4.dex */
class C9817du implements InterfaceC9821jd {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f35563k4;

    /* JADX INFO: renamed from: x1 */
    private C9828x1 f35566x1 = null;

    /* JADX INFO: renamed from: kk */
    private List<C9827up> f35564kk = null;

    /* JADX INFO: renamed from: to */
    private C9819fa f35565to = null;

    /* JADX INFO: renamed from: du */
    private C9829yj f35562du = null;

    public C9817du(AbstractC3150x6 abstractC3150x6) {
        this.f35563k4 = abstractC3150x6;
        m48365kk();
    }

    /* JADX INFO: renamed from: du */
    private C9828x1 m48363du() {
        C9828x1 c9828x1 = new C9828x1(this.f35563k4);
        this.f35566x1 = c9828x1;
        return c9828x1;
    }

    /* JADX INFO: renamed from: h4 */
    private void m48364h4() {
        C9819fa c9819fa = new C9819fa((int) this.f35566x1.m48450dy(), this.f35566x1.m48452k4());
        this.f35565to = c9819fa;
        c9819fa.m48396k4(this.f35563k4);
    }

    /* JADX INFO: renamed from: kk */
    private void m48365kk() {
        m48363du();
        m48364h4();
        m48366m9();
        if (this.f35566x1.m48448c5() != 4294967294L) {
            this.f35565to.m48397k4(this, this.f35566x1.m48448c5() & 4294967295L);
        }
        m48367to();
    }

    /* JADX INFO: renamed from: m9 */
    private void m48366m9() {
        int iM48452k4 = this.f35566x1.m48452k4();
        this.f35564kk = new List<>();
        C3134k4 c3134k4 = new C3134k4(this.f35563k4);
        boolean z = false;
        while (!z) {
            byte[] bArrM13372dy = c3134k4.m13372dy(iM48452k4);
            if (bArrM13372dy.length < iM48452k4) {
                if (bArrM13372dy.length > 0) {
                    byte[] bArr = new byte[iM48452k4];
                    System.arraycopy(bArrM13372dy, 0, bArr, 0, bArrM13372dy.length);
                    bArrM13372dy = bArr;
                } else {
                    bArrM13372dy = new byte[iM48452k4];
                    z = true;
                }
            }
            this.f35564kk.addItem(new C9827up(bArrM13372dy));
        }
    }

    /* JADX INFO: renamed from: to */
    private void m48367to() {
        C9829yj c9829yj = new C9829yj(this.f35566x1.m48452k4());
        this.f35562du = c9829yj;
        c9829yj.m48472k4(this.f35565to, this);
    }

    @Override // com.aspose.slides.internal.p356qb.InterfaceC9821jd
    /* JADX INFO: renamed from: k4 */
    public final C9827up mo48368k4(int i) {
        if (i < this.f35564kk.size() - 1) {
            return this.f35564kk.get_Item(i);
        }
        if (this.f35562du == null || this.f35563k4.getLength() / ((long) this.f35562du.m48474to()) >= this.f35564kk.size()) {
            return null;
        }
        throw new C9823kk("Chain of sectors corrupted!");
    }

    @Override // com.aspose.slides.internal.p356qb.InterfaceC9821jd
    /* JADX INFO: renamed from: x1 */
    public final C9829yj mo48370x1() {
        return this.f35562du;
    }

    @Override // com.aspose.slides.internal.p356qb.InterfaceC9821jd
    /* JADX INFO: renamed from: k4 */
    public final C9828x1 mo48369k4() {
        return this.f35566x1;
    }
}
