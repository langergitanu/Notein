package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePortionFormat extends PVIObject implements IBasePortionFormat {

    /* JADX INFO: renamed from: du */
    private EffectFormat f1054du;

    /* JADX INFO: renamed from: h4 */
    private ColorFormat f1055h4;

    /* JADX INFO: renamed from: k4 */
    private FillFormat f1056k4;

    /* JADX INFO: renamed from: kk */
    private LineFormat f1057kk;

    /* JADX INFO: renamed from: m9 */
    private eth f1058m9;

    /* JADX INFO: renamed from: to */
    private LineFormat f1059to;

    /* JADX INFO: renamed from: x1 */
    private FillFormat f1060x1;

    public BasePortionFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m353kk(PortionFormat portionFormat) {
        if (C3085sv.m13089k4(Float.NaN, portionFormat.getFontHeight()) && C3085sv.m13090k4((Object) null, portionFormat.getLatinFont()) && C3085sv.m13090k4((Object) null, portionFormat.getEastAsianFont()) && C3085sv.m13090k4((Object) null, portionFormat.getComplexScriptFont()) && C3085sv.m13090k4((Object) null, portionFormat.getSymbolFont()) && C3085sv.m13089k4(Float.NaN, portionFormat.getEscapement()) && C3085sv.m13089k4(Float.NaN, portionFormat.getKerningMinimalSize()) && portionFormat.getLanguageId() == null && portionFormat.getAlternativeLanguageId() == null && C3085sv.m13089k4(Float.NaN, portionFormat.getSpacing())) {
            return 524288 == portionFormat.m360jd() && 4294967295L == (portionFormat.m367up().m5689k4() & 4294967295L) && portionFormat.getFillFormat().getFillType() == -1 && portionFormat.getUnderlineFillFormat().getFillType() == -1 && portionFormat.getUnderlineLineFormat().isFormatNotDefined() && m352k4((LineFormat) portionFormat.getLineFormat()) && m351k4((EffectFormat) portionFormat.getEffectFormat()) && m350k4((ColorFormat) portionFormat.getHighlightColor());
        }
        return false;
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f1056k4 = new FillFormat(this);
        this.f1060x1 = new FillFormat(this);
        this.f1057kk = new LineFormat(this);
        this.f1059to = new LineFormat(this);
        this.f1054du = new EffectFormat(this);
        this.f1055h4 = new ColorFormat(this);
        this.f1058m9 = new eth(this);
    }

    /* JADX INFO: renamed from: c5 */
    public final FillFormat m354c5() {
        return this.f1060x1;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m355ck() {
        return ((Boolean) m2139k4((vha) t8l.f49075uz)).booleanValue();
    }

    /* JADX INFO: renamed from: du */
    public final FillFormat m356du() {
        return this.f1056k4;
    }

    /* JADX INFO: renamed from: dy */
    public final LineFormat m357dy() {
        return this.f1059to;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m358fa() {
        if (m2138ix()) {
            return mo368x1().m74433b3();
        }
        return false;
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final String getAlternativeLanguageId() {
        return (String) m2139k4((vha) t8l.f49059du);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final IFontData getComplexScriptFont() {
        return (IFontData) m2139k4((vha) t8l.f49060dy);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final IFontData getEastAsianFont() {
        return (IFontData) m2139k4((vha) t8l.f49057c5);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final IEffectFormat getEffectFormat() {
        m2146wl();
        return this.f1054du;
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final float getEscapement() {
        return ((Float) m2139k4((vha) t8l.f49066kk)).floatValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final IFillFormat getFillFormat() {
        m2146wl();
        return this.f1056k4;
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final byte getFontBold() {
        return ((Byte) m2139k4((vha) t8l.f49073u4)).byteValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final float getFontHeight() {
        return ((Float) m2139k4((vha) t8l.f49072to)).floatValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final byte getFontItalic() {
        return ((Byte) m2139k4((vha) t8l.f49063ix)).byteValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final byte getFontUnderline() {
        return ((Byte) m2139k4((vha) t8l.f49074up)).byteValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final IColorFormat getHighlightColor() {
        m2146wl();
        return this.f1055h4;
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final float getKerningMinimalSize() {
        return ((Float) m2139k4((vha) t8l.f49077x1)).floatValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final byte getKumimoji() {
        return ((Byte) m2139k4((vha) t8l.f49069ne)).byteValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final String getLanguageId() {
        return (String) m2139k4((vha) t8l.f49062h4);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final IFontData getLatinFont() {
        return (IFontData) m2139k4((vha) t8l.f49064jd);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final ILineFormat getLineFormat() {
        m2146wl();
        return this.f1057kk;
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final byte getNormaliseHeight() {
        return ((Byte) m2139k4((vha) t8l.f49078x6)).byteValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final byte getProofDisabled() {
        return ((Byte) m2139k4((vha) t8l.f49071rv)).byteValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final float getSpacing() {
        return ((Float) m2139k4((vha) t8l.f49065k4)).floatValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final byte getStrikethroughType() {
        return ((Byte) m2139k4((vha) t8l.f49058ck)).byteValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final IFontData getSymbolFont() {
        return (IFontData) m2139k4((vha) t8l.f49068m9);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final byte getTextCapType() {
        return ((Byte) m2139k4((vha) t8l.f49061fa)).byteValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final IFillFormat getUnderlineFillFormat() {
        m2146wl();
        return this.f1060x1;
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final ILineFormat getUnderlineLineFormat() {
        m2146wl();
        return this.f1059to;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return mo368x1().m74431ak();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final EffectFormat m359h4() {
        return this.f1054du;
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final byte isHardUnderlineFill() {
        return ((Byte) m2139k4((vha) t8l.f49079yj)).byteValue();
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final byte isHardUnderlineLine() {
        return ((Byte) m2139k4((vha) t8l.f49067ks)).byteValue();
    }

    /* JADX INFO: renamed from: jd */
    public final int m360jd() {
        if (m2138ix()) {
            return mo368x1().m74483v4();
        }
        return 524288;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m361k4(BasePortionFormat basePortionFormat) {
        if (m2138ix() || basePortionFormat == null || basePortionFormat.m2138ix()) {
            m2145uz();
            mo368x1().mo6591k4(basePortionFormat);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final ColorFormat m365m9() {
        return this.f1055h4;
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setAlternativeLanguageId(String str) {
        m2142k4((vha<String, TRealObject>) t8l.f49059du, str);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setComplexScriptFont(IFontData iFontData) {
        m2142k4((vha<IFontData, TRealObject>) t8l.f49060dy, iFontData);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setEastAsianFont(IFontData iFontData) {
        m2142k4((vha<IFontData, TRealObject>) t8l.f49057c5, iFontData);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setEscapement(float f) {
        m2142k4((vha<Float, TRealObject>) t8l.f49066kk, Float.valueOf(f));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setFontBold(byte b) {
        m2142k4((vha<Byte, TRealObject>) t8l.f49073u4, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setFontHeight(float f) {
        m2142k4((vha<Float, TRealObject>) t8l.f49072to, Float.valueOf(f));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setFontItalic(byte b) {
        m2142k4((vha<Byte, TRealObject>) t8l.f49063ix, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setFontUnderline(byte b) {
        m2142k4((vha<Byte, TRealObject>) t8l.f49074up, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setHardUnderlineFill(byte b) {
        m2142k4((vha<Byte, TRealObject>) t8l.f49079yj, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setHardUnderlineLine(byte b) {
        m2142k4((vha<Byte, TRealObject>) t8l.f49067ks, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setKerningMinimalSize(float f) {
        m2142k4((vha<Float, TRealObject>) t8l.f49077x1, Float.valueOf(f));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setKumimoji(byte b) {
        m2142k4((vha<Byte, TRealObject>) t8l.f49069ne, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setLanguageId(String str) {
        m2142k4((vha<String, TRealObject>) t8l.f49062h4, str);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setLatinFont(IFontData iFontData) {
        m2142k4((vha<IFontData, TRealObject>) t8l.f49064jd, iFontData);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setNormaliseHeight(byte b) {
        m2142k4((vha<Byte, TRealObject>) t8l.f49078x6, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setProofDisabled(byte b) {
        m2142k4((vha<Byte, TRealObject>) t8l.f49071rv, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setSpacing(float f) {
        m2142k4((vha<Float, TRealObject>) t8l.f49065k4, Float.valueOf(f));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setStrikethroughType(byte b) {
        m2142k4((vha<Byte, TRealObject>) t8l.f49058ck, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setSymbolFont(IFontData iFontData) {
        m2142k4((vha<IFontData, TRealObject>) t8l.f49068m9, iFontData);
    }

    @Override // com.aspose.slides.IBasePortionFormat
    public final void setTextCapType(byte b) {
        m2142k4((vha<Byte, TRealObject>) t8l.f49061fa, Byte.valueOf(b));
    }

    /* JADX INFO: renamed from: to */
    public final LineFormat m366to() {
        return this.f1057kk;
    }

    /* JADX INFO: renamed from: up */
    public final eth m367up() {
        m2146wl();
        return this.f1058m9;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC14882ze mo368x1() {
        return (AbstractC14882ze) m2144u4();
    }

    /* JADX INFO: renamed from: yj */
    public final void m371yj() {
        if (m2138ix()) {
            m2145uz();
            mo368x1().mo6602wy();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m362k4(IPortionFormatEffectiveData iPortionFormatEffectiveData) {
        m2145uz();
        mo368x1().m74458k4(iPortionFormatEffectiveData);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m369x1(BasePortionFormat basePortionFormat) {
        if (m2138ix() || basePortionFormat == null || basePortionFormat.m2138ix()) {
            m2145uz();
            mo368x1().mo6603x1(basePortionFormat);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m363k4(PortionFormat portionFormat) {
        if (m2138ix() || portionFormat.m2138ix()) {
            m2145uz();
            mo368x1().mo6593k4(portionFormat);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m370x1(PortionFormat portionFormat) {
        if (m2138ix() || portionFormat.m2138ix()) {
            m2145uz();
            mo368x1().mo6605x1(portionFormat);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m364k4(boolean z) {
        m2142k4((vha<Boolean, TRealObject>) t8l.f49075uz, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m350k4(ColorFormat colorFormat) {
        if (colorFormat == null) {
            return false;
        }
        if (colorFormat.m2138ix()) {
            return colorFormat.m1085x1().m3362ar();
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m351k4(EffectFormat effectFormat) {
        return effectFormat != null && effectFormat.isNoEffects();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m352k4(LineFormat lineFormat) {
        if (lineFormat == null) {
            return false;
        }
        if (lineFormat.m2138ix()) {
            return ((r1l) lineFormat.m2144u4()).m69996k4();
        }
        return true;
    }
}
