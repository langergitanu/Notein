package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.zb */
/* JADX INFO: loaded from: classes3.dex */
final class C14879zb {

    /* JADX INFO: renamed from: c5 */
    private boolean f50515c5;

    /* JADX INFO: renamed from: ck */
    private Paragraph f50516ck;

    /* JADX INFO: renamed from: dy */
    private Picture f50518dy;

    /* JADX INFO: renamed from: fa */
    private final ColorFormat f50519fa;

    /* JADX INFO: renamed from: ix */
    private long f50521ix;

    /* JADX INFO: renamed from: jd */
    private Portion f50522jd;

    /* JADX INFO: renamed from: ne */
    private ParagraphFormat f50527ne;

    /* JADX INFO: renamed from: rv */
    private InterfaceC14397rj f50528rv;

    /* JADX INFO: renamed from: up */
    private final C14460sl f50530up;

    /* JADX INFO: renamed from: x6 */
    private IPresentationComponent f50532x6;

    /* JADX INFO: renamed from: yj */
    private final C0790b2 f50533yj;

    /* JADX INFO: renamed from: to */
    private C14093tq<Integer> f50529to = new C14093tq<>();

    /* JADX INFO: renamed from: x1 */
    private byte f50531x1 = -1;

    /* JADX INFO: renamed from: kk */
    private byte f50524kk = -1;

    /* JADX INFO: renamed from: du */
    private float f50517du = Float.NaN;

    /* JADX INFO: renamed from: k4 */
    private byte f50523k4 = -1;

    /* JADX INFO: renamed from: h4 */
    private short f50520h4 = -1;

    /* JADX INFO: renamed from: m9 */
    private byte f50526m9 = -1;

    /* JADX INFO: renamed from: ks */
    private C13827mb f50525ks = C1143gg.m6636k4(m74417rv());

    public C14879zb(InterfaceC14397rj interfaceC14397rj, ColorFormat colorFormat, Picture picture, C14460sl c14460sl, C0790b2 c0790b2) {
        this.f50528rv = interfaceC14397rj;
        this.f50519fa = colorFormat;
        this.f50527ne = (ParagraphFormat) C7019kk.m27452k4((Object) interfaceC14397rj, ParagraphFormat.class);
        this.f50518dy = picture;
        this.f50530up = c14460sl;
        this.f50533yj = c0790b2;
    }

    /* JADX INFO: renamed from: ix */
    private void m74389ix() {
        this.f50521ix++;
    }

    /* JADX INFO: renamed from: c5 */
    public final byte m74394c5() {
        return this.f50524kk;
    }

    /* JADX INFO: renamed from: ck */
    public final void m74395ck() {
        Paragraph paragraph = (Paragraph) C7019kk.m27452k4((Object) this.f50527ne.getParent_Immediate(), Paragraph.class);
        if (paragraph == null) {
            throw new InvalidOperationException("Parent formatted object is not a paragraph.");
        }
        if (paragraph.m2154ck() == null) {
            throw new InvalidOperationException("Paragraph wasn't added to any ITextFrame.Paragraphs collection (add it first).");
        }
        float fM74391k4 = m74391k4(paragraph);
        if (fM74391k4 == 0.0f) {
            this.f50527ne.setIndent(Float.NaN);
            this.f50527ne.setMarginLeft(Float.NaN);
            return;
        }
        IParagraphFormat iParagraphFormat = paragraph.m2154ck().m2179kk().m2907h4()[paragraph.getParagraphFormat().getDepth() > 0 ? paragraph.getParagraphFormat().getDepth() : (short) 0];
        if (iParagraphFormat.getBullet().getType() == -1) {
            this.f50527ne.setIndent(-fM74391k4);
            this.f50527ne.setMarginLeft(iParagraphFormat.getMarginLeft() + fM74391k4);
        } else if (m74392k4(iParagraphFormat.getBullet().getType(), this.f50527ne.getBullet().getType())) {
            this.f50527ne.setIndent(Float.NaN);
            this.f50527ne.setMarginLeft(Float.NaN);
        } else if (iParagraphFormat.getIndent() <= 0.0f) {
            this.f50527ne.setIndent(-fM74391k4);
            this.f50527ne.setMarginLeft(iParagraphFormat.getIndent() + iParagraphFormat.getMarginLeft() + fM74391k4);
        } else {
            this.f50527ne.setIndent(-fM74391k4);
            this.f50527ne.setMarginLeft(iParagraphFormat.getMarginLeft() + fM74391k4);
        }
    }

    /* JADX INFO: renamed from: du */
    public final float m74396du() {
        return this.f50517du;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m74397dy() {
        return this.f50526m9;
    }

    public boolean equals(Object obj) {
        BulletFormat bulletFormat = (BulletFormat) C7019kk.m27452k4(obj, BulletFormat.class);
        return bulletFormat != null && !C14093tq.m67296x1(m74398fa().m70668k4(), bulletFormat.m433h4().m70668k4()) && m74420up().m3938k4() == bulletFormat.m440m9().m3938k4() && !C14093tq.m67296x1(m74398fa().m70668k4(), bulletFormat.m433h4().m70668k4()) && C14113y2.m67363du(m74420up().m3941x1(), bulletFormat.m440m9().m3941x1()) && C3085sv.m13089k4((float) m74401k4(), (float) bulletFormat.getType()) && C3085sv.m13089k4((float) m74394c5(), (float) bulletFormat.isBulletHardColor()) && C3085sv.m13089k4((float) m74400jd(), (float) bulletFormat.isBulletHardFont()) && C3085sv.m13089k4(m74396du(), bulletFormat.getHeight()) && C3085sv.m13089k4((float) m74415m9(), (float) bulletFormat.getNumberedBulletStartWith()) && C3085sv.m13089k4((float) m74397dy(), (float) bulletFormat.getNumberedBulletStyle()) && C3085sv.m13090k4(m74418to(), bulletFormat.getFont()) && C3085sv.m13090k4(m74399h4(), bulletFormat.getColor());
    }

    /* JADX INFO: renamed from: fa */
    public final C14460sl m74398fa() {
        return this.f50530up;
    }

    /* JADX INFO: renamed from: h4 */
    public final IColorFormat m74399h4() {
        return this.f50519fa;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: jd */
    public final byte m74400jd() {
        return this.f50531x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m74401k4() {
        return this.f50523k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m74411kk() {
        return m74420up().m3941x1();
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m74414ks() {
        return m74420up().m3938k4() != -1;
    }

    /* JADX INFO: renamed from: m9 */
    public final short m74415m9() {
        return this.f50520h4;
    }

    /* JADX INFO: renamed from: ne */
    public final long m74416ne() {
        long version = ((((this.f50521ix & 4294967295L) + (this.f50519fa.getVersion() & 4294967295L)) & 4294967295L) + (this.f50518dy.getVersion() & 4294967295L)) & 4294967295L;
        long version2 = 0;
        if (m74425x6() != null) {
            long version3 = m74425x6().m2295x1().getVersion() & 4294967295L;
            if (m74425x6() != null && m74425x6().m2282fa() != null) {
                version2 = m74425x6().m2282fa().m2161k4().m2204to().getVersion();
            }
            version2 = (version3 + (version2 & 4294967295L)) & 4294967295L;
        }
        return (version + (version2 & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: rv */
    public final IPresentationComponent m74417rv() {
        IPresentationComponent iPresentationComponent = this.f50532x6;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f50528rv, iPresentationComponentArr);
            this.f50532x6 = iPresentationComponentArr[0];
        }
        return this.f50532x6;
    }

    /* JADX INFO: renamed from: to */
    public final IFontData m74418to() {
        if (this.f50529to.m67302x1()) {
            return this.f50525ks.m64802k4(this.f50529to.m67297k4().intValue() & 65535).m70073x1();
        }
        return null;
    }

    public String toString() {
        return C14113y2.m67408k4("BulletFormat: ", C14042ak.m66410k4(BulletType.class, this.f50523k4));
    }

    /* JADX INFO: renamed from: up */
    public final C0790b2 m74420up() {
        return this.f50533yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final char m74421x1() {
        return (char) m74420up().m3938k4();
    }

    /* JADX INFO: renamed from: x6 */
    public final Portion m74425x6() {
        Portion portion;
        if (!this.f50515c5 || ((portion = this.f50522jd) != null && (portion.m2282fa() == null || !this.f50522jd.m2282fa().equals(this.f50516ck)))) {
            Paragraph[] paragraphArr = {this.f50516ck};
            boolean z = kke.m63959k4(Paragraph.class, this.f50528rv, paragraphArr) && paragraphArr[0].getPortions().getCount() > 0;
            Paragraph paragraph = paragraphArr[0];
            this.f50516ck = paragraph;
            if (z) {
                this.f50522jd = (Portion) paragraph.getPortions().get_Item(0);
            }
            this.f50515c5 = true;
        }
        return this.f50522jd;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m74426yj() {
        return (m74401k4() == 0 || m74401k4() == -1) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private double m74390k4(double d) {
        if (m74397dy() == -1) {
            return 0.0d;
        }
        if (m74397dy() == 3 || m74397dy() == 2 || m74397dy() == 1 || m74397dy() == 9 || m74397dy() == 0) {
            if (d <= 12.0d) {
                return 0.64d;
            }
            if (d > 12.0d && d <= 18.0d) {
                return 0.95d;
            }
            if (d > 18.0d && d <= 25.0d) {
                return 1.27d;
            }
            if (d > 25.0d && d <= 35.0d) {
                return 1.43d;
            }
            if (d > 35.0d && d <= 44.0d) {
                return 2.06d;
            }
            if (d > 44.0d && d <= 56.0d) {
                return 2.54d;
            }
            if (d > 56.0d && d <= 72.0d) {
                return 3.18d;
            }
            if (d > 72.0d) {
                return 3.81d;
            }
        } else if (m74397dy() == 7 || m74397dy() == 6) {
            if (d <= 12.0d) {
                return 0.79d;
            }
            if (d > 12.0d && d <= 18.0d) {
                return 1.11d;
            }
            if (d > 18.0d && d <= 25.0d) {
                return 1.43d;
            }
            if (d > 25.0d && d <= 35.0d) {
                return 1.59d;
            }
            if (d > 35.0d && d <= 44.0d) {
                return 2.38d;
            }
            if (d > 44.0d && d <= 56.0d) {
                return 2.86d;
            }
            if (d > 56.0d && d <= 72.0d) {
                return 3.18d;
            }
            if (d > 72.0d) {
                return 3.81d;
            }
        } else if (m74397dy() == 12 || m74397dy() == 13 || m74397dy() == 8 || m74397dy() == 10 || m74397dy() == 11) {
            if (d <= 12.0d) {
                return 0.64d;
            }
            if (d > 12.0d && d <= 18.0d) {
                return 0.95d;
            }
            if (d > 18.0d && d <= 25.0d) {
                return 1.27d;
            }
            if (d > 25.0d && d <= 35.0d) {
                return 1.43d;
            }
            if (d > 35.0d && d <= 44.0d) {
                return 2.06d;
            }
            if (d > 44.0d && d <= 56.0d) {
                return 2.54d;
            }
            if (d > 56.0d && d <= 72.0d) {
                return 3.18d;
            }
            if (d > 72.0d) {
                return 3.81d;
            }
        } else {
            if (d <= 12.0d) {
                return 0.79d;
            }
            if (d > 12.0d && d <= 18.0d) {
                return 1.11d;
            }
            if (d > 18.0d && d <= 25.0d) {
                return 1.43d;
            }
            if (d > 25.0d && d <= 35.0d) {
                return 1.59d;
            }
            if (d > 35.0d && d <= 44.0d) {
                return 2.38d;
            }
            if (d > 44.0d && d <= 56.0d) {
                return 2.86d;
            }
            if (d > 56.0d && d <= 72.0d) {
                return 3.18d;
            }
            if (d > 72.0d) {
                return 3.81d;
            }
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: x1 */
    private double m74393x1(double d) {
        boolean z = true;
        if (m74401k4() != 1 && m74401k4() != 3) {
            z = false;
        }
        C6005k4.m24261k4(z);
        if (d <= 12.0d) {
            return 0.48d;
        }
        if (d > 12.0d && d <= 18.0d) {
            return 0.79d;
        }
        if (d > 18.0d && d <= 25.0d) {
            return 0.95d;
        }
        if (d > 25.0d && d <= 35.0d) {
            return 1.27d;
        }
        if (d > 35.0d && d <= 44.0d) {
            return 1.59d;
        }
        if (d > 44.0d && d <= 56.0d) {
            return 1.91d;
        }
        if (d <= 56.0d || d > 72.0d) {
            return d > 72.0d ? 3.18d : 0.0d;
        }
        return 2.38d;
    }

    /* JADX INFO: renamed from: kk */
    public final void m74412kk(byte b) {
        if (this.f50524kk != b) {
            this.f50524kk = b;
            m74389ix();
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m74419to(byte b) {
        if (this.f50531x1 != b) {
            this.f50531x1 = b;
            m74389ix();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private float m74391k4(Paragraph paragraph) {
        if (m74401k4() == 0 || m74401k4() == -1) {
            return 0.0f;
        }
        double dM4837m9 = (paragraph.getPortions().getCount() > 0 ? ((Portion) paragraph.getPortions().get_Item(0)).m2295x1().m2305bv() : (lrb) paragraph.getParagraphFormat().getEffective().getDefaultPortionFormat()).m4837m9();
        return (float) (((m74401k4() == 2 ? m74390k4(dM4837m9) : (m74401k4() == 1 || m74401k4() == 3) ? m74393x1(dM4837m9) : 0.0d) * 360000.0d) / 12700.0d);
    }

    /* JADX INFO: renamed from: kk */
    public final void m74413kk(IBulletFormat iBulletFormat) {
        if (this.f50523k4 == -1) {
            this.f50523k4 = iBulletFormat.getType();
        }
        if (this.f50531x1 == -1) {
            this.f50531x1 = iBulletFormat.isBulletHardFont();
        }
        if (this.f50524kk == -1) {
            this.f50524kk = iBulletFormat.isBulletHardColor();
        }
        String strM3941x1 = m74420up().m3941x1();
        if (m74420up().m3938k4() == -1) {
            m74420up().m3940k4(((BulletFormat) iBulletFormat).m440m9().m3938k4());
        }
        if (C14113y2.m67411k4(strM3941x1)) {
            m74420up().m3939k4(((BulletFormat) iBulletFormat).m440m9().m3941x1());
        }
        if (m74418to() == null) {
            m74406k4((FontData) iBulletFormat.getFont());
        }
        if (C14064he.m66715kk(this.f50517du)) {
            this.f50517du = iBulletFormat.getHeight();
        }
        if (this.f50519fa.getColorType() == -1) {
            this.f50519fa.m1079k4((ColorFormat) iBulletFormat.getColor());
        }
        if (this.f50520h4 == -1) {
            this.f50520h4 = iBulletFormat.getNumberedBulletStartWith();
        }
        if (this.f50526m9 == -1) {
            this.f50526m9 = iBulletFormat.getNumberedBulletStyle();
        }
        if (this.f50518dy.getImage() == null) {
            this.f50518dy.m2238k4((Picture) ((BulletFormat) iBulletFormat).getPicture());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74422x1(byte b) {
        if (this.f50526m9 != b) {
            this.f50526m9 = b;
            m74389ix();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74402k4(byte b) {
        if (this.f50523k4 != b) {
            this.f50523k4 = b;
            m74389ix();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74423x1(BulletFormat bulletFormat) {
        if (bulletFormat.getType() != -1) {
            this.f50523k4 = bulletFormat.getType();
        }
        if (bulletFormat.getFont() != null) {
            m74406k4(bulletFormat.getFont());
        }
        if (!((ColorFormat) bulletFormat.getColor()).m1072fa()) {
            this.f50519fa.m1079k4((ColorFormat) bulletFormat.getColor());
        }
        if (!C3085sv.m13089k4(bulletFormat.getHeight(), Float.NaN)) {
            this.f50517du = bulletFormat.getHeight();
        }
        if (!C3085sv.m13089k4(bulletFormat.isBulletHardColor(), -1.0f)) {
            this.f50524kk = bulletFormat.isBulletHardColor();
        }
        if (!C3085sv.m13089k4(bulletFormat.isBulletHardFont(), -1.0f)) {
            this.f50531x1 = bulletFormat.isBulletHardFont();
        }
        if (!C3085sv.m13089k4(bulletFormat.getNumberedBulletStartWith(), -1.0f)) {
            this.f50520h4 = bulletFormat.getNumberedBulletStartWith();
        }
        if (!C3085sv.m13089k4(bulletFormat.getNumberedBulletStyle(), -1.0f)) {
            this.f50526m9 = bulletFormat.getNumberedBulletStyle();
        }
        this.f50518dy.m2238k4((Picture) bulletFormat.getPicture());
        if (!C3085sv.m13089k4(bulletFormat.m440m9().m3938k4(), -1.0f)) {
            m74420up().m3940k4(bulletFormat.m440m9().m3938k4());
        }
        if (!C3085sv.m13090k4(bulletFormat.m440m9().m3941x1(), C14113y2.f47374k4)) {
            m74420up().m3939k4(bulletFormat.m440m9().m3941x1());
        }
        m74389ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74403k4(char c) {
        short s = (short) c;
        if (m74420up().m3938k4() != s) {
            m74420up().m3940k4(s);
            m74389ix();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74424x1(IBulletFormat iBulletFormat) {
        byte b = this.f50523k4;
        if (b != -1) {
            iBulletFormat.setType(b);
        }
        byte b2 = this.f50531x1;
        if (b2 != -1) {
            iBulletFormat.setBulletHardFont(b2);
        }
        byte b3 = this.f50524kk;
        if (b3 != -1) {
            iBulletFormat.setBulletHardColor(b3);
        }
        if (m74420up().m3938k4() != -1) {
            ((BulletFormat) iBulletFormat).m440m9().m3940k4(m74420up().m3938k4());
        }
        if (C14113y2.m67411k4(m74420up().m3941x1())) {
            ((BulletFormat) iBulletFormat).m440m9().m3939k4(m74420up().m3941x1());
        }
        if (m74418to() != null) {
            iBulletFormat.setFont(m74418to());
        }
        if (!C14064he.m66715kk(this.f50517du)) {
            iBulletFormat.setHeight(this.f50517du);
        }
        if (this.f50519fa.getColorType() != -1) {
            ((ColorFormat) iBulletFormat.getColor()).m1079k4(this.f50519fa);
        }
        short s = this.f50520h4;
        if (s != -1) {
            iBulletFormat.setNumberedBulletStartWith(s);
        }
        byte b4 = this.f50526m9;
        if (b4 != -1) {
            iBulletFormat.setNumberedBulletStyle(b4);
        }
        if (this.f50518dy.getImage() != null) {
            ((BulletFormat) iBulletFormat).m432dy().m2238k4(this.f50518dy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74404k4(float f) {
        if (this.f50517du != f) {
            this.f50517du = f;
            m74389ix();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74405k4(BulletFormat bulletFormat) {
        this.f50524kk = bulletFormat.isBulletHardColor();
        this.f50531x1 = bulletFormat.isBulletHardFont();
        m74420up().m3940k4(bulletFormat.m440m9().m3938k4());
        m74420up().m3939k4(bulletFormat.m440m9().m3941x1());
        this.f50519fa.m1079k4((ColorFormat) bulletFormat.getColor());
        m74406k4((FontData) bulletFormat.getFont());
        this.f50517du = bulletFormat.getHeight();
        this.f50518dy.m2238k4((Picture) bulletFormat.getPicture());
        this.f50523k4 = bulletFormat.getType();
        this.f50520h4 = bulletFormat.getNumberedBulletStartWith();
        this.f50526m9 = bulletFormat.getNumberedBulletStyle();
        m74389ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74406k4(IFontData iFontData) {
        if (iFontData != null) {
            this.f50529to = new C14093tq<>(Integer.valueOf(this.f50525ks.m64799k4(C13827mb.m64790k4(iFontData.getFontName()), iFontData)));
        } else {
            this.f50529to = new C14093tq<>();
        }
        m74389ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74407k4(C13750kw c13750kw) {
        if (c13750kw.getFillFormat().getFillType() == 1) {
            this.f50519fa.m1089x1(((C14176nc) c13750kw.getFillFormat()).m67938m9().Clone());
        }
        if (c13750kw.getFillFormat().getFillType() == 4) {
            this.f50518dy.m2237k4(c13750kw.getFillFormat().getPictureFillFormat().getPicture());
        }
        this.f50524kk = c13750kw.isBulletHardColor() ? (byte) 1 : (byte) 0;
        this.f50531x1 = c13750kw.isBulletHardFont() ? (byte) 1 : (byte) 0;
        m74420up().m3940k4((short) c13750kw.getChar());
        m74420up().m3939k4(c13750kw.mo64221x1());
        m74406k4((FontData) c13750kw.getFont());
        this.f50517du = c13750kw.f45904m9;
        this.f50523k4 = c13750kw.f45902kk;
        this.f50520h4 = c13750kw.getNumberedBulletStartWith();
        this.f50526m9 = c13750kw.getNumberedBulletStyle();
        m74389ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74408k4(String str) {
        if (C14113y2.m67363du(m74420up().m3941x1(), str)) {
            return;
        }
        m74420up().m3939k4(str);
        m74389ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74409k4(short s) {
        if (this.f50520h4 != s) {
            this.f50520h4 = s;
            m74389ix();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m74392k4(byte b, byte b2) {
        if (b != 2 || b2 != 2) {
            if (b == 1 || b == 3) {
                return b2 == 1 || b2 == 3;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m74410k4(IBulletFormat iBulletFormat) {
        if (this.f50523k4 != iBulletFormat.getType() || this.f50531x1 != iBulletFormat.isBulletHardFont() || this.f50524kk != iBulletFormat.isBulletHardColor()) {
            return false;
        }
        BulletFormat bulletFormat = (BulletFormat) iBulletFormat;
        if (m74420up().m3938k4() != bulletFormat.m440m9().m3938k4() || !C14113y2.m67363du(m74420up().m3941x1(), bulletFormat.m440m9().m3941x1())) {
            return false;
        }
        if (((m74418to() == null || !m74418to().equals(iBulletFormat.getFont())) && !(m74418to() == null && iBulletFormat.getFont() == null)) || !C3085sv.m13089k4(this.f50517du, iBulletFormat.getHeight())) {
            return false;
        }
        ColorFormat colorFormat = this.f50519fa;
        return ((colorFormat != null && colorFormat.equals(iBulletFormat.getColor())) || (this.f50519fa == null && iBulletFormat.getColor() == null)) && this.f50520h4 == iBulletFormat.getNumberedBulletStartWith() && this.f50526m9 == iBulletFormat.getNumberedBulletStyle();
    }
}
