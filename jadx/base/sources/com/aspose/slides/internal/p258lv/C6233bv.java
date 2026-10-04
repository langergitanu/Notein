package com.aspose.slides.internal.p258lv;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C6233bv extends C6257wy {

    /* JADX INFO: renamed from: k4 */
    private int f17662k4;

    /* JADX INFO: renamed from: x1 */
    private int f17663x1;

    public C6233bv(C6258x1 c6258x1) {
        super(c6258x1);
    }

    /* JADX INFO: renamed from: du */
    public final int m25238du() {
        return this.f17663x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25239k4() {
        m25384h4().m25289k4(false, false);
        m25384h4().m25294x1(0, 5, true);
    }

    /* JADX INFO: renamed from: kk */
    public final void m25242kk() {
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(true, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25294x1(1, 1, false);
    }

    /* JADX INFO: renamed from: to */
    public final int m25243to() {
        return this.f17662k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25244x1() {
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(true, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25294x1(1, 1, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25240k4(int i, int i2) {
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(true, false);
        int iM25275k4 = C6242k4.m25275k4(new int[]{i, i2});
        m25384h4().m25294x1(iM25275k4, 5, false);
        m25384h4().m25285k4(i, iM25275k4, false);
        m25384h4().m25285k4(i2, iM25275k4, false);
        this.f17662k4 = i;
        this.f17663x1 = i2;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25245x1(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        m25384h4().m25289k4(true, false);
        m25384h4().m25289k4(true, false);
        int iM25275k4 = C6242k4.m25275k4(new int[]{i, i2});
        m25384h4().m25294x1(iM25275k4 - 2, 4, false);
        boolean z = (i == 0 || i2 == 0) ? false : true;
        boolean z2 = i == 0;
        m25384h4().m25289k4(z, false);
        if (!z) {
            m25384h4().m25289k4(z2, false);
        }
        if (i != 0) {
            m25384h4().m25285k4(i, iM25275k4, false);
        }
        if (i2 != 0) {
            m25384h4().m25285k4(i2, iM25275k4, false);
        }
        this.f17662k4 += i;
        this.f17663x1 += i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25241k4(int i, int i2, int i3, int i4) {
        m25384h4().m25289k4(true, false);
        m25384h4().m25289k4(false, false);
        int iM25275k4 = C6242k4.m25275k4(new int[]{i, i2, i3, i4});
        m25384h4().m25294x1(iM25275k4 - 2, 4, false);
        m25384h4().m25285k4(i, iM25275k4, false);
        m25384h4().m25285k4(i2, iM25275k4, false);
        m25384h4().m25285k4(i3, iM25275k4, false);
        m25384h4().m25285k4(i4, iM25275k4, false);
        this.f17662k4 = i + i3 + this.f17662k4;
        this.f17663x1 = i2 + i4 + this.f17663x1;
    }
}
