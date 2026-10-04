package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.C4659ts;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.ak */
/* JADX INFO: loaded from: classes4.dex */
public class C6040ak extends AbstractC6059h4 {

    /* JADX INFO: renamed from: k4 */
    private long f17137k4;

    /* JADX INFO: renamed from: kk */
    private int f17138kk;

    /* JADX INFO: renamed from: to */
    private C4659ts f17139to;

    /* JADX INFO: renamed from: x1 */
    private int f17140x1;

    public C6040ak() {
        m24449x1((short) 16385);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m24402c5() {
        return this.f17140x1;
    }

    /* JADX INFO: renamed from: ck */
    public final C4659ts m24403ck() {
        return this.f17139to;
    }

    /* JADX INFO: renamed from: dy */
    public final long m24404dy() {
        return this.f17137k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m24410k4((C6040ak) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m24405fa() {
        return m24450x6() == 16385 && mo24441m9() == 28 && mo24432H_() == 16 && m24403ck() != null && m24403ck().m19363k4() == 900097;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (((((((int) m24404dy()) * 397) ^ m24402c5()) * 397) ^ m24406jd()) * 397) ^ (m24403ck() != null ? m24403ck().hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final int m24406jd() {
        return this.f17138kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24407k4(long j) {
        this.f17137k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24411kk(int i) {
        this.f17140x1 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m24413to(int i) {
        this.f17138kk = i;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("[{0}, DualMode: {1}, VideoDisplay: {2}, EmfPlusFlags: {3}, LogicalDpiX: {4}, LogicalDpiY: {5}, Version: {6}, IsValid: {7}]", super.toString(), Boolean.valueOf(m24412kk()), Boolean.valueOf(m24414to()), Long.valueOf(m24404dy()), Integer.valueOf(m24402c5()), Integer.valueOf(m24406jd()), m24403ck(), Boolean.valueOf(m24405fa()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24415x1(boolean z) {
        m24407k4(m24404dy() & 4294967294L);
        if (z) {
            m24407k4(((m24404dy() & 4294967295L) | 1) & 4294967295L);
        }
    }

    public C6040ak(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24408k4(C4659ts c4659ts) {
        this.f17139to = c4659ts;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24412kk() {
        return m24433h4(0);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m24414to() {
        return (m24404dy() & 1) > 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24409k4(boolean z) {
        m24436k4(0, z);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24410k4(C6040ak c6040ak) {
        return m24404dy() == c6040ak.m24404dy() && m24402c5() == c6040ak.m24402c5() && m24406jd() == c6040ak.m24406jd() && C14067j2.m66728k4(m24403ck(), c6040ak.m24403ck());
    }
}
