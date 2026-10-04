package com.aspose.slides.internal.p019ac;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.ar */
/* JADX INFO: loaded from: classes3.dex */
public class C1336ar extends AbstractC1349ne {

    /* JADX INFO: renamed from: k4 */
    private long f5777k4;

    /* JADX INFO: renamed from: x1 */
    private long f5778x1;

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
        return m7822k4((C1336ar) obj);
    }

    public int hashCode() {
        return (((int) this.f5777k4) * 397) ^ ((int) this.f5778x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7821k4(long j) {
        this.f5777k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7823x1(long j) {
        this.f5778x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7822k4(C1336ar c1336ar) {
        return this.f5777k4 == c1336ar.f5777k4 && this.f5778x1 == c1336ar.f5778x1;
    }
}
