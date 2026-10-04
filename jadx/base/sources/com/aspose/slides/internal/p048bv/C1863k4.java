package com.aspose.slides.internal.p048bv;

import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.bv.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1863k4 implements InterfaceC1858du {

    /* JADX INFO: renamed from: k4 */
    private int f6721k4;

    /* JADX INFO: renamed from: kk */
    private int f6722kk;

    /* JADX INFO: renamed from: to */
    private int f6723to;

    /* JADX INFO: renamed from: x1 */
    private char[] f6724x1;

    private C1863k4(int i) {
        this.f6722kk = 0;
        this.f6721k4 = i;
        this.f6723to = i;
        this.f6724x1 = new char[i];
        this.f6722kk = 0;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m9734c5() {
        int iM9738h4 = m9738h4();
        char[] cArr = new char[iM9738h4];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f6724x1), m9740k4(), AbstractC14092to.m67208k4((Object) cArr), 0, iM9738h4);
        this.f6722kk--;
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) cArr), 0, AbstractC14092to.m67208k4((Object) this.f6724x1), m9740k4(), iM9738h4);
        this.f6723to--;
        this.f6721k4--;
    }

    /* JADX INFO: renamed from: du */
    public final void m9735du() {
        this.f6722kk--;
    }

    /* JADX INFO: renamed from: dy */
    public final int m9737dy() {
        return this.f6723to;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m9738h4() {
        return this.f6723to - m9740k4();
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m9739jd() {
        return m9738h4() > 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m9740k4() {
        return this.f6722kk;
    }

    /* JADX INFO: renamed from: kk */
    public final char m9746kk(int i) {
        this.f6722kk = i;
        return m9748to();
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1858du
    /* JADX INFO: renamed from: m9 */
    public final int mo9715m9() {
        return m9738h4();
    }

    /* JADX INFO: renamed from: to */
    public final char m9748to() {
        char[] cArr = this.f6724x1;
        int i = this.f6722kk;
        this.f6722kk = i + 1;
        return cArr[i];
    }

    /* JADX INFO: renamed from: x1 */
    public final int m9749x1() {
        return this.f6721k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C1863k4 m9733k4(int i) {
        return new C1863k4(i);
    }

    /* JADX INFO: renamed from: du */
    public final void m9736du(int i) {
        this.f6723to = i;
        if (this.f6722kk > i) {
            this.f6722kk = i;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m9747kk() {
        this.f6722kk = 0;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1858du
    /* JADX INFO: renamed from: to */
    public final char mo9716to(int i) {
        int i2 = this.f6722kk + i;
        this.f6722kk = i2;
        return this.f6724x1[i2];
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9750x1(int i) {
        this.f6722kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C1863k4 m9741k4(int i, int i2) {
        C1863k4 c1863k4 = new C1863k4(this.f6721k4);
        c1863k4.f6724x1 = this.f6724x1;
        c1863k4.f6722kk = m9740k4() + i;
        c1863k4.f6723to = m9740k4() + i2;
        return c1863k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9742k4(char c) {
        char[] cArr = this.f6724x1;
        int i = this.f6722kk;
        this.f6722kk = i + 1;
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9743k4(int i, char c) {
        this.f6722kk = i;
        m9742k4(c);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9744k4(C1863k4 c1863k4) {
        int iM9738h4 = c1863k4.m9738h4();
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c1863k4.f6724x1), c1863k4.f6722kk, AbstractC14092to.m67208k4((Object) this.f6724x1), this.f6722kk, iM9738h4);
        c1863k4.f6722kk = c1863k4.f6723to - 1;
        this.f6722kk += iM9738h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9745k4(char[] cArr, int i, int i2) {
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) cArr), i, AbstractC14092to.m67208k4((Object) this.f6724x1), this.f6722kk, i2);
        this.f6722kk += i2;
    }
}
