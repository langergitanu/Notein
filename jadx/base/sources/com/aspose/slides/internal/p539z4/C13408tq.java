package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.tq */
/* JADX INFO: loaded from: classes5.dex */
public class C13408tq extends C13407to {

    /* JADX INFO: renamed from: k4 */
    private int f44858k4;

    /* JADX INFO: renamed from: du */
    public final C13400qw m62341du() {
        int i = this.f44858k4 >> 8;
        C13400qw c13400qw = new C13400qw();
        c13400qw.m62312x1(((i & 255) >> 4) & 15);
        c13400qw.m62310kk(i & 15);
        return c13400qw;
    }

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
        return m62343k4((C13408tq) obj);
    }

    public int hashCode() {
        return this.f44858k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62342k4(int i) {
        this.f44858k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m62344kk() {
        return (this.f44858k4 & 1) == 1;
    }

    /* JADX INFO: renamed from: to */
    public final byte m62345to() {
        return (byte) ((this.f44858k4 & StyleIdentifier.MEDIUM_LIST_2_ACCENT_6) >> 2);
    }

    public String toString() {
        return C14113y2.m67402k4("Data: {0}, Bezier: {1}, RunCount: {2}, PointType: {3}", Integer.valueOf(this.f44858k4), Boolean.valueOf(m62344kk()), Byte.valueOf(m62345to()), m62341du());
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62346x1() {
        return this.f44858k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62343k4(C13408tq c13408tq) {
        return this.f44858k4 == c13408tq.f44858k4;
    }
}
