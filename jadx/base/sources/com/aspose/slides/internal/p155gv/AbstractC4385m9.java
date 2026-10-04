package com.aspose.slides.internal.p155gv;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p138fu.C4123dy;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p138fu.C4128kk;
import com.aspose.slides.internal.p138fu.C4130m9;
import com.aspose.slides.internal.p151gj.C4314c5;
import com.aspose.slides.internal.p151gj.C4316du;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p201j8.C5216kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10913um;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.gv.m9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4385m9 extends C10894bv {

    /* JADX INFO: renamed from: k4 */
    protected C10913um f11937k4;

    /* JADX INFO: renamed from: kk */
    protected C4380du f11938kk;

    /* JADX INFO: renamed from: to */
    private final C4317dy f11939to;

    public AbstractC4385m9(C10898dy c10898dy) {
        super(c10898dy);
        C10913um c10913um = new C10913um(c10898dy);
        this.f11937k4 = c10913um;
        this.f11938kk = new C4380du(this.f37962x1, c10913um, this);
        this.f11939to = this.f37962x1.m52456jd().m17773x1().m17747x1().m17345kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static double m17754k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        double dM56897x1 = c12025x6.m56897x1() - c12025x62.m56897x1();
        double dM56895kk = c12025x6.m56895kk() - c12025x62.m56895kk();
        return C14116yg.m67496rv((dM56895kk * dM56895kk) + (dM56897x1 * dM56897x1));
    }

    /* JADX INFO: renamed from: du */
    public abstract int mo17690du();

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: fa */
    public int mo9118fa() {
        return 2;
    }

    /* JADX INFO: renamed from: h4 */
    public abstract C4317dy mo17691h4();

    /* JADX INFO: renamed from: kk */
    public final void m17756kk(C10922yj c10922yj) {
        C4317dy c4317dyM17345kk;
        if (mo17691h4() == null) {
            float fM58637du = (float) C12566m9.m58637du(1.0d);
            c4317dyM17345kk = new C4317dy(fM58637du, 0.0f, 0.0f, fM58637du, 0.0f, 0.0f);
        } else {
            c4317dyM17345kk = mo17691h4().m17345kk();
            c4317dyM17345kk.m17341k4(this.f11939to, 1);
        }
        c10922yj.m52653k4("/Matrix", c4317dyM17345kk);
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv
    /* JADX INFO: renamed from: x1 */
    public void mo9084x1(C10922yj c10922yj) {
        c10922yj.m52666kk("/Type", "/Pattern");
        c10922yj.m52652k4("/PatternType", mo17690du());
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03c9 A[Catch: all -> 0x03bb, DONT_GENERATE, TRY_ENTER, TryCatch #8 {all -> 0x03bb, blocks: (B:102:0x02f9, B:118:0x03af, B:134:0x03c9, B:135:0x03cc), top: B:159:0x02f9, outer: #5 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC4385m9 m17755k4(C4328x1 c4328x1, C10898dy c10898dy) {
        int i;
        C11909up c11909up;
        float f;
        C12007ix c12007ix;
        float fM56550c5;
        float f2;
        C4127k4 c4127k4;
        C4130m9 c4130m9;
        C3152yj c3152yj;
        C11909up c11909up2;
        int iM17417k4 = c4328x1.m17417k4();
        if (iM17417k4 == 1) {
            return new C4379c5(c10898dy, (C4316du) c4328x1);
        }
        if (iM17417k4 == 2) {
            return new C4379c5(c10898dy, (C4327up) c4328x1);
        }
        if (iM17417k4 != 3) {
            if (iM17417k4 != 4) {
                throw new NotSupportedException("Unsupported brush type.");
            }
            C4314c5 c4314c5 = (C4314c5) c4328x1;
            float fM56557jd = c4314c5.m17299du().m56557jd();
            float fM56551ck = c4314c5.m17299du().m56551ck();
            float fM56556h4 = c4314c5.m17299du().m56556h4();
            float fM56558k4 = c4314c5.m17299du().m56558k4();
            if (c4314c5.m17299du().m56568kk()) {
                fM56551ck = Float.MAX_VALUE;
                fM56556h4 = 0.0f;
                fM56558k4 = 0.0f;
                fM56557jd = Float.MAX_VALUE;
                for (int i2 = 0; i2 < c4314c5.m17301h4().m52927c5(); i2++) {
                    C10950bv c10950bv = (C10950bv) C7019kk.m27452k4((Object) c4314c5.m17301h4().m52931k4(i2), C10950bv.class);
                    if (c10950bv != null) {
                        for (int i3 = 0; i3 < c10950bv.m52927c5(); i3++) {
                            C10974v4 c10974v4 = (C10974v4) C7019kk.m27452k4((Object) c10950bv.m52931k4(i3), C10974v4.class);
                            if (c10974v4 != null) {
                                List.Enumerator<C12025x6> it = c10974v4.m53117k4().iterator();
                                while (it.hasNext()) {
                                    try {
                                        C12025x6 next = it.next();
                                        if (next.m56897x1() < fM56557jd) {
                                            fM56557jd = next.m56897x1();
                                        }
                                        if (next.m56897x1() > fM56556h4) {
                                            fM56556h4 = next.m56897x1();
                                        }
                                        if (next.m56895kk() < fM56551ck) {
                                            fM56551ck = next.m56895kk();
                                        }
                                        if (next.m56895kk() > fM56558k4) {
                                            fM56558k4 = next.m56895kk();
                                        }
                                    } catch (Throwable th) {
                                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                            it.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            }
                        }
                    }
                }
            }
            if (fM56556h4 == fM56557jd || fM56558k4 == fM56551ck) {
                throw new C5216kk(c4328x1);
            }
            c4127k4 = new C4127k4(C7019kk.m27462to(Float.valueOf(fM56556h4 - fM56557jd), 13), C7019kk.m27462to(Float.valueOf(fM56558k4 - fM56551ck), 13));
            try {
                c4130m9 = new C4130m9(c4127k4);
                try {
                    C11906rv c11906rv = (C11906rv) C4128kk.m16560k4((C4328x1) c4314c5);
                    try {
                        c3152yj = new C3152yj();
                        try {
                            C4317dy c4317dyM16494k4 = C4123dy.m16494k4(c11906rv.m55685fa());
                            c11906rv.m55697kk(new C11913yj());
                            c4130m9.m16571k4(-fM56557jd, -fM56551ck);
                            c4130m9.m16573x1().mo17593x1(c11906rv, new C12007ix(fM56557jd, fM56551ck, c4127k4.m16549x1(), c4127k4.m16546kk()));
                            c4127k4.m16541k4(c3152yj, 5);
                            C4327up c4327up = new C4327up(c3152yj.toArray());
                            c4317dyM16494k4.m17348x1(fM56557jd, fM56551ck);
                            c4327up.m17387k4(c4317dyM16494k4);
                            AbstractC4385m9 abstractC4385m9M52560k4 = c10898dy.m52459kk().m52560k4(c4327up, c4317dyM16494k4);
                            c11906rv.dispose();
                            return abstractC4385m9M52560k4;
                        } finally {
                            c3152yj.dispose();
                        }
                    } catch (Throwable th2) {
                        if (c11906rv != null) {
                            c11906rv.dispose();
                        }
                        throw th2;
                    }
                } finally {
                }
            } finally {
            }
        }
        C4324m9 c4324m9 = (C4324m9) c4328x1;
        C12007ix c12007ixClone = c4324m9.m17391du().Clone();
        new C12007ix();
        C4317dy c4317dyM17385fa = c4324m9.m17385fa();
        if (c12007ixClone.m56575x1() * c12007ixClone.m56550c5() > 262144.0f) {
            fM56550c5 = (float) C14116yg.m67496rv((262144.0f / c12007ixClone.m56550c5()) / c12007ixClone.m56575x1());
            c12007ix = new C12007ix((float) C14116yg.m67490kk(c12007ixClone.m56557jd() * fM56550c5), (float) C14116yg.m67490kk(c12007ixClone.m56551ck() * fM56550c5), (float) C14116yg.m67501x1(c12007ixClone.m56550c5() * fM56550c5), (float) C14116yg.m67501x1(c12007ixClone.m56575x1() * fM56550c5));
            f2 = fM56550c5;
            f = 1.0f;
            i = 0;
        } else {
            C12007ix c12007ix2 = new C12007ix((float) C14116yg.m67490kk(c12007ixClone.m56557jd()), (float) C14116yg.m67490kk(c12007ixClone.m56551ck()), (float) C14116yg.m67501x1(c12007ixClone.m56550c5()), (float) C14116yg.m67501x1(c12007ixClone.m56575x1()));
            double dM17389c5 = c4324m9.m17389c5();
            i = 0;
            if (c4324m9.m17389c5() % 90.0d != 0.0d) {
                c4324m9.m17395k4(0.0d);
            }
            c11909up = (C11909up) C4128kk.m16560k4((C4328x1) c4324m9);
            try {
                f = 1.0f;
                C12025x6[] c12025x6Arr = {new C12025x6(c12007ix2.m56571to(), c12007ix2.m56554dy()), new C12025x6(c12007ix2.m56556h4(), c12007ix2.m56554dy())};
                double dM17754k4 = m17754k4(c12025x6Arr[0].Clone(), c12025x6Arr[1].Clone());
                c11909up.m55719ck().m55775k4(c12025x6Arr);
                double dM17754k42 = m17754k4(c12025x6Arr[0].Clone(), c12025x6Arr[1].Clone());
                if (dM17754k4 < dM17754k42) {
                    C12007ix c12007ix3 = new C12007ix((float) C14116yg.m67490kk(c12007ixClone.m56557jd()), (float) C14116yg.m67490kk(c12007ixClone.m56551ck()), (float) C14116yg.m67501x1(dM17754k42), (float) C14116yg.m67501x1(c12007ixClone.m56575x1()));
                    c12007ix = c12007ix3;
                    fM56550c5 = c12007ixClone.m56550c5() / c12007ix3.m56550c5();
                } else {
                    c12007ix = c12007ix2;
                    fM56550c5 = 1.0f;
                }
                c11909up.dispose();
                c4324m9.m17395k4(dM17389c5);
                f2 = 1.0f;
            } finally {
                if (c11909up != null) {
                    c11909up.dispose();
                }
            }
        }
        c4324m9.m17397k4(c12007ix.Clone());
        c4127k4 = new C4127k4(C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13));
        try {
            c4130m9 = new C4130m9(c4127k4);
            try {
                c11909up = (C11909up) C4128kk.m16560k4((C4328x1) c4324m9);
                try {
                    try {
                        c3152yj = new C3152yj();
                        try {
                            C4317dy c4317dyM16494k42 = C4123dy.m16494k4(c11909up.m55719ck());
                            c11909up.m55730kk(new C11913yj());
                            c11909up.m55734to(-c4324m9.m17391du().m56557jd(), -c4324m9.m17391du().m56551ck());
                            if (c4127k4.m16549x1() == 1 && c4127k4.m16546kk() == 1) {
                                c11909up2 = c11909up;
                            } else {
                                c11909up2 = c11909up;
                                try {
                                    c4130m9.m16573x1().mo17526k4((AbstractC12024x1) c11909up2, 0, 0, c4127k4.m16549x1(), c4127k4.m16546kk());
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                            c4127k4.m16541k4(c3152yj, 5);
                            C4327up c4327up2 = new C4327up(c3152yj.toArray());
                            c4317dyM16494k42.m17349x1(c12007ix.m56557jd(), c12007ix.m56551ck(), 1);
                            c4317dyM16494k42.m17336k4(f / fM56550c5, f / f2, 1);
                            c4317dyM16494k42.m17349x1(-c12007ixClone.m56557jd(), -c12007ixClone.m56551ck(), 1);
                            c4317dyM16494k42.m17349x1(c4324m9.m17391du().m56557jd(), c4324m9.m17391du().m56551ck(), i);
                            c4327up2.m17387k4(c4317dyM16494k42);
                            c4324m9.m17387k4(c4317dyM17385fa);
                            c4324m9.m17397k4(c12007ixClone.Clone());
                            AbstractC4385m9 abstractC4385m9M52560k42 = c10898dy.m52459kk().m52560k4(c4327up2, c4317dyM16494k42.m17345kk());
                            c11909up2.dispose();
                            return abstractC4385m9M52560k42;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } finally {
            }
        } finally {
        }
    }
}
