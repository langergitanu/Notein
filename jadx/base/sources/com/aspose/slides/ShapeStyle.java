package com.aspose.slides;

import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: loaded from: classes3.dex */
public class ShapeStyle extends DomObject<Shape> implements IShapeStyle {

    /* JADX INFO: renamed from: c5 */
    private long f3363c5;

    /* JADX INFO: renamed from: du */
    private final ColorFormat f3364du;

    /* JADX INFO: renamed from: dy */
    private long f3365dy;

    /* JADX INFO: renamed from: jd */
    private byte f3366jd;

    /* JADX INFO: renamed from: k4 */
    private long f3367k4;

    /* JADX INFO: renamed from: kk */
    private final ColorFormat f3368kk;

    /* JADX INFO: renamed from: m9 */
    private long f3369m9;

    /* JADX INFO: renamed from: to */
    private final ColorFormat f3370to;

    /* JADX INFO: renamed from: x1 */
    private final ColorFormat f3371x1;

    public ShapeStyle(Shape shape) {
        super(shape);
        this.f3371x1 = new ColorFormat(this);
        this.f3368kk = new ColorFormat(this);
        this.f3370to = new ColorFormat(this);
        this.f3364du = new ColorFormat(this);
    }

    /* JADX INFO: renamed from: kk */
    private void m2661kk() {
        this.f3367k4++;
    }

    @Override // com.aspose.slides.IShapeStyle
    public final IColorFormat getEffectColor() {
        return this.f3370to;
    }

    @Override // com.aspose.slides.IShapeStyle
    public final long getEffectStyleIndex() {
        return this.f3363c5;
    }

    @Override // com.aspose.slides.IShapeStyle
    public final IColorFormat getFillColor() {
        return this.f3368kk;
    }

    @Override // com.aspose.slides.IShapeStyle
    public final short getFillStyleIndex() {
        short s = (short) ((r0 & 4294967295L) % 1000);
        return (this.f3365dy & 4294967295L) < 1000 ? s : (short) (-s);
    }

    @Override // com.aspose.slides.IShapeStyle
    public final byte getFontCollectionIndex() {
        return this.f3366jd;
    }

    @Override // com.aspose.slides.IShapeStyle
    public final IColorFormat getFontColor() {
        return this.f3364du;
    }

    @Override // com.aspose.slides.IShapeStyle
    public final IColorFormat getLineColor() {
        return this.f3371x1;
    }

    @Override // com.aspose.slides.IShapeStyle
    public final int getLineStyleIndex() {
        return (int) (this.f3369m9 & C18177fb.f54859s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final ShapeStyle m2662k4() {
        ShapeStyle shapeStyle = new ShapeStyle((Shape) this.f2127h4);
        shapeStyle.m2663k4(this);
        return shapeStyle;
    }

    @Override // com.aspose.slides.IShapeStyle
    public final void setEffectStyleIndex(long j) {
        this.f3363c5 = j;
        m2661kk();
    }

    @Override // com.aspose.slides.IShapeStyle
    public final void setFillStyleIndex(short s) {
        int i = s;
        if (s < 0) {
            i = 1000 - s;
        }
        this.f3365dy = 4294967295L & ((long) i);
        m2661kk();
    }

    @Override // com.aspose.slides.IShapeStyle
    public final void setFontCollectionIndex(byte b) {
        this.f3366jd = b;
        m2661kk();
    }

    @Override // com.aspose.slides.IShapeStyle
    public final void setLineStyleIndex(int i) {
        this.f3369m9 = i & 65535;
        m2661kk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final IBaseSlide m2664x1() {
        return ((Shape) this.f2127h4).getSlide();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2663k4(IShapeStyle iShapeStyle) {
        this.f3371x1.m1079k4((ColorFormat) iShapeStyle.getLineColor());
        this.f3368kk.m1079k4((ColorFormat) iShapeStyle.getFillColor());
        this.f3370to.m1079k4((ColorFormat) iShapeStyle.getEffectColor());
        this.f3364du.m1079k4((ColorFormat) iShapeStyle.getFontColor());
        ShapeStyle shapeStyle = (ShapeStyle) iShapeStyle;
        this.f3369m9 = shapeStyle.f3369m9;
        this.f3365dy = shapeStyle.f3365dy;
        this.f3363c5 = shapeStyle.f3363c5;
        this.f3366jd = shapeStyle.f3366jd;
    }
}
