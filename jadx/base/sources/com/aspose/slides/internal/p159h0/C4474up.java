package com.aspose.slides.internal.p159h0;

import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.up */
/* JADX INFO: loaded from: classes.dex */
public final class C4474up implements Comparable<C4474up> {

    /* JADX INFO: renamed from: du */
    private C4474up f12308du;

    /* JADX INFO: renamed from: k4 */
    private C4463ri[] f12309k4;

    /* JADX INFO: renamed from: to */
    private double f12311to;

    /* JADX INFO: renamed from: x1 */
    private C4481wp[] f12312x1 = {null, null};

    /* JADX INFO: renamed from: kk */
    private boolean f12310kk = false;

    /* JADX INFO: renamed from: com.aspose.slides.internal.h0.up$k4 */
    public static final class k4 implements Comparator<C4474up> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final int compare(C4474up c4474up, C4474up c4474up2) {
            if (c4474up.m18386to() == c4474up2.m18386to()) {
                return 0;
            }
            return c4474up.m18386to() > c4474up2.m18386to() ? 1 : -1;
        }
    }

    public C4474up(C4463ri c4463ri, C4463ri c4463ri2) {
        this.f12309k4 = new C4463ri[]{c4463ri, c4463ri2};
        this.f12311to = m18378k4(c4463ri, c4463ri2);
    }

    /* JADX INFO: renamed from: k4 */
    private double m18378k4(C4463ri c4463ri, C4463ri c4463ri2) {
        double dM18303k4 = c4463ri2.m18303k4() - c4463ri.m18303k4();
        double dM18310x1 = c4463ri2.m18310x1() - c4463ri.m18310x1();
        return (dM18310x1 * dM18310x1) + (dM18303k4 * dM18303k4);
    }

    /* JADX INFO: renamed from: du */
    public final C4481wp m18379du() {
        if (m18388x1()[0] == null && m18388x1()[1] != null) {
            return m18388x1()[1];
        }
        if (m18388x1()[0] != null && m18388x1()[1] == null) {
            return m18388x1()[0];
        }
        if ((m18388x1()[0] != null || m18388x1()[1] != null) && m18388x1()[0] != null) {
            C4481wp c4481wp = m18388x1()[1];
        }
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public final C4474up m18380h4() {
        return this.f12308du;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m18385kk() {
        return this.f12310kk;
    }

    /* JADX INFO: renamed from: to */
    public final double m18386to() {
        return this.f12311to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18387x1(C4474up c4474up) {
        this.f12308du = c4474up;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4474up c4474up) {
        if (C4464rv.m18314k4(m18386to(), c4474up.m18386to(), 1.0E-7d)) {
            return 0;
        }
        return m18386to() > c4474up.m18386to() ? 1 : -1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4481wp[] m18388x1() {
        return this.f12312x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4481wp m18382k4(C4481wp c4481wp) {
        if (m18388x1()[0] == c4481wp) {
            return m18388x1()[1];
        }
        if (m18388x1()[1] == c4481wp) {
            return m18388x1()[0];
        }
        if (m18388x1()[0] != null) {
            return null;
        }
        C4481wp c4481wp2 = m18388x1()[1];
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18383k4(boolean z) {
        if (this.f12310kk != z) {
            C4463ri[] c4463riArrM18384k4 = m18384k4();
            if (z) {
                c4463riArrM18384k4[0].m18301du().m18485k4(this);
                m18384k4()[1].m18301du().m18485k4(this);
            } else {
                c4463riArrM18384k4[0].m18301du().m18495x1(this);
                m18384k4()[1].m18301du().m18495x1(this);
            }
            this.f12310kk = z;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C4463ri[] m18384k4() {
        return this.f12309k4;
    }
}
