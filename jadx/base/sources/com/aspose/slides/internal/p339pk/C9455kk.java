package com.aspose.slides.internal.p339pk;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p052c0.C1937to;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9455kk implements Cloneable {

    /* JADX INFO: renamed from: ak */
    private boolean f34371ak;

    /* JADX INFO: renamed from: ar */
    private C12018u4 f34372ar;

    /* JADX INFO: renamed from: b3 */
    private C5659x1 f34373b3;

    /* JADX INFO: renamed from: bv */
    private C9449du f34374bv;

    /* JADX INFO: renamed from: c5 */
    private int f34375c5;

    /* JADX INFO: renamed from: ck */
    private int f34376ck;

    /* JADX INFO: renamed from: du */
    private int f34377du;

    /* JADX INFO: renamed from: dy */
    private C5656k4 f34378dy;

    /* JADX INFO: renamed from: fa */
    private int f34379fa;

    /* JADX INFO: renamed from: h4 */
    private int f34380h4;

    /* JADX INFO: renamed from: ix */
    private int f34381ix;

    /* JADX INFO: renamed from: jd */
    private int f34382jd;

    /* JADX INFO: renamed from: kk */
    private final C1937to f34384kk;

    /* JADX INFO: renamed from: ks */
    private int f34385ks;

    /* JADX INFO: renamed from: lr */
    private C4320jd f34386lr;

    /* JADX INFO: renamed from: m9 */
    private C5656k4 f34387m9;

    /* JADX INFO: renamed from: ne */
    private int f34388ne;

    /* JADX INFO: renamed from: qq */
    private C4317dy f34389qq;

    /* JADX INFO: renamed from: rv */
    private int f34390rv;

    /* JADX INFO: renamed from: u4 */
    private int f34392u4;

    /* JADX INFO: renamed from: um */
    private C9447c5 f34393um;

    /* JADX INFO: renamed from: up */
    private int f34394up;

    /* JADX INFO: renamed from: uz */
    private int f34395uz;

    /* JADX INFO: renamed from: v4 */
    private C9457m9 f34396v4;

    /* JADX INFO: renamed from: wl */
    private C4317dy f34397wl;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC9451fa f34399x1;

    /* JADX INFO: renamed from: x6 */
    private int f34400x6;

    /* JADX INFO: renamed from: yd */
    private C4328x1 f34401yd;

    /* JADX INFO: renamed from: yj */
    private int f34402yj;

    /* JADX INFO: renamed from: k4 */
    private C12007ix f34383k4 = new C12007ix();

    /* JADX INFO: renamed from: to */
    private C12007ix f34391to = C12007ix.f40519k4.Clone();

    /* JADX INFO: renamed from: wy */
    private C12015qq f34398wy = C12015qq.f40552k4.Clone();

    public C9455kk(AbstractC9451fa abstractC9451fa, C1937to c1937to) {
        if (c1937to == null) {
            throw new ArgumentNullException("metafileInfo");
        }
        this.f34399x1 = abstractC9451fa;
        this.f34384kk = c1937to;
        m46318u4();
    }

    /* JADX INFO: renamed from: ar */
    private void m46315ar() {
        if (this.f34399x1.m46287h4().m56550c5() == 0.0f) {
            throw new InvalidOperationException("Viewport width is invalid.");
        }
        if (this.f34399x1.m46287h4().m56575x1() == 0.0f) {
            throw new InvalidOperationException("Viewport height is invalid.");
        }
    }

    /* JADX INFO: renamed from: qq */
    private C4317dy m46317qq() {
        if (this.f34389qq == null) {
            m46346ks();
        }
        return this.f34389qq;
    }

    /* JADX INFO: renamed from: u4 */
    private void m46318u4() {
        C1937to.f6878k4.CloneTo(this.f34391to);
        this.f34377du = 2;
        this.f34380h4 = 8;
        this.f34387m9 = C5656k4.f15627z7;
        this.f34378dy = C5656k4.f15518dy;
        this.f34375c5 = 0;
        this.f34382jd = 0;
        this.f34376ck = 1;
        this.f34379fa = 1;
        this.f34394up = 13;
        this.f34402yj = 3;
        this.f34385ks = 0;
        this.f34390rv = 1;
        this.f34400x6 = 0;
        this.f34388ne = 0;
        this.f34381ix = 0;
        this.f34392u4 = 4;
        this.f34395uz = 1;
        this.f34397wl = new C4317dy();
        this.f34372ar = null;
        this.f34393um = new C9447c5();
        this.f34374bv = new C9449du();
        this.f34396v4 = new C9457m9();
        C4320jd c4320jd = new C4320jd(this.f34378dy);
        this.f34386lr = c4320jd;
        c4320jd.m17377x1(2);
        this.f34386lr.m17371kk(2);
        this.f34386lr.m17374to(2);
        this.f34401yd = new C4318fa(this.f34387m9);
        this.f34373b3 = C9763ck.m48030to().m48331k4("Microsoft Sans Serif", 12.0f, 0);
        this.f34384kk.m9993ne().CloneTo(this.f34398wy);
        this.f34371ak = false;
    }

    /* JADX INFO: renamed from: uz */
    private void m46319uz() {
        C9449du c9449du = this.f34374bv;
        if (c9449du != null && c9449du.m46264kk() == 2) {
            this.f34374bv.m46267x1(m46326dy() == 2 ? this.f34387m9 : C5656k4.f15629ze);
        }
        this.f34401yd = null;
    }

    /* JADX INFO: renamed from: wl */
    private C4317dy m46320wl() {
        C4317dy c4317dy = new C4317dy();
        if (this.f34399x1.m46305to().m9994rv() != 2) {
            c4317dy.m17336k4(1.0f / m46350rv().m17347to(), 1.0f / m46350rv().m17346m9(), 0);
            return c4317dy;
        }
        float fM9988jd = this.f34399x1.m46305to().m9988jd() / 96.0f;
        c4317dy.m17336k4(fM9988jd, fM9988jd, 0);
        return c4317dy;
    }

    /* JADX INFO: renamed from: c5 */
    public final C5656k4 m46321c5() {
        return this.f34378dy;
    }

    /* JADX INFO: renamed from: ck */
    public final int m46323ck() {
        return this.f34376ck;
    }

    /* JADX INFO: renamed from: du */
    public final C5659x1 m46324du() {
        if (this.f34373b3 == null) {
            this.f34373b3 = this.f34396v4.m46384kk();
        }
        return this.f34373b3;
    }

    /* JADX INFO: renamed from: dy */
    public final int m46326dy() {
        return this.f34377du;
    }

    /* JADX INFO: renamed from: fa */
    public final int m46328fa() {
        return this.f34394up;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12007ix m46329h4() {
        return this.f34391to;
    }

    /* JADX INFO: renamed from: ix */
    public Object m46331ix() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: jd */
    public final int m46332jd() {
        return this.f34375c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9455kk m46334k4() {
        C9455kk c9455kk = (C9455kk) m46331ix();
        C4317dy c4317dy = this.f34397wl;
        if (c4317dy != null) {
            c9455kk.f34397wl = c4317dy.m17345kk();
        }
        C4317dy c4317dy2 = this.f34389qq;
        if (c4317dy2 != null) {
            c9455kk.f34389qq = c4317dy2.m17345kk();
        }
        C12018u4 c12018u4 = this.f34372ar;
        if (c12018u4 != null) {
            c9455kk.f34372ar = c12018u4.m56768x1();
        }
        return c9455kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C4328x1 m46344kk() {
        if (this.f34401yd == null) {
            this.f34401yd = this.f34374bv.m46260k4(m46320wl());
        }
        return this.f34401yd;
    }

    /* JADX INFO: renamed from: ks */
    public final void m46346ks() {
        float fM56697kk;
        C4317dy c4317dy = new C4317dy();
        this.f34389qq = c4317dy;
        switch (this.f34380h4) {
            case 1:
                return;
            case 2:
                c4317dy.m17336k4(C12566m9.m58649kk(), -C12566m9.m58649kk(), 0);
                return;
            case 3:
                c4317dy.m17336k4(C12566m9.m58652to(), -C12566m9.m58652to(), 0);
                return;
            case 4:
                c4317dy.m17336k4(C12566m9.m58647k4(), -C12566m9.m58647k4(), 0);
                return;
            case 5:
                c4317dy.m17336k4(C12566m9.m58655x1(), -C12566m9.m58655x1(), 0);
                return;
            case 6:
                c4317dy.m17336k4(0.05f, -0.05f, 0);
                return;
            case 7:
                m46315ar();
                if (!this.f34371ak) {
                    this.f34389qq.m17336k4(C12566m9.m58649kk(), -C12566m9.m58649kk(), 0);
                    return;
                }
                C12015qq c12015qqClone = m46316kk(this.f34391to.m56570m9().Clone()).Clone();
                float fM56699x1 = c12015qqClone.m56699x1() == 0.0f ? 0.0f : this.f34398wy.m56699x1() / c12015qqClone.m56699x1();
                fM56697kk = c12015qqClone.m56697kk() != 0.0f ? this.f34398wy.m56697kk() / c12015qqClone.m56697kk() : 0.0f;
                this.f34389qq.m17349x1(this.f34399x1.m46287h4().m56557jd() + ((-m46329h4().m56557jd()) * fM56699x1), this.f34399x1.m46287h4().m56551ck() + ((-m46329h4().m56551ck()) * fM56697kk), 0);
                this.f34389qq.m17336k4(fM56699x1, fM56697kk, 0);
                return;
            case 8:
                m46315ar();
                float fM56550c5 = this.f34391to.m56550c5() == 0.0f ? 0.0f : this.f34399x1.m46287h4().m56550c5() / this.f34391to.m56550c5();
                fM56697kk = this.f34391to.m56575x1() != 0.0f ? this.f34399x1.m46287h4().m56575x1() / this.f34391to.m56575x1() : 0.0f;
                this.f34389qq.m17349x1(this.f34399x1.m46287h4().m56557jd() + ((-m46329h4().m56557jd()) * fM56550c5), this.f34399x1.m46287h4().m56551ck() + ((-m46329h4().m56551ck()) * fM56697kk), 0);
                this.f34389qq.m17336k4(fM56550c5, fM56697kk, 0);
                return;
            default:
                throw new InvalidOperationException("Unknown mapping mode.");
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final C5656k4 m46347m9() {
        return this.f34377du == 1 ? new C5656k4(0, this.f34387m9) : this.f34387m9;
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m46349ne() {
        return this.f34372ar != null;
    }

    /* JADX INFO: renamed from: rv */
    public final C4317dy m46350rv() {
        C4317dy c4317dyM17345kk = m46317qq().m17345kk();
        c4317dyM17345kk.m17341k4(this.f34397wl, 0);
        return c4317dyM17345kk;
    }

    /* JADX INFO: renamed from: to */
    public final C9457m9 m46351to() {
        return this.f34396v4;
    }

    /* JADX INFO: renamed from: up */
    public final int m46353up() {
        return this.f34382jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4320jd m46354x1() {
        if (this.f34394up == 11) {
            return null;
        }
        if (this.f34386lr == null) {
            this.f34386lr = this.f34393um.m46245k4(m46347m9());
        }
        return this.f34386lr;
    }

    /* JADX INFO: renamed from: x6 */
    public final C12018u4 m46358x6() {
        if (this.f34372ar == null) {
            this.f34372ar = new C12018u4();
        }
        return this.f34372ar;
    }

    /* JADX INFO: renamed from: yj */
    public final C12007ix m46359yj() {
        return this.f34383k4.Clone();
    }

    /* JADX INFO: renamed from: kk */
    private static C12015qq m46316kk(C12015qq c12015qq) {
        float fM67480k4 = C14116yg.m67480k4(c12015qq.m56699x1());
        float fM67480k42 = C14116yg.m67480k4(c12015qq.m56697kk());
        if (fM67480k4 >= fM67480k42) {
            fM67480k4 = fM67480k42;
        }
        return new C12015qq(C14116yg.m67505x1(c12015qq.m56699x1()) * fM67480k4, C14116yg.m67505x1(c12015qq.m56697kk()) * fM67480k4);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m46322c5(int i) {
        this.f34402yj = i;
    }

    /* JADX INFO: renamed from: du */
    public final void m46325du(int i) {
        this.f34380h4 = i;
        this.f34384kk.m9993ne().CloneTo(this.f34398wy);
        this.f34371ak = false;
    }

    /* JADX INFO: renamed from: dy */
    public final void m46327dy(int i) {
        if (i != this.f34394up) {
            this.f34394up = i;
            this.f34386lr = null;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m46330h4(int i) {
        this.f34376ck = i;
    }

    /* JADX INFO: renamed from: jd */
    public final void m46333jd(int i) {
        this.f34382jd = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m46335k4(String str) {
        C12015qq c12015qqClone = m46324du().m23126x1(str).Clone();
        return new C12015qq(c12015qqClone.m56699x1() + (str.length() * this.f34382jd), c12015qqClone.m56697kk());
    }

    /* JADX INFO: renamed from: m9 */
    public final void m46348m9(int i) {
        this.f34379fa = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m46352to(int i) {
        this.f34375c5 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4328x1 m46355x1(int i) {
        return ((C9449du) this.f34399x1.m46286dy().m46399k4(i)).m46260k4(m46320wl());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46336k4(int i) {
        InterfaceC9461x1 interfaceC9461x1M46399k4 = this.f34399x1.m46286dy().m46399k4(i);
        if (interfaceC9461x1M46399k4 == null) {
            throw new InvalidOperationException(C14113y2.m67402k4("No Gdi object for handle {0}=0x{1:x}.", Integer.valueOf(i), Integer.valueOf(i)));
        }
        int iMo46244k4 = interfaceC9461x1M46399k4.mo46244k4();
        if (iMo46244k4 == 1) {
            this.f34374bv = (C9449du) interfaceC9461x1M46399k4;
            m46319uz();
            return;
        }
        if (iMo46244k4 == 2) {
            this.f34393um = (C9447c5) interfaceC9461x1M46399k4;
            this.f34386lr = null;
        } else if (iMo46244k4 != 4) {
            if (iMo46244k4 == 6) {
                this.f34396v4 = (C9457m9) interfaceC9461x1M46399k4;
                this.f34373b3 = null;
            } else if (iMo46244k4 != 10 && iMo46244k4 != 11) {
                throw new InvalidOperationException("Unknown GDI object type.");
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m46345kk(int i) {
        this.f34377du = i;
        m46319uz();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46356x1(C5656k4 c5656k4) {
        this.f34378dy = c5656k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46337k4(C4317dy c4317dy) {
        this.f34397wl = c4317dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46357x1(C12015qq c12015qq) {
        m46316kk(c12015qq.Clone()).CloneTo(this.f34398wy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46338k4(C4317dy c4317dy, int i) {
        if (i == 1) {
            this.f34397wl = new C4317dy();
            return;
        }
        if (i == 2) {
            this.f34397wl.m17341k4(c4317dy, 0);
        } else if (i == 3) {
            this.f34397wl.m17341k4(c4317dy, 1);
        } else {
            if (i != 4) {
                return;
            }
            m46337k4(c4317dy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46339k4(C5656k4 c5656k4) {
        this.f34387m9 = c5656k4;
        m46319uz();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46340k4(C12007ix c12007ix) {
        this.f34383k4 = c12007ix.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46341k4(C12015qq c12015qq) {
        this.f34391to = new C12007ix(this.f34391to.m56557jd(), this.f34391to.m56551ck(), c12015qq.m56699x1(), c12015qq.m56697kk());
        this.f34371ak = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46342k4(C12018u4 c12018u4) {
        this.f34372ar = c12018u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46343k4(C12025x6 c12025x6) {
        this.f34391to = new C12007ix(c12025x6.m56897x1(), c12025x6.m56895kk(), this.f34391to.m56550c5(), this.f34391to.m56575x1());
    }
}
