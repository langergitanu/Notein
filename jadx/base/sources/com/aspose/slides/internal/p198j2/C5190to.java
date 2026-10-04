package com.aspose.slides.internal.p198j2;

import com.aspose.slides.C22203OooOO0o;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p393s7.C10155jd;
import com.aspose.slides.internal.p420th.AbstractC10981yj;
import com.aspose.slides.internal.p420th.C10947ak;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p420th.C10953ck;
import com.aspose.slides.internal.p420th.C10956dy;
import com.aspose.slides.internal.p420th.C10960jd;
import com.aspose.slides.internal.p420th.C10980yd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p486wy.C12317jd;
import com.aspose.slides.internal.p486wy.C12320ks;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.j2.to */
/* JADX INFO: loaded from: classes.dex */
public class C5190to extends C5188kk {

    /* JADX INFO: renamed from: qq */
    private int f14187qq;

    /* JADX INFO: renamed from: wl */
    private AbstractC10981yj f14188wl;

    public C5190to(C12814to c12814to, List<C10948ar> list, boolean z) {
        super(c12814to, list, z);
        this.f14188wl = null;
        this.f14187qq = 39;
    }

    /* JADX INFO: renamed from: ix */
    private C12025x6 m22158ix() {
        return new C12025x6(this.f38412to / 1000.0f, this.f38410kk.m53612k4() / 1000.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m22159k4(int i, C12025x6 c12025x6, C12015qq c12015qq, C5659x1 c5659x1, String str, float f) {
        AbstractC10981yj c10960jd;
        this.f14187qq = i;
        C12025x6 c12025x62 = new C12025x6(c12025x6.m56897x1(), f - (c12015qq.m56697kk() / 2.0f));
        if (i == 39) {
            this.f14188wl = null;
        } else {
            if (i != 212) {
                switch (i) {
                    case 207:
                        C10947ak c10947ak = new C10947ak(c12025x62.Clone(), str, c12015qq.Clone(), false);
                        c10947ak.m52862k4(c5659x1);
                        c10960jd = c10947ak;
                        break;
                    case 208:
                        c10960jd = new C10960jd(c12025x62.Clone(), str, 10.0f);
                        break;
                    case 209:
                        c10960jd = new C10980yd(c12025x62.Clone(), str, 10.0f);
                        break;
                    case 210:
                        C10953ck c10953ck = new C10953ck(c12025x62.Clone(), str, new List(), 0);
                        c10953ck.m52915k4(c5659x1);
                        c10953ck.m52916k4(c12015qq.Clone());
                        c10960jd = c10953ck;
                        break;
                }
            } else {
                if (c12015qq.m56697kk() != 0.0f) {
                    C10956dy c10956dy = new C10956dy(c12025x62.Clone(), str, c12015qq.Clone());
                    c10956dy.m52923k4(c5659x1);
                    c10960jd = c10956dy;
                }
                this.f14188wl = null;
            }
            this.f14188wl = c10960jd;
        }
        if (this.f14188wl != null) {
            m22142x6().m52930k4(this.f14188wl);
        }
    }

    /* JADX INFO: renamed from: kk */
    private C5659x1 m22160kk(C12317jd c12317jd) {
        if (!c12317jd.m8662h4(3)) {
            return null;
        }
        C10155jd c10155jd = (C10155jd) c12317jd.m8655du(3);
        return this.f38417ck.m49955k4(c10155jd, ((Integer) C7019kk.m27464to(c12317jd.m8655du(4), Integer.TYPE)).intValue(), c10155jd.m49936du()).m49980kk();
    }

    /* JADX INFO: renamed from: to */
    private static String m22161to(List<C12314dy> list) {
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<C12314dy> it = list.iterator();
        while (it.hasNext()) {
            try {
                C12320ks c12320ks = (C12320ks) C7019kk.m27452k4((Object) it.next(), C12320ks.class);
                if (c12320ks != null) {
                    c6765kp.m26792k4(c12320ks.mo57603b3());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    private static C12015qq m22163x1(C12317jd c12317jd) {
        Object objM8655du = c12317jd.m8655du(48);
        Class cls = Integer.TYPE;
        return new C12015qq(((Integer) C7019kk.m27464to(objM8655du, cls)).intValue() / 1000.0f, ((Integer) C7019kk.m27464to(c12317jd.m8655du(49), cls)).intValue() / 1000.0f);
    }

    @Override // com.aspose.slides.internal.p198j2.C5188kk, com.aspose.slides.internal.p425tq.AbstractC11080du, com.aspose.slides.internal.p425tq.InterfaceC11079ck
    /* JADX INFO: renamed from: dy */
    public String mo22102dy() {
        return "application/X-fop-ex-aps";
    }

    /* JADX INFO: renamed from: to */
    private static boolean m22162to(C12317jd c12317jd) {
        return c12317jd.m8662h4(51) && ((Integer) c12317jd.m8655du(51)).intValue() == 149;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    @Override // com.aspose.slides.internal.p198j2.C5188kk, com.aspose.slides.internal.p425tq.AbstractC11080du
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo22125k4(C12317jd c12317jd) throws Throwable {
        Throwable th;
        C5190to c5190to;
        C10960jd c10960jd;
        C10953ck c10953ck;
        String strM22138x1 = m22138x1((C1606x1) c12317jd);
        new C12007ix();
        C12007ix c12007ix = new C12007ix(this.f38412to / 1000.0f, this.f38410kk.m53612k4() / 1000.0f, c12317jd.m8678x1() / 1000.0f, c12317jd.mo8658e_() / 1000.0f);
        C4317dy c4317dy = new C4317dy();
        c4317dy.m17348x1(0.0f, c12317jd.m57577um() / 1000.0f);
        c4317dy.m17332k4(c12007ix.Clone()).CloneTo(c12007ix);
        float fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56554dy());
        m22129k4(strM22138x1, c12007ix.Clone());
        try {
            if (c12317jd.m8662h4(46)) {
                int iIntValue = ((Integer) c12317jd.m8655du(46)).intValue();
                try {
                    if (iIntValue == 39) {
                        this.f14188wl = null;
                        this.f14187qq = iIntValue;
                    } else if (iIntValue == 214) {
                        c5190to = this;
                    } else {
                        AbstractC10981yj abstractC10981yj = this.f14188wl;
                        if (abstractC10981yj == null || !C14113y2.m67363du(abstractC10981yj.m53113ar(), strM22138x1)) {
                            c5190to = this;
                            try {
                                c5190to.m22159k4(iIntValue, m22158ix().Clone(), m22163x1(c12317jd).Clone(), m22160kk(c12317jd), m22138x1((C1606x1) c12317jd), fOooO0O0);
                                AbstractC10981yj abstractC10981yj2 = c5190to.f14188wl;
                                if (abstractC10981yj2 != null) {
                                    abstractC10981yj2.m53115kk(strM22138x1);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                m22135rv();
                                throw th;
                            }
                        }
                    }
                    c5190to = this;
                } catch (Throwable th3) {
                    th = th3;
                    m22135rv();
                    throw th;
                }
            }
            if (c12317jd.m8662h4(50) && ((Integer) c12317jd.m8655du(50)).intValue() == 149) {
                int i = c5190to.f14187qq;
                if (i == 207) {
                    C10947ak c10947ak = (C10947ak) C7019kk.m27452k4((Object) c5190to.f14188wl, C10947ak.class);
                    if (c10947ak != null) {
                        c10947ak.m52864k4(C14113y2.m67411k4(c10947ak.m52866kk()) ? m22161to(c12317jd.f41182ck) : C14113y2.m67408k4(c10947ak.m52866kk(), C14113y2.m67407k4('\n', m22161to(c12317jd.f41182ck))));
                    }
                } else if (i == 212) {
                    C10956dy c10956dy = (C10956dy) C7019kk.m27452k4((Object) c5190to.f14188wl, C10956dy.class);
                    if (c10956dy != null) {
                        c10956dy.m52924k4(m22161to(c12317jd.f41182ck));
                    }
                } else if (i == 209) {
                    C10980yd c10980yd = (C10980yd) C7019kk.m27452k4((Object) c5190to.f14188wl, C10980yd.class);
                    if (c10980yd != null) {
                        c10980yd.m53146x1(m22161to(c12317jd.f41182ck));
                    }
                } else if (i == 210 && (c10953ck = (C10953ck) C7019kk.m27452k4((Object) c5190to.f14188wl, C10953ck.class)) != null) {
                    if (c10953ck.m52918x1() == null) {
                        c10953ck.m52914k4(new List<>());
                    }
                    String strM22161to = m22161to(c12317jd.f41182ck);
                    if (C14113y2.m67363du(strM22161to, "@{EMPTY_VALUE}")) {
                        strM22161to = C14113y2.f47374k4;
                    }
                    c10953ck.m52918x1().addItem(strM22161to);
                    if (m22162to(c12317jd)) {
                        c10953ck.m52913k4(c10953ck.m52918x1().size() - 1);
                    }
                }
            }
            if (m22162to(c12317jd)) {
                int i2 = c5190to.f14187qq;
                if (i2 == 208) {
                    c10960jd = (C10960jd) C7019kk.m27452k4((Object) c5190to.f14188wl, C10960jd.class);
                    if (c10960jd != null) {
                        c10960jd.m52946k4(true);
                    }
                } else if (i2 == 209 && (c10960jd = (C10980yd) C7019kk.m27452k4((Object) c5190to.f14188wl, C10980yd.class)) != null) {
                    c10960jd.m52946k4(true);
                }
            }
            if (c12317jd.m8662h4(46) && ((Integer) C7019kk.m27464to(c12317jd.m8655du(46), Integer.TYPE)).intValue() == 214) {
                mo22139x1();
                super.mo22125k4(c12317jd);
                c5190to.f14188wl.m53143k4(m22142x6());
                mo22132kk();
                m22142x6().m52932x1(c5190to.f14188wl.m53140c5());
            } else {
                super.mo22125k4(c12317jd);
            }
            m22135rv();
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
