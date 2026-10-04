package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p060ca.C2146jl;
import com.aspose.slides.internal.p060ca.C2184m1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14049c6;
import com.aspose.slides.p559ms.System.AbstractC14071k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14111xk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.iq */
/* JADX INFO: loaded from: classes3.dex */
public class C2132iq extends AbstractC2313tw {

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f7343x6 = new C7017h4("arab", "name", "maxp", "head", "glyf", "loca", "cmap", "hhea", "hmtx", "post", "kern", "cff", "cvt", "fpgm", "prep", "os/2", "gdef", "gpos", "gsub");

    /* JADX INFO: renamed from: c5 */
    private String f7344c5;

    /* JADX INFO: renamed from: ck */
    private int f7345ck;

    /* JADX INFO: renamed from: du */
    private AbstractC2313tw f7346du;

    /* JADX INFO: renamed from: dy */
    private String f7347dy;

    /* JADX INFO: renamed from: fa */
    private C2038cx f7348fa;

    /* JADX INFO: renamed from: h4 */
    private Object f7349h4;

    /* JADX INFO: renamed from: jd */
    private String f7350jd;

    /* JADX INFO: renamed from: k4 */
    private C2168kt f7351k4;

    /* JADX INFO: renamed from: kk */
    private C2092fz f7352kk;

    /* JADX INFO: renamed from: ks */
    private Object f7353ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f7354m9;

    /* JADX INFO: renamed from: rv */
    private List<String> f7355rv;

    /* JADX INFO: renamed from: to */
    private C2033cj f7356to;

    /* JADX INFO: renamed from: up */
    private C2038cx f7357up;

    /* JADX INFO: renamed from: x1 */
    private C2395yu f7358x1;

    /* JADX INFO: renamed from: yj */
    private Object f7359yj;

    public C2132iq() {
        this.f7349h4 = new Object();
        this.f7359yj = new Object();
        this.f7353ks = new Object();
        this.f7355rv = new List<>();
        this.f7351k4 = new C2168kt(this);
        C2092fz c2092fzM10543k4 = C2092fz.m10543k4();
        this.f7352kk = c2092fzM10543k4;
        c2092fzM10543k4.m10560k4(new C2174la(c2092fzM10543k4, this));
        this.f7352kk.m10572kk().m11003h4((short) 1);
        C2092fz c2092fz = this.f7352kk;
        c2092fz.m10570k4(new C2344w5(c2092fz, this));
        C2092fz c2092fz2 = this.f7352kk;
        c2092fz2.m10558k4(new C2146jl(c2092fz2, this));
        C2092fz c2092fz3 = this.f7352kk;
        c2092fz3.m10569k4(new C2327ur(c2092fz3, this));
        C2092fz c2092fz4 = this.f7352kk;
        c2092fz4.m10557k4(new C2101gm(c2092fz4, this));
        C2092fz c2092fz5 = this.f7352kk;
        c2092fz5.m10561k4(new C2184m1(c2092fz5, this));
        this.f7352kk.m10577to().f7593k4.mo27432x1(new AbstractC14049c6() { // from class: com.aspose.slides.internal.ca.iq.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Fonts.TTF.TTFFont.NameTableOnNameChanged(System.Object,System.EventArgs)";
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14049c6
            /* JADX INFO: renamed from: k4 */
            public void mo1379k4(Object obj, C14111xk c14111xk) {
                C2132iq.this.m10733k4(obj, c14111xk);
            }
        });
        C2092fz c2092fz6 = this.f7352kk;
        c2092fz6.m10555k4(new C2062e6(c2092fz6, this));
        C2092fz c2092fz7 = this.f7352kk;
        c2092fz7.m10556k4(new C2064eb(c2092fz7, this));
        C2092fz c2092fz8 = this.f7352kk;
        c2092fz8.m10563k4(new C2232oo(c2092fz8, this));
        C2092fz c2092fz9 = this.f7352kk;
        c2092fz9.m10568k4(new C2285s4(c2092fz9, this));
    }

    /* JADX INFO: renamed from: m9 */
    private static int m10735m9(String str) {
        if (str != null) {
            String strM67368h4 = C14113y2.m67368h4(str);
            i = C14113y2.m67364dy(strM67368h4, "italic") != -1 ? 4 : 0;
            if (C14113y2.m67364dy(strM67368h4, "bold") != -1) {
                i |= 2;
            }
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: up */
    private void m10736up() {
        if (this.f7354m9) {
            return;
        }
        synchronized (this.f7349h4) {
            try {
                if (!this.f7354m9) {
                    if (m10758x1().m10579up() != null && m10758x1().m10579up().m10997k4() != null) {
                        this.f7346du = AbstractC2313tw.m11467k4(2, m10758x1().m10579up().m10997k4());
                    }
                    this.f7354m9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: c5 */
    public InterfaceC2030c9 mo10258c5() {
        if (this.f7358x1 == null) {
            this.f7358x1 = new C2395yu(m10758x1());
        }
        return this.f7358x1;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2313tw
    /* JADX INFO: renamed from: ck */
    public C2033cj mo10259ck() {
        return this.f7356to;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: du */
    public int mo10260du() {
        return 0;
    }

    /* JADX INFO: renamed from: dy */
    public int mo10738dy() {
        return this.f7345ck;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2313tw
    /* JADX INFO: renamed from: fa */
    public InterfaceC2201mt mo10261fa() {
        return new C2303tf(this);
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: h4 */
    public String mo10262h4() {
        return this.f7347dy;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2313tw, com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: jd */
    public InterfaceC2371xl mo10263jd() {
        return this.f7351k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m10740k4(C2068ei c2068ei) {
        if (C7019kk.m27469x1(c2068ei, C2396yw.class)) {
            Iterator<T> it = ((C2396yw) c2068ei).m11778x1().iterator();
            while (it.hasNext()) {
                m10740k4(((C2411zm) it.next()).m11827k4());
            }
        }
        if (m10758x1().m10574m9().m11371k4(c2068ei)) {
            return m10758x1().m10574m9().m11372x1(c2068ei);
        }
        if (m10758x1().m10574m9() == null) {
            return 0;
        }
        int iM11521k4 = m10758x1().m10547du().m11521k4();
        byte[][] bArr = {null};
        boolean[] zArr = {false};
        m10758x1().m10574m9().m11370k4(c2068ei, bArr, zArr);
        byte[] bArr2 = bArr[0];
        boolean z = zArr[0];
        if (m10758x1().m10550h4().mo11195k4().m11196k4() == 0) {
            m10758x1().m10550h4().mo11195k4().m11200x1(0);
        }
        if (z) {
            m10758x1().m10550h4().mo11195k4().m11199k4(((m10758x1().m10550h4().mo11195k4().m11197k4(m10758x1().m10550h4().mo11195k4().m11196k4() - 1) & 4294967295L) + ((long) bArr2.length)) & 4294967295L);
            m10758x1().m10545c5().m11590k4(((m10758x1().m10545c5().m11589k4() & 65535) + 1) & 65535);
            m10758x1().m10552jd().m10846k4().m10857k4(new C2146jl.k4(C7019kk.m27457kk(Double.valueOf(c2068ei.m10463c5()), 14), C7019kk.m27468x1(Double.valueOf(c2068ei.m10479m9()), 14)));
            m10758x1().m10547du().m11522k4(m10758x1().m10547du().m11521k4() + 1);
        }
        return iM11521k4;
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC2313tw m10750kk() {
        m10736up();
        return this.f7346du;
    }

    /* JADX INFO: renamed from: ne */
    public int m10753ne() {
        if (m10758x1().m10547du() == null) {
            return 0;
        }
        return m10758x1().m10547du().m11521k4() & 65535;
    }

    /* JADX INFO: renamed from: rv */
    public C2038cx mo10754rv() {
        if (this.f7348fa == null) {
            synchronized (this.f7359yj) {
                try {
                    if (this.f7348fa == null) {
                        this.f7348fa = new C2038cx(mo10262h4());
                    }
                } finally {
                }
            }
        }
        return this.f7348fa;
    }

    /* JADX INFO: renamed from: to */
    public String mo10755to() {
        return this.f7344c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m10757x1(AbstractC2220nx abstractC2220nx) {
        C2319ub c2319ub;
        C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx, C2334v6.class);
        if (c2334v6 != null) {
            return c2334v6.m11556k4();
        }
        if (m10758x1().m10546ck() == null || (c2319ub = (C2319ub) C7019kk.m27452k4((Object) abstractC2220nx, C2319ub.class)) == null) {
            return 0;
        }
        return m10758x1().m10546ck().m10446k4(c2319ub.m11480k4());
    }

    /* JADX INFO: renamed from: x6 */
    public C2038cx m10761x6() {
        if (this.f7357up == null) {
            synchronized (this.f7353ks) {
                try {
                    if (this.f7357up == null) {
                        this.f7357up = new C2038cx(mo10262h4());
                    }
                } finally {
                }
            }
        }
        return this.f7357up;
    }

    public C2132iq(C2033cj c2033cj, C2092fz c2092fz) {
        this.f7349h4 = new Object();
        this.f7359yj = new Object();
        this.f7353ks = new Object();
        this.f7355rv = new List<>();
        this.f7351k4 = new C2168kt(this);
        this.f7352kk = c2092fz;
        this.f7356to = c2033cj;
        this.f7345ck = 0;
    }

    /* JADX INFO: renamed from: du */
    public final C2068ei m10737du(String str) {
        if (m10750kk() != null) {
            return ((C2286s7) m10750kk()).m11381k4(str);
        }
        if (m10758x1().m10546ck() != null) {
            return m10741k4(m10758x1().m10546ck().m10446k4(str));
        }
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[] m10739h4(String str) {
        final InterfaceC2201mt[] interfaceC2201mtArr = {mo10261fa()};
        AbstractC14092to.m67235k4((Object[]) mo10751kk(str), (AbstractC14071k4) new AbstractC14071k4<AbstractC2220nx>() { // from class: com.aspose.slides.internal.ca.iq.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void invoke(AbstractC2220nx abstractC2220nx) {
                if (interfaceC2201mtArr[0].mo10802up().m11785x1(abstractC2220nx)) {
                    return;
                }
                interfaceC2201mtArr[0].mo10802up().m11782k4(abstractC2220nx);
            }
        });
        C2132iq c2132iq = (C2132iq) C7019kk.m27452k4((Object) interfaceC2201mtArr[0], C2132iq.class);
        if (c2132iq == null) {
            throw new InvalidOperationException("Failed to create a font subset");
        }
        C3152yj c3152yj = new C3152yj();
        try {
            c2132iq.mo11257k4(c3152yj);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C2068ei m10741k4(int i) {
        return m10750kk() != null ? ((C2286s7) m10750kk()).m11380k4(i) : m10758x1().m10574m9().mo10130k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2313tw, com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: kk */
    public AbstractC2220nx[] mo10751kk(String str) {
        if (this.f7352kk.m10578u4() == null || this.f7352kk.m10551ix() == null) {
            return super.mo10751kk(str);
        }
        String strM10824k4 = C2143je.m10824k4(this, 1, str);
        if (strM10824k4 == null) {
            return super.mo10751kk(str);
        }
        C2379xz c2379xzM10729k4 = m10729k4(str, strM10824k4);
        m10730k4(this, 1, c2379xzM10729k4, strM10824k4);
        List list = new List();
        List.Enumerator<C2130il> it = c2379xzM10729k4.m11711k4().iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next().m10719k4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return (AbstractC2220nx[]) list.toArray(new AbstractC2220nx[0]);
    }

    /* JADX INFO: renamed from: m9 */
    public String mo10752m9() {
        return this.f7350jd;
    }

    /* JADX INFO: renamed from: to */
    public void m10756to(String str) {
        this.f7347dy = str;
        if (m10758x1().m10577to() == null || this.f7347dy == null) {
            return;
        }
        m10758x1().m10577to().m11090k4(4, this.f7347dy);
    }

    /* JADX INFO: renamed from: x1 */
    public C2092fz m10758x1() {
        return this.f7352kk;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2251pt
    /* JADX INFO: renamed from: k4 */
    public C2068ei mo10265k4(AbstractC2220nx abstractC2220nx) {
        C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx, C2334v6.class);
        if (c2334v6 != null) {
            return m10741k4(c2334v6.m11556k4());
        }
        C2319ub c2319ub = (C2319ub) C7019kk.m27452k4((Object) abstractC2220nx, C2319ub.class);
        if (c2319ub != null) {
            return m10737du(c2319ub.m11480k4());
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m10759x1(C2038cx c2038cx) {
        this.f7357up = c2038cx;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC2313tw m10728k4(AbstractC2313tw abstractC2313tw, C2384y6 c2384y6) {
        byte[] bArr;
        long j;
        C2132iq c2132iq = new C2132iq();
        C2132iq c2132iq2 = (C2132iq) C7019kk.m27452k4((Object) abstractC2313tw, C2132iq.class);
        if (c2132iq2 != null) {
            if (c2384y6.m11732k4()) {
                c2132iq.m10745k4(c2132iq2.m10758x1().m10572kk().m11223yd());
                long j2 = 0;
                if (c2132iq2.m10758x1().m10582yj() != null) {
                    c2132iq.m10758x1().m10565k4(new C2249pq(c2132iq.m10758x1(), c2132iq));
                    byte[][] bArr2 = {null};
                    long[] jArr = {0};
                    long[] jArr2 = {0};
                    c2132iq2.m10758x1().m10582yj().mo10132k4(bArr2, jArr, jArr2);
                    bArr = bArr2[0];
                    j2 = jArr[0];
                    j = jArr2[0];
                    c2132iq.m10758x1().m10582yj().f7745k4 = bArr;
                } else {
                    bArr = null;
                    j = 0;
                }
                if (c2132iq2.m10758x1().m10576rv() != null) {
                    c2132iq.m10758x1().m10567k4(new C2278rr(c2132iq.m10758x1(), c2132iq));
                    byte[][] bArr3 = {bArr};
                    long[] jArr3 = {j2};
                    long[] jArr4 = {j};
                    c2132iq2.m10758x1().m10576rv().mo10132k4(bArr3, jArr3, jArr4);
                    bArr = bArr3[0];
                    long j3 = jArr3[0];
                    long j4 = jArr4[0];
                    c2132iq.m10758x1().m10576rv().f7838k4 = bArr;
                    j2 = j3;
                    j = j4;
                }
                if (c2132iq2.m10758x1().m10573ks() != null) {
                    c2132iq.m10758x1().m10566k4(new C2250pr(c2132iq.m10758x1(), c2132iq));
                    byte[][] bArr4 = {bArr};
                    c2132iq2.m10758x1().m10573ks().mo10132k4(bArr4, new long[]{j2}, new long[]{j});
                    c2132iq.m10758x1().m10573ks().f7747k4 = bArr4[0];
                }
            }
            if (c2132iq2.m10758x1().m10547du() != null) {
                c2132iq.m10758x1().m10547du().m11528to(c2132iq2.m10758x1().m10547du().m11527to());
                c2132iq.m10758x1().m10547du().m11518du(c2132iq2.m10758x1().m10547du().m11517du());
                c2132iq.m10758x1().m10547du().m11526m9(c2132iq2.m10758x1().m10547du().m11525m9());
                c2132iq.m10758x1().m10547du().m11530x1(c2132iq2.m10758x1().m10547du().m11529x1());
                c2132iq.m10758x1().m10547du().m11520h4(c2132iq2.m10758x1().m10547du().m11519h4());
                c2132iq.m10758x1().m10547du().m11524kk(c2132iq2.m10758x1().m10547du().m11523kk());
            }
            if (c2132iq2.m10758x1().m10572kk() != null) {
                c2132iq.m10758x1().m10572kk().m11006k4(c2132iq2.m10758x1().m10572kk().m11005k4());
                c2132iq.m10758x1().m10572kk().m11016x1(c2132iq2.m10758x1().m10572kk().m11012m9());
                c2132iq.m10758x1().m10572kk().m11008k4(c2132iq2.m10758x1().m10572kk().m11009kk());
                c2132iq.m10758x1().m10572kk().m11017x1(c2132iq2.m10758x1().m10572kk().m11013to());
                c2132iq.m10758x1().m10572kk().m11011kk(c2132iq2.m10758x1().m10572kk().m10999du());
                c2132iq.m10758x1().m10572kk().m11014to(c2132iq2.m10758x1().m10572kk().m11002h4());
                c2132iq.m10758x1().m10572kk().m11000du(c2132iq2.m10758x1().m10572kk().m10998c5());
            }
            if (c2132iq2.m10758x1().m10581x6() != null) {
                c2132iq.m10758x1().m10581x6().m10618k4(c2132iq2.m10758x1().m10581x6());
                c2132iq.m10758x1().m10581x6().m10621kk(8);
            }
            if (c2132iq2.m10758x1().m10577to() != null) {
                m10731k4(c2132iq, c2132iq2, 1);
                m10731k4(c2132iq, c2132iq2, 2);
                m10731k4(c2132iq, c2132iq2, 3);
                m10731k4(c2132iq, c2132iq2, 4);
                m10731k4(c2132iq, c2132iq2, 5);
                m10731k4(c2132iq, c2132iq2, 6);
            }
        }
        return c2132iq;
    }

    /* JADX INFO: renamed from: x1 */
    public void m10760x1(String str) {
        this.f7350jd = str;
        this.f7345ck = m10735m9(str);
        if (m10758x1().m10577to() != null) {
            m10758x1().m10577to().m11090k4(2, this.f7350jd);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C2379xz m10729k4(String str, String str2) {
        C2084fc c2084fcM11613k4;
        boolean z;
        if (f7343x6.m27428k4(str2) != 0) {
            c2084fcM11613k4 = new C2121hz().m10707k4(str, 10);
            z = false;
        } else {
            c2084fcM11613k4 = new C2351wm().m11613k4(str);
            z = true;
        }
        return new C2379xz(c2084fcM11613k4, this, z);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10742k4(int i, C2398z1 c2398z1) {
        if (m10750kk() != null) {
            throw new NotImplementedException("TTF fonts support with CFF inside is not implemented");
        }
        m10758x1().m10574m9().m11369k4(i, c2398z1);
    }

    /* JADX INFO: renamed from: k4 */
    public void m10743k4(C2038cx c2038cx) {
        this.f7348fa = c2038cx;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m10730k4(C2132iq c2132iq, int i, C2379xz c2379xz, String str) {
        C2349wk c2349wkM11696k4 = (i == 1 ? c2132iq.m10758x1().m10551ix() : c2132iq.m10758x1().m10575ne()).m10955k4().m11696k4(str);
        if (c2349wkM11696k4 == null) {
            throw new C2243pd(C14113y2.m67402k4("Can't find \"{0}\" script", str));
        }
        try {
            C2276rp c2276rp = new C2276rp(c2132iq);
            C2089fp c2089fpM11603kk = c2349wkM11696k4.m11603kk();
            if ((c2089fpM11603kk.m10532kk() & 65535) != 65535) {
                c2276rp.m11347k4(i).mo11416k4(c2089fpM11603kk.m10532kk() & 65535, c2379xz);
                return;
            }
            InterfaceC2375xt interfaceC2375xtM11347k4 = c2276rp.m11347k4(i);
            Integer[] numArrM10734k4 = m10734k4(c2132iq, c2089fpM11603kk.m10533to());
            for (Integer num : numArrM10734k4) {
                interfaceC2375xtM11347k4.mo11416k4(num.intValue() & 65535, c2379xz);
            }
        } catch (C2228oa unused) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m10731k4(C2132iq c2132iq, C2132iq c2132iq2, int i) {
        String strM11091x1 = c2132iq2.m10758x1().m10577to().m11091x1(i);
        if (strM11091x1 != null) {
            c2132iq.m10758x1().m10577to().m11090k4(i, strM11091x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m10744k4(AbstractC2220nx abstractC2220nx, C2398z1 c2398z1) {
        C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx, C2334v6.class);
        if (c2334v6 != null) {
            m10742k4(c2334v6.m11556k4(), c2398z1);
            return;
        }
        C2319ub c2319ub = (C2319ub) C7019kk.m27452k4((Object) abstractC2220nx, C2319ub.class);
        if (c2319ub != null) {
            m10748k4(c2319ub.m11480k4(), c2398z1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10745k4(C2377xv c2377xv) {
        m10758x1().m10574m9().m11223yd().m11702k4(c2377xv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m10733k4(Object obj, C14111xk c14111xk) {
        int i = ((C2184m1.k4) c14111xk).f7599k4;
        if (i == 1) {
            this.f7344c5 = m10758x1().m10577to().m11091x1(1);
            return;
        }
        if (i == 2) {
            String strM11091x1 = m10758x1().m10577to().m11091x1(2);
            this.f7350jd = strM11091x1;
            this.f7345ck = m10735m9(strM11091x1);
        } else if (i == 4) {
            this.f7347dy = m10758x1().m10577to().m11091x1(4);
            this.f7348fa = m10758x1().m10577to().m11089k4(4);
        } else {
            if (i != 6) {
                return;
            }
            this.f7357up = m10758x1().m10577to().m11089k4(6);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m10746k4(String str) {
        this.f7344c5 = str;
        if (m10758x1().m10577to() != null) {
            m10758x1().m10577to().m11090k4(1, this.f7344c5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10747k4(String str, C2377xv c2377xv, long j, long j2, long j3) {
        this.f7355rv.addItem(str);
        switch (f7343x6.m27428k4(C14113y2.m67440x1(C14113y2.m67368h4(str)))) {
            case 1:
                this.f7352kk.m10561k4(new C2184m1(c2377xv, j, j2, j3));
                this.f7352kk.m10577to().f7593k4.mo27432x1(new AbstractC14049c6() { // from class: com.aspose.slides.internal.ca.iq.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.Fonts.TTF.TTFFont.NameTableOnNameChanged(System.Object,System.EventArgs)";
                    }

                    @Override // com.aspose.slides.p559ms.System.AbstractC14049c6
                    /* JADX INFO: renamed from: k4 */
                    public void mo1379k4(Object obj, C14111xk c14111xk) {
                        C2132iq.this.m10733k4(obj, c14111xk);
                    }
                });
                break;
            case 2:
                this.f7352kk.m10569k4(new C2327ur(c2377xv, j, j2, j3));
                break;
            case 3:
                this.f7352kk.m10560k4(new C2174la(c2377xv, j, j2, j3));
                break;
            case 4:
                this.f7352kk.m10568k4(new C2285s4(c2377xv, j, j2, j3));
                break;
            case 5:
                this.f7352kk.m10563k4(new C2232oo(c2377xv, j, j2, j3));
                break;
            case 6:
                this.f7352kk.m10556k4(new C2064eb(c2377xv, j, j2, j3));
                break;
            case 7:
                this.f7352kk.m10570k4(new C2344w5(c2377xv, j, j2, j3));
                break;
            case 8:
                this.f7352kk.m10558k4(new C2146jl(c2377xv, j, j2, j3));
                break;
            case 9:
                this.f7352kk.m10555k4(new C2062e6(c2377xv, j, j2, j3));
                break;
            case 10:
                this.f7352kk.m10553k4(new C2025c3(c2377xv, j, j2, j3));
                break;
            case 11:
                this.f7352kk.m10559k4(new C2172l6(c2377xv, j, j2, j3));
                break;
            case 12:
                this.f7352kk.m10565k4(new C2249pq(c2377xv, j, j2, j3));
                break;
            case 13:
                this.f7352kk.m10566k4(new C2250pr(c2377xv, j, j2, j3));
                break;
            case 14:
                this.f7352kk.m10567k4(new C2278rr(c2377xv, j, j2, j3));
                break;
            case 15:
                this.f7352kk.m10557k4(new C2101gm(c2377xv, j, j2, j3));
                break;
            case 16:
                this.f7352kk.m10564k4(new C2240p6(c2377xv, j, j2, j3));
                break;
            case 17:
                this.f7352kk.m10554k4(new C2051dn(c2377xv, j, j2, j3));
                break;
            case 18:
                this.f7352kk.m10562k4(new C2199mr(c2377xv, j, j2, j3));
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10748k4(String str, C2398z1 c2398z1) {
        if (m10750kk() != null) {
            throw new NotImplementedException("TTF fonts support with CFF inside is not implemented");
        }
        if (m10758x1().m10546ck() != null) {
            m10742k4(m10758x1().m10546ck().m10446k4(str), c2398z1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m10749k4() {
        return (m10758x1().m10577to() == null && m10758x1().m10573ks() != null && m10758x1().m10573ks().m11255kk().size() == 441 && m10758x1().m10573ks().m11254k4().length == 36963) || (mo10755to() != null && (C14113y2.m67364dy(mo10755to(), "MingLi") > -1 || C14113y2.m67364dy(mo10755to(), "DFKai") > -1 || (C14113y2.m67364dy(mo10755to(), "+___") > -1 && (m10758x1().m10581x6().m10645x6()[0] & 255) == 68 && (m10758x1().m10581x6().m10645x6()[1] & 255) == 89 && (m10758x1().m10581x6().m10645x6()[2] & 255) == 78 && (m10758x1().m10581x6().m10645x6()[3] & 255) == 65)));
    }

    /* JADX INFO: renamed from: k4 */
    private static Integer[] m10734k4(C2132iq c2132iq, Integer[] numArr) {
        List list = new List();
        C2137j0 c2137j0M10956x1 = c2132iq.m10758x1().m10551ix().m10956x1();
        for (C2217nk c2217nk : C2208n3.f7653k4) {
            for (Integer num : numArr) {
                if (C14113y2.m67363du(c2137j0M10956x1.m10797k4(num.intValue() & 65535).m11181x1(), c2217nk.f7675kk)) {
                    list.addItem(num);
                }
            }
        }
        return (Integer[]) list.toArray(new Integer[0]);
    }
}
