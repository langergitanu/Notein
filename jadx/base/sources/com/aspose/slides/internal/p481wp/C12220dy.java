package com.aspose.slides.internal.p481wp;

import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p371qw.AbstractC9956kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12220dy {

    /* JADX INFO: renamed from: c5 */
    private int f40646c5;

    /* JADX INFO: renamed from: ck */
    private byte f40647ck;

    /* JADX INFO: renamed from: du */
    public C12225k4 f40648du;

    /* JADX INFO: renamed from: dy */
    private C12243yd f40649dy;

    /* JADX INFO: renamed from: h4 */
    protected AbstractC9956kk f40650h4;

    /* JADX INFO: renamed from: jd */
    private int f40651jd;

    /* JADX INFO: renamed from: k4 */
    protected C12234u4 f40652k4;

    /* JADX INFO: renamed from: kk */
    public C12233to f40653kk;

    /* JADX INFO: renamed from: m9 */
    private C12236up f40654m9;

    /* JADX INFO: renamed from: to */
    public C12225k4 f40655to;

    /* JADX INFO: renamed from: x1 */
    public C12233to f40656x1;

    private C12220dy(int i, int i2) {
        this.f40647ck = (byte) 0;
        this.f40646c5 = i;
        this.f40651jd = i2;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m57029c5() {
        return this.f40651jd;
    }

    /* JADX INFO: renamed from: ck */
    public final C4265c5.k4 m57030ck() {
        return this.f40655to.m57056x1();
    }

    /* JADX INFO: renamed from: du */
    public boolean mo57031du() {
        return this.f40651jd == this.f40652k4.m57117sv() - 1;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m57032dy() {
        return this.f40652k4 == null;
    }

    /* JADX INFO: renamed from: fa */
    public final C4265c5.k4 m57033fa() {
        return this.f40648du.m57056x1();
    }

    /* JADX INFO: renamed from: h4 */
    public final C12234u4 m57034h4() {
        return this.f40652k4;
    }

    /* JADX INFO: renamed from: jd */
    public final int m57035jd() {
        return this.f40646c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4265c5.k4 m57036k4(int i) {
        C12225k4 c12225k4;
        if (i == 0) {
            c12225k4 = this.f40656x1.f40711k4;
        } else if (i == 1) {
            c12225k4 = this.f40656x1.f40714x1;
        } else {
            if (i != 2) {
                return null;
            }
            c12225k4 = this.f40656x1.f40712kk;
        }
        return c12225k4.m57056x1();
    }

    /* JADX INFO: renamed from: kk */
    public boolean mo57045kk() {
        return false;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12243yd m57047m9() {
        return this.f40649dy;
    }

    /* JADX INFO: renamed from: to */
    public final void m57048to(int i) {
        m57042k4(i, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        C6765kp c6765kp = new C6765kp();
        if (!m57032dy()) {
            str = mo57045kk() ? "Primary" : "EMPTY";
            c6765kp.m26792k4("GridUnit:");
            if (this.f40646c5 > 0) {
                c6765kp.m26792k4(" colSpan=").m26805kk(this.f40646c5);
                if (mo57049to()) {
                    c6765kp.m26792k4("(last)");
                }
            }
            if (this.f40651jd > 0) {
                c6765kp.m26792k4(" rowSpan=").m26805kk(this.f40651jd);
                if (mo57031du()) {
                    c6765kp.m26792k4("(last)");
                }
            }
            if (!mo57045kk() && mo57051x1() != null) {
                c6765kp.m26792k4(" primary=").m26805kk(mo57051x1().m57126ix());
                c6765kp.m26792k4("/").m26805kk(mo57051x1().m57136u4());
                if (mo57051x1().m57034h4() != null) {
                    c6765kp.m26792k4(C14113y2.m67408k4(" id=", mo57051x1().m57034h4().mo14334yd()));
                }
            }
            c6765kp.m26792k4(" flags=").m26779k4(this.f40647ck);
            return c6765kp.toString();
        }
        c6765kp.m26792k4(str);
        c6765kp.m26792k4("GridUnit:");
        if (this.f40646c5 > 0) {
        }
        if (this.f40651jd > 0) {
        }
        if (!mo57045kk()) {
            c6765kp.m26792k4(" primary=").m26805kk(mo57051x1().m57126ix());
            c6765kp.m26792k4("/").m26805kk(mo57051x1().m57136u4());
            if (mo57051x1().m57034h4() != null) {
            }
        }
        c6765kp.m26792k4(" flags=").m26779k4(this.f40647ck);
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final C4265c5.k4 m57050x1(int i) {
        C12225k4 c12225k4;
        if (i == 0) {
            c12225k4 = this.f40653kk.f40711k4;
        } else if (i == 1) {
            c12225k4 = this.f40653kk.f40714x1;
        } else {
            if (i != 2) {
                return null;
            }
            c12225k4 = this.f40653kk.f40712kk;
        }
        return c12225k4.m57056x1();
    }

    public C12220dy(C12232rv c12232rv, int i, int i2) {
        this(i, i2);
        m57028k4(c12232rv);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo57037k4() {
        C12233to c12233toM57104k4 = ((AbstractC12235um) this.f40652k4).f40729ck.m57104k4();
        this.f40656x1 = c12233toM57104k4;
        if (this.f40651jd > 0) {
            c12233toM57104k4.f40711k4 = C12225k4.m57054k4();
        }
        this.f40653kk = ((AbstractC12235um) this.f40652k4).f40731fa.m57104k4();
        if (!mo57031du()) {
            this.f40653kk.f40711k4 = C12225k4.m57054k4();
        }
        this.f40655to = this.f40646c5 == 0 ? this.f40652k4.f40735up : C12225k4.m57054k4();
        this.f40648du = mo57049to() ? this.f40652k4.f40736yj : C12225k4.m57054k4();
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m57046kk(int i) {
        return ((1 << i) & (this.f40647ck & 255)) != 0;
    }

    /* JADX INFO: renamed from: to */
    public boolean mo57049to() {
        return this.f40646c5 == this.f40652k4.m57111g8() - 1;
    }

    /* JADX INFO: renamed from: x1 */
    public C12236up mo57051x1() {
        return this.f40654m9;
    }

    public C12220dy(C12234u4 c12234u4, int i, int i2) {
        this(i, i2);
        this.f40652k4 = c12234u4;
        m57028k4(c12234u4.mo57086e0());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57038k4(int i, C12225k4 c12225k4) {
        if (i == 2) {
            this.f40655to = this.f40650h4.mo49001k4(this.f40655to, c12225k4);
        } else {
            if (i != 3) {
                return;
            }
            this.f40648du = this.f40650h4.mo49001k4(this.f40648du, c12225k4);
        }
    }

    public C12220dy(C12236up c12236up, int i, int i2) {
        this(c12236up.m57034h4(), i, i2);
        this.f40654m9 = c12236up;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57039k4(int i, C12233to c12233to, boolean z, boolean z2, boolean z3) {
        C12233to c12233to2;
        if (i == 0) {
            c12233to2 = this.f40656x1;
        } else if (i != 1) {
            return;
        } else {
            c12233to2 = this.f40653kk;
        }
        c12233to2.m57107x1(c12233to, z, z2, z3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57040k4(int i, AbstractC12235um abstractC12235um) {
        if (i == 0 || i == 1) {
            m57041k4(i, abstractC12235um, true, true, true);
        } else if (i == 2) {
            this.f40655to = this.f40650h4.mo49001k4(this.f40655to, abstractC12235um.f40735up);
        } else {
            if (i != 3) {
                return;
            }
            this.f40648du = this.f40650h4.mo49001k4(this.f40648du, abstractC12235um.f40736yj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57041k4(int i, AbstractC12235um abstractC12235um, boolean z, boolean z2, boolean z3) {
        C12233to c12233to;
        C12233to c12233to2;
        if (i == 0) {
            c12233to = this.f40656x1;
            c12233to2 = abstractC12235um.f40729ck;
        } else {
            if (i != 1) {
                return;
            }
            c12233to = this.f40653kk;
            c12233to2 = abstractC12235um.f40731fa;
        }
        c12233to.m57106kk(c12233to2, z, z2, z3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57042k4(int i, boolean z) {
        int i2;
        if (z) {
            i2 = (((byte) (1 << i)) & 255) | (this.f40647ck & 255);
        } else {
            i2 = ((byte) (~(1 << i))) & 255 & this.f40647ck & 255;
        }
        this.f40647ck = (byte) i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57043k4(C12220dy c12220dy, int i) {
        C12225k4 c12225k4Mo49001k4;
        if (i != 0) {
            if (i == 1) {
                this.f40653kk.m57105k4(c12220dy.f40656x1, true, false, false);
                return;
            }
            if (i != 2) {
                if (i == 3 && (c12225k4Mo49001k4 = this.f40650h4.mo49001k4(this.f40648du, c12220dy.f40655to)) != null) {
                    this.f40648du = c12225k4Mo49001k4;
                    c12220dy.f40655to = c12225k4Mo49001k4;
                    return;
                }
                return;
            }
            C12225k4 c12225k4Mo49001k42 = this.f40650h4.mo49001k4(this.f40655to, c12220dy.f40648du);
            if (c12225k4Mo49001k42 != null) {
                this.f40655to = c12225k4Mo49001k42;
                c12220dy.f40648du = c12225k4Mo49001k42;
                return;
            }
            return;
        }
        this.f40656x1.m57105k4(c12220dy.f40653kk, true, false, false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m57028k4(C12232rv c12232rv) {
        if (c12232rv.m57102zj()) {
            return;
        }
        this.f40650h4 = AbstractC9956kk.m48996k4(c12232rv.m57087em());
        mo57037k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57044k4(C12243yd c12243yd) {
        this.f40649dy = c12243yd;
    }
}
