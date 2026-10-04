package com.aspose.slides.internal.p539z4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p026an.C1469ar;
import com.aspose.slides.internal.p026an.C1487kp;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.g8 */
/* JADX INFO: loaded from: classes5.dex */
public class C13375g8 extends AbstractC13365c6 {

    /* JADX INFO: renamed from: du */
    private int f44745du;

    /* JADX INFO: renamed from: k4 */
    private int f44746k4;

    /* JADX INFO: renamed from: kk */
    private C13387k4 f44747kk;

    /* JADX INFO: renamed from: to */
    private int f44748to;

    /* JADX INFO: renamed from: x1 */
    private long f44749x1;

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
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
        return m62101k4((C13375g8) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 24;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ this.f44746k4) * 397) ^ ((int) this.f44749x1)) * 397;
        C13387k4 c13387k4 = this.f44747kk;
        return ((((iHashCode ^ (c13387k4 != null ? c13387k4.hashCode() : 0)) * 397) ^ this.f44748to) * 397) ^ this.f44745du;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m62097k4() {
        return this.f44749x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C3976c5 m62102kk() {
        C3976c5 c3976c5 = new C3976c5();
        c3976c5.m15664k4((int) m62097k4(), m62104x1().m62172du().Clone());
        return c3976c5;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public String toString() {
        return C14113y2.m67402k4("{0}, WrapMode: {1}, ClampColor: {2}, ObjectClamp: {3}", super.toString(), C14042ak.m66410k4(C1487kp.class, this.f44749x1), this.f44747kk, C14042ak.m66410k4(C1469ar.class, this.f44748to));
    }

    /* JADX INFO: renamed from: x1 */
    public final C13387k4 m62104x1() {
        return this.f44747kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62098k4(int i) {
        this.f44746k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62103kk(int i) {
        if (i != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f44745du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62105x1(int i) {
        this.f44748to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62099k4(long j) {
        this.f44749x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62100k4(C13387k4 c13387k4) {
        this.f44747kk = c13387k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62101k4(C13375g8 c13375g8) {
        return m62059k4((AbstractC13365c6) c13375g8) && this.f44746k4 == c13375g8.f44746k4 && this.f44749x1 == c13375g8.f44749x1 && C14067j2.m66728k4(this.f44747kk, c13375g8.f44747kk) && this.f44748to == c13375g8.f44748to && this.f44745du == c13375g8.f44745du;
    }
}
