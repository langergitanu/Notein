package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.j5 */
/* JADX INFO: loaded from: classes3.dex */
class C2139j5 {

    /* JADX INFO: renamed from: du */
    private C2100gk f7400du;

    /* JADX INFO: renamed from: dy */
    private C2296ss f7401dy;

    /* JADX INFO: renamed from: h4 */
    private C1999ak f7402h4;

    /* JADX INFO: renamed from: k4 */
    private C2165kp f7403k4;

    /* JADX INFO: renamed from: kk */
    private byte f7404kk;

    /* JADX INFO: renamed from: m9 */
    private C2022bz f7405m9;

    /* JADX INFO: renamed from: to */
    private C2410zj f7406to;

    /* JADX INFO: renamed from: x1 */
    private C2286s7 f7407x1;

    public C2139j5(C2165kp c2165kp, C2286s7 c2286s7) {
        this.f7403k4 = c2165kp;
        this.f7407x1 = c2286s7;
        this.f7406to = new C2410zj(c2165kp);
        this.f7400du = new C2100gk(this, c2165kp);
        this.f7402h4 = new C1999ak(c2286s7, c2165kp);
        this.f7405m9 = new C2022bz(c2286s7, c2165kp);
        this.f7401dy = new C2296ss(c2286s7, c2165kp);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m10805k4(int i) {
        if (this.f7407x1.m11385kk().m10584k4().f7944up == 1) {
            return 0;
        }
        if (C7019kk.m27457kk(Integer.valueOf(i), 8) < 1240) {
            return 107;
        }
        if (C7019kk.m27457kk(Integer.valueOf(i), 8) < 33900) {
            return EditingLanguage.QUECHUA_BOLIVIA;
        }
        return 32768;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2286s7 m10806k4() {
        this.f7403k4.m10962kk();
        this.f7403k4.m10962kk();
        this.f7404kk = this.f7403k4.m10962kk();
        this.f7403k4.m10958h4();
        this.f7403k4.m10961k4(C7019kk.m27438h4(Byte.valueOf(this.f7404kk), 6));
        this.f7407x1.m11382k4().m11738k4().m10515x1(C7019kk.m27462to(Byte.valueOf(this.f7404kk), 6));
        this.f7406to.m11826k4(this.f7407x1.m11382k4().m11739kk());
        this.f7406to.m11826k4(this.f7407x1.m11382k4().m11741to());
        this.f7406to.m11826k4(this.f7407x1.m11382k4().m11734du());
        this.f7406to.m11826k4(this.f7407x1.m11382k4().m11736h4());
        this.f7407x1.m11383k4(new C2097gf(true));
        int[] iArr = {0};
        int[] iArr2 = {0};
        this.f7407x1.m11382k4().m11741to().m11206k4(0, iArr, iArr2);
        int i = iArr[0];
        int i2 = iArr2[0];
        this.f7400du.m10595k4(this.f7407x1.m11385kk(), this.f7407x1.m11382k4().m11741to().m11202h4(), i, i2);
        this.f7403k4.m10961k4(this.f7407x1.m11385kk().m10584k4().f7947wl);
        this.f7406to.m11826k4(this.f7407x1.m11382k4().m11740m9());
        this.f7402h4.m10152k4(this.f7407x1.m11382k4().m11733c5());
        if (!this.f7407x1.m11386m9()) {
            this.f7405m9.m10285k4(this.f7407x1.m11382k4().m11737jd());
        }
        if (this.f7407x1.m11386m9()) {
            this.f7403k4.m10961k4(this.f7407x1.m11385kk().m10584k4().f7941ts);
            this.f7406to.m11826k4(this.f7407x1.m11382k4().m11735dy());
            C2286s7 c2286s7 = this.f7407x1;
            c2286s7.m11384k4(new C2097gf[c2286s7.m11382k4().m11735dy().m11210kk()]);
            for (int i3 = 0; i3 < this.f7407x1.m11382k4().m11735dy().m11210kk(); i3++) {
                this.f7407x1.m11389x1()[i3] = new C2097gf(false);
                iArr[0] = i;
                iArr2[0] = i2;
                this.f7407x1.m11382k4().m11735dy().m11206k4(i3, iArr, iArr2);
                i = iArr[0];
                i2 = iArr2[0];
                this.f7400du.m10595k4(this.f7407x1.m11389x1()[i3], this.f7407x1.m11382k4().m11735dy().m11202h4(), i, i2);
            }
            this.f7401dy.m11426k4(this.f7407x1.m11382k4().m11742x1());
        }
        this.f7407x1.m11382k4().m11738k4().m10513k4(m10805k4(C7019kk.m27457kk(Integer.valueOf(this.f7407x1.m11382k4().m11736h4().m11210kk()), 9)));
        return this.f7407x1;
    }
}
