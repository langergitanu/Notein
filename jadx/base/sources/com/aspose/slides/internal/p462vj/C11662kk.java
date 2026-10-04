package com.aspose.slides.internal.p462vj;

import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p022ai.C1374fa;
import com.aspose.slides.internal.p057c6.C1977c5;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p393s7.C10161to;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11662kk {

    /* JADX INFO: renamed from: c5 */
    private C11662kk f39349c5;

    /* JADX INFO: renamed from: du */
    private int f39350du;

    /* JADX INFO: renamed from: dy */
    private C11670ts f39351dy;

    /* JADX INFO: renamed from: h4 */
    private int f39352h4;

    /* JADX INFO: renamed from: k4 */
    private int f39353k4;

    /* JADX INFO: renamed from: kk */
    private int f39354kk;

    /* JADX INFO: renamed from: m9 */
    private C11670ts f39355m9;

    /* JADX INFO: renamed from: to */
    private int f39356to;

    /* JADX INFO: renamed from: x1 */
    private int f39357x1;

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C11662kk(int i, int i2, int i3, int i4, InterfaceC1984kk interfaceC1984kk, int i5, InterfaceC1984kk interfaceC1984kk2, int i6, C11662kk c11662kk) {
        int iM54882jd;
        int i7;
        boolean z;
        this.f39353k4 = i - i2;
        this.f39357x1 = i3;
        this.f39352h4 = i4;
        this.f39349c5 = c11662kk;
        if (c11662kk != null) {
            this.f39355m9 = c11662kk.m54879c5();
            m54888x1(i5, c11662kk.m54882jd());
            iM54882jd = c11662kk.m54882jd();
        } else {
            this.f39355m9 = new C11670ts(i, i2, i4, 6, C1374fa.f5957k4);
            m54888x1(i5, 6);
            iM54882jd = 6;
        }
        m54889x1(interfaceC1984kk2);
        int i8 = this.f39356to;
        boolean z2 = i8 != 0;
        if (i6 == 9) {
            i7 = iM54882jd;
            z = i8 != 0;
        } else if (i6 == 87) {
            i7 = iM54882jd;
            z = z2;
        } else if (i6 == 116) {
            z = true;
            i7 = iM54882jd;
        } else if (i6 != 157) {
            z = true;
            i7 = i6;
        }
        this.f39351dy = new C11670ts(i, i2, i4, i7, this.f39355m9.m54938x1());
        if (z) {
            this.f39355m9 = new C11670ts(i, i2, i4, i7, this.f39355m9.m54938x1());
        }
        m54883k4(interfaceC1984kk);
    }

    /* JADX INFO: renamed from: c5 */
    private C11670ts m54879c5() {
        return this.f39355m9;
    }

    /* JADX INFO: renamed from: ck */
    private int m54880ck() {
        C11662kk c11662kk = this.f39349c5;
        if (c11662kk == null) {
            return 0;
        }
        return ((c11662kk.m54879c5().m54936k4(this.f39350du) - this.f39355m9.m54939x1(this.f39349c5.m54882jd()).m54936k4(this.f39350du)) - this.f39355m9.m54936k4(this.f39349c5.m54882jd())) + this.f39356to;
    }

    /* JADX INFO: renamed from: fa */
    private int m54881fa() {
        if (this.f39349c5 != null) {
            return m54880ck() + this.f39349c5.m54881fa();
        }
        return 0;
    }

    /* JADX INFO: renamed from: jd */
    private int m54882jd() {
        return this.f39351dy.m54935k4();
    }

    /* JADX INFO: renamed from: ks */
    private int m54885ks() {
        return this.f39352h4;
    }

    /* JADX INFO: renamed from: up */
    private int m54886up() {
        return m54891du() + m54897kk();
    }

    /* JADX INFO: renamed from: yj */
    private int m54890yj() {
        return this.f39357x1;
    }

    /* JADX INFO: renamed from: du */
    public final int m54891du() {
        return this.f39354kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m54892dy() {
        C11662kk c11662kk = this.f39349c5;
        if (c11662kk != null) {
            return this.f39355m9 == c11662kk.m54879c5() && this.f39349c5.m54892dy();
        }
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m54893h4() {
        return m54899to() - this.f39354kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54894k4() {
        return this.f39356to;
    }

    /* JADX INFO: renamed from: kk */
    public final int m54897kk() {
        return m54887x1(this.f39350du);
    }

    /* JADX INFO: renamed from: m9 */
    public final int m54898m9() {
        int iM54891du;
        int iM54936k4;
        C11662kk c11662kk = this.f39349c5;
        if (c11662kk != null) {
            iM54891du = c11662kk.m54886up();
            iM54936k4 = m54886up();
        } else {
            iM54891du = m54891du();
            iM54936k4 = this.f39355m9.m54936k4(142);
        }
        return iM54891du - iM54936k4;
    }

    /* JADX INFO: renamed from: to */
    public final int m54899to() {
        return this.f39353k4;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp(64);
        c6765kp.m26792k4("areaHeight=").m26805kk(this.f39353k4);
        c6765kp.m26792k4(" lineHeight=").m26805kk(this.f39357x1);
        c6765kp.m26792k4(" alignmentPoint=").m26805kk(this.f39354kk);
        c6765kp.m26792k4(" alignmentBaselineID=").m26805kk(this.f39350du);
        c6765kp.m26792k4(" baselineShift=").m26805kk(this.f39356to);
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m54900x1() {
        return this.f39350du;
    }

    public C11662kk(int i, InterfaceC1984kk interfaceC1984kk, int i2, InterfaceC1984kk interfaceC1984kk2, int i3, C11662kk c11662kk) {
        this(i, 0, i, i, interfaceC1984kk, i2, interfaceC1984kk2, i3, c11662kk);
    }

    /* JADX INFO: renamed from: kk */
    private int m54884kk(int i) {
        return this.f39351dy.m54939x1(this.f39350du).m54936k4(i) + (m54897kk() - m54881fa());
    }

    /* JADX INFO: renamed from: x1 */
    private int m54887x1(int i) {
        int i2 = this.f39356to;
        C11662kk c11662kk = this.f39349c5;
        if (c11662kk == null) {
            return i2;
        }
        return this.f39349c5.m54879c5().m54936k4(i) + c11662kk.m54881fa() + this.f39356to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54895k4(int i) {
        this.f39354kk = i;
    }

    public C11662kk(C10161to c10161to, int i, C1374fa c1374fa) {
        this.f39353k4 = c10161to.m49969du() - c10161to.m49972h4();
        this.f39357x1 = i;
        this.f39352h4 = c10161to.m49968ck();
        C11670ts c11670ts = new C11670ts(c10161to.m49969du(), c10161to.m49972h4(), c10161to.m49968ck(), 6, c1374fa);
        this.f39355m9 = c11670ts;
        this.f39351dy = c11670ts;
        this.f39350du = m54882jd();
        this.f39354kk = c10161to.m49969du();
        this.f39356to = 0;
    }

    /* JADX INFO: renamed from: x1 */
    private void m54888x1(int i, int i2) {
        if (i != 4 && i != 6) {
            if (i == 9 || i == 12) {
                this.f39350du = i2;
                return;
            }
            if (i != 14 && i != 24 && i != 56 && i != 59 && i != 82 && i != 84 && i != 141 && i != 142) {
                throw new ArgumentException(C14057f9.m66591x1(i));
            }
        }
        this.f39350du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54896k4(int i, int i2) {
        this.f39353k4 = i;
        this.f39354kk = i2;
        this.f39355m9.m54937k4(i2, i2 - i);
    }

    public C11662kk(C10161to c10161to, int i, InterfaceC1984kk interfaceC1984kk, int i2, InterfaceC1984kk interfaceC1984kk2, int i3, C11662kk c11662kk) {
        this(c10161to.m49969du(), c10161to.m49972h4(), i, c10161to.m49968ck(), interfaceC1984kk, i2, interfaceC1984kk2, i3, c11662kk);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54883k4(InterfaceC1984kk interfaceC1984kk) {
        int iM54936k4 = this.f39351dy.m54936k4(14);
        int iM10115du = interfaceC1984kk.m10115du();
        if (iM10115du != 4 && iM10115du != 6) {
            if (iM10115du == 9) {
                this.f39354kk = iM54936k4 - this.f39351dy.m54936k4(this.f39350du);
                return;
            }
            if (iM10115du == 12) {
                this.f39354kk = iM54936k4;
                return;
            }
            if (iM10115du != 14 && iM10115du != 24 && iM10115du != 56 && iM10115du != 59 && iM10115du != 82 && iM10115du != 84 && iM10115du != 141 && iM10115du != 142) {
                this.f39354kk = interfaceC1984kk.mo9886x1(new C1977c5(null, 12, this.f39357x1)) + iM54936k4;
                return;
            }
        }
        this.f39354kk = iM54936k4 - this.f39351dy.m54936k4(interfaceC1984kk.m10115du());
    }

    /* JADX INFO: renamed from: x1 */
    private void m54889x1(InterfaceC1984kk interfaceC1984kk) {
        int iMo9886x1;
        int iM54885ks;
        int iM54884kk;
        this.f39356to = 0;
        int iM10115du = interfaceC1984kk.m10115du();
        if (iM10115du == 0) {
            iMo9886x1 = interfaceC1984kk.mo9886x1(new C1977c5(null, 0, this.f39349c5.m54890yj()));
        } else {
            if (iM10115du == 12) {
                return;
            }
            if (iM10115du == 137) {
                iM54885ks = -(this.f39352h4 / 2);
                iM54884kk = this.f39349c5.m54884kk(6);
            } else {
                if (iM10115du != 138) {
                    throw new ArgumentException(C14057f9.m66591x1(interfaceC1984kk.m10115du()));
                }
                iM54885ks = this.f39349c5.m54885ks();
                iM54884kk = this.f39349c5.m54884kk(6);
            }
            iMo9886x1 = OooO.OooO00o(iM54885ks + iM54884kk, 14);
        }
        this.f39356to = iMo9886x1;
    }
}
