package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1489lr;
import com.aspose.slides.internal.p026an.C1510yd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.qw */
/* JADX INFO: loaded from: classes5.dex */
public final class C13400qw extends C13407to {

    /* JADX INFO: renamed from: k4 */
    private int f44841k4;

    /* JADX INFO: renamed from: kk */
    private int f44842kk;

    /* JADX INFO: renamed from: x1 */
    private int f44843x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13400qw.class) && m62308k4((C13400qw) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.C13407to, com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 1;
    }

    public int hashCode() {
        return (((this.f44841k4 * 397) ^ this.f44843x1) * 397) ^ this.f44842kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62309k4(int i) {
        this.f44841k4 = i;
        this.f44843x1 = i & 15;
        this.f44842kk = i << 4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62310kk(int i) {
        this.f44843x1 = i;
        this.f44841k4 = (((byte) (i << 4)) & 255) | (this.f44841k4 & 15);
    }

    public String toString() {
        return C14113y2.m67402k4("Data: {0}, Flags: {1}, Type: {2}", Integer.valueOf(this.f44841k4), C14042ak.m66410k4(C1510yd.class, this.f44843x1), C14042ak.m66410k4(C1489lr.class, this.f44842kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62311x1() {
        return this.f44841k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62308k4(C13400qw c13400qw) {
        return this.f44841k4 == c13400qw.f44841k4 && this.f44843x1 == c13400qw.f44843x1 && this.f44842kk == c13400qw.f44842kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62312x1(int i) {
        this.f44842kk = i;
        this.f44841k4 = (((byte) i) & 255) | (this.f44841k4 & 240);
    }
}
