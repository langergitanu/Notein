package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphFormat extends PVIObject implements IChartParagraphFormat, IParagraphFormat {

    /* JADX INFO: renamed from: x1 */
    static final AbstractC4682du<ParagraphFormat, fqc, fqc> f2961x1 = new AbstractC4682du<ParagraphFormat, fqc, fqc>() { // from class: com.aspose.slides.ParagraphFormat.2
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Slides.ParagraphFormatEffectiveData.CreateEmpty(Aspose.Slides.ParagraphFormat,Aspose.Slides.ParagraphFormatEffectiveData)";
        }

        @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
        /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public fqc mo445k4(ParagraphFormat paragraphFormat, fqc fqcVar) {
            return fqc.m6267k4(paragraphFormat, fqcVar);
        }
    };

    /* JADX INFO: renamed from: c5 */
    private s6u f2962c5;

    /* JADX INFO: renamed from: ck */
    private fqc f2963ck;

    /* JADX INFO: renamed from: du */
    private Cell f2964du;

    /* JADX INFO: renamed from: dy */
    private TabCollection f2965dy;

    /* JADX INFO: renamed from: h4 */
    private BulletFormat f2966h4;

    /* JADX INFO: renamed from: jd */
    private kml f2967jd;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC0555k4> f2968k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC0555k4 f2969kk;

    /* JADX INFO: renamed from: m9 */
    private PortionFormat f2970m9;

    /* JADX INFO: renamed from: to */
    private boolean f2971to;

    /* JADX INFO: renamed from: com.aspose.slides.ParagraphFormat$k4 */
    public static abstract class AbstractC0555k4 extends AbstractC14085qw {
    }

    public ParagraphFormat() {
        super(null);
        this.f2968k4 = new AbstractC7018k4<AbstractC0555k4>() { // from class: com.aspose.slides.ParagraphFormat.1
            {
                ParagraphFormat.this.f2969kk = new AbstractC0555k4() { // from class: com.aspose.slides.ParagraphFormat.1.1
                };
            }
        };
    }

    /* JADX INFO: renamed from: x6 */
    private pvz m2186x6() {
        return (pvz) m2144u4();
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new pvz(getParent_Immediate(), this.f2966h4, this.f2970m9, this.f2965dy, this.f2962c5, this.f2967jd);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f2966h4 = new BulletFormat(this);
        this.f2970m9 = new PortionFormat(this);
        this.f2965dy = new TabCollection(this);
        this.f2962c5 = new s6u(this);
        this.f2967jd = new kml(this);
    }

    /* JADX INFO: renamed from: c5 */
    public final kml m2187c5() {
        m2146wl();
        return this.f2967jd;
    }

    /* JADX INFO: renamed from: ck */
    public final int m2188ck() {
        if (m2138ix()) {
            return m2186x6().m69297ks().size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: du */
    public final TabCollection m2189du() {
        m2145uz();
        return m2186x6().m69300ne();
    }

    /* JADX INFO: renamed from: dy */
    public final s6u m2190dy() {
        m2146wl();
        return this.f2962c5;
    }

    /* JADX INFO: renamed from: fa */
    public final Cell m2191fa() {
        if (!this.f2971to) {
            Cell[] cellArr = {this.f2964du};
            kke.m63959k4(Cell.class, getParent_Immediate(), cellArr);
            this.f2964du = cellArr[0];
            this.f2971to = true;
        }
        return this.f2964du;
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final int getAlignment() {
        return ((Integer) m2139k4((vha) a4u.f3781k4)).intValue();
    }

    @Override // com.aspose.slides.IParagraphFormat
    public final IBulletFormat getBullet() {
        return m2206x1();
    }

    @Override // com.aspose.slides.IParagraphFormat
    public final IPortionFormat getDefaultPortionFormat() {
        m2146wl();
        return this.f2970m9;
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final float getDefaultTabSize() {
        return ((Float) m2139k4((vha) a4u.f3778fa)).floatValue();
    }

    @Override // com.aspose.slides.IParagraphFormat
    public final short getDepth() {
        return ((Short) m2139k4((vha) a4u.f3787yj)).shortValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final byte getEastAsianLineBreak() {
        return ((Byte) m2139k4((vha) a4u.f3776du)).byteValue();
    }

    @Override // com.aspose.slides.IParagraphFormat
    public final IParagraphFormatEffectiveData getEffective() {
        return m2200ks();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final int getFontAlignment() {
        return ((Integer) m2139k4((vha) a4u.f3785up)).intValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final byte getHangingPunctuation() {
        return ((Byte) m2139k4((vha) a4u.f3777dy)).byteValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final float getIndent() {
        return ((Float) m2139k4((vha) a4u.f3775ck)).floatValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final byte getLatinLineBreak() {
        return ((Byte) m2139k4((vha) a4u.f3783m9)).byteValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final float getMarginLeft() {
        return ((Float) m2139k4((vha) a4u.f3774c5)).floatValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final float getMarginRight() {
        return ((Float) m2139k4((vha) a4u.f3780jd)).floatValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final byte getRightToLeft() {
        return ((Byte) m2139k4((vha) a4u.f3779h4)).byteValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final float getSpaceAfter() {
        return ((Float) m2139k4((vha) a4u.f3784to)).floatValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final float getSpaceBefore() {
        return ((Float) m2139k4((vha) a4u.f3782kk)).floatValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final float getSpaceWithin() {
        return ((Float) m2139k4((vha) a4u.f3786x1)).floatValue();
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final ITabCollection getTabs() {
        m2146wl();
        return this.f2965dy;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m2186x6().m69274ar();
        }
        return (((m2191fa() != null ? m2191fa().m473kk().m2868ck().getVersion() : 0L) & 4294967295L) + 1) & 4294967295L;
    }

    /* JADX INFO: renamed from: h4 */
    public final short m2192h4() {
        if (m2138ix()) {
            return m2186x6().m69306u4();
        }
        return (short) -1;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m2193jd() {
        if (!m2138ix()) {
            return true;
        }
        m2145uz();
        return m2186x6().m69301qq();
    }

    /* JADX INFO: renamed from: kk */
    public final void m2199kk(ParagraphFormat paragraphFormat) {
        m2145uz();
        m2186x6().m69296kk(paragraphFormat);
    }

    /* JADX INFO: renamed from: ks */
    public final fqc m2200ks() {
        fqc[] fqcVarArr = {this.f2963ck};
        fqc fqcVar = (fqc) AbstractC0858ck.m4598k4(fqc.class, fqcVarArr, this, f2961x1);
        fqc fqcVar2 = fqcVarArr[0];
        this.f2963ck = fqcVar2;
        if (fqcVar2 != null) {
            fqcVar2.m4604k4(fqc.class);
        }
        return fqcVar;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m2201m9() {
        if (m2138ix()) {
            return m2186x6().m69309wl();
        }
        return false;
    }

    /* JADX INFO: renamed from: rv */
    public final void m2202rv() {
        this.f2963ck = null;
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setAlignment(int i) {
        m2142k4((vha<Integer, TRealObject>) a4u.f3781k4, Integer.valueOf(i));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setDefaultTabSize(float f) {
        m2142k4((vha<Float, TRealObject>) a4u.f3778fa, Float.valueOf(f));
    }

    @Override // com.aspose.slides.IParagraphFormat
    public final void setDepth(short s) {
        m2142k4((vha<Short, TRealObject>) a4u.f3787yj, Short.valueOf(s));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setEastAsianLineBreak(byte b) {
        m2142k4((vha<Byte, TRealObject>) a4u.f3776du, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setFontAlignment(int i) {
        m2142k4((vha<Integer, TRealObject>) a4u.f3785up, Integer.valueOf(i));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setHangingPunctuation(byte b) {
        m2142k4((vha<Byte, TRealObject>) a4u.f3777dy, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setIndent(float f) {
        m2142k4((vha<Float, TRealObject>) a4u.f3775ck, Float.valueOf(f));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setLatinLineBreak(byte b) {
        m2142k4((vha<Byte, TRealObject>) a4u.f3783m9, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setMarginLeft(float f) {
        m2142k4((vha<Float, TRealObject>) a4u.f3774c5, Float.valueOf(f));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setMarginRight(float f) {
        m2142k4((vha<Float, TRealObject>) a4u.f3780jd, Float.valueOf(f));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setRightToLeft(byte b) {
        m2142k4((vha<Byte, TRealObject>) a4u.f3779h4, Byte.valueOf(b));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setSpaceAfter(float f) {
        m2142k4((vha<Float, TRealObject>) a4u.f3784to, Float.valueOf(f));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setSpaceBefore(float f) {
        m2142k4((vha<Float, TRealObject>) a4u.f3782kk, Float.valueOf(f));
    }

    @Override // com.aspose.slides.IChartParagraphFormat, com.aspose.slides.IParagraphFormat
    public final void setSpaceWithin(float f) {
        m2142k4((vha<Float, TRealObject>) a4u.f3786x1, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: to */
    public final ParagraphFormat m2203to(ParagraphFormat paragraphFormat) {
        ParagraphFormat paragraphFormat2 = new ParagraphFormat(paragraphFormat, this);
        m2207x1(paragraphFormat2);
        return paragraphFormat2;
    }

    /* JADX INFO: renamed from: up */
    public final ParagraphFormat m2205up() {
        ParagraphFormat paragraphFormat = new ParagraphFormat();
        paragraphFormat.m2196k4(this);
        return paragraphFormat;
    }

    /* JADX INFO: renamed from: x1 */
    public final BulletFormat m2206x1() {
        m2146wl();
        return this.f2966h4;
    }

    /* JADX INFO: renamed from: yj */
    public final void m2209yj() {
        if (m2138ix()) {
            short sM2192h4 = m2192h4();
            m2140k4((Object) null);
            m2198k4(sM2192h4);
        }
    }

    public ParagraphFormat(ParagraphFormat paragraphFormat, InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2968k4 = new AbstractC7018k4<AbstractC0555k4>() { // from class: com.aspose.slides.ParagraphFormat.1
            {
                ParagraphFormat.this.f2969kk = new AbstractC0555k4() { // from class: com.aspose.slides.ParagraphFormat.1.1
                };
            }
        };
        m2146wl();
        m2140k4(new pvz(paragraphFormat, interfaceC14397rj, this.f2966h4, this.f2970m9, this.f2965dy, this.f2962c5, this.f2967jd));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2194k4(float f) {
        m2204to().m2306k4(f);
        setMarginLeft(getMarginLeft() * f);
        setMarginRight(getMarginRight() * f);
        setIndent(getIndent() * f);
        if (getSpaceBefore() < 0.0f) {
            setSpaceBefore(getSpaceBefore() * f);
        }
        if (getSpaceAfter() < 0.0f) {
            setSpaceAfter(getSpaceAfter() * f);
        }
        setDefaultTabSize(getDefaultTabSize() * f);
        IGenericEnumerator<ITab> it = getTabs().iterator();
        while (it.hasNext()) {
            try {
                ITab next = it.next();
                next.setPosition(next.getPosition() * ((double) f));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public final PortionFormat m2204to() {
        m2146wl();
        return this.f2970m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2207x1(ParagraphFormat paragraphFormat) {
        m2145uz();
        m2186x6().m69314x1(paragraphFormat);
    }

    public ParagraphFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2968k4 = new AbstractC7018k4<AbstractC0555k4>() { // from class: com.aspose.slides.ParagraphFormat.1
            {
                ParagraphFormat.this.f2969kk = new AbstractC0555k4() { // from class: com.aspose.slides.ParagraphFormat.1.1
                };
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m2195k4(IParagraphFormat iParagraphFormat) {
        if (m2138ix() || !C7019kk.m27469x1(iParagraphFormat, PVIObject.class) || ((PVIObject) iParagraphFormat).m2138ix()) {
            m2145uz();
            m2186x6().m69289k4(iParagraphFormat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final boolean m2208x1(IParagraphFormat iParagraphFormat) {
        if (!m2138ix() && !((PVIObject) iParagraphFormat).m2138ix()) {
            return true;
        }
        m2145uz();
        return m2186x6().m69316x1(iParagraphFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2196k4(ParagraphFormat paragraphFormat) {
        if (m2138ix() || paragraphFormat == null || paragraphFormat.m2138ix()) {
            m2145uz();
            m2186x6().m69290k4(paragraphFormat);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2197k4(fqc fqcVar) {
        m2145uz();
        m2186x6().m69291k4(fqcVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2198k4(short s) {
        m2141k4((Short) (-1), Short.valueOf(s));
        if (m2138ix()) {
            m2186x6().m69315x1(s);
        }
    }
}
