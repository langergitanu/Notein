package com.aspose.slides.internal.p159h0;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.wp */
/* JADX INFO: loaded from: classes.dex */
public final class C4481wp {

    /* JADX INFO: renamed from: k4 */
    private C4463ri[] f12321k4 = new C4463ri[3];

    /* JADX INFO: renamed from: kk */
    private C4435c5 f12322kk;

    /* JADX INFO: renamed from: to */
    private int f12323to;

    /* JADX INFO: renamed from: x1 */
    private C4474up[] f12324x1;

    public C4481wp(C4463ri c4463ri, C4463ri c4463ri2, C4463ri c4463ri3, C4474up c4474up, C4474up c4474up2, C4474up c4474up3) {
        if (((c4463ri2.m18310x1() - c4463ri3.m18310x1()) * (c4463ri.m18303k4() - c4463ri3.m18303k4())) - ((c4463ri.m18310x1() - c4463ri3.m18310x1()) * (c4463ri2.m18303k4() - c4463ri3.m18303k4())) < 0.0d) {
            m18427k4()[0] = c4463ri;
            m18427k4()[1] = c4463ri2;
            m18427k4()[2] = c4463ri3;
        } else {
            m18427k4()[0] = c4463ri;
            m18427k4()[1] = c4463ri3;
            m18427k4()[2] = c4463ri2;
        }
        for (int i = 0; i < 3; i++) {
            m18427k4()[i].m18309to().m18323k4(this);
        }
        this.f12324x1 = new C4474up[3];
        m18432x1()[0] = c4474up;
        m18432x1()[1] = c4474up2;
        m18432x1()[2] = c4474up3;
        for (int i2 = 0; i2 < 3; i2++) {
            if (m18432x1()[i2].m18388x1()[0] == null) {
                m18432x1()[i2].m18388x1()[0] = this;
            } else if (m18432x1()[i2].m18388x1()[1] == null) {
                m18432x1()[i2].m18388x1()[1] = this;
            }
        }
        for (int i3 = 1; i3 < 3 && ((m18427k4()[0] != m18432x1()[0].m18384k4()[0] || m18427k4()[1] != m18432x1()[0].m18384k4()[1]) && (m18427k4()[0] != m18432x1()[0].m18384k4()[1] || m18427k4()[1] != m18432x1()[0].m18384k4()[0])); i3++) {
            C4474up c4474up4 = m18432x1()[0];
            m18432x1()[0] = m18432x1()[i3];
            m18432x1()[i3] = c4474up4;
        }
        if ((m18427k4()[1] != m18432x1()[1].m18384k4()[0] || m18427k4()[2] != m18432x1()[1].m18384k4()[1]) && (m18427k4()[1] != m18432x1()[1].m18384k4()[1] || m18427k4()[2] != m18432x1()[1].m18384k4()[0])) {
            C4474up c4474up5 = m18432x1()[1];
            m18432x1()[1] = m18432x1()[2];
            m18432x1()[2] = c4474up5;
        }
        this.f12322kk = null;
        m18426k4(-1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4463ri m18423k4(C4474up c4474up) {
        int i = 0;
        while (i < 3 && m18432x1()[i] != c4474up) {
            i++;
        }
        return m18427k4()[(i + 2) % 3];
    }

    /* JADX INFO: renamed from: kk */
    public final int m18428kk() {
        return this.f12323to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m18430x1(C4474up c4474up) {
        int i = 0;
        while (i < 3 && m18432x1()[i] != c4474up) {
            i++;
        }
        return (i + 2) % 3;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4474up m18424k4(C4463ri c4463ri) {
        int i = 0;
        while (i < 3 && m18427k4()[i] != c4463ri) {
            i++;
        }
        return m18432x1()[(i + 1) % 3];
    }

    /* JADX INFO: renamed from: kk */
    public final C4474up m18429kk(C4474up c4474up) {
        int i = 0;
        while (i < 3 && m18432x1()[i] != c4474up) {
            i++;
        }
        return m18432x1()[(i + 1) % 3];
    }

    /* JADX INFO: renamed from: x1 */
    public final C4463ri m18431x1(int i) {
        return m18427k4()[(i + 2) % 3];
    }

    /* JADX INFO: renamed from: k4 */
    public final C4474up m18425k4(C4463ri c4463ri, C4463ri c4463ri2) {
        if (m18427k4()[0] != c4463ri && m18427k4()[0] != c4463ri2) {
            if ((m18427k4()[1] == c4463ri && m18427k4()[2] == c4463ri2) || (m18427k4()[2] == c4463ri && m18427k4()[1] == c4463ri2)) {
                return m18432x1()[1];
            }
            return null;
        }
        if (m18427k4()[1] != c4463ri && m18427k4()[1] != c4463ri2) {
            if ((m18427k4()[0] == c4463ri && m18427k4()[2] == c4463ri2) || (m18427k4()[2] == c4463ri && m18427k4()[0] == c4463ri2)) {
                return m18432x1()[2];
            }
            return null;
        }
        if (m18427k4()[2] == c4463ri || m18427k4()[2] == c4463ri2) {
            return null;
        }
        if ((m18427k4()[1] == c4463ri && m18427k4()[0] == c4463ri2) || (m18427k4()[0] == c4463ri && m18427k4()[1] == c4463ri2)) {
            return m18432x1()[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4474up[] m18432x1() {
        return this.f12324x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18426k4(int i) {
        this.f12323to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4463ri[] m18427k4() {
        return this.f12321k4;
    }
}
