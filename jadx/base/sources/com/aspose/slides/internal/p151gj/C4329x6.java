package com.aspose.slides.internal.p151gj;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.gj.x6 */
/* JADX INFO: loaded from: classes.dex */
public class C4329x6 extends AbstractC7020m9<C4329x6> {

    /* JADX INFO: renamed from: k4 */
    public static final C4329x6 f11825k4 = new C4329x6(0, 0);

    /* JADX INFO: renamed from: x1 */
    public static final C4329x6 f11826x1 = new C4329x6(1, 1);

    /* JADX INFO: renamed from: kk */
    public int f11827kk;

    /* JADX INFO: renamed from: to */
    public int f11828to;

    public C4329x6() {
    }

    /* JADX INFO: renamed from: kk */
    public static C4329x6 m17420kk(C4329x6 c4329x6, C4329x6 c4329x62) {
        return new C4329x6(C14116yg.m67507x1(c4329x6.f11827kk, c4329x62.f11827kk), C14116yg.m67507x1(c4329x6.f11828to, c4329x62.f11828to));
    }

    /* JADX INFO: renamed from: to */
    public static C4329x6 m17421to(C4329x6 c4329x6, C4329x6 c4329x62) {
        return new C4329x6(C14116yg.m67483k4(c4329x6.f11827kk, c4329x62.f11827kk), C14116yg.m67483k4(c4329x6.f11828to, c4329x62.f11828to));
    }

    /* JADX INFO: renamed from: x1 */
    public static C4329x6 m17422x1(C4329x6 c4329x6, C4329x6 c4329x62) {
        return new C4329x6(c4329x6.f11827kk - c4329x62.f11827kk, c4329x6.f11828to - c4329x62.f11828to);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C4329x6) {
            return m17423x1((C4329x6) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C4329x6 Clone() {
        C4329x6 c4329x6 = new C4329x6();
        CloneTo(c4329x6);
        return c4329x6;
    }

    public String toString() {
        return C14113y2.m67402k4("X:{0}, Y:{1}", Integer.valueOf(this.f11827kk), Integer.valueOf(this.f11828to));
    }

    public C4329x6(int i, int i2) {
        this.f11827kk = i;
        this.f11828to = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4329x6 m17418k4(C4329x6 c4329x6, C4329x6 c4329x62) {
        return new C4329x6(c4329x6.f11827kk + c4329x62.f11827kk, c4329x6.f11828to + c4329x62.f11828to);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m17423x1(C4329x6 c4329x6) {
        return c4329x6.f11827kk == this.f11827kk && c4329x6.f11828to == this.f11828to;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4329x6 m17419k4(C4329x6 c4329x6, C4329x6 c4329x62, C4329x6 c4329x63) {
        return m17420kk(m17421to(c4329x6.Clone(), c4329x62.Clone()).Clone(), c4329x63.Clone());
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4329x6 c4329x6) {
        c4329x6.f11827kk = this.f11827kk;
        c4329x6.f11828to = this.f11828to;
    }
}
