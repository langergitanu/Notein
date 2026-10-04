package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ze */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14882ze {

    /* JADX INFO: renamed from: dy */
    protected final eth f50540dy;

    /* JADX INFO: renamed from: ix */
    private final LineFormat f50543ix;

    /* JADX INFO: renamed from: ks */
    private final LineFormat f50547ks;

    /* JADX INFO: renamed from: ne */
    private final ColorFormat f50549ne;

    /* JADX INFO: renamed from: qq */
    private long f50550qq;

    /* JADX INFO: renamed from: rv */
    private final FillFormat f50551rv;

    /* JADX INFO: renamed from: u4 */
    private final FillFormat f50553u4;

    /* JADX INFO: renamed from: uz */
    private final C13827mb f50555uz;

    /* JADX INFO: renamed from: wl */
    private final InterfaceC14397rj f50556wl;

    /* JADX INFO: renamed from: x6 */
    private final EffectFormat f50558x6;

    /* JADX INFO: renamed from: yj */
    private boolean f50559yj;

    /* JADX INFO: renamed from: c5 */
    private int f50537c5 = 524288;

    /* JADX INFO: renamed from: jd */
    private C14093tq<Integer> f50544jd = new C14093tq<>();

    /* JADX INFO: renamed from: ck */
    private C14093tq<Integer> f50538ck = new C14093tq<>();

    /* JADX INFO: renamed from: fa */
    private C14093tq<Integer> f50541fa = new C14093tq<>();

    /* JADX INFO: renamed from: up */
    private C14093tq<Integer> f50554up = new C14093tq<>();

    /* JADX INFO: renamed from: m9 */
    protected C14093tq<Boolean> f50548m9 = new C14093tq<>();

    /* JADX INFO: renamed from: k4 */
    protected float f50545k4 = Float.NaN;

    /* JADX INFO: renamed from: x1 */
    protected float f50557x1 = Float.NaN;

    /* JADX INFO: renamed from: kk */
    protected float f50546kk = Float.NaN;

    /* JADX INFO: renamed from: to */
    protected float f50552to = Float.NaN;

    /* JADX INFO: renamed from: du */
    protected String f50539du = null;

    /* JADX INFO: renamed from: h4 */
    protected String f50542h4 = null;

    public AbstractC14882ze(InterfaceC14397rj interfaceC14397rj, LineFormat lineFormat, FillFormat fillFormat, LineFormat lineFormat2, FillFormat fillFormat2, EffectFormat effectFormat, ColorFormat colorFormat, eth ethVar) {
        this.f50556wl = interfaceC14397rj;
        this.f50547ks = lineFormat;
        this.f50551rv = fillFormat;
        this.f50543ix = lineFormat2;
        this.f50553u4 = fillFormat2;
        this.f50549ne = colorFormat;
        this.f50558x6 = effectFormat;
        this.f50540dy = ethVar;
        IPresentationComponent[] iPresentationComponentArr = {null};
        kke.m63959k4(IPresentationComponent.class, interfaceC14397rj, iPresentationComponentArr);
        this.f50555uz = C1143gg.m6636k4(iPresentationComponentArr[0]);
    }

    /* JADX INFO: renamed from: ak */
    public final long m74431ak() {
        return ((((((((((((this.f50550qq & 4294967295L) + (this.f50547ks.getVersion() & 4294967295L)) & 4294967295L) + (this.f50551rv.getVersion() & 4294967295L)) & 4294967295L) + (this.f50558x6.getVersion() & 4294967295L)) & 4294967295L) + (this.f50549ne.getVersion() & 4294967295L)) & 4294967295L) + (this.f50543ix.getVersion() & 4294967295L)) & 4294967295L) + (this.f50553u4.getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: ar */
    public final String m74432ar() {
        return this.f50539du;
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m74433b3() {
        C14093tq c14093tq;
        C14093tq c14093tq2;
        C14093tq c14093tq3;
        C14093tq c14093tq4;
        C14093tq c14093tq5;
        C14093tq c14093tq6;
        C14093tq c14093tq7;
        C14093tq c14093tq8;
        C14093tq c14093tq9;
        boolean z = true;
        if (this.f50551rv.m1459to() || this.f50547ks.m1900to() || !this.f50558x6.isNoEffects()) {
            return true;
        }
        if (!this.f50548m9.m67302x1()) {
            this.f50548m9 = new C14093tq<>(Boolean.FALSE);
            boolean zM66715kk = C14064he.m66715kk(m74493x6());
            Class<?> cls = Boolean.TYPE;
            if (!zM66715kk) {
                if (this.f50548m9.m67302x1()) {
                    c14093tq9 = new C14093tq(Boolean.valueOf(this.f50548m9.m67298k4(cls).booleanValue() || m74493x6() % 1.0f != 0.0f));
                } else {
                    c14093tq9 = new C14093tq();
                }
                c14093tq9.CloneTo((C14093tq) this.f50548m9);
            }
            if (!C14064he.m66715kk(m74434bv())) {
                if (this.f50548m9.m67302x1()) {
                    c14093tq8 = new C14093tq(Boolean.valueOf(this.f50548m9.m67298k4(cls).booleanValue() || m74434bv() != 0.0f));
                } else {
                    c14093tq8 = new C14093tq();
                }
                c14093tq8.CloneTo((C14093tq) this.f50548m9);
            }
            if (this.f50548m9.m67302x1()) {
                c14093tq = new C14093tq(Boolean.valueOf(this.f50548m9.m67298k4(cls).booleanValue() || !C14064he.m66715kk(m74472qq())));
            } else {
                c14093tq = new C14093tq();
            }
            c14093tq.CloneTo((C14093tq) this.f50548m9);
            if (this.f50548m9.m67302x1()) {
                c14093tq2 = new C14093tq(Boolean.valueOf(this.f50548m9.m67298k4(cls).booleanValue() || m74496yj() > 0));
            } else {
                c14093tq2 = new C14093tq();
            }
            c14093tq2.CloneTo((C14093tq) this.f50548m9);
            if (this.f50548m9.m67302x1()) {
                c14093tq3 = new C14093tq(Boolean.valueOf(this.f50548m9.m67298k4(cls).booleanValue() || m74481up() > 0));
            } else {
                c14093tq3 = new C14093tq();
            }
            c14093tq3.CloneTo((C14093tq) this.f50548m9);
            if (this.f50548m9.m67302x1()) {
                c14093tq4 = new C14093tq(Boolean.valueOf(this.f50548m9.m67298k4(cls).booleanValue() || m74445fa() > 2));
            } else {
                c14093tq4 = new C14093tq();
            }
            c14093tq4.CloneTo((C14093tq) this.f50548m9);
            if (this.f50548m9.m67302x1()) {
                c14093tq5 = new C14093tq(Boolean.valueOf(this.f50548m9.m67298k4(cls).booleanValue() || m74449jd() == 1));
            } else {
                c14093tq5 = new C14093tq();
            }
            c14093tq5.CloneTo((C14093tq) this.f50548m9);
            if (this.f50548m9.m67302x1()) {
                c14093tq6 = new C14093tq(Boolean.valueOf(this.f50548m9.m67298k4(cls).booleanValue() || m74475to().getColorType() != -1));
            } else {
                c14093tq6 = new C14093tq();
            }
            c14093tq6.CloneTo((C14093tq) this.f50548m9);
            if (this.f50548m9.m67302x1()) {
                if (!this.f50548m9.m67298k4(cls).booleanValue() && (!m74494xk().m67302x1() || (m74494xk().m67297k4().intValue() & 65535) == 65535)) {
                    z = false;
                }
                c14093tq7 = new C14093tq(Boolean.valueOf(z));
            } else {
                c14093tq7 = new C14093tq();
            }
            c14093tq7.CloneTo((C14093tq) this.f50548m9);
        }
        return this.f50548m9.m67297k4().booleanValue();
    }

    /* JADX INFO: renamed from: bv */
    public final float m74434bv() {
        return this.f50552to;
    }

    /* JADX INFO: renamed from: c5 */
    public final byte m74435c5() {
        return m74485x1(4);
    }

    /* JADX INFO: renamed from: c6 */
    public final boolean m74437c6() {
        return m74483v4() == 524288 && (this.f50540dy.m5689k4() & 4294967295L) == 4294967295L && this.f50547ks.isFormatNotDefined() && this.f50551rv.m1452c5() && EffectFormat.m1383k4(this.f50558x6) && ((ColorFormat) m74475to()).m1072fa() && m74441du().isFormatNotDefined() && this.f50553u4.m1452c5() && C3085sv.m13089k4(m74493x6(), Float.NaN) && C3085sv.m13090k4(m74471ne(), (Object) null) && C3085sv.m13090k4(m74448ix(), (Object) null) && C3085sv.m13090k4(m74479u4(), (Object) null) && C3085sv.m13090k4(m74482uz(), (Object) null) && C3085sv.m13089k4(m74484wl(), Float.NaN) && C3085sv.m13089k4(m74472qq(), Float.NaN) && m74432ar() == null && m74480um() == null && C3085sv.m13089k4(m74434bv(), Float.NaN);
    }

    /* JADX INFO: renamed from: ck */
    public final byte m74438ck() {
        return m74485x1(8);
    }

    /* JADX INFO: renamed from: dq */
    public final void m74439dq() {
        this.f50550qq++;
    }

    /* JADX INFO: renamed from: du */
    public final byte m74440du(int i) {
        return (byte) (((((((long) (31 << i)) & 4294967295L) & ((long) this.f50537c5)) & 4294967295L) >> i) - 1);
    }

    /* JADX INFO: renamed from: dy */
    public final byte m74443dy() {
        return m74485x1(2);
    }

    public boolean equals(Object obj) {
        if (C7019kk.m27469x1(obj, IBasePortionFormat.class)) {
            return m74430k4(this, (IBasePortionFormat) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: fa */
    public final byte m74445fa() {
        return m74440du(10);
    }

    /* JADX INFO: renamed from: h4 */
    public final IFillFormat m74446h4() {
        return this.f50553u4;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: ix */
    public final IFontData m74448ix() {
        if (this.f50538ck.m67302x1()) {
            return m74468lr().m64802k4(this.f50538ck.m67297k4().intValue() & 65535).m70073x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: jd */
    public final byte m74449jd() {
        return m74485x1(6);
    }

    /* JADX INFO: renamed from: k4 */
    public final ILineFormat m74451k4() {
        return this.f50547ks;
    }

    /* JADX INFO: renamed from: kk */
    public final IEffectFormat m74461kk() {
        return this.f50558x6;
    }

    /* JADX INFO: renamed from: ks */
    public final byte m74467ks() {
        return m74485x1(20);
    }

    /* JADX INFO: renamed from: lr */
    public final C13827mb m74468lr() {
        return this.f50555uz;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m74469m9() {
        return m74485x1(0);
    }

    /* JADX INFO: renamed from: ne */
    public final IFontData m74471ne() {
        if (this.f50544jd.m67302x1()) {
            return m74468lr().m64802k4(this.f50544jd.m67297k4().intValue() & 65535).m70073x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: qq */
    public final float m74472qq() {
        return this.f50557x1;
    }

    /* JADX INFO: renamed from: rv */
    public final byte m74473rv() {
        return m74485x1(22);
    }

    /* JADX INFO: renamed from: to */
    public final byte m74474to(int i) {
        return (byte) (((((((long) (3 << i)) & 4294967295L) & ((long) this.f50537c5)) & 4294967295L) >> i) - 1);
    }

    /* JADX INFO: renamed from: u4 */
    public final IFontData m74479u4() {
        if (this.f50541fa.m67302x1()) {
            return m74468lr().m64802k4(this.f50541fa.m67297k4().intValue() & 65535).m70073x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: um */
    public final String m74480um() {
        return this.f50542h4;
    }

    /* JADX INFO: renamed from: up */
    public final byte m74481up() {
        return m74474to(15);
    }

    /* JADX INFO: renamed from: uz */
    public final IFontData m74482uz() {
        if (this.f50554up.m67302x1()) {
            return m74468lr().m64802k4(this.f50554up.m67297k4().intValue() & 65535).m70073x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: v4 */
    public final int m74483v4() {
        return this.f50537c5;
    }

    /* JADX INFO: renamed from: wl */
    public final float m74484wl() {
        return this.f50546kk;
    }

    /* JADX INFO: renamed from: wy */
    public void mo6602wy() {
        m74454k4(524288);
        this.f50540dy.m5690k4(4294967295L);
        m74457k4((IFontData) null);
        m74490x1((IFontData) null);
        m74465kk((IFontData) null);
        m74478to((IFontData) null);
        this.f50547ks.m1899m9();
        this.f50543ix.m1899m9();
        this.f50558x6.m1386h4();
        this.f50551rv.m1458m9();
        this.f50553u4.m1458m9();
        this.f50549ne.m1073h4();
        this.f50545k4 = Float.NaN;
        this.f50557x1 = Float.NaN;
        this.f50546kk = Float.NaN;
        this.f50552to = Float.NaN;
        this.f50539du = null;
        this.f50542h4 = null;
        m74439dq();
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m74485x1(int i) {
        return (byte) (((((((long) (3 << i)) & 4294967295L) & ((long) this.f50537c5)) & 4294967295L) >> i) - 1);
    }

    /* JADX INFO: renamed from: x6 */
    public final float m74493x6() {
        return this.f50545k4;
    }

    /* JADX INFO: renamed from: xk */
    public final C14093tq<Integer> m74494xk() {
        return this.f50541fa;
    }

    /* JADX INFO: renamed from: yd */
    public final boolean m74495yd() {
        return this.f50559yj;
    }

    /* JADX INFO: renamed from: yj */
    public final byte m74496yj() {
        return m74474to(17);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m74436c5(byte b) {
        if (m74485x1(20) != b) {
            m74455k4(20, b);
            if (b == 1 && this.f50543ix.getFillFormat().getFillType() == -1) {
                this.f50543ix.getFillFormat().setFillType((byte) 0);
            }
            m74439dq();
        }
    }

    /* JADX INFO: renamed from: du */
    public final ILineFormat m74441du() {
        return this.f50543ix;
    }

    /* JADX INFO: renamed from: dy */
    public final void m74444dy(byte b) {
        if (m74474to(17) != b) {
            m74489x1(17, b);
            m74439dq();
            this.f50548m9 = new C14093tq<>();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m74447h4(byte b) {
        if (m74440du(10) != b) {
            m74464kk(10, b);
            m74439dq();
            this.f50548m9 = new C14093tq<>();
        }
    }

    /* JADX INFO: renamed from: jd */
    public final void m74450jd(byte b) {
        if (m74485x1(22) != b) {
            m74455k4(22, b);
            if (b == 1 && this.f50553u4.getFillType() == -1) {
                this.f50553u4.setFillType((byte) 0);
            }
            m74439dq();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74452k4(byte b) {
        if (m74485x1(0) != b) {
            m74455k4(0, b);
            m74439dq();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m74462kk(byte b) {
        if (m74485x1(4) != b) {
            m74455k4(4, b);
            m74439dq();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m74470m9(byte b) {
        if (m74474to(15) != b) {
            m74489x1(15, b);
            m74439dq();
            this.f50548m9 = new C14093tq<>();
        }
    }

    /* JADX INFO: renamed from: to */
    public final IColorFormat m74475to() {
        return this.f50549ne;
    }

    /* JADX INFO: renamed from: x1 */
    public final IFillFormat m74486x1() {
        return this.f50551rv;
    }

    /* JADX INFO: renamed from: du */
    public final void m74442du(byte b) {
        if (m74485x1(8) != b) {
            m74455k4(8, b);
            m74439dq();
        }
        this.f50548m9 = new C14093tq<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74453k4(float f) {
        float f2 = this.f50545k4;
        float fM13070k4 = C3085sv.m13070k4(f, 1.0f, 4000.0f);
        this.f50545k4 = fM13070k4;
        if (fM13070k4 != f2) {
            m74439dq();
            this.f50548m9 = new C14093tq<>();
            TextFrame[] textFrameArr = {null};
            boolean zM63959k4 = kke.m63959k4(TextFrame.class, this.f50556wl, textFrameArr);
            TextFrame textFrame = textFrameArr[0];
            if (zM63959k4) {
                ((TextFrameFormat) textFrame.getTextFrameFormat()).m2941dq();
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m74463kk(float f) {
        if (this.f50557x1 != f) {
            this.f50557x1 = C3085sv.m13070k4(f, 0.0f, 4000.0f);
            m74439dq();
            this.f50548m9 = new C14093tq<>();
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m74476to(byte b) {
        if (m74485x1(6) != b) {
            m74455k4(6, b);
            m74439dq();
            this.f50548m9 = new C14093tq<>();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74487x1(byte b) {
        if (m74485x1(2) != b) {
            m74455k4(2, b);
            m74439dq();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74454k4(int i) {
        this.f50537c5 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m74464kk(int i, byte b) {
        this.f50537c5 = ((b + 1) << i) | ((~(31 << i)) & this.f50537c5);
    }

    /* JADX INFO: renamed from: to */
    public final void m74477to(float f) {
        if (this.f50552to != f) {
            this.f50552to = C3085sv.m13070k4(f, -1000.0f, 1000.0f);
            m74439dq();
            this.f50548m9 = new C14093tq<>();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74488x1(float f) {
        if (this.f50546kk != f) {
            this.f50546kk = f;
            m74439dq();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74455k4(int i, byte b) {
        this.f50537c5 = ((b + 1) << i) | ((~(3 << i)) & this.f50537c5);
    }

    /* JADX INFO: renamed from: kk */
    public final void m74465kk(IFontData iFontData) {
        if (iFontData != null) {
            this.f50541fa = new C14093tq<>(Integer.valueOf(m74468lr().m64799k4(2, iFontData)));
        } else {
            this.f50541fa = new C14093tq<>();
        }
        m74439dq();
    }

    /* JADX INFO: renamed from: to */
    public final void m74478to(IFontData iFontData) {
        if (iFontData != null) {
            this.f50554up = new C14093tq<>(Integer.valueOf(m74468lr().m64799k4(C13827mb.m64790k4(iFontData.getFontName()), iFontData)));
        } else {
            this.f50554up = new C14093tq<>();
        }
        m74439dq();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74489x1(int i, byte b) {
        this.f50537c5 = ((b + 1) << i) | ((~(3 << i)) & this.f50537c5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74456k4(int i, boolean z) {
        int i2;
        if (z) {
            i2 = (1 << i) | this.f50537c5;
        } else {
            i2 = (~(1 << i)) & this.f50537c5;
        }
        this.f50537c5 = i2;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m74466kk(int i) {
        return ((1 << i) & this.f50537c5) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo6603x1(BasePortionFormat basePortionFormat) {
        if (basePortionFormat.getLatinFont() != null) {
            m74457k4(basePortionFormat.getLatinFont());
        }
        if (basePortionFormat.getEastAsianFont() != null) {
            m74490x1(basePortionFormat.getEastAsianFont());
        }
        if (basePortionFormat.getComplexScriptFont() != null) {
            m74465kk(basePortionFormat.getComplexScriptFont());
        }
        if (basePortionFormat.getSymbolFont() != null) {
            m74478to(basePortionFormat.getSymbolFont());
        }
        if (!basePortionFormat.getLineFormat().isFormatNotDefined()) {
            this.f50547ks.m1896k4(basePortionFormat.getLineFormat());
        }
        if (!basePortionFormat.getUnderlineLineFormat().isFormatNotDefined()) {
            this.f50543ix.m1896k4(basePortionFormat.getUnderlineLineFormat());
        }
        if (basePortionFormat.getFillFormat().getFillType() != -1) {
            this.f50551rv.m1456k4(basePortionFormat.getFillFormat());
        }
        if (basePortionFormat.getUnderlineFillFormat().getFillType() != -1) {
            this.f50553u4.m1456k4(basePortionFormat.getUnderlineFillFormat());
        }
        if (!basePortionFormat.getEffectFormat().isNoEffects()) {
            this.f50558x6.m1387k4(basePortionFormat.getEffectFormat());
        }
        ColorFormat colorFormat = (ColorFormat) basePortionFormat.getHighlightColor();
        if (colorFormat == null || !colorFormat.m1072fa()) {
            this.f50549ne.m1079k4(colorFormat);
        }
        if (!C14064he.m66715kk(basePortionFormat.getFontHeight())) {
            this.f50545k4 = basePortionFormat.getFontHeight();
        }
        if (!C14064he.m66715kk(basePortionFormat.getKerningMinimalSize())) {
            this.f50557x1 = basePortionFormat.getKerningMinimalSize();
        }
        if (!C14064he.m66715kk(basePortionFormat.getEscapement())) {
            this.f50546kk = basePortionFormat.getEscapement();
        }
        if (!C14064he.m66715kk(basePortionFormat.getSpacing())) {
            this.f50552to = basePortionFormat.getSpacing();
        }
        if (basePortionFormat.getLanguageId() != null) {
            this.f50539du = basePortionFormat.getLanguageId();
        }
        if (basePortionFormat.getAlternativeLanguageId() != null) {
            this.f50542h4 = basePortionFormat.getAlternativeLanguageId();
        }
        if (basePortionFormat.getFontBold() != -1) {
            m74452k4(basePortionFormat.getFontBold());
        }
        if (basePortionFormat.getFontItalic() != -1) {
            m74487x1(basePortionFormat.getFontItalic());
        }
        if (basePortionFormat.getKumimoji() != -1) {
            m74462kk(basePortionFormat.getKumimoji());
        }
        if (basePortionFormat.getNormaliseHeight() != -1) {
            m74476to(basePortionFormat.getNormaliseHeight());
        }
        if (basePortionFormat.getProofDisabled() != -1) {
            m74442du(basePortionFormat.getProofDisabled());
        }
        if (basePortionFormat.getFontUnderline() != -1) {
            m74447h4(basePortionFormat.getFontUnderline());
        }
        if (basePortionFormat.getTextCapType() != -1) {
            m74470m9(basePortionFormat.getTextCapType());
        }
        if (basePortionFormat.getStrikethroughType() != -1) {
            m74444dy(basePortionFormat.getStrikethroughType());
        }
        if (basePortionFormat.isHardUnderlineLine() != -1) {
            m74436c5(basePortionFormat.isHardUnderlineLine());
        }
        if (basePortionFormat.isHardUnderlineFill() != -1) {
            m74450jd(basePortionFormat.isHardUnderlineFill());
        }
        PortionFormat portionFormat = (PortionFormat) basePortionFormat;
        if ((portionFormat.m367up().m5689k4() & 4294967295L) != 4294967295L) {
            this.f50540dy.m5690k4(portionFormat.m367up().m5689k4());
        }
        m74439dq();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo6591k4(BasePortionFormat basePortionFormat) {
        if (C7019kk.m27469x1(basePortionFormat, PortionFormat.class)) {
            PortionFormat portionFormat = (PortionFormat) basePortionFormat;
            m74454k4(portionFormat.m360jd());
            this.f50540dy.m5690k4(portionFormat.m367up().m5689k4());
            if (C7019kk.m27469x1(this, gfe.class)) {
                gfe gfeVar = (gfe) this;
                gfeVar.m6599sv().m4582k4(portionFormat.m2311ne().m4581k4());
                gfeVar.m6599sv().m4583k4(portionFormat.m2311ne().m4586x1());
            }
        }
        m74457k4(basePortionFormat.getLatinFont());
        m74490x1(basePortionFormat.getEastAsianFont());
        m74465kk(basePortionFormat.getComplexScriptFont());
        m74478to(basePortionFormat.getSymbolFont());
        this.f50547ks.m1896k4(basePortionFormat.getLineFormat());
        this.f50543ix.m1896k4(basePortionFormat.getUnderlineLineFormat());
        this.f50551rv.m1456k4(basePortionFormat.getFillFormat());
        this.f50558x6.m1387k4(basePortionFormat.getEffectFormat());
        this.f50553u4.m1456k4(basePortionFormat.getUnderlineFillFormat());
        this.f50549ne.m1079k4((ColorFormat) basePortionFormat.getHighlightColor());
        this.f50545k4 = basePortionFormat.getFontHeight();
        this.f50557x1 = basePortionFormat.getKerningMinimalSize();
        this.f50546kk = basePortionFormat.getEscapement();
        this.f50552to = basePortionFormat.getSpacing();
        this.f50539du = basePortionFormat.getLanguageId();
        this.f50542h4 = basePortionFormat.getAlternativeLanguageId();
        m74439dq();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74490x1(IFontData iFontData) {
        if (iFontData != null) {
            this.f50538ck = new C14093tq<>(Integer.valueOf(m74468lr().m64799k4(1, iFontData)));
        } else {
            this.f50538ck = new C14093tq<>();
        }
        m74439dq();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74457k4(IFontData iFontData) {
        if (iFontData != null) {
            this.f50544jd = new C14093tq<>(Integer.valueOf(m74468lr().m64799k4(0, iFontData)));
        } else {
            this.f50544jd = new C14093tq<>();
        }
        m74439dq();
    }

    /* JADX INFO: renamed from: x1 */
    public void mo6605x1(PortionFormat portionFormat) {
        if (m74471ne() == null && m74448ix() == null && m74479u4() == null && m74482uz() == null) {
            m74457k4(portionFormat.getLatinFont());
            m74490x1(portionFormat.getEastAsianFont());
            m74465kk(portionFormat.getComplexScriptFont());
            m74478to(portionFormat.getSymbolFont());
        }
        if (this.f50547ks.isFormatNotDefined()) {
            this.f50547ks.m1896k4(portionFormat.getLineFormat());
        }
        if (this.f50543ix.isFormatNotDefined()) {
            this.f50543ix.m1896k4(portionFormat.getUnderlineLineFormat());
        }
        if (this.f50551rv.getFillType() == -1) {
            this.f50551rv.m1456k4(portionFormat.getFillFormat());
        }
        if (this.f50558x6.isNoEffects()) {
            this.f50558x6.m1387k4(portionFormat.getEffectFormat());
        }
        if (this.f50553u4.getFillType() == -1) {
            this.f50553u4.m1456k4(portionFormat.getUnderlineFillFormat());
        }
        if (this.f50549ne.getColorType() == -1) {
            this.f50549ne.m1079k4((ColorFormat) portionFormat.getHighlightColor());
        }
        if (C14064he.m66715kk(this.f50545k4)) {
            this.f50545k4 = portionFormat.getFontHeight();
        }
        if (C14064he.m66715kk(this.f50557x1)) {
            this.f50557x1 = portionFormat.getKerningMinimalSize();
        }
        if (C14064he.m66715kk(this.f50546kk)) {
            this.f50546kk = portionFormat.getEscapement();
        }
        if (C14064he.m66715kk(this.f50552to)) {
            this.f50552to = portionFormat.getSpacing();
        }
        if (this.f50539du == null) {
            this.f50539du = portionFormat.getLanguageId();
        }
        if (this.f50542h4 == null) {
            this.f50542h4 = portionFormat.getAlternativeLanguageId();
        }
        if (m74469m9() == -1) {
            m74452k4(portionFormat.getFontBold());
        }
        if (m74443dy() == -1) {
            m74487x1(portionFormat.getFontItalic());
        }
        if (m74435c5() == -1) {
            m74462kk(portionFormat.getKumimoji());
        }
        if (m74449jd() == -1) {
            m74476to(portionFormat.getNormaliseHeight());
        }
        if (m74438ck() == -1) {
            m74442du(portionFormat.getProofDisabled());
        }
        if (m74445fa() == -1) {
            m74447h4(portionFormat.getFontUnderline());
        }
        if (m74481up() == -1) {
            m74470m9(portionFormat.getTextCapType());
        }
        if (m74496yj() == -1) {
            m74444dy(portionFormat.getStrikethroughType());
        }
        if (m74467ks() == -1) {
            m74436c5(portionFormat.isHardUnderlineLine());
        }
        if (m74473rv() == -1) {
            m74450jd(portionFormat.isHardUnderlineFill());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74458k4(IPortionFormatEffectiveData iPortionFormatEffectiveData) {
        if (m74471ne() == null && m74448ix() == null && m74479u4() == null && m74482uz() == null) {
            m74457k4(iPortionFormatEffectiveData.getLatinFont());
            m74490x1(iPortionFormatEffectiveData.getEastAsianFont());
            m74465kk(iPortionFormatEffectiveData.getComplexScriptFont());
            m74478to(iPortionFormatEffectiveData.getSymbolFont());
        }
        if (this.f50547ks.isFormatNotDefined()) {
            this.f50547ks.m1897k4(iPortionFormatEffectiveData.getLineFormat());
        }
        if (this.f50543ix.isFormatNotDefined()) {
            this.f50543ix.m1897k4(iPortionFormatEffectiveData.getUnderlineLineFormat());
        }
        if (this.f50551rv.getFillType() == -1 && iPortionFormatEffectiveData.getFillFormat().getFillType() != -1) {
            this.f50551rv.m1457k4(iPortionFormatEffectiveData.getFillFormat());
        }
        if (this.f50553u4.getFillType() == -1 && iPortionFormatEffectiveData.getUnderlineFillFormat().getFillType() != -1) {
            this.f50553u4.m1457k4(iPortionFormatEffectiveData.getUnderlineFillFormat());
        }
        if (this.f50549ne.getColorType() == -1) {
            this.f50549ne.m1089x1(((lrb) iPortionFormatEffectiveData).m4830h4().Clone());
        }
        if (C14064he.m66715kk(this.f50545k4)) {
            this.f50545k4 = ((lrb) iPortionFormatEffectiveData).m4837m9();
        }
        if (C14064he.m66715kk(this.f50557x1)) {
            this.f50557x1 = iPortionFormatEffectiveData.getKerningMinimalSize();
        }
        if (C14064he.m66715kk(this.f50546kk)) {
            this.f50546kk = iPortionFormatEffectiveData.getEscapement();
        }
        if (C14064he.m66715kk(this.f50552to)) {
            this.f50552to = iPortionFormatEffectiveData.getSpacing();
        }
        if (this.f50539du == null) {
            this.f50539du = iPortionFormatEffectiveData.getLanguageId();
        }
        if (this.f50542h4 == null) {
            this.f50542h4 = iPortionFormatEffectiveData.getAlternativeLanguageId();
        }
        if (m74469m9() == -1) {
            m74452k4(iPortionFormatEffectiveData.getFontBold() ? (byte) 1 : (byte) 0);
        }
        if (m74443dy() == -1) {
            m74487x1(iPortionFormatEffectiveData.getFontItalic() ? (byte) 1 : (byte) 0);
        }
        if (m74435c5() == -1) {
            m74462kk(iPortionFormatEffectiveData.getKumimoji() ? (byte) 1 : (byte) 0);
        }
        if (m74449jd() == -1) {
            m74476to(iPortionFormatEffectiveData.getNormaliseHeight() ? (byte) 1 : (byte) 0);
        }
        if (m74438ck() == -1) {
            m74442du(iPortionFormatEffectiveData.getProofDisabled() ? (byte) 1 : (byte) 0);
        }
        if (m74445fa() == -1) {
            m74447h4(iPortionFormatEffectiveData.getFontUnderline());
        }
        if (m74481up() == -1) {
            m74470m9(iPortionFormatEffectiveData.getTextCapType());
        }
        if (m74496yj() == -1) {
            m74444dy(iPortionFormatEffectiveData.getStrikethroughType());
        }
        if (m74467ks() == -1) {
            m74436c5(iPortionFormatEffectiveData.isHardUnderlineLine() ? (byte) 1 : (byte) 0);
        }
        if (m74473rv() == -1) {
            m74450jd(iPortionFormatEffectiveData.isHardUnderlineFill() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74491x1(lrb lrbVar) {
        this.f50540dy.m5690k4(lrbVar.m64519c5());
        m74455k4(0, lrbVar.f4465jd);
        m74455k4(2, lrbVar.f4456ck);
        m74455k4(4, lrbVar.f4461fa);
        m74455k4(6, lrbVar.f4479up);
        m74455k4(8, lrbVar.f4487yj);
        m74464kk(10, lrbVar.f4467ks);
        m74489x1(15, lrbVar.f4473rv);
        m74489x1(17, lrbVar.f4484x6);
        m74456k4(19, lrbVar.f4470ne == 1);
        m74455k4(20, lrbVar.f4464ix);
        m74455k4(22, lrbVar.f4477u4);
        this.f50545k4 = lrbVar.f4480uz;
        this.f50546kk = lrbVar.f4451b3;
        this.f50557x1 = lrbVar.f4483wy;
        this.f50539du = lrbVar.f4449ak;
        this.f50542h4 = lrbVar.f4457dq;
        this.f50552to = lrbVar.f4455c6;
        m74439dq();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo6593k4(PortionFormat portionFormat) {
        if (m74471ne() != null) {
            portionFormat.setLatinFont(m74471ne());
        }
        if (m74448ix() != null) {
            portionFormat.setEastAsianFont(m74448ix());
        }
        if (m74479u4() != null) {
            portionFormat.setComplexScriptFont(m74479u4());
        }
        if (m74482uz() != null) {
            portionFormat.setSymbolFont(m74482uz());
        }
        if (!this.f50547ks.isFormatNotDefined()) {
            ((LineFormat) portionFormat.getLineFormat()).m1896k4((ILineFormat) this.f50547ks);
        }
        if (!this.f50543ix.isFormatNotDefined()) {
            ((LineFormat) portionFormat.getUnderlineLineFormat()).m1896k4((ILineFormat) this.f50543ix);
        }
        if (this.f50551rv.getFillType() != -1) {
            ((FillFormat) portionFormat.getFillFormat()).m1456k4((IFillFormat) this.f50551rv);
        }
        if (this.f50553u4.getFillType() != -1) {
            ((FillFormat) portionFormat.getUnderlineFillFormat()).m1456k4((IFillFormat) this.f50553u4);
        }
        if (this.f50558x6 != null) {
            ((EffectFormat) portionFormat.getEffectFormat()).m1387k4((IEffectFormat) this.f50558x6);
        }
        if (this.f50549ne.getColorType() != -1) {
            ((ColorFormat) portionFormat.getHighlightColor()).m1079k4(this.f50549ne);
        }
        if (!C14064he.m66715kk(this.f50545k4)) {
            portionFormat.setFontHeight(this.f50545k4);
        }
        if (!C14064he.m66715kk(this.f50557x1)) {
            portionFormat.setKerningMinimalSize(this.f50557x1);
        }
        if (!C14064he.m66715kk(this.f50546kk)) {
            portionFormat.setEscapement(this.f50546kk);
        }
        if (!C14064he.m66715kk(this.f50552to)) {
            portionFormat.setSpacing(this.f50552to);
        }
        String str = this.f50539du;
        if (str != null) {
            portionFormat.setLanguageId(str);
        }
        String str2 = this.f50542h4;
        if (str2 != null) {
            portionFormat.setAlternativeLanguageId(str2);
        }
        if (m74469m9() != -1) {
            portionFormat.setFontBold(m74469m9());
        }
        if (m74443dy() != -1) {
            portionFormat.setFontItalic(m74443dy());
        }
        if (m74435c5() != -1) {
            portionFormat.setKumimoji(m74435c5());
        }
        if (m74449jd() != -1) {
            portionFormat.setNormaliseHeight(m74449jd());
        }
        if (m74438ck() != -1) {
            portionFormat.setProofDisabled(m74438ck());
        }
        if (m74445fa() != -1) {
            portionFormat.setFontUnderline(m74445fa());
        }
        if (m74481up() != -1) {
            portionFormat.setTextCapType(m74481up());
        }
        if (m74496yj() != -1) {
            portionFormat.setStrikethroughType(m74496yj());
        }
        if (m74467ks() != -1) {
            portionFormat.setHardUnderlineLine(m74467ks());
        }
        if (m74473rv() != -1) {
            portionFormat.setHardUnderlineFill(m74473rv());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74492x1(String str) {
        if (str != null && str.length() == 0) {
            str = null;
        }
        if (C14113y2.m67363du(this.f50542h4, str)) {
            return;
        }
        this.f50542h4 = str;
        m74439dq();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo6594k4(lrb lrbVar) {
        this.f50547ks.m1897k4((ILineFormatEffectiveData) ((AbstractC0872cw) lrbVar).f4466kk);
        this.f50551rv.m1457k4((IFillFormatEffectiveData) ((AbstractC0872cw) lrbVar).f4475to);
        this.f50558x6.m1388k4((IEffectFormatEffectiveData) ((AbstractC0872cw) lrbVar).f4463h4);
        this.f50549ne.m1089x1(lrbVar.m4830h4().Clone());
        this.f50543ix.m1897k4((ILineFormatEffectiveData) ((AbstractC0872cw) lrbVar).f4459dy);
        this.f50553u4.m1457k4((IFillFormatEffectiveData) lrbVar.f4454c5);
        this.f50540dy.m5690k4(lrbVar.m64519c5());
        m74455k4(0, lrbVar.f4465jd);
        m74455k4(2, lrbVar.f4456ck);
        m74455k4(4, lrbVar.f4461fa);
        m74455k4(6, lrbVar.f4479up);
        m74455k4(8, lrbVar.f4487yj);
        m74464kk(10, lrbVar.f4467ks);
        m74489x1(15, lrbVar.f4473rv);
        m74489x1(17, lrbVar.f4484x6);
        m74456k4(19, lrbVar.f4470ne == 1);
        m74455k4(20, lrbVar.f4464ix);
        m74455k4(22, lrbVar.f4477u4);
        this.f50545k4 = lrbVar.f4480uz;
        m74457k4(lrbVar.f4472qq);
        m74490x1(lrbVar.f4478um);
        m74465kk(lrbVar.f4481v4);
        m74478to(lrbVar.f4486yd);
        this.f50546kk = lrbVar.f4451b3;
        this.f50557x1 = lrbVar.f4483wy;
        this.f50539du = lrbVar.f4449ak;
        this.f50542h4 = lrbVar.f4457dq;
        this.f50552to = lrbVar.f4455c6;
        m74439dq();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74459k4(String str) {
        if (str != null && str.length() == 0) {
            str = null;
        }
        if (C14113y2.m67363du(this.f50539du, str)) {
            return;
        }
        this.f50539du = str;
        m74439dq();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74460k4(boolean z) {
        this.f50559yj = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static boolean m74430k4(AbstractC14882ze abstractC14882ze, IBasePortionFormat iBasePortionFormat) {
        BasePortionFormat basePortionFormat;
        int iM360jd;
        eth ethVarM367up;
        if (iBasePortionFormat == 0) {
            return false;
        }
        int iM74483v4 = abstractC14882ze.m74483v4();
        long jM5689k4 = abstractC14882ze.f50540dy.m5689k4();
        if (C7019kk.m27469x1(iBasePortionFormat, AbstractC14882ze.class)) {
            AbstractC14882ze abstractC14882ze2 = (AbstractC14882ze) iBasePortionFormat;
            iM360jd = abstractC14882ze2.m74483v4();
            ethVarM367up = abstractC14882ze2.f50540dy;
        } else {
            if (!C7019kk.m27469x1(iBasePortionFormat, PortionFormat.class)) {
                if (C7019kk.m27469x1(iBasePortionFormat, ChartPortionFormat.class)) {
                    basePortionFormat = (ChartPortionFormat) iBasePortionFormat;
                }
                return abstractC14882ze.m74483v4() != iM74483v4 && (abstractC14882ze.f50540dy.m5689k4() & 4294967295L) == (jM5689k4 & 4294967295L) && C3085sv.m13090k4(abstractC14882ze.m74451k4(), iBasePortionFormat.getLineFormat()) && C3085sv.m13090k4(abstractC14882ze.m74486x1(), iBasePortionFormat.getFillFormat()) && C3085sv.m13090k4(abstractC14882ze.m74461kk(), iBasePortionFormat.getEffectFormat()) && C3085sv.m13090k4(abstractC14882ze.m74475to(), iBasePortionFormat.getHighlightColor()) && C3085sv.m13090k4(abstractC14882ze.m74441du(), iBasePortionFormat.getUnderlineLineFormat()) && C3085sv.m13090k4(abstractC14882ze.m74446h4(), iBasePortionFormat.getUnderlineFillFormat()) && C3085sv.m13089k4(abstractC14882ze.m74493x6(), iBasePortionFormat.getFontHeight()) && C3085sv.m13090k4(abstractC14882ze.m74471ne(), iBasePortionFormat.getLatinFont()) && C3085sv.m13090k4(abstractC14882ze.m74448ix(), iBasePortionFormat.getEastAsianFont()) && C3085sv.m13090k4(abstractC14882ze.m74479u4(), iBasePortionFormat.getComplexScriptFont()) && C3085sv.m13090k4(abstractC14882ze.m74482uz(), iBasePortionFormat.getSymbolFont()) && C3085sv.m13089k4(abstractC14882ze.m74484wl(), iBasePortionFormat.getEscapement()) && C3085sv.m13089k4(abstractC14882ze.m74472qq(), iBasePortionFormat.getKerningMinimalSize()) && C14113y2.m67363du(abstractC14882ze.m74432ar(), iBasePortionFormat.getLanguageId()) && C14113y2.m67363du(abstractC14882ze.m74480um(), iBasePortionFormat.getAlternativeLanguageId()) && C3085sv.m13089k4(abstractC14882ze.m74434bv(), iBasePortionFormat.getSpacing());
            }
            basePortionFormat = (PortionFormat) iBasePortionFormat;
            iM360jd = basePortionFormat.m360jd();
            ethVarM367up = basePortionFormat.m367up();
        }
        long jM5689k42 = ethVarM367up.m5689k4();
        iM74483v4 = iM360jd;
        jM5689k4 = jM5689k42;
        if (abstractC14882ze.m74483v4() != iM74483v4) {
        }
    }
}
