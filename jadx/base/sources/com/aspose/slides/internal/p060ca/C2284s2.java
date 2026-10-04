package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.internal.p060ca.C1996ae;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.s2 */
/* JADX INFO: loaded from: classes3.dex */
public class C2284s2 extends AbstractC2177li {

    /* JADX INFO: renamed from: k4 */
    private C2033cj f7849k4;

    /* JADX INFO: renamed from: kk */
    private C2377xv f7850kk;

    /* JADX INFO: renamed from: x1 */
    private C2132iq f7852x1;

    /* JADX INFO: renamed from: to */
    private C2092fz f7851to = C2092fz.m10543k4();

    /* JADX INFO: renamed from: du */
    private int f7848du = 0;

    /* JADX INFO: renamed from: kk */
    private void m11360kk() {
        C1996ae c1996ae = (C1996ae) C7019kk.m27452k4((Object) this.f7849k4, C1996ae.class);
        if (c1996ae != null) {
            this.f7852x1.m10756to(c1996ae.m10136h4().m10148x1());
            this.f7852x1.m10743k4(new C2038cx(c1996ae.mo10137k4()));
            this.f7852x1.m10746k4(c1996ae.m10136h4().m10148x1());
            this.f7852x1.m10760x1("Regular");
            double dMo10317to = (this.f7852x1.mo10258c5().mo10317to() & 4294967295L) / (((double) (c1996ae.m10136h4().m10147kk() * ((C1996ae.kk) c1996ae.m10136h4()).m10146k4())) / 72.0d);
            Dictionary.KeyCollection.Enumerator<Integer, C1996ae.x1> it = c1996ae.m10135du().getKeys().iterator();
            while (it.hasNext()) {
                try {
                    Integer num = (Integer) C7019kk.m27464to(it.next(), Integer.TYPE);
                    num.intValue();
                    C1996ae.k4 k4Var = (C1996ae.k4) c1996ae.m10135du().get_Item(num);
                    C2068ei c2068ei = new C2068ei();
                    new C2198mq(c2068ei, dMo10317to).m11127k4(k4Var);
                    c2068ei.m10478kk((((double) k4Var.m10142k4()) / 4.0d) * dMo10317to);
                    this.f7852x1.mo10263jd().mo10988k4(this.f7852x1.m10740k4(c2068ei), (char) k4Var.m10150m9());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            C3152yj c3152yj = new C3152yj();
            try {
                AbstractC2406ze.m11819k4(this.f7852x1, c3152yj).mo10714k4();
                c3152yj.close();
                byte[] array = c3152yj.toArray();
                c3152yj.dispose();
                this.f7852x1 = (C2132iq) AbstractC2313tw.m11467k4(0, new C2350wl(array));
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m11361to() {
        C2212n9 c2212n9 = new C2212n9(this.f7850kk.mo11248k4());
        try {
            c2212n9.m11159k4(this.f7850kk.mo11248k4().m10241du());
            this.f7851to.m10571k4(new C2354ws(c2212n9.m11164up(), c2212n9.m11151fa(), c2212n9.m11151fa(), c2212n9.m11151fa(), c2212n9.m11151fa()));
            for (int i = 0; i < (this.f7851to.m10580x1().m11619k4() & 65535); i++) {
                this.f7852x1.m10747k4(c2212n9.m11166x1(4), this.f7850kk, c2212n9.m11164up(), c2212n9.m11164up(), c2212n9.m11164up());
            }
            m11358k4("head", this.f7851to.m10572kk(), c2212n9);
            m11359k4("name", this.f7851to.m10577to(), c2212n9, false);
            m11358k4("maxp", this.f7851to.m10547du(), c2212n9);
            m11359k4("loca", this.f7851to.m10550h4(), c2212n9, false);
            m11359k4("cmap", this.f7851to.m10548dy(), c2212n9, false);
            m11359k4("hhea", this.f7851to.m10545c5(), c2212n9, false);
            m11359k4("hmtx", this.f7851to.m10552jd(), c2212n9, false);
            m11359k4("post", this.f7851to.m10546ck(), c2212n9, false);
            m11359k4("glyf", this.f7851to.m10574m9(), c2212n9, false);
            m11359k4("kern", this.f7851to.m10549fa(), c2212n9, false);
            m11359k4("cff", this.f7851to.m10579up(), c2212n9, false);
            m11359k4("cvt", this.f7851to.m10582yj(), c2212n9, false);
            m11359k4("fpgm", this.f7851to.m10573ks(), c2212n9, false);
            m11359k4("prep", this.f7851to.m10576rv(), c2212n9, false);
            m11359k4("OS/2", this.f7851to.m10581x6(), c2212n9, false);
            m11359k4("GDEF", this.f7851to.m10578u4(), c2212n9, false);
            m11359k4("GSUB", this.f7851to.m10551ix(), c2212n9, false);
            m11359k4("GPOS", this.f7851to.m10575ne(), c2212n9, false);
            if (this.f7852x1.m10758x1().m10577to() != null) {
                C2132iq c2132iq = this.f7852x1;
                c2132iq.m10756to(c2132iq.m10758x1().m10577to().m11091x1(4));
                C2132iq c2132iq2 = this.f7852x1;
                c2132iq2.m10743k4(c2132iq2.m10758x1().m10577to().m11089k4(4));
                C2132iq c2132iq3 = this.f7852x1;
                c2132iq3.m10759x1(c2132iq3.m10758x1().m10577to().m11089k4(6));
                C2132iq c2132iq4 = this.f7852x1;
                c2132iq4.m10746k4(c2132iq4.m10758x1().m10577to().m11091x1(1));
                C2132iq c2132iq5 = this.f7852x1;
                c2132iq5.m10760x1(c2132iq5.m10758x1().m10577to().m11091x1(2));
            }
            c2212n9.dispose();
        } catch (Throwable th) {
            c2212n9.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m11362x1() {
        C1996ae c1996ae = (C1996ae) C7019kk.m27452k4((Object) this.f7849k4, C1996ae.class);
        if (c1996ae != null) {
            this.f7852x1.m10756to(c1996ae.m10136h4().m10148x1());
            this.f7852x1.m10743k4(new C2038cx(c1996ae.mo10137k4()));
            this.f7852x1.m10746k4(c1996ae.m10136h4().m10148x1());
            this.f7852x1.m10758x1().m10568k4(new C2285s4(this.f7850kk, 0L, 0L, 0L));
            C2132iq c2132iq = (C2132iq) AbstractC2313tw.m11468k4(0, this.f7852x1, new C2384y6(false));
            c2132iq.m10756to(c1996ae.m10136h4().m10148x1());
            c2132iq.m10743k4(new C2038cx(c1996ae.m10136h4().m10148x1()));
            Dictionary.KeyCollection.Enumerator<Integer, C1996ae.x1> it = c1996ae.m10138to().getKeys().iterator();
            while (it.hasNext()) {
                try {
                    Integer num = (Integer) C7019kk.m27464to(it.next(), Integer.TYPE);
                    int iIntValue = num.intValue();
                    C1996ae.h4 h4Var = (C1996ae.h4) c1996ae.m10138to().get_Item(num);
                    C2068ei c2068eiM10741k4 = this.f7852x1.m10741k4(iIntValue);
                    if (C7019kk.m27469x1(c2068eiM10741k4, C2396yw.class)) {
                        c2068eiM10741k4 = ((C2396yw) c2068eiM10741k4).m11777k4();
                    }
                    if (this.f7852x1.m10758x1().m10552jd() == null) {
                        c2068eiM10741k4.m10478kk(h4Var.m10140k4());
                    }
                    c2132iq.mo10263jd().mo10988k4(c2132iq.m10740k4(c2068eiM10741k4), (char) h4Var.m10150m9());
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
            C3152yj c3152yj = new C3152yj();
            try {
                AbstractC2406ze.m11819k4(c2132iq, c3152yj).mo10714k4();
                c3152yj.close();
                byte[] array = c3152yj.toArray();
                c3152yj.dispose();
                this.f7852x1 = (C2132iq) AbstractC2313tw.m11467k4(0, new C2350wl(array));
            } catch (Throwable th2) {
                c3152yj.dispose();
                throw th2;
            }
        }
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2177li
    /* JADX INFO: renamed from: k4 */
    public AbstractC2313tw mo11021k4(C2033cj c2033cj) {
        try {
            this.f7849k4 = c2033cj;
            m11357k4();
            int i = this.f7848du;
            if (i == 0 || i == 1) {
                m11361to();
            } else if (i == 2) {
                m11361to();
                m11362x1();
            } else if (i == 3) {
                m11360kk();
            }
        } catch (EndOfStreamException e) {
            if (C2063e8.m10448k4().m10449kk() != 1) {
                throw new C2209n4("Unexpected font parsing exception", e);
            }
        } catch (C2096ga e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw new C2209n4("Unexpected font parsing exception", e3);
        }
        return this.f7852x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m11357k4() {
        String strM67431to;
        C2299sz c2299sz;
        C2033cj c2033cj = this.f7849k4;
        if (c2033cj == null) {
            throw new C2225o3("Font creation error. Could not find the font.");
        }
        this.f7848du = 0;
        if (C7019kk.m27469x1(c2033cj, C1996ae.class)) {
            if (!C7019kk.m27469x1(((C1996ae) this.f7849k4).m10136h4(), C1996ae.du.class)) {
                this.f7852x1 = new C2132iq();
                this.f7848du = 3;
                return;
            } else {
                C2132iq c2132iq = new C2132iq(this.f7849k4, this.f7851to);
                this.f7852x1 = c2132iq;
                this.f7850kk = new C2248po((C1996ae) this.f7849k4, c2132iq, this.f7851to);
                this.f7848du = 2;
                return;
            }
        }
        C2299sz c2299sz2 = null;
        if (this.f7849k4.m10333kk().length == 1 && this.f7849k4.m10333kk()[0].m11429x1() == null) {
            C2405zd c2405zd = (C2405zd) C7019kk.m27452k4((Object) this.f7849k4.m10333kk()[0].m11428kk(), C2405zd.class);
            strM67431to = c2405zd != null ? C14113y2.m67431to(C14113y2.m67368h4(C3141rv.m13397du(c2405zd.m11818k4())), FilenameUtils.EXTENSION_SEPARATOR) : null;
            c2299sz = this.f7849k4.m10333kk()[0];
        } else {
            String strM11429x1 = null;
            C2299sz c2299sz3 = null;
            for (int length = this.f7849k4.m10333kk().length - 1; length >= 0; length--) {
                if (C14113y2.m67363du(this.f7849k4.m10333kk()[length].m11429x1(), C2145ji.m10842k4()) || C14113y2.m67363du(this.f7849k4.m10333kk()[length].m11429x1(), C2145ji.m10843kk()) || C14113y2.m67363du(this.f7849k4.m10333kk()[length].m11429x1(), C2145ji.m10845x1()) || C14113y2.m67363du(this.f7849k4.m10333kk()[length].m11429x1(), C2145ji.m10844to()) || C14113y2.m67363du(this.f7849k4.m10333kk()[length].m11429x1(), C2145ji.m10841du())) {
                    strM11429x1 = this.f7849k4.m10333kk()[length].m11429x1();
                    c2299sz3 = this.f7849k4.m10333kk()[length];
                }
            }
            strM67431to = strM11429x1;
            c2299sz = c2299sz3;
        }
        if (C14113y2.m67411k4(strM67431to)) {
            strM67431to = "ttf";
        }
        if (c2299sz != null) {
            if (C14113y2.m67363du(strM67431to, C2145ji.m10842k4()) || C14113y2.m67363du(strM67431to, C2145ji.m10843kk()) || C14113y2.m67363du(strM67431to, C2145ji.m10845x1())) {
                c2299sz2 = c2299sz;
            } else if (C14113y2.m67363du(strM67431to, C2145ji.m10844to()) || C14113y2.m67363du(strM67431to, C2145ji.m10841du())) {
                this.f7848du = 1;
                AbstractC3150x6 abstractC3150x6Mo10245x1 = c2299sz.m11428kk().mo10245x1();
                try {
                    C3152yj c3152yj = new C3152yj();
                    try {
                        new C2012bg(abstractC3150x6Mo10245x1).m10253k4(c3152yj);
                        c3152yj.close();
                        C2033cj c2033cj2 = new C2033cj(0, "ttf", new C2350wl(c3152yj.toArray()));
                        this.f7849k4 = c2033cj2;
                        c2299sz2 = c2033cj2.m10333kk()[0];
                    } finally {
                        c3152yj.dispose();
                    }
                } finally {
                    if (abstractC3150x6Mo10245x1 != null) {
                        abstractC3150x6Mo10245x1.dispose();
                    }
                }
            }
        }
        if (c2299sz2 == null) {
            throw new C2222nz("could not load font");
        }
        C2132iq c2132iq2 = new C2132iq(this.f7849k4, this.f7851to);
        this.f7852x1 = c2132iq2;
        this.f7850kk = new C2377xv(c2299sz2, c2132iq2, this.f7851to);
    }

    /* JADX INFO: renamed from: k4 */
    private void m11358k4(String str, C2236ov c2236ov, C2212n9 c2212n9) {
        m11359k4(str, c2236ov, c2212n9, true);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m11359k4(String str, C2236ov c2236ov, C2212n9 c2212n9, boolean z) {
        if (c2236ov == null || (c2236ov.m11222wy() & 4294967295L) >= c2212n9.m11165x1()) {
            if (z) {
                if (c2236ov != null) {
                    throw new C2243pd(C14113y2.m67402k4("The required table '{0}' is out of file. The font file is broken.", str));
                }
                throw new C2243pd(C14113y2.m67402k4("The required table '{0}' was not found.", str));
            }
            return;
        }
        try {
            long jM11154k4 = c2212n9.m11154k4();
            c2236ov.mo10299k4(c2212n9);
            c2212n9.m11159k4(jM11154k4);
        } catch (EndOfStreamException e) {
            if (C2063e8.m10448k4().m10449kk() != 1) {
                throw new C2209n4("Unexpected font parsing exception", e);
            }
        } catch (RuntimeException e2) {
            throw new C2243pd(C14113y2.m67402k4("Parsing of table '{0}' has failed.", str), e2);
        }
    }
}
