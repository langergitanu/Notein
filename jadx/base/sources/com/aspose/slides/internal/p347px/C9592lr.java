package com.aspose.slides.internal.p347px;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p437u9.C11292du;
import com.aspose.slides.internal.p437u9.C11293dy;
import com.aspose.slides.internal.p437u9.C11296k4;
import com.aspose.slides.internal.p437u9.C11297kk;
import com.aspose.slides.internal.p514xx.C12752x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C9592lr {

    /* JADX INFO: renamed from: c5 */
    private C9605x1 f34626c5;

    /* JADX INFO: renamed from: ck */
    private final IGenericDictionary<String, Long> f34627ck = C12752x1.m59429k4();

    /* JADX INFO: renamed from: du */
    private C9595qq f34628du;

    /* JADX INFO: renamed from: dy */
    private C9603wl f34629dy;

    /* JADX INFO: renamed from: fa */
    private long[] f34630fa;

    /* JADX INFO: renamed from: h4 */
    private C9607yd f34631h4;

    /* JADX INFO: renamed from: jd */
    private int f34632jd;

    /* JADX INFO: renamed from: k4 */
    private C11296k4 f34633k4;

    /* JADX INFO: renamed from: kk */
    private C9596rv f34634kk;

    /* JADX INFO: renamed from: m9 */
    private C9594ne f34635m9;

    /* JADX INFO: renamed from: to */
    private C9598u4 f34636to;

    /* JADX INFO: renamed from: x1 */
    private C11293dy<C9582dq> f34637x1;

    /* JADX INFO: renamed from: up */
    private static final String[] f34624up = {"head", "hhea", "maxp", "hmtx", "fpgm", "prep", "cvt ", "loca", "glyf"};

    /* JADX INFO: renamed from: yj */
    private static final String[] f34625yj = {"OS/2", "name", "cmap", "post"};

    /* JADX INFO: renamed from: ks */
    private static final int[] f34622ks = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};

    /* JADX INFO: renamed from: rv */
    private static final C9591ks[] f34623rv = new C9591ks[0];

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /* JADX INFO: renamed from: c5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C9579bv m46853c5() {
        double d;
        int i;
        C9579bv c9579bv = new C9579bv();
        c9579bv.m46802x1(this.f34634kk.f34696h4 & 65535);
        c9579bv.m46769fa(this.f34634kk.f34701m9);
        c9579bv.m46799up(this.f34634kk.f34694dy);
        c9579bv.m46806yj(this.f34634kk.f34691c5);
        c9579bv.m46792ks(this.f34634kk.f34697jd);
        if (m46872x1("CFF ") != null) {
            c9579bv.m46803x1(true);
            this.f34633k4.m54276k4().setPosition(r2.f34591kk);
            c9579bv.m46791kk(new C9590kk(this.f34633k4).m46844k4());
        }
        float fM46794m9 = c9579bv.m46794m9() / 1.8f;
        float fM46794m92 = c9579bv.m46794m9() * 1.8f;
        C9594ne c9594ne = this.f34635m9;
        if (c9594ne == null) {
            c9579bv.m46790kk(this.f34636to.f34724x1);
            c9579bv.m46798to(-this.f34636to.f34718kk);
            C9598u4 c9598u4 = this.f34636to;
            c9579bv.m46765du((c9598u4.f34724x1 - c9598u4.f34718kk) + c9598u4.f34722to);
            if (this.f34636to.f34718kk > 0) {
                c9579bv.m46790kk(this.f34634kk.f34697jd);
                c9579bv.m46798to(-this.f34634kk.f34694dy);
                c9579bv.m46765du(c9579bv.m46760c5() + c9579bv.m46766dy());
                C9598u4 c9598u42 = this.f34636to;
                c9579bv.m46779k4((float) (((-C14116yg.m67498to(c9598u42.f34716jd, c9598u42.f34710c5)) * 180.0d) / 3.141592653589793d));
                c9579bv.m46780k4(this.f34634kk.m46875k4());
                if (C11292du.m54266k4(c9579bv.m46801x1(), "Bold", true)) {
                    c9579bv.m46780k4(c9579bv.m46770h4() | 1);
                }
                if (C11292du.m54266k4(c9579bv.m46801x1(), "Italic", true)) {
                    c9579bv.m46780k4(c9579bv.m46770h4() | 2);
                }
                c9579bv.m46796rv(this.f34635m9.f34673xk);
                c9579bv.m46804x6(this.f34635m9.f34646dq);
                c9579bv.m46781k4(this.f34626c5.m46914k4(this.f34629dy));
                c9579bv.m46782k4(this.f34626c5);
                if (c9579bv.m46760c5() + c9579bv.m46766dy() > c9579bv.m46762ck()) {
                    c9579bv.m46765du(c9579bv.m46760c5() + c9579bv.m46766dy());
                }
            }
            return c9579bv;
        }
        int i2 = c9594ne.f34642bv - c9594ne.f34668v4;
        float f = (c9594ne.f34674yd & 65535) + (c9594ne.f34641b3 & 65535);
        boolean z = f < fM46794m92 && f > fM46794m9;
        c9579bv.m46783k4(this.f34631h4);
        C9594ne c9594ne2 = this.f34635m9;
        boolean z2 = (c9594ne2.f34642bv == 0 && c9594ne2.f34668v4 == 0) || !z;
        c9579bv.m46790kk(z2 ? this.f34636to.f34724x1 : c9594ne2.f34674yd & 65535);
        c9579bv.m46798to(z2 ? -this.f34636to.f34718kk : this.f34635m9.f34641b3 & 65535);
        if (z2 || !c9579bv.m46800up()) {
            C9598u4 c9598u43 = this.f34636to;
            d = 3.141592653589793d;
            i = (c9598u43.f34724x1 - c9598u43.f34718kk) + c9598u43.f34722to;
        } else {
            C9594ne c9594ne3 = this.f34635m9;
            i = (c9594ne3.f34674yd & 65535) + (c9594ne3.f34641b3 & 65535);
            d = 3.141592653589793d;
        }
        c9579bv.m46765du(i);
        if (this.f34635m9.f34668v4 > 0) {
            float f2 = i2;
            if ((f2 > fM46794m92 || f2 < fM46794m9) && !z && (c9579bv.m46762ck() == 0 || c9579bv.m46762ck() > fM46794m92 || c9579bv.m46762ck() < fM46794m9)) {
                c9579bv.m46790kk(this.f34634kk.f34697jd);
                c9579bv.m46798to(-this.f34634kk.f34694dy);
                c9579bv.m46765du(c9579bv.m46760c5() + c9579bv.m46766dy());
                c9579bv.m46802x1(c9579bv.m46762ck());
            } else if (this.f34636to.f34718kk > 0) {
                c9579bv.m46790kk(this.f34634kk.f34697jd);
                c9579bv.m46798to(-this.f34634kk.f34694dy);
                c9579bv.m46765du(c9579bv.m46760c5() + c9579bv.m46766dy());
            }
        }
        C9598u4 c9598u44 = this.f34636to;
        c9579bv.m46779k4((float) (((-C14116yg.m67498to(c9598u44.f34716jd, c9598u44.f34710c5)) * 180.0d) / d));
        c9579bv.m46771h4(this.f34635m9.f34675yj);
        c9579bv.m46763ck(this.f34635m9.f34656ks);
        c9579bv.m46761c5(this.f34635m9.f34658m9);
        c9579bv.m46773jd(this.f34635m9.f34643c5);
        c9579bv.m46795m9(this.f34635m9.f34645ck);
        c9579bv.m46767dy(this.f34635m9.f34666up);
        C9594ne c9594ne4 = this.f34635m9;
        c9579bv.m46780k4((c9594ne4.f34660qq & 65535) == 0 ? this.f34634kk.m46875k4() : c9594ne4.m46874k4());
        c9579bv.m46787k4(this.f34635m9.f34672x6);
        c9579bv.m46785k4(this.f34635m9.f34661rv);
        if (C11292du.m54266k4(c9579bv.m46801x1(), "Bold", true)) {
            c9579bv.m46780k4(c9579bv.m46770h4() | 1);
        }
        if (C11292du.m54266k4(c9579bv.m46801x1(), "Italic", true)) {
            c9579bv.m46780k4(c9579bv.m46770h4() | 2);
        }
        c9579bv.m46796rv(this.f34635m9.f34673xk);
        c9579bv.m46804x6(this.f34635m9.f34646dq);
        c9579bv.m46781k4(this.f34626c5.m46914k4(this.f34629dy));
        c9579bv.m46782k4(this.f34626c5);
        if (c9579bv.m46760c5() + c9579bv.m46766dy() > c9579bv.m46762ck()) {
            c9579bv.m46765du(c9579bv.m46760c5() + c9579bv.m46766dy());
        }
        int i3 = this.f34635m9.f34647du;
        c9579bv.m46786k4((i3 & 4) != 0 && (i3 & 8) == 0);
        return c9579bv;
    }

    /* JADX INFO: renamed from: ck */
    private C9591ks[] m46854ck() {
        if (this.f34632jd <= 0) {
            throw new InvalidOperationException("Can't read TTC entry.");
        }
        List list = new List();
        for (int i = 0; i < this.f34632jd; i++) {
            this.f34633k4.m54276k4().setPosition(this.f34630fa[i] & 4294967295L);
            int iM46859k4 = m46859k4();
            if (iM46859k4 <= 0) {
                throw new InvalidOperationException("Can't read TTC entry.");
            }
            for (int i2 = 0; i2 < iM46859k4; i2++) {
                C9582dq c9582dq = new C9582dq(this.f34633k4);
                if ("name".equals(c9582dq.f34590k4)) {
                    int i3 = c9582dq.f34591kk;
                    this.f34633k4.m54276k4().setPosition(i3);
                    m46867x1(i3);
                    for (String str : this.f34631h4.m46925kk(4)) {
                        this.f34627ck.set_Item(str, Long.valueOf(this.f34630fa[i]));
                    }
                    C9591ks[] c9591ksArrM46924k4 = this.f34631h4.m46924k4();
                    if (c9591ksArrM46924k4 != null) {
                        list.addRange(AbstractC14092to.m67204k4((Object[]) c9591ksArrM46924k4));
                    }
                }
            }
        }
        return (C9591ks[]) list.toArray(new C9591ks[0]);
    }

    /* JADX INFO: renamed from: du */
    private void m46855du() {
        m46865to("name");
        m46867x1((int) this.f34633k4.m54276k4().getPosition());
    }

    /* JADX INFO: renamed from: dy */
    private void m46856dy() {
        m46865to("cmap");
        this.f34626c5 = new C9605x1(this.f34633k4);
    }

    /* JADX INFO: renamed from: h4 */
    private void m46857h4() {
        if (m46872x1("OS/2") != null) {
            this.f34633k4.m54276k4().setPosition(r0.f34591kk);
            this.f34635m9 = new C9594ne(this.f34633k4);
        }
    }

    /* JADX INFO: renamed from: jd */
    private boolean m46858jd() {
        this.f34633k4.m54276k4().setPosition(0L);
        if (!"ttcf".equals(C14113y2.m67405k4(this.f34633k4.m54281x1(4)))) {
            return false;
        }
        int iM54280x1 = this.f34633k4.m54280x1();
        if (iM54280x1 != 65536 && iM54280x1 != 131072) {
            return false;
        }
        int iM54280x12 = this.f34633k4.m54280x1();
        this.f34632jd = iM54280x12;
        this.f34630fa = new long[iM54280x12];
        for (int i = 0; i < this.f34632jd; i++) {
            this.f34630fa[i] = this.f34633k4.m54278kk();
        }
        if (131072 != iM54280x1) {
            return true;
        }
        this.f34633k4.m54278kk();
        this.f34633k4.m54278kk();
        this.f34633k4.m54278kk();
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private int m46859k4() {
        int iM54280x1 = this.f34633k4.m54280x1();
        if (iM54280x1 != 65536 && iM54280x1 != 1330926671) {
            return -1;
        }
        int iM54274du = this.f34633k4.m54274du() & 65535;
        this.f34633k4.m54274du();
        this.f34633k4.m54274du();
        this.f34633k4.m54274du();
        return iM54274du;
    }

    /* JADX INFO: renamed from: kk */
    private void m46861kk() {
        m46865to("hhea");
        this.f34636to = new C9598u4(this.f34633k4);
    }

    /* JADX INFO: renamed from: m9 */
    private void m46863m9() {
        if (this.f34636to == null) {
            throw new InvalidOperationException("Need to read horizontal header first.");
        }
        if (this.f34628du == null) {
            throw new InvalidOperationException("Need to read maximum profile first.");
        }
        m46865to("hmtx");
        this.f34629dy = new C9603wl(this.f34633k4, this.f34636to.f34725x6 & 65535, 65535 & this.f34628du.f34689x1);
    }

    /* JADX INFO: renamed from: to */
    private void m46864to() {
        m46865to("maxp");
        this.f34628du = new C9595qq(this.f34633k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final C9582dq m46872x1(String str) {
        C9582dq[] c9582dqArr = {null};
        C11293dy<C9582dq> c11293dy = this.f34637x1;
        if (c11293dy != null) {
            c11293dy.tryGetValue(str, c9582dqArr);
        }
        return c9582dqArr[0];
    }

    /* JADX INFO: renamed from: kk */
    private void m46862kk(String str) {
        if (!m46858jd()) {
            if (!m46860k4(0)) {
                throw new InvalidOperationException("The file is not recognized as a TTF or TTC font.");
            }
            return;
        }
        m46854ck();
        Long[] lArr = {0L};
        boolean z = (this.f34627ck.tryGetValue(str, lArr) && m46860k4(lArr[0].intValue())) ? false : true;
        lArr[0].getClass();
        if (z) {
            throw new InvalidOperationException("The TTC font is invalid.");
        }
    }

    /* JADX INFO: renamed from: to */
    private void m46865to(String str) {
        this.f34633k4.m54276k4().setPosition(m46870k4(str).f34591kk);
    }

    /* JADX INFO: renamed from: x1 */
    private void m46866x1() {
        m46865to("head");
        this.f34634kk = new C9596rv(this.f34633k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C9579bv m46868k4(AbstractC3150x6 abstractC3150x6, String str) {
        this.f34633k4 = new C11296k4(abstractC3150x6);
        m46862kk(str);
        m46866x1();
        m46855du();
        m46861kk();
        m46857h4();
        m46864to();
        m46863m9();
        m46856dy();
        return m46853c5();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m46867x1(int i) {
        AbstractC6747ar abstractC6747arM26649x6;
        String strM26681x1;
        if ((this.f34633k4.m54274du() & 65535) != 0) {
            throw new InvalidOperationException("Unsupported Name table format.");
        }
        int iM54274du = this.f34633k4.m54274du();
        int iM54274du2 = this.f34633k4.m54274du();
        this.f34631h4 = new C9607yd();
        int i2 = 0;
        for (int i3 = 65535; i2 < (iM54274du & i3); i3 = 65535) {
            int iM54274du3 = this.f34633k4.m54274du() & i3;
            int iM54274du4 = this.f34633k4.m54274du() & i3;
            int iM54274du5 = this.f34633k4.m54274du() & i3;
            int iM54274du6 = this.f34633k4.m54274du() & i3;
            int iM54274du7 = this.f34633k4.m54274du() & i3;
            int iM54274du8 = this.f34633k4.m54274du() & i3;
            if (iM54274du3 == 0) {
                abstractC6747arM26649x6 = AbstractC6747ar.m26649x6();
            } else if (iM54274du3 != 1) {
                if (iM54274du3 != 3) {
                    abstractC6747arM26649x6 = null;
                } else if (iM54274du4 == 4) {
                    abstractC6747arM26649x6 = C11297kk.m54283k4("big5");
                } else if (iM54274du4 != 1 && iM54274du4 != 10 && iM54274du4 != 0) {
                    abstractC6747arM26649x6 = C11297kk.m54283k4("utf-16be");
                }
            } else if (iM54274du4 != 2) {
                abstractC6747arM26649x6 = (iM54274du4 == 0 || iM54274du4 == 1 || iM54274du4 == 3 || iM54274du4 == 25) ? C11297kk.m54282k4(1252) : AbstractC6747ar.m26635ix();
            }
            if (abstractC6747arM26649x6 != null) {
                int position = (int) this.f34633k4.m54276k4().getPosition();
                this.f34633k4.m54276k4().setPosition(i + (iM54274du2 & i3) + iM54274du8);
                byte[] bArrM54277k4 = this.f34633k4.m54277k4(iM54274du7);
                if ("big5".equals(abstractC6747arM26649x6.mo26657jd())) {
                    byte[] bArr = new byte[bArrM54277k4.length];
                    int i4 = 0;
                    for (byte b : bArrM54277k4) {
                        if ((b & 255) != 0) {
                            bArr[i4] = b;
                            i4++;
                        }
                    }
                    strM26681x1 = abstractC6747arM26649x6.mo26682x1(bArr, 0, i4);
                } else {
                    strM26681x1 = abstractC6747arM26649x6.m26681x1(bArrM54277k4);
                }
                if (this.f34631h4.m46922k4(iM54274du6, iM54274du5) == null) {
                    this.f34631h4.m46923k4(iM54274du6, iM54274du5, strM26681x1);
                }
                this.f34633k4.m54276k4().setPosition(position);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C9579bv m46869k4(AbstractC9608yj abstractC9608yj, String str) {
        AbstractC3150x6 abstractC3150x6Mo46753x1 = abstractC9608yj.mo46753x1();
        try {
            C9579bv c9579bvM46868k4 = m46868k4(abstractC3150x6Mo46753x1, str);
            c9579bvM46868k4.m46784k4(abstractC9608yj);
            return c9579bvM46868k4;
        } finally {
            if (abstractC3150x6Mo46753x1 != null) {
                abstractC3150x6Mo46753x1.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C9582dq m46870k4(String str) {
        C9582dq c9582dqM46872x1 = m46872x1(str);
        if (c9582dqM46872x1 != null) {
            return c9582dqM46872x1;
        }
        throw new InvalidOperationException(C14113y2.m67402k4("Cannot find table '{0}' in the font file.", str));
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m46860k4(int i) {
        this.f34633k4.m54276k4().setPosition(i);
        int iM46859k4 = m46859k4();
        if (iM46859k4 <= 0) {
            return false;
        }
        this.f34637x1 = new C11293dy<>();
        for (int i2 = 0; i2 < iM46859k4; i2++) {
            C9582dq c9582dq = new C9582dq(this.f34633k4);
            this.f34637x1.addItem(c9582dq.f34590k4, c9582dq);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9591ks[] m46871k4(AbstractC9608yj abstractC9608yj) {
        C9591ks[] c9591ksArrM46924k4;
        if (!abstractC9608yj.mo46752kk()) {
            return f34623rv;
        }
        AbstractC3150x6 abstractC3150x6Mo46753x1 = abstractC9608yj.mo46753x1();
        try {
            this.f34633k4 = new C11296k4(abstractC3150x6Mo46753x1);
            if (m46858jd()) {
                c9591ksArrM46924k4 = m46854ck();
                for (C9591ks c9591ks : c9591ksArrM46924k4) {
                    c9591ks.m46848k4(abstractC9608yj);
                    c9591ks.m46849k4(true);
                }
            } else if (m46860k4(0)) {
                m46855du();
                c9591ksArrM46924k4 = this.f34631h4.m46924k4();
                for (C9591ks c9591ks2 : c9591ksArrM46924k4) {
                    c9591ks2.m46848k4(abstractC9608yj);
                    c9591ks2.m46849k4(false);
                }
            } else {
                c9591ksArrM46924k4 = null;
            }
            if (c9591ksArrM46924k4 != null && this.f34637x1 != null) {
                m46857h4();
                for (C9591ks c9591ks3 : c9591ksArrM46924k4) {
                    c9591ks3.m46847k4(this.f34635m9);
                }
            }
            if (abstractC3150x6Mo46753x1 != null) {
                abstractC3150x6Mo46753x1.dispose();
            }
            return c9591ksArrM46924k4;
        } catch (Throwable th) {
            if (abstractC3150x6Mo46753x1 != null) {
                abstractC3150x6Mo46753x1.dispose();
            }
            throw th;
        }
    }
}
