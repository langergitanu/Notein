package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p539z4.C13409ts;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.ak */
/* JADX INFO: loaded from: classes4.dex */
public class C10983ak extends AbstractC11002h4 {

    /* JADX INFO: renamed from: k4 */
    private long f38286k4;

    /* JADX INFO: renamed from: kk */
    private int f38287kk;

    /* JADX INFO: renamed from: to */
    private C13409ts f38288to;

    /* JADX INFO: renamed from: x1 */
    private int f38289x1;

    public C10983ak() {
        m53208x1((short) 16385);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m53171c5() {
        return this.f38287kk;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m53172ck() {
        return m53206rv() == 16385 && mo53197h4() == 28 && av_() == 16 && m53174jd() != null && m53174jd().m62350k4() == 900097;
    }

    /* JADX INFO: renamed from: dy */
    public final int m53173dy() {
        return this.f38289x1;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
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
        return m53177k4((C10983ak) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (((((((int) m53180m9()) * 397) ^ m53173dy()) * 397) ^ m53171c5()) * 397) ^ (m53174jd() != null ? m53174jd().hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C13409ts m53174jd() {
        return this.f38288to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53175k4(long j) {
        this.f38286k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53178kk(int i) {
        this.f38289x1 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m53180m9() {
        return this.f38286k4;
    }

    /* JADX INFO: renamed from: to */
    public final void m53181to(int i) {
        this.f38287kk = i;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("[{0}, DualMode: {1}, VideoDisplay: {2}, EmfPlusFlags: {3}, LogicalDpiX: {4}, LogicalDpiY: {5}, Version: {6}, IsValid: {7}]", super.toString(), Boolean.valueOf(m53179kk()), Boolean.valueOf(m53182to()), Long.valueOf(m53180m9()), Integer.valueOf(m53173dy()), Integer.valueOf(m53171c5()), m53174jd(), Boolean.valueOf(m53172ck()));
    }

    public C10983ak(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53176k4(C13409ts c13409ts) {
        this.f38288to = c13409ts;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53179kk() {
        return m53198h4(0);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m53182to() {
        return (m53180m9() & 1) > 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53177k4(C10983ak c10983ak) {
        return m53180m9() == c10983ak.m53180m9() && m53173dy() == c10983ak.m53173dy() && m53171c5() == c10983ak.m53171c5() && C14067j2.m66728k4(m53174jd(), c10983ak.m53174jd());
    }
}
