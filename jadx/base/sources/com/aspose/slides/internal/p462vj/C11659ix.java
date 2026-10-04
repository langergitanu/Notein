package com.aspose.slides.internal.p462vj;

import com.aspose.slides.C22208OooOo0;
import com.aspose.slides.Collections.Generic.OooO00o;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.InterfaceC3520ix;
import com.aspose.slides.internal.p150gi.C4264bz;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C11659ix {

    /* JADX INFO: renamed from: h4 */
    private boolean f39343h4;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC3520ix f39344k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC1981h4 f39347x1;

    /* JADX INFO: renamed from: kk */
    private C12023wl f39345kk = new C12023wl();

    /* JADX INFO: renamed from: to */
    private C12007ix f39346to = new C12007ix();

    /* JADX INFO: renamed from: du */
    private C12023wl f39342du = new C12023wl(-1, -1);

    public C11659ix(InterfaceC3520ix interfaceC3520ix, InterfaceC1981h4 interfaceC1981h4, C12023wl c12023wl) {
        this.f39344k4 = interfaceC3520ix;
        this.f39347x1 = interfaceC1981h4;
        c12023wl.CloneTo(this.f39345kk);
        m54873k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54872k4(int i, int i2) {
        int iMo14257jd = this.f39344k4.mo14257jd();
        if (iMo14257jd == 23) {
            return (i - i2) / 2;
        }
        if (iMo14257jd != 39) {
            return 0;
        }
        return i - i2;
    }

    /* JADX INFO: renamed from: kk */
    public final C12023wl m54874kk() {
        return this.f39342du;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m54875to() {
        return this.f39343h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m54876x1(int i, int i2) {
        int iMo14255c5 = this.f39344k4.mo14255c5();
        if (iMo14255c5 == 3) {
            return i - i2;
        }
        if (iMo14255c5 != 23) {
            return 0;
        }
        return (i - i2) / 2;
    }

    /* JADX INFO: renamed from: k4 */
    private int m54869k4(int i, C4264bz c4264bz, InterfaceC1984kk interfaceC1984kk) {
        int iMo9886x1;
        int iMo9886x12;
        boolean z = interfaceC1984kk.m10115du() != 187;
        boolean z2 = interfaceC1984kk.m10115du() != 188;
        InterfaceC1984kk interfaceC1984kkMo9877dy = c4264bz.m17131kk(this.f39347x1).mo9877dy();
        if (interfaceC1984kkMo9877dy.m10115du() != 9 && (iMo9886x12 = interfaceC1984kkMo9877dy.mo9886x1(this.f39347x1)) != -1 && z2) {
            i = C14116yg.m67507x1(i, iMo9886x12);
        }
        InterfaceC1984kk interfaceC1984kkMo9877dy2 = c4264bz.m17134x1(this.f39347x1).mo9877dy();
        return (interfaceC1984kkMo9877dy2.m10115du() == 9 || (iMo9886x1 = interfaceC1984kkMo9877dy2.mo9886x1(this.f39347x1)) == -1 || !z) ? i : C14116yg.m67483k4(i, iMo9886x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C12007ix m54877x1() {
        return this.f39346to;
    }

    /* JADX INFO: renamed from: k4 */
    private C12023wl m54870k4(int i, int i2, C12023wl c12023wl) {
        C12023wl c12023wl2 = new C12023wl(i, i2);
        if (this.f39344k4.mo14256du() == 154 || i == -1 || i2 == -1) {
            if (i == -1 && i2 == -1) {
                c12023wl2.m56860k4(c12023wl.m56865x1());
                c12023wl2.m56866x1(c12023wl.m56862kk());
                return c12023wl2;
            }
            if (i == -1) {
                if (c12023wl.m56862kk() == 0) {
                    c12023wl2.m56860k4(0);
                    return c12023wl2;
                }
                c12023wl2.m56860k4(C22208OooOo0.OooO00o(((double) c12023wl.m56865x1()) * ((double) i2), c12023wl.m56862kk(), 14));
                return c12023wl2;
            }
            if (i2 == -1) {
                if (c12023wl.m56865x1() == 0) {
                    c12023wl2.m56866x1(0);
                    return c12023wl2;
                }
                c12023wl2.m56866x1(C22208OooOo0.OooO00o(((double) c12023wl.m56862kk()) * ((double) i), c12023wl.m56865x1(), 14));
                return c12023wl2;
            }
            if (c12023wl.m56865x1() == 0 || c12023wl.m56862kk() == 0) {
                c12023wl2.m56860k4(0);
                c12023wl2.m56866x1(0);
                return c12023wl2;
            }
            double dM56865x1 = ((double) i) / ((double) c12023wl.m56865x1());
            double dM56862kk = ((double) i2) / ((double) c12023wl.m56862kk());
            if (dM56865x1 < dM56862kk) {
                c12023wl2.m56866x1(OooO00o.OooO00o(dM56865x1, c12023wl.m56862kk(), 14));
                return c12023wl2;
            }
            if (dM56865x1 > dM56862kk) {
                c12023wl2.m56860k4(OooO00o.OooO00o(dM56862kk, c12023wl.m56865x1(), 14));
            }
        }
        return c12023wl2;
    }

    /* JADX INFO: renamed from: k4 */
    private C12023wl m54871k4(C12023wl c12023wl) {
        C12023wl c12023wl2 = new C12023wl(c12023wl.m56862kk(), c12023wl.m56865x1());
        int iM54869k4 = m54869k4(c12023wl.m56865x1(), this.f39344k4.mo14258k4(), this.f39344k4.mo14261to());
        int iM54869k42 = m54869k4(c12023wl.m56862kk(), this.f39344k4.mo14262x1(), this.f39344k4.mo14259kk());
        if (this.f39344k4.mo14256du() != 154) {
            c12023wl2.m56860k4(iM54869k4);
            c12023wl2.m56866x1(iM54869k42);
            return c12023wl2;
        }
        double dM56865x1 = ((double) iM54869k4) / ((double) c12023wl.m56865x1());
        double dM56862kk = ((double) iM54869k42) / ((double) c12023wl.m56862kk());
        if (dM56865x1 < dM56862kk) {
            c12023wl2.m56860k4(iM54869k4);
            c12023wl2.m56866x1(OooO00o.OooO00o(dM56865x1, c12023wl.m56862kk(), 14));
            return c12023wl2;
        }
        if (dM56865x1 > dM56862kk) {
            c12023wl2.m56860k4(OooO00o.OooO00o(dM56862kk, c12023wl.m56865x1(), 14));
            c12023wl2.m56866x1(iM54869k42);
        }
        return c12023wl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m54873k4() {
        int iMo9886x1;
        boolean z;
        InterfaceC1984kk interfaceC1984kkMo14259kk;
        int iMo9886x12;
        int iMo14260m9;
        InterfaceC1984kk interfaceC1984kkMo9877dy = this.f39344k4.mo14262x1().m17133to(this.f39347x1).mo9877dy();
        int iMo9886x13 = interfaceC1984kkMo9877dy.m10115du() != 9 ? interfaceC1984kkMo9877dy.mo9886x1(this.f39347x1) : -1;
        InterfaceC1984kk interfaceC1984kkMo9877dy2 = this.f39344k4.mo14262x1().m17134x1(this.f39347x1).mo9877dy();
        if (iMo9886x13 == -1 && interfaceC1984kkMo9877dy2.m10115du() != 9) {
            iMo9886x13 = interfaceC1984kkMo9877dy2.mo9886x1(this.f39347x1);
        }
        InterfaceC1984kk interfaceC1984kkMo9877dy3 = this.f39344k4.mo14258k4().m17133to(this.f39347x1).mo9877dy();
        int iMo9886x14 = interfaceC1984kkMo9877dy3.m10115du() != 9 ? interfaceC1984kkMo9877dy3.mo9886x1(this.f39347x1) : -1;
        InterfaceC1984kk interfaceC1984kkMo9877dy4 = this.f39344k4.mo14258k4().m17134x1(this.f39347x1).mo9877dy();
        if (iMo9886x14 == -1 && interfaceC1984kkMo9877dy4.m10115du() != 9) {
            iMo9886x14 = interfaceC1984kkMo9877dy4.mo9886x1(this.f39347x1);
        }
        InterfaceC1984kk interfaceC1984kkMo14261to = this.f39344k4.mo14261to();
        if (interfaceC1984kkMo14261to.m10115du() != 9) {
            int iM10115du = interfaceC1984kkMo14261to.m10115du();
            if (iM10115du != 125) {
                if (iM10115du != 187) {
                    if (iM10115du != 188) {
                        iMo9886x1 = interfaceC1984kkMo14261to.mo9886x1(this.f39347x1);
                    } else {
                        iMo9886x1 = (iMo9886x14 == -1 || this.f39345kk.m56865x1() >= iMo9886x14) ? -1 : iMo9886x14;
                    }
                } else if (iMo9886x14 == -1 || this.f39345kk.m56865x1() <= iMo9886x14) {
                }
            } else if (iMo9886x14 != -1) {
            }
            z = true;
            interfaceC1984kkMo14259kk = this.f39344k4.mo14259kk();
            if (interfaceC1984kkMo14259kk.m10115du() == 9) {
                int iM10115du2 = interfaceC1984kkMo14259kk.m10115du();
                if (iM10115du2 != 125) {
                    if (iM10115du2 != 187) {
                        iMo9886x12 = iM10115du2 != 188 ? interfaceC1984kkMo14259kk.mo9886x1(this.f39347x1) : (iMo9886x13 == -1 || this.f39345kk.m56862kk() >= iMo9886x13) ? -1 : iMo9886x13;
                    } else if (iMo9886x13 == -1 || this.f39345kk.m56862kk() <= iMo9886x13) {
                    }
                } else if (iMo9886x13 != -1) {
                }
                z = true;
            } else {
                iMo9886x12 = -1;
            }
            C12023wl c12023wl = new C12023wl();
            (!z ? m54871k4(this.f39345kk.Clone()) : this.f39345kk).CloneTo(c12023wl);
            C12023wl c12023wlClone = m54870k4(iMo9886x1, iMo9886x12, c12023wl.Clone()).Clone();
            int iM56865x1 = c12023wlClone.m56865x1();
            int iM56862kk = c12023wlClone.m56862kk();
            if (iMo9886x14 == -1) {
                iMo9886x14 = m54869k4(iM56865x1, this.f39344k4.mo14258k4(), this.f39344k4.mo14261to());
            }
            if (iMo9886x13 == -1) {
                iMo9886x13 = m54869k4(iM56862kk, this.f39344k4.mo14262x1(), this.f39344k4.mo14259kk());
            }
            this.f39343h4 = false;
            iMo14260m9 = this.f39344k4.mo14260m9();
            if (iMo14260m9 != 57 || iMo14260m9 == 42) {
                this.f39343h4 = true;
            }
            int iM54872k4 = m54872k4(iMo9886x14, iM56865x1);
            int iM54876x1 = m54876x1(iMo9886x13, iM56862kk);
            this.f39342du = new C12023wl(iMo9886x14, iMo9886x13);
            C12007ix.m56544k4(new C12014ne(iM54872k4, iM54876x1, iM56865x1, iM56862kk)).CloneTo(this.f39346to);
        }
        iMo9886x1 = -1;
        z = false;
        interfaceC1984kkMo14259kk = this.f39344k4.mo14259kk();
        if (interfaceC1984kkMo14259kk.m10115du() == 9) {
        }
        C12023wl c12023wl2 = new C12023wl();
        (!z ? m54871k4(this.f39345kk.Clone()) : this.f39345kk).CloneTo(c12023wl2);
        C12023wl c12023wlClone2 = m54870k4(iMo9886x1, iMo9886x12, c12023wl2.Clone()).Clone();
        int iM56865x12 = c12023wlClone2.m56865x1();
        int iM56862kk2 = c12023wlClone2.m56862kk();
        if (iMo9886x14 == -1) {
        }
        if (iMo9886x13 == -1) {
        }
        this.f39343h4 = false;
        iMo14260m9 = this.f39344k4.mo14260m9();
        if (iMo14260m9 != 57) {
            this.f39343h4 = true;
        }
        int iM54872k42 = m54872k4(iMo9886x14, iM56865x12);
        int iM54876x12 = m54876x1(iMo9886x13, iM56862kk2);
        this.f39342du = new C12023wl(iMo9886x14, iMo9886x13);
        C12007ix.m56544k4(new C12014ne(iM54872k42, iM54876x12, iM56865x12, iM56862kk2)).CloneTo(this.f39346to);
    }
}
