package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p346pw.C9575x1;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.internal.p505xn.C12561ix;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p505xn.C12570to;
import com.aspose.slides.internal.p505xn.C12571u4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.bz */
/* JADX INFO: loaded from: classes4.dex */
public class C9760bz {

    /* JADX INFO: renamed from: c5 */
    private C9799x1 f35252c5;

    /* JADX INFO: renamed from: ck */
    private C12570to f35253ck;

    /* JADX INFO: renamed from: du */
    private C9803yd f35254du;

    /* JADX INFO: renamed from: dy */
    private C9792um f35255dy;

    /* JADX INFO: renamed from: fa */
    private C3152yj f35256fa;

    /* JADX INFO: renamed from: h4 */
    private C9770g8 f35257h4;

    /* JADX INFO: renamed from: jd */
    private C9801xk f35258jd;

    /* JADX INFO: renamed from: k4 */
    private C12564kk f35259k4;

    /* JADX INFO: renamed from: kk */
    private C9781ne f35260kk;

    /* JADX INFO: renamed from: ks */
    private int f35261ks;

    /* JADX INFO: renamed from: m9 */
    private C9791u4 f35262m9;

    /* JADX INFO: renamed from: rv */
    private final IGenericDictionary<String, Long> f35263rv = C9575x1.m46750k4();

    /* JADX INFO: renamed from: to */
    private C9783qq f35264to;

    /* JADX INFO: renamed from: up */
    private C3152yj f35265up;

    /* JADX INFO: renamed from: x1 */
    private C12571u4<C9788t6> f35266x1;

    /* JADX INFO: renamed from: x6 */
    private long[] f35267x6;

    /* JADX INFO: renamed from: yj */
    private C3152yj f35268yj;

    /* JADX INFO: renamed from: ne */
    private static final String[] f35249ne = {"head", "hhea", "maxp", "hmtx", "fpgm", "prep", "cvt ", "loca", "glyf"};

    /* JADX INFO: renamed from: ix */
    private static final String[] f35248ix = {"OS/2", "name", "cmap", "post"};

    /* JADX INFO: renamed from: u4 */
    private static final int[] f35250u4 = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};

    /* JADX INFO: renamed from: uz */
    private static final C9800x6[] f35251uz = new C9800x6[0];

    /* JADX INFO: renamed from: c5 */
    private void m47985c5() {
        m48003to("cmap");
        this.f35252c5 = new C9799x1(this.f35259k4);
    }

    /* JADX INFO: renamed from: ck */
    private void m47986ck() {
        C12565ks.m58614k4(this.f35253ck.m58666k4(), 4);
    }

    /* JADX INFO: renamed from: du */
    private void m47987du() {
        m48003to("maxp");
        this.f35254du = new C9803yd(this.f35259k4);
    }

    /* JADX INFO: renamed from: dy */
    private void m47989dy() {
        if (this.f35264to == null) {
            throw new InvalidOperationException("Need to read horizontal header first.");
        }
        if (this.f35254du == null) {
            throw new InvalidOperationException("Need to read maximum profile first.");
        }
        m48003to("hmtx");
        this.f35255dy = new C9792um(this.f35259k4, this.f35264to.f35365x6 & 65535, 65535 & this.f35254du.f35547x1);
    }

    /* JADX INFO: renamed from: fa */
    private boolean m47990fa() {
        this.f35259k4.m58602k4().setPosition(0L);
        if (!"ttcf".equals(C14113y2.m67405k4(this.f35259k4.m58607x1(4)))) {
            return false;
        }
        int iM58606x1 = this.f35259k4.m58606x1();
        if (iM58606x1 != 65536 && iM58606x1 != 131072) {
            return false;
        }
        int iM58606x12 = this.f35259k4.m58606x1();
        this.f35261ks = iM58606x12;
        this.f35267x6 = new long[iM58606x12];
        for (int i = 0; i < this.f35261ks; i++) {
            this.f35267x6[i] = this.f35259k4.m58604kk();
        }
        if (131072 != iM58606x1) {
            return true;
        }
        this.f35259k4.m58604kk();
        this.f35259k4.m58604kk();
        this.f35259k4.m58604kk();
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    private void m47991h4() {
        m48003to("name");
        m48006x1((int) this.f35259k4.m58602k4().getPosition());
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0285  */
    /* JADX INFO: renamed from: jd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C9790ts m47992jd() {
        int i;
        int i2;
        C9790ts c9790ts = new C9790ts();
        c9790ts.m48243x1(this.f35260kk.f35340h4 & 65535);
        c9790ts.m48227rv(this.f35260kk.f35345m9);
        c9790ts.m48247x6(this.f35260kk.f35338dy);
        c9790ts.m48224ne(this.f35260kk.f35335c5);
        c9790ts.m48190ix(this.f35260kk.f35341jd);
        c9790ts.m48211k4(this.f35260kk.f35349yj);
        if (m48017x1("CFF ") != null) {
            c9790ts.m48245x1(true);
            this.f35259k4.m58602k4().setPosition(r2.f35382kk);
            c9790ts.m48217kk(new C9776kk(this.f35259k4).m48099k4());
        }
        c9790ts.m48182du(((m48017x1("COLR") == null || m48017x1("CPAL") == null) && (m48017x1("CBDT") == null || m48017x1("CBLC") == null)) ? false : true);
        if (c9790ts.m48240wy()) {
            if (m48017x1("COLR") != null) {
                c9790ts.f35409kk = m48017x1("COLR").f35382kk;
                c9790ts.f35422to = m48017x1("CPAL").f35382kk;
            }
            if (m48017x1("CBDT") != null) {
                c9790ts.f35398du = m48017x1("CBDT").f35382kk;
                c9790ts.f35405h4 = m48017x1("CBLC").f35382kk;
            }
        }
        c9790ts.m48230to(m48017x1("GPOS") != null);
        if (m48017x1("kern") != null) {
            c9790ts.f35408k4 = r5.f35382kk;
        }
        if (m48017x1("GPOS") != null) {
            c9790ts.f35434x1 = r2.f35382kk;
        }
        c9790ts.f35413m9 = m48017x1("loca");
        c9790ts.f35399dy = m48017x1("glyf");
        float fM48175c5 = c9790ts.m48175c5() / 1.8f;
        float fM48175c52 = c9790ts.m48175c5() * 1.8f;
        C9791u4 c9791u4 = this.f35262m9;
        if (c9791u4 == null) {
            c9790ts.m48216kk(this.f35264to.f35364x1);
            c9790ts.m48229to(-this.f35264to.f35358kk);
            C9783qq c9783qq = this.f35264to;
            c9790ts.m48181du((c9783qq.f35364x1 - c9783qq.f35358kk) + c9783qq.f35362to);
            if (this.f35264to.f35358kk > 0) {
                c9790ts.m48216kk(this.f35260kk.f35341jd);
                c9790ts.m48229to(-this.f35260kk.f35338dy);
                c9790ts.m48181du(c9790ts.m48177ck() + c9790ts.m48191jd());
                C9783qq c9783qq2 = this.f35264to;
                c9790ts.m48203k4((float) (((-C14116yg.m67498to(c9783qq2.f35356jd, c9783qq2.f35350c5)) * 180.0d) / 3.141592653589793d));
                c9790ts.m48204k4(this.f35260kk.m48130k4());
                if (C12565ks.m58621k4(c9790ts.m48215kk(), "Bold", true)) {
                    c9790ts.m48204k4(c9790ts.m48183dy() | 1);
                }
                if (C12565ks.m58621k4(c9790ts.m48215kk(), "Italic", true)) {
                    c9790ts.m48204k4(c9790ts.m48183dy() | 2);
                }
                c9790ts.m48232u4(this.f35262m9.f35474xk);
                c9790ts.m48237uz(this.f35262m9.f35447dq);
                if (c9790ts.m48177ck() + c9790ts.m48191jd() > c9790ts.m48234up()) {
                    c9790ts.m48181du(c9790ts.m48177ck() + c9790ts.m48191jd());
                }
            }
            c9790ts.m48206k4(this.f35257h4);
            c9790ts.m48207k4(this.f35252c5.m48296k4(this.f35255dy));
            c9790ts.m48210k4(this.f35252c5);
            return c9790ts;
        }
        int i3 = c9791u4.f35443bv - c9791u4.f35469v4;
        float f = (c9791u4.f35475yd & 65535) + (c9791u4.f35442b3 & 65535);
        boolean z = f < fM48175c52 && f > fM48175c5;
        c9790ts.m48206k4(this.f35257h4);
        C9791u4 c9791u42 = this.f35262m9;
        boolean z2 = (c9791u42.f35443bv == 0 && c9791u42.f35469v4 == 0) || !z;
        c9790ts.m48216kk(z2 ? this.f35264to.f35364x1 : c9791u42.f35475yd & 65535);
        c9790ts.m48229to(z2 ? -this.f35264to.f35358kk : this.f35262m9.f35442b3 & 65535);
        if (z2 || !c9790ts.m48225qq()) {
            C9783qq c9783qq3 = this.f35264to;
            i = c9783qq3.f35364x1 - c9783qq3.f35358kk;
            i2 = c9783qq3.f35362to;
        } else {
            C9791u4 c9791u43 = this.f35262m9;
            i = c9791u43.f35475yd & 65535;
            i2 = c9791u43.f35442b3 & 65535;
        }
        c9790ts.m48181du(i + i2);
        if (this.f35262m9.f35469v4 > 0) {
            float f2 = i3;
            if ((f2 > fM48175c52 || f2 < fM48175c5) && !z && (c9790ts.m48234up() == 0 || c9790ts.m48234up() > fM48175c52 || c9790ts.m48234up() < fM48175c5)) {
                c9790ts.m48216kk(this.f35260kk.f35341jd);
                c9790ts.m48229to(-this.f35260kk.f35338dy);
                c9790ts.m48181du(c9790ts.m48177ck() + c9790ts.m48191jd());
                c9790ts.m48243x1(c9790ts.m48234up());
            } else if (this.f35264to.f35358kk > 0) {
                c9790ts.m48216kk(this.f35260kk.f35341jd);
                c9790ts.m48229to(-this.f35260kk.f35338dy);
                c9790ts.m48181du(c9790ts.m48177ck() + c9790ts.m48191jd());
            }
        }
        C9783qq c9783qq4 = this.f35264to;
        c9790ts.m48203k4((float) (((-C14116yg.m67498to(c9783qq4.f35356jd, c9783qq4.f35350c5)) * 180.0d) / 3.141592653589793d));
        c9790ts.m48192jd(this.f35262m9.f35476yj);
        c9790ts.m48219ks(this.f35262m9.f35457ks);
        c9790ts.m48235up(this.f35262m9.f35459m9);
        c9790ts.m48250yj(this.f35262m9.f35444c5);
        c9790ts.m48178ck(this.f35262m9.f35446ck);
        c9790ts.m48186fa(this.f35262m9.f35467up);
        C9791u4 c9791u44 = this.f35262m9;
        c9790ts.m48204k4((c9791u44.f35461qq & 65535) == 0 ? this.f35260kk.m48130k4() : c9791u44.m48251k4());
        c9790ts.m48213k4(this.f35262m9.f35473x6);
        c9790ts.m48244x1(this.f35262m9.f35462rv);
        if (C12565ks.m58621k4(c9790ts.m48215kk(), "Bold", true)) {
            c9790ts.m48204k4(c9790ts.m48183dy() | 1);
        }
        if (C12565ks.m58621k4(c9790ts.m48215kk(), "Italic", true)) {
            c9790ts.m48204k4(c9790ts.m48183dy() | 2);
        }
        c9790ts.m48232u4(this.f35262m9.f35474xk);
        c9790ts.m48237uz(this.f35262m9.f35447dq);
        c9790ts.m48207k4(this.f35252c5.m48296k4(this.f35255dy));
        c9790ts.m48210k4(this.f35252c5);
        if (c9790ts.m48177ck() + c9790ts.m48191jd() > c9790ts.m48234up()) {
            c9790ts.m48181du(c9790ts.m48177ck() + c9790ts.m48191jd());
        }
        int i4 = this.f35262m9.f35448du;
        c9790ts.m48212k4((i4 & 4) != 0 && (i4 & 8) == 0);
        c9790ts.m48188h4(this.f35262m9.f35461qq & 65535);
        c9790ts.m48222m9(this.f35262m9.f35443bv);
        c9790ts.m48184dy(this.f35262m9.f35469v4);
        C9791u4 c9791u45 = this.f35262m9;
        c9790ts.m48176c5((c9791u45.f35443bv - c9791u45.f35469v4) + c9791u45.f35458lr);
        return c9790ts;
    }

    /* JADX INFO: renamed from: k4 */
    private int m47993k4(boolean z) {
        this.f35253ck.m58668k4(65536);
        List<C9788t6> list = new List<>();
        m47997k4(f35249ne, list);
        if (z) {
            m47997k4(f35248ix, list);
        }
        this.f35253ck.m58671x1(list.size());
        int i = f35250u4[list.size()];
        int i2 = (1 << i) * 16;
        this.f35253ck.m58671x1(i2);
        this.f35253ck.m58671x1(i);
        this.f35253ck.m58671x1((list.size() * 16) - i2);
        int size = (list.size() * 16) + ((int) this.f35253ck.m58666k4().getPosition());
        List.Enumerator<C9788t6> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().m48159k4(this.f35253ck);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: kk */
    private void m47999kk() {
        m48003to("head");
        this.f35260kk = new C9781ne(this.f35259k4);
    }

    /* JADX INFO: renamed from: m9 */
    private void m48001m9() {
        if (m48017x1("OS/2") != null) {
            this.f35259k4.m58602k4().setPosition(r0.f35382kk);
            this.f35262m9 = new C9791u4(this.f35259k4);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m48002to() {
        m48003to("hhea");
        this.f35264to = new C9783qq(this.f35259k4);
    }

    /* JADX INFO: renamed from: up */
    private C9800x6[] m48004up() {
        if (this.f35261ks <= 0) {
            throw new InvalidOperationException("Can't read TTC entry.");
        }
        List list = new List();
        for (int i = 0; i < this.f35261ks; i++) {
            this.f35259k4.m58602k4().setPosition(this.f35267x6[i] & 4294967295L);
            int iM48005x1 = m48005x1();
            if (iM48005x1 <= 0) {
                throw new InvalidOperationException("Can't read TTC entry.");
            }
            for (int i2 = 0; i2 < iM48005x1; i2++) {
                C9788t6 c9788t6 = new C9788t6(this.f35259k4);
                if ("name".equals(c9788t6.f35381k4)) {
                    int i3 = c9788t6.f35382kk;
                    this.f35259k4.m58602k4().setPosition(i3);
                    m48006x1(i3);
                    for (String str : this.f35257h4.m48076to(4)) {
                        this.f35263rv.set_Item(str, Long.valueOf(this.f35267x6[i]));
                    }
                    C9800x6[] c9800x6ArrM48074k4 = this.f35257h4.m48074k4();
                    if (c9800x6ArrM48074k4 != null) {
                        list.addRange(AbstractC14092to.m67204k4((Object[]) c9800x6ArrM48074k4));
                    }
                }
            }
        }
        return (C9800x6[]) list.toArray(new C9800x6[0]);
    }

    /* JADX INFO: renamed from: x1 */
    private int m48005x1() {
        int iM58606x1 = this.f35259k4.m58606x1();
        if (iM58606x1 != 65536 && iM58606x1 != 1330926671) {
            return -1;
        }
        int iM58600du = this.f35259k4.m58600du() & 65535;
        this.f35259k4.m58600du();
        this.f35259k4.m58600du();
        this.f35259k4.m58600du();
        return iM58600du;
    }

    /* JADX INFO: renamed from: du */
    private void m47988du(String str) {
        C9788t6 c9788t6M48017x1 = m48017x1(str);
        if (c9788t6M48017x1 == null) {
            return;
        }
        this.f35259k4.m58602k4().setPosition(c9788t6M48017x1.f35382kk);
        byte[] bArrM58603k4 = this.f35259k4.m58603k4(c9788t6M48017x1.f35383to);
        c9788t6M48017x1.f35382kk = (int) this.f35253ck.m58666k4().getPosition();
        this.f35253ck.m58670k4(bArrM58603k4, 0, bArrM58603k4.length);
        m47986ck();
    }

    /* JADX INFO: renamed from: kk */
    private void m48000kk(String str) {
        if (!m47990fa()) {
            if (!m47998k4(0)) {
                throw new InvalidOperationException("The file is not recognized as a TTF or TTC font.");
            }
            return;
        }
        m48004up();
        Long[] lArr = {0L};
        boolean z = (this.f35263rv.tryGetValue(str, lArr) && m47998k4(lArr[0].intValue())) ? false : true;
        lArr[0].getClass();
        if (z) {
            throw new InvalidOperationException("The TTC font is invalid.");
        }
    }

    /* JADX INFO: renamed from: to */
    private void m48003to(String str) {
        this.f35259k4.m58602k4().setPosition(m48009k4(str).f35382kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Integer, C9786ss> m48008k4(C9790ts c9790ts, C12561ix c12561ix, int i) {
        if (c9790ts == null) {
            throw new ArgumentNullException("font");
        }
        if (c12561ix == null) {
            throw new ArgumentNullException("oldToNewGlyphIndexes");
        }
        AbstractC3150x6 abstractC3150x6Mo47984x1 = c9790ts.m48233um().mo47984x1();
        try {
            byte[] bArrM58632x1 = C12565ks.m58632x1(abstractC3150x6Mo47984x1);
            if ("OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(bArrM58632x1, 0, 4))) {
                bArrM58632x1 = C11240k4.m54219k4(bArrM58632x1);
            }
            C3152yj c3152yj = new C3152yj(bArrM58632x1);
            try {
                this.f35259k4 = new C12564kk(c3152yj);
                m48000kk(c9790ts.m48228to());
                m47999kk();
                C9796wl c9796wl = new C9796wl(this.f35259k4, this.f35260kk.f35349yj == 0);
                if (m48017x1("CFF ") != null) {
                    c9790ts.m48245x1(true);
                    this.f35259k4.m58602k4().setPosition(r4.f35382kk);
                    c9790ts.m48217kk(new C9776kk(this.f35259k4).m48099k4());
                }
                C9788t6 c9788t6M48017x1 = m48017x1("CFF ");
                C9788t6 c9788t6M48017x12 = m48017x1("loca");
                if (c9788t6M48017x12 != null || c9788t6M48017x1 == null) {
                    Dictionary<Integer, C9786ss> dictionaryM48280k4 = c9796wl.m48280k4(c9788t6M48017x12, m48009k4("glyf"), c12561ix, i);
                    c3152yj.dispose();
                    return dictionaryM48280k4;
                }
                Dictionary<Integer, C9786ss> dictionary = new Dictionary<>();
                c3152yj.dispose();
                return dictionary;
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        } finally {
            if (abstractC3150x6Mo47984x1 != null) {
                abstractC3150x6Mo47984x1.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C9788t6 m48017x1(String str) {
        C9788t6[] c9788t6Arr = {null};
        C12571u4<C9788t6> c12571u4 = this.f35266x1;
        if (c12571u4 != null) {
            c12571u4.tryGetValue(str, c9788t6Arr);
        }
        return c9788t6Arr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m48006x1(int i) {
        AbstractC6747ar abstractC6747arM26649x6;
        String strM26681x1;
        if ((this.f35259k4.m58600du() & 65535) != 0) {
            throw new InvalidOperationException("Unsupported Name table format.");
        }
        int iM58600du = this.f35259k4.m58600du();
        int iM58600du2 = this.f35259k4.m58600du();
        this.f35257h4 = new C9770g8();
        int i2 = 0;
        for (int i3 = 65535; i2 < (iM58600du & i3); i3 = 65535) {
            int iM58600du3 = this.f35259k4.m58600du() & i3;
            int iM58600du4 = this.f35259k4.m58600du() & i3;
            int iM58600du5 = this.f35259k4.m58600du() & i3;
            int iM58600du6 = this.f35259k4.m58600du() & i3;
            int iM58600du7 = this.f35259k4.m58600du() & i3;
            int iM58600du8 = this.f35259k4.m58600du() & i3;
            if (iM58600du3 == 0) {
                abstractC6747arM26649x6 = AbstractC6747ar.m26649x6();
            } else if (iM58600du3 != 1) {
                if (iM58600du3 != 3) {
                    abstractC6747arM26649x6 = null;
                } else if (iM58600du4 == 4) {
                    abstractC6747arM26649x6 = C12555c5.m58553k4("big5");
                } else if (iM58600du4 != 1 && iM58600du4 != 10 && iM58600du4 != 0) {
                    abstractC6747arM26649x6 = C12555c5.m58553k4("utf-16be");
                }
            } else if (iM58600du4 != 2) {
                abstractC6747arM26649x6 = (iM58600du4 == 0 || iM58600du4 == 1 || iM58600du4 == 3 || iM58600du4 == 25) ? C12555c5.m58552k4(1252) : AbstractC6747ar.m26635ix();
            }
            if (abstractC6747arM26649x6 != null) {
                int position = (int) this.f35259k4.m58602k4().getPosition();
                this.f35259k4.m58602k4().setPosition(i + (iM58600du2 & i3) + iM58600du8);
                byte[] bArrM58603k4 = this.f35259k4.m58603k4(iM58600du7);
                if ("big5".equals(abstractC6747arM26649x6.mo26657jd())) {
                    byte[] bArr = new byte[bArrM58603k4.length];
                    int i4 = 0;
                    for (byte b : bArrM58603k4) {
                        if ((b & 255) != 0) {
                            bArr[i4] = b;
                            i4++;
                        }
                    }
                    strM26681x1 = abstractC6747arM26649x6.mo26682x1(bArr, 0, i4);
                } else {
                    strM26681x1 = abstractC6747arM26649x6.m26681x1(bArrM58603k4);
                }
                if (this.f35257h4.m48072k4(iM58600du6, iM58600du5) == null) {
                    this.f35257h4.m48073k4(iM58600du6, iM58600du5, strM26681x1);
                }
                this.f35259k4.m58602k4().setPosition(position);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C9788t6 m48009k4(String str) {
        C9788t6 c9788t6M48017x1 = m48017x1(str);
        if (c9788t6M48017x1 != null) {
            return c9788t6M48017x1;
        }
        throw new InvalidOperationException(C14113y2.m67402k4("Cannot find table '{0}' in the font file.", str));
    }

    /* JADX INFO: renamed from: x1 */
    private void m48007x1(boolean z) {
        m47988du("head");
        m47995k4("hhea", this.f35264to.m48052to());
        m47995k4("maxp", this.f35254du.m48052to());
        m47995k4("hmtx", this.f35268yj);
        m47988du("fpgm");
        m47988du("prep");
        m47988du("cvt ");
        m47995k4("loca", this.f35256fa);
        m47995k4("glyf", this.f35265up);
        if (z) {
            m47988du("OS/2");
            m47988du("name");
            m47995k4("cmap", this.f35252c5.m48052to());
            m47995k4("post", this.f35258jd.m48052to());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C9790ts m48010k4(AbstractC3150x6 abstractC3150x6, String str) {
        this.f35259k4 = new C12564kk(abstractC3150x6);
        m48000kk(str);
        m47999kk();
        m47991h4();
        m48002to();
        m48001m9();
        m47987du();
        m47989dy();
        m47985c5();
        return m47992jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final C9790ts m48011k4(AbstractC9784rv abstractC9784rv, String str) {
        AbstractC3150x6 abstractC3150x6Mo47984x1 = abstractC9784rv.mo47984x1();
        try {
            C9790ts c9790tsM48010k4 = m48010k4(abstractC3150x6Mo47984x1, str);
            c9790tsM48010k4.m48208k4(abstractC9784rv);
            return c9790tsM48010k4;
        } finally {
            if (abstractC3150x6Mo47984x1 != null) {
                abstractC3150x6Mo47984x1.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C9790ts m48012k4(String str, String str2) {
        return m48011k4(new C9793up(str), str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final C9790ts m48013k4(byte[] bArr, String str) {
        return m48011k4(new C9758b3(bArr), str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m47994k4() {
        m48003to("post");
        this.f35258jd = new C9801xk(this.f35259k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48014k4(C9790ts c9790ts, AbstractC3150x6 abstractC3150x6) {
        if (c9790ts == null) {
            throw new ArgumentNullException("font");
        }
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("dstStream");
        }
        if (!c9790ts.m48225qq()) {
            throw new InvalidOperationException("OpenType font with CFF table is required.");
        }
        AbstractC3150x6 abstractC3150x6Mo47984x1 = c9790ts.m48233um().mo47984x1();
        try {
            this.f35259k4 = new C12564kk(abstractC3150x6Mo47984x1);
            m48000kk(c9790ts.m48228to());
            C9788t6 c9788t6M48017x1 = m48017x1("CFF ");
            if (c9788t6M48017x1 == null) {
                throw new InvalidOperationException("There is no CFF table in font file.");
            }
            this.f35259k4.m58602k4().setPosition(c9788t6M48017x1.f35382kk);
            int i = c9788t6M48017x1.f35383to;
            byte[] bArr = new byte[i];
            this.f35259k4.m58602k4().read(bArr, 0, i);
            abstractC3150x6.write(bArr, 0, i);
        } finally {
            if (abstractC3150x6Mo47984x1 != null) {
                abstractC3150x6Mo47984x1.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48015k4(C9790ts c9790ts, C12561ix c12561ix, C12561ix c12561ix2, AbstractC3150x6 abstractC3150x6, boolean z, boolean z2) {
        if (c9790ts == null) {
            throw new ArgumentNullException("font");
        }
        if (c12561ix2 == null) {
            throw new ArgumentNullException("oldToNewGlyphIndexes");
        }
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("dstStream");
        }
        AbstractC3150x6 abstractC3150x6Mo47984x1 = c9790ts.m48233um().mo47984x1();
        try {
            this.f35259k4 = new C12564kk(abstractC3150x6Mo47984x1);
            m48000kk(c9790ts.m48228to());
            if (z2 || c9790ts.m48225qq()) {
                abstractC3150x6Mo47984x1 = c9790ts.m48233um().mo47984x1();
                try {
                    C12565ks.m58615k4(abstractC3150x6Mo47984x1, abstractC3150x6);
                    if (abstractC3150x6Mo47984x1 != null) {
                        abstractC3150x6Mo47984x1.dispose();
                    }
                } finally {
                    if (abstractC3150x6Mo47984x1 != null) {
                        abstractC3150x6Mo47984x1.dispose();
                    }
                }
            } else {
                m47999kk();
                m48002to();
                m47987du();
                m47989dy();
                if (z) {
                    m47985c5();
                    m47994k4();
                }
                C9796wl c9796wl = new C9796wl(this.f35259k4, this.f35260kk.f35349yj == 0);
                int iM48278k4 = c9796wl.m48278k4(m48009k4("loca"), m48009k4("glyf"), this.f35255dy, c12561ix2);
                int i = iM48278k4 & 65535;
                if ((iM48278k4 & 65535) != c12561ix2.m58582k4()) {
                    throw new InvalidOperationException("Unexpected used glyphs count!");
                }
                this.f35256fa = c9796wl.m48281k4();
                this.f35265up = c9796wl.m48283x1();
                this.f35268yj = c9796wl.m48282kk();
                this.f35254du.f35547x1 = i;
                this.f35264to.f35365x6 = i;
                if (z) {
                    this.f35252c5.m48297k4(c12561ix);
                    this.f35258jd.m48313k4(c12561ix2);
                }
                m47996k4(z, abstractC3150x6);
            }
        } catch (Throwable th) {
            if (abstractC3150x6Mo47984x1 != null) {
                abstractC3150x6Mo47984x1.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m47995k4(String str, C3152yj c3152yj) {
        C9788t6 c9788t6M48009k4 = m48009k4(str);
        c9788t6M48009k4.f35382kk = (int) this.f35253ck.m58666k4().getPosition();
        this.f35253ck.m58670k4(c3152yj.getBuffer(), 0, (int) c3152yj.getLength());
        c9788t6M48009k4.f35384x1 = C9788t6.m48158k4(c3152yj.getBuffer(), 0, (int) c3152yj.getLength());
        c9788t6M48009k4.f35383to = (int) c3152yj.getLength();
        m47986ck();
    }

    /* JADX INFO: renamed from: k4 */
    private void m47996k4(boolean z, AbstractC3150x6 abstractC3150x6) {
        this.f35253ck = new C12570to(abstractC3150x6);
        this.f35253ck.m58666k4().setPosition(m47993k4(z));
        m48007x1(z);
        this.f35253ck.m58666k4().setPosition(0L);
        m47993k4(z);
    }

    /* JADX INFO: renamed from: k4 */
    private void m47997k4(String[] strArr, List<C9788t6> list) {
        for (String str : strArr) {
            C9788t6 c9788t6M48017x1 = m48017x1(str);
            if (c9788t6M48017x1 != null) {
                list.addItem(c9788t6M48017x1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m47998k4(int i) {
        this.f35259k4.m58602k4().setPosition(i);
        int iM48005x1 = m48005x1();
        if (iM48005x1 <= 0) {
            return false;
        }
        this.f35266x1 = new C12571u4<>();
        for (int i2 = 0; i2 < iM48005x1; i2++) {
            C9788t6 c9788t6 = new C9788t6(this.f35259k4);
            this.f35266x1.addItem(c9788t6.f35381k4, c9788t6);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9800x6[] m48016k4(AbstractC9784rv abstractC9784rv) {
        C9800x6[] c9800x6ArrM48074k4;
        if (!abstractC9784rv.mo47983kk()) {
            return f35251uz;
        }
        AbstractC3150x6 abstractC3150x6Mo47984x1 = abstractC9784rv.mo47984x1();
        try {
            this.f35259k4 = new C12564kk(abstractC3150x6Mo47984x1);
            if (m47990fa()) {
                c9800x6ArrM48074k4 = m48004up();
                for (C9800x6 c9800x6 : c9800x6ArrM48074k4) {
                    c9800x6.m48304k4(abstractC9784rv);
                    c9800x6.m48306k4(true);
                }
            } else if (m47998k4(0)) {
                m47991h4();
                c9800x6ArrM48074k4 = this.f35257h4.m48074k4();
                for (C9800x6 c9800x62 : c9800x6ArrM48074k4) {
                    c9800x62.m48304k4(abstractC9784rv);
                    c9800x62.m48306k4(false);
                }
            } else {
                c9800x6ArrM48074k4 = null;
            }
            if (c9800x6ArrM48074k4 != null && this.f35266x1 != null) {
                m48001m9();
                for (C9800x6 c9800x63 : c9800x6ArrM48074k4) {
                    c9800x63.m48305k4(this.f35262m9);
                }
            }
            if (abstractC3150x6Mo47984x1 != null) {
                abstractC3150x6Mo47984x1.dispose();
            }
            return c9800x6ArrM48074k4;
        } catch (Throwable th) {
            if (abstractC3150x6Mo47984x1 != null) {
                abstractC3150x6Mo47984x1.dispose();
            }
            throw th;
        }
    }
}
