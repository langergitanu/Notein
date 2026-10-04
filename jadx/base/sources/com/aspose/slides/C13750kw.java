package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.kw */
/* JADX INFO: loaded from: classes3.dex */
final class C13750kw extends AbstractC0858ck<BulletFormat, C13750kw> implements IBulletFormatEffectiveData, InterfaceC14271p9 {

    /* JADX INFO: renamed from: rv */
    private static final C13750kw f45893rv = m64211h4();

    /* JADX INFO: renamed from: c5 */
    byte f45894c5;

    /* JADX INFO: renamed from: ck */
    ku2 f45895ck;

    /* JADX INFO: renamed from: du */
    String f45896du;

    /* JADX INFO: renamed from: dy */
    short f45897dy;

    /* JADX INFO: renamed from: fa */
    boolean f45898fa;

    /* JADX INFO: renamed from: h4 */
    FontData f45899h4;

    /* JADX INFO: renamed from: ix */
    private fqc f45900ix;

    /* JADX INFO: renamed from: jd */
    final C14811xp f45901jd;

    /* JADX INFO: renamed from: kk */
    byte f45902kk;

    /* JADX INFO: renamed from: ks */
    private C14176nc f45903ks;

    /* JADX INFO: renamed from: m9 */
    float f45904m9;

    /* JADX INFO: renamed from: ne */
    private String f45905ne;

    /* JADX INFO: renamed from: to */
    short f45906to;

    /* JADX INFO: renamed from: up */
    boolean f45907up;

    /* JADX INFO: renamed from: x6 */
    private int f45908x6;

    /* JADX INFO: renamed from: yj */
    private FontData f45909yj;

    public C13750kw() {
        super((Object) null);
        this.f45904m9 = Float.NaN;
        this.f45908x6 = 0;
        this.f45905ne = null;
        C14811xp c14811xp = new C14811xp();
        this.f45901jd = c14811xp;
        c14811xp.m73525k4(C12003du.m56460uz().Clone());
        this.f45895ck = new ku2();
        this.f45902kk = (byte) 0;
        this.f45906to = (short) 8226;
        this.f45896du = C14113y2.m67389k4((char) 8226, 1);
        this.f45899h4 = C13827mb.f46185k4;
        this.f45904m9 = 100.0f;
        this.f45897dy = (short) 1;
        this.f45894c5 = (byte) 3;
        this.f45898fa = false;
        this.f45907up = false;
        this.f45903ks = C14176nc.m67925yj();
    }

    /* JADX INFO: renamed from: h4 */
    public static C13750kw m64211h4() {
        return new C13750kw();
    }

    /* JADX INFO: renamed from: k4 */
    public static C13750kw m64212k4(BulletFormat bulletFormat) {
        IBulletFormatEffectiveData bullet;
        IPresentationComponent parent_IPresentationComponent = bulletFormat.getParent_IPresentationComponent();
        if (parent_IPresentationComponent == null) {
            return f45893rv;
        }
        if (C7019kk.m27469x1(parent_IPresentationComponent, Paragraph.class)) {
            Paragraph paragraph = (Paragraph) parent_IPresentationComponent;
            bullet = ((TextStyle) paragraph.m2154ck().m2179kk().getTextFrameFormat().getTextStyle()).getEffective().getLevel(paragraph.getParagraphFormat().getDepth() > 0 ? paragraph.getParagraphFormat().getDepth() : (short) 0).getBullet();
        } else {
            if (!C7019kk.m27469x1(parent_IPresentationComponent, Field.class)) {
                throw new NotImplementedException();
            }
            bullet = ((Field) parent_IPresentationComponent).m1446kk().m2282fa().m2161k4().m2200ks().getBullet();
        }
        return (C13750kw) bullet;
    }

    /* JADX INFO: renamed from: m9 */
    private String m64214m9() {
        int iM2167m9;
        ParagraphFormat paragraphFormatM4601W_ = this.f45900ix.m4601W_();
        Paragraph paragraph = (Paragraph) C7019kk.m27452k4((Object) paragraphFormatM4601W_.getParent_IPresentationComponent(), Paragraph.class);
        TextFrame[] textFrameArr = {null};
        return (!(paragraph != null && kke.m63959k4(TextFrame.class, paragraphFormatM4601W_, textFrameArr)) || (iM2167m9 = paragraph.m2167m9()) == -1) ? "" : nrw.m68188k4(textFrameArr[0], 0)[iM2167m9].m68189du();
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData
    public final String getActualBulletValue() {
        if (this.f45902kk != 3 && this.f45905ne == null) {
            this.f45905ne = m64214m9();
        }
        return this.f45905ne;
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData
    public final char getChar() {
        return (char) this.f45906to;
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData
    public final IFillFormatEffectiveData getFillFormat() {
        return this.f45903ks;
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData
    public final IFontData getFont() {
        return this.f45909yj;
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData
    public final float getHeight() {
        return this.f45904m9;
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData, com.aspose.slides.InterfaceC14271p9
    public final short getNumberedBulletStartWith() {
        return this.f45897dy;
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData, com.aspose.slides.InterfaceC14271p9
    public final byte getNumberedBulletStyle() {
        return this.f45894c5;
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData
    public final IPictureEffectiveData getPicture() {
        return this.f45895ck;
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData, com.aspose.slides.InterfaceC14271p9
    public final byte getType() {
        return this.f45902kk;
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData
    public final boolean isBulletHardColor() {
        return this.f45898fa;
    }

    @Override // com.aspose.slides.IBulletFormatEffectiveData
    public final boolean isBulletHardFont() {
        return this.f45907up;
    }

    /* JADX INFO: renamed from: kk */
    public final void m64220kk(BulletFormat bulletFormat) {
        C14811xp c14811xpM67926c5;
        C14811xp c14811xpM67926c52;
        C14811xp c14811xp;
        ColorFormat colorFormat;
        int i = this.f45908x6;
        if (i < 2) {
            try {
                this.f45908x6 = i + 1;
                if (this.f45902kk != 3 && !this.f45898fa && bulletFormat.m430ck() != null) {
                    C14176nc c14176ncM1454dy = ((FillFormat) bulletFormat.m430ck().getPortionFormat().getFillFormat()).m1454dy();
                    this.f45903ks.m67930h4();
                    this.f45903ks.m67934k4((InterfaceC14672vc) c14176ncM1454dy);
                    if (c14176ncM1454dy.getFillType() != 1) {
                        this.f45903ks.m67926c5().m73523k4(new ColorFormat(bulletFormat.m430ck(), C12003du.m56460uz().Clone()));
                    }
                    if (c14176ncM1454dy.getFillType() == 0) {
                        this.f45903ks.f47502kk = (byte) 1;
                    }
                    if (c14176ncM1454dy.getFillType() == 1) {
                        c14811xpM67926c5 = this.f45901jd;
                        c14811xpM67926c52 = c14176ncM1454dy.m67926c5();
                        c14811xpM67926c5.m73526k4(c14811xpM67926c52);
                    } else {
                        if (c14176ncM1454dy.getFillType() == 0) {
                            c14811xp = this.f45901jd;
                            colorFormat = new ColorFormat(bulletFormat.m430ck(), C12003du.m56460uz().Clone());
                        } else {
                            c14811xp = this.f45901jd;
                            colorFormat = new ColorFormat(bulletFormat.m430ck(), C12003du.f40505to.Clone());
                        }
                        c14811xp.m73523k4(colorFormat);
                    }
                } else if (this.f45902kk != 3 || this.f45895ck.getImage() == null) {
                    this.f45903ks.m67930h4();
                    C14176nc c14176nc = this.f45903ks;
                    c14176nc.f47502kk = (byte) 1;
                    c14811xpM67926c5 = c14176nc.m67926c5();
                    c14811xpM67926c52 = this.f45901jd;
                    c14811xpM67926c5.m73526k4(c14811xpM67926c52);
                } else {
                    this.f45903ks.m67930h4();
                    C14176nc c14176nc2 = this.f45903ks;
                    c14176nc2.f47502kk = (byte) 4;
                    c14176nc2.m67929fa().m69789c5().m64179k4((InterfaceC14672vc) this.f45895ck);
                }
                this.f45908x6--;
            } catch (Throwable th) {
                this.f45908x6--;
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.InterfaceC14271p9
    /* JADX INFO: renamed from: x1 */
    public final String mo64221x1() {
        return this.f45896du;
    }

    public C13750kw(BulletFormat bulletFormat) {
        this(bulletFormat, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static C13750kw m64213k4(BulletFormat bulletFormat, C13750kw c13750kw) {
        return c13750kw != null ? new C13750kw(bulletFormat, c13750kw) : new C13750kw(bulletFormat);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64222x1(BulletFormat bulletFormat) {
        if (C7019kk.m27469x1(bulletFormat.getParent_IPresentationComponent(), MasterSlide.class) && !bulletFormat.m434jd()) {
            this.f45902kk = (byte) 0;
        }
        if (bulletFormat.getType() != -1) {
            this.f45902kk = bulletFormat.getType();
        }
        if (bulletFormat.m440m9().m3938k4() != -1) {
            this.f45906to = bulletFormat.m440m9().m3938k4();
        }
        if (!C14113y2.m67411k4(bulletFormat.m440m9().m3941x1())) {
            this.f45896du = bulletFormat.m440m9().m3941x1();
        }
        if (bulletFormat.getFont() != null) {
            this.f45899h4 = (FontData) bulletFormat.getFont();
        }
        if (!C14064he.m66715kk(bulletFormat.getHeight())) {
            this.f45904m9 = bulletFormat.getHeight();
        }
        if (bulletFormat.getNumberedBulletStartWith() != -1) {
            this.f45897dy = bulletFormat.getNumberedBulletStartWith();
        }
        if (bulletFormat.getNumberedBulletStyle() != -1) {
            this.f45894c5 = bulletFormat.getNumberedBulletStyle();
        }
        if (bulletFormat.getColor().getColorType() != -1) {
            this.f45901jd.m73523k4((ColorFormat) bulletFormat.getColor());
        }
        if (bulletFormat.getPicture().getImage() != null) {
            this.f45895ck.m64178k4(bulletFormat.m432dy());
        }
        if (bulletFormat.isBulletHardColor() != -1) {
            this.f45898fa = bulletFormat.isBulletHardColor() == 1;
        }
        if (bulletFormat.isBulletHardFont() != -1) {
            this.f45907up = bulletFormat.isBulletHardFont() == 1;
        }
        this.f45905ne = null;
    }

    public C13750kw(BulletFormat bulletFormat, C13750kw c13750kw) {
        super(bulletFormat);
        this.f45904m9 = Float.NaN;
        this.f45908x6 = 0;
        this.f45905ne = null;
        this.f45901jd = new C14811xp();
        m64215x1(false);
        m64216k4((InterfaceC14672vc) c13750kw);
    }

    /* JADX INFO: renamed from: x1 */
    private void m64215x1(boolean z) {
        this.f45895ck = new ku2();
        C14176nc c14176nc = new C14176nc(this);
        this.f45903ks = c14176nc;
        if (z) {
            return;
        }
        C13750kw c13750kw = f45893rv;
        c14176nc.m67934k4((InterfaceC14672vc) c13750kw.getFillFormat());
        if (this.f45903ks.getFillType() == 4) {
            this.f45903ks.m67929fa().m69796k4((InterfaceC14672vc) c13750kw.getFillFormat().getPictureFillFormat());
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo6273k4(IBaseSlide iBaseSlide) {
        FontData fontDataM1484du;
        if (iBaseSlide == null || this.f45899h4 == null) {
            fontDataM1484du = FontData.m1484du();
        } else {
            fontDataM1484du = this.f45899h4.m1486k4(iBaseSlide.createThemeEffective());
        }
        this.f45909yj = fontDataM1484du;
    }

    public C13750kw(BulletFormat bulletFormat, boolean z) {
        super(bulletFormat);
        this.f45904m9 = Float.NaN;
        this.f45908x6 = 0;
        this.f45905ne = null;
        this.f45901jd = new C14811xp();
        m64215x1(z);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        dm6 dm6Var2 = this.f45898fa ? new dm6(null, null) : dm6Var;
        this.f45901jd.m73524k4(iBaseSlide, dm6Var2);
        this.f45895ck.mo4833k4(iBaseSlide, dm6Var);
        this.f45903ks.mo4833k4(iBaseSlide, dm6Var2);
        if (this.f45903ks.getFillType() != 1) {
            this.f45903ks.m67926c5().m73524k4(iBaseSlide, dm6Var2);
        }
    }

    public C13750kw(fqc fqcVar) {
        super((InterfaceC14398rk) fqcVar);
        this.f45904m9 = Float.NaN;
        this.f45908x6 = 0;
        this.f45905ne = null;
        this.f45901jd = new C14811xp();
        m64215x1(false);
        this.f45900ix = fqcVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64216k4(InterfaceC14672vc interfaceC14672vc) {
        C13750kw c13750kw = (C13750kw) interfaceC14672vc;
        this.f45902kk = c13750kw.f45902kk;
        this.f45906to = c13750kw.f45906to;
        this.f45896du = c13750kw.f45896du;
        this.f45899h4 = c13750kw.f45899h4;
        this.f45904m9 = c13750kw.f45904m9;
        this.f45897dy = c13750kw.f45897dy;
        this.f45894c5 = c13750kw.f45894c5;
        this.f45901jd.m73526k4(c13750kw.f45901jd);
        this.f45895ck.m64179k4((InterfaceC14672vc) c13750kw.f45895ck);
        this.f45898fa = c13750kw.f45898fa;
        this.f45907up = c13750kw.f45907up;
        this.f45903ks.m67934k4((InterfaceC14672vc) c13750kw.f45903ks);
    }

    public C13750kw(fqc fqcVar, C13750kw c13750kw) {
        super((InterfaceC14398rk) fqcVar);
        this.f45904m9 = Float.NaN;
        this.f45908x6 = 0;
        this.f45905ne = null;
        this.f45901jd = new C14811xp();
        m64215x1(false);
        this.f45900ix = fqcVar;
        m64216k4((InterfaceC14672vc) c13750kw);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, BulletFormat bulletFormat) {
        m64216k4(interfaceC14672vc);
        m64222x1(bulletFormat);
        m64220kk(bulletFormat);
    }

    @Override // com.aspose.slides.InterfaceC14271p9
    /* JADX INFO: renamed from: k4 */
    public final boolean mo64218k4() {
        return getType() != 0;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C13750kw c13750kw) {
        FontData fontData;
        return c13750kw != null && this.f45902kk == c13750kw.f45902kk && this.f45906to == c13750kw.f45906to && C14113y2.m67363du(this.f45896du, c13750kw.f45896du) && ((fontData = this.f45909yj) == null ? c13750kw.f45909yj == null : fontData.m1487k4(c13750kw.f45909yj, true)) && C3085sv.m13089k4(this.f45904m9, c13750kw.f45904m9) && this.f45897dy == c13750kw.f45897dy && this.f45894c5 == c13750kw.f45894c5 && this.f45901jd.m73531x1(c13750kw.f45901jd) && this.f45895ck.mo4836k4(c13750kw.f45895ck) && this.f45898fa == c13750kw.f45898fa && this.f45907up == c13750kw.f45907up && this.f45903ks.equals(c13750kw.getFillFormat());
    }
}
