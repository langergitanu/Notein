package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.lg */
/* JADX INFO: loaded from: classes3.dex */
final class C13775lg extends AbstractC14213o3 implements InterfaceC14751wu {

    /* JADX INFO: renamed from: du */
    private final IColorFormat f45986du;

    /* JADX INFO: renamed from: h4 */
    private C12003du f45987h4;

    /* JADX INFO: renamed from: kk */
    private final boolean f45988kk;

    /* JADX INFO: renamed from: to */
    private boolean f45989to;

    /* JADX INFO: renamed from: x1 */
    public final IShape f45990x1;

    public C13775lg(IShape iShape, ColorEffect colorEffect) {
        super(colorEffect, iShape.getSlide());
        this.f45989to = true;
        this.f45987h4 = new C12003du();
        this.f45990x1 = iShape;
        boolean zEquals = "stroke.color".equals(colorEffect.getProperties().get_Item(0).getValue());
        this.f45988kk = zEquals;
        this.f45986du = zEquals ? iShape.getLineFormat().getFillFormat().getSolidFillColor() : iShape.getFillFormat().getSolidFillColor();
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        ((ColorFormat) this.f45986du).m1080k4(this.f47666k4.Clone());
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        if (this.f45989to) {
            this.f45989to = false;
            if (this.f45988kk) {
                ((erk) this.f45990x1.getLineFormat().getEffective().getFillFormat()).m5654x1().CloneTo(this.f45987h4);
                this.f45990x1.getLineFormat().getFillFormat().setFillType((byte) 1);
            } else {
                ((C14176nc) this.f45990x1.getFillFormat().getEffective()).m67938m9().CloneTo(this.f45987h4);
                this.f45990x1.getFillFormat().setFillType((byte) 1);
            }
        }
        ((ColorFormat) this.f45986du).m1080k4(AbstractC14213o3.m68325k4(this.f45987h4.Clone(), this.f47666k4.Clone(), f).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m64388k4(ColorEffect colorEffect) {
        if (colorEffect.getProperties().size() != 1) {
            return false;
        }
        String value = colorEffect.getProperties().get_Item(0).getValue();
        return "style.color".equals(value) || "stroke.color".equals(value);
    }
}
