package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
final class skr extends AbstractC0858ck<LineFormat, skr> implements ILineFormatEffectiveData {

    /* JADX INFO: renamed from: c5 */
    byte f48863c5;

    /* JADX INFO: renamed from: ck */
    byte f48864ck;

    /* JADX INFO: renamed from: du */
    byte f48865du;

    /* JADX INFO: renamed from: dy */
    float f48866dy;

    /* JADX INFO: renamed from: fa */
    byte f48867fa;

    /* JADX INFO: renamed from: h4 */
    byte f48868h4;

    /* JADX INFO: renamed from: ix */
    private double f48869ix;

    /* JADX INFO: renamed from: jd */
    byte f48870jd;

    /* JADX INFO: renamed from: kk */
    float[] f48871kk;

    /* JADX INFO: renamed from: ks */
    erk f48872ks;

    /* JADX INFO: renamed from: m9 */
    byte f48873m9;

    /* JADX INFO: renamed from: rv */
    nw7 f48874rv;

    /* JADX INFO: renamed from: to */
    byte f48875to;

    /* JADX INFO: renamed from: u4 */
    private byte f48876u4;

    /* JADX INFO: renamed from: up */
    byte f48877up;

    /* JADX INFO: renamed from: yj */
    byte f48878yj;

    /* JADX INFO: renamed from: x6 */
    static final skr f48862x6 = m70661m9();

    /* JADX INFO: renamed from: ne */
    static final skr f48861ne = m70657dy();

    public skr(LineFormat lineFormat) {
        super(lineFormat);
        m70656c5();
    }

    /* JADX INFO: renamed from: c5 */
    private void m70656c5() {
        this.f48869ix = Double.NaN;
        this.f48876u4 = (byte) -1;
        this.f48871kk = null;
        this.f48875to = (byte) -1;
        this.f48865du = (byte) -1;
        this.f48868h4 = (byte) -1;
        this.f48873m9 = (byte) -1;
        this.f48866dy = Float.NaN;
        this.f48863c5 = (byte) -1;
        this.f48870jd = (byte) -1;
        this.f48864ck = (byte) -1;
        this.f48867fa = (byte) -1;
        this.f48877up = (byte) -1;
        this.f48878yj = (byte) -1;
        this.f48872ks = new erk();
        this.f48874rv = new nw7();
    }

    /* JADX INFO: renamed from: dy */
    public static skr m70657dy() {
        skr skrVar = new skr((LineFormat) null);
        erk erkVar = skrVar.f48872ks;
        erkVar.f4854k4 = (byte) 1;
        erkVar.m5652kk().m73525k4(C12003du.m56460uz().Clone());
        skrVar.f48872ks.m5647du().f47492x1.m73525k4(C12003du.m56460uz().Clone());
        skrVar.f48872ks.m5647du().f47491kk.m73525k4(C12003du.m56385i5().Clone());
        nw7 nw7Var = skrVar.f48874rv;
        nw7Var.f47633x1 = -1;
        nw7Var.f47632k4 = 1219033472L;
        skrVar.f48869ix = 0.75d;
        skrVar.f48876u4 = (byte) 0;
        skrVar.f48871kk = null;
        skrVar.f48875to = (byte) 2;
        skrVar.f48865du = (byte) 0;
        skrVar.f48868h4 = (byte) 0;
        skrVar.f48873m9 = (byte) 2;
        skrVar.f48866dy = 10.0f;
        skrVar.f48863c5 = (byte) 0;
        skrVar.f48870jd = (byte) 0;
        skrVar.f48864ck = (byte) 1;
        skrVar.f48867fa = (byte) 1;
        skrVar.f48877up = (byte) 1;
        skrVar.f48878yj = (byte) 1;
        return skrVar;
    }

    /* JADX INFO: renamed from: k4 */
    public static skr m70658k4(LineFormat lineFormat) {
        LineFormat lineFormatM2586x1;
        skr skrVarM6312x1;
        IPresentationComponent parent_IPresentationComponent = lineFormat.getParent_IPresentationComponent();
        if (C7019kk.m27469x1(parent_IPresentationComponent, Table.class)) {
            return f48861ne;
        }
        if (C7019kk.m27469x1(parent_IPresentationComponent, Shape.class)) {
            Shape shape = (Shape) parent_IPresentationComponent;
            if (C7019kk.m27469x1(shape, GeometryShape.class)) {
                GeometryShape geometryShape = (GeometryShape) shape;
                if (geometryShape.getShapeStyle() != null) {
                    IShapeStyle shapeStyle = geometryShape.getShapeStyle();
                    fuq fuqVar = (fuq) AbstractC0858ck.m4596k4(lineFormat).createThemeEffective();
                    return (fuqVar == null || (skrVarM6312x1 = fuqVar.m6312x1(shapeStyle.getLineStyleIndex() & 65535)) == null) ? f48862x6 : skrVarM6312x1;
                }
            }
            Shape shape2 = (Shape) shape.getBasePlaceholder();
            if (shape2 == null) {
                return f48862x6;
            }
            lineFormatM2586x1 = shape2.m2586x1(shape2);
        } else {
            if (C7019kk.m27469x1(parent_IPresentationComponent, FormatScheme.class)) {
                return f48862x6;
            }
            if (!C7019kk.m27469x1(parent_IPresentationComponent, Cell.class)) {
                return C7019kk.m27469x1(parent_IPresentationComponent, x5o.class) ? f48862x6 : f48862x6;
            }
            Cell cell = (Cell) parent_IPresentationComponent;
            skr skrVarM64990m9 = lineFormat == cell.getCellFormat().getBorderLeft() ? cell.m461ck().m496h4().m64990m9() : lineFormat == cell.getCellFormat().getBorderTop() ? cell.m461ck().m496h4().m64983dy() : lineFormat == cell.getCellFormat().getBorderRight() ? cell.m461ck().m496h4().m64981c5() : lineFormat == cell.getCellFormat().getBorderBottom() ? cell.m461ck().m496h4().m64986jd() : lineFormat == cell.getCellFormat().getBorderDiagonalDown() ? cell.m461ck().m496h4().m64982ck() : lineFormat == cell.getCellFormat().getBorderDiagonalUp() ? cell.m461ck().m496h4().m64984fa() : null;
            if (skrVarM64990m9 != null) {
                return skrVarM64990m9;
            }
            if (((Table) cell.getTable()).m2571lr() == null) {
                return (lineFormat == cell.getCellFormat().getBorderDiagonalDown() || lineFormat == cell.getCellFormat().getBorderDiagonalUp()) ? f48862x6 : f48861ne;
            }
            lineFormatM2586x1 = (LineFormat) cell.getTable().getLineFormat();
        }
        return lineFormatM2586x1.m1894dy();
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m70660kk(LineFormat lineFormat) {
        IPresentationComponent parent_IPresentationComponent = lineFormat.getParent_IPresentationComponent();
        if (!C7019kk.m27469x1(parent_IPresentationComponent, SmartArtShape.class)) {
            return false;
        }
        SmartArtShape smartArtShape = (SmartArtShape) C7019kk.m27452k4((Object) parent_IPresentationComponent, SmartArtShape.class);
        return (!smartArtShape.m2821up().m4074dy().m74287x6() && smartArtShape.m2821up().m4074dy().m74279wy() == -1 && smartArtShape.m2821up().m4074dy().m74220ak() == -1) ? false : true;
    }

    /* JADX INFO: renamed from: m9 */
    public static skr m70661m9() {
        skr skrVar = new skr((LineFormat) null);
        erk erkVar = skrVar.f48872ks;
        erkVar.f4854k4 = (byte) 0;
        erkVar.m5652kk().m73525k4(C12003du.m56460uz().Clone());
        skrVar.f48872ks.m5647du().f47492x1.m73525k4(C12003du.m56460uz().Clone());
        skrVar.f48872ks.m5647du().f47491kk.m73525k4(C12003du.m56385i5().Clone());
        nw7 nw7Var = skrVar.f48874rv;
        nw7Var.f47633x1 = -1;
        nw7Var.f47632k4 = 1219033472L;
        skrVar.f48869ix = 0.75d;
        skrVar.f48876u4 = (byte) 0;
        skrVar.f48871kk = null;
        skrVar.f48875to = (byte) 2;
        skrVar.f48865du = (byte) 0;
        skrVar.f48868h4 = (byte) 0;
        skrVar.f48873m9 = (byte) 0;
        skrVar.f48866dy = 10.0f;
        skrVar.f48863c5 = (byte) 0;
        skrVar.f48870jd = (byte) 0;
        skrVar.f48864ck = (byte) 1;
        skrVar.f48867fa = (byte) 1;
        skrVar.f48877up = (byte) 1;
        skrVar.f48878yj = (byte) 1;
        return skrVar;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final boolean equals(ILineFormatEffectiveData iLineFormatEffectiveData) {
        skr skrVar = (skr) C7019kk.m27452k4((Object) iLineFormatEffectiveData, skr.class);
        if (skrVar == null) {
            return false;
        }
        return mo4836k4(skrVar);
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getAlignment() {
        return this.f48868h4;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getBeginArrowheadLength() {
        return this.f48877up;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getBeginArrowheadStyle() {
        return this.f48863c5;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getBeginArrowheadWidth() {
        return this.f48864ck;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getCapStyle() {
        return this.f48875to;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final float[] getCustomDashPattern() {
        return this.f48871kk;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getDashStyle() {
        return this.f48876u4;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getEndArrowheadLength() {
        return this.f48878yj;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getEndArrowheadStyle() {
        return this.f48870jd;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getEndArrowheadWidth() {
        return this.f48867fa;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final ILineFillFormatEffectiveData getFillFormat() {
        return this.f48872ks;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getJoinStyle() {
        return this.f48873m9;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final float getMiterLimit() {
        return this.f48866dy;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final ISketchFormatEffectiveData getSketchFormat() {
        return this.f48874rv;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final byte getStyle() {
        return this.f48865du;
    }

    @Override // com.aspose.slides.ILineFormatEffectiveData
    public final double getWidth() {
        return this.f48869ix;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m70662h4() {
        this.f48869ix = Double.NaN;
        this.f48876u4 = (byte) -1;
        this.f48871kk = null;
        this.f48875to = (byte) -1;
        this.f48865du = (byte) -1;
        this.f48868h4 = (byte) -1;
        this.f48873m9 = (byte) -1;
        this.f48866dy = Float.NaN;
        this.f48863c5 = (byte) -1;
        this.f48870jd = (byte) -1;
        this.f48864ck = (byte) -1;
        this.f48867fa = (byte) -1;
        this.f48877up = (byte) -1;
        this.f48878yj = (byte) -1;
        this.f48872ks.m5648k4();
        this.f48874rv.m68234k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70666x1(LineFormat lineFormat) {
        if (!C14067j2.m66728k4(Double.valueOf(lineFormat.getWidth()), Double.valueOf(Double.NaN))) {
            this.f48869ix = lineFormat.getWidth();
        }
        if (lineFormat.getDashStyle() != -1) {
            this.f48876u4 = lineFormat.getDashStyle();
        }
        if (lineFormat.getCustomDashPattern() != null) {
            this.f48871kk = new float[lineFormat.getCustomDashPattern().length];
            AbstractC14092to.m67208k4(lineFormat.getCustomDashPattern()).copyTo(AbstractC14092to.m67208k4(this.f48871kk), 0);
        }
        if (lineFormat.getCapStyle() != -1) {
            this.f48875to = lineFormat.getCapStyle();
        }
        if (lineFormat.getStyle() != -1) {
            this.f48865du = lineFormat.getStyle();
        }
        if (!C14067j2.m66728k4(Byte.valueOf(lineFormat.getAlignment()), (byte) -1)) {
            this.f48868h4 = lineFormat.getAlignment();
        }
        if (!C14067j2.m66728k4(Byte.valueOf(lineFormat.getJoinStyle()), (byte) -1)) {
            this.f48873m9 = lineFormat.getJoinStyle();
        }
        if (!C14067j2.m66728k4(Float.valueOf(lineFormat.getMiterLimit()), Float.valueOf(Float.NaN))) {
            this.f48866dy = lineFormat.getMiterLimit();
        }
        if (lineFormat.getBeginArrowheadStyle() != -1) {
            this.f48863c5 = lineFormat.getBeginArrowheadStyle();
        }
        if (lineFormat.getEndArrowheadStyle() != -1) {
            this.f48870jd = lineFormat.getEndArrowheadStyle();
        }
        if (lineFormat.getBeginArrowheadWidth() != -1) {
            this.f48864ck = lineFormat.getBeginArrowheadWidth();
        }
        if (lineFormat.getEndArrowheadWidth() != -1) {
            this.f48867fa = lineFormat.getEndArrowheadWidth();
        }
        if (lineFormat.getBeginArrowheadLength() != -1) {
            this.f48877up = lineFormat.getBeginArrowheadLength();
        }
        if (lineFormat.getEndArrowheadLength() != -1) {
            this.f48878yj = lineFormat.getEndArrowheadLength();
        }
        this.f48872ks.m5649k4((LineFillFormat) lineFormat.getFillFormat());
        this.f48874rv.m68235k4((SketchFormat) lineFormat.getSketchFormat());
    }

    public skr(InterfaceC14398rk interfaceC14398rk) {
        super(interfaceC14398rk);
        m70656c5();
    }

    /* JADX INFO: renamed from: k4 */
    public static skr m70659k4(LineFormat lineFormat, skr skrVar) {
        skr skrVar2 = new skr(lineFormat);
        if (skrVar != null) {
            skrVar2.m70663k4((InterfaceC14672vc) skrVar);
        }
        return skrVar2;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f48872ks.mo4833k4(iBaseSlide, dm6Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70663k4(InterfaceC14672vc interfaceC14672vc) {
        skr skrVar = (skr) interfaceC14672vc;
        this.f48869ix = skrVar.f48869ix;
        this.f48876u4 = skrVar.f48876u4;
        this.f48871kk = null;
        float[] fArr = skrVar.f48871kk;
        if (fArr != null) {
            this.f48871kk = new float[fArr.length];
            AbstractC14092to.m67208k4(skrVar.f48871kk).copyTo(AbstractC14092to.m67208k4(this.f48871kk), 0);
        }
        this.f48875to = skrVar.f48875to;
        this.f48865du = skrVar.f48865du;
        this.f48868h4 = skrVar.f48868h4;
        this.f48873m9 = skrVar.f48873m9;
        this.f48866dy = skrVar.f48866dy;
        this.f48863c5 = skrVar.f48863c5;
        this.f48870jd = skrVar.f48870jd;
        this.f48864ck = skrVar.f48864ck;
        this.f48867fa = skrVar.f48867fa;
        this.f48877up = skrVar.f48877up;
        this.f48878yj = skrVar.f48878yj;
        this.f48872ks.m5650k4((InterfaceC14672vc) skrVar.f48872ks);
        this.f48874rv.m68236k4((InterfaceC14672vc) skrVar.f48874rv);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, LineFormat lineFormat) {
        m70663k4(interfaceC14672vc);
        m70666x1(lineFormat);
        IPresentationComponent parent_IPresentationComponent = lineFormat.getParent_IPresentationComponent();
        if (C7019kk.m27469x1(parent_IPresentationComponent, SmartArtShape.class)) {
            z2c z2cVarM4074dy = ((SmartArtShape) C7019kk.m27452k4((Object) parent_IPresentationComponent, SmartArtShape.class)).m2821up().m4074dy();
            if (z2cVarM4074dy.m74287x6()) {
                this.f48872ks.f4854k4 = (byte) 0;
            }
            if (z2cVarM4074dy.m74279wy() != -1) {
                this.f48863c5 = z2cVarM4074dy.m74279wy();
            }
            if (z2cVarM4074dy.m74220ak() != -1) {
                this.f48870jd = z2cVarM4074dy.m74220ak();
            }
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(skr skrVar) {
        if (skrVar == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, skrVar)) {
            return true;
        }
        return this.f48872ks.equals(skrVar.f48872ks) && this.f48874rv.equals(skrVar.f48874rv) && this.f48869ix == skrVar.f48869ix && this.f48876u4 == skrVar.f48876u4 && this.f48871kk == skrVar.f48871kk && this.f48875to == skrVar.f48875to && this.f48865du == skrVar.f48865du && this.f48868h4 == skrVar.f48868h4 && this.f48873m9 == skrVar.f48873m9 && this.f48866dy == skrVar.f48866dy && getBeginArrowheadStyle() == skrVar.getBeginArrowheadStyle() && getBeginArrowheadLength() == skrVar.getBeginArrowheadLength() && getBeginArrowheadWidth() == skrVar.getBeginArrowheadWidth() && getEndArrowheadStyle() == skrVar.getEndArrowheadStyle() && getEndArrowheadLength() == skrVar.getEndArrowheadLength() && getEndArrowheadWidth() == skrVar.getEndArrowheadWidth();
    }
}
