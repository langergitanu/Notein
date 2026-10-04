package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p396sc.C10191lr;
import com.aspose.slides.internal.p396sc.C10212yd;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.qw */
/* JADX INFO: loaded from: classes.dex */
public final class C4650qw extends C4657to {

    /* JADX INFO: renamed from: k4 */
    private int f12988k4;

    /* JADX INFO: renamed from: kk */
    private int f12989kk;

    /* JADX INFO: renamed from: x1 */
    private int f12990x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4650qw.class) && m19315k4((C4650qw) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.C4657to, com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 1;
    }

    public int hashCode() {
        return (((this.f12988k4 * 397) ^ this.f12990x1) * 397) ^ this.f12989kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19316k4(int i) {
        this.f12988k4 = i;
        this.f12990x1 = i & 15;
        this.f12989kk = i << 4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19317kk(int i) {
        this.f12990x1 = i;
        this.f12988k4 = (((byte) (i << 4)) & 255) | (this.f12988k4 & 15);
    }

    public String toString() {
        return C14113y2.m67402k4("Data: {0}, Flags: {1}, Type: {2}", Integer.valueOf(this.f12988k4), C14042ak.m66410k4(C10212yd.class, this.f12990x1), C14042ak.m66410k4(C10191lr.class, this.f12989kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19318x1() {
        return this.f12988k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19315k4(C4650qw c4650qw) {
        return this.f12988k4 == c4650qw.f12988k4 && this.f12990x1 == c4650qw.f12990x1 && this.f12989kk == c4650qw.f12989kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19319x1(int i) {
        this.f12989kk = i;
        this.f12988k4 = (((byte) i) & 255) | (this.f12988k4 & 240);
    }
}
