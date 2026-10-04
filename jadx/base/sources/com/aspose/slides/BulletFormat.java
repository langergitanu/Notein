package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletFormat extends PVIObject implements IBulletFormat {

    /* JADX INFO: renamed from: k4 */
    static final AbstractC4682du<BulletFormat, C13750kw, C13750kw> f1236k4 = new AbstractC4682du<BulletFormat, C13750kw, C13750kw>() { // from class: com.aspose.slides.BulletFormat.1
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Slides.BulletFormatEffectiveData.CreateEmpty(Aspose.Slides.BulletFormat,Aspose.Slides.BulletFormatEffectiveData)";
        }

        @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
        /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public C13750kw mo445k4(BulletFormat bulletFormat, C13750kw c13750kw) {
            return C13750kw.m64213k4(bulletFormat, c13750kw);
        }
    };

    /* JADX INFO: renamed from: c5 */
    private C13750kw f1237c5;

    /* JADX INFO: renamed from: du */
    private final ColorFormat f1238du;

    /* JADX INFO: renamed from: dy */
    private C0790b2 f1239dy;

    /* JADX INFO: renamed from: h4 */
    private Picture f1240h4;

    /* JADX INFO: renamed from: kk */
    private Portion f1241kk;

    /* JADX INFO: renamed from: m9 */
    private C14460sl f1242m9;

    /* JADX INFO: renamed from: to */
    private Paragraph f1243to;

    /* JADX INFO: renamed from: x1 */
    private boolean f1244x1;

    public BulletFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1238du = new ColorFormat(this);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C14879zb(getParent_Immediate(), this.f1238du, this.f1240h4, this.f1242m9, this.f1239dy);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f1238du.m1073h4();
        this.f1240h4 = new Picture(this);
        this.f1242m9 = new C14460sl(this);
        this.f1239dy = new C0790b2(this);
    }

    @Override // com.aspose.slides.IBulletFormat
    public final void applyDefaultParagraphIndentsShifts() {
        m2145uz();
        m442x1().m74395ck();
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m429c5() {
        if (m2138ix()) {
            return m442x1().m74426yj();
        }
        return false;
    }

    /* JADX INFO: renamed from: ck */
    public final Portion m430ck() {
        Portion portion;
        if (!this.f1244x1 || ((portion = this.f1241kk) != null && (portion.m2282fa() == null || !this.f1241kk.m2282fa().equals(this.f1243to)))) {
            Paragraph[] paragraphArr = {this.f1243to};
            boolean z = kke.m63959k4(Paragraph.class, getParent_Immediate(), paragraphArr) && paragraphArr[0].getPortions().getCount() > 0;
            Paragraph paragraph = paragraphArr[0];
            this.f1243to = paragraph;
            if (z) {
                this.f1241kk = (Portion) paragraph.getPortions().get_Item(0);
            }
            this.f1244x1 = true;
        }
        return this.f1241kk;
    }

    /* JADX INFO: renamed from: du */
    public final C13750kw m431du() {
        C13750kw[] c13750kwArr = {this.f1237c5};
        C13750kw c13750kw = (C13750kw) AbstractC0858ck.m4598k4(C13750kw.class, c13750kwArr, this, f1236k4);
        C13750kw c13750kw2 = c13750kwArr[0];
        this.f1237c5 = c13750kw2;
        if (c13750kw2 != null) {
            c13750kw2.m4604k4(C13750kw.class);
        }
        return c13750kw;
    }

    /* JADX INFO: renamed from: dy */
    public final Picture m432dy() {
        m2146wl();
        return this.f1240h4;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final char getChar() {
        if (m2138ix()) {
            return m442x1().m74421x1();
        }
        return (char) 65535;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final IColorFormat getColor() {
        return this.f1238du;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final IBulletFormatEffectiveData getEffective() {
        return m431du();
    }

    @Override // com.aspose.slides.IBulletFormat
    public final IFontData getFont() {
        if (m2138ix()) {
            return m442x1().m74418to();
        }
        return null;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final float getHeight() {
        if (m2138ix()) {
            return m442x1().m74396du();
        }
        return Float.NaN;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final short getNumberedBulletStartWith() {
        if (m2138ix()) {
            return m442x1().m74415m9();
        }
        return (short) -1;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final byte getNumberedBulletStyle() {
        if (m2138ix()) {
            return m442x1().m74397dy();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final ISlidesPicture getPicture() {
        m2146wl();
        return this.f1240h4;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final byte getType() {
        if (m2138ix()) {
            return m442x1().m74401k4();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m442x1().m74416ne();
        }
        return (((m430ck() != null ? m430ck().m2295x1().getVersion() : 0L) & 4294967295L) + 1) & 4294967295L;
    }

    /* JADX INFO: renamed from: h4 */
    public final C14460sl m433h4() {
        m2146wl();
        return this.f1242m9;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final byte isBulletHardColor() {
        if (m2138ix()) {
            return m442x1().m74394c5();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final byte isBulletHardFont() {
        if (m2138ix()) {
            return m442x1().m74400jd();
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m434jd() {
        if (m2138ix()) {
            return m442x1().m74414ks();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m435k4(BulletFormat bulletFormat) {
        if (m2138ix() || bulletFormat.m2138ix()) {
            m2145uz();
            m442x1().m74405k4(bulletFormat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public final void m439kk(IBulletFormat iBulletFormat) {
        if (m2138ix() || ((PVIObject) iBulletFormat).m2138ix()) {
            m2145uz();
            m442x1().m74413kk(iBulletFormat);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final C0790b2 m440m9() {
        m2146wl();
        return this.f1239dy;
    }

    @Override // com.aspose.slides.IBulletFormat
    public final void setBulletHardColor(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m442x1().m74412kk(b);
        }
    }

    @Override // com.aspose.slides.IBulletFormat
    public final void setBulletHardFont(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m442x1().m74419to(b);
        }
    }

    @Override // com.aspose.slides.IBulletFormat
    public final void setChar(char c) {
        m2141k4((Character) (char) 65535, Character.valueOf(c));
        if (m2138ix()) {
            m442x1().m74403k4(c);
        }
        m437k4(C14113y2.m67405k4(new char[]{c}));
    }

    @Override // com.aspose.slides.IBulletFormat
    public final void setFont(IFontData iFontData) {
        m2141k4((IFontData) null, iFontData);
        if (m2138ix()) {
            m442x1().m74406k4(iFontData);
        }
    }

    @Override // com.aspose.slides.IBulletFormat
    public final void setHeight(float f) {
        m2141k4(Float.valueOf(Float.NaN), Float.valueOf(f));
        if (m2138ix()) {
            m442x1().m74404k4(f);
        }
    }

    @Override // com.aspose.slides.IBulletFormat
    public final void setNumberedBulletStartWith(short s) {
        m2141k4((Short) (-1), Short.valueOf(s));
        if (m2138ix()) {
            m442x1().m74409k4(s);
        }
    }

    @Override // com.aspose.slides.IBulletFormat
    public final void setNumberedBulletStyle(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m442x1().m74422x1(b);
        }
    }

    @Override // com.aspose.slides.IBulletFormat
    public final void setType(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m442x1().m74402k4(b);
        }
    }

    /* JADX INFO: renamed from: to */
    public final String m441to() {
        return m2138ix() ? m442x1().m74411kk() : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14879zb m442x1() {
        return (C14879zb) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m436k4(C13750kw c13750kw) {
        m2145uz();
        m442x1().m74407k4(c13750kw);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m443x1(BulletFormat bulletFormat) {
        if (m2138ix() || bulletFormat.m2138ix()) {
            m2145uz();
            m442x1().m74423x1(bulletFormat);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m437k4(String str) {
        m2141k4(C14113y2.f47374k4, str);
        if (m2138ix()) {
            m442x1().m74408k4(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final void m444x1(IBulletFormat iBulletFormat) {
        if (m2138ix() || ((PVIObject) iBulletFormat).m2138ix()) {
            m2145uz();
            m442x1().m74424x1(iBulletFormat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final boolean m438k4(IBulletFormat iBulletFormat) {
        if (!m2138ix() && !((PVIObject) iBulletFormat).m2138ix()) {
            return true;
        }
        m2145uz();
        return m442x1().m74410k4(iBulletFormat);
    }
}
