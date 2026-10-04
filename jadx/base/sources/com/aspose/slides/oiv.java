package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10405dn;
import com.aspose.slides.internal.p407st.C10441fk;
import com.aspose.slides.internal.p407st.C10444fw;
import com.aspose.slides.internal.p407st.C10536m5;
import com.aspose.slides.internal.p407st.C10546mr;
import com.aspose.slides.internal.p407st.C10548mt;
import com.aspose.slides.internal.p407st.C10597pu;
import com.aspose.slides.internal.p407st.C10727y5;
import com.aspose.slides.internal.p407st.C10752zi;
import com.aspose.slides.internal.p407st.C10756zp;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class oiv {

    /* JADX INFO: renamed from: c5 */
    private int f47815c5;

    /* JADX INFO: renamed from: ck */
    private C10536m5 f47816ck;

    /* JADX INFO: renamed from: du */
    private boolean f47817du;

    /* JADX INFO: renamed from: dy */
    private C10548mt f47818dy;

    /* JADX INFO: renamed from: fa */
    private C10536m5 f47819fa;

    /* JADX INFO: renamed from: h4 */
    private uz3 f47820h4;

    /* JADX INFO: renamed from: jd */
    private C10536m5 f47821jd;

    /* JADX INFO: renamed from: k4 */
    private C10752zi f47822k4;

    /* JADX INFO: renamed from: kk */
    private C10752zi f47823kk;

    /* JADX INFO: renamed from: ks */
    private boolean f47824ks;

    /* JADX INFO: renamed from: m9 */
    private TextFrame f47825m9;

    /* JADX INFO: renamed from: to */
    private boolean f47827to;

    /* JADX INFO: renamed from: x1 */
    private C10752zi f47829x1;

    /* JADX INFO: renamed from: up */
    private C10727y5 f47828up = null;

    /* JADX INFO: renamed from: yj */
    private boolean f47830yj = false;

    /* JADX INFO: renamed from: rv */
    private boolean f47826rv = true;

    public oiv(TextFrame textFrame, uz3 uz3Var) {
        this.f47824ks = false;
        this.f47825m9 = textFrame;
        this.f47820h4 = uz3Var;
        if (textFrame != null) {
            this.f47824ks = textFrame.f3519k4.m2957ks() == 1;
        }
    }

    /* JADX INFO: renamed from: ix */
    private void m68581ix() {
        C10536m5 c10536m5 = new C10536m5();
        this.f47819fa = c10536m5;
        c10536m5.m51407kk((short) m68592k4());
        TextStyle textStyleM68589fa = m68589fa();
        if (textStyleM68589fa != null && textStyleM68589fa.getLevel(0) != null) {
            C10536m5 c10536m5M3600k4 = ai5.m3600k4(textStyleM68589fa, this.f47820h4.m3738du().m70215k4());
            this.f47819fa.m51276to().clear();
            this.f47819fa.m51276to().addRange(c10536m5M3600k4.m51276to());
        }
        Shape shapeMo64936jd = this.f47820h4.mo64936jd();
        if (shapeMo64936jd == null) {
            return;
        }
        IShape basePlaceholder = shapeMo64936jd.getBasePlaceholder();
        while (true) {
            AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) basePlaceholder, AutoShape.class);
            if (autoShape == null || autoShape.getTextFrame() == null) {
                return;
            }
            TextStyle textStyleM2959m9 = ((TextFrame) autoShape.getTextFrame()).f3519k4.m2959m9();
            if (textStyleM2959m9 != null && textStyleM2959m9.getLevel(0) != null) {
                this.f47819fa.m51273k4(ai5.m3600k4(textStyleM2959m9, this.f47820h4.m3738du().m70215k4()), true);
            }
            basePlaceholder = autoShape.getBasePlaceholder();
        }
    }

    /* JADX INFO: renamed from: ne */
    private void m68583ne() {
        if (this.f47818dy == null) {
            C10548mt c10548mt = new C10548mt();
            this.f47818dy = c10548mt;
            c10548mt.m50512x1(true);
        }
    }

    /* JADX INFO: renamed from: to */
    private int m68584to(int i) {
        C14093tq<Integer> c14093tq = new C14093tq<>();
        TextStyle textStyleM2959m9 = this.f47825m9.f3519k4.m2959m9();
        if (textStyleM2959m9 != null) {
            this.f47825m9.f3519k4.m2959m9().m2979du().CloneTo(c14093tq);
        }
        if (!c14093tq.m67302x1()) {
            this.f47825m9.f3519k4.m2942du().m64162x1().CloneTo(c14093tq);
        }
        if (c14093tq.m67302x1()) {
            i = c14093tq.m67297k4().intValue();
        } else if (i != 4 && !m68590h4()) {
            i = 4;
        }
        if (this.f47825m9.f3519k4.m2959m9() != null) {
            this.f47825m9.f3519k4.m2959m9().m2987k4(new C14093tq<>(Integer.valueOf(i)));
        }
        if (textStyleM2959m9 != null && m68602m9()) {
            ai5.m3611k4(m68591jd(), textStyleM2959m9, this.f47820h4.m3738du().m70215k4());
        }
        return i;
    }

    /* JADX INFO: renamed from: c5 */
    public final C10536m5 m68585c5() {
        return this.f47821jd;
    }

    /* JADX INFO: renamed from: ck */
    public final C10536m5 m68586ck() {
        if (this.f47819fa == null) {
            m68581ix();
        }
        return this.f47819fa;
    }

    /* JADX INFO: renamed from: du */
    public final C10727y5 m68587du() {
        if (this.f47828up == null) {
            this.f47828up = m68609x6() ? this.f47820h4.m3738du().m70215k4().m71951m9().m51704ix().m51969x1() : m68604to().m51346x1().m50594k4();
        }
        return this.f47828up;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m68588dy() {
        return this.f47830yj;
    }

    /* JADX INFO: renamed from: fa */
    public final TextStyle m68589fa() {
        return this.f47825m9.f3519k4.m2959m9();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m68590h4() {
        return this.f47820h4.m72008uz() != null && this.f47820h4.m72008uz().m63909to() == 0;
    }

    /* JADX INFO: renamed from: jd */
    public final C10536m5 m68591jd() {
        return this.f47816ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m68592k4() {
        return this.f47815c5;
    }

    /* JADX INFO: renamed from: kk */
    public final TextFrame m68599kk() {
        return this.f47825m9;
    }

    /* JADX INFO: renamed from: ks */
    public final C10752zi m68601ks() {
        return this.f47823kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m68602m9() {
        if (this.f47820h4.m3738du().m70220kk() <= 3) {
            return m68588dy();
        }
        if (m68590h4()) {
            return !hi8.m7179k4(this.f47820h4.m72008uz().m63906kk());
        }
        int i = this.f47815c5;
        return i == 0 || i == 1 || i == 2 || i == 5 || i == 6 || i == 7;
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m68603rv() {
        return this.f47827to;
    }

    /* JADX INFO: renamed from: up */
    public final C10752zi m68605up() {
        return this.f47822k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68606x1() {
        if (this.f47826rv) {
            ljv.m64417k4(this.f47820h4);
            if (this.f47818dy != null) {
                this.f47820h4.m72000ix().m50507k4(this.f47818dy);
            }
            this.f47826rv = false;
        }
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m68609x6() {
        return this.f47817du;
    }

    /* JADX INFO: renamed from: yj */
    public final C10752zi m68610yj() {
        return this.f47829x1;
    }

    /* JADX INFO: renamed from: kk */
    private void m68582kk(int i) {
        this.f47815c5 = m68584to(i);
        this.f47821jd = this.f47820h4.m3738du().m70215k4().m73698ix()[(int) (((long) this.f47815c5) & 4294967295L)];
        this.f47816ck = null;
        boolean z = false;
        rpo rpoVarM70214k4 = (this.f47820h4.m3738du().m70220kk() >= 3 || this.f47820h4.m3738du().m70234wl()) ? this.f47820h4.m3738du().m70214k4(0) : this.f47820h4.m3738du();
        if (rpoVarM70214k4 != null) {
            C10536m5 c10536m5M64051x1 = rpoVarM70214k4.m70241yj()[(int) (4294967295L & ((long) this.f47815c5))].m64051x1();
            C10536m5 c10536m5 = new C10536m5();
            this.f47816ck = c10536m5;
            c10536m5.m51407kk(c10536m5M64051x1.m51408lr());
            int size = c10536m5M64051x1.m51276to().size();
            for (int i2 = 0; i2 < size; i2++) {
                C10752zi c10752zi = new C10752zi();
                this.f47816ck.m51276to().addItem(c10752zi);
                c10752zi.m52150k4(c10536m5M64051x1.m51276to().get_Item(i2));
                if (i2 > 0) {
                    c10752zi.m52150k4(this.f47816ck.m51276to().get_Item(i2 - 1));
                }
            }
        }
        boolean z2 = this.f47815c5 != 4 && this.f47820h4.m3738du().m70220kk() <= 3;
        this.f47830yj = z2;
        if (this.f47815c5 == 2 && this.f47820h4.m3738du().m70220kk() == 5) {
            z = true;
        }
        this.f47830yj = z2 | z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68593k4(int i) {
        m68582kk(i);
    }

    /* JADX INFO: renamed from: to */
    public final C10548mt m68604to() {
        if (this.f47818dy == null) {
            m68583ne();
        }
        return this.f47818dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68607x1(int i) {
        int i2;
        int i3;
        int i4;
        m68600kk((C10752zi) null);
        m68596k4((C10752zi) null);
        m68608x1((C10752zi) null);
        this.f47819fa = null;
        if (m68586ck() != null && (i4 = i & 65535) < m68586ck().m51276to().size()) {
            m68600kk(m68586ck().m51276to().get_Item(i4));
        }
        if (m68602m9()) {
            if (m68591jd() == null || (i3 = i & 65535) >= m68591jd().m51276to().size()) {
                return;
            }
            m68608x1(m68591jd().m51276to().get_Item(i3));
            return;
        }
        if (m68585c5() == null || (i2 = i & 65535) >= m68585c5().m51276to().size()) {
            return;
        }
        m68596k4(m68585c5().m51276to().get_Item(i2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68594k4(C10546mr c10546mr) {
        C10546mr c10546mr2 = new C10546mr();
        if (m68601ks() != null) {
            c10546mr.m50949x1(m68601ks().m52146k4());
        }
        if (m68610yj() != null) {
            c10546mr2.m50949x1(m68610yj().m52146k4());
        }
        if (m68605up() != null) {
            c10546mr2.m50949x1(m68605up().m52146k4());
        }
        c10546mr.mo50940k4(c10546mr2);
    }

    /* JADX INFO: renamed from: kk */
    public final void m68600kk(C10752zi c10752zi) {
        this.f47823kk = c10752zi;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68608x1(C10752zi c10752zi) {
        this.f47829x1 = c10752zi;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68595k4(C10597pu c10597pu) {
        C10597pu c10597pu2 = new C10597pu();
        if (m68601ks() != null) {
            c10597pu.m50799x1(m68601ks().m52151x1());
        }
        if (m68610yj() != null) {
            c10597pu2.m50799x1(m68610yj().m52151x1());
        }
        if (m68605up() != null) {
            c10597pu2.m50799x1(m68605up().m52151x1());
        }
        c10597pu.mo50793k4((C10441fk) c10597pu2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68596k4(C10752zi c10752zi) {
        this.f47822k4 = c10752zi;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68597k4(boolean z) {
        this.f47827to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m68598k4(IParagraphFormat iParagraphFormat, C10546mr c10546mr, C10597pu c10597pu, IPortionFormat iPortionFormat, oiv oivVar) {
        C10358am c10358amM72007um = this.f47820h4.m72007um();
        C10756zp c10756zp = c10358amM72007um.m50425ck().m51142x1() == null ? null : new C10756zp();
        String languageId = iPortionFormat.getLanguageId();
        if (C14113y2.m67411k4(languageId)) {
            if (iParagraphFormat.getRightToLeft() == 1 || C14093tq.m67295k4(c10546mr.m51336uz(), new C14093tq(1)) || (iParagraphFormat.getRightToLeft() == -1 && oivVar.m68601ks() != null && C14093tq.m67295k4(oivVar.m68601ks().m52146k4().m51336uz(), new C14093tq(1)))) {
                c10756zp = new C10756zp();
                c10756zp.m52170kk().m50523k4((byte) 1);
            }
        } else if (C3047dy.m12870k4(languageId)) {
            c10756zp = new C10756zp();
            c10756zp.m52170kk().m50523k4((byte) 1);
        }
        boolean z = iParagraphFormat.getBullet() != null;
        boolean z2 = c10756zp == null || c10756zp.m52170kk().m51100c5();
        if (z2 && !z) {
            return false;
        }
        if (z) {
            IBulletFormat bullet = iParagraphFormat.getBullet();
            byte type = bullet.getType();
            if (type != -1) {
                if (type != 0) {
                    if (type == 1) {
                        if (c10756zp == null) {
                            c10756zp = new C10756zp();
                        }
                        c10756zp.m52166k4().m51669k4(new C14093tq<>((short) -1));
                        c10756zp.m52166k4().m51667k4((byte) 0);
                    } else if (type == 2) {
                        if (c10756zp == null) {
                            c10756zp = new C10756zp();
                        }
                        c10756zp.m52166k4().m51667k4((byte) 1);
                        m68597k4(true);
                        short numberedBulletStartWith = bullet.getNumberedBulletStartWith();
                        if (numberedBulletStartWith < 0) {
                            numberedBulletStartWith = 1;
                        }
                        byte numberedBulletStyle = bullet.getNumberedBulletStyle();
                        if (numberedBulletStyle == -1) {
                            numberedBulletStyle = 3;
                        }
                        if (numberedBulletStartWith != 1 || numberedBulletStyle != 3) {
                            c10756zp.m52166k4().m51668k4(new C10405dn(numberedBulletStyle, numberedBulletStartWith));
                        }
                    } else if (type == 3) {
                        if (c10756zp == null) {
                            c10756zp = new C10756zp();
                        }
                        c10756zp.m52166k4().m51667k4((byte) 0);
                        c10756zp.m52166k4().m51669k4(new C14093tq<>(Short.valueOf((short) this.f47820h4.m3745to().m3738du().m70215k4().m71948k4(((BulletFormat) bullet).getPicture().getImage()).m71724to())));
                    }
                    m68597k4(true);
                } else if (bullet.getNumberedBulletStyle() != -1) {
                    if (c10756zp == null) {
                        c10756zp = new C10756zp();
                    }
                    c10756zp.m52166k4().m51667k4((byte) 1);
                    m68597k4(true);
                    if (bullet.getNumberedBulletStartWith() != 1 || bullet.getNumberedBulletStyle() != 3) {
                        c10756zp.m52166k4().m51668k4(new C10405dn((int) bullet.getNumberedBulletStyle(), bullet.getNumberedBulletStartWith()));
                    }
                } else if (m68603rv()) {
                    if (c10756zp == null) {
                        c10756zp = new C10756zp();
                    }
                    c10756zp.m52166k4().m51669k4(new C14093tq<>((short) -1));
                    m68597k4(false);
                }
            } else if (bullet.getNumberedBulletStyle() == -1 && !z2) {
                if (m68603rv()) {
                    c10756zp.m52166k4().m51669k4(new C14093tq<>((short) -1));
                } else {
                    m68597k4(true);
                }
            }
        }
        if (c10756zp != null) {
            C10444fw c10444fwM51140h4 = c10358amM72007um.m50425ck().m51140h4();
            c10444fwM51140h4.m50512x1(true);
            int iM51966k4 = c10444fwM51140h4.m50801x1().m51966k4(c10756zp);
            if (iM51966k4 > 0) {
                c10597pu.m51524k4(new C14093tq<>(Byte.valueOf((byte) iM51966k4)));
            }
        }
        return c10756zp != null;
    }
}
