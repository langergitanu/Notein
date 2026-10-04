package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p080dd.C3152yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.rr */
/* JADX INFO: loaded from: classes3.dex */
public class C2278rr extends C2236ov {

    /* JADX INFO: renamed from: k4 */
    public byte[] f7838k4;

    public C2278rr(C2092fz c2092fz, C2132iq c2132iq) {
        super(c2092fz, c2132iq);
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        super.mo10299k4(c2212n9);
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: x1 */
    public void mo10300x1(C2212n9 c2212n9) {
        super.mo10300x1(c2212n9);
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        this.f7838k4 = c2212n9.m11160k4((int) m11216ak());
    }

    public C2278rr(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) {
        if (!m11217b3()) {
            super.mo10132k4(bArr, jArr, jArr2);
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            try {
                byte[] bArr2 = this.f7838k4;
                if (bArr2 != null) {
                    c2362x4.m11657k4(bArr2);
                }
                m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
                c2362x4.dispose();
                c3152yj.dispose();
            } catch (Throwable th) {
                c2362x4.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m11349k4() {
        m11218dq();
        return this.f7838k4;
    }
}
