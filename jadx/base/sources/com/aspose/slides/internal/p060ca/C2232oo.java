package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3152yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.oo */
/* JADX INFO: loaded from: classes3.dex */
public class C2232oo extends C2236ov {

    /* JADX INFO: renamed from: k4 */
    private k4 f7695k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.oo$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private List<Long> f7696k4;

        public k4(int i) {
            this.f7696k4 = new List<>(i);
        }

        /* JADX INFO: renamed from: k4 */
        public final int m11196k4() {
            return this.f7696k4.size();
        }

        /* JADX INFO: renamed from: x1 */
        public final void m11200x1(int i) {
            this.f7696k4.addItem(Long.valueOf(((long) i) & 4294967295L));
        }

        /* JADX INFO: renamed from: k4 */
        public final long m11197k4(int i) {
            return this.f7696k4.get_Item(i).longValue();
        }

        /* JADX INFO: renamed from: k4 */
        public final void m11198k4(int i, long j) {
            this.f7696k4.set_Item(i, Long.valueOf(j));
        }

        /* JADX INFO: renamed from: k4 */
        public final void m11199k4(long j) {
            this.f7696k4.addItem(Long.valueOf(j));
        }
    }

    public C2232oo(C2092fz c2092fz, C2132iq c2132iq) {
        super(c2092fz, c2132iq);
    }

    /* JADX INFO: renamed from: k4 */
    public k4 mo11195k4() {
        m11218dq();
        return this.f7695k4;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: x1 */
    public void mo10300x1(C2212n9 c2212n9) {
        super.mo10300x1(c2212n9);
        if (m11217b3()) {
            this.f7695k4 = new k4(1);
            return;
        }
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        int iM11521k4 = m11221lr().m10547du().m11521k4() & 65535;
        short sM11004jd = m11221lr().m10572kk().m11004jd();
        int i = iM11521k4 + 1;
        this.f7695k4 = new k4(i);
        int i2 = 0;
        if (sM11004jd == 0) {
            while (i2 < i) {
                this.f7695k4.m11199k4(((long) ((c2212n9.m11151fa() & 65535) * 2)) & 4294967295L);
                i2++;
            }
        } else {
            while (i2 < i) {
                this.f7695k4.m11199k4(c2212n9.m11164up());
                i2++;
            }
        }
    }

    public C2232oo(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        super.mo10299k4(c2212n9);
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) throws Throwable {
        if (!m11217b3()) {
            super.mo10132k4(bArr, jArr, jArr2);
        }
        C3152yj c3152yj = new C3152yj();
        C2362x4 c2362x4 = new C2362x4(c3152yj, true);
        for (int i = 0; i < mo11195k4().m11196k4(); i++) {
            try {
                short sM11004jd = m11221lr().m10572kk().m11004jd();
                if (sM11004jd == 0) {
                    c2362x4.m11651k4((short) ((mo11195k4().m11197k4(i) & 4294967295L) / 2));
                } else if (sM11004jd == 1) {
                    c2362x4.m11662x1((int) mo11195k4().m11197k4(i));
                }
            } catch (Throwable th) {
                c2362x4.dispose();
                throw th;
            }
        }
        m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
        c2362x4.dispose();
    }
}
