package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.tq */
/* JADX INFO: loaded from: classes.dex */
public class C4658tq extends C4657to {

    /* JADX INFO: renamed from: k4 */
    private int f13005k4;

    /* JADX INFO: renamed from: du */
    public final C4650qw m19354du() {
        int i = this.f13005k4 >> 8;
        C4650qw c4650qw = new C4650qw();
        c4650qw.m19319x1(((i & 255) >> 4) & 15);
        c4650qw.m19317kk(i & 15);
        return c4650qw;
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
        return m19356k4((C4658tq) obj);
    }

    public int hashCode() {
        return this.f13005k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19355k4(int i) {
        this.f13005k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m19357kk() {
        return (this.f13005k4 & 1) == 1;
    }

    /* JADX INFO: renamed from: to */
    public final byte m19358to() {
        return (byte) ((this.f13005k4 & StyleIdentifier.MEDIUM_LIST_2_ACCENT_6) >> 2);
    }

    public String toString() {
        return C14113y2.m67402k4("Data: {0}, Bezier: {1}, RunCount: {2}, PointType: {3}", Integer.valueOf(this.f13005k4), Boolean.valueOf(m19357kk()), Byte.valueOf(m19358to()), m19354du());
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19359x1() {
        return this.f13005k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19356k4(C4658tq c4658tq) {
        return this.f13005k4 == c4658tq.f13005k4;
    }
}
